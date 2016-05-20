package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

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
import org.gemoc.executionframework.engine.mse.LaunchConfiguration;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.executionframework.engine.mse.SequentialStep;

import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class UmlTraceConstructor implements ITraceConstructor {
	private umlTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private umlTrace.States.State lastState;

	private Resource traceResource;
	private Deque<umlTrace.Steps.SpecificStep> context = new LinkedList<umlTrace.Steps.SpecificStep>();

	public UmlTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = umlTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
						fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.OutputPinActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
						fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
						fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.InputPinActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.ElementConfiguration) {
						fumlConfiguration.ElementConfiguration o_cast = (fumlConfiguration.ElementConfiguration) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ControlToken) {
						fumlConfiguration.Activities.IntermediateActivities.ControlToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ControlToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
						fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.ActionActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o_cast,
					newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityEdgeInstance();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityEdgeInstances().add(tracedObject);

			// Creation of the first value of the field edge_ActivityEdgeInstance
			umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value firstValue_edge_ActivityEdgeInstance = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityEdgeInstance_edge_ActivityEdgeInstance_Value();

			if (o_cast.getEdge_ActivityEdgeInstance() != null) {
				firstValue_edge_ActivityEdgeInstance
						.setEdge_ActivityEdgeInstance(o_cast.getEdge_ActivityEdgeInstance());
			} else {
				firstValue_edge_ActivityEdgeInstance.setEdge_ActivityEdgeInstance(null);
			}

			tracedObject.getEdge_ActivityEdgeInstanceSequence().add(firstValue_edge_ActivityEdgeInstance);
			newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
					.add(firstValue_edge_ActivityEdgeInstance);

			// Creation of the first value of the field group_ActivityEdgeInstance
			umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value firstValue_group_ActivityEdgeInstance = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityEdgeInstance_group_ActivityEdgeInstance_Value();

			if (o_cast.getGroup_ActivityEdgeInstance() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityEdgeInstance(), newState);
				firstValue_group_ActivityEdgeInstance.setGroup_ActivityEdgeInstance(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityEdgeInstance())));
			} else {
				firstValue_group_ActivityEdgeInstance.setGroup_ActivityEdgeInstance(null);
			}

			tracedObject.getGroup_ActivityEdgeInstanceSequence().add(firstValue_group_ActivityEdgeInstance);
			newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
					.add(firstValue_group_ActivityEdgeInstance);

			// Creation of the first value of the field offers
			umlTrace.States.ActivityEdgeInstance_offers_Value firstValue_offers = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityEdgeInstance_offers_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Offer aValue : o_cast.getOffers()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_offers.getOffers()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer>) getExeToTraced(
							o_cast.getOffers(), newState));

			tracedObject.getOffersSequence().add(firstValue_offers);
			newState.getActivityEdgeInstance_offers_Values().add(firstValue_offers);

			// Creation of the first value of the field source
			umlTrace.States.ActivityEdgeInstance_source_Value firstValue_source = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityEdgeInstance_source_Value();

			if (o_cast.getSource() != null) {
				addNewObjectToState(o_cast.getSource(), newState);
				firstValue_source.setSource(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getSource())));
			} else {
				firstValue_source.setSource(null);
			}

			tracedObject.getSourceSequence().add(firstValue_source);
			newState.getActivityEdgeInstance_source_Values().add(firstValue_source);

			// Creation of the first value of the field target
			umlTrace.States.ActivityEdgeInstance_target_Value firstValue_target = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityEdgeInstance_target_Value();

			if (o_cast.getTarget() != null) {
				addNewObjectToState(o_cast.getTarget(), newState);
				firstValue_target.setTarget(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getTarget())));
			} else {
				firstValue_target.setTarget(null);
			}

			tracedObject.getTargetSequence().add(firstValue_target);
			newState.getActivityEdgeInstance_target_Values().add(firstValue_target);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityExecution();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityExecutions().add(tracedObject);

			// Creation of the first value of the field activationGroup
			umlTrace.States.ActivityExecution_activationGroup_Value firstValue_activationGroup = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityExecution_activationGroup_Value();

			if (o_cast.getActivationGroup() != null) {
				addNewObjectToState(o_cast.getActivationGroup(), newState);
				firstValue_activationGroup.setActivationGroup(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getActivationGroup())));
			} else {
				firstValue_activationGroup.setActivationGroup(null);
			}

			tracedObject.getActivationGroupSequence().add(firstValue_activationGroup);
			newState.getActivityExecution_activationGroup_Values().add(firstValue_activationGroup);

			// Creation of the first value of the field featureValues
			umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
					.createCompoundValue_featureValues_Value();

			for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_featureValues.getFeatureValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
							o_cast.getFeatureValues(), newState));

			tracedObject.getFeatureValuesSequence().add(firstValue_featureValues);
			newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

			// Creation of the first value of the field locus_ExtensionalValue
			umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
					.createExtensionalValue_locus_ExtensionalValue_Value();

			if (o_cast.getLocus_ExtensionalValue() != null) {
				addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
				firstValue_locus_ExtensionalValue
						.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExtensionalValue())));
			} else {
				firstValue_locus_ExtensionalValue.setLocus_ExtensionalValue(null);
			}

			tracedObject.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
			newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

			// Creation of the first value of the field types
			umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
					.createObject_types_Value();

			firstValue_types.getTypes().addAll((Collection<? extends org.eclipse.uml2.uml.Class>) o_cast.getTypes());

			tracedObject.getTypesSequence().add(firstValue_types);
			newState.getObject_types_Values().add(firstValue_types);

			// Creation of the first value of the field context
			umlTrace.States.Execution_context_Value firstValue_context = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_context_Value();

			if (o_cast.getContext() != null) {
				addNewObjectToState(o_cast.getContext(), newState);
				firstValue_context
						.setContext(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast.getContext())));
			} else {
				firstValue_context.setContext(null);
			}

			tracedObject.getContextSequence().add(firstValue_context);
			newState.getExecution_context_Values().add(firstValue_context);

			// Creation of the first value of the field parameterValues
			umlTrace.States.Execution_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_parameterValues_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_parameterValues.getParameterValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
							o_cast.getParameterValues(), newState));

			tracedObject.getParameterValuesSequence().add(firstValue_parameterValues);
			newState.getExecution_parameterValues_Values().add(firstValue_parameterValues);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityFinalNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityFinalNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.InputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OutputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o_cast,
					newState);
		} else

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityNodeActivationGroup();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityNodeActivationGroups().add(tracedObject);

			// Creation of the first value of the field activityExecution
			umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value firstValue_activityExecution = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivationGroup_activityExecution_Value();

			if (o_cast.getActivityExecution() != null) {
				addNewObjectToState(o_cast.getActivityExecution(), newState);
				firstValue_activityExecution.setActivityExecution(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
								.get(o_cast.getActivityExecution())));
			} else {
				firstValue_activityExecution.setActivityExecution(null);
			}

			tracedObject.getActivityExecutionSequence().add(firstValue_activityExecution);
			newState.getActivityNodeActivationGroup_activityExecution_Values().add(firstValue_activityExecution);

			// Creation of the first value of the field edgeInstances
			umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value firstValue_edgeInstances = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivationGroup_edgeInstances_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getEdgeInstances()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_edgeInstances.getEdgeInstances()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getEdgeInstances(), newState));

			tracedObject.getEdgeInstancesSequence().add(firstValue_edgeInstances);
			newState.getActivityNodeActivationGroup_edgeInstances_Values().add(firstValue_edgeInstances);

			// Creation of the first value of the field nodeActivations
			umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value firstValue_nodeActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivationGroup_nodeActivations_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aValue : o_cast
					.getNodeActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_nodeActivations.getNodeActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation>) getExeToTraced(
							o_cast.getNodeActivations(), newState));

			tracedObject.getNodeActivationsSequence().add(firstValue_nodeActivations);
			newState.getActivityNodeActivationGroup_nodeActivations_Values().add(firstValue_nodeActivations);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityParameterNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityParameterNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field offeredTokenCount
			umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value firstValue_offeredTokenCount = umlTrace.States.StatesFactory.eINSTANCE
					.createObjectNodeActivation_offeredTokenCount_Value();

			firstValue_offeredTokenCount.setOfferedTokenCount(o_cast.getOfferedTokenCount());
			tracedObject.getOfferedTokenCountSequence().add(firstValue_offeredTokenCount);
			newState.getObjectNodeActivation_offeredTokenCount_Values().add(firstValue_offeredTokenCount);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory.eINSTANCE
					.createTracedAddStructuralFeatureValueActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActions_tracedAddStructuralFeatureValueActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.BooleanValue o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedBooleanValues().add(tracedObject);

			// Creation of the first value of the field value_BooleanValue
			umlTrace.States.BooleanValue_value_BooleanValue_Value firstValue_value_BooleanValue = umlTrace.States.StatesFactory.eINSTANCE
					.createBooleanValue_value_BooleanValue_Value();

			firstValue_value_BooleanValue.setValue_BooleanValue(o_cast.isValue_BooleanValue());
			tracedObject.getValue_BooleanValueSequence().add(firstValue_value_BooleanValue);
			newState.getBooleanValue_value_BooleanValue_Values().add(firstValue_value_BooleanValue);

			// Creation of the first value of the field type
			umlTrace.States.PrimitiveValue_type_Value firstValue_type = umlTrace.States.StatesFactory.eINSTANCE
					.createPrimitiveValue_type_Value();

			if (o_cast.getType() != null) {
				firstValue_type.setType(o_cast.getType());
			} else {
				firstValue_type.setType(null);
			}

			tracedObject.getTypeSequence().add(firstValue_type);
			newState.getPrimitiveValue_type_Values().add(firstValue_type);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.CallActionActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory.eINSTANCE
					.createTracedCallBehaviorActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActions_tracedCallBehaviorActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field callExecutions
			umlTrace.States.CallActionActivation_callExecutions_Value firstValue_callExecutions = umlTrace.States.StatesFactory.eINSTANCE
					.createCallActionActivation_callExecutions_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution aValue : o_cast.getCallExecutions()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_callExecutions.getCallExecutions()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution>) getExeToTraced(
							o_cast.getCallExecutions(), newState));

			tracedObject.getCallExecutionsSequence().add(firstValue_callExecutions);
			newState.getCallActionActivation_callExecutions_Values().add(firstValue_callExecutions);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.CompoundValue o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Object) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Object) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ControlToken o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedControlToken tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedControlTokens().add(tracedObject);

			// Creation of the first value of the field holder
			umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder.setHolder(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory.eINSTANCE
					.createTracedCreateObjectActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActions_tracedCreateObjectActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedDecisionNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedDecisionNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.eclipse.emf.ecore.EModelElement o_cast, umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.ElementConfiguration) {
			addNewObjectToState((fumlConfiguration.ElementConfiguration) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.ElementConfiguration o_cast, umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject = umlTrace.States.fumlConfiguration.FumlConfigurationFactory.eINSTANCE
					.createTracedElementConfiguration();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFumlConfiguration_tracedElementConfigurations().add(tracedObject);

			// Creation of the first value of the field semanticVisitor
			umlTrace.States.ElementConfiguration_semanticVisitor_Value firstValue_semanticVisitor = umlTrace.States.StatesFactory.eINSTANCE
					.createElementConfiguration_semanticVisitor_Value();

			for (fumlConfiguration.Loci.SemanticVisitor aValue : o_cast.getSemanticVisitor()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_semanticVisitor.getSemanticVisitor()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor>) getExeToTraced(
							o_cast.getSemanticVisitor(), newState));

			tracedObject.getSemanticVisitorSequence().add(firstValue_semanticVisitor);
			newState.getElementConfiguration_semanticVisitor_Values().add(firstValue_semanticVisitor);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Evaluation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Loci.ExecutionEnvironment o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedExecutionEnvironment();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLoci_tracedExecutionEnvironments().add(tracedObject);

			// Creation of the first value of the field locus_ExecutionEnvironment
			umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value firstValue_locus_ExecutionEnvironment = umlTrace.States.StatesFactory.eINSTANCE
					.createExecutionEnvironment_locus_ExecutionEnvironment_Value();

			if (o_cast.getLocus_ExecutionEnvironment() != null) {
				addNewObjectToState(o_cast.getLocus_ExecutionEnvironment(), newState);
				firstValue_locus_ExecutionEnvironment
						.setLocus_ExecutionEnvironment(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExecutionEnvironment())));
			} else {
				firstValue_locus_ExecutionEnvironment.setLocus_ExecutionEnvironment(null);
			}

			tracedObject.getLocus_ExecutionEnvironmentSequence().add(firstValue_locus_ExecutionEnvironment);
			newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values()
					.add(firstValue_locus_ExecutionEnvironment);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Loci.ExecutionFactory o_cast, umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedExecutionFactory();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLoci_tracedExecutionFactorys().add(tracedObject);

			// Creation of the first value of the field builtInTypes
			umlTrace.States.ExecutionFactory_builtInTypes_Value firstValue_builtInTypes = umlTrace.States.StatesFactory.eINSTANCE
					.createExecutionFactory_builtInTypes_Value();

			firstValue_builtInTypes.getBuiltInTypes()
					.addAll((Collection<? extends org.eclipse.uml2.uml.PrimitiveType>) o_cast.getBuiltInTypes());

			tracedObject.getBuiltInTypesSequence().add(firstValue_builtInTypes);
			newState.getExecutionFactory_builtInTypes_Values().add(firstValue_builtInTypes);

			// Creation of the first value of the field locus_ExecutionFactory
			umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value firstValue_locus_ExecutionFactory = umlTrace.States.StatesFactory.eINSTANCE
					.createExecutionFactory_locus_ExecutionFactory_Value();

			if (o_cast.getLocus_ExecutionFactory() != null) {
				addNewObjectToState(o_cast.getLocus_ExecutionFactory(), newState);
				firstValue_locus_ExecutionFactory
						.setLocus_ExecutionFactory(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExecutionFactory())));
			} else {
				firstValue_locus_ExecutionFactory.setLocus_ExecutionFactory(null);
			}

			tracedObject.getLocus_ExecutionFactorySequence().add(firstValue_locus_ExecutionFactory);
			newState.getExecutionFactory_locus_ExecutionFactory_Values().add(firstValue_locus_ExecutionFactory);

			// Creation of the first value of the field primitiveBehaviorPrototypes
			umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value firstValue_primitiveBehaviorPrototypes = umlTrace.States.StatesFactory.eINSTANCE
					.createExecutionFactory_primitiveBehaviorPrototypes_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aValue : o_cast
					.getPrimitiveBehaviorPrototypes()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_primitiveBehaviorPrototypes.getPrimitiveBehaviorPrototypes()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution>) getExeToTraced(
							o_cast.getPrimitiveBehaviorPrototypes(), newState));

			tracedObject.getPrimitiveBehaviorPrototypesSequence().add(firstValue_primitiveBehaviorPrototypes);
			newState.getExecutionFactory_primitiveBehaviorPrototypes_Values()
					.add(firstValue_primitiveBehaviorPrototypes);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Loci.Executor o_cast, umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Loci.TracedExecutor tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedExecutor();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLoci_tracedExecutors().add(tracedObject);

			// Creation of the first value of the field locus_Executor
			umlTrace.States.Executor_locus_Executor_Value firstValue_locus_Executor = umlTrace.States.StatesFactory.eINSTANCE
					.createExecutor_locus_Executor_Value();

			if (o_cast.getLocus_Executor() != null) {
				addNewObjectToState(o_cast.getLocus_Executor(), newState);
				firstValue_locus_Executor
						.setLocus_Executor(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_Executor())));
			} else {
				firstValue_locus_Executor.setLocus_Executor(null);
			}

			tracedObject.getLocus_ExecutorSequence().add(firstValue_locus_Executor);
			newState.getExecutor_locus_Executor_Values().add(firstValue_locus_Executor);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.ExtensionalValue o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Object) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Object) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.FeatureValue o_cast,
			umlTrace.States.State newState) {

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedForkNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedForkNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedForkedTokens().add(tracedObject);

			// Creation of the first value of the field baseToken
			umlTrace.States.ForkedToken_baseToken_Value firstValue_baseToken = umlTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_baseToken_Value();

			if (o_cast.getBaseToken() != null) {
				addNewObjectToState(o_cast.getBaseToken(), newState);
				firstValue_baseToken.setBaseToken(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
								.get(o_cast.getBaseToken())));
			} else {
				firstValue_baseToken.setBaseToken(null);
			}

			tracedObject.getBaseTokenSequence().add(firstValue_baseToken);
			newState.getForkedToken_baseToken_Values().add(firstValue_baseToken);

			// Creation of the first value of the field baseTokenIsWithdrawn
			umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value firstValue_baseTokenIsWithdrawn = umlTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_baseTokenIsWithdrawn_Value();

			firstValue_baseTokenIsWithdrawn.setBaseTokenIsWithdrawn(o_cast.isBaseTokenIsWithdrawn());
			tracedObject.getBaseTokenIsWithdrawnSequence().add(firstValue_baseTokenIsWithdrawn);
			newState.getForkedToken_baseTokenIsWithdrawn_Values().add(firstValue_baseTokenIsWithdrawn);

			// Creation of the first value of the field remainingOffersCount
			umlTrace.States.ForkedToken_remainingOffersCount_Value firstValue_remainingOffersCount = umlTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_remainingOffersCount_Value();

			firstValue_remainingOffersCount.setRemainingOffersCount(o_cast.getRemainingOffersCount());
			tracedObject.getRemainingOffersCountSequence().add(firstValue_remainingOffersCount);
			newState.getForkedToken_remainingOffersCount_Values().add(firstValue_remainingOffersCount);

			// Creation of the first value of the field holder
			umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder.setHolder(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedInitialNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedInitialNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Input.InputParameterValues o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject = umlTrace.States.fumlConfiguration.Input.InputFactory.eINSTANCE
					.createTracedInputParameterValues();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getInput_tracedInputParameterValuess().add(tracedObject);

			// Creation of the first value of the field name
			umlTrace.States.InputParameterValues_name_Value firstValue_name = umlTrace.States.StatesFactory.eINSTANCE
					.createInputParameterValues_name_Value();

			firstValue_name.setName(o_cast.getName());
			tracedObject.getNameSequence().add(firstValue_name);
			newState.getInputParameterValues_name_Values().add(firstValue_name);

			// Creation of the first value of the field parameterValues
			umlTrace.States.InputParameterValues_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
					.createInputParameterValues_parameterValues_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_parameterValues.getParameterValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
							o_cast.getParameterValues(), newState));

			tracedObject.getParameterValuesSequence().add(firstValue_parameterValues);
			newState.getInputParameterValues_parameterValues_Values().add(firstValue_parameterValues);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory.eINSTANCE
					.createTracedInputPinActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActions_tracedInputPinActivations().add(tracedObject);

			// Creation of the first value of the field actionActivation
			umlTrace.States.PinActivation_actionActivation_Value firstValue_actionActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createPinActivation_actionActivation_Value();

			if (o_cast.getActionActivation() != null) {
				addNewObjectToState(o_cast.getActionActivation(), newState);
				firstValue_actionActivation.setActionActivation(
						((umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) exeToTraced
								.get(o_cast.getActionActivation())));
			} else {
				firstValue_actionActivation.setActionActivation(null);
			}

			tracedObject.getActionActivationSequence().add(firstValue_actionActivation);
			newState.getPinActivation_actionActivation_Values().add(firstValue_actionActivation);

			// Creation of the first value of the field count_temp
			umlTrace.States.PinActivation_count_temp_Value firstValue_count_temp = umlTrace.States.StatesFactory.eINSTANCE
					.createPinActivation_count_temp_Value();

			firstValue_count_temp.setCount_temp(o_cast.getCount_temp());
			tracedObject.getCount_tempSequence().add(firstValue_count_temp);
			newState.getPinActivation_count_temp_Values().add(firstValue_count_temp);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field offeredTokenCount
			umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value firstValue_offeredTokenCount = umlTrace.States.StatesFactory.eINSTANCE
					.createObjectNodeActivation_offeredTokenCount_Value();

			firstValue_offeredTokenCount.setOfferedTokenCount(o_cast.getOfferedTokenCount());
			tracedObject.getOfferedTokenCountSequence().add(firstValue_offeredTokenCount);
			newState.getObjectNodeActivation_offeredTokenCount_Values().add(firstValue_offeredTokenCount);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution tracedObject = umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsFactory.eINSTANCE
					.createTracedIntegerGreaterFunctionBehaviorExecution();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions().add(tracedObject);

			// Creation of the first value of the field featureValues
			umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
					.createCompoundValue_featureValues_Value();

			for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_featureValues.getFeatureValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
							o_cast.getFeatureValues(), newState));

			tracedObject.getFeatureValuesSequence().add(firstValue_featureValues);
			newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

			// Creation of the first value of the field locus_ExtensionalValue
			umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
					.createExtensionalValue_locus_ExtensionalValue_Value();

			if (o_cast.getLocus_ExtensionalValue() != null) {
				addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
				firstValue_locus_ExtensionalValue
						.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExtensionalValue())));
			} else {
				firstValue_locus_ExtensionalValue.setLocus_ExtensionalValue(null);
			}

			tracedObject.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
			newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

			// Creation of the first value of the field types
			umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
					.createObject_types_Value();

			firstValue_types.getTypes().addAll((Collection<? extends org.eclipse.uml2.uml.Class>) o_cast.getTypes());

			tracedObject.getTypesSequence().add(firstValue_types);
			newState.getObject_types_Values().add(firstValue_types);

			// Creation of the first value of the field context
			umlTrace.States.Execution_context_Value firstValue_context = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_context_Value();

			if (o_cast.getContext() != null) {
				addNewObjectToState(o_cast.getContext(), newState);
				firstValue_context
						.setContext(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast.getContext())));
			} else {
				firstValue_context.setContext(null);
			}

			tracedObject.getContextSequence().add(firstValue_context);
			newState.getExecution_context_Values().add(firstValue_context);

			// Creation of the first value of the field parameterValues
			umlTrace.States.Execution_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_parameterValues_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_parameterValues.getParameterValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
							o_cast.getParameterValues(), newState));

			tracedObject.getParameterValuesSequence().add(firstValue_parameterValues);
			newState.getExecution_parameterValues_Values().add(firstValue_parameterValues);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution tracedObject = umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsFactory.eINSTANCE
					.createTracedIntegerLessFunctionBehaviorExecution();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions().add(tracedObject);

			// Creation of the first value of the field featureValues
			umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
					.createCompoundValue_featureValues_Value();

			for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_featureValues.getFeatureValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
							o_cast.getFeatureValues(), newState));

			tracedObject.getFeatureValuesSequence().add(firstValue_featureValues);
			newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

			// Creation of the first value of the field locus_ExtensionalValue
			umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
					.createExtensionalValue_locus_ExtensionalValue_Value();

			if (o_cast.getLocus_ExtensionalValue() != null) {
				addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
				firstValue_locus_ExtensionalValue
						.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExtensionalValue())));
			} else {
				firstValue_locus_ExtensionalValue.setLocus_ExtensionalValue(null);
			}

			tracedObject.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
			newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

			// Creation of the first value of the field types
			umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
					.createObject_types_Value();

			firstValue_types.getTypes().addAll((Collection<? extends org.eclipse.uml2.uml.Class>) o_cast.getTypes());

			tracedObject.getTypesSequence().add(firstValue_types);
			newState.getObject_types_Values().add(firstValue_types);

			// Creation of the first value of the field context
			umlTrace.States.Execution_context_Value firstValue_context = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_context_Value();

			if (o_cast.getContext() != null) {
				addNewObjectToState(o_cast.getContext(), newState);
				firstValue_context
						.setContext(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast.getContext())));
			} else {
				firstValue_context.setContext(null);
			}

			tracedObject.getContextSequence().add(firstValue_context);
			newState.getExecution_context_Values().add(firstValue_context);

			// Creation of the first value of the field parameterValues
			umlTrace.States.Execution_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_parameterValues_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_parameterValues.getParameterValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
							o_cast.getParameterValues(), newState));

			tracedObject.getParameterValuesSequence().add(firstValue_parameterValues);
			newState.getExecution_parameterValues_Values().add(firstValue_parameterValues);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution tracedObject = umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsFactory.eINSTANCE
					.createTracedIntegerPlusFunctionBehaviorExecution();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions().add(tracedObject);

			// Creation of the first value of the field featureValues
			umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
					.createCompoundValue_featureValues_Value();

			for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_featureValues.getFeatureValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
							o_cast.getFeatureValues(), newState));

			tracedObject.getFeatureValuesSequence().add(firstValue_featureValues);
			newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

			// Creation of the first value of the field locus_ExtensionalValue
			umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
					.createExtensionalValue_locus_ExtensionalValue_Value();

			if (o_cast.getLocus_ExtensionalValue() != null) {
				addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
				firstValue_locus_ExtensionalValue
						.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExtensionalValue())));
			} else {
				firstValue_locus_ExtensionalValue.setLocus_ExtensionalValue(null);
			}

			tracedObject.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
			newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

			// Creation of the first value of the field types
			umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
					.createObject_types_Value();

			firstValue_types.getTypes().addAll((Collection<? extends org.eclipse.uml2.uml.Class>) o_cast.getTypes());

			tracedObject.getTypesSequence().add(firstValue_types);
			newState.getObject_types_Values().add(firstValue_types);

			// Creation of the first value of the field context
			umlTrace.States.Execution_context_Value firstValue_context = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_context_Value();

			if (o_cast.getContext() != null) {
				addNewObjectToState(o_cast.getContext(), newState);
				firstValue_context
						.setContext(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast.getContext())));
			} else {
				firstValue_context.setContext(null);
			}

			tracedObject.getContextSequence().add(firstValue_context);
			newState.getExecution_context_Values().add(firstValue_context);

			// Creation of the first value of the field parameterValues
			umlTrace.States.Execution_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
					.createExecution_parameterValues_Value();

			for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_parameterValues.getParameterValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
							o_cast.getParameterValues(), newState));

			tracedObject.getParameterValuesSequence().add(firstValue_parameterValues);
			newState.getExecution_parameterValues_Values().add(firstValue_parameterValues);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.IntegerValue o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedIntegerValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedIntegerValues().add(tracedObject);

			// Creation of the first value of the field value_IntegerValue
			umlTrace.States.IntegerValue_value_IntegerValue_Value firstValue_value_IntegerValue = umlTrace.States.StatesFactory.eINSTANCE
					.createIntegerValue_value_IntegerValue_Value();

			firstValue_value_IntegerValue.setValue_IntegerValue(o_cast.getValue_IntegerValue());
			tracedObject.getValue_IntegerValueSequence().add(firstValue_value_IntegerValue);
			newState.getIntegerValue_value_IntegerValue_Values().add(firstValue_value_IntegerValue);

			// Creation of the first value of the field type
			umlTrace.States.PrimitiveValue_type_Value firstValue_type = umlTrace.States.StatesFactory.eINSTANCE
					.createPrimitiveValue_type_Value();

			if (o_cast.getType() != null) {
				firstValue_type.setType(o_cast.getType());
			} else {
				firstValue_type.setType(null);
			}

			tracedObject.getTypeSequence().add(firstValue_type);
			newState.getPrimitiveValue_type_Values().add(firstValue_type);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.InvocationActionActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedJoinNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedJoinNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedLiteralBooleanEvaluation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedLiteralBooleanEvaluations().add(tracedObject);

			// Creation of the first value of the field locus_Evaluation
			umlTrace.States.Evaluation_locus_Evaluation_Value firstValue_locus_Evaluation = umlTrace.States.StatesFactory.eINSTANCE
					.createEvaluation_locus_Evaluation_Value();

			if (o_cast.getLocus_Evaluation() != null) {
				addNewObjectToState(o_cast.getLocus_Evaluation(), newState);
				firstValue_locus_Evaluation
						.setLocus_Evaluation(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_Evaluation())));
			} else {
				firstValue_locus_Evaluation.setLocus_Evaluation(null);
			}

			tracedObject.getLocus_EvaluationSequence().add(firstValue_locus_Evaluation);
			newState.getEvaluation_locus_Evaluation_Values().add(firstValue_locus_Evaluation);

			// Creation of the first value of the field specification_Evaluation
			umlTrace.States.Evaluation_specification_Evaluation_Value firstValue_specification_Evaluation = umlTrace.States.StatesFactory.eINSTANCE
					.createEvaluation_specification_Evaluation_Value();

			if (o_cast.getSpecification_Evaluation() != null) {
				firstValue_specification_Evaluation.setSpecification_Evaluation(o_cast.getSpecification_Evaluation());
			} else {
				firstValue_specification_Evaluation.setSpecification_Evaluation(null);
			}

			tracedObject.getSpecification_EvaluationSequence().add(firstValue_specification_Evaluation);
			newState.getEvaluation_specification_Evaluation_Values().add(firstValue_specification_Evaluation);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.LiteralEvaluation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedLiteralIntegerEvaluation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedLiteralIntegerEvaluations().add(tracedObject);

			// Creation of the first value of the field locus_Evaluation
			umlTrace.States.Evaluation_locus_Evaluation_Value firstValue_locus_Evaluation = umlTrace.States.StatesFactory.eINSTANCE
					.createEvaluation_locus_Evaluation_Value();

			if (o_cast.getLocus_Evaluation() != null) {
				addNewObjectToState(o_cast.getLocus_Evaluation(), newState);
				firstValue_locus_Evaluation
						.setLocus_Evaluation(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_Evaluation())));
			} else {
				firstValue_locus_Evaluation.setLocus_Evaluation(null);
			}

			tracedObject.getLocus_EvaluationSequence().add(firstValue_locus_Evaluation);
			newState.getEvaluation_locus_Evaluation_Values().add(firstValue_locus_Evaluation);

			// Creation of the first value of the field specification_Evaluation
			umlTrace.States.Evaluation_specification_Evaluation_Value firstValue_specification_Evaluation = umlTrace.States.StatesFactory.eINSTANCE
					.createEvaluation_specification_Evaluation_Value();

			if (o_cast.getSpecification_Evaluation() != null) {
				firstValue_specification_Evaluation.setSpecification_Evaluation(o_cast.getSpecification_Evaluation());
			} else {
				firstValue_specification_Evaluation.setSpecification_Evaluation(null);
			}

			tracedObject.getSpecification_EvaluationSequence().add(firstValue_specification_Evaluation);
			newState.getEvaluation_specification_Evaluation_Values().add(firstValue_specification_Evaluation);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Loci.Locus o_cast, umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedLocus();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLoci_tracedLocuss().add(tracedObject);

			// Creation of the first value of the field executor
			umlTrace.States.Locus_executor_Value firstValue_executor = umlTrace.States.StatesFactory.eINSTANCE
					.createLocus_executor_Value();

			if (o_cast.getExecutor() != null) {
				addNewObjectToState(o_cast.getExecutor(), newState);
				firstValue_executor.setExecutor(((umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
						.get(o_cast.getExecutor())));
			} else {
				firstValue_executor.setExecutor(null);
			}

			tracedObject.getExecutorSequence().add(firstValue_executor);
			newState.getLocus_executor_Values().add(firstValue_executor);

			// Creation of the first value of the field extensionalValues
			umlTrace.States.Locus_extensionalValues_Value firstValue_extensionalValues = umlTrace.States.StatesFactory.eINSTANCE
					.createLocus_extensionalValues_Value();

			for (fumlConfiguration.Classes.Kernel.ExtensionalValue aValue : o_cast.getExtensionalValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_extensionalValues.getExtensionalValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue>) getExeToTraced(
							o_cast.getExtensionalValues(), newState));

			tracedObject.getExtensionalValuesSequence().add(firstValue_extensionalValues);
			newState.getLocus_extensionalValues_Values().add(firstValue_extensionalValues);

			// Creation of the first value of the field factory
			umlTrace.States.Locus_factory_Value firstValue_factory = umlTrace.States.StatesFactory.eINSTANCE
					.createLocus_factory_Value();

			if (o_cast.getFactory() != null) {
				addNewObjectToState(o_cast.getFactory(), newState);
				firstValue_factory
						.setFactory(((umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
								.get(o_cast.getFactory())));
			} else {
				firstValue_factory.setFactory(null);
			}

			tracedObject.getFactorySequence().add(firstValue_factory);
			newState.getLocus_factory_Values().add(firstValue_factory);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedMergeNodeActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedMergeNodeActivations().add(tracedObject);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Object o_cast, umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedObject();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedObjects().add(tracedObject);

			// Creation of the first value of the field featureValues
			umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
					.createCompoundValue_featureValues_Value();

			for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_featureValues.getFeatureValues()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
							o_cast.getFeatureValues(), newState));

			tracedObject.getFeatureValuesSequence().add(firstValue_featureValues);
			newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

			// Creation of the first value of the field locus_ExtensionalValue
			umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
					.createExtensionalValue_locus_ExtensionalValue_Value();

			if (o_cast.getLocus_ExtensionalValue() != null) {
				addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
				firstValue_locus_ExtensionalValue
						.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast.getLocus_ExtensionalValue())));
			} else {
				firstValue_locus_ExtensionalValue.setLocus_ExtensionalValue(null);
			}

			tracedObject.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
			newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

			// Creation of the first value of the field types
			umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
					.createObject_types_Value();

			firstValue_types.getTypes().addAll((Collection<? extends org.eclipse.uml2.uml.Class>) o_cast.getTypes());

			tracedObject.getTypesSequence().add(firstValue_types);
			newState.getObject_types_Values().add(firstValue_types);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.InputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OutputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedObjectToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedObjectTokens().add(tracedObject);

			// Creation of the first value of the field value
			umlTrace.States.ObjectToken_value_Value firstValue_value = umlTrace.States.StatesFactory.eINSTANCE
					.createObjectToken_value_Value();

			if (o_cast.getValue() != null) {
				addNewObjectToState(o_cast.getValue(), newState);
				firstValue_value.setValue(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue) exeToTraced
						.get(o_cast.getValue())));
			} else {
				firstValue_value.setValue(null);
			}

			tracedObject.getValueSequence().add(firstValue_value);
			newState.getObjectToken_value_Values().add(firstValue_value);

			// Creation of the first value of the field holder
			umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder.setHolder(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.Offer o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedOffers().add(tracedObject);

			// Creation of the first value of the field offeredTokens
			umlTrace.States.Offer_offeredTokens_Value firstValue_offeredTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createOffer_offeredTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getOfferedTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_offeredTokens.getOfferedTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getOfferedTokens(), newState));

			tracedObject.getOfferedTokensSequence().add(firstValue_offeredTokens);
			newState.getOffer_offeredTokens_Values().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory.eINSTANCE
					.createTracedOpaqueActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActions_tracedOpaqueActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory.eINSTANCE
					.createTracedOutputPinActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicActions_tracedOutputPinActivations().add(tracedObject);

			// Creation of the first value of the field actionActivation
			umlTrace.States.PinActivation_actionActivation_Value firstValue_actionActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createPinActivation_actionActivation_Value();

			if (o_cast.getActionActivation() != null) {
				addNewObjectToState(o_cast.getActionActivation(), newState);
				firstValue_actionActivation.setActionActivation(
						((umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) exeToTraced
								.get(o_cast.getActionActivation())));
			} else {
				firstValue_actionActivation.setActionActivation(null);
			}

			tracedObject.getActionActivationSequence().add(firstValue_actionActivation);
			newState.getPinActivation_actionActivation_Values().add(firstValue_actionActivation);

			// Creation of the first value of the field count_temp
			umlTrace.States.PinActivation_count_temp_Value firstValue_count_temp = umlTrace.States.StatesFactory.eINSTANCE
					.createPinActivation_count_temp_Value();

			firstValue_count_temp.setCount_temp(o_cast.getCount_temp());
			tracedObject.getCount_tempSequence().add(firstValue_count_temp);
			newState.getPinActivation_count_temp_Values().add(firstValue_count_temp);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field offeredTokenCount
			umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value firstValue_offeredTokenCount = umlTrace.States.StatesFactory.eINSTANCE
					.createObjectNodeActivation_offeredTokenCount_Value();

			firstValue_offeredTokenCount.setOfferedTokenCount(o_cast.getOfferedTokenCount());
			tracedObject.getOfferedTokenCountSequence().add(firstValue_offeredTokenCount);
			newState.getObjectNodeActivation_offeredTokenCount_Values().add(firstValue_offeredTokenCount);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject = umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory.eINSTANCE
					.createTracedParameterValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getBasicBehaviors_tracedParameterValues().add(tracedObject);

			// Creation of the first value of the field parameter_ParameterValue
			umlTrace.States.ParameterValue_parameter_ParameterValue_Value firstValue_parameter_ParameterValue = umlTrace.States.StatesFactory.eINSTANCE
					.createParameterValue_parameter_ParameterValue_Value();

			if (o_cast.getParameter_ParameterValue() != null) {
				firstValue_parameter_ParameterValue.setParameter_ParameterValue(o_cast.getParameter_ParameterValue());
			} else {
				firstValue_parameter_ParameterValue.setParameter_ParameterValue(null);
			}

			tracedObject.getParameter_ParameterValueSequence().add(firstValue_parameter_ParameterValue);
			newState.getParameterValue_parameter_ParameterValue_Values().add(firstValue_parameter_ParameterValue);

			// Creation of the first value of the field values_ParameterValue
			umlTrace.States.ParameterValue_values_ParameterValue_Value firstValue_values_ParameterValue = umlTrace.States.StatesFactory.eINSTANCE
					.createParameterValue_values_ParameterValue_Value();

			for (fumlConfiguration.Classes.Kernel.Value aValue : o_cast.getValues_ParameterValue()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_values_ParameterValue.getValues_ParameterValue()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue>) getExeToTraced(
							o_cast.getValues_ParameterValue(), newState));

			tracedObject.getValues_ParameterValueSequence().add(firstValue_values_ParameterValue);
			newState.getParameterValue_values_ParameterValue_Values().add(firstValue_values_ParameterValue);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Actions.BasicActions.PinActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.InputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OutputPinActivation) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.PrimitiveValue o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.BooleanValue) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.IntegerValue) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory.eINSTANCE
					.createTracedReadStructuralFeatureActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActions_tracedReadStructuralFeatureActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Reference o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedReference();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getKernel_tracedReferences().add(tracedObject);

			// Creation of the first value of the field referent
			umlTrace.States.Reference_referent_Value firstValue_referent = umlTrace.States.StatesFactory.eINSTANCE
					.createReference_referent_Value();

			if (o_cast.getReferent() != null) {
				addNewObjectToState(o_cast.getReferent(), newState);
				firstValue_referent
						.setReferent(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast.getReferent())));
			} else {
				firstValue_referent.setReferent(null);
			}

			tracedObject.getReferentSequence().add(firstValue_referent);
			newState.getReference_referent_Values().add(firstValue_referent);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Loci.SemanticVisitor o_cast, umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.InputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.OutputPinActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Reference) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Reference) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.BooleanValue) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
			addNewObjectToState(
					(fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
			addNewObjectToState((fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.IntegerValue) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Object) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Object) o_cast, newState);
		} else

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedSemanticVisitor();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getLoci_tracedSemanticVisitors().add(tracedObject);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.StructuredValue o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Reference) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Reference) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Object) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Object) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.Token o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ControlToken) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ControlToken) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o_cast, newState);
		} else

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActivities_tracedTokens().add(tracedObject);

			// Creation of the first value of the field holder
			umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder.setHolder(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Value o_cast, umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Reference) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Reference) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.BooleanValue) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			addNewObjectToState((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.IntegerValue) o_cast, newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
			addNewObjectToState(
					(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o_cast,
					newState);
		} else if (o_cast instanceof fumlConfiguration.Classes.Kernel.Object) {
			addNewObjectToState((fumlConfiguration.Classes.Kernel.Object) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast,
			umlTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation tracedObject = umlTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory.eINSTANCE
					.createTracedValueSpecificationActionActivation();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getIntermediateActions_tracedValueSpecificationActionActivations().add(tracedObject);

			// Creation of the first value of the field firing
			umlTrace.States.ActionActivation_firing_Value firstValue_firing = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_firing_Value();

			firstValue_firing.setFiring(o_cast.isFiring());
			tracedObject.getFiringSequence().add(firstValue_firing);
			newState.getActionActivation_firing_Values().add(firstValue_firing);

			// Creation of the first value of the field pinActivations
			umlTrace.States.ActionActivation_pinActivations_Value firstValue_pinActivations = umlTrace.States.StatesFactory.eINSTANCE
					.createActionActivation_pinActivations_Value();

			for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast.getPinActivations()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_pinActivations.getPinActivations()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
							o_cast.getPinActivations(), newState));

			tracedObject.getPinActivationsSequence().add(firstValue_pinActivations);
			newState.getActionActivation_pinActivations_Values().add(firstValue_pinActivations);

			// Creation of the first value of the field group_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_group_ActivityNodeActivation_Value();

			if (o_cast.getGroup_ActivityNodeActivation() != null) {
				addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
						((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast.getGroup_ActivityNodeActivation())));
			} else {
				firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(null);
			}

			tracedObject.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
			newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
					.add(firstValue_group_ActivityNodeActivation);

			// Creation of the first value of the field heldTokens
			umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_heldTokens_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

			// Creation of the first value of the field incomingEdges
			umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_incomingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getIncomingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_incomingEdges.getIncomingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getIncomingEdges(), newState));

			tracedObject.getIncomingEdgesSequence().add(firstValue_incomingEdges);
			newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

			// Creation of the first value of the field isRunning
			umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_isRunning_Value();

			firstValue_isRunning.setIsRunning(o_cast.isIsRunning());
			tracedObject.getIsRunningSequence().add(firstValue_isRunning);
			newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

			// Creation of the first value of the field node_ActivityNodeActivation
			umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_node_ActivityNodeActivation_Value();

			if (o_cast.getNode_ActivityNodeActivation() != null) {
				firstValue_node_ActivityNodeActivation
						.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
			} else {
				firstValue_node_ActivityNodeActivation.setNode_ActivityNodeActivation(null);
			}

			tracedObject.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
			newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
					.add(firstValue_node_ActivityNodeActivation);

			// Creation of the first value of the field outgoingEdges
			umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_outgoingEdges_Value();

			for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
					.getOutgoingEdges()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_outgoingEdges.getOutgoingEdges()
					.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
							o_cast.getOutgoingEdges(), newState));

			tracedObject.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
			newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

			// Creation of the first value of the field running
			umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
					.createActivityNodeActivation_running_Value();

			firstValue_running.setRunning(o_cast.isRunning());
			tracedObject.getRunningSequence().add(firstValue_running);
			newState.getActivityNodeActivation_running_Values().add(firstValue_running);

			// Creation of the first value of the field runtimeModelElement
			umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
					.createSemanticVisitor_runtimeModelElement_Value();

			if (o_cast.getRuntimeModelElement() != null) {
				addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
				firstValue_runtimeModelElement.setRuntimeModelElement(
						((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast.getRuntimeModelElement())));
			} else {
				firstValue_runtimeModelElement.setRuntimeModelElement(null);
			}

			tracedObject.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
			newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation o_cast,
			umlTrace.States.State newState) {

		if (o_cast instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
			addNewObjectToState(
					(fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o_cast,
					newState);
		}

	}// end addNewObjectToState

	private umlTrace.States.State copyState(umlTrace.States.State oldState) {
		umlTrace.States.State newState = umlTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getReference_referent_Values().addAll(oldState.getReference_referent_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getParameterValue_parameter_ParameterValue_Values()
				.addAll(oldState.getParameterValue_parameter_ParameterValue_Values());
		newState.getParameterValue_values_ParameterValue_Values()
				.addAll(oldState.getParameterValue_values_ParameterValue_Values());
		newState.getPinActivation_actionActivation_Values().addAll(oldState.getPinActivation_actionActivation_Values());
		newState.getPinActivation_count_temp_Values().addAll(oldState.getPinActivation_count_temp_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getObjectNodeActivation_offeredTokenCount_Values()
				.addAll(oldState.getObjectNodeActivation_offeredTokenCount_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getOffer_offeredTokens_Values().addAll(oldState.getOffer_offeredTokens_Values());
		newState.getObjectToken_value_Values().addAll(oldState.getObjectToken_value_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getLocus_executor_Values().addAll(oldState.getLocus_executor_Values());
		newState.getLocus_extensionalValues_Values().addAll(oldState.getLocus_extensionalValues_Values());
		newState.getLocus_factory_Values().addAll(oldState.getLocus_factory_Values());
		newState.getEvaluation_locus_Evaluation_Values().addAll(oldState.getEvaluation_locus_Evaluation_Values());
		newState.getEvaluation_specification_Evaluation_Values()
				.addAll(oldState.getEvaluation_specification_Evaluation_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getEvaluation_locus_Evaluation_Values().addAll(oldState.getEvaluation_locus_Evaluation_Values());
		newState.getEvaluation_specification_Evaluation_Values()
				.addAll(oldState.getEvaluation_specification_Evaluation_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getIntegerValue_value_IntegerValue_Values()
				.addAll(oldState.getIntegerValue_value_IntegerValue_Values());
		newState.getPrimitiveValue_type_Values().addAll(oldState.getPrimitiveValue_type_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getExecution_context_Values().addAll(oldState.getExecution_context_Values());
		newState.getExecution_parameterValues_Values().addAll(oldState.getExecution_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getExecution_context_Values().addAll(oldState.getExecution_context_Values());
		newState.getExecution_parameterValues_Values().addAll(oldState.getExecution_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getExecution_context_Values().addAll(oldState.getExecution_context_Values());
		newState.getExecution_parameterValues_Values().addAll(oldState.getExecution_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getPinActivation_actionActivation_Values().addAll(oldState.getPinActivation_actionActivation_Values());
		newState.getPinActivation_count_temp_Values().addAll(oldState.getPinActivation_count_temp_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getObjectNodeActivation_offeredTokenCount_Values()
				.addAll(oldState.getObjectNodeActivation_offeredTokenCount_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getInputParameterValues_name_Values().addAll(oldState.getInputParameterValues_name_Values());
		newState.getInputParameterValues_parameterValues_Values()
				.addAll(oldState.getInputParameterValues_parameterValues_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getForkedToken_baseToken_Values().addAll(oldState.getForkedToken_baseToken_Values());
		newState.getForkedToken_baseTokenIsWithdrawn_Values()
				.addAll(oldState.getForkedToken_baseTokenIsWithdrawn_Values());
		newState.getForkedToken_remainingOffersCount_Values()
				.addAll(oldState.getForkedToken_remainingOffersCount_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getExecutor_locus_Executor_Values().addAll(oldState.getExecutor_locus_Executor_Values());
		newState.getExecutionFactory_builtInTypes_Values().addAll(oldState.getExecutionFactory_builtInTypes_Values());
		newState.getExecutionFactory_locus_ExecutionFactory_Values()
				.addAll(oldState.getExecutionFactory_locus_ExecutionFactory_Values());
		newState.getExecutionFactory_primitiveBehaviorPrototypes_Values()
				.addAll(oldState.getExecutionFactory_primitiveBehaviorPrototypes_Values());
		newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values()
				.addAll(oldState.getExecutionEnvironment_locus_ExecutionEnvironment_Values());
		newState.getElementConfiguration_semanticVisitor_Values()
				.addAll(oldState.getElementConfiguration_semanticVisitor_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getCallActionActivation_callExecutions_Values()
				.addAll(oldState.getCallActionActivation_callExecutions_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getBooleanValue_value_BooleanValue_Values()
				.addAll(oldState.getBooleanValue_value_BooleanValue_Values());
		newState.getPrimitiveValue_type_Values().addAll(oldState.getPrimitiveValue_type_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActionActivation_firing_Values().addAll(oldState.getActionActivation_firing_Values());
		newState.getActionActivation_pinActivations_Values()
				.addAll(oldState.getActionActivation_pinActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getObjectNodeActivation_offeredTokenCount_Values()
				.addAll(oldState.getObjectNodeActivation_offeredTokenCount_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityNodeActivationGroup_activityExecution_Values()
				.addAll(oldState.getActivityNodeActivationGroup_activityExecution_Values());
		newState.getActivityNodeActivationGroup_edgeInstances_Values()
				.addAll(oldState.getActivityNodeActivationGroup_edgeInstances_Values());
		newState.getActivityNodeActivationGroup_nodeActivations_Values()
				.addAll(oldState.getActivityNodeActivationGroup_nodeActivations_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityExecution_activationGroup_Values()
				.addAll(oldState.getActivityExecution_activationGroup_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getExecution_context_Values().addAll(oldState.getExecution_context_Values());
		newState.getExecution_parameterValues_Values().addAll(oldState.getExecution_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
				.addAll(oldState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values());
		newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
				.addAll(oldState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values());
		newState.getActivityEdgeInstance_offers_Values().addAll(oldState.getActivityEdgeInstance_offers_Values());
		newState.getActivityEdgeInstance_source_Values().addAll(oldState.getActivityEdgeInstance_source_Values());
		newState.getActivityEdgeInstance_target_Values().addAll(oldState.getActivityEdgeInstance_target_Values());
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(Set<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			umlTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// We only look at constructable objects that have mutable fields
				// Here we have nothing to rollback, just a new object to add
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange) {
					stateChanged = true;
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
						fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
						fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.OutputPinActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
						fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
						fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.InputPinActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;
						addNewObjectToState(o_cast, newState);
					}
				}
				// We only look at constructable objects that have mutable fields
				// Here we must rollback to remove the values of the removed object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
								.get(o_cast);
						newState.getIntegerValue_value_IntegerValue_Values()
								.remove(traced.getValue_IntegerValueSequence()
										.get(traced.getValue_IntegerValueSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
								.get(o_cast);
						newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
								.remove(traced.getEdge_ActivityEdgeInstanceSequence()
										.get(traced.getEdge_ActivityEdgeInstanceSequence().size() - 1));
						newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
								.remove(traced.getGroup_ActivityEdgeInstanceSequence()
										.get(traced.getGroup_ActivityEdgeInstanceSequence().size() - 1));
						newState.getActivityEdgeInstance_offers_Values()
								.remove(traced.getOffersSequence().get(traced.getOffersSequence().size() - 1));
						newState.getActivityEdgeInstance_source_Values()
								.remove(traced.getSourceSequence().get(traced.getSourceSequence().size() - 1));
						newState.getActivityEdgeInstance_target_Values()
								.remove(traced.getTargetSequence().get(traced.getTargetSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue traced = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
								.get(o_cast);
						newState.getParameterValue_parameter_ParameterValue_Values()
								.remove(traced.getParameter_ParameterValueSequence()
										.get(traced.getParameter_ParameterValueSequence().size() - 1));
						newState.getParameterValue_values_ParameterValue_Values()
								.remove(traced.getValues_ParameterValueSequence()
										.get(traced.getValues_ParameterValueSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast);
						newState.getLocus_extensionalValues_Values().remove(traced.getExtensionalValuesSequence()
								.get(traced.getExtensionalValuesSequence().size() - 1));
						newState.getLocus_executor_Values()
								.remove(traced.getExecutorSequence().get(traced.getExecutorSequence().size() - 1));
						newState.getLocus_factory_Values()
								.remove(traced.getFactorySequence().get(traced.getFactorySequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
								.get(o_cast);
						newState.getObjectToken_value_Values()
								.remove(traced.getValueSequence().get(traced.getValueSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
								.get(o_cast);
						newState.getExecutionFactory_locus_ExecutionFactory_Values()
								.remove(traced.getLocus_ExecutionFactorySequence()
										.get(traced.getLocus_ExecutionFactorySequence().size() - 1));
						newState.getExecutionFactory_primitiveBehaviorPrototypes_Values()
								.remove(traced.getPrimitiveBehaviorPrototypesSequence()
										.get(traced.getPrimitiveBehaviorPrototypesSequence().size() - 1));
						newState.getExecutionFactory_builtInTypes_Values().remove(
								traced.getBuiltInTypesSequence().get(traced.getBuiltInTypesSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;
						umlTrace.States.fumlConfiguration.Loci.TracedExecutor traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
								.get(o_cast);
						newState.getExecutor_locus_Executor_Values().remove(
								traced.getLocus_ExecutorSequence().get(traced.getLocus_ExecutorSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
								.get(o_cast);
						newState.getActivityExecution_activationGroup_Values().remove(traced
								.getActivationGroupSequence().get(traced.getActivationGroupSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
								.get(o_cast);
						newState.getBooleanValue_value_BooleanValue_Values()
								.remove(traced.getValue_BooleanValueSequence()
										.get(traced.getValue_BooleanValueSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer) exeToTraced
								.get(o_cast);
						newState.getOffer_offeredTokens_Values().remove(
								traced.getOfferedTokensSequence().get(traced.getOfferedTokensSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
								.get(o_cast);
						newState.getReference_referent_Values()
								.remove(traced.getReferentSequence().get(traced.getReferentSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast);
						newState.getActivityNodeActivationGroup_activityExecution_Values().remove(traced
								.getActivityExecutionSequence().get(traced.getActivityExecutionSequence().size() - 1));
						newState.getActivityNodeActivationGroup_edgeInstances_Values().remove(
								traced.getEdgeInstancesSequence().get(traced.getEdgeInstancesSequence().size() - 1));
						newState.getActivityNodeActivationGroup_nodeActivations_Values().remove(traced
								.getNodeActivationsSequence().get(traced.getNodeActivationsSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
						fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
						fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.OutputPinActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;
						umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment) exeToTraced
								.get(o_cast);
						newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values()
								.remove(traced.getLocus_ExecutionEnvironmentSequence()
										.get(traced.getLocus_ExecutionEnvironmentSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
						fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues traced = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
								.get(o_cast);
						newState.getInputParameterValues_parameterValues_Values().remove(traced
								.getParameterValuesSequence().get(traced.getParameterValuesSequence().size() - 1));
						newState.getInputParameterValues_name_Values()
								.remove(traced.getNameSequence().get(traced.getNameSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast);
						newState.getObject_types_Values()
								.remove(traced.getTypesSequence().get(traced.getTypesSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
								.get(o_cast);
						newState.getForkedToken_baseToken_Values()
								.remove(traced.getBaseTokenSequence().get(traced.getBaseTokenSequence().size() - 1));
						newState.getForkedToken_remainingOffersCount_Values()
								.remove(traced.getRemainingOffersCountSequence()
										.get(traced.getRemainingOffersCountSequence().size() - 1));
						newState.getForkedToken_baseTokenIsWithdrawn_Values()
								.remove(traced.getBaseTokenIsWithdrawnSequence()
										.get(traced.getBaseTokenIsWithdrawnSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
								.get(o_cast);
						newState.getToken_holder_Values()
								.remove(traced.getHolderSequence().get(traced.getHolderSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
						fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.InputPinActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
								.get(o_cast);
					}
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast);
						newState.getActivityNodeActivation_heldTokens_Values()
								.remove(traced.getHeldTokensSequence().get(traced.getHeldTokensSequence().size() - 1));
						newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
								.remove(traced.getGroup_ActivityNodeActivationSequence()
										.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1));
						newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
								.remove(traced.getNode_ActivityNodeActivationSequence()
										.get(traced.getNode_ActivityNodeActivationSequence().size() - 1));
						newState.getActivityNodeActivation_incomingEdges_Values().remove(
								traced.getIncomingEdgesSequence().get(traced.getIncomingEdgesSequence().size() - 1));
						newState.getActivityNodeActivation_outgoingEdges_Values().remove(
								traced.getOutgoingEdgesSequence().get(traced.getOutgoingEdgesSequence().size() - 1));
						newState.getActivityNodeActivation_running_Values()
								.remove(traced.getRunningSequence().get(traced.getRunningSequence().size() - 1));
						newState.getActivityNodeActivation_isRunning_Values()
								.remove(traced.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1));
					}
					if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;
						umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor traced = (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor) exeToTraced
								.get(o_cast);
						newState.getSemanticVisitor_runtimeModelElement_Values()
								.remove(traced.getRuntimeModelElementSequence()
										.get(traced.getRuntimeModelElementSequence().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Edge_ActivityEdgeInstance().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value lastValue = traced
									.getEdge_ActivityEdgeInstanceSequence()
									.get(traced.getEdge_ActivityEdgeInstanceSequence().size() - 1);
							newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_edge_ActivityEdgeInstance_Value();
							newValue.setEdge_ActivityEdgeInstance(o_cast.getEdge_ActivityEdgeInstance());
							traced.getEdge_ActivityEdgeInstanceSequence().add(newValue);
							newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Group_ActivityEdgeInstance().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value lastValue = traced
									.getGroup_ActivityEdgeInstanceSequence()
									.get(traced.getGroup_ActivityEdgeInstanceSequence().size() - 1);
							newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityEdgeInstance(), newState);
							umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_group_ActivityEdgeInstance_Value();
							newValue.setGroup_ActivityEdgeInstance(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityEdgeInstance())));
							traced.getGroup_ActivityEdgeInstanceSequence().add(newValue);
							newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Source().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_source_Value lastValue = traced.getSourceSequence()
									.get(traced.getSourceSequence().size() - 1);
							newState.getActivityEdgeInstance_source_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getSource(), newState);
							umlTrace.States.ActivityEdgeInstance_source_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_source_Value();
							newValue.setSource(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getSource())));
							traced.getSourceSequence().add(newValue);
							newState.getActivityEdgeInstance_source_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Target().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_target_Value lastValue = traced.getTargetSequence()
									.get(traced.getTargetSequence().size() - 1);
							newState.getActivityEdgeInstance_target_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getTarget(), newState);
							umlTrace.States.ActivityEdgeInstance_target_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_target_Value();
							newValue.setTarget(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getTarget())));
							traced.getTargetSequence().add(newValue);
							newState.getActivityEdgeInstance_target_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_Context().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.Execution_context_Value lastValue = traced.getContextSequence()
									.get(traced.getContextSequence().size() - 1);
							newState.getExecution_context_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getContext(), newState);
							umlTrace.States.Execution_context_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecution_context_Value();
							newValue.setContext(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getContext())));
							traced.getContextSequence().add(newValue);
							newState.getExecution_context_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityExecution_ActivationGroup().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.ActivityExecution_activationGroup_Value lastValue = traced
									.getActivationGroupSequence().get(traced.getActivationGroupSequence().size() - 1);
							newState.getActivityExecution_activationGroup_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getActivationGroup(), newState);
							umlTrace.States.ActivityExecution_activationGroup_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityExecution_activationGroup_Value();
							newValue.setActivationGroup(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getActivationGroup())));
							traced.getActivationGroupSequence().add(newValue);
							newState.getActivityExecution_activationGroup_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_ActivityExecution().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value lastValue = traced
									.getActivityExecutionSequence()
									.get(traced.getActivityExecutionSequence().size() - 1);
							newState.getActivityNodeActivationGroup_activityExecution_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getActivityExecution(), newState);
							umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivationGroup_activityExecution_Value();
							newValue.setActivityExecution(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
											.get(o_cast.getActivityExecution())));
							traced.getActivityExecutionSequence().add(newValue);
							newState.getActivityNodeActivationGroup_activityExecution_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation_OfferedTokenCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value lastValue = traced
									.getOfferedTokenCountSequence()
									.get(traced.getOfferedTokenCountSequence().size() - 1);
							newState.getObjectNodeActivation_offeredTokenCount_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createObjectNodeActivation_offeredTokenCount_Value();
							newValue.setOfferedTokenCount(o_cast.getOfferedTokenCount());
							traced.getOfferedTokenCountSequence().add(newValue);
							newState.getObjectNodeActivation_offeredTokenCount_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue_Value_BooleanValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.BooleanValue_value_BooleanValue_Value lastValue = traced
									.getValue_BooleanValueSequence()
									.get(traced.getValue_BooleanValueSequence().size() - 1);
							newState.getBooleanValue_value_BooleanValue_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.BooleanValue_value_BooleanValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createBooleanValue_value_BooleanValue_Value();
							newValue.setValue_BooleanValue(o_cast.isValue_BooleanValue());
							traced.getValue_BooleanValueSequence().add(newValue);
							newState.getBooleanValue_value_BooleanValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue_Type().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.PrimitiveValue_type_Value lastValue = traced.getTypeSequence()
									.get(traced.getTypeSequence().size() - 1);
							newState.getPrimitiveValue_type_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.PrimitiveValue_type_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPrimitiveValue_type_Value();
							newValue.setType(o_cast.getType());
							traced.getTypeSequence().add(newValue);
							newState.getPrimitiveValue_type_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
						fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ControlToken) {
						fumlConfiguration.Activities.IntermediateActivities.ControlToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ControlToken) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedControlToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedControlToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionEnvironment_Locus_ExecutionEnvironment().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment) exeToTraced
									.get(o);
							umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value lastValue = traced
									.getLocus_ExecutionEnvironmentSequence()
									.get(traced.getLocus_ExecutionEnvironmentSequence().size() - 1);
							newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExecutionEnvironment(), newState);
							umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutionEnvironment_locus_ExecutionEnvironment_Value();
							newValue.setLocus_ExecutionEnvironment(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExecutionEnvironment())));
							traced.getLocus_ExecutionEnvironmentSequence().add(newValue);
							newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_Locus_ExecutionFactory().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
									.get(o);
							umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value lastValue = traced
									.getLocus_ExecutionFactorySequence()
									.get(traced.getLocus_ExecutionFactorySequence().size() - 1);
							newState.getExecutionFactory_locus_ExecutionFactory_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExecutionFactory(), newState);
							umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutionFactory_locus_ExecutionFactory_Value();
							newValue.setLocus_ExecutionFactory(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExecutionFactory())));
							traced.getLocus_ExecutionFactorySequence().add(newValue);
							newState.getExecutionFactory_locus_ExecutionFactory_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutor_Locus_Executor().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutor traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
									.get(o);
							umlTrace.States.Executor_locus_Executor_Value lastValue = traced.getLocus_ExecutorSequence()
									.get(traced.getLocus_ExecutorSequence().size() - 1);
							newState.getExecutor_locus_Executor_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_Executor(), newState);
							umlTrace.States.Executor_locus_Executor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutor_locus_Executor_Value();
							newValue.setLocus_Executor(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o_cast.getLocus_Executor())));
							traced.getLocus_ExecutorSequence().add(newValue);
							newState.getExecutor_locus_Executor_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_BaseToken().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_baseToken_Value lastValue = traced.getBaseTokenSequence()
									.get(traced.getBaseTokenSequence().size() - 1);
							newState.getForkedToken_baseToken_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getBaseToken(), newState);
							umlTrace.States.ForkedToken_baseToken_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseToken_Value();
							newValue.setBaseToken(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
											.get(o_cast.getBaseToken())));
							traced.getBaseTokenSequence().add(newValue);
							newState.getForkedToken_baseToken_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_RemainingOffersCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_remainingOffersCount_Value lastValue = traced
									.getRemainingOffersCountSequence()
									.get(traced.getRemainingOffersCountSequence().size() - 1);
							newState.getForkedToken_remainingOffersCount_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ForkedToken_remainingOffersCount_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_remainingOffersCount_Value();
							newValue.setRemainingOffersCount(o_cast.getRemainingOffersCount());
							traced.getRemainingOffersCountSequence().add(newValue);
							newState.getForkedToken_remainingOffersCount_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_BaseTokenIsWithdrawn().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value lastValue = traced
									.getBaseTokenIsWithdrawnSequence()
									.get(traced.getBaseTokenIsWithdrawnSequence().size() - 1);
							newState.getForkedToken_baseTokenIsWithdrawn_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseTokenIsWithdrawn_Value();
							newValue.setBaseTokenIsWithdrawn(o_cast.isBaseTokenIsWithdrawn());
							traced.getBaseTokenIsWithdrawnSequence().add(newValue);
							newState.getForkedToken_baseTokenIsWithdrawn_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;

						if (p.getFeatureID() == fumlConfiguration.Input.InputPackage.eINSTANCE
								.getInputParameterValues_Name().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues traced = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
									.get(o);
							umlTrace.States.InputParameterValues_name_Value lastValue = traced.getNameSequence()
									.get(traced.getNameSequence().size() - 1);
							newState.getInputParameterValues_name_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.InputParameterValues_name_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createInputParameterValues_name_Value();
							newValue.setName(o_cast.getName());
							traced.getNameSequence().add(newValue);
							newState.getInputParameterValues_name_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
						fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.InputPinActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation_OfferedTokenCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value lastValue = traced
									.getOfferedTokenCountSequence()
									.get(traced.getOfferedTokenCountSequence().size() - 1);
							newState.getObjectNodeActivation_offeredTokenCount_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createObjectNodeActivation_offeredTokenCount_Value();
							newValue.setOfferedTokenCount(o_cast.getOfferedTokenCount());
							traced.getOfferedTokenCountSequence().add(newValue);
							newState.getObjectNodeActivation_offeredTokenCount_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation_Count_temp().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.PinActivation_count_temp_Value lastValue = traced.getCount_tempSequence()
									.get(traced.getCount_tempSequence().size() - 1);
							newState.getPinActivation_count_temp_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.PinActivation_count_temp_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPinActivation_count_temp_Value();
							newValue.setCount_temp(o_cast.getCount_temp());
							traced.getCount_tempSequence().add(newValue);
							newState.getPinActivation_count_temp_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation_ActionActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.PinActivation_actionActivation_Value lastValue = traced
									.getActionActivationSequence().get(traced.getActionActivationSequence().size() - 1);
							newState.getPinActivation_actionActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getActionActivation(), newState);
							umlTrace.States.PinActivation_actionActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPinActivation_actionActivation_Value();
							newValue.setActionActivation(
									((umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) exeToTraced
											.get(o_cast.getActionActivation())));
							traced.getActionActivationSequence().add(newValue);
							newState.getPinActivation_actionActivation_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_Context().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.Execution_context_Value lastValue = traced.getContextSequence()
									.get(traced.getContextSequence().size() - 1);
							newState.getExecution_context_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getContext(), newState);
							umlTrace.States.Execution_context_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecution_context_Value();
							newValue.setContext(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getContext())));
							traced.getContextSequence().add(newValue);
							newState.getExecution_context_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_Context().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.Execution_context_Value lastValue = traced.getContextSequence()
									.get(traced.getContextSequence().size() - 1);
							newState.getExecution_context_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getContext(), newState);
							umlTrace.States.Execution_context_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecution_context_Value();
							newValue.setContext(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getContext())));
							traced.getContextSequence().add(newValue);
							newState.getExecution_context_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_Context().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution traced = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution) exeToTraced
									.get(o);
							umlTrace.States.Execution_context_Value lastValue = traced.getContextSequence()
									.get(traced.getContextSequence().size() - 1);
							newState.getExecution_context_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getContext(), newState);
							umlTrace.States.Execution_context_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecution_context_Value();
							newValue.setContext(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getContext())));
							traced.getContextSequence().add(newValue);
							newState.getExecution_context_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_ExtensionalValue(), newState);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue_Value_IntegerValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.IntegerValue_value_IntegerValue_Value lastValue = traced
									.getValue_IntegerValueSequence()
									.get(traced.getValue_IntegerValueSequence().size() - 1);
							newState.getIntegerValue_value_IntegerValue_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.IntegerValue_value_IntegerValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createIntegerValue_value_IntegerValue_Value();
							newValue.setValue_IntegerValue(o_cast.getValue_IntegerValue());
							traced.getValue_IntegerValueSequence().add(newValue);
							newState.getIntegerValue_value_IntegerValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue_Type().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.PrimitiveValue_type_Value lastValue = traced.getTypeSequence()
									.get(traced.getTypeSequence().size() - 1);
							newState.getPrimitiveValue_type_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.PrimitiveValue_type_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPrimitiveValue_type_Value();
							newValue.setType(o_cast.getType());
							traced.getTypeSequence().add(newValue);
							newState.getPrimitiveValue_type_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getEvaluation_Locus_Evaluation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation) exeToTraced
									.get(o);
							umlTrace.States.Evaluation_locus_Evaluation_Value lastValue = traced
									.getLocus_EvaluationSequence().get(traced.getLocus_EvaluationSequence().size() - 1);
							newState.getEvaluation_locus_Evaluation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_Evaluation(), newState);
							umlTrace.States.Evaluation_locus_Evaluation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createEvaluation_locus_Evaluation_Value();
							newValue.setLocus_Evaluation(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_Evaluation())));
							traced.getLocus_EvaluationSequence().add(newValue);
							newState.getEvaluation_locus_Evaluation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getEvaluation_Specification_Evaluation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation) exeToTraced
									.get(o);
							umlTrace.States.Evaluation_specification_Evaluation_Value lastValue = traced
									.getSpecification_EvaluationSequence()
									.get(traced.getSpecification_EvaluationSequence().size() - 1);
							newState.getEvaluation_specification_Evaluation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.Evaluation_specification_Evaluation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createEvaluation_specification_Evaluation_Value();
							newValue.setSpecification_Evaluation(o_cast.getSpecification_Evaluation());
							traced.getSpecification_EvaluationSequence().add(newValue);
							newState.getEvaluation_specification_Evaluation_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) {
						fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation o_cast = (fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getEvaluation_Locus_Evaluation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation) exeToTraced
									.get(o);
							umlTrace.States.Evaluation_locus_Evaluation_Value lastValue = traced
									.getLocus_EvaluationSequence().get(traced.getLocus_EvaluationSequence().size() - 1);
							newState.getEvaluation_locus_Evaluation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getLocus_Evaluation(), newState);
							umlTrace.States.Evaluation_locus_Evaluation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createEvaluation_locus_Evaluation_Value();
							newValue.setLocus_Evaluation(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_Evaluation())));
							traced.getLocus_EvaluationSequence().add(newValue);
							newState.getEvaluation_locus_Evaluation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getEvaluation_Specification_Evaluation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation) exeToTraced
									.get(o);
							umlTrace.States.Evaluation_specification_Evaluation_Value lastValue = traced
									.getSpecification_EvaluationSequence()
									.get(traced.getSpecification_EvaluationSequence().size() - 1);
							newState.getEvaluation_specification_Evaluation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.Evaluation_specification_Evaluation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createEvaluation_specification_Evaluation_Value();
							newValue.setSpecification_Evaluation(o_cast.getSpecification_Evaluation());
							traced.getSpecification_EvaluationSequence().add(newValue);
							newState.getEvaluation_specification_Evaluation_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus_Executor()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o);
							umlTrace.States.Locus_executor_Value lastValue = traced.getExecutorSequence()
									.get(traced.getExecutorSequence().size() - 1);
							newState.getLocus_executor_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getExecutor(), newState);
							umlTrace.States.Locus_executor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createLocus_executor_Value();
							newValue.setExecutor(((umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
									.get(o_cast.getExecutor())));
							traced.getExecutorSequence().add(newValue);
							newState.getLocus_executor_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus_Factory()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o);
							umlTrace.States.Locus_factory_Value lastValue = traced.getFactorySequence()
									.get(traced.getFactorySequence().size() - 1);
							newState.getLocus_factory_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getFactory(), newState);
							umlTrace.States.Locus_factory_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createLocus_factory_Value();
							newValue.setFactory(
									((umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
											.get(o_cast.getFactory())));
							traced.getFactorySequence().add(newValue);
							newState.getLocus_factory_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
									.get(o);
							umlTrace.States.ObjectToken_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getObjectToken_value_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getValue(), newState);
							umlTrace.States.ObjectToken_value_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createObjectToken_value_Value();
							newValue.setValue(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue) exeToTraced
											.get(o_cast.getValue())));
							traced.getValueSequence().add(newValue);
							newState.getObjectToken_value_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
						fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
						fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.OutputPinActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation_OfferedTokenCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value lastValue = traced
									.getOfferedTokenCountSequence()
									.get(traced.getOfferedTokenCountSequence().size() - 1);
							newState.getObjectNodeActivation_offeredTokenCount_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createObjectNodeActivation_offeredTokenCount_Value();
							newValue.setOfferedTokenCount(o_cast.getOfferedTokenCount());
							traced.getOfferedTokenCountSequence().add(newValue);
							newState.getObjectNodeActivation_offeredTokenCount_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation_Count_temp().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.PinActivation_count_temp_Value lastValue = traced.getCount_tempSequence()
									.get(traced.getCount_tempSequence().size() - 1);
							newState.getPinActivation_count_temp_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.PinActivation_count_temp_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPinActivation_count_temp_Value();
							newValue.setCount_temp(o_cast.getCount_temp());
							traced.getCount_tempSequence().add(newValue);
							newState.getPinActivation_count_temp_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation_ActionActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation traced = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
									.get(o);
							umlTrace.States.PinActivation_actionActivation_Value lastValue = traced
									.getActionActivationSequence().get(traced.getActionActivationSequence().size() - 1);
							newState.getPinActivation_actionActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getActionActivation(), newState);
							umlTrace.States.PinActivation_actionActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPinActivation_actionActivation_Value();
							newValue.setActionActivation(
									((umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) exeToTraced
											.get(o_cast.getActionActivation())));
							traced.getActionActivationSequence().add(newValue);
							newState.getPinActivation_actionActivation_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getParameterValue_Parameter_ParameterValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue traced = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
									.get(o);
							umlTrace.States.ParameterValue_parameter_ParameterValue_Value lastValue = traced
									.getParameter_ParameterValueSequence()
									.get(traced.getParameter_ParameterValueSequence().size() - 1);
							newState.getParameterValue_parameter_ParameterValue_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ParameterValue_parameter_ParameterValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createParameterValue_parameter_ParameterValue_Value();
							newValue.setParameter_ParameterValue(o_cast.getParameter_ParameterValue());
							traced.getParameter_ParameterValueSequence().add(newValue);
							newState.getParameterValue_parameter_ParameterValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference_Referent().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
									.get(o);
							umlTrace.States.Reference_referent_Value lastValue = traced.getReferentSequence()
									.get(traced.getReferentSequence().size() - 1);
							newState.getReference_referent_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getReferent(), newState);
							umlTrace.States.Reference_referent_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createReference_referent_Value();
							newValue.setReferent(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getReferent())));
							traced.getReferentSequence().add(newValue);
							newState.getReference_referent_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_Firing().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActionActivation_firing_Value lastValue = traced.getFiringSequence()
									.get(traced.getFiringSequence().size() - 1);
							newState.getActionActivation_firing_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActionActivation_firing_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActionActivation_firing_Value();
							newValue.setFiring(o_cast.isFiring());
							traced.getFiringSequence().add(newValue);
							newState.getActionActivation_firing_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation traced = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getGroup_ActivityNodeActivation(), newState);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(o_cast.getNode_ActivityNodeActivation());
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor traced = (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getRuntimeModelElement(), newState);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Offers().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityEdgeInstance_offers_Value> valueSequence = tracedObject
									.getOffersSequence();
							umlTrace.States.ActivityEdgeInstance_offers_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Offer aValue : o_cast
									.getOffers()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOffers().size() == o_cast.getOffers().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Offer> it = o_cast
											.getOffers().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer aPreviousValue : previousValue
											.getOffers()) {
										fumlConfiguration.Activities.IntermediateActivities.Offer aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityEdgeInstance_offers_Value lastValue = tracedObject
										.getOffersSequence().get(tracedObject.getOffersSequence().size() - 1);
								newState.getActivityEdgeInstance_offers_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityEdgeInstance_offers_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityEdgeInstance_offers_Value();
								newValue.getOffers()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer>) getExeToTraced(
												o_cast.getOffers(), newState));
								tracedObject.getOffersSequence().add(newValue);
								newState.getActivityEdgeInstance_offers_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (org.eclipse.uml2.uml.Class aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								Collection<? extends EObject> tmp = getExeToTraced(
										o_cast.getTypes(), newState);
								newValue.getTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) tmp);
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues(), newState));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Execution_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.Execution_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Execution_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getExecution_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Execution_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecution_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues(), newState));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getExecution_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_EdgeInstances().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value> valueSequence = tracedObject
									.getEdgeInstancesSequence();
							umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getEdgeInstances()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getEdgeInstances().size() == o_cast.getEdgeInstances().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getEdgeInstances().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getEdgeInstances()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value lastValue = tracedObject
										.getEdgeInstancesSequence()
										.get(tracedObject.getEdgeInstancesSequence().size() - 1);
								newState.getActivityNodeActivationGroup_edgeInstances_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivationGroup_edgeInstances_Value();
								newValue.getEdgeInstances()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getEdgeInstances(), newState));
								tracedObject.getEdgeInstancesSequence().add(newValue);
								newState.getActivityNodeActivationGroup_edgeInstances_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_NodeActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value> valueSequence = tracedObject
									.getNodeActivationsSequence();
							umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aValue : o_cast
									.getNodeActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getNodeActivations().size() == o_cast.getNodeActivations().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation> it = o_cast
											.getNodeActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation aPreviousValue : previousValue
											.getNodeActivations()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value lastValue = tracedObject
										.getNodeActivationsSequence()
										.get(tracedObject.getNodeActivationsSequence().size() - 1);
								newState.getActivityNodeActivationGroup_nodeActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivationGroup_nodeActivations_Value();
								newValue.getNodeActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation>) getExeToTraced(
												o_cast.getNodeActivations(), newState));
								tracedObject.getNodeActivationsSequence().add(newValue);
								newState.getActivityNodeActivationGroup_nodeActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) {
						fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation_CallExecutions().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CallActionActivation_callExecutions_Value> valueSequence = tracedObject
									.getCallExecutionsSequence();
							umlTrace.States.CallActionActivation_callExecutions_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution aValue : o_cast
									.getCallExecutions()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getCallExecutions().size() == o_cast.getCallExecutions().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution> it = o_cast
											.getCallExecutions().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution aPreviousValue : previousValue
											.getCallExecutions()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CallActionActivation_callExecutions_Value lastValue = tracedObject
										.getCallExecutionsSequence()
										.get(tracedObject.getCallExecutionsSequence().size() - 1);
								newState.getCallActionActivation_callExecutions_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CallActionActivation_callExecutions_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCallActionActivation_callExecutions_Value();
								newValue.getCallExecutions()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution>) getExeToTraced(
												o_cast.getCallExecutions(), newState));
								tracedObject.getCallExecutionsSequence().add(newValue);
								newState.getCallActionActivation_callExecutions_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.ElementConfiguration) {
						fumlConfiguration.ElementConfiguration o_cast = (fumlConfiguration.ElementConfiguration) o;
						umlTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject = (umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.FumlConfigurationPackage.eINSTANCE
								.getElementConfiguration_SemanticVisitor().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ElementConfiguration_semanticVisitor_Value> valueSequence = tracedObject
									.getSemanticVisitorSequence();
							umlTrace.States.ElementConfiguration_semanticVisitor_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Loci.SemanticVisitor aValue : o_cast.getSemanticVisitor()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getSemanticVisitor().size() == o_cast.getSemanticVisitor().size()) {
									java.util.Iterator<fumlConfiguration.Loci.SemanticVisitor> it = o_cast
											.getSemanticVisitor().iterator();
									for (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor aPreviousValue : previousValue
											.getSemanticVisitor()) {
										fumlConfiguration.Loci.SemanticVisitor aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ElementConfiguration_semanticVisitor_Value lastValue = tracedObject
										.getSemanticVisitorSequence()
										.get(tracedObject.getSemanticVisitorSequence().size() - 1);
								newState.getElementConfiguration_semanticVisitor_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ElementConfiguration_semanticVisitor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createElementConfiguration_semanticVisitor_Value();
								newValue.getSemanticVisitor()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor>) getExeToTraced(
												o_cast.getSemanticVisitor(), newState));
								tracedObject.getSemanticVisitorSequence().add(newValue);
								newState.getElementConfiguration_semanticVisitor_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_PrimitiveBehaviorPrototypes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value> valueSequence = tracedObject
									.getPrimitiveBehaviorPrototypesSequence();
							umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aValue : o_cast
									.getPrimitiveBehaviorPrototypes()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPrimitiveBehaviorPrototypes().size() == o_cast
										.getPrimitiveBehaviorPrototypes().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution> it = o_cast
											.getPrimitiveBehaviorPrototypes().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution aPreviousValue : previousValue
											.getPrimitiveBehaviorPrototypes()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value lastValue = tracedObject
										.getPrimitiveBehaviorPrototypesSequence()
										.get(tracedObject.getPrimitiveBehaviorPrototypesSequence().size() - 1);
								newState.getExecutionFactory_primitiveBehaviorPrototypes_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecutionFactory_primitiveBehaviorPrototypes_Value();
								newValue.getPrimitiveBehaviorPrototypes()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution>) getExeToTraced(
												o_cast.getPrimitiveBehaviorPrototypes(), newState));
								tracedObject.getPrimitiveBehaviorPrototypesSequence().add(newValue);
								newState.getExecutionFactory_primitiveBehaviorPrototypes_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_BuiltInTypes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ExecutionFactory_builtInTypes_Value> valueSequence = tracedObject
									.getBuiltInTypesSequence();
							umlTrace.States.ExecutionFactory_builtInTypes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getBuiltInTypes().size() == o_cast.getBuiltInTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.PrimitiveType> it = o_cast.getBuiltInTypes()
											.iterator();
									for (org.eclipse.uml2.uml.PrimitiveType aPreviousValue : previousValue
											.getBuiltInTypes()) {
										org.eclipse.uml2.uml.PrimitiveType aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ExecutionFactory_builtInTypes_Value lastValue = tracedObject
										.getBuiltInTypesSequence()
										.get(tracedObject.getBuiltInTypesSequence().size() - 1);
								newState.getExecutionFactory_builtInTypes_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ExecutionFactory_builtInTypes_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecutionFactory_builtInTypes_Value();
								newValue.getBuiltInTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.PrimitiveType>) getExeToTraced(
												o_cast.getBuiltInTypes(), newState));
								tracedObject.getBuiltInTypesSequence().add(newValue);
								newState.getExecutionFactory_builtInTypes_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Input.InputPackage.eINSTANCE
								.getInputParameterValues_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.InputParameterValues_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.InputParameterValues_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.InputParameterValues_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getInputParameterValues_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.InputParameterValues_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createInputParameterValues_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues(), newState));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getInputParameterValues_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.InputPinActivation) {
						fumlConfiguration.Actions.BasicActions.InputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.InputPinActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution tracedObject = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (org.eclipse.uml2.uml.Class aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getExeToTraced(
												o_cast.getTypes(), newState));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues(), newState));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Execution_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.Execution_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Execution_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getExecution_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Execution_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecution_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues(), newState));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getExecution_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution tracedObject = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (org.eclipse.uml2.uml.Class aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getExeToTraced(
												o_cast.getTypes(), newState));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues(), newState));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Execution_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.Execution_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Execution_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getExecution_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Execution_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecution_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues(), newState));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getExecution_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) {
						fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution o_cast = (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) o;
						umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution tracedObject = (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (org.eclipse.uml2.uml.Class aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getExeToTraced(
												o_cast.getTypes(), newState));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues(), newState));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Execution_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.Execution_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Execution_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getExecution_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Execution_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecution_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues(), newState));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getExecution_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (org.eclipse.uml2.uml.Class aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getExeToTraced(
												o_cast.getTypes(), newState));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues(), newState));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						umlTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getLocus_ExtensionalValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Locus_extensionalValues_Value> valueSequence = tracedObject
									.getExtensionalValuesSequence();
							umlTrace.States.Locus_extensionalValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.ExtensionalValue aValue : o_cast
									.getExtensionalValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getExtensionalValues().size() == o_cast.getExtensionalValues()
										.size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.ExtensionalValue> it = o_cast
											.getExtensionalValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue aPreviousValue : previousValue
											.getExtensionalValues()) {
										fumlConfiguration.Classes.Kernel.ExtensionalValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Locus_extensionalValues_Value lastValue = tracedObject
										.getExtensionalValuesSequence()
										.get(tracedObject.getExtensionalValuesSequence().size() - 1);
								newState.getLocus_extensionalValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Locus_extensionalValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createLocus_extensionalValues_Value();
								newValue.getExtensionalValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue>) getExeToTraced(
												o_cast.getExtensionalValues(), newState));
								tracedObject.getExtensionalValuesSequence().add(newValue);
								newState.getLocus_extensionalValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getOffer_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Offer_offeredTokens_Value> valueSequence = tracedObject
									.getOfferedTokensSequence();
							umlTrace.States.Offer_offeredTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getOfferedTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getOfferedTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getOfferedTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.Offer_offeredTokens_Value lastValue = tracedObject
										.getOfferedTokensSequence()
										.get(tracedObject.getOfferedTokensSequence().size() - 1);
								newState.getOffer_offeredTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Offer_offeredTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createOffer_offeredTokens_Value();
								newValue.getOfferedTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getOfferedTokens(), newState));
								tracedObject.getOfferedTokensSequence().add(newValue);
								newState.getOffer_offeredTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) {
						fumlConfiguration.Actions.BasicActions.OpaqueActionActivation o_cast = (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.BasicActions.OutputPinActivation) {
						fumlConfiguration.Actions.BasicActions.OutputPinActivation o_cast = (fumlConfiguration.Actions.BasicActions.OutputPinActivation) o;
						umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getParameterValue_Values_ParameterValue().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ParameterValue_values_ParameterValue_Value> valueSequence = tracedObject
									.getValues_ParameterValueSequence();
							umlTrace.States.ParameterValue_values_ParameterValue_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.Value aValue : o_cast.getValues_ParameterValue()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getValues_ParameterValue().size() == o_cast.getValues_ParameterValue()
										.size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.Value> it = o_cast
											.getValues_ParameterValue().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue aPreviousValue : previousValue
											.getValues_ParameterValue()) {
										fumlConfiguration.Classes.Kernel.Value aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ParameterValue_values_ParameterValue_Value lastValue = tracedObject
										.getValues_ParameterValueSequence()
										.get(tracedObject.getValues_ParameterValueSequence().size() - 1);
								newState.getParameterValue_values_ParameterValue_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ParameterValue_values_ParameterValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createParameterValue_values_ParameterValue_Value();
								newValue.getValues_ParameterValue()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue>) getExeToTraced(
												o_cast.getValues_ParameterValue(), newState));
								tracedObject.getValues_ParameterValueSequence().add(newValue);
								newState.getParameterValue_values_ParameterValue_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) {
						fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation o_cast = (fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation) o;
						umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation tracedObject = (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getActionActivation_PinActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActionActivation_pinActivations_Value> valueSequence = tracedObject
									.getPinActivationsSequence();
							umlTrace.States.ActionActivation_pinActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Actions.BasicActions.PinActivation aValue : o_cast
									.getPinActivations()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPinActivations().size() == o_cast.getPinActivations().size()) {
									java.util.Iterator<fumlConfiguration.Actions.BasicActions.PinActivation> it = o_cast
											.getPinActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation aPreviousValue : previousValue
											.getPinActivations()) {
										fumlConfiguration.Actions.BasicActions.PinActivation aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActionActivation_pinActivations_Value lastValue = tracedObject
										.getPinActivationsSequence()
										.get(tracedObject.getPinActivationsSequence().size() - 1);
								newState.getActionActivation_pinActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActionActivation_pinActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActionActivation_pinActivations_Value();
								newValue.getPinActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation>) getExeToTraced(
												o_cast.getPinActivations(), newState));
								tracedObject.getPinActivationsSequence().add(newValue);
								newState.getActionActivation_pinActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges(), newState));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges(), newState));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final umlTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.gemoc.executionframework.engine.mse.BigStep) {
					final umlTrace.States.State startingState = lastState;
					final umlTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(org.gemoc.executionframework.engine.mse.Step step) {
		umlTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof umlTrace.Steps.SpecificStep) {
			step_cast = (umlTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			umlTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<umlTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation) step_cast;
				traceRoot.getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation) step_cast;
				traceRoot.getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation) step_cast;
				traceRoot.getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
						.add(fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence()
						.add(fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence()
						.add(fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence()
						.add(fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation) {
				umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationInstance = (umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence()
						.add(fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer) step_cast;
				traceRoot
						.getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token) {
				umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenInstance = (umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token) step_cast;
				traceRoot.getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence()
						.add(fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation) step_cast;
				traceRoot
						.getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence()
						.add(fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence()
						.add(fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation) step_cast;
				traceRoot
						.getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence()
						.add(fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Copy_Object) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Copy_Object fumlConfiguration_Classes_Kernel_Object_Copy_ObjectInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Copy_Object) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Object_Copy_ObjectInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Destroy_Object) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Destroy_Object fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Destroy_Object) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_GetTypes_Object) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_GetTypes_Object fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_GetTypes_Object) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_New_Object) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_New_Object fumlConfiguration_Classes_Kernel_Object_New_ObjectInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_New_Object) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Object_New_Object_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Object_New_ObjectInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue) step_cast;
				traceRoot
						.getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence()
						.add(fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Copy_Value) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Copy_Value fumlConfiguration_Classes_Kernel_Value_Copy_ValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Copy_Value) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Value_Copy_ValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Equals_Value) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Equals_Value fumlConfiguration_Classes_Kernel_Value_Equals_ValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Equals_Value) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Value_Equals_ValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_GetTypes_Value) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_GetTypes_Value fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_GetTypes_Value) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_HasType_Value) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_HasType_Value fumlConfiguration_Classes_Kernel_Value_HasType_ValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_HasType_Value) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Value_HasType_ValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_New_Value) {
				umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_New_Value fumlConfiguration_Classes_Kernel_Value_New_ValueInstance = (umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_New_Value) step_cast;
				traceRoot.getFumlConfiguration_Classes_Kernel_Value_New_Value_Sequence()
						.add(fumlConfiguration_Classes_Kernel_Value_New_ValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution) step_cast;
				traceRoot.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution) step_cast;
				traceRoot.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution) step_cast;
				traceRoot.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution) step_cast;
				traceRoot.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue) {
				umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueInstance = (umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue) step_cast;
				traceRoot
						.getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence()
						.add(fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory) {
				umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryInstance = (umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory) step_cast;
				traceRoot.getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence()
						.add(fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory) {
				umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryInstance = (umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory) step_cast;
				traceRoot.getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence()
						.add(fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory) {
				umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryInstance = (umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory) step_cast;
				traceRoot.getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence()
						.add(fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory) {
				umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryInstance = (umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory) step_cast;
				traceRoot
						.getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence()
						.add(fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory) {
				umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryInstance = (umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory) step_cast;
				traceRoot.getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence()
						.add(fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_Executor_Evaluate_Executor) {
				umlTrace.Steps.FumlConfiguration_Loci_Executor_Evaluate_Executor fumlConfiguration_Loci_Executor_Evaluate_ExecutorInstance = (umlTrace.Steps.FumlConfiguration_Loci_Executor_Evaluate_Executor) step_cast;
				traceRoot.getFumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence()
						.add(fumlConfiguration_Loci_Executor_Evaluate_ExecutorInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_Executor_Execute_Executor) {
				umlTrace.Steps.FumlConfiguration_Loci_Executor_Execute_Executor fumlConfiguration_Loci_Executor_Execute_ExecutorInstance = (umlTrace.Steps.FumlConfiguration_Loci_Executor_Execute_Executor) step_cast;
				traceRoot.getFumlConfiguration_Loci_Executor_Execute_Executor_Sequence()
						.add(fumlConfiguration_Loci_Executor_Execute_ExecutorInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_Locus_Add_Locus) {
				umlTrace.Steps.FumlConfiguration_Loci_Locus_Add_Locus fumlConfiguration_Loci_Locus_Add_LocusInstance = (umlTrace.Steps.FumlConfiguration_Loci_Locus_Add_Locus) step_cast;
				traceRoot.getFumlConfiguration_Loci_Locus_Add_Locus_Sequence()
						.add(fumlConfiguration_Loci_Locus_Add_LocusInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_Locus_Instantiate_Locus) {
				umlTrace.Steps.FumlConfiguration_Loci_Locus_Instantiate_Locus fumlConfiguration_Loci_Locus_Instantiate_LocusInstance = (umlTrace.Steps.FumlConfiguration_Loci_Locus_Instantiate_Locus) step_cast;
				traceRoot.getFumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence()
						.add(fumlConfiguration_Loci_Locus_Instantiate_LocusInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_Locus_Remove_Locus) {
				umlTrace.Steps.FumlConfiguration_Loci_Locus_Remove_Locus fumlConfiguration_Loci_Locus_Remove_LocusInstance = (umlTrace.Steps.FumlConfiguration_Loci_Locus_Remove_Locus) step_cast;
				traceRoot.getFumlConfiguration_Loci_Locus_Remove_Locus_Sequence()
						.add(fumlConfiguration_Loci_Locus_Remove_LocusInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor) {
				umlTrace.Steps.FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorInstance = (umlTrace.Steps.FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor) step_cast;
				traceRoot.getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence()
						.add(fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_ModelConfiguration_Main) {
				umlTrace.Steps.FumlConfiguration_ModelConfiguration_Main fumlConfiguration_ModelConfiguration_MainInstance = (umlTrace.Steps.FumlConfiguration_ModelConfiguration_Main) step_cast;
				traceRoot.getFumlConfiguration_ModelConfiguration_Main_Sequence()
						.add(fumlConfiguration_ModelConfiguration_MainInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionInstance);
			} else if (step_cast instanceof umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution) {
				umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionInstance = (umlTrace.Steps.FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution) step_cast;
				traceRoot
						.getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence()
						.add(fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(umlTrace.Steps.SpecificStep currentStep, umlTrace.States.State startingState,
			umlTrace.States.State endingState) {

		umlTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Copy_Object) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Object_Destroy_Object) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Copy_Value) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_Equals_Value) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Classes_Kernel_Value_HasType_Value) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_Executor_Evaluate_Executor) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_Executor_Execute_Executor) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_Loci_Locus_Instantiate_Locus) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStep();
		} else if (currentStep instanceof umlTrace.Steps.FumlConfiguration_ModelConfiguration_Main) {
			implicitStep = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_ModelConfiguration_Main_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<umlTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(org.gemoc.executionframework.engine.mse.Step step) {
		umlTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = umlTrace.UmlTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		org.gemoc.executionframework.engine.mse.SequentialStep<umlTrace.Steps.SpecificStep> rootStep = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
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

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects,
			umlTrace.States.State newState) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
