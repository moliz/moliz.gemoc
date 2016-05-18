/**
 */
package umlTrace.States.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.StatesPackage
 * @generated
 */
public class StatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatesSwitch<Adapter> modelSwitch =
		new StatesSwitch<Adapter>() {
			@Override
			public Adapter caseActionActivation_firing_Value(ActionActivation_firing_Value object) {
				return createActionActivation_firing_ValueAdapter();
			}
			@Override
			public Adapter caseActionActivation_pinActivations_Value(ActionActivation_pinActivations_Value object) {
				return createActionActivation_pinActivations_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance_edge_ActivityEdgeInstance_Value(ActivityEdgeInstance_edge_ActivityEdgeInstance_Value object) {
				return createActivityEdgeInstance_edge_ActivityEdgeInstance_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance_group_ActivityEdgeInstance_Value(ActivityEdgeInstance_group_ActivityEdgeInstance_Value object) {
				return createActivityEdgeInstance_group_ActivityEdgeInstance_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance_offers_Value(ActivityEdgeInstance_offers_Value object) {
				return createActivityEdgeInstance_offers_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance_source_Value(ActivityEdgeInstance_source_Value object) {
				return createActivityEdgeInstance_source_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance_target_Value(ActivityEdgeInstance_target_Value object) {
				return createActivityEdgeInstance_target_ValueAdapter();
			}
			@Override
			public Adapter caseActivityExecution_activationGroup_Value(ActivityExecution_activationGroup_Value object) {
				return createActivityExecution_activationGroup_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivationGroup_activityExecution_Value(ActivityNodeActivationGroup_activityExecution_Value object) {
				return createActivityNodeActivationGroup_activityExecution_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivationGroup_edgeInstances_Value(ActivityNodeActivationGroup_edgeInstances_Value object) {
				return createActivityNodeActivationGroup_edgeInstances_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivationGroup_nodeActivations_Value(ActivityNodeActivationGroup_nodeActivations_Value object) {
				return createActivityNodeActivationGroup_nodeActivations_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_group_ActivityNodeActivation_Value(ActivityNodeActivation_group_ActivityNodeActivation_Value object) {
				return createActivityNodeActivation_group_ActivityNodeActivation_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_heldTokens_Value(ActivityNodeActivation_heldTokens_Value object) {
				return createActivityNodeActivation_heldTokens_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_incomingEdges_Value(ActivityNodeActivation_incomingEdges_Value object) {
				return createActivityNodeActivation_incomingEdges_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_isRunning_Value(ActivityNodeActivation_isRunning_Value object) {
				return createActivityNodeActivation_isRunning_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_node_ActivityNodeActivation_Value(ActivityNodeActivation_node_ActivityNodeActivation_Value object) {
				return createActivityNodeActivation_node_ActivityNodeActivation_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_outgoingEdges_Value(ActivityNodeActivation_outgoingEdges_Value object) {
				return createActivityNodeActivation_outgoingEdges_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation_running_Value(ActivityNodeActivation_running_Value object) {
				return createActivityNodeActivation_running_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue_value_BooleanValue_Value(BooleanValue_value_BooleanValue_Value object) {
				return createBooleanValue_value_BooleanValue_ValueAdapter();
			}
			@Override
			public Adapter caseCallActionActivation_callExecutions_Value(CallActionActivation_callExecutions_Value object) {
				return createCallActionActivation_callExecutions_ValueAdapter();
			}
			@Override
			public Adapter caseCompoundValue_featureValues_Value(CompoundValue_featureValues_Value object) {
				return createCompoundValue_featureValues_ValueAdapter();
			}
			@Override
			public Adapter caseElementConfiguration_semanticVisitor_Value(ElementConfiguration_semanticVisitor_Value object) {
				return createElementConfiguration_semanticVisitor_ValueAdapter();
			}
			@Override
			public Adapter caseEvaluation_locus_Evaluation_Value(Evaluation_locus_Evaluation_Value object) {
				return createEvaluation_locus_Evaluation_ValueAdapter();
			}
			@Override
			public Adapter caseEvaluation_specification_Evaluation_Value(Evaluation_specification_Evaluation_Value object) {
				return createEvaluation_specification_Evaluation_ValueAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment_locus_ExecutionEnvironment_Value(ExecutionEnvironment_locus_ExecutionEnvironment_Value object) {
				return createExecutionEnvironment_locus_ExecutionEnvironment_ValueAdapter();
			}
			@Override
			public Adapter caseExecutionFactory_builtInTypes_Value(ExecutionFactory_builtInTypes_Value object) {
				return createExecutionFactory_builtInTypes_ValueAdapter();
			}
			@Override
			public Adapter caseExecutionFactory_locus_ExecutionFactory_Value(ExecutionFactory_locus_ExecutionFactory_Value object) {
				return createExecutionFactory_locus_ExecutionFactory_ValueAdapter();
			}
			@Override
			public Adapter caseExecutionFactory_primitiveBehaviorPrototypes_Value(ExecutionFactory_primitiveBehaviorPrototypes_Value object) {
				return createExecutionFactory_primitiveBehaviorPrototypes_ValueAdapter();
			}
			@Override
			public Adapter caseExecution_context_Value(Execution_context_Value object) {
				return createExecution_context_ValueAdapter();
			}
			@Override
			public Adapter caseExecution_parameterValues_Value(Execution_parameterValues_Value object) {
				return createExecution_parameterValues_ValueAdapter();
			}
			@Override
			public Adapter caseExecutor_locus_Executor_Value(Executor_locus_Executor_Value object) {
				return createExecutor_locus_Executor_ValueAdapter();
			}
			@Override
			public Adapter caseExtensionalValue_locus_ExtensionalValue_Value(ExtensionalValue_locus_ExtensionalValue_Value object) {
				return createExtensionalValue_locus_ExtensionalValue_ValueAdapter();
			}
			@Override
			public Adapter caseFeatureValue_feature_Value(FeatureValue_feature_Value object) {
				return createFeatureValue_feature_ValueAdapter();
			}
			@Override
			public Adapter caseFeatureValue_position_Value(FeatureValue_position_Value object) {
				return createFeatureValue_position_ValueAdapter();
			}
			@Override
			public Adapter caseFeatureValue_values_FeatureValue_Value(FeatureValue_values_FeatureValue_Value object) {
				return createFeatureValue_values_FeatureValue_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_baseTokenIsWithdrawn_Value(ForkedToken_baseTokenIsWithdrawn_Value object) {
				return createForkedToken_baseTokenIsWithdrawn_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
				return createForkedToken_baseToken_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
				return createForkedToken_remainingOffersCount_ValueAdapter();
			}
			@Override
			public Adapter caseInputParameterValues_name_Value(InputParameterValues_name_Value object) {
				return createInputParameterValues_name_ValueAdapter();
			}
			@Override
			public Adapter caseInputParameterValues_parameterValues_Value(InputParameterValues_parameterValues_Value object) {
				return createInputParameterValues_parameterValues_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue_value_IntegerValue_Value(IntegerValue_value_IntegerValue_Value object) {
				return createIntegerValue_value_IntegerValue_ValueAdapter();
			}
			@Override
			public Adapter caseLocus_executor_Value(Locus_executor_Value object) {
				return createLocus_executor_ValueAdapter();
			}
			@Override
			public Adapter caseLocus_extensionalValues_Value(Locus_extensionalValues_Value object) {
				return createLocus_extensionalValues_ValueAdapter();
			}
			@Override
			public Adapter caseLocus_factory_Value(Locus_factory_Value object) {
				return createLocus_factory_ValueAdapter();
			}
			@Override
			public Adapter caseObjectNodeActivation_offeredTokenCount_Value(ObjectNodeActivation_offeredTokenCount_Value object) {
				return createObjectNodeActivation_offeredTokenCount_ValueAdapter();
			}
			@Override
			public Adapter caseObjectToken_value_Value(ObjectToken_value_Value object) {
				return createObjectToken_value_ValueAdapter();
			}
			@Override
			public Adapter caseObject_types_Value(Object_types_Value object) {
				return createObject_types_ValueAdapter();
			}
			@Override
			public Adapter caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
				return createOffer_offeredTokens_ValueAdapter();
			}
			@Override
			public Adapter caseParameterValue_parameter_ParameterValue_Value(ParameterValue_parameter_ParameterValue_Value object) {
				return createParameterValue_parameter_ParameterValue_ValueAdapter();
			}
			@Override
			public Adapter caseParameterValue_values_ParameterValue_Value(ParameterValue_values_ParameterValue_Value object) {
				return createParameterValue_values_ParameterValue_ValueAdapter();
			}
			@Override
			public Adapter casePinActivation_actionActivation_Value(PinActivation_actionActivation_Value object) {
				return createPinActivation_actionActivation_ValueAdapter();
			}
			@Override
			public Adapter casePinActivation_count_temp_Value(PinActivation_count_temp_Value object) {
				return createPinActivation_count_temp_ValueAdapter();
			}
			@Override
			public Adapter casePrimitiveValue_type_Value(PrimitiveValue_type_Value object) {
				return createPrimitiveValue_type_ValueAdapter();
			}
			@Override
			public Adapter caseReference_referent_Value(Reference_referent_Value object) {
				return createReference_referent_ValueAdapter();
			}
			@Override
			public Adapter caseSemanticVisitor_runtimeModelElement_Value(SemanticVisitor_runtimeModelElement_Value object) {
				return createSemanticVisitor_runtimeModelElement_ValueAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseToken_holder_Value(Token_holder_Value object) {
				return createToken_holder_ValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActionActivation_firing_Value <em>Action Activation firing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActionActivation_firing_Value
	 * @generated
	 */
	public Adapter createActionActivation_firing_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActionActivation_pinActivations_Value <em>Action Activation pin Activations Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value
	 * @generated
	 */
	public Adapter createActionActivation_pinActivations_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value <em>Activity Edge Instance edge Activity Edge Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value
	 * @generated
	 */
	public Adapter createActivityEdgeInstance_edge_ActivityEdgeInstance_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value <em>Activity Edge Instance group Activity Edge Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value
	 * @generated
	 */
	public Adapter createActivityEdgeInstance_group_ActivityEdgeInstance_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityEdgeInstance_offers_Value <em>Activity Edge Instance offers Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value
	 * @generated
	 */
	public Adapter createActivityEdgeInstance_offers_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityEdgeInstance_source_Value <em>Activity Edge Instance source Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value
	 * @generated
	 */
	public Adapter createActivityEdgeInstance_source_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityEdgeInstance_target_Value <em>Activity Edge Instance target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value
	 * @generated
	 */
	public Adapter createActivityEdgeInstance_target_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityExecution_activationGroup_Value <em>Activity Execution activation Group Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value
	 * @generated
	 */
	public Adapter createActivityExecution_activationGroup_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value <em>Activity Node Activation Group activity Execution Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivationGroup_activityExecution_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value <em>Activity Node Activation Group edge Instances Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivationGroup_edgeInstances_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value <em>Activity Node Activation Group node Activations Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivationGroup_nodeActivations_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value <em>Activity Node Activation group Activity Node Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_group_ActivityNodeActivation_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value <em>Activity Node Activation held Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_heldTokens_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value <em>Activity Node Activation incoming Edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_incomingEdges_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value <em>Activity Node Activation is Running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_isRunning_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value <em>Activity Node Activation node Activity Node Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_node_ActivityNodeActivation_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value <em>Activity Node Activation outgoing Edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_outgoingEdges_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ActivityNodeActivation_running_Value <em>Activity Node Activation running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value
	 * @generated
	 */
	public Adapter createActivityNodeActivation_running_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value <em>Boolean Value value Boolean Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value
	 * @generated
	 */
	public Adapter createBooleanValue_value_BooleanValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.CallActionActivation_callExecutions_Value <em>Call Action Activation call Executions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value
	 * @generated
	 */
	public Adapter createCallActionActivation_callExecutions_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.CompoundValue_featureValues_Value <em>Compound Value feature Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.CompoundValue_featureValues_Value
	 * @generated
	 */
	public Adapter createCompoundValue_featureValues_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value <em>Element Configuration semantic Visitor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value
	 * @generated
	 */
	public Adapter createElementConfiguration_semanticVisitor_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Evaluation_locus_Evaluation_Value <em>Evaluation locus Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value
	 * @generated
	 */
	public Adapter createEvaluation_locus_Evaluation_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Evaluation_specification_Evaluation_Value <em>Evaluation specification Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value
	 * @generated
	 */
	public Adapter createEvaluation_specification_Evaluation_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value <em>Execution Environment locus Execution Environment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value
	 * @generated
	 */
	public Adapter createExecutionEnvironment_locus_ExecutionEnvironment_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value <em>Execution Factory built In Types Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value
	 * @generated
	 */
	public Adapter createExecutionFactory_builtInTypes_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value <em>Execution Factory locus Execution Factory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value
	 * @generated
	 */
	public Adapter createExecutionFactory_locus_ExecutionFactory_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value <em>Execution Factory primitive Behavior Prototypes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value
	 * @generated
	 */
	public Adapter createExecutionFactory_primitiveBehaviorPrototypes_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Execution_context_Value <em>Execution context Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Execution_context_Value
	 * @generated
	 */
	public Adapter createExecution_context_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Execution_parameterValues_Value <em>Execution parameter Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Execution_parameterValues_Value
	 * @generated
	 */
	public Adapter createExecution_parameterValues_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Executor_locus_Executor_Value <em>Executor locus Executor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Executor_locus_Executor_Value
	 * @generated
	 */
	public Adapter createExecutor_locus_Executor_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value <em>Extensional Value locus Extensional Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value
	 * @generated
	 */
	public Adapter createExtensionalValue_locus_ExtensionalValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.FeatureValue_feature_Value <em>Feature Value feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.FeatureValue_feature_Value
	 * @generated
	 */
	public Adapter createFeatureValue_feature_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.FeatureValue_position_Value <em>Feature Value position Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.FeatureValue_position_Value
	 * @generated
	 */
	public Adapter createFeatureValue_position_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value <em>Feature Value values Feature Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value
	 * @generated
	 */
	public Adapter createFeatureValue_values_FeatureValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value <em>Forked Token base Token Is Withdrawn Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value
	 * @generated
	 */
	public Adapter createForkedToken_baseTokenIsWithdrawn_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ForkedToken_baseToken_Value <em>Forked Token base Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ForkedToken_baseToken_Value
	 * @generated
	 */
	public Adapter createForkedToken_baseToken_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value <em>Forked Token remaining Offers Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value
	 * @generated
	 */
	public Adapter createForkedToken_remainingOffersCount_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.InputParameterValues_name_Value <em>Input Parameter Values name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.InputParameterValues_name_Value
	 * @generated
	 */
	public Adapter createInputParameterValues_name_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.InputParameterValues_parameterValues_Value <em>Input Parameter Values parameter Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value
	 * @generated
	 */
	public Adapter createInputParameterValues_parameterValues_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value <em>Integer Value value Integer Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value
	 * @generated
	 */
	public Adapter createIntegerValue_value_IntegerValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Locus_executor_Value <em>Locus executor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Locus_executor_Value
	 * @generated
	 */
	public Adapter createLocus_executor_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Locus_extensionalValues_Value <em>Locus extensional Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Locus_extensionalValues_Value
	 * @generated
	 */
	public Adapter createLocus_extensionalValues_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Locus_factory_Value <em>Locus factory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Locus_factory_Value
	 * @generated
	 */
	public Adapter createLocus_factory_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value <em>Object Node Activation offered Token Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value
	 * @generated
	 */
	public Adapter createObjectNodeActivation_offeredTokenCount_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ObjectToken_value_Value <em>Object Token value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ObjectToken_value_Value
	 * @generated
	 */
	public Adapter createObjectToken_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Object_types_Value <em>Object types Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Object_types_Value
	 * @generated
	 */
	public Adapter createObject_types_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Offer_offeredTokens_Value <em>Offer offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Offer_offeredTokens_Value
	 * @generated
	 */
	public Adapter createOffer_offeredTokens_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value <em>Parameter Value parameter Parameter Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value
	 * @generated
	 */
	public Adapter createParameterValue_parameter_ParameterValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value <em>Parameter Value values Parameter Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value
	 * @generated
	 */
	public Adapter createParameterValue_values_ParameterValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.PinActivation_actionActivation_Value <em>Pin Activation action Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.PinActivation_actionActivation_Value
	 * @generated
	 */
	public Adapter createPinActivation_actionActivation_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.PinActivation_count_temp_Value <em>Pin Activation count temp Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.PinActivation_count_temp_Value
	 * @generated
	 */
	public Adapter createPinActivation_count_temp_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.PrimitiveValue_type_Value <em>Primitive Value type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.PrimitiveValue_type_Value
	 * @generated
	 */
	public Adapter createPrimitiveValue_type_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Reference_referent_Value <em>Reference referent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Reference_referent_Value
	 * @generated
	 */
	public Adapter createReference_referent_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value <em>Semantic Visitor runtime Model Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value
	 * @generated
	 */
	public Adapter createSemanticVisitor_runtimeModelElement_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Token_holder_Value <em>Token holder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Token_holder_Value
	 * @generated
	 */
	public Adapter createToken_holder_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatesAdapterFactory
