package org.modelexecution.xmof.examples.fsm.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.launchconfiguration.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class FsmConfigurationTraceConstructor implements ITraceConstructor {
	private fsmConfigurationTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, TracedObject<?>> exeToTraced;

	private fsmConfigurationTrace.States.SpecificState lastState;

	private Resource traceResource;
	private final Deque<fsmConfigurationTrace.Steps.SpecificStep> context = new LinkedList<fsmConfigurationTrace.Steps.SpecificStep>();

	public FsmConfigurationTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = fsmConfigurationTrace.States.StatesFactory.eINSTANCE.createSpecificState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof fsmConfiguration.FSMConfiguration) {
						fsmConfiguration.FSMConfiguration o_cast = (fsmConfiguration.FSMConfiguration) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fsm.FSM) {
						fsm.FSM o_cast = (fsm.FSM) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fsmConfiguration.Input) {
						fsmConfiguration.Input o_cast = (fsmConfiguration.Input) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStates().add(lastState);
		}
	}

	private boolean addNewObjectToState(fsm.FSM o_cast, fsmConfigurationTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof fsmConfiguration.FSMConfiguration) {
			added = addNewObjectToState((fsmConfiguration.FSMConfiguration) o_cast, newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmConfigurationTrace.States.fsm.TracedFSM tracedObject = fsmConfigurationTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedFSM();
			tracedObject.setOriginalObject_FSM((fsm.FSM) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(fsmConfiguration.FSMConfiguration o_cast,
			fsmConfigurationTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration tracedObject = fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationFactory.eINSTANCE
					.createTracedFSMConfiguration();
			tracedObject.setOriginalObject_FSM((fsm.FSM) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field acceptedSequence
			tracedObject
					.setFSMConfiguration_acceptedSequence_Dimension(fsmConfigurationTrace.States.StatesFactory.eINSTANCE
							.createFSMConfiguration_acceptedSequence_Dimension());
			// Creation of the first value of the field acceptedSequence
			fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value firstValue_acceptedSequence = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
					.createFSMConfiguration_acceptedSequence_Value();

			firstValue_acceptedSequence.getAcceptedSequence()
					.addAll((Collection<? extends java.lang.String>) o_cast.getAcceptedSequence());

			tracedObject.getFSMConfiguration_acceptedSequence_Dimension().getValues().add(firstValue_acceptedSequence);
			newState.getValues().add(firstValue_acceptedSequence);

			// Creation of the dimension corresponding to the field currentState
			tracedObject.setFSMConfiguration_currentState_Dimension(fsmConfigurationTrace.States.StatesFactory.eINSTANCE
					.createFSMConfiguration_currentState_Dimension());
			// Creation of the first value of the field currentState
			fsmConfigurationTrace.States.FSMConfiguration_currentState_Value firstValue_currentState = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
					.createFSMConfiguration_currentState_Value();

			if (o_cast.getCurrentState() != null) {
				// TODO 
//				addNewObjectToState((fsm.State) o_cast.getCurrentState(), newState);
				firstValue_currentState.setCurrentState((fsm.State) o_cast.getCurrentState());
			} else {
				firstValue_currentState.setCurrentState((fsm.State) null);
			}

			tracedObject.getFSMConfiguration_currentState_Dimension().getValues().add(firstValue_currentState);
			newState.getValues().add(firstValue_currentState);

			// Creation of the dimension corresponding to the field producedSequence
			tracedObject
					.setFSMConfiguration_producedSequence_Dimension(fsmConfigurationTrace.States.StatesFactory.eINSTANCE
							.createFSMConfiguration_producedSequence_Dimension());
			// Creation of the first value of the field producedSequence
			fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value firstValue_producedSequence = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
					.createFSMConfiguration_producedSequence_Value();

			firstValue_producedSequence.getProducedSequence()
					.addAll((Collection<? extends java.lang.String>) o_cast.getProducedSequence());

			tracedObject.getFSMConfiguration_producedSequence_Dimension().getValues().add(firstValue_producedSequence);
			newState.getValues().add(firstValue_producedSequence);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(fsmConfiguration.Input o_cast,
			fsmConfigurationTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmConfigurationTrace.States.fsmConfiguration.TracedInput tracedObject = fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationFactory.eINSTANCE
					.createTracedInput();
			tracedObject.setOriginalObject((fsmConfiguration.Input) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field stringSeq
			tracedObject.setInput_stringSeq_Dimension(
					fsmConfigurationTrace.States.StatesFactory.eINSTANCE.createInput_stringSeq_Dimension());
			// Creation of the first value of the field stringSeq
			fsmConfigurationTrace.States.Input_stringSeq_Value firstValue_stringSeq = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
					.createInput_stringSeq_Value();

			firstValue_stringSeq.getStringSeq().addAll((Collection<? extends java.lang.String>) o_cast.getStringSeq());

			tracedObject.getInput_stringSeq_Dimension().getValues().add(firstValue_stringSeq);
			newState.getValues().add(firstValue_stringSeq);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private fsmConfigurationTrace.States.SpecificState copyState(fsmConfigurationTrace.States.SpecificState oldState) {
		fsmConfigurationTrace.States.SpecificState newState = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
				.createSpecificState();
		newState.getValues().addAll(oldState.getValues());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		} else if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			fsmConfigurationTrace.States.SpecificState newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// We only look at constructable objects that have mutable fields
				// Here we have nothing to rollback, just a new object to add
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange) {
					stateChanged = true;
					if (o instanceof fsmConfiguration.Input) {
						fsmConfiguration.Input o_cast = (fsmConfiguration.Input) o;
						addNewObjectToState(o_cast, newState);
					}
				}
				// We only look at constructable objects that have mutable fields
				// Here we must rollback to remove the values of the removed object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof fsmConfiguration.Input) {
						fsmConfiguration.Input o_cast = (fsmConfiguration.Input) o;
						fsmConfigurationTrace.States.fsmConfiguration.TracedInput traced = (fsmConfigurationTrace.States.fsmConfiguration.TracedInput) exeToTraced
								.get(o_cast);
						newState.getValues().remove(traced.getInput_stringSeq_Dimension().getValues()
								.get(traced.getInput_stringSeq_Dimension().getValues().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof fsmConfiguration.FSMConfiguration) {
						fsmConfiguration.FSMConfiguration o_cast = (fsmConfiguration.FSMConfiguration) o;

						if (p.getFeatureID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE
								.getFSMConfiguration_CurrentState().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration traced = (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) exeToTraced
									.get(o);
							fsmConfigurationTrace.States.FSMConfiguration_currentState_Value lastValue = traced
									.getFSMConfiguration_currentState_Dimension().getValues()
									.get(traced.getFSMConfiguration_currentState_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							fsmConfigurationTrace.States.FSMConfiguration_currentState_Value newValue = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
									.createFSMConfiguration_currentState_Value();

							fsm.State value = null;
							if (o_cast.getCurrentState() != null) {
								// TODO
//								addNewObjectToState(o_cast.getCurrentState(), newState);
								value = o_cast.getCurrentState();
							}

							newValue.setCurrentState((fsm.State) value);

							traced.getFSMConfiguration_currentState_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fsmConfiguration.FSMConfiguration) {
						fsmConfiguration.FSMConfiguration o_cast = (fsmConfiguration.FSMConfiguration) o;
						fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE
								.getFSMConfiguration_AcceptedSequence().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value> valueSequence = tracedObject
									.getFSMConfiguration_acceptedSequence_Dimension().getValues();
							fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getAcceptedSequence().size() == o_cast.getAcceptedSequence().size()) {
									java.util.Iterator<java.lang.String> it = o_cast.getAcceptedSequence().iterator();
									for (java.lang.String aPreviousValue : previousValue.getAcceptedSequence()) {
										java.lang.String aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value lastValue = tracedObject
										.getFSMConfiguration_acceptedSequence_Dimension().getValues()
										.get(tracedObject.getFSMConfiguration_acceptedSequence_Dimension().getValues()
												.size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value newValue = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
										.createFSMConfiguration_acceptedSequence_Value();
								newValue.getAcceptedSequence()
										.addAll((Collection<? extends java.lang.String>) o_cast.getAcceptedSequence());
								tracedObject.getFSMConfiguration_acceptedSequence_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						} else if (p.getFeatureID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE
								.getFSMConfiguration_ProducedSequence().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value> valueSequence = tracedObject
									.getFSMConfiguration_producedSequence_Dimension().getValues();
							fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getProducedSequence().size() == o_cast.getProducedSequence().size()) {
									java.util.Iterator<java.lang.String> it = o_cast.getProducedSequence().iterator();
									for (java.lang.String aPreviousValue : previousValue.getProducedSequence()) {
										java.lang.String aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value lastValue = tracedObject
										.getFSMConfiguration_producedSequence_Dimension().getValues()
										.get(tracedObject.getFSMConfiguration_producedSequence_Dimension().getValues()
												.size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value newValue = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
										.createFSMConfiguration_producedSequence_Value();
								newValue.getProducedSequence()
										.addAll((Collection<? extends java.lang.String>) o_cast.getProducedSequence());
								tracedObject.getFSMConfiguration_producedSequence_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}
					}
					if (o instanceof fsmConfiguration.Input) {
						fsmConfiguration.Input o_cast = (fsmConfiguration.Input) o;
						fsmConfigurationTrace.States.fsmConfiguration.TracedInput tracedObject = (fsmConfigurationTrace.States.fsmConfiguration.TracedInput) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE.getInput_StringSeq()
								.getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<fsmConfigurationTrace.States.Input_stringSeq_Value> valueSequence = tracedObject
									.getInput_stringSeq_Dimension().getValues();
							fsmConfigurationTrace.States.Input_stringSeq_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getStringSeq().size() == o_cast.getStringSeq().size()) {
									java.util.Iterator<java.lang.String> it = o_cast.getStringSeq().iterator();
									for (java.lang.String aPreviousValue : previousValue.getStringSeq()) {
										java.lang.String aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								fsmConfigurationTrace.States.Input_stringSeq_Value lastValue = tracedObject
										.getInput_stringSeq_Dimension().getValues()
										.get(tracedObject.getInput_stringSeq_Dimension().getValues().size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								fsmConfigurationTrace.States.Input_stringSeq_Value newValue = fsmConfigurationTrace.States.StatesFactory.eINSTANCE
										.createInput_stringSeq_Value();
								newValue.getStringSeq()
										.addAll((Collection<? extends java.lang.String>) o_cast.getStringSeq());
								tracedObject.getInput_stringSeq_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final fsmConfigurationTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final fsmConfigurationTrace.States.SpecificState startingState = lastState;
					final fsmConfigurationTrace.States.SpecificState endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStates().add(lastState);
			} else if (copiedState) {
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step<?> step) {
		fsmConfigurationTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof fsmConfigurationTrace.Steps.SpecificStep) {
			step_cast = (fsmConfigurationTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			fsmConfigurationTrace.States.SpecificState state = traceRoot.getStates()
					.get(traceRoot.getStates().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<fsmConfigurationTrace.Steps.SpecificStep, fsmConfigurationTrace.States.SpecificState>) context
						.getFirst()).getSubSteps().add(step_cast);
			} else {
				((SequentialStep<fsmConfigurationTrace.Steps.SpecificStep, fsmConfigurationTrace.States.SpecificState>) traceRoot
						.getRootStep()).getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run) {
				fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run fsmConfiguration_FSMConfiguration_RunInstance = (fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run) step_cast;
				traceRoot.getFsmConfiguration_FSMConfiguration_Run_Sequence()
						.add(fsmConfiguration_FSMConfiguration_RunInstance);
			} else if (step_cast instanceof fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire) {
				fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire fsmConfiguration_TransitionConfiguration_FireInstance = (fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire) step_cast;
				traceRoot.getFsmConfiguration_TransitionConfiguration_Fire_Sequence()
						.add(fsmConfiguration_TransitionConfiguration_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(fsmConfigurationTrace.Steps.SpecificStep currentStep,
			fsmConfigurationTrace.States.SpecificState startingState,
			fsmConfigurationTrace.States.SpecificState endingState) {

		fsmConfigurationTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run) {
			implicitStep = fsmConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFsmConfiguration_FSMConfiguration_Run_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<fsmConfigurationTrace.Steps.SpecificStep, fsmConfigurationTrace.States.SpecificState>) currentStep)
					.getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step<?> step) {
		fsmConfigurationTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = fsmConfigurationTrace.FsmConfigurationTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<fsmConfigurationTrace.Steps.SpecificStep, fsmConfigurationTrace.States.SpecificState> rootStep = fsmConfigurationTrace.Steps.StepsFactory.eINSTANCE
				.createSpecificRootStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(
				r -> r == null || (r != executedModel && executedModel.getContents().contains(r.getContents().get(0))));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
