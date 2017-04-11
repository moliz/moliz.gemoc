package org.modelexecution.xmof.examples.fsm.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.IStateManager;

public class FsmConfigurationTraceStateManager implements IStateManager<State<?, ?>> {

	private final Resource modelResource;

	private final Map<TracedObject<?>, EObject> tracedToExe;

	public FsmConfigurationTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
	}

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof fsmConfigurationTrace.States.SpecificState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							restoreStateExecute((fsmConfigurationTrace.States.SpecificState) state);
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(fsmConfigurationTrace.States.SpecificState state) {
		for (fsmConfigurationTrace.States.SpecificValue value : state.getValues()) {
			if (value instanceof fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value) {
				final fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) value
						.eContainer().eContainer();
				fsmConfiguration.FSMConfiguration exeObject = (fsmConfiguration.FSMConfiguration) getTracedToExe(
						tracedObject);
				exeObject.getAcceptedSequence().clear();
				exeObject.getAcceptedSequence()
						.addAll((Collection<? extends java.lang.String>) ((fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value) value)
								.getAcceptedSequence());
			} else if (value instanceof fsmConfigurationTrace.States.FSMConfiguration_currentState_Value) {
				final fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) value
						.eContainer().eContainer();
				fsmConfiguration.FSMConfiguration exeObject = (fsmConfiguration.FSMConfiguration) getTracedToExe(
						tracedObject);
				exeObject.setCurrentState(
						(fsm.State) ((fsmConfigurationTrace.States.FSMConfiguration_currentState_Value) value)
								.getCurrentState());
			} else if (value instanceof fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value) {
				final fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) value
						.eContainer().eContainer();
				fsmConfiguration.FSMConfiguration exeObject = (fsmConfiguration.FSMConfiguration) getTracedToExe(
						tracedObject);
				exeObject.getProducedSequence().clear();
				exeObject.getProducedSequence()
						.addAll((Collection<? extends java.lang.String>) ((fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value) value)
								.getProducedSequence());
			} else if (value instanceof fsmConfigurationTrace.States.Input_stringSeq_Value) {
				final fsmConfigurationTrace.States.fsmConfiguration.TracedInput tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedInput) value
						.eContainer().eContainer();
				final fsmConfiguration.Input originalObject = (fsmConfiguration.Input) tracedToExe.get(tracedObject);
				originalObject.getStringSeq().clear();
				originalObject.getStringSeq()
						.addAll(((fsmConfigurationTrace.States.Input_stringSeq_Value) value).getStringSeq());
			}
		}
	}
}
