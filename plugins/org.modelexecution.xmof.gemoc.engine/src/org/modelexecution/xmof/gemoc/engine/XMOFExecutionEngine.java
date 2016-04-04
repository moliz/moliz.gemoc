package org.modelexecution.xmof.gemoc.engine;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ValueSnapshot;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.internal.GemocModelSynchronizer;
import org.modelexecution.xmof.gemoc.engine.internal.XMOFBasedModelLoader;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFBasedModelSynchronizer;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;

import fUML.Semantics.Classes.Kernel.Object_;

public class XMOFExecutionEngine extends AbstractSequentialExecutionEngine
		implements ExecutionEventListener, IXMOFVirtualMachineListener {

	private ConfigurationObjectMap configurationMap;

	private XMOFVirtualMachine vm;

	private boolean NODEWISESTEPS = false;

	public XMOFExecutionEngine() {
		super();
	}

	@Override
	public String engineKindName() {
		return "XMOF Engine";
	}

	@Override
	protected void prepareEntryPoint(IExecutionContext executionContext) {
		NODEWISESTEPS = ((RunConfiguration) executionContext
				.getRunConfiguration()).getNodewiseStepping();

		XMOFBasedModelLoader loader = new XMOFBasedModelLoader(executionContext);
		XMOFBasedModel model = loader.loadXMOFBasedModel();
		configurationMap = loader.getConfigurationMap();

		vm = new XMOFVirtualMachine(model);
		XMOFBasedModelSynchronizer modelSynchronizer = createModelSynchronizer(model);
		vm.setSynchronizeModel(modelSynchronizer);
		vm.addRawExecutionEventListener(this);
		vm.addVirtualMachineListener(this);
	}

	private XMOFBasedModelSynchronizer createModelSynchronizer(
			XMOFBasedModel model) {
		XMOFBasedModelSynchronizer modelSynchronizer = new GemocModelSynchronizer(
				vm.getInstanceMap(), model.getEditingDomain());
		modelSynchronizer.setModelResource(model.getModelResource());
		return modelSynchronizer;
	}

	@Override
	protected void prepareInitializeModel(IExecutionContext executionContext) {

	}

	@Override
	public void notify(Event event) {
		if (event instanceof ActivityEntryEvent) {
			ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
			processActivityEntry(activityEntryEvent);
		} else if (event instanceof ActivityExitEvent) {
			processActivityExit((ActivityExitEvent) event);
		}
	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
	}

	private void processActivityEntry(ActivityEntryEvent event) {
		ActivityExecution activityExecution = vm.getExecutionTrace()
				.getActivityExecutionByID(event.getActivityExecutionID());
		Activity activity = (Activity) vm.getxMOFConversionResult()
				.getInputObject(event.getActivity());
		EObject context = getActivityContextObject(activityExecution);
		EObject caller = configurationMap.getOriginalObject(context);
		String className = caller.eClass().getName();
		String methodName = activity.getSpecification().getName();
		beforeExecutionStep(caller, className, methodName);
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

	private void processActivityExit(ActivityExitEvent event) {
		afterExecutionStep();
	}

	@Override
	protected void executeEntryPoint() {
		vm.run();
	}

	@Override
	protected void initializeModel() {
		// there is nothing to do for xMOF
	}

	public ConfigurationObjectMap getConfigurationMap() {
		return configurationMap;
	}

}