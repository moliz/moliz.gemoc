package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;

public class GemocXMOFVirtualMachine extends XMOFVirtualMachine {

	public GemocXMOFVirtualMachine(GemocXMOFBasedModel modelToBeExecuted) {
		super(modelToBeExecuted);
	}

	@Override
	protected void initializeInstanceMap() {
		GemocXMOFBasedModel model = (GemocXMOFBasedModel) getModel();
		setInstanceMap(new GemocXMOFInstanceMap(getxMOFConversionResult(),
				model.getModelElements(), getRawExecutionContext().getLocus(),
				model));
	}

	@Override
	protected EClass getObjectType(EObject mainClassObject) {
		EClass registeredEClass = mainClassObject.eClass();
		GemocXMOFInstanceMapBuilder builder = ((GemocXMOFInstanceMap) this
				.getInstanceMap()).getBuilder();
		EClass xmofEClass = builder.getXMOFConfigurationClass(registeredEClass);
		return xmofEClass;
	}

	@Override
	protected Collection<XMOFVirtualMachineEvent> processRawEvent(Event event) {
		Collection<XMOFVirtualMachineEvent> eventsToDeliver = super
				.processRawEvent(event);
		if (event instanceof ActivityEntryEvent) {
			ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
			int activityExecutionID = activityEntryEvent.getActivityExecutionID();
			setActivityExecutionID(activityExecutionID);
		}
		return eventsToDeliver;
	}

	@Override
	protected void resumeExecution() {
		getRawExecutionContext().nextStep(getActivityExecutionID());
	}

}
