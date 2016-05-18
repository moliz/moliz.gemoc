/**
 */
package umlTrace.States.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.ACTION_ACTIVATION_FIRING_VALUE: return createActionActivation_firing_Value();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE: return createActionActivation_pinActivations_Value();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE: return createActivityEdgeInstance_edge_ActivityEdgeInstance_Value();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE: return createActivityEdgeInstance_group_ActivityEdgeInstance_Value();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE: return createActivityEdgeInstance_offers_Value();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE: return createActivityEdgeInstance_source_Value();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_TARGET_VALUE: return createActivityEdgeInstance_target_Value();
			case StatesPackage.ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE: return createActivityExecution_activationGroup_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE: return createActivityNodeActivationGroup_activityExecution_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE: return createActivityNodeActivationGroup_edgeInstances_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE: return createActivityNodeActivationGroup_nodeActivations_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE: return createActivityNodeActivation_group_ActivityNodeActivation_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE: return createActivityNodeActivation_heldTokens_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE: return createActivityNodeActivation_incomingEdges_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE: return createActivityNodeActivation_isRunning_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE: return createActivityNodeActivation_node_ActivityNodeActivation_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE: return createActivityNodeActivation_outgoingEdges_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE: return createActivityNodeActivation_running_Value();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE: return createBooleanValue_value_BooleanValue_Value();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE: return createCallActionActivation_callExecutions_Value();
			case StatesPackage.COMPOUND_VALUE_FEATURE_VALUES_VALUE: return createCompoundValue_featureValues_Value();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE: return createElementConfiguration_semanticVisitor_Value();
			case StatesPackage.EVALUATION_LOCUS_EVALUATION_VALUE: return createEvaluation_locus_Evaluation_Value();
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE: return createEvaluation_specification_Evaluation_Value();
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE: return createExecutionEnvironment_locus_ExecutionEnvironment_Value();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE: return createExecutionFactory_builtInTypes_Value();
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE: return createExecutionFactory_locus_ExecutionFactory_Value();
			case StatesPackage.EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE: return createExecutionFactory_primitiveBehaviorPrototypes_Value();
			case StatesPackage.EXECUTION_CONTEXT_VALUE: return createExecution_context_Value();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE: return createExecution_parameterValues_Value();
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE: return createExecutor_locus_Executor_Value();
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE: return createExtensionalValue_locus_ExtensionalValue_Value();
			case StatesPackage.FEATURE_VALUE_FEATURE_VALUE: return createFeatureValue_feature_Value();
			case StatesPackage.FEATURE_VALUE_POSITION_VALUE: return createFeatureValue_position_Value();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE: return createFeatureValue_values_FeatureValue_Value();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE: return createForkedToken_baseTokenIsWithdrawn_Value();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: return createForkedToken_baseToken_Value();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: return createForkedToken_remainingOffersCount_Value();
			case StatesPackage.INPUT_PARAMETER_VALUES_NAME_VALUE: return createInputParameterValues_name_Value();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE: return createInputParameterValues_parameterValues_Value();
			case StatesPackage.INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE: return createIntegerValue_value_IntegerValue_Value();
			case StatesPackage.LOCUS_EXECUTOR_VALUE: return createLocus_executor_Value();
			case StatesPackage.LOCUS_EXTENSIONAL_VALUES_VALUE: return createLocus_extensionalValues_Value();
			case StatesPackage.LOCUS_FACTORY_VALUE: return createLocus_factory_Value();
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE: return createObjectNodeActivation_offeredTokenCount_Value();
			case StatesPackage.OBJECT_TOKEN_VALUE_VALUE: return createObjectToken_value_Value();
			case StatesPackage.OBJECT_TYPES_VALUE: return createObject_types_Value();
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: return createOffer_offeredTokens_Value();
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE: return createParameterValue_parameter_ParameterValue_Value();
			case StatesPackage.PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE: return createParameterValue_values_ParameterValue_Value();
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE: return createPinActivation_actionActivation_Value();
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE: return createPinActivation_count_temp_Value();
			case StatesPackage.PRIMITIVE_VALUE_TYPE_VALUE: return createPrimitiveValue_type_Value();
			case StatesPackage.REFERENCE_REFERENT_VALUE: return createReference_referent_Value();
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE: return createSemanticVisitor_runtimeModelElement_Value();
			case StatesPackage.STATE: return createState();
			case StatesPackage.TOKEN_HOLDER_VALUE: return createToken_holder_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionActivation_firing_Value createActionActivation_firing_Value() {
		ActionActivation_firing_ValueImpl actionActivation_firing_Value = new ActionActivation_firing_ValueImpl();
		return actionActivation_firing_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionActivation_pinActivations_Value createActionActivation_pinActivations_Value() {
		ActionActivation_pinActivations_ValueImpl actionActivation_pinActivations_Value = new ActionActivation_pinActivations_ValueImpl();
		return actionActivation_pinActivations_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance_edge_ActivityEdgeInstance_Value createActivityEdgeInstance_edge_ActivityEdgeInstance_Value() {
		ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl activityEdgeInstance_edge_ActivityEdgeInstance_Value = new ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl();
		return activityEdgeInstance_edge_ActivityEdgeInstance_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance_group_ActivityEdgeInstance_Value createActivityEdgeInstance_group_ActivityEdgeInstance_Value() {
		ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl activityEdgeInstance_group_ActivityEdgeInstance_Value = new ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl();
		return activityEdgeInstance_group_ActivityEdgeInstance_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance_offers_Value createActivityEdgeInstance_offers_Value() {
		ActivityEdgeInstance_offers_ValueImpl activityEdgeInstance_offers_Value = new ActivityEdgeInstance_offers_ValueImpl();
		return activityEdgeInstance_offers_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance_source_Value createActivityEdgeInstance_source_Value() {
		ActivityEdgeInstance_source_ValueImpl activityEdgeInstance_source_Value = new ActivityEdgeInstance_source_ValueImpl();
		return activityEdgeInstance_source_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance_target_Value createActivityEdgeInstance_target_Value() {
		ActivityEdgeInstance_target_ValueImpl activityEdgeInstance_target_Value = new ActivityEdgeInstance_target_ValueImpl();
		return activityEdgeInstance_target_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecution_activationGroup_Value createActivityExecution_activationGroup_Value() {
		ActivityExecution_activationGroup_ValueImpl activityExecution_activationGroup_Value = new ActivityExecution_activationGroup_ValueImpl();
		return activityExecution_activationGroup_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup_activityExecution_Value createActivityNodeActivationGroup_activityExecution_Value() {
		ActivityNodeActivationGroup_activityExecution_ValueImpl activityNodeActivationGroup_activityExecution_Value = new ActivityNodeActivationGroup_activityExecution_ValueImpl();
		return activityNodeActivationGroup_activityExecution_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup_edgeInstances_Value createActivityNodeActivationGroup_edgeInstances_Value() {
		ActivityNodeActivationGroup_edgeInstances_ValueImpl activityNodeActivationGroup_edgeInstances_Value = new ActivityNodeActivationGroup_edgeInstances_ValueImpl();
		return activityNodeActivationGroup_edgeInstances_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup_nodeActivations_Value createActivityNodeActivationGroup_nodeActivations_Value() {
		ActivityNodeActivationGroup_nodeActivations_ValueImpl activityNodeActivationGroup_nodeActivations_Value = new ActivityNodeActivationGroup_nodeActivations_ValueImpl();
		return activityNodeActivationGroup_nodeActivations_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_group_ActivityNodeActivation_Value createActivityNodeActivation_group_ActivityNodeActivation_Value() {
		ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl activityNodeActivation_group_ActivityNodeActivation_Value = new ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl();
		return activityNodeActivation_group_ActivityNodeActivation_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_heldTokens_Value createActivityNodeActivation_heldTokens_Value() {
		ActivityNodeActivation_heldTokens_ValueImpl activityNodeActivation_heldTokens_Value = new ActivityNodeActivation_heldTokens_ValueImpl();
		return activityNodeActivation_heldTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_incomingEdges_Value createActivityNodeActivation_incomingEdges_Value() {
		ActivityNodeActivation_incomingEdges_ValueImpl activityNodeActivation_incomingEdges_Value = new ActivityNodeActivation_incomingEdges_ValueImpl();
		return activityNodeActivation_incomingEdges_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_isRunning_Value createActivityNodeActivation_isRunning_Value() {
		ActivityNodeActivation_isRunning_ValueImpl activityNodeActivation_isRunning_Value = new ActivityNodeActivation_isRunning_ValueImpl();
		return activityNodeActivation_isRunning_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_node_ActivityNodeActivation_Value createActivityNodeActivation_node_ActivityNodeActivation_Value() {
		ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl activityNodeActivation_node_ActivityNodeActivation_Value = new ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl();
		return activityNodeActivation_node_ActivityNodeActivation_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_outgoingEdges_Value createActivityNodeActivation_outgoingEdges_Value() {
		ActivityNodeActivation_outgoingEdges_ValueImpl activityNodeActivation_outgoingEdges_Value = new ActivityNodeActivation_outgoingEdges_ValueImpl();
		return activityNodeActivation_outgoingEdges_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation_running_Value createActivityNodeActivation_running_Value() {
		ActivityNodeActivation_running_ValueImpl activityNodeActivation_running_Value = new ActivityNodeActivation_running_ValueImpl();
		return activityNodeActivation_running_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue_value_BooleanValue_Value createBooleanValue_value_BooleanValue_Value() {
		BooleanValue_value_BooleanValue_ValueImpl booleanValue_value_BooleanValue_Value = new BooleanValue_value_BooleanValue_ValueImpl();
		return booleanValue_value_BooleanValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActionActivation_callExecutions_Value createCallActionActivation_callExecutions_Value() {
		CallActionActivation_callExecutions_ValueImpl callActionActivation_callExecutions_Value = new CallActionActivation_callExecutions_ValueImpl();
		return callActionActivation_callExecutions_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundValue_featureValues_Value createCompoundValue_featureValues_Value() {
		CompoundValue_featureValues_ValueImpl compoundValue_featureValues_Value = new CompoundValue_featureValues_ValueImpl();
		return compoundValue_featureValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration_semanticVisitor_Value createElementConfiguration_semanticVisitor_Value() {
		ElementConfiguration_semanticVisitor_ValueImpl elementConfiguration_semanticVisitor_Value = new ElementConfiguration_semanticVisitor_ValueImpl();
		return elementConfiguration_semanticVisitor_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation_locus_Evaluation_Value createEvaluation_locus_Evaluation_Value() {
		Evaluation_locus_Evaluation_ValueImpl evaluation_locus_Evaluation_Value = new Evaluation_locus_Evaluation_ValueImpl();
		return evaluation_locus_Evaluation_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation_specification_Evaluation_Value createEvaluation_specification_Evaluation_Value() {
		Evaluation_specification_Evaluation_ValueImpl evaluation_specification_Evaluation_Value = new Evaluation_specification_Evaluation_ValueImpl();
		return evaluation_specification_Evaluation_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment_locus_ExecutionEnvironment_Value createExecutionEnvironment_locus_ExecutionEnvironment_Value() {
		ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl executionEnvironment_locus_ExecutionEnvironment_Value = new ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl();
		return executionEnvironment_locus_ExecutionEnvironment_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory_builtInTypes_Value createExecutionFactory_builtInTypes_Value() {
		ExecutionFactory_builtInTypes_ValueImpl executionFactory_builtInTypes_Value = new ExecutionFactory_builtInTypes_ValueImpl();
		return executionFactory_builtInTypes_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory_locus_ExecutionFactory_Value createExecutionFactory_locus_ExecutionFactory_Value() {
		ExecutionFactory_locus_ExecutionFactory_ValueImpl executionFactory_locus_ExecutionFactory_Value = new ExecutionFactory_locus_ExecutionFactory_ValueImpl();
		return executionFactory_locus_ExecutionFactory_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory_primitiveBehaviorPrototypes_Value createExecutionFactory_primitiveBehaviorPrototypes_Value() {
		ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl executionFactory_primitiveBehaviorPrototypes_Value = new ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl();
		return executionFactory_primitiveBehaviorPrototypes_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_context_Value createExecution_context_Value() {
		Execution_context_ValueImpl execution_context_Value = new Execution_context_ValueImpl();
		return execution_context_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_parameterValues_Value createExecution_parameterValues_Value() {
		Execution_parameterValues_ValueImpl execution_parameterValues_Value = new Execution_parameterValues_ValueImpl();
		return execution_parameterValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor_locus_Executor_Value createExecutor_locus_Executor_Value() {
		Executor_locus_Executor_ValueImpl executor_locus_Executor_Value = new Executor_locus_Executor_ValueImpl();
		return executor_locus_Executor_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionalValue_locus_ExtensionalValue_Value createExtensionalValue_locus_ExtensionalValue_Value() {
		ExtensionalValue_locus_ExtensionalValue_ValueImpl extensionalValue_locus_ExtensionalValue_Value = new ExtensionalValue_locus_ExtensionalValue_ValueImpl();
		return extensionalValue_locus_ExtensionalValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue_feature_Value createFeatureValue_feature_Value() {
		FeatureValue_feature_ValueImpl featureValue_feature_Value = new FeatureValue_feature_ValueImpl();
		return featureValue_feature_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue_position_Value createFeatureValue_position_Value() {
		FeatureValue_position_ValueImpl featureValue_position_Value = new FeatureValue_position_ValueImpl();
		return featureValue_position_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue_values_FeatureValue_Value createFeatureValue_values_FeatureValue_Value() {
		FeatureValue_values_FeatureValue_ValueImpl featureValue_values_FeatureValue_Value = new FeatureValue_values_FeatureValue_ValueImpl();
		return featureValue_values_FeatureValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_baseTokenIsWithdrawn_Value createForkedToken_baseTokenIsWithdrawn_Value() {
		ForkedToken_baseTokenIsWithdrawn_ValueImpl forkedToken_baseTokenIsWithdrawn_Value = new ForkedToken_baseTokenIsWithdrawn_ValueImpl();
		return forkedToken_baseTokenIsWithdrawn_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_baseToken_Value createForkedToken_baseToken_Value() {
		ForkedToken_baseToken_ValueImpl forkedToken_baseToken_Value = new ForkedToken_baseToken_ValueImpl();
		return forkedToken_baseToken_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_remainingOffersCount_Value createForkedToken_remainingOffersCount_Value() {
		ForkedToken_remainingOffersCount_ValueImpl forkedToken_remainingOffersCount_Value = new ForkedToken_remainingOffersCount_ValueImpl();
		return forkedToken_remainingOffersCount_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameterValues_name_Value createInputParameterValues_name_Value() {
		InputParameterValues_name_ValueImpl inputParameterValues_name_Value = new InputParameterValues_name_ValueImpl();
		return inputParameterValues_name_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameterValues_parameterValues_Value createInputParameterValues_parameterValues_Value() {
		InputParameterValues_parameterValues_ValueImpl inputParameterValues_parameterValues_Value = new InputParameterValues_parameterValues_ValueImpl();
		return inputParameterValues_parameterValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue_value_IntegerValue_Value createIntegerValue_value_IntegerValue_Value() {
		IntegerValue_value_IntegerValue_ValueImpl integerValue_value_IntegerValue_Value = new IntegerValue_value_IntegerValue_ValueImpl();
		return integerValue_value_IntegerValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus_executor_Value createLocus_executor_Value() {
		Locus_executor_ValueImpl locus_executor_Value = new Locus_executor_ValueImpl();
		return locus_executor_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus_extensionalValues_Value createLocus_extensionalValues_Value() {
		Locus_extensionalValues_ValueImpl locus_extensionalValues_Value = new Locus_extensionalValues_ValueImpl();
		return locus_extensionalValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus_factory_Value createLocus_factory_Value() {
		Locus_factory_ValueImpl locus_factory_Value = new Locus_factory_ValueImpl();
		return locus_factory_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeActivation_offeredTokenCount_Value createObjectNodeActivation_offeredTokenCount_Value() {
		ObjectNodeActivation_offeredTokenCount_ValueImpl objectNodeActivation_offeredTokenCount_Value = new ObjectNodeActivation_offeredTokenCount_ValueImpl();
		return objectNodeActivation_offeredTokenCount_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectToken_value_Value createObjectToken_value_Value() {
		ObjectToken_value_ValueImpl objectToken_value_Value = new ObjectToken_value_ValueImpl();
		return objectToken_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_types_Value createObject_types_Value() {
		Object_types_ValueImpl object_types_Value = new Object_types_ValueImpl();
		return object_types_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer_offeredTokens_Value createOffer_offeredTokens_Value() {
		Offer_offeredTokens_ValueImpl offer_offeredTokens_Value = new Offer_offeredTokens_ValueImpl();
		return offer_offeredTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue_parameter_ParameterValue_Value createParameterValue_parameter_ParameterValue_Value() {
		ParameterValue_parameter_ParameterValue_ValueImpl parameterValue_parameter_ParameterValue_Value = new ParameterValue_parameter_ParameterValue_ValueImpl();
		return parameterValue_parameter_ParameterValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue_values_ParameterValue_Value createParameterValue_values_ParameterValue_Value() {
		ParameterValue_values_ParameterValue_ValueImpl parameterValue_values_ParameterValue_Value = new ParameterValue_values_ParameterValue_ValueImpl();
		return parameterValue_values_ParameterValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinActivation_actionActivation_Value createPinActivation_actionActivation_Value() {
		PinActivation_actionActivation_ValueImpl pinActivation_actionActivation_Value = new PinActivation_actionActivation_ValueImpl();
		return pinActivation_actionActivation_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinActivation_count_temp_Value createPinActivation_count_temp_Value() {
		PinActivation_count_temp_ValueImpl pinActivation_count_temp_Value = new PinActivation_count_temp_ValueImpl();
		return pinActivation_count_temp_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValue_type_Value createPrimitiveValue_type_Value() {
		PrimitiveValue_type_ValueImpl primitiveValue_type_Value = new PrimitiveValue_type_ValueImpl();
		return primitiveValue_type_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_referent_Value createReference_referent_Value() {
		Reference_referent_ValueImpl reference_referent_Value = new Reference_referent_ValueImpl();
		return reference_referent_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVisitor_runtimeModelElement_Value createSemanticVisitor_runtimeModelElement_Value() {
		SemanticVisitor_runtimeModelElement_ValueImpl semanticVisitor_runtimeModelElement_Value = new SemanticVisitor_runtimeModelElement_ValueImpl();
		return semanticVisitor_runtimeModelElement_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_holder_Value createToken_holder_Value() {
		Token_holder_ValueImpl token_holder_Value = new Token_holder_ValueImpl();
		return token_holder_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
