package org.xmof.execution.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.impl.EMFCommandTransaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine;
import org.gemoc.executionframework.engine.mse.GenericMSE;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSE;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.MseFactory;
import org.gemoc.executionframework.xdsml_base.LanguageDefinition;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallOperationAction;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.impl.ActivityImpl;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;
import org.modelexecution.xmof.vm.util.XMOFUtil;
import org.xmof.execution.engine.ui.commons.RunConfiguration;
import org.xmof.execution.xdsml.api.extensions.languages.XMOFLanguageDefinitionExtension;

import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.Object_;
import xmofxdsml.XMOFLanguageDefiniton;

public class XMOFExecutionEngine extends AbstractSequentialExecutionEngine
		implements ExecutionEventListener, IXMOFVirtualMachineListener {

	private XMOFExecutionEngine _instance;

	private ConfigurationObjectMap configurationMap;
	private DiagramEditor diagramEditor;

	private Runnable entryPoint;

	private XMOFBasedModel model;

	private DiagramEditor oldEditor;

	private ActivityNode oldNode;

	private List<Event> rawEvents;

	private ResourceSet resourceSet;

	private boolean resume = false;

	private XMOFVirtualMachine vm;

	private IEditorPart xMOFEditor = null;

	private Map<Activity, LogicalStep> activity2LogicalSteps;
	private Map<ActivityNode, MSEOccurrence> activityNode2MSEOccurrence;

	public XMOFExecutionEngine() {
		super();
		activity2LogicalSteps = new HashMap<Activity, LogicalStep>();
		activityNode2MSEOccurrence = new HashMap<ActivityNode, MSEOccurrence>();
		this._instance = this;
	}

	// TODO check if this is necessary
	private void createBreakpoints(XMOFBasedModel model) throws CoreException {
		Activity activity = null;
		EObject mainClassObject = model.getMainEClassObjects().get(0);
		for (EObject element : model.getMainEClassObjects()) {
			activity = getMainActivity(element);
			for (ActivityNode node : activity.getNode()) {
				if (node instanceof ActivityNode) {
					vm.addBreakpoint(node);
					// TODO
					// new GemocBreakpoint(Launcher.MODEL_ID, node, true);

					// notifyAboutToExecuteLogicalStep(Gemoc_execution_traceFactory.eINSTANCE.createLogicalStep());
				}
			}
		}
	}

	/**
	 * 
	 * @param caller
	 *            The calling EObject
	 * @param operation
	 *            The operation called from caller
	 * @param logicalstep
	 *            The logical step from this operation
	 */
	private MSEOccurrence createMSEOccurence(EObject caller,
			EOperation operation, LogicalStep logicalstep) {

		GenericMSE genericMSE = MseFactory.eINSTANCE.createGenericMSE();
		MSEOccurrence occurence = MseFactory.eINSTANCE.createMSEOccurrence();
		genericMSE.setCallerReference(caller);
		// TODO Setting the ActionREferences causes gemoc to error
		if (operation != null) {
			genericMSE.setActionReference(operation);
		}
		if (caller instanceof ENamedElement) {
			genericMSE.setName(((ENamedElement) caller).getName());
		} else {

		}
		occurence.setMse(genericMSE);

		if (logicalstep != null) {
			occurence.setLogicalStep(logicalstep);
		}

		// TODO save mseoccurence somewhere
		notifyMSEOccurrenceAboutToStart(occurence);
		return occurence;
	}

	@Override
	public String engineKindName() {
		// TODO Auto-generated method stub
		return null;
	}

	private void finishLogicalStep(LogicalStep logicalStep) {
		if (logicalStep != null) {
			notifyLogicalStepExecuted(logicalStep);
		} else {
			// TODO throw error
			System.out.println("Error");
		}

		// TODO log logicalstep to be executed in Hashmap
		// TODO check how many mse's have been in the logical step
	}

	private void finishMSEOccurence(ActivityNode an) {
		notifyMSEOccurenceExecuted(activityNode2MSEOccurrence.get(an));
		activityNode2MSEOccurrence.remove(an);
		resume();

	}

	@Override
	public Runnable getEntryPoint() {
		return entryPoint;
	}

	@Override
	public Runnable getInitializeModel() {
		// TODO Auto-generated method stub
		return null;
	}

	private Collection<EObject> getInputModelElements(String modelPath) {
		Resource resource = loadResource(modelPath);
		return resource.getContents();
	}

	private Activity getMainActivity(EObject mainClassObject) {
		EClass eClass = mainClassObject.eClass();
		BehavioredEOperation mainOperation = getMainOperation(eClass);
		Activity mainActivity = getMethod(eClass, mainOperation);
		return mainActivity;
	}

	private BehavioredEOperation getMainOperation(EClass eClass) {
		for (EOperation eOperation : eClass.getEAllOperations()) {
			if (eOperation instanceof BehavioredEOperation
					&& eOperation.getName().equals("main")) {
				// actualEOperation = (BehavioredEOperation) eOperation;
				return (BehavioredEOperation) eOperation;
			}
		}
		return null;
	}

	private Activity getMethod(EClass eClass, BehavioredEOperation mainOperation) {
		if (!(eClass instanceof BehavioredEClass))
			return null;
		BehavioredEClass behavioredEClass = (BehavioredEClass) eClass;
		for (org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior behavior : behavioredEClass
				.getOwnedBehavior()) {
			if (mainOperation.getMethod().contains(behavior)
					&& behavior instanceof Activity) {
				return (Activity) behavior;
			}
		}
		for (EClass eSuperClass : eClass.getESuperTypes()) {
			// TODO maybe another traversing algorithm should be used
			Activity method = getMethod(eSuperClass, mainOperation);
			if (method != null)
				return method;
		}
		return null;
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

	private List<ParameterValue> getParameterValues(String modelPath) {
		EList<ParameterValue> parameterValues = new BasicEList<ParameterValue>();

		if (!(modelPath == null || modelPath == "")) {
			Resource resource = loadResource(modelPath);
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

	private XMOFBasedModel getXMOFBasedModel(IExecutionContext executionContext) {

		Collection<EObject> inputModelElements = loadInputModelElements(executionContext);
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements(executionContext);
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		Collection<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		LanguageDefinition ld = ((XMOFLanguageDefinitionExtension) executionContext
				.getLanguageDefinitionExtension()).getLanguageDefinition();
		String confMetamodelPath = ((XMOFLanguageDefiniton) ld)
				.getXmofFileName().getXmofFileName();

		Collection<EPackage> configurationPackages = loadConfigurationMetamodel(confMetamodelPath);
		configurationMap = new ConfigurationObjectMap(inputElements,
				configurationPackages);

		return new XMOFBasedModel(configurationMap.getConfigurationObjects(),
				getParameterValueConfiguration(inputParameterValues));
		// } else {
		// return new XMOFBasedModel(inputModelElements, inputParameterValues);
		// }
		//
		// return null;
	}

	@Override
	public void initialize(final IExecutionContext executionContext) {
		super.initialize(executionContext);
		resourceSet = new ResourceSetImpl();

		// openXMOF(filename);

		model = getXMOFBasedModel(executionContext);
		vm = new XMOFVirtualMachine(model);
		vm.addRawExecutionEventListener(this);
		vm.addVirtualMachineListener(this);
		try {
			if (!executionContext.getExecutionMode().equals(ExecutionMode.Run)) {
				createBreakpoints(model);
			}

		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}

		entryPoint = new Runnable() {
			@Override
			public void run() {
				// TODO check what the Stepmanager is for in GEMOC
				// StepManagerRegistry.getInstance().registerManager(
				// XMOFExecutionEngine.this);
				try {
					// run vm
					_instance.setEngineStatus(RunStatus.Running);
					_instance.notifyEngineAboutToStart();
					rawEvents = new ArrayList<Event>();
					// Check Executionmode whether to run or debug VM
					if (executionContext.getExecutionMode().equals(
							ExecutionMode.Run)) {

						vm.run();
					} else {
						vm.debug();
					}

				} catch (Exception e) {
					System.out.println(e);
					throw new RuntimeException(e);
				} finally {
					// StepManagerRegistry.getInstance().unregisterManager(
					// XMOFExecutionEngine.this);

				}
			}
		};
	}

	private Collection<EPackage> loadConfigurationMetamodel(
			String confMetamodelPath) {
		Resource resource = loadResource(confMetamodelPath);

		Collection<EPackage> confMMPackages = new ArrayList<EPackage>();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				if (EPackage.Registry.INSTANCE.containsKey(ePackage.getNsURI())) {
					EPackage registeredPackage = (EPackage) EPackage.Registry.INSTANCE
							.get(ePackage.getNsURI());
					reloadPackage(registeredPackage);
					confMMPackages.add(registeredPackage);
				} else {
					confMMPackages.add(ePackage);
				}
			}
		}
		return confMMPackages;
	}

	private Collection<EObject> loadInputModelElements(
			IExecutionContext executionContext) {
		String modelPath = executionContext.getRunConfiguration()
				.getExecutedModelURI().path();

		modelPath = modelPath.substring(9, modelPath.length());
		Collection<EObject> inputModelElements = getInputModelElements(modelPath);
		return inputModelElements;
	}

	private List<ParameterValue> loadInputParameterValueElements(
			IExecutionContext executionContext) {
		String modelPath = ((RunConfiguration) executionContext
				.getRunConfiguration()).getModelInitializationModel();

		List<ParameterValue> parameterValues = getParameterValues(modelPath);
		return parameterValues;
	}

	private Resource loadResource(String path) {
		return resourceSet.getResource(
				URI.createPlatformResourceURI(path, true), true);
	}

	@Override
	public void notify(Event event) {
		rawEvents.add(event);
		if (event instanceof ActivityEntryEvent) {
			processActivityEntry((ActivityEntryEvent) event);
		} else if (event instanceof ActivityExitEvent) {
			processActivityExit((ActivityExitEvent) event);
		} else if (event instanceof ActivityNodeEntryEvent) {
			processActivityNodeEntry((ActivityNodeEntryEvent) event);
		} else if (event instanceof ActivityNodeExitEvent) {
			processActivityNodeExit((ActivityNodeExitEvent) event);
		}

	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
		if (event.getType().equals(XMOFVirtualMachineEvent.Type.SUSPEND)) {
			if (resume) {
				resume = false;
				vm.resume();

			}
		}

	}

	private void notifyMSEOccurenceExecuted(MSEOccurrence occurrence) {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			addon.mseOccurrenceExecuted(this, occurrence);
		}
	}

	private void notifyMSEOccurrenceAboutToStart(MSEOccurrence occurrence) {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			addon.aboutToExecuteMSEOccurrence(this, occurrence);
		}
	}

	private boolean first = true;

	private void processActivityEntry(ActivityEntryEvent event) {

		LogicalStep templs = createLogicalStep();

		Object o = vm.getxMOFConversionResult().getInputObject(
				event.getActivity());
		if (!first) {
			if (o instanceof EObject) {
				Activity activity = (Activity) o;
				activity2LogicalSteps.put(activity, templs);

				fUML.Semantics.Classes.Kernel.Value v = vm
						.getExecutionTrace()
						.getActivityExecutionByID(
								event.getActivityExecutionID())
						.getContextValueSnapshot().getRuntimeValue();
				EObject caller = null;
				if (v instanceof Object_) {
					caller = vm.getInstanceMap().getEObject(((Object_) v));

				}
				caller = configurationMap.getOriginalObject(caller);

				System.out.println(caller);

				EOperation operation = null;
				if (activity instanceof ActivityImpl) {
					operation = ((ActivityImpl) activity).getSpecification();
				}

				// TODO Maybe not correct to start an MSE Event for Activities
				MSEOccurrence ms = createMSEOccurence(caller, operation, templs);
				startLogicalStep(templs);
			} else {
				// TODO Throw Error or handle non EObjects (not possible?)
			}
		}else 
		{
			first = false;
			if (o instanceof EObject) {
				Activity activity = (Activity) o;
			

				EOperation operation = null;
				if (activity instanceof ActivityImpl) {
					operation = ((ActivityImpl) activity).getSpecification();
				}

				// TODO Maybe not correct to start an MSE Event for Activities
				MSEOccurrence ms = createMSEOccurence(activity, operation, templs);
				startLogicalStep(templs);
			}
		}

	}

	private LogicalStep createLogicalStep() {
		return MseFactory.eINSTANCE.createLogicalStep();
	}

	private void startLogicalStep(LogicalStep logicalStep) {

		notifyAboutToExecuteLogicalStep(logicalStep);

	}

	private EObject getOriginalObject(EObject eContainer) {

		for (EObject e : model.getModelElements()) {
			if (e.eClass().equals(eContainer)) {
				System.out.println(e.eClass());
				return e;
			}
		}
		return null;
	}

	private void processActivityExit(ActivityExitEvent event) {

		Object o = vm.getxMOFConversionResult().getInputObject(
				event.getActivity());

		if (o instanceof Activity) {
			Activity activity = (Activity) o;
			finishLogicalStep(activity2LogicalSteps.get(activity));
		}

		// TODO Logical Step cleanup
	}

	private EObject getModelInstanceFromName(String string) {
		for (EObject e : model.getModelElements()) {
			if (e instanceof ENamedElement) {
				if (((ENamedElement) e).getName().equals(string)) {
					return e;
				}
			}
		}
		return null;
	}

	private void processActivityNodeEntry(ActivityNodeEntryEvent event) {

		Object o = vm.getxMOFConversionResult().getInputObject(event.getNode());
		if (o instanceof EObject) {
			EObject activityNode = (EObject) o;

			// ActivityNode node = (ActivityNode) o;
			activityNode2MSEOccurrence.put((ActivityNode) activityNode,
					createMSEOccurence(activityNode, null, null));
		}

	}

	private void processActivityNodeExit(ActivityNodeExitEvent event) {
		// TODO maybe more cleanup necessary
		Object o = vm.getxMOFConversionResult().getInputObject(event.getNode());
		if (o instanceof ActivityNode) {
			ActivityNode activityNode = (ActivityNode) o;
			finishMSEOccurence(activityNode);
		}

	}

	private void reloadPackage(EPackage registeredPackage) {
		try {
			registeredPackage.eResource().unload();
			registeredPackage.eResource().load(null);
		} catch (IOException e) {
			// do not reload if IO exception
		}

	}

	public void resume() {
		resume = true;
	}

	// private LogicalStep startLogicalStep() {
	// if (actualLogicalStep != null) {
	// finishLogicalStep(actualLogicalStep);
	// } else {
	// LogicalStep ls = MseFactory.eINSTANCE.createLogicalStep();
	//
	// actualLogicalStep = ls;
	// }
	// return actualLogicalStep;
	//
	// }

	// TODO reorg
	private EMFCommandTransaction startNewTransaction(
			InternalTransactionalEditingDomain editingDomain,
			RecordingCommand command) throws InterruptedException {
		EMFCommandTransaction currentTransaction = new EMFCommandTransaction(
				command, editingDomain, null);
		currentTransaction.start();
		return currentTransaction;
	}

	public void subscribeToVMEvents(ExecutionEventListener eventListener) {
		vm.addRawExecutionEventListener(eventListener);
	}

}