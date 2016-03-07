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
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSE;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.MseFactory;
import org.gemoc.executionframework.xdsml_base.LanguageDefinition;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.xmof.execution.engine.ui.commons.RunConfiguration;
import org.xmof.execution.xdsml.api.extensions.languages.XMOFLanguageDefinitionExtension;

import xmofxdsml.XMOFLanguageDefiniton;

public class XMOFExecutionEngine extends AbstractSequentialExecutionEngine implements ExecutionEventListener{

	
	private Runnable entryPoint;
	private ResourceSet resourceSet;
	private ConfigurationObjectMap configurationMap;
	private XMOFVirtualMachine vm;
	private XMOFExecutionEngine _instance;
	private XMOFBasedModel model;

	private List<Event> rawEvents;
	
	private LogicalStep ls = null;
	
	private IEditorPart xMOFEditor = null;

	public XMOFExecutionEngine() {
		super();
		this._instance = this;
	}
	
	@Override
	public void initialize(final IExecutionContext executionContext) {
		super.initialize(executionContext);
		resourceSet = new ResourceSetImpl();
		
				
		//openXMOF(filename);

		model = getXMOFBasedModel(executionContext);
		vm = new XMOFVirtualMachine(model);
		vm.addRawExecutionEventListener(this);
		//vm.addVirtualMachineListener(this);
		try {

			createBreakpoints(model);

		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}

		entryPoint = new Runnable() {
			@Override
			public void run() {
//				StepManagerRegistry.getInstance().registerManager(
//						XMOFExecutionEngine.this);
				try {
					// run vm
					_instance.setEngineStatus(RunStatus.Running);
					_instance.notifyEngineAboutToStart();
					rawEvents = new ArrayList<Event>();
					vm.debug();

				} catch (Exception e) {
					throw new RuntimeException(e);
				} finally {
//					StepManagerRegistry.getInstance().unregisterManager(
//							XMOFExecutionEngine.this);

				}
			}
		};
	}
	
	private void createBreakpoints(XMOFBasedModel model) throws CoreException {
		Activity activity = null;
		EObject mainClassObject = model.getMainEClassObjects().get(0);
		for (EObject element : model.getMainEClassObjects()) {
			activity = getMainActivity(element);
			for (ActivityNode node : activity.getNode()) {
				if (node instanceof ActivityNode) {
					vm.addBreakpoint(node);
					//TODO
					//new GemocBreakpoint(Launcher.MODEL_ID, node, true);

					// notifyAboutToExecuteLogicalStep(Gemoc_execution_traceFactory.eINSTANCE.createLogicalStep());
				}
			}
		}
	}
	
	private Activity getMainActivity(EObject mainClassObject) {
		EClass eClass = mainClassObject.eClass();
		BehavioredEOperation mainOperation = getMainOperation(eClass);
		Activity mainActivity = getMethod(eClass, mainOperation);
		return mainActivity;
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

	private BehavioredEOperation getMainOperation(EClass eClass) {
		for (EOperation eOperation : eClass.getEAllOperations()) {
			if (eOperation instanceof BehavioredEOperation
					&& eOperation.getName().equals("main")) {
				return (BehavioredEOperation) eOperation;
			}
		}
		return null;
	}

	private XMOFBasedModel getXMOFBasedModel(IExecutionContext executionContext) {

		Collection<EObject> inputModelElements = loadInputModelElements(executionContext);
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements(executionContext);
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		Collection<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		LanguageDefinition ld = ((XMOFLanguageDefinitionExtension)executionContext.getLanguageDefinitionExtension()).getLanguageDefinition();
		String confMetamodelPath = ((XMOFLanguageDefiniton)ld).getXmofFileName().getXmofFileName();
		
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

	private void reloadPackage(EPackage registeredPackage) {
		try {
			registeredPackage.eResource().unload();
			registeredPackage.eResource().load(null);
		} catch (IOException e) {
			// do not reload if IO exception
		}

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

	private List<ParameterValue> loadInputParameterValueElements(
			IExecutionContext executionContext) {
		String modelPath = ((RunConfiguration) executionContext.getRunConfiguration()).getModelInitializationModel();
				
		List<ParameterValue> parameterValues = getParameterValues(modelPath);
		return parameterValues;
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

	private Collection<EObject> loadInputModelElements(
			IExecutionContext executionContext) {
		String modelPath = executionContext.getRunConfiguration().getExecutedModelURI().path();
		
		modelPath = modelPath.substring(9, modelPath.length());
		Collection<EObject> inputModelElements = getInputModelElements(modelPath);
		return inputModelElements;
	}

	private Collection<EObject> getInputModelElements(String modelPath) {
		Resource resource = loadResource(modelPath);
		return resource.getContents();
	}

	private Resource loadResource(String path) {
		return resourceSet.getResource(
				URI.createPlatformResourceURI(path, true), true);
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

	@Override
	public String engineKindName() {
		// TODO Auto-generated method stub
		return null;
	}

	
//	@Override
//	public void notify(XMOFVirtualMachineEvent event) {
//		if (event.getType() == Type.SUSPEND) {
//			resume();
//		}
//		
//	}
	
	public void resume() {
		vm.resume();
	}

	public void subscribeToVMEvents(ExecutionEventListener eventListener) {
		vm.addRawExecutionEventListener(eventListener);
	}


	private Map<EObject, LogMSETrans> logMSETrans = new HashMap<EObject, LogMSETrans>();
	private DiagramEditor diagramEditor;
	private DiagramEditor oldEditor;
	private ActivityNode oldNode;
	
	
	
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
	
	private void processActivityExit(ActivityExitEvent event) {
		// System.out.println("RECV: ActivityExitEvent"+event.getTimestamp());

		// logMSETrans.get(key)
		try {
			Object o = vm.getxMOFConversionResult().getInputObject(
					event.getActivity());
			if (o instanceof EObject) {
				LogMSETrans l = logMSETrans.get((EObject) o);
				if (l != null) {
					if (l.getTransaction() != null) {
						l.getTransaction().commit();
						l.setTransaction(null);
					}
					if ((l.getMseOccurence() != null)) {
						notifyMSEOccurenceExecuted(l.getMseOccurence());
						l.setMseOccurence(null);
					}
					if (l.getLogicalStep() != null) {
						notifyLogicalStepExecuted(l.getLogicalStep());
						l.setLogicalStep(null);
					}
				}
			}
		} catch (Exception ex) {
			// DO Nothing
		}
	}

	private void processActivityNodeExit(ActivityNodeExitEvent event) {

		try {
			Object o = vm.getxMOFConversionResult().getInputObject(
					event.getNode());
			if (o instanceof EObject) {
				LogMSETrans l = logMSETrans.get((EObject) o);
				if (l != null) {
					if (l.getTransaction() != null) {
						l.getTransaction().commit();
						l.setTransaction(null);
					}
					if ((l.getMseOccurence() != null)) {
						notifyMSEOccurenceExecuted(l.getMseOccurence());
						l.setMseOccurence(null);
					}
					if (l.getLogicalStep() != null) {
						notifyLogicalStepExecuted(l.getLogicalStep());
						l.setLogicalStep(null);
					}
				}

				if (diagramEditor != null) {
					oldEditor = (DiagramEditor) diagramEditor;
					oldNode = (ActivityNode) o;

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}


	private void processActivityNodeEntry(ActivityNodeEntryEvent event) {

		LogicalStep templs = MseFactory.eINSTANCE.createLogicalStep();

		MSE MSEEvent = MseFactory.eINSTANCE.createGenericMSE();
		MSEOccurrence mse = MseFactory.eINSTANCE.createMSEOccurrence();

		LogMSETrans l = new LogMSETrans();
		l.setLogicalStep(templs);
		l.setMseOccurence(mse);

		Object o = vm.getxMOFConversionResult().getInputObject(event.getNode());
		if (o instanceof EObject) {

			// org.modelexecution.xmof.diagram.decorator.service.DecoratorService.addDecoratedElement(o);
			// refreshDecoration(editor,o);

			logMSETrans.put((EObject) o, l);
			
			//TODO
			//MSEEvent.setCaller((EObject) o);

			if (o instanceof ENamedElement) {
				MSEEvent.setName(((ENamedElement) o).getName());
			}
			// MSEEvent.setName(((EObject)o)..);
			// MSEEvent.setName("-");
		}

		mse.setMse(MSEEvent);
		mse.setLogicalStep(templs);
		
		//TODO
//		Display.getDefault().syncExec(new Runnable() {
//			public void run() {
//				if (diagramEditor != null) {
//					if (oldEditor != null && oldNode != null) {
//
//						refreshDecoration(oldEditor, oldNode, false);
//						System.out.println("Refresh - for Activitynode "
//								+ oldNode);
//					}
//					refreshDecoration(diagramEditor, (ActivityNode) o, true);
//					System.out.println("Refresh + for Activitynode " + o);
//				}
//			}
//		});

		notifyAboutToExecuteLogicalStep(templs);
		notifyMSEOccurrenceAboutToStart(mse);

		
		RecordingCommand rc = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				// Do Nothing yet
			}
		};

		try {
			l.setTransaction(startNewTransaction(editingDomain, rc));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("About to Execute Node: " + event.getNode());

	}


	private void processActivityEntry(ActivityEntryEvent event) {

		LogicalStep templs = MseFactory.eINSTANCE.createLogicalStep();

		MSE MSEEvent = MseFactory.eINSTANCE.createGenericMSE();

		LogMSETrans l = new LogMSETrans();
		l.setLogicalStep(templs);

		MSEOccurrence mse = MseFactory.eINSTANCE.createMSEOccurrence();
		l.setMseOccurence(mse);

		Object o = vm.getxMOFConversionResult().getInputObject(
				event.getActivity());

		
		//TODO
//		Display.getDefault().syncExec(new Runnable() {
//			public void run() {
//				if (xMOFEditor != null) {
//					if (xMOFEditor instanceof KernelEditor) {
//						KernelEditor editor = (KernelEditor) xMOFEditor;
//						editor.showDiagramTap(o);
//						if (o instanceof Activity) {
//							Object selectedPage = editor.getSelectedPage();
//							if (selectedPage instanceof DiagramEditor) {
//								diagramEditor = (DiagramEditor) selectedPage;
//							}
//						}
//					}
//				}
//			}
//		});

		if (o instanceof EObject) {
			logMSETrans.put((EObject) o, l);
			//TODO
			//MSEEvent.setCaller((EObject) o);
			if (o instanceof ENamedElement) {
				MSEEvent.setName(((ENamedElement) o).getName());
			} else
				MSEEvent.setName("TEST");
			// MSEEvent.setName(((EObject)o)..);
			// MSEEvent.setName("-");
		}

		mse.setMse(MSEEvent);
		mse.setLogicalStep(templs);

		// logicalSteps.put(entry.getActivity(), templs);
		notifyAboutToExecuteLogicalStep(templs);
		notifyMSEOccurrenceAboutToStart(mse);

		RecordingCommand rc = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				// Do Nothing yet
			}
		};

		try {
			l.setTransaction(startNewTransaction(editingDomain, rc));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println("RECV: ActivityEntryEvent"+event.getTimestamp());

		// TODO Transaction starten
	}

	private EMFCommandTransaction startNewTransaction(
			InternalTransactionalEditingDomain editingDomain,
			RecordingCommand command) throws InterruptedException {
		EMFCommandTransaction currentTransaction = new EMFCommandTransaction(
				command, editingDomain, null);
		currentTransaction.start();
		return currentTransaction;
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

}
