/**
 */
package umlTrace.States.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import umlTrace.States.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see umlTrace.States.StatesPackage
 * @generated
 */
public class StatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesSwitch() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.ACTION_ACTIVATION_FIRING_VALUE: {
				ActionActivation_firing_Value actionActivation_firing_Value = (ActionActivation_firing_Value)theEObject;
				T result = caseActionActivation_firing_Value(actionActivation_firing_Value);
				if (result == null) result = caseValue(actionActivation_firing_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE: {
				ActionActivation_pinActivations_Value actionActivation_pinActivations_Value = (ActionActivation_pinActivations_Value)theEObject;
				T result = caseActionActivation_pinActivations_Value(actionActivation_pinActivations_Value);
				if (result == null) result = caseValue(actionActivation_pinActivations_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE: {
				ActivityEdgeInstance_edge_ActivityEdgeInstance_Value activityEdgeInstance_edge_ActivityEdgeInstance_Value = (ActivityEdgeInstance_edge_ActivityEdgeInstance_Value)theEObject;
				T result = caseActivityEdgeInstance_edge_ActivityEdgeInstance_Value(activityEdgeInstance_edge_ActivityEdgeInstance_Value);
				if (result == null) result = caseValue(activityEdgeInstance_edge_ActivityEdgeInstance_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE: {
				ActivityEdgeInstance_group_ActivityEdgeInstance_Value activityEdgeInstance_group_ActivityEdgeInstance_Value = (ActivityEdgeInstance_group_ActivityEdgeInstance_Value)theEObject;
				T result = caseActivityEdgeInstance_group_ActivityEdgeInstance_Value(activityEdgeInstance_group_ActivityEdgeInstance_Value);
				if (result == null) result = caseValue(activityEdgeInstance_group_ActivityEdgeInstance_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE: {
				ActivityEdgeInstance_offers_Value activityEdgeInstance_offers_Value = (ActivityEdgeInstance_offers_Value)theEObject;
				T result = caseActivityEdgeInstance_offers_Value(activityEdgeInstance_offers_Value);
				if (result == null) result = caseValue(activityEdgeInstance_offers_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE: {
				ActivityEdgeInstance_source_Value activityEdgeInstance_source_Value = (ActivityEdgeInstance_source_Value)theEObject;
				T result = caseActivityEdgeInstance_source_Value(activityEdgeInstance_source_Value);
				if (result == null) result = caseValue(activityEdgeInstance_source_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_TARGET_VALUE: {
				ActivityEdgeInstance_target_Value activityEdgeInstance_target_Value = (ActivityEdgeInstance_target_Value)theEObject;
				T result = caseActivityEdgeInstance_target_Value(activityEdgeInstance_target_Value);
				if (result == null) result = caseValue(activityEdgeInstance_target_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE: {
				ActivityExecution_activationGroup_Value activityExecution_activationGroup_Value = (ActivityExecution_activationGroup_Value)theEObject;
				T result = caseActivityExecution_activationGroup_Value(activityExecution_activationGroup_Value);
				if (result == null) result = caseValue(activityExecution_activationGroup_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE: {
				ActivityNodeActivationGroup_activityExecution_Value activityNodeActivationGroup_activityExecution_Value = (ActivityNodeActivationGroup_activityExecution_Value)theEObject;
				T result = caseActivityNodeActivationGroup_activityExecution_Value(activityNodeActivationGroup_activityExecution_Value);
				if (result == null) result = caseValue(activityNodeActivationGroup_activityExecution_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE: {
				ActivityNodeActivationGroup_edgeInstances_Value activityNodeActivationGroup_edgeInstances_Value = (ActivityNodeActivationGroup_edgeInstances_Value)theEObject;
				T result = caseActivityNodeActivationGroup_edgeInstances_Value(activityNodeActivationGroup_edgeInstances_Value);
				if (result == null) result = caseValue(activityNodeActivationGroup_edgeInstances_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE: {
				ActivityNodeActivationGroup_nodeActivations_Value activityNodeActivationGroup_nodeActivations_Value = (ActivityNodeActivationGroup_nodeActivations_Value)theEObject;
				T result = caseActivityNodeActivationGroup_nodeActivations_Value(activityNodeActivationGroup_nodeActivations_Value);
				if (result == null) result = caseValue(activityNodeActivationGroup_nodeActivations_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE: {
				ActivityNodeActivation_group_ActivityNodeActivation_Value activityNodeActivation_group_ActivityNodeActivation_Value = (ActivityNodeActivation_group_ActivityNodeActivation_Value)theEObject;
				T result = caseActivityNodeActivation_group_ActivityNodeActivation_Value(activityNodeActivation_group_ActivityNodeActivation_Value);
				if (result == null) result = caseValue(activityNodeActivation_group_ActivityNodeActivation_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE: {
				ActivityNodeActivation_heldTokens_Value activityNodeActivation_heldTokens_Value = (ActivityNodeActivation_heldTokens_Value)theEObject;
				T result = caseActivityNodeActivation_heldTokens_Value(activityNodeActivation_heldTokens_Value);
				if (result == null) result = caseValue(activityNodeActivation_heldTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE: {
				ActivityNodeActivation_incomingEdges_Value activityNodeActivation_incomingEdges_Value = (ActivityNodeActivation_incomingEdges_Value)theEObject;
				T result = caseActivityNodeActivation_incomingEdges_Value(activityNodeActivation_incomingEdges_Value);
				if (result == null) result = caseValue(activityNodeActivation_incomingEdges_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE: {
				ActivityNodeActivation_isRunning_Value activityNodeActivation_isRunning_Value = (ActivityNodeActivation_isRunning_Value)theEObject;
				T result = caseActivityNodeActivation_isRunning_Value(activityNodeActivation_isRunning_Value);
				if (result == null) result = caseValue(activityNodeActivation_isRunning_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE: {
				ActivityNodeActivation_node_ActivityNodeActivation_Value activityNodeActivation_node_ActivityNodeActivation_Value = (ActivityNodeActivation_node_ActivityNodeActivation_Value)theEObject;
				T result = caseActivityNodeActivation_node_ActivityNodeActivation_Value(activityNodeActivation_node_ActivityNodeActivation_Value);
				if (result == null) result = caseValue(activityNodeActivation_node_ActivityNodeActivation_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE: {
				ActivityNodeActivation_outgoingEdges_Value activityNodeActivation_outgoingEdges_Value = (ActivityNodeActivation_outgoingEdges_Value)theEObject;
				T result = caseActivityNodeActivation_outgoingEdges_Value(activityNodeActivation_outgoingEdges_Value);
				if (result == null) result = caseValue(activityNodeActivation_outgoingEdges_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE: {
				ActivityNodeActivation_running_Value activityNodeActivation_running_Value = (ActivityNodeActivation_running_Value)theEObject;
				T result = caseActivityNodeActivation_running_Value(activityNodeActivation_running_Value);
				if (result == null) result = caseValue(activityNodeActivation_running_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE: {
				BooleanValue_value_BooleanValue_Value booleanValue_value_BooleanValue_Value = (BooleanValue_value_BooleanValue_Value)theEObject;
				T result = caseBooleanValue_value_BooleanValue_Value(booleanValue_value_BooleanValue_Value);
				if (result == null) result = caseValue(booleanValue_value_BooleanValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE: {
				CallActionActivation_callExecutions_Value callActionActivation_callExecutions_Value = (CallActionActivation_callExecutions_Value)theEObject;
				T result = caseCallActionActivation_callExecutions_Value(callActionActivation_callExecutions_Value);
				if (result == null) result = caseValue(callActionActivation_callExecutions_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.COMPOUND_VALUE_FEATURE_VALUES_VALUE: {
				CompoundValue_featureValues_Value compoundValue_featureValues_Value = (CompoundValue_featureValues_Value)theEObject;
				T result = caseCompoundValue_featureValues_Value(compoundValue_featureValues_Value);
				if (result == null) result = caseValue(compoundValue_featureValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE: {
				ElementConfiguration_semanticVisitor_Value elementConfiguration_semanticVisitor_Value = (ElementConfiguration_semanticVisitor_Value)theEObject;
				T result = caseElementConfiguration_semanticVisitor_Value(elementConfiguration_semanticVisitor_Value);
				if (result == null) result = caseValue(elementConfiguration_semanticVisitor_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EVALUATION_LOCUS_EVALUATION_VALUE: {
				Evaluation_locus_Evaluation_Value evaluation_locus_Evaluation_Value = (Evaluation_locus_Evaluation_Value)theEObject;
				T result = caseEvaluation_locus_Evaluation_Value(evaluation_locus_Evaluation_Value);
				if (result == null) result = caseValue(evaluation_locus_Evaluation_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE: {
				Evaluation_specification_Evaluation_Value evaluation_specification_Evaluation_Value = (Evaluation_specification_Evaluation_Value)theEObject;
				T result = caseEvaluation_specification_Evaluation_Value(evaluation_specification_Evaluation_Value);
				if (result == null) result = caseValue(evaluation_specification_Evaluation_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE: {
				ExecutionEnvironment_locus_ExecutionEnvironment_Value executionEnvironment_locus_ExecutionEnvironment_Value = (ExecutionEnvironment_locus_ExecutionEnvironment_Value)theEObject;
				T result = caseExecutionEnvironment_locus_ExecutionEnvironment_Value(executionEnvironment_locus_ExecutionEnvironment_Value);
				if (result == null) result = caseValue(executionEnvironment_locus_ExecutionEnvironment_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE: {
				ExecutionFactory_builtInTypes_Value executionFactory_builtInTypes_Value = (ExecutionFactory_builtInTypes_Value)theEObject;
				T result = caseExecutionFactory_builtInTypes_Value(executionFactory_builtInTypes_Value);
				if (result == null) result = caseValue(executionFactory_builtInTypes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE: {
				ExecutionFactory_locus_ExecutionFactory_Value executionFactory_locus_ExecutionFactory_Value = (ExecutionFactory_locus_ExecutionFactory_Value)theEObject;
				T result = caseExecutionFactory_locus_ExecutionFactory_Value(executionFactory_locus_ExecutionFactory_Value);
				if (result == null) result = caseValue(executionFactory_locus_ExecutionFactory_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE: {
				ExecutionFactory_primitiveBehaviorPrototypes_Value executionFactory_primitiveBehaviorPrototypes_Value = (ExecutionFactory_primitiveBehaviorPrototypes_Value)theEObject;
				T result = caseExecutionFactory_primitiveBehaviorPrototypes_Value(executionFactory_primitiveBehaviorPrototypes_Value);
				if (result == null) result = caseValue(executionFactory_primitiveBehaviorPrototypes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_CONTEXT_VALUE: {
				Execution_context_Value execution_context_Value = (Execution_context_Value)theEObject;
				T result = caseExecution_context_Value(execution_context_Value);
				if (result == null) result = caseValue(execution_context_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE: {
				Execution_parameterValues_Value execution_parameterValues_Value = (Execution_parameterValues_Value)theEObject;
				T result = caseExecution_parameterValues_Value(execution_parameterValues_Value);
				if (result == null) result = caseValue(execution_parameterValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE: {
				Executor_locus_Executor_Value executor_locus_Executor_Value = (Executor_locus_Executor_Value)theEObject;
				T result = caseExecutor_locus_Executor_Value(executor_locus_Executor_Value);
				if (result == null) result = caseValue(executor_locus_Executor_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE: {
				ExtensionalValue_locus_ExtensionalValue_Value extensionalValue_locus_ExtensionalValue_Value = (ExtensionalValue_locus_ExtensionalValue_Value)theEObject;
				T result = caseExtensionalValue_locus_ExtensionalValue_Value(extensionalValue_locus_ExtensionalValue_Value);
				if (result == null) result = caseValue(extensionalValue_locus_ExtensionalValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FEATURE_VALUE_FEATURE_VALUE: {
				FeatureValue_feature_Value featureValue_feature_Value = (FeatureValue_feature_Value)theEObject;
				T result = caseFeatureValue_feature_Value(featureValue_feature_Value);
				if (result == null) result = caseValue(featureValue_feature_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FEATURE_VALUE_POSITION_VALUE: {
				FeatureValue_position_Value featureValue_position_Value = (FeatureValue_position_Value)theEObject;
				T result = caseFeatureValue_position_Value(featureValue_position_Value);
				if (result == null) result = caseValue(featureValue_position_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE: {
				FeatureValue_values_FeatureValue_Value featureValue_values_FeatureValue_Value = (FeatureValue_values_FeatureValue_Value)theEObject;
				T result = caseFeatureValue_values_FeatureValue_Value(featureValue_values_FeatureValue_Value);
				if (result == null) result = caseValue(featureValue_values_FeatureValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE: {
				ForkedToken_baseTokenIsWithdrawn_Value forkedToken_baseTokenIsWithdrawn_Value = (ForkedToken_baseTokenIsWithdrawn_Value)theEObject;
				T result = caseForkedToken_baseTokenIsWithdrawn_Value(forkedToken_baseTokenIsWithdrawn_Value);
				if (result == null) result = caseValue(forkedToken_baseTokenIsWithdrawn_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: {
				ForkedToken_baseToken_Value forkedToken_baseToken_Value = (ForkedToken_baseToken_Value)theEObject;
				T result = caseForkedToken_baseToken_Value(forkedToken_baseToken_Value);
				if (result == null) result = caseValue(forkedToken_baseToken_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: {
				ForkedToken_remainingOffersCount_Value forkedToken_remainingOffersCount_Value = (ForkedToken_remainingOffersCount_Value)theEObject;
				T result = caseForkedToken_remainingOffersCount_Value(forkedToken_remainingOffersCount_Value);
				if (result == null) result = caseValue(forkedToken_remainingOffersCount_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_PARAMETER_VALUES_NAME_VALUE: {
				InputParameterValues_name_Value inputParameterValues_name_Value = (InputParameterValues_name_Value)theEObject;
				T result = caseInputParameterValues_name_Value(inputParameterValues_name_Value);
				if (result == null) result = caseValue(inputParameterValues_name_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE: {
				InputParameterValues_parameterValues_Value inputParameterValues_parameterValues_Value = (InputParameterValues_parameterValues_Value)theEObject;
				T result = caseInputParameterValues_parameterValues_Value(inputParameterValues_parameterValues_Value);
				if (result == null) result = caseValue(inputParameterValues_parameterValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE: {
				IntegerValue_value_IntegerValue_Value integerValue_value_IntegerValue_Value = (IntegerValue_value_IntegerValue_Value)theEObject;
				T result = caseIntegerValue_value_IntegerValue_Value(integerValue_value_IntegerValue_Value);
				if (result == null) result = caseValue(integerValue_value_IntegerValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.LOCUS_EXECUTOR_VALUE: {
				Locus_executor_Value locus_executor_Value = (Locus_executor_Value)theEObject;
				T result = caseLocus_executor_Value(locus_executor_Value);
				if (result == null) result = caseValue(locus_executor_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.LOCUS_EXTENSIONAL_VALUES_VALUE: {
				Locus_extensionalValues_Value locus_extensionalValues_Value = (Locus_extensionalValues_Value)theEObject;
				T result = caseLocus_extensionalValues_Value(locus_extensionalValues_Value);
				if (result == null) result = caseValue(locus_extensionalValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.LOCUS_FACTORY_VALUE: {
				Locus_factory_Value locus_factory_Value = (Locus_factory_Value)theEObject;
				T result = caseLocus_factory_Value(locus_factory_Value);
				if (result == null) result = caseValue(locus_factory_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE: {
				ObjectNodeActivation_offeredTokenCount_Value objectNodeActivation_offeredTokenCount_Value = (ObjectNodeActivation_offeredTokenCount_Value)theEObject;
				T result = caseObjectNodeActivation_offeredTokenCount_Value(objectNodeActivation_offeredTokenCount_Value);
				if (result == null) result = caseValue(objectNodeActivation_offeredTokenCount_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OBJECT_TOKEN_VALUE_VALUE: {
				ObjectToken_value_Value objectToken_value_Value = (ObjectToken_value_Value)theEObject;
				T result = caseObjectToken_value_Value(objectToken_value_Value);
				if (result == null) result = caseValue(objectToken_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OBJECT_TYPES_VALUE: {
				Object_types_Value object_types_Value = (Object_types_Value)theEObject;
				T result = caseObject_types_Value(object_types_Value);
				if (result == null) result = caseValue(object_types_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: {
				Offer_offeredTokens_Value offer_offeredTokens_Value = (Offer_offeredTokens_Value)theEObject;
				T result = caseOffer_offeredTokens_Value(offer_offeredTokens_Value);
				if (result == null) result = caseValue(offer_offeredTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE: {
				ParameterValue_parameter_ParameterValue_Value parameterValue_parameter_ParameterValue_Value = (ParameterValue_parameter_ParameterValue_Value)theEObject;
				T result = caseParameterValue_parameter_ParameterValue_Value(parameterValue_parameter_ParameterValue_Value);
				if (result == null) result = caseValue(parameterValue_parameter_ParameterValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE: {
				ParameterValue_values_ParameterValue_Value parameterValue_values_ParameterValue_Value = (ParameterValue_values_ParameterValue_Value)theEObject;
				T result = caseParameterValue_values_ParameterValue_Value(parameterValue_values_ParameterValue_Value);
				if (result == null) result = caseValue(parameterValue_values_ParameterValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE: {
				PinActivation_actionActivation_Value pinActivation_actionActivation_Value = (PinActivation_actionActivation_Value)theEObject;
				T result = casePinActivation_actionActivation_Value(pinActivation_actionActivation_Value);
				if (result == null) result = caseValue(pinActivation_actionActivation_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE: {
				PinActivation_count_temp_Value pinActivation_count_temp_Value = (PinActivation_count_temp_Value)theEObject;
				T result = casePinActivation_count_temp_Value(pinActivation_count_temp_Value);
				if (result == null) result = caseValue(pinActivation_count_temp_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PRIMITIVE_VALUE_TYPE_VALUE: {
				PrimitiveValue_type_Value primitiveValue_type_Value = (PrimitiveValue_type_Value)theEObject;
				T result = casePrimitiveValue_type_Value(primitiveValue_type_Value);
				if (result == null) result = caseValue(primitiveValue_type_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.REFERENCE_REFERENT_VALUE: {
				Reference_referent_Value reference_referent_Value = (Reference_referent_Value)theEObject;
				T result = caseReference_referent_Value(reference_referent_Value);
				if (result == null) result = caseValue(reference_referent_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE: {
				SemanticVisitor_runtimeModelElement_Value semanticVisitor_runtimeModelElement_Value = (SemanticVisitor_runtimeModelElement_Value)theEObject;
				T result = caseSemanticVisitor_runtimeModelElement_Value(semanticVisitor_runtimeModelElement_Value);
				if (result == null) result = caseValue(semanticVisitor_runtimeModelElement_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TOKEN_HOLDER_VALUE: {
				Token_holder_Value token_holder_Value = (Token_holder_Value)theEObject;
				T result = caseToken_holder_Value(token_holder_Value);
				if (result == null) result = caseValue(token_holder_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Activation firing Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Activation firing Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionActivation_firing_Value(ActionActivation_firing_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Activation pin Activations Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Activation pin Activations Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionActivation_pinActivations_Value(ActionActivation_pinActivations_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance edge Activity Edge Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance edge Activity Edge Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance_edge_ActivityEdgeInstance_Value(ActivityEdgeInstance_edge_ActivityEdgeInstance_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance group Activity Edge Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance group Activity Edge Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance_group_ActivityEdgeInstance_Value(ActivityEdgeInstance_group_ActivityEdgeInstance_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance offers Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance offers Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance_offers_Value(ActivityEdgeInstance_offers_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance source Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance source Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance_source_Value(ActivityEdgeInstance_source_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance target Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance target Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance_target_Value(ActivityEdgeInstance_target_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Execution activation Group Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Execution activation Group Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExecution_activationGroup_Value(ActivityExecution_activationGroup_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation Group activity Execution Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation Group activity Execution Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivationGroup_activityExecution_Value(ActivityNodeActivationGroup_activityExecution_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation Group edge Instances Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation Group edge Instances Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivationGroup_edgeInstances_Value(ActivityNodeActivationGroup_edgeInstances_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation Group node Activations Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation Group node Activations Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivationGroup_nodeActivations_Value(ActivityNodeActivationGroup_nodeActivations_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation group Activity Node Activation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation group Activity Node Activation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_group_ActivityNodeActivation_Value(ActivityNodeActivation_group_ActivityNodeActivation_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation held Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_heldTokens_Value(ActivityNodeActivation_heldTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation incoming Edges Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation incoming Edges Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_incomingEdges_Value(ActivityNodeActivation_incomingEdges_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation is Running Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation is Running Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_isRunning_Value(ActivityNodeActivation_isRunning_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation node Activity Node Activation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation node Activity Node Activation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_node_ActivityNodeActivation_Value(ActivityNodeActivation_node_ActivityNodeActivation_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation outgoing Edges Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation outgoing Edges Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_outgoingEdges_Value(ActivityNodeActivation_outgoingEdges_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation running Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation running Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation_running_Value(ActivityNodeActivation_running_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value value Boolean Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value value Boolean Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue_value_BooleanValue_Value(BooleanValue_value_BooleanValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action Activation call Executions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action Activation call Executions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallActionActivation_callExecutions_Value(CallActionActivation_callExecutions_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Value feature Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Value feature Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundValue_featureValues_Value(CompoundValue_featureValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Configuration semantic Visitor Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Configuration semantic Visitor Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementConfiguration_semanticVisitor_Value(ElementConfiguration_semanticVisitor_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation locus Evaluation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation locus Evaluation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation_locus_Evaluation_Value(Evaluation_locus_Evaluation_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation specification Evaluation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation specification Evaluation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation_specification_Evaluation_Value(Evaluation_specification_Evaluation_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment locus Execution Environment Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment locus Execution Environment Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment_locus_ExecutionEnvironment_Value(ExecutionEnvironment_locus_ExecutionEnvironment_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Factory built In Types Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Factory built In Types Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFactory_builtInTypes_Value(ExecutionFactory_builtInTypes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Factory locus Execution Factory Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Factory locus Execution Factory Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFactory_locus_ExecutionFactory_Value(ExecutionFactory_locus_ExecutionFactory_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Factory primitive Behavior Prototypes Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Factory primitive Behavior Prototypes Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFactory_primitiveBehaviorPrototypes_Value(ExecutionFactory_primitiveBehaviorPrototypes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution context Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution context Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution_context_Value(Execution_context_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution parameter Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution parameter Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution_parameterValues_Value(Execution_parameterValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor locus Executor Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor locus Executor Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutor_locus_Executor_Value(Executor_locus_Executor_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensional Value locus Extensional Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensional Value locus Extensional Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionalValue_locus_ExtensionalValue_Value(ExtensionalValue_locus_ExtensionalValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue_feature_Value(FeatureValue_feature_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value position Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value position Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue_position_Value(FeatureValue_position_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value values Feature Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value values Feature Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue_values_FeatureValue_Value(FeatureValue_values_FeatureValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token base Token Is Withdrawn Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token base Token Is Withdrawn Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_baseTokenIsWithdrawn_Value(ForkedToken_baseTokenIsWithdrawn_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter Values name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter Values name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParameterValues_name_Value(InputParameterValues_name_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter Values parameter Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter Values parameter Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParameterValues_parameterValues_Value(InputParameterValues_parameterValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value value Integer Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value value Integer Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue_value_IntegerValue_Value(IntegerValue_value_IntegerValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locus executor Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locus executor Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocus_executor_Value(Locus_executor_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locus extensional Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locus extensional Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocus_extensionalValues_Value(Locus_extensionalValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locus factory Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locus factory Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocus_factory_Value(Locus_factory_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node Activation offered Token Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node Activation offered Token Count Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNodeActivation_offeredTokenCount_Value(ObjectNodeActivation_offeredTokenCount_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Token value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Token value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectToken_value_Value(ObjectToken_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object types Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object types Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_types_Value(Object_types_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value parameter Parameter Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value parameter Parameter Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue_parameter_ParameterValue_Value(ParameterValue_parameter_ParameterValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value values Parameter Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value values Parameter Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue_values_ParameterValue_Value(ParameterValue_values_ParameterValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Activation action Activation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Activation action Activation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinActivation_actionActivation_Value(PinActivation_actionActivation_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Activation count temp Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Activation count temp Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinActivation_count_temp_Value(PinActivation_count_temp_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Value type Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Value type Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveValue_type_Value(PrimitiveValue_type_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference referent Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference referent Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference_referent_Value(Reference_referent_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticVisitor_runtimeModelElement_Value(SemanticVisitor_runtimeModelElement_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken_holder_Value(Token_holder_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
