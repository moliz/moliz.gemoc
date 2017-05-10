package org.modelexecution.xmof.examples.fuml.fumlfewsteps.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.gemoc.tracebenchmark.api.BenchmarkTraceConstructor;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class FumlConfigurationFewStepsTraceConstructor implements ITraceConstructor, BenchmarkTraceConstructor {
	private fumlConfigurationFewStepsTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private fumlConfigurationFewStepsTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<fumlConfigurationFewStepsTrace.Steps.SpecificStep> context = new LinkedList<fumlConfigurationFewStepsTrace.Steps.SpecificStep>();

	public FumlConfigurationFewStepsTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Token) {
						fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Token o_cast = (fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Token) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance) {
						fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance o_cast = (fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) {
						fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor o_cast = (fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsFactory.eINSTANCE
					.createTracedActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActionsFewSteps_tracedActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value firstValue_firing = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring((boolean) o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedActivityEdgeInstance();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityFinalNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedActivityFinalNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation) o_cast, newState);
		} else
			if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityParameterNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityParameterNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ControlNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ControlNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) o_cast, newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedActivityNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedActivityNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityParameterNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityParameterNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedActivityParameterNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ControlNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.InitialNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.InitialNodeActivation) o_cast,
					newState);
		} else
			if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityFinalNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityFinalNodeActivation) o_cast,
					newState);
		} else
			if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.DecisionNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.DecisionNodeActivation) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.DecisionNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedDecisionNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedForkNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedForkNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedForkNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.InitialNodeActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedInitialNodeActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedInitialNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedInitialNodeActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsFactory.eINSTANCE
					.createTracedPinActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActionsFewSteps_tracedPinActivations().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation) o_cast, newState);
		} else
			if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityParameterNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityParameterNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation) {
			added = addNewObjectToState(
					(fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsFactory.eINSTANCE
					.createTracedSemanticVisitor();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLociFewSteps_tracedSemanticVisitors().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				firstValue_runtimeModelElement.setRuntimeModelElement(
						(fumlConfigurationFewSteps.ElementConfiguration) o_cast.getRuntimeModelElement());
			} else {
				firstValue_runtimeModelElement
						.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Token o_cast,
			fumlConfigurationFewStepsTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedToken tracedObject = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory.eINSTANCE
					.createTracedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivitiesFewSteps_tracedTokens().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private fumlConfigurationFewStepsTrace.States.State copyState(
			fumlConfigurationFewStepsTrace.States.State oldState) {
		fumlConfigurationFewStepsTrace.States.State newState = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
				.createState();
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that
			// changed
			fumlConfigurationFewStepsTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// We only look at constructable objects that have mutable
				// fields
				// Here we have nothing to rollback, just a new object to add
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange) {
					stateChanged = true;
					if (o instanceof fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) {
						fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor o_cast = (fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) o;
						addNewObjectToState(o_cast, newState);
					}
				}
				// We only look at constructable objects that have mutable
				// fields
				// Here we must rollback to remove the values of the removed
				// object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) {
						fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation o_cast = (fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) o;
						fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation traced = (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation) exeToTraced
								.get(o_cast);
						newState.getActionActivation_firing_Values()
								.remove(traced.getFiringSequence().get(traced.getFiringSequence().size() - 1));
					}
					if (o instanceof fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) {
						fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor o_cast = (fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) o;
						fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor traced = (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor) exeToTraced
								.get(o_cast);
						newState.getSemanticVisitor_runtimeModelElement_Values()
								.remove(traced.getRuntimeModelElementSequence()
										.get(traced.getRuntimeModelElementSequence().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and
				// add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) {
						fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation o_cast = (fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation) o;

						if (p.getFeatureID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field
							// from the new state
							fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation traced = (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation) exeToTraced
									.get(o);
							fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value lastValue = traced
									.getFiringSequence().get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value newValue = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();

							boolean value = o_cast.isFiring();

							newValue.setFiring((boolean) value);

							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}
					}

					if (o instanceof fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) {
						fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor o_cast = (fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor) o;

						if (p.getFeatureID() == fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field
							// from the new state
							fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor traced = (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor) exeToTraced
									.get(o);
							fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = fumlConfigurationFewStepsTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();

							fumlConfigurationFewSteps.ElementConfiguration value = null;
							if (o_cast.getRuntimeModelElement() != null) {
								value = o_cast.getRuntimeModelElement();
							}

							newValue.setRuntimeModelElement((fumlConfigurationFewSteps.ElementConfiguration) value);

							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final fumlConfigurationFewStepsTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final fumlConfigurationFewStepsTrace.States.State startingState = lastState;
					final fumlConfigurationFewStepsTrace.States.State endingState = newState;
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
		fumlConfigurationFewStepsTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof fumlConfigurationFewStepsTrace.Steps.SpecificStep) {
			step_cast = (fumlConfigurationFewStepsTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			fumlConfigurationFewStepsTrace.States.State state = traceRoot.getStatesTrace()
					.get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<fumlConfigurationFewStepsTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps()
						.add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationInstance);
			} else if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationInstance);
			} else
				if (step_cast instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation) {
				fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationInstance = (fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation) step_cast;
				traceRoot
						.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
						.add(fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(fumlConfigurationFewStepsTrace.Steps.SpecificStep currentStep,
			fumlConfigurationFewStepsTrace.States.State startingState,
			fumlConfigurationFewStepsTrace.States.State endingState) {

		fumlConfigurationFewStepsTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep();
		} else
			if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep();
		} else
			if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep();
		} else if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep();
		} else
			if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep();
		} else if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep();
		} else
			if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep();
		} else
			if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep();
		} else if (currentStep instanceof fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation) {
			implicitStep = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<fumlConfigurationFewStepsTrace.Steps.SpecificStep>) currentStep).getSubSteps()
					.add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		fumlConfigurationFewStepsTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTraceFactory.eINSTANCE
				.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<fumlConfigurationFewStepsTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
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

	@Override
	public Resource getTraceResource() {
		return traceResource;
	}

	@Override
	public void cleanUp() {
		this.executedModel.getContents().clear();
		this.executedModel.unload();
		this.traceResource.getContents().clear();
		this.traceResource.unload();
		this.executedModel = null;
		this.traceResource = null;
		this.traceRoot = null;
	}

	@Override
	public void preCleanUp() {
		exeToTraced.clear();

	}

	@Override
	public Map<EObject, EObject> getExeToTraced() {
		return exeToTraced;
	}

	@Override
	public int getStatesSize() {
		return traceRoot.getStatesTrace().size();
	}
}
