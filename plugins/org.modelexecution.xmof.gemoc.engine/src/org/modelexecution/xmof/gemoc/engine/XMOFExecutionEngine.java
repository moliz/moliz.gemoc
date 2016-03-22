package org.modelexecution.xmof.gemoc.engine;

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
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine;
import org.gemoc.executionframework.engine.core.EngineStoppedException;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.SuspendEvent;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ValueSnapshot;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;

import fUML.Semantics.Classes.Kernel.Object_;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;

public class XMOFExecutionEngine extends AbstractSequentialExecutionEngine
		implements ExecutionEventListener, IXMOFVirtualMachineListener {

	private ConfigurationObjectMap configurationMap;

	private Runnable entryPoint;

	private ResourceSet resourceSet;
	
	private static final boolean STEP_INTO_ACTIVITY = true;

	private boolean debugging = false;

	private boolean resume = false;

	private XMOFVirtualMachine vm;

	public XMOFExecutionEngine() {
		super();
	}

	@Override
	public String engineKindName() {
		return "XMOF Engine";
	}

	@Override
	public Runnable getEntryPoint() {
		return entryPoint;
	}

	@Override
	public Runnable getInitializeModel() {
		return null;
	}

	@Override
	public void initialize(final IExecutionContext executionContext) {
		super.initialize(executionContext);
		resourceSet = executionContext.getResourceModel().getResourceSet();

		XMOFBasedModel model = getXMOFBasedModel(executionContext);
		vm = new XMOFVirtualMachine(model);
		vm.addRawExecutionEventListener(this);
		vm.addVirtualMachineListener(this);
		this.debugging = executionContext.getExecutionMode().equals(
				ExecutionMode.Animation);

		if (debugging && STEP_INTO_ACTIVITY)
			vm.shouldSuspendAfterStep(true);

		entryPoint = new Runnable() {
			@Override
			public void run() {
				// run vm
				XMOFExecutionEngine.this.setEngineStatus(RunStatus.Running);
				XMOFExecutionEngine.this.notifyEngineAboutToStart();

				// check execution mode whether to run or debug VM
				if (!debugging) {
					vm.run();
				} else {
					vm.debug();
				}
			}
		};
	}

	private XMOFBasedModel getXMOFBasedModel(IExecutionContext executionContext) {
		Collection<EObject> inputModelElements = loadInputModelElements(executionContext);
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements(executionContext);
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		Collection<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		Collection<EPackage> configurationPackages = loadConfigurationMetamodel(executionContext);
		configurationMap = new ConfigurationObjectMap(inputElements,
				configurationPackages);

		return new XMOFBasedModel(configurationMap.getConfigurationObjects(),
				getParameterValueConfiguration(inputParameterValues));
	}

	private Collection<EObject> loadInputModelElements(
			IExecutionContext executionContext) {
		return executionContext.getResourceModel().getContents();
	}

	private List<ParameterValue> loadInputParameterValueElements(
			IExecutionContext executionContext) {
		String modelPath = ((RunConfiguration) executionContext
				.getRunConfiguration()).getModelInitializationModel();

		List<ParameterValue> parameterValues = getParameterValues(modelPath);
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
						EObject referencedEObjectConf = configurationMap
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

	private String getXMOFModelFilePath(IExecutionContext executionContext) {
		String xmofModelFilePath = "";
		String xdsmlFilePath = executionContext
				.getLanguageDefinitionExtension().getXDSMLFilePath();
		Resource xdsmlFileResource = loadPluginResource(xdsmlFilePath);
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

	private Collection<EPackage> loadConfigurationMetamodel(
			IExecutionContext executionContext) {
		String confMetamodelPath = getXMOFModelFilePath(executionContext);
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

	@Override
	public void notify(Event event) {
		if (event instanceof SuspendEvent && STEP_INTO_ACTIVITY) {
			SuspendEvent suspendEvent = (SuspendEvent) event;
			if (suspendEvent.getLocation() instanceof fUML.Syntax.Activities.IntermediateActivities.Activity) {
				resume = false;
				processActivityEntry(suspendEvent);
			}
		} else if (event instanceof ActivityEntryEvent && !STEP_INTO_ACTIVITY) {
			processActivityEntry((ActivityEntryEvent) event);
		}

		else if (event instanceof ActivityExitEvent) {
			processActivityExit((ActivityExitEvent) event);
		}

	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
	}

	private void processActivityEntry(SuspendEvent event) {
		ActivityExecution activityExecution = vm.getExecutionTrace()
				.getActivityExecutionByID(event.getActivityExecutionID());
		Activity activity = (Activity) vm.getxMOFConversionResult()
				.getInputObject(event.getLocation());
		processActivityEntry(activityExecution, activity);
	}

	private void processActivityEntry(ActivityEntryEvent event) {
		ActivityExecution activityExecution = vm.getExecutionTrace()
				.getActivityExecutionByID(event.getActivityExecutionID());
		Activity activity = (Activity) vm.getxMOFConversionResult()
				.getInputObject(event.getActivity());
		processActivityEntry(activityExecution, activity);
	}

	private void processActivityEntry(ActivityExecution activityExecution,
			Activity activity) {

		EObject caller = getActivityContextObject(activityExecution);
		String className = caller.eClass().getName();
		String methodName = activity.getSpecification().getName();

		try {
			beforeExecutionStep(caller, className, methodName);

		} catch (EngineStoppedException stopExeception) {

			throw new EngineStoppedException(stopExeception.getMessage(),
					stopExeception);
		} catch (Exception e) {

			// TODO this was required in K3, but now we can manage real
			// exceptions ?
			throw new RuntimeException(e);
		}

	}

	private void processActivityExit(ActivityExitEvent event) {

		try {
			afterExecutionStep();

		} catch (EngineStoppedException stopExeception) {

			throw new EngineStoppedException(stopExeception.getMessage(),
					stopExeception);
		} catch (Exception e) {

			// TODO this was required in K3, but now we can manage real
			// exceptions ?
			throw new RuntimeException(e);
		}
	}

	private EObject getActivityContextObject(ActivityExecution activityExecution) {
		EObject activityContextObject = null;
		ValueSnapshot context = activityExecution.getContextValueSnapshot();
		if (context != null) {
			fUML.Semantics.Classes.Kernel.Value contextRuntimeValue = context
					.getRuntimeValue();
			if (contextRuntimeValue instanceof Object_) {
				activityContextObject = vm.getInstanceMap().getEObject(
						(Object_) contextRuntimeValue);
			}
		}
		return activityContextObject;
	}

	public void resume() {
		if (debugging && STEP_INTO_ACTIVITY) {
			resume = true;

			while (resume && vm.isRunning()) {
				vm.step();
			}
		}
	}

}