package org.modelexecution.xmof.examples.iml.sequential.sequentialiml.trace.tracemanager;

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

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ImlTraceConstructor implements ITraceConstructor {
	private imlTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private imlTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<imlTrace.Steps.SpecificStep> context = new LinkedList<imlTrace.Steps.SpecificStep>();

	public ImlTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = imlTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedActivity tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedActivitys().add(tracedObject);

			// Creation of the first value of the field current
			imlTrace.States.Activity_current_Value firstValue_current = imlTrace.States.StatesFactory.eINSTANCE
					.createActivity_current_Value();

			firstValue_current.setCurrent((boolean) o_cast.isCurrent());
			tracedObject.getCurrentSequence().add(firstValue_current);
			newState.getActivity_current_Values().add(firstValue_current);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedAddData tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedAddData();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedAddDatas().add(tracedObject);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedConnection tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedConnection();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedConnections().add(tracedObject);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint o_cast,
			imlTrace.States.State newState) {

		if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element o_cast,
			imlTrace.States.State newState) {

		if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedEvent tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE.createTracedEvent();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedEvents().add(tracedObject);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedHeader tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedHeader();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedHeaders().add(tracedObject);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement o_cast,
			imlTrace.States.State newState) {

		if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) o_cast, newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence) o_cast,
					newState);
		} else if (o_cast instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection) {
			addNewObjectToState((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedJump tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE.createTracedJump();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedJumps().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedSelectionConvergence tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedSelectionConvergence();
			tracedObject.setOriginalObject(
					(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedSelectionConvergences().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedSelectionDivergence tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedSelectionDivergence();
			tracedObject.setOriginalObject(
					(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedSelectionDivergences().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(
			org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedSimultaneousConvergence tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedSimultaneousConvergence();
			tracedObject.setOriginalObject(
					(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedSimultaneousConvergences().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(
			org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedSimultaneousDivergence tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedSimultaneousDivergence();
			tracedObject.setOriginalObject(
					(org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedSimultaneousDivergences().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.State o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedState tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE.createTracedState();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedStates().add(tracedObject);

			// Creation of the first value of the field current
			imlTrace.States.State_current_Value firstValue_current = imlTrace.States.StatesFactory.eINSTANCE
					.createState_current_Value();

			firstValue_current.setCurrent((boolean) o_cast.isCurrent());
			tracedObject.getCurrentSequence().add(firstValue_current);
			newState.getState_current_Values().add(firstValue_current);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedStateTransition tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedStateTransition();
			tracedObject
					.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedStateTransitions().add(tracedObject);

			// Creation of the first value of the field firing
			imlTrace.States.ConnectionPoint_firing_Value firstValue_firing = imlTrace.States.StatesFactory.eINSTANCE
					.createConnectionPoint_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getConnectionPoint_firing_Values().add(firstValue_firing);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable o_cast,
			imlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			imlTrace.States.iml.TracedVariable tracedObject = imlTrace.States.iml.ImlFactory.eINSTANCE
					.createTracedVariable();
			tracedObject.setOriginalObject((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIml_tracedVariables().add(tracedObject);

			// Creation of the first value of the field value
			imlTrace.States.Variable_value_Value firstValue_value = imlTrace.States.StatesFactory.eINSTANCE
					.createVariable_value_Value();

			firstValue_value.setValue((java.lang.String) o_cast.getValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getVariable_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private imlTrace.States.State copyState(imlTrace.States.State oldState) {
		imlTrace.States.State newState = imlTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getState_current_Values().addAll(oldState.getState_current_Values());
		newState.getActivity_current_Values().addAll(oldState.getActivity_current_Values());
		newState.getConnectionPoint_firing_Values().addAll(oldState.getConnectionPoint_firing_Values());
		newState.getVariable_value_Values().addAll(oldState.getVariable_value_Values());
		return newState;
	}

	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			imlTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.State o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) o;

						if (p.getFeatureID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
								.getState_Current().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							imlTrace.States.iml.TracedState traced = (imlTrace.States.iml.TracedState) exeToTraced
									.get(o);
							imlTrace.States.State_current_Value lastValue = traced.getCurrentSequence()
									.get(traced.getCurrentSequence().size() - 1);
							newState.getState_current_Values().remove(lastValue);

							// And we create a proper new value
							imlTrace.States.State_current_Value newValue = imlTrace.States.StatesFactory.eINSTANCE
									.createState_current_Value();

							boolean value = o_cast.isCurrent();

							newValue.setCurrent((boolean) value);

							traced.getCurrentSequence().add(newValue);
							newState.getState_current_Values().add(newValue);
						}
					}

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) o;

						if (p.getFeatureID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
								.getConnectionPoint_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							imlTrace.States.iml.TracedConnectionPoint traced = (imlTrace.States.iml.TracedConnectionPoint) exeToTraced
									.get(o);
							imlTrace.States.ConnectionPoint_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getConnectionPoint_firing_Values().remove(lastValue);

							// And we create a proper new value
							imlTrace.States.ConnectionPoint_firing_Value newValue = imlTrace.States.StatesFactory.eINSTANCE
									.createConnectionPoint_firing_Value();

							boolean value = o_cast.isFiring();

							newValue.setFiring((boolean) value);

							traced.getFiringSequence().add(newValue);
							newState.getConnectionPoint_firing_Values().add(newValue);
						}
					}

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) o;

						if (p.getFeatureID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
								.getVariable_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							imlTrace.States.iml.TracedVariable traced = (imlTrace.States.iml.TracedVariable) exeToTraced
									.get(o);
							imlTrace.States.Variable_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getVariable_value_Values().remove(lastValue);

							// And we create a proper new value
							imlTrace.States.Variable_value_Value newValue = imlTrace.States.StatesFactory.eINSTANCE
									.createVariable_value_Value();

							java.lang.String value = o_cast.getValue();

							newValue.setValue((java.lang.String) value);

							traced.getValueSequence().add(newValue);
							newState.getVariable_value_Values().add(newValue);
						}
					}

					if (o instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) {
						org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity o_cast = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) o;

						if (p.getFeatureID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
								.getActivity_Current().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							imlTrace.States.iml.TracedActivity traced = (imlTrace.States.iml.TracedActivity) exeToTraced
									.get(o);
							imlTrace.States.Activity_current_Value lastValue = traced.getCurrentSequence()
									.get(traced.getCurrentSequence().size() - 1);
							newState.getActivity_current_Values().remove(lastValue);

							// And we create a proper new value
							imlTrace.States.Activity_current_Value newValue = imlTrace.States.StatesFactory.eINSTANCE
									.createActivity_current_Value();

							boolean value = o_cast.isCurrent();

							newValue.setCurrent((boolean) value);

							traced.getCurrentSequence().add(newValue);
							newState.getActivity_current_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final imlTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final imlTrace.States.State startingState = lastState;
					final imlTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		imlTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof imlTrace.Steps.SpecificStep) {
			step_cast = (imlTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			imlTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<imlTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof imlTrace.Steps.Iml_Activity_DoExecute) {
				imlTrace.Steps.Iml_Activity_DoExecute iml_Activity_DoExecuteInstance = (imlTrace.Steps.Iml_Activity_DoExecute) step_cast;
				traceRoot.getIml_Activity_DoExecute_Sequence().add(iml_Activity_DoExecuteInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_Header_Execute) {
				imlTrace.Steps.Iml_Header_Execute iml_Header_ExecuteInstance = (imlTrace.Steps.Iml_Header_Execute) step_cast;
				traceRoot.getIml_Header_Execute_Sequence().add(iml_Header_ExecuteInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_SelectionConvergence_DoFire) {
				imlTrace.Steps.Iml_SelectionConvergence_DoFire iml_SelectionConvergence_DoFireInstance = (imlTrace.Steps.Iml_SelectionConvergence_DoFire) step_cast;
				traceRoot.getIml_SelectionConvergence_DoFire_Sequence().add(iml_SelectionConvergence_DoFireInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_SelectionDivergence_DoFire) {
				imlTrace.Steps.Iml_SelectionDivergence_DoFire iml_SelectionDivergence_DoFireInstance = (imlTrace.Steps.Iml_SelectionDivergence_DoFire) step_cast;
				traceRoot.getIml_SelectionDivergence_DoFire_Sequence().add(iml_SelectionDivergence_DoFireInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_SimultaneousConvergence_DoFire) {
				imlTrace.Steps.Iml_SimultaneousConvergence_DoFire iml_SimultaneousConvergence_DoFireInstance = (imlTrace.Steps.Iml_SimultaneousConvergence_DoFire) step_cast;
				traceRoot.getIml_SimultaneousConvergence_DoFire_Sequence()
						.add(iml_SimultaneousConvergence_DoFireInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_SimultaneousDivergence_DoFire) {
				imlTrace.Steps.Iml_SimultaneousDivergence_DoFire iml_SimultaneousDivergence_DoFireInstance = (imlTrace.Steps.Iml_SimultaneousDivergence_DoFire) step_cast;
				traceRoot.getIml_SimultaneousDivergence_DoFire_Sequence()
						.add(iml_SimultaneousDivergence_DoFireInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_State_Activate) {
				imlTrace.Steps.Iml_State_Activate iml_State_ActivateInstance = (imlTrace.Steps.Iml_State_Activate) step_cast;
				traceRoot.getIml_State_Activate_Sequence().add(iml_State_ActivateInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_State_Deactivate) {
				imlTrace.Steps.Iml_State_Deactivate iml_State_DeactivateInstance = (imlTrace.Steps.Iml_State_Deactivate) step_cast;
				traceRoot.getIml_State_Deactivate_Sequence().add(iml_State_DeactivateInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_State_ExecuteActivities) {
				imlTrace.Steps.Iml_State_ExecuteActivities iml_State_ExecuteActivitiesInstance = (imlTrace.Steps.Iml_State_ExecuteActivities) step_cast;
				traceRoot.getIml_State_ExecuteActivities_Sequence().add(iml_State_ExecuteActivitiesInstance);
			} else if (step_cast instanceof imlTrace.Steps.Iml_StateTransition_DoFire) {
				imlTrace.Steps.Iml_StateTransition_DoFire iml_StateTransition_DoFireInstance = (imlTrace.Steps.Iml_StateTransition_DoFire) step_cast;
				traceRoot.getIml_StateTransition_DoFire_Sequence().add(iml_StateTransition_DoFireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(imlTrace.Steps.SpecificStep currentStep, imlTrace.States.State startingState,
			imlTrace.States.State endingState) {

		imlTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof imlTrace.Steps.Iml_Header_Execute) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_Header_Execute_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_SelectionConvergence_DoFire) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SelectionConvergence_DoFire_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_SelectionDivergence_DoFire) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SelectionDivergence_DoFire_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_SimultaneousConvergence_DoFire) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE
					.createIml_SimultaneousConvergence_DoFire_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_SimultaneousDivergence_DoFire) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SimultaneousDivergence_DoFire_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_StateTransition_DoFire) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_StateTransition_DoFire_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_State_Activate) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_State_Activate_ImplicitStep();
		} else if (currentStep instanceof imlTrace.Steps.Iml_State_ExecuteActivities) {
			implicitStep = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_State_ExecuteActivities_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<imlTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		imlTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = imlTrace.ImlTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<imlTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
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
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
