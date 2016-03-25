package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.GenericXMOFAnimationServices;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;

public class XMOFBasedModelLoader {

	private ResourceSet resourceSet;
	private Resource modelResource;
	private String initializationModelURI;
	private String xdsmlModelURI;

	private ConfigurationObjectMap configurationMap;

	public XMOFBasedModelLoader(IExecutionContext executionContext) {
		initialize(executionContext);
	}

	private void initialize(IExecutionContext executionContext) {
		resourceSet = executionContext.getResourceModel().getResourceSet();
		modelResource = executionContext.getResourceModel();
		initializationModelURI = ((RunConfiguration) executionContext
				.getRunConfiguration()).getModelInitializationModel();
		xdsmlModelURI = executionContext.getLanguageDefinitionExtension()
				.getXDSMLFilePath();
	}

	public XMOFBasedModel loadXMOFBasedModel() {
		Collection<EObject> inputModelElements = loadInputModelElements();
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements();
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		Collection<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		Collection<EPackage> configurationPackages = loadConfigurationMetamodel();
		configurationMap = new ConfigurationObjectMap(inputElements,
				configurationPackages);

		GenericXMOFAnimationServices
				.setConfigurationObjectMap(getConfigurationMap());

		return new XMOFBasedModel(getConfigurationMap()
				.getConfigurationObjects(),
				getParameterValueConfiguration(inputParameterValues));
	}

	private Collection<EObject> loadInputModelElements() {
		return modelResource.getContents();
	}

	private List<ParameterValue> loadInputParameterValueElements() {
		List<ParameterValue> parameterValues = getParameterValues(initializationModelURI);
		return parameterValues;
	}

	private Collection<EObject> getParameterValueObjects(
			Collection<ParameterValue> inputParameterValues) {
		Collection<EObject> parameterValueObjects = new BasicEList<EObject>();
		for (ParameterValue parameterValue : inputParameterValues) {
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						parameterValueObjects.add(referencedEObject);
					}
				}
			}
		}
		return parameterValueObjects;
	}

	private List<ParameterValue> getParameterValueConfiguration(
			List<ParameterValue> inputParameterValues) {
		List<ParameterValue> parameterValueConfiguration = new ArrayList<ParameterValue>();

		Copier copier = new EcoreUtil.Copier(true, false);
		copier.copyAll(inputParameterValues);
		copier.copyReferences();

		for (ParameterValue parameterValue : inputParameterValues) {
			ParameterValue parameterValueConf = (ParameterValue) copier
					.get(parameterValue);
			parameterValueConf.setParameter(parameterValue.getParameter());
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						EObject referencedEObjectConf = getConfigurationMap()
								.getConfigurationObject(referencedEObject);
						ObjectValue objectValueConf = (ObjectValue) copier
								.get(value);
						objectValueConf.setEObject(referencedEObjectConf);
					}
				}
			}
			parameterValueConfiguration.add(parameterValueConf);
		}
		return parameterValueConfiguration;
	}

	private List<ParameterValue> getParameterValues(String modelPath) {
		EList<ParameterValue> parameterValues = new BasicEList<ParameterValue>();

		if (!(modelPath == null || modelPath == "")) {
			Resource resource = loadPlatformResource(modelPath);
			EList<EObject> parameterValueDefinitions = resource.getContents();
			for (EObject eObject : parameterValueDefinitions) {
				if (eObject instanceof ParameterValueDefinition) {
					ParameterValueDefinition parameterValueDefinition = (ParameterValueDefinition) eObject;
					parameterValues.addAll(parameterValueDefinition
							.getParameterValues());
				}
			}
		}
		return parameterValues;
	}

	private String getXMOFModelFilePath() {
		String xmofModelFilePath = "";
		Resource xdsmlFileResource = loadPluginResource(xdsmlModelURI);
		ModelTypingSpace modelTypingSpace = (ModelTypingSpace) xdsmlFileResource
				.getContents().get(0);
		for (Element element : modelTypingSpace.getElements()) {
			if (element instanceof Language) {
				Language language = (Language) element;
				xmofModelFilePath = language.getXmof();
			}
		}
		return xmofModelFilePath.replace("platform:/resource//", "");
	}

	private Collection<EPackage> loadConfigurationMetamodel() {
		String confMetamodelPath = getXMOFModelFilePath();
		Resource resource = loadPluginResource(confMetamodelPath);

		Collection<EPackage> confMMPackages = new ArrayList<EPackage>();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				if (EPackage.Registry.INSTANCE.containsKey(ePackage.getNsURI())) {
					EPackage registeredPackage = (EPackage) EPackage.Registry.INSTANCE
							.get(ePackage.getNsURI());
					confMMPackages.add(registeredPackage);
				} else {
					confMMPackages.add(ePackage);
				}
			}
		}
		return confMMPackages;
	}

	private Resource loadPlatformResource(String path) {
		return resourceSet.getResource(
				URI.createPlatformResourceURI(path, true), true);
	}

	private Resource loadPluginResource(String path) {
		return resourceSet.getResource(URI.createPlatformPluginURI(path, true),
				true);
	}

	public ConfigurationObjectMap getConfigurationMap() {
		return configurationMap;
	}

}
