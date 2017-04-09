package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.commons.eclipse.emf.EMFResource;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.commons.DynamicAnnotationHelper;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.ui.commons.IXMOFRunConfiguration;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;

public class XMOFBasedModelLoader {

	private IExecutionContext executionContext;

	private ConfigurationObjectMap configurationMap;

	private Set<EPackage> xmofConfigurationMetamodelPackages = new HashSet<EPackage>();

	public XMOFBasedModelLoader(IExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

	/**
	 * Two missions: 1) Creates and returns the xmof configuration model (ie configuration objects + parameter values)
	 * 2) Also prepares the configuration map (later accessed using "getConfigurationMap")
	 * 
	 * @return The created xmof configuration model.
	 */
	public XMOFBasedModel loadXMOFBasedModel() {

		// Get the provided model to execute
		Collection<EObject> inputModelElements = loadInputModelElements();

		// Get the parameters (with refs to provided model)
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements();

		// Gets all objects referenced by the parameters
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		// Regroup in a collection all the provided stuff (model + parameters)
		Collection<EObject> inputElements = new HashSet<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		// Loads the configuration metamodel (ie. the xmof model), possibly epackages already in the registry
		Collection<EPackage> configurationPackages = loadConfigurationMetamodel();

		// We try to find out whether the provided model is already a configuration model, or not
		boolean isConfModel = isConfigurationModel(inputModelElements, configurationPackages);

		// Initializes the configuration (ie. dynamic) model using the static model.
		// ie. for each static object, creates a configuration object using a configuration class.
		// And stores everything in a map static->dynamic.
		// NOTE: If the provided model is dynamic, we create a dummy configuration map where each object o points to
		// itself
		configurationMap = new ConfigurationObjectMap(inputElements, configurationPackages, isConfModel);

		// Creates a resource for the configuration model, and fills it with configuration objects.
		// (we never directly use this resource later on, it's just to have objects stored somewhere).
		createConfigurationModelResource();

		// Creates and returns the xmof model, with the configuration objects and the parameters.
		return new XMOFBasedModel(configurationMap.getConfigurationObjects(),
				getParameterValueConfiguration(inputParameterValues), getEditingDomain());

	}

	// TODO return true only if all are conforming?
	private static boolean isConfigurationModel(Collection<EObject> model, Collection<EPackage> configurationPackages) {
		for (EObject o : model) {
			for (EPackage p : configurationPackages) {
				Collection<EClassifier> classifiers = p.getEClassifiers();
				for (EClassifier classifier : classifiers) {
					if (classifier.isInstance(o)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private Collection<EObject> loadInputModelElements() {
		Set<EObject> inputModelElements = new HashSet<EObject>();
		for (Resource resource : getInputModelResources()) {
			inputModelElements.addAll(resource.getContents());
		}
		return inputModelElements;
	}

	private Collection<Resource> getInputModelResources() {
		return getRelatedResources(getModelResource());
	}

	private static Collection<Resource> getRelatedResources(Resource resource) {
		Set<Resource> relatedModelResources = new HashSet<Resource>();
		if (resource != null) {
			Set<Resource> relatedResources = EMFResource.getRelatedResources(resource);
			relatedResources.removeIf(r -> r.getContents().get(0) == resource.getContents().get(0));
			relatedModelResources.add(resource);
			relatedModelResources.addAll(relatedResources);
			relatedModelResources.removeIf(r -> r == null);
		}
		return relatedModelResources;
	}

	/**
	 * Finds all the (static) objects referenced by input parameters values, along with all the content of the resources
	 * that contain such pointed objects.
	 * 
	 * @param inputParameterValues
	 *            The (static) parameter values.
	 * @return Objects referenced by parameter values + other objects in resources of pointed objects.
	 */
	private Collection<EObject> getParameterValueObjects(Collection<ParameterValue> inputParameterValues) {
		Collection<EObject> parameterValueObjects = new HashSet<EObject>();
		Collection<Resource> allRelatedResources = new HashSet<Resource>();
		for (ParameterValue parameterValue : inputParameterValues) {
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();

					if (referencedEObject != null) {
						allRelatedResources.addAll(getRelatedResources(referencedEObject.eResource()));
					}
				}
			}
		}
		for (Resource r : allRelatedResources) {
			r.getAllContents().forEachRemaining(o -> {
				if (!executionContext.getResourceModel().getContents().contains(o))
					parameterValueObjects.add(o);
			});
		}

		return parameterValueObjects;
	}

	private List<ParameterValue> getParameterValueConfiguration(List<ParameterValue> inputParameterValues) {
		List<ParameterValue> parameterValueConfiguration = new ArrayList<ParameterValue>();

		Copier copier = new EcoreUtil.Copier(true, false);
		copier.copyAll(inputParameterValues);
		copier.copyReferences();

		for (ParameterValue parameterValue : inputParameterValues) {
			ParameterValue parameterValueConf = (ParameterValue) copier.get(parameterValue);
			parameterValueConf.setParameter(parameterValue.getParameter());
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						EObject referencedEObjectConf = getConfigurationMap().getConfigurationObject(referencedEObject);
						ObjectValue objectValueConf = (ObjectValue) copier.get(value);
						objectValueConf.setEObject(referencedEObjectConf);
					}
				}
			}
			parameterValueConfiguration.add(parameterValueConf);
		}
		return parameterValueConfiguration;
	}

	private List<ParameterValue> loadInputParameterValueElements() {
		EList<ParameterValue> parameterValues = new BasicEList<ParameterValue>();
		String initializationModelPath = getInitializationModelPath();
		if (!(initializationModelPath == null || initializationModelPath == "")) {
			Resource resource = loadPlatformResource(initializationModelPath);
			EList<EObject> parameterValueDefinitions = resource.getContents();
			for (EObject eObject : parameterValueDefinitions) {
				if (eObject instanceof ParameterValueDefinition) {
					ParameterValueDefinition parameterValueDefinition = (ParameterValueDefinition) eObject;
					parameterValues.addAll(parameterValueDefinition.getParameterValues());
				}
			}
		}
		return parameterValues;
	}

	/**
	 * Retrieves the xmof semantics URI (as a string) from the melange language definition.
	 * 
	 * @return The URI of the xMOF semantics, as a String.
	 */
	private String getXMOFModelFilePath() {
		String xmofModelFilePath = "";
		String xdsmlModelPath = getXDSMLModelPath();
		Resource xdsmlFileResource = loadPluginResource(xdsmlModelPath);
		ModelTypingSpace modelTypingSpace = (ModelTypingSpace) xdsmlFileResource.getContents().get(0);
		String languageFQN = executionContext.getLanguageDefinitionExtension().getName();
		for (Element element : modelTypingSpace.getElements()) {
			if (element instanceof Language) {
				Language language = (Language) element;
				if (languageFQN.endsWith(language.getName())) {
					xmofModelFilePath = language.getXmof();
					break;
				}
			}
		}
		return xmofModelFilePath.replace("platform:/resource/", "");
	}

	/**
	 * Loads the xMOF semantics model (ie EPackages) in a resource. For each EPackage, if there is already a registered
	 * EPackage in memory with the same NsURI, make sure use the existing one instead.
	 * 
	 * @return The set of EPackages of the configuration metamodel (possibly some that were already in registry)
	 */
	private Collection<EPackage> loadConfigurationMetamodel() {
		String confMetamodelPath = getXMOFModelFilePath();
		Resource confMetamodelResource = loadPluginResource(confMetamodelPath);

		Collection<EPackage> confMMPackages = new HashSet<EPackage>();

		// TODO what about subpackages?
		for (EObject eObject : confMetamodelResource.getContents()) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				if (EPackage.Registry.INSTANCE.containsKey(ePackage.getNsURI())) {
					EPackage registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI());
					confMMPackages.add(registeredPackage);
				} else {
					confMMPackages.add(ePackage);
				}

			}
		}

		// Hack: we add the same annotations as melange so all dynamic parts of/ the metamodel
		for (EPackage p : confMMPackages) {
			p.eAllContents().forEachRemaining((o) -> {
				if (o instanceof EStructuralFeature || (o instanceof EClass && !(o instanceof Activity)
						&& !((EClass) o).getName().endsWith("Configuration"))) {
					EModelElement o_cast = (EModelElement) o;
					Command cmd = new AddCommand(getEditingDomain(), o_cast.getEAnnotations(),
							DynamicAnnotationHelper.createDynamicAnnotation());
					getEditingDomain().getCommandStack().execute(cmd);
				}

			});
		}

		xmofConfigurationMetamodelPackages.addAll(confMMPackages);
		return confMMPackages;
	}

	/**
	 * Creates the resource for the configuration (ie. dynamic) model, and fills this resource with the configuration
	 * objects.
	 * 
	 * This resource not made available, and is only reachable in the ResourceSet.
	 */
	private void createConfigurationModelResource() {
		URI configurationModelURI = computeConfigurationModelURI();
		Resource configurationResource = null;
		for (EObject configurationObject : configurationMap.getConfigurationObjects()) {
			if (configurationObject.eContainer() == null && configurationObject.eResource() == null) {
				if (configurationResource == null)
					configurationResource = getResourceSet().createResource(configurationModelURI);
				Command cmd = new AddCommand(getEditingDomain(), configurationResource.getContents(),
						configurationObject);
				getEditingDomain().getCommandStack().execute(cmd);
			}
		}
	}

	/**
	 * Creates a URI for the configuration (ie. dynamic) model, inside the execution folder. This model is at the moment
	 * never serialized, so this is simlpy for EMF to be happy.
	 * 
	 * @return The URI of the configuration model, in the execution folder.
	 */
	private URI computeConfigurationModelURI() {
		IPath executionPath = getExecutionPath();
		String modelFileName = getModelResource().getURI().lastSegment();
		String modelFileExtension = getModelResource().getURI().fileExtension();
		String configurationModelFileName = modelFileName.replace("." + modelFileExtension, "-configuration.xmi");
		IPath configurationModelPath = executionPath.append(configurationModelFileName);
		URI uri = URI.createPlatformResourceURI(configurationModelPath.toString(), true);
		return uri;
	}

	private Resource loadPlatformResource(String path) {
		return getResourceSet().getResource(URI.createPlatformResourceURI(path, true), true);
	}

	/**
	 * Loads a model from a plugin path, into the current Resource Set.
	 * 
	 * @param path
	 *            The plugin path (given to "createPlatformPluginURI").
	 * @return The new resource loaded from the path, contained in the current ResourceSet.
	 */
	private Resource loadPluginResource(String path) {
		return getResourceSet().getResource(URI.createPlatformPluginURI(path, true), true);
	}

	public ConfigurationObjectMap getConfigurationMap() {
		return configurationMap;
	}

	private ResourceSet getResourceSet() {
		return executionContext.getResourceModel().getResourceSet();
	}

	/**
	 * Gets the resource of the input model (maybe provided by Sirius) ie. the model given in the launch configuration.
	 * 
	 * @return The resource of the loaded input model.
	 */
	private Resource getModelResource() {
		return executionContext.getResourceModel();
	}

	private String getInitializationModelPath() {
		return ((IXMOFRunConfiguration) executionContext.getRunConfiguration()).getModelInitializationModel();
	}

	private String getXDSMLModelPath() {
		return executionContext.getLanguageDefinitionExtension().getXDSMLFilePath();
	}

	/**
	 * Gets the execution folder path, where execution elements can be created (dynamic model, traces, etc.)
	 * 
	 * @return The execution folder path, in the project of the executed model.
	 */
	private IPath getExecutionPath() {
		return executionContext.getWorkspace().getExecutionPath();
	}

	private EditingDomain getEditingDomain() {
		ResourceSet resourceSet = getResourceSet();
		return TransactionUtil.getEditingDomain(resourceSet);
	}

}
