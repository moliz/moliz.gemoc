/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ActionActivation_firing_Value;
import fumlConfigurationTrace.States.ActionActivation_pinActivations_Value;
import fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value;
import fumlConfigurationTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value;
import fumlConfigurationTrace.States.ActivityEdgeInstance_offers_Value;
import fumlConfigurationTrace.States.ActivityEdgeInstance_source_Value;
import fumlConfigurationTrace.States.ActivityEdgeInstance_target_Value;
import fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value;
import fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value;
import fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_running_Value;
import fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value;
import fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value;
import fumlConfigurationTrace.States.CompoundValue_featureValues_Value;
import fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value;
import fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value;
import fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value;
import fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;
import fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value;
import fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value;
import fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value;
import fumlConfigurationTrace.States.Execution_context_Value;
import fumlConfigurationTrace.States.Execution_parameterValues_Value;
import fumlConfigurationTrace.States.Executor_locus_Executor_Value;
import fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value;
import fumlConfigurationTrace.States.FeatureValue_feature_Value;
import fumlConfigurationTrace.States.FeatureValue_position_Value;
import fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value;
import fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value;
import fumlConfigurationTrace.States.ForkedToken_baseToken_Value;
import fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value;
import fumlConfigurationTrace.States.InputParameterValues_name_Value;
import fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value;
import fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value;
import fumlConfigurationTrace.States.Locus_executor_Value;
import fumlConfigurationTrace.States.Locus_extensionalValues_Value;
import fumlConfigurationTrace.States.Locus_factory_Value;
import fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value;
import fumlConfigurationTrace.States.ObjectToken_value_Value;
import fumlConfigurationTrace.States.Object_types_Value;
import fumlConfigurationTrace.States.Offer_offeredTokens_Value;
import fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value;
import fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value;
import fumlConfigurationTrace.States.PinActivation_actionActivation_Value;
import fumlConfigurationTrace.States.PinActivation_count_temp_Value;
import fumlConfigurationTrace.States.PrimitiveValue_type_Value;
import fumlConfigurationTrace.States.Reference_referent_Value;
import fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;
import fumlConfigurationTrace.States.Token_holder_Value;

import fumlConfigurationTrace.Steps.SpecificStep;
import fumlConfigurationTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActionActivation_firing_Values <em>Action Activation firing Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActionActivation_pinActivations_Values <em>Action Activation pin Activations Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values <em>Activity Edge Instance edge Activity Edge Instance Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityEdgeInstance_group_ActivityEdgeInstance_Values <em>Activity Edge Instance group Activity Edge Instance Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityEdgeInstance_offers_Values <em>Activity Edge Instance offers Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityEdgeInstance_source_Values <em>Activity Edge Instance source Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityEdgeInstance_target_Values <em>Activity Edge Instance target Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityExecution_activationGroup_Values <em>Activity Execution activation Group Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivationGroup_activityExecution_Values <em>Activity Node Activation Group activity Execution Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivationGroup_edgeInstances_Values <em>Activity Node Activation Group edge Instances Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivationGroup_nodeActivations_Values <em>Activity Node Activation Group node Activations Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_group_ActivityNodeActivation_Values <em>Activity Node Activation group Activity Node Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_heldTokens_Values <em>Activity Node Activation held Tokens Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_incomingEdges_Values <em>Activity Node Activation incoming Edges Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_isRunning_Values <em>Activity Node Activation is Running Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_node_ActivityNodeActivation_Values <em>Activity Node Activation node Activity Node Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_outgoingEdges_Values <em>Activity Node Activation outgoing Edges Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getActivityNodeActivation_running_Values <em>Activity Node Activation running Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getBooleanValue_value_BooleanValue_Values <em>Boolean Value value Boolean Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getCallActionActivation_callExecutions_Values <em>Call Action Activation call Executions Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getCompoundValue_featureValues_Values <em>Compound Value feature Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getElementConfiguration_semanticVisitor_Values <em>Element Configuration semantic Visitor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getEvaluation_locus_Evaluation_Values <em>Evaluation locus Evaluation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getEvaluation_specification_Evaluation_Values <em>Evaluation specification Evaluation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecutionEnvironment_locus_ExecutionEnvironment_Values <em>Execution Environment locus Execution Environment Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecutionFactory_builtInTypes_Values <em>Execution Factory built In Types Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecutionFactory_locus_ExecutionFactory_Values <em>Execution Factory locus Execution Factory Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecutionFactory_primitiveBehaviorPrototypes_Values <em>Execution Factory primitive Behavior Prototypes Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecution_context_Values <em>Execution context Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecution_parameterValues_Values <em>Execution parameter Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExecutor_locus_Executor_Values <em>Executor locus Executor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getExtensionalValue_locus_ExtensionalValue_Values <em>Extensional Value locus Extensional Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getFeatureValue_feature_Values <em>Feature Value feature Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getFeatureValue_position_Values <em>Feature Value position Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getFeatureValue_values_FeatureValue_Values <em>Feature Value values Feature Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getForkedToken_baseTokenIsWithdrawn_Values <em>Forked Token base Token Is Withdrawn Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getInputParameterValues_name_Values <em>Input Parameter Values name Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getInputParameterValues_parameterValues_Values <em>Input Parameter Values parameter Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getIntegerValue_value_IntegerValue_Values <em>Integer Value value Integer Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getLocus_executor_Values <em>Locus executor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getLocus_extensionalValues_Values <em>Locus extensional Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getLocus_factory_Values <em>Locus factory Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getObjectNodeActivation_offeredTokenCount_Values <em>Object Node Activation offered Token Count Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getObjectToken_value_Values <em>Object Token value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getObject_types_Values <em>Object types Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getParameterValue_parameter_ParameterValue_Values <em>Parameter Value parameter Parameter Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getParameterValue_values_ParameterValue_Values <em>Parameter Value values Parameter Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getPinActivation_actionActivation_Values <em>Pin Activation action Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getPinActivation_count_temp_Values <em>Pin Activation count temp Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getPrimitiveValue_type_Values <em>Primitive Value type Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getReference_referent_Values <em>Reference referent Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.StateImpl#getToken_holder_Values <em>Token holder Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getActionActivation_firing_Values() <em>Action Activation firing Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivation_firing_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionActivation_firing_Value> actionActivation_firing_Values;

	/**
	 * The cached value of the '{@link #getActionActivation_pinActivations_Values() <em>Action Activation pin Activations Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivation_pinActivations_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionActivation_pinActivations_Value> actionActivation_pinActivations_Values;

	/**
	 * The cached value of the '{@link #getActivityEdgeInstance_edge_ActivityEdgeInstance_Values() <em>Activity Edge Instance edge Activity Edge Instance Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> activityEdgeInstance_edge_ActivityEdgeInstance_Values;

	/**
	 * The cached value of the '{@link #getActivityEdgeInstance_group_ActivityEdgeInstance_Values() <em>Activity Edge Instance group Activity Edge Instance Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> activityEdgeInstance_group_ActivityEdgeInstance_Values;

	/**
	 * The cached value of the '{@link #getActivityEdgeInstance_offers_Values() <em>Activity Edge Instance offers Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdgeInstance_offers_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_offers_Value> activityEdgeInstance_offers_Values;

	/**
	 * The cached value of the '{@link #getActivityEdgeInstance_source_Values() <em>Activity Edge Instance source Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdgeInstance_source_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_source_Value> activityEdgeInstance_source_Values;

	/**
	 * The cached value of the '{@link #getActivityEdgeInstance_target_Values() <em>Activity Edge Instance target Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdgeInstance_target_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_target_Value> activityEdgeInstance_target_Values;

	/**
	 * The cached value of the '{@link #getActivityExecution_activationGroup_Values() <em>Activity Execution activation Group Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExecution_activationGroup_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityExecution_activationGroup_Value> activityExecution_activationGroup_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivationGroup_activityExecution_Values() <em>Activity Node Activation Group activity Execution Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivationGroup_activityExecution_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_activityExecution_Value> activityNodeActivationGroup_activityExecution_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivationGroup_edgeInstances_Values() <em>Activity Node Activation Group edge Instances Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivationGroup_edgeInstances_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_edgeInstances_Value> activityNodeActivationGroup_edgeInstances_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivationGroup_nodeActivations_Values() <em>Activity Node Activation Group node Activations Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivationGroup_nodeActivations_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_nodeActivations_Value> activityNodeActivationGroup_nodeActivations_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_group_ActivityNodeActivation_Values() <em>Activity Node Activation group Activity Node Activation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_group_ActivityNodeActivation_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> activityNodeActivation_group_ActivityNodeActivation_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_heldTokens_Values() <em>Activity Node Activation held Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_heldTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_heldTokens_Value> activityNodeActivation_heldTokens_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_incomingEdges_Values() <em>Activity Node Activation incoming Edges Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_incomingEdges_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_incomingEdges_Value> activityNodeActivation_incomingEdges_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_isRunning_Values() <em>Activity Node Activation is Running Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_isRunning_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_isRunning_Value> activityNodeActivation_isRunning_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_node_ActivityNodeActivation_Values() <em>Activity Node Activation node Activity Node Activation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_node_ActivityNodeActivation_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> activityNodeActivation_node_ActivityNodeActivation_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_outgoingEdges_Values() <em>Activity Node Activation outgoing Edges Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_outgoingEdges_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_outgoingEdges_Value> activityNodeActivation_outgoingEdges_Values;

	/**
	 * The cached value of the '{@link #getActivityNodeActivation_running_Values() <em>Activity Node Activation running Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodeActivation_running_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_running_Value> activityNodeActivation_running_Values;

	/**
	 * The cached value of the '{@link #getBooleanValue_value_BooleanValue_Values() <em>Boolean Value value Boolean Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue_value_BooleanValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_BooleanValue_Value> booleanValue_value_BooleanValue_Values;

	/**
	 * The cached value of the '{@link #getCallActionActivation_callExecutions_Values() <em>Call Action Activation call Executions Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallActionActivation_callExecutions_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<CallActionActivation_callExecutions_Value> callActionActivation_callExecutions_Values;

	/**
	 * The cached value of the '{@link #getCompoundValue_featureValues_Values() <em>Compound Value feature Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundValue_featureValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<CompoundValue_featureValues_Value> compoundValue_featureValues_Values;

	/**
	 * The cached value of the '{@link #getElementConfiguration_semanticVisitor_Values() <em>Element Configuration semantic Visitor Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementConfiguration_semanticVisitor_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementConfiguration_semanticVisitor_Value> elementConfiguration_semanticVisitor_Values;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getEvaluation_locus_Evaluation_Values() <em>Evaluation locus Evaluation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation_locus_Evaluation_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation_locus_Evaluation_Value> evaluation_locus_Evaluation_Values;

	/**
	 * The cached value of the '{@link #getEvaluation_specification_Evaluation_Values() <em>Evaluation specification Evaluation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation_specification_Evaluation_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation_specification_Evaluation_Value> evaluation_specification_Evaluation_Values;

	/**
	 * The cached value of the '{@link #getExecutionEnvironment_locus_ExecutionEnvironment_Values() <em>Execution Environment locus Execution Environment Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment_locus_ExecutionEnvironment_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> executionEnvironment_locus_ExecutionEnvironment_Values;

	/**
	 * The cached value of the '{@link #getExecutionFactory_builtInTypes_Values() <em>Execution Factory built In Types Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionFactory_builtInTypes_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_builtInTypes_Value> executionFactory_builtInTypes_Values;

	/**
	 * The cached value of the '{@link #getExecutionFactory_locus_ExecutionFactory_Values() <em>Execution Factory locus Execution Factory Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionFactory_locus_ExecutionFactory_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_locus_ExecutionFactory_Value> executionFactory_locus_ExecutionFactory_Values;

	/**
	 * The cached value of the '{@link #getExecutionFactory_primitiveBehaviorPrototypes_Values() <em>Execution Factory primitive Behavior Prototypes Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionFactory_primitiveBehaviorPrototypes_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> executionFactory_primitiveBehaviorPrototypes_Values;

	/**
	 * The cached value of the '{@link #getExecution_context_Values() <em>Execution context Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_context_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution_context_Value> execution_context_Values;

	/**
	 * The cached value of the '{@link #getExecution_parameterValues_Values() <em>Execution parameter Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_parameterValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution_parameterValues_Value> execution_parameterValues_Values;

	/**
	 * The cached value of the '{@link #getExecutor_locus_Executor_Values() <em>Executor locus Executor Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor_locus_Executor_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor_locus_Executor_Value> executor_locus_Executor_Values;

	/**
	 * The cached value of the '{@link #getExtensionalValue_locus_ExtensionalValue_Values() <em>Extensional Value locus Extensional Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionalValue_locus_ExtensionalValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionalValue_locus_ExtensionalValue_Value> extensionalValue_locus_ExtensionalValue_Values;

	/**
	 * The cached value of the '{@link #getFeatureValue_feature_Values() <em>Feature Value feature Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue_feature_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_feature_Value> featureValue_feature_Values;

	/**
	 * The cached value of the '{@link #getFeatureValue_position_Values() <em>Feature Value position Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue_position_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_position_Value> featureValue_position_Values;

	/**
	 * The cached value of the '{@link #getFeatureValue_values_FeatureValue_Values() <em>Feature Value values Feature Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue_values_FeatureValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_values_FeatureValue_Value> featureValue_values_FeatureValue_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_baseTokenIsWithdrawn_Values() <em>Forked Token base Token Is Withdrawn Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_baseTokenIsWithdrawn_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseTokenIsWithdrawn_Value> forkedToken_baseTokenIsWithdrawn_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_baseToken_Values() <em>Forked Token base Token Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_baseToken_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> forkedToken_baseToken_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_remainingOffersCount_Values() <em>Forked Token remaining Offers Count Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_remainingOffersCount_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> forkedToken_remainingOffersCount_Values;

	/**
	 * The cached value of the '{@link #getInputParameterValues_name_Values() <em>Input Parameter Values name Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameterValues_name_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameterValues_name_Value> inputParameterValues_name_Values;

	/**
	 * The cached value of the '{@link #getInputParameterValues_parameterValues_Values() <em>Input Parameter Values parameter Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameterValues_parameterValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameterValues_parameterValues_Value> inputParameterValues_parameterValues_Values;

	/**
	 * The cached value of the '{@link #getIntegerValue_value_IntegerValue_Values() <em>Integer Value value Integer Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue_value_IntegerValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValue_value_IntegerValue_Value> integerValue_value_IntegerValue_Values;

	/**
	 * The cached value of the '{@link #getLocus_executor_Values() <em>Locus executor Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_executor_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_executor_Value> locus_executor_Values;

	/**
	 * The cached value of the '{@link #getLocus_extensionalValues_Values() <em>Locus extensional Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_extensionalValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_extensionalValues_Value> locus_extensionalValues_Values;

	/**
	 * The cached value of the '{@link #getLocus_factory_Values() <em>Locus factory Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_factory_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_factory_Value> locus_factory_Values;

	/**
	 * The cached value of the '{@link #getObjectNodeActivation_offeredTokenCount_Values() <em>Object Node Activation offered Token Count Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectNodeActivation_offeredTokenCount_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectNodeActivation_offeredTokenCount_Value> objectNodeActivation_offeredTokenCount_Values;

	/**
	 * The cached value of the '{@link #getObjectToken_value_Values() <em>Object Token value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectToken_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectToken_value_Value> objectToken_value_Values;

	/**
	 * The cached value of the '{@link #getObject_types_Values() <em>Object types Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject_types_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Object_types_Value> object_types_Values;

	/**
	 * The cached value of the '{@link #getOffer_offeredTokens_Values() <em>Offer offered Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer_offeredTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer_offeredTokens_Value> offer_offeredTokens_Values;

	/**
	 * The cached value of the '{@link #getParameterValue_parameter_ParameterValue_Values() <em>Parameter Value parameter Parameter Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue_parameter_ParameterValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue_parameter_ParameterValue_Value> parameterValue_parameter_ParameterValue_Values;

	/**
	 * The cached value of the '{@link #getParameterValue_values_ParameterValue_Values() <em>Parameter Value values Parameter Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue_values_ParameterValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue_values_ParameterValue_Value> parameterValue_values_ParameterValue_Values;

	/**
	 * The cached value of the '{@link #getPinActivation_actionActivation_Values() <em>Pin Activation action Activation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinActivation_actionActivation_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<PinActivation_actionActivation_Value> pinActivation_actionActivation_Values;

	/**
	 * The cached value of the '{@link #getPinActivation_count_temp_Values() <em>Pin Activation count temp Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinActivation_count_temp_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<PinActivation_count_temp_Value> pinActivation_count_temp_Values;

	/**
	 * The cached value of the '{@link #getPrimitiveValue_type_Values() <em>Primitive Value type Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveValue_type_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveValue_type_Value> primitiveValue_type_Values;

	/**
	 * The cached value of the '{@link #getReference_referent_Values() <em>Reference referent Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_referent_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference_referent_Value> reference_referent_Values;

	/**
	 * The cached value of the '{@link #getSemanticVisitor_runtimeModelElement_Values() <em>Semantic Visitor runtime Model Element Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVisitor_runtimeModelElement_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticVisitor_runtimeModelElement_Value> semanticVisitor_runtimeModelElement_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getToken_holder_Values() <em>Token holder Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken_holder_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Token_holder_Value> token_holder_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionActivation_firing_Value> getActionActivation_firing_Values() {
		if (actionActivation_firing_Values == null) {
			actionActivation_firing_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActionActivation_firing_Value>(ActionActivation_firing_Value.class, this, StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES, StatesPackage.ACTION_ACTIVATION_FIRING_VALUE__STATES);
		}
		return actionActivation_firing_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionActivation_pinActivations_Value> getActionActivation_pinActivations_Values() {
		if (actionActivation_pinActivations_Values == null) {
			actionActivation_pinActivations_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActionActivation_pinActivations_Value>(ActionActivation_pinActivations_Value.class, this, StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES);
		}
		return actionActivation_pinActivations_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> getActivityEdgeInstance_edge_ActivityEdgeInstance_Values() {
		if (activityEdgeInstance_edge_ActivityEdgeInstance_Values == null) {
			activityEdgeInstance_edge_ActivityEdgeInstance_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value>(ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES, StatesPackage.ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__STATES);
		}
		return activityEdgeInstance_edge_ActivityEdgeInstance_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> getActivityEdgeInstance_group_ActivityEdgeInstance_Values() {
		if (activityEdgeInstance_group_ActivityEdgeInstance_Values == null) {
			activityEdgeInstance_group_ActivityEdgeInstance_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdgeInstance_group_ActivityEdgeInstance_Value>(ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES);
		}
		return activityEdgeInstance_group_ActivityEdgeInstance_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_offers_Value> getActivityEdgeInstance_offers_Values() {
		if (activityEdgeInstance_offers_Values == null) {
			activityEdgeInstance_offers_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdgeInstance_offers_Value>(ActivityEdgeInstance_offers_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES, StatesPackage.ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__STATES);
		}
		return activityEdgeInstance_offers_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_source_Value> getActivityEdgeInstance_source_Values() {
		if (activityEdgeInstance_source_Values == null) {
			activityEdgeInstance_source_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdgeInstance_source_Value>(ActivityEdgeInstance_source_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES, StatesPackage.ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__STATES);
		}
		return activityEdgeInstance_source_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_target_Value> getActivityEdgeInstance_target_Values() {
		if (activityEdgeInstance_target_Values == null) {
			activityEdgeInstance_target_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdgeInstance_target_Value>(ActivityEdgeInstance_target_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES, StatesPackage.ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__STATES);
		}
		return activityEdgeInstance_target_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityExecution_activationGroup_Value> getActivityExecution_activationGroup_Values() {
		if (activityExecution_activationGroup_Values == null) {
			activityExecution_activationGroup_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityExecution_activationGroup_Value>(ActivityExecution_activationGroup_Value.class, this, StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES, StatesPackage.ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__STATES);
		}
		return activityExecution_activationGroup_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_activityExecution_Value> getActivityNodeActivationGroup_activityExecution_Values() {
		if (activityNodeActivationGroup_activityExecution_Values == null) {
			activityNodeActivationGroup_activityExecution_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivationGroup_activityExecution_Value>(ActivityNodeActivationGroup_activityExecution_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__STATES);
		}
		return activityNodeActivationGroup_activityExecution_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_edgeInstances_Value> getActivityNodeActivationGroup_edgeInstances_Values() {
		if (activityNodeActivationGroup_edgeInstances_Values == null) {
			activityNodeActivationGroup_edgeInstances_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivationGroup_edgeInstances_Value>(ActivityNodeActivationGroup_edgeInstances_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES);
		}
		return activityNodeActivationGroup_edgeInstances_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_nodeActivations_Value> getActivityNodeActivationGroup_nodeActivations_Values() {
		if (activityNodeActivationGroup_nodeActivations_Values == null) {
			activityNodeActivationGroup_nodeActivations_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivationGroup_nodeActivations_Value>(ActivityNodeActivationGroup_nodeActivations_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__STATES);
		}
		return activityNodeActivationGroup_nodeActivations_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> getActivityNodeActivation_group_ActivityNodeActivation_Values() {
		if (activityNodeActivation_group_ActivityNodeActivation_Values == null) {
			activityNodeActivation_group_ActivityNodeActivation_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_group_ActivityNodeActivation_Value>(ActivityNodeActivation_group_ActivityNodeActivation_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__STATES);
		}
		return activityNodeActivation_group_ActivityNodeActivation_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_heldTokens_Value> getActivityNodeActivation_heldTokens_Values() {
		if (activityNodeActivation_heldTokens_Values == null) {
			activityNodeActivation_heldTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_heldTokens_Value>(ActivityNodeActivation_heldTokens_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__STATES);
		}
		return activityNodeActivation_heldTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_incomingEdges_Value> getActivityNodeActivation_incomingEdges_Values() {
		if (activityNodeActivation_incomingEdges_Values == null) {
			activityNodeActivation_incomingEdges_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_incomingEdges_Value>(ActivityNodeActivation_incomingEdges_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__STATES);
		}
		return activityNodeActivation_incomingEdges_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_isRunning_Value> getActivityNodeActivation_isRunning_Values() {
		if (activityNodeActivation_isRunning_Values == null) {
			activityNodeActivation_isRunning_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_isRunning_Value>(ActivityNodeActivation_isRunning_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__STATES);
		}
		return activityNodeActivation_isRunning_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> getActivityNodeActivation_node_ActivityNodeActivation_Values() {
		if (activityNodeActivation_node_ActivityNodeActivation_Values == null) {
			activityNodeActivation_node_ActivityNodeActivation_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_node_ActivityNodeActivation_Value>(ActivityNodeActivation_node_ActivityNodeActivation_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__STATES);
		}
		return activityNodeActivation_node_ActivityNodeActivation_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_outgoingEdges_Value> getActivityNodeActivation_outgoingEdges_Values() {
		if (activityNodeActivation_outgoingEdges_Values == null) {
			activityNodeActivation_outgoingEdges_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_outgoingEdges_Value>(ActivityNodeActivation_outgoingEdges_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES);
		}
		return activityNodeActivation_outgoingEdges_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_running_Value> getActivityNodeActivation_running_Values() {
		if (activityNodeActivation_running_Values == null) {
			activityNodeActivation_running_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNodeActivation_running_Value>(ActivityNodeActivation_running_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__STATES);
		}
		return activityNodeActivation_running_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_BooleanValue_Value> getBooleanValue_value_BooleanValue_Values() {
		if (booleanValue_value_BooleanValue_Values == null) {
			booleanValue_value_BooleanValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanValue_value_BooleanValue_Value>(BooleanValue_value_BooleanValue_Value.class, this, StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES);
		}
		return booleanValue_value_BooleanValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallActionActivation_callExecutions_Value> getCallActionActivation_callExecutions_Values() {
		if (callActionActivation_callExecutions_Values == null) {
			callActionActivation_callExecutions_Values = new EObjectWithInverseResolvingEList.ManyInverse<CallActionActivation_callExecutions_Value>(CallActionActivation_callExecutions_Value.class, this, StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES);
		}
		return callActionActivation_callExecutions_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompoundValue_featureValues_Value> getCompoundValue_featureValues_Values() {
		if (compoundValue_featureValues_Values == null) {
			compoundValue_featureValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<CompoundValue_featureValues_Value>(CompoundValue_featureValues_Value.class, this, StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES, StatesPackage.COMPOUND_VALUE_FEATURE_VALUES_VALUE__STATES);
		}
		return compoundValue_featureValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementConfiguration_semanticVisitor_Value> getElementConfiguration_semanticVisitor_Values() {
		if (elementConfiguration_semanticVisitor_Values == null) {
			elementConfiguration_semanticVisitor_Values = new EObjectWithInverseResolvingEList.ManyInverse<ElementConfiguration_semanticVisitor_Value>(ElementConfiguration_semanticVisitor_Value.class, this, StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES);
		}
		return elementConfiguration_semanticVisitor_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation_locus_Evaluation_Value> getEvaluation_locus_Evaluation_Values() {
		if (evaluation_locus_Evaluation_Values == null) {
			evaluation_locus_Evaluation_Values = new EObjectWithInverseResolvingEList.ManyInverse<Evaluation_locus_Evaluation_Value>(Evaluation_locus_Evaluation_Value.class, this, StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES, StatesPackage.EVALUATION_LOCUS_EVALUATION_VALUE__STATES);
		}
		return evaluation_locus_Evaluation_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation_specification_Evaluation_Value> getEvaluation_specification_Evaluation_Values() {
		if (evaluation_specification_Evaluation_Values == null) {
			evaluation_specification_Evaluation_Values = new EObjectWithInverseResolvingEList.ManyInverse<Evaluation_specification_Evaluation_Value>(Evaluation_specification_Evaluation_Value.class, this, StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES);
		}
		return evaluation_specification_Evaluation_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> getExecutionEnvironment_locus_ExecutionEnvironment_Values() {
		if (executionEnvironment_locus_ExecutionEnvironment_Values == null) {
			executionEnvironment_locus_ExecutionEnvironment_Values = new EObjectWithInverseResolvingEList.ManyInverse<ExecutionEnvironment_locus_ExecutionEnvironment_Value>(ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, this, StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES);
		}
		return executionEnvironment_locus_ExecutionEnvironment_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_builtInTypes_Value> getExecutionFactory_builtInTypes_Values() {
		if (executionFactory_builtInTypes_Values == null) {
			executionFactory_builtInTypes_Values = new EObjectWithInverseResolvingEList.ManyInverse<ExecutionFactory_builtInTypes_Value>(ExecutionFactory_builtInTypes_Value.class, this, StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES);
		}
		return executionFactory_builtInTypes_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_locus_ExecutionFactory_Value> getExecutionFactory_locus_ExecutionFactory_Values() {
		if (executionFactory_locus_ExecutionFactory_Values == null) {
			executionFactory_locus_ExecutionFactory_Values = new EObjectWithInverseResolvingEList.ManyInverse<ExecutionFactory_locus_ExecutionFactory_Value>(ExecutionFactory_locus_ExecutionFactory_Value.class, this, StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES);
		}
		return executionFactory_locus_ExecutionFactory_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> getExecutionFactory_primitiveBehaviorPrototypes_Values() {
		if (executionFactory_primitiveBehaviorPrototypes_Values == null) {
			executionFactory_primitiveBehaviorPrototypes_Values = new EObjectWithInverseResolvingEList.ManyInverse<ExecutionFactory_primitiveBehaviorPrototypes_Value>(ExecutionFactory_primitiveBehaviorPrototypes_Value.class, this, StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES, StatesPackage.EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__STATES);
		}
		return executionFactory_primitiveBehaviorPrototypes_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution_context_Value> getExecution_context_Values() {
		if (execution_context_Values == null) {
			execution_context_Values = new EObjectWithInverseResolvingEList.ManyInverse<Execution_context_Value>(Execution_context_Value.class, this, StatesPackage.STATE__EXECUTION_CONTEXT_VALUES, StatesPackage.EXECUTION_CONTEXT_VALUE__STATES);
		}
		return execution_context_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution_parameterValues_Value> getExecution_parameterValues_Values() {
		if (execution_parameterValues_Values == null) {
			execution_parameterValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<Execution_parameterValues_Value>(Execution_parameterValues_Value.class, this, StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES);
		}
		return execution_parameterValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Executor_locus_Executor_Value> getExecutor_locus_Executor_Values() {
		if (executor_locus_Executor_Values == null) {
			executor_locus_Executor_Values = new EObjectWithInverseResolvingEList.ManyInverse<Executor_locus_Executor_Value>(Executor_locus_Executor_Value.class, this, StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES);
		}
		return executor_locus_Executor_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionalValue_locus_ExtensionalValue_Value> getExtensionalValue_locus_ExtensionalValue_Values() {
		if (extensionalValue_locus_ExtensionalValue_Values == null) {
			extensionalValue_locus_ExtensionalValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<ExtensionalValue_locus_ExtensionalValue_Value>(ExtensionalValue_locus_ExtensionalValue_Value.class, this, StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES);
		}
		return extensionalValue_locus_ExtensionalValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_feature_Value> getFeatureValue_feature_Values() {
		if (featureValue_feature_Values == null) {
			featureValue_feature_Values = new EObjectWithInverseResolvingEList.ManyInverse<FeatureValue_feature_Value>(FeatureValue_feature_Value.class, this, StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES, StatesPackage.FEATURE_VALUE_FEATURE_VALUE__STATES);
		}
		return featureValue_feature_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_position_Value> getFeatureValue_position_Values() {
		if (featureValue_position_Values == null) {
			featureValue_position_Values = new EObjectWithInverseResolvingEList.ManyInverse<FeatureValue_position_Value>(FeatureValue_position_Value.class, this, StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES, StatesPackage.FEATURE_VALUE_POSITION_VALUE__STATES);
		}
		return featureValue_position_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_values_FeatureValue_Value> getFeatureValue_values_FeatureValue_Values() {
		if (featureValue_values_FeatureValue_Values == null) {
			featureValue_values_FeatureValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<FeatureValue_values_FeatureValue_Value>(FeatureValue_values_FeatureValue_Value.class, this, StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES);
		}
		return featureValue_values_FeatureValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseTokenIsWithdrawn_Value> getForkedToken_baseTokenIsWithdrawn_Values() {
		if (forkedToken_baseTokenIsWithdrawn_Values == null) {
			forkedToken_baseTokenIsWithdrawn_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_baseTokenIsWithdrawn_Value>(ForkedToken_baseTokenIsWithdrawn_Value.class, this, StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES);
		}
		return forkedToken_baseTokenIsWithdrawn_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values() {
		if (forkedToken_baseToken_Values == null) {
			forkedToken_baseToken_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);
		}
		return forkedToken_baseToken_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values() {
		if (forkedToken_remainingOffersCount_Values == null) {
			forkedToken_remainingOffersCount_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);
		}
		return forkedToken_remainingOffersCount_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameterValues_name_Value> getInputParameterValues_name_Values() {
		if (inputParameterValues_name_Values == null) {
			inputParameterValues_name_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputParameterValues_name_Value>(InputParameterValues_name_Value.class, this, StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES, StatesPackage.INPUT_PARAMETER_VALUES_NAME_VALUE__STATES);
		}
		return inputParameterValues_name_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameterValues_parameterValues_Value> getInputParameterValues_parameterValues_Values() {
		if (inputParameterValues_parameterValues_Values == null) {
			inputParameterValues_parameterValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputParameterValues_parameterValues_Value>(InputParameterValues_parameterValues_Value.class, this, StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES);
		}
		return inputParameterValues_parameterValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValue_value_IntegerValue_Value> getIntegerValue_value_IntegerValue_Values() {
		if (integerValue_value_IntegerValue_Values == null) {
			integerValue_value_IntegerValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerValue_value_IntegerValue_Value>(IntegerValue_value_IntegerValue_Value.class, this, StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES, StatesPackage.INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__STATES);
		}
		return integerValue_value_IntegerValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_executor_Value> getLocus_executor_Values() {
		if (locus_executor_Values == null) {
			locus_executor_Values = new EObjectWithInverseResolvingEList.ManyInverse<Locus_executor_Value>(Locus_executor_Value.class, this, StatesPackage.STATE__LOCUS_EXECUTOR_VALUES, StatesPackage.LOCUS_EXECUTOR_VALUE__STATES);
		}
		return locus_executor_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_extensionalValues_Value> getLocus_extensionalValues_Values() {
		if (locus_extensionalValues_Values == null) {
			locus_extensionalValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<Locus_extensionalValues_Value>(Locus_extensionalValues_Value.class, this, StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES, StatesPackage.LOCUS_EXTENSIONAL_VALUES_VALUE__STATES);
		}
		return locus_extensionalValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_factory_Value> getLocus_factory_Values() {
		if (locus_factory_Values == null) {
			locus_factory_Values = new EObjectWithInverseResolvingEList.ManyInverse<Locus_factory_Value>(Locus_factory_Value.class, this, StatesPackage.STATE__LOCUS_FACTORY_VALUES, StatesPackage.LOCUS_FACTORY_VALUE__STATES);
		}
		return locus_factory_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectNodeActivation_offeredTokenCount_Value> getObjectNodeActivation_offeredTokenCount_Values() {
		if (objectNodeActivation_offeredTokenCount_Values == null) {
			objectNodeActivation_offeredTokenCount_Values = new EObjectWithInverseResolvingEList.ManyInverse<ObjectNodeActivation_offeredTokenCount_Value>(ObjectNodeActivation_offeredTokenCount_Value.class, this, StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES, StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES);
		}
		return objectNodeActivation_offeredTokenCount_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectToken_value_Value> getObjectToken_value_Values() {
		if (objectToken_value_Values == null) {
			objectToken_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<ObjectToken_value_Value>(ObjectToken_value_Value.class, this, StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES, StatesPackage.OBJECT_TOKEN_VALUE_VALUE__STATES);
		}
		return objectToken_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object_types_Value> getObject_types_Values() {
		if (object_types_Values == null) {
			object_types_Values = new EObjectWithInverseResolvingEList.ManyInverse<Object_types_Value>(Object_types_Value.class, this, StatesPackage.STATE__OBJECT_TYPES_VALUES, StatesPackage.OBJECT_TYPES_VALUE__STATES);
		}
		return object_types_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values() {
		if (offer_offeredTokens_Values == null) {
			offer_offeredTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<Offer_offeredTokens_Value>(Offer_offeredTokens_Value.class, this, StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES, StatesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES);
		}
		return offer_offeredTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue_parameter_ParameterValue_Value> getParameterValue_parameter_ParameterValue_Values() {
		if (parameterValue_parameter_ParameterValue_Values == null) {
			parameterValue_parameter_ParameterValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<ParameterValue_parameter_ParameterValue_Value>(ParameterValue_parameter_ParameterValue_Value.class, this, StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES);
		}
		return parameterValue_parameter_ParameterValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue_values_ParameterValue_Value> getParameterValue_values_ParameterValue_Values() {
		if (parameterValue_values_ParameterValue_Values == null) {
			parameterValue_values_ParameterValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<ParameterValue_values_ParameterValue_Value>(ParameterValue_values_ParameterValue_Value.class, this, StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES, StatesPackage.PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__STATES);
		}
		return parameterValue_values_ParameterValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation_actionActivation_Value> getPinActivation_actionActivation_Values() {
		if (pinActivation_actionActivation_Values == null) {
			pinActivation_actionActivation_Values = new EObjectWithInverseResolvingEList.ManyInverse<PinActivation_actionActivation_Value>(PinActivation_actionActivation_Value.class, this, StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES);
		}
		return pinActivation_actionActivation_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation_count_temp_Value> getPinActivation_count_temp_Values() {
		if (pinActivation_count_temp_Values == null) {
			pinActivation_count_temp_Values = new EObjectWithInverseResolvingEList.ManyInverse<PinActivation_count_temp_Value>(PinActivation_count_temp_Value.class, this, StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES);
		}
		return pinActivation_count_temp_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveValue_type_Value> getPrimitiveValue_type_Values() {
		if (primitiveValue_type_Values == null) {
			primitiveValue_type_Values = new EObjectWithInverseResolvingEList.ManyInverse<PrimitiveValue_type_Value>(PrimitiveValue_type_Value.class, this, StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES, StatesPackage.PRIMITIVE_VALUE_TYPE_VALUE__STATES);
		}
		return primitiveValue_type_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference_referent_Value> getReference_referent_Values() {
		if (reference_referent_Values == null) {
			reference_referent_Values = new EObjectWithInverseResolvingEList.ManyInverse<Reference_referent_Value>(Reference_referent_Value.class, this, StatesPackage.STATE__REFERENCE_REFERENT_VALUES, StatesPackage.REFERENCE_REFERENT_VALUE__STATES);
		}
		return reference_referent_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVisitor_runtimeModelElement_Value> getSemanticVisitor_runtimeModelElement_Values() {
		if (semanticVisitor_runtimeModelElement_Values == null) {
			semanticVisitor_runtimeModelElement_Values = new EObjectWithInverseResolvingEList.ManyInverse<SemanticVisitor_runtimeModelElement_Value>(SemanticVisitor_runtimeModelElement_Value.class, this, StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES);
		}
		return semanticVisitor_runtimeModelElement_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token_holder_Value> getToken_holder_Values() {
		if (token_holder_Values == null) {
			token_holder_Values = new EObjectWithInverseResolvingEList.ManyInverse<Token_holder_Value>(Token_holder_Value.class, this, StatesPackage.STATE__TOKEN_HOLDER_VALUES, StatesPackage.TOKEN_HOLDER_VALUE__STATES);
		}
		return token_holder_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActionActivation_firing_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActionActivation_pinActivations_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdgeInstance_group_ActivityEdgeInstance_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdgeInstance_offers_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdgeInstance_source_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdgeInstance_target_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityExecution_activationGroup_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivationGroup_activityExecution_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivationGroup_edgeInstances_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivationGroup_nodeActivations_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_group_ActivityNodeActivation_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_heldTokens_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_incomingEdges_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_isRunning_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_node_ActivityNodeActivation_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_outgoingEdges_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNodeActivation_running_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanValue_value_BooleanValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallActionActivation_callExecutions_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompoundValue_featureValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementConfiguration_semanticVisitor_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluation_locus_Evaluation_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluation_specification_Evaluation_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutionEnvironment_locus_ExecutionEnvironment_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutionFactory_builtInTypes_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutionFactory_locus_ExecutionFactory_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutionFactory_primitiveBehaviorPrototypes_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecution_context_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecution_parameterValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutor_locus_Executor_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionalValue_locus_ExtensionalValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureValue_feature_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureValue_position_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureValue_values_FeatureValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_baseTokenIsWithdrawn_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_baseToken_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputParameterValues_name_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputParameterValues_parameterValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerValue_value_IntegerValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_executor_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_extensionalValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_factory_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectNodeActivation_offeredTokenCount_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectToken_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObject_types_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffer_offeredTokens_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterValue_parameter_ParameterValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterValue_values_ParameterValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPinActivation_actionActivation_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPinActivation_count_temp_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimitiveValue_type_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReference_referent_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemanticVisitor_runtimeModelElement_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToken_holder_Values()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return ((InternalEList<?>)getActionActivation_firing_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				return ((InternalEList<?>)getActionActivation_pinActivations_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				return ((InternalEList<?>)getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				return ((InternalEList<?>)getActivityEdgeInstance_group_ActivityEdgeInstance_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				return ((InternalEList<?>)getActivityEdgeInstance_offers_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				return ((InternalEList<?>)getActivityEdgeInstance_source_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				return ((InternalEList<?>)getActivityEdgeInstance_target_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				return ((InternalEList<?>)getActivityExecution_activationGroup_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				return ((InternalEList<?>)getActivityNodeActivationGroup_activityExecution_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				return ((InternalEList<?>)getActivityNodeActivationGroup_edgeInstances_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				return ((InternalEList<?>)getActivityNodeActivationGroup_nodeActivations_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_group_ActivityNodeActivation_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_heldTokens_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_incomingEdges_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_isRunning_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_node_ActivityNodeActivation_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_outgoingEdges_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				return ((InternalEList<?>)getActivityNodeActivation_running_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanValue_value_BooleanValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				return ((InternalEList<?>)getCallActionActivation_callExecutions_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				return ((InternalEList<?>)getCompoundValue_featureValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				return ((InternalEList<?>)getElementConfiguration_semanticVisitor_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				return ((InternalEList<?>)getEvaluation_locus_Evaluation_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				return ((InternalEList<?>)getEvaluation_specification_Evaluation_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				return ((InternalEList<?>)getExecutionEnvironment_locus_ExecutionEnvironment_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				return ((InternalEList<?>)getExecutionFactory_builtInTypes_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				return ((InternalEList<?>)getExecutionFactory_locus_ExecutionFactory_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				return ((InternalEList<?>)getExecutionFactory_primitiveBehaviorPrototypes_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				return ((InternalEList<?>)getExecution_context_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				return ((InternalEList<?>)getExecution_parameterValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				return ((InternalEList<?>)getExecutor_locus_Executor_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				return ((InternalEList<?>)getExtensionalValue_locus_ExtensionalValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				return ((InternalEList<?>)getFeatureValue_feature_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				return ((InternalEList<?>)getFeatureValue_position_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				return ((InternalEList<?>)getFeatureValue_values_FeatureValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				return ((InternalEList<?>)getForkedToken_baseTokenIsWithdrawn_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<?>)getForkedToken_baseToken_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				return ((InternalEList<?>)getInputParameterValues_name_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				return ((InternalEList<?>)getInputParameterValues_parameterValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				return ((InternalEList<?>)getIntegerValue_value_IntegerValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				return ((InternalEList<?>)getLocus_executor_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				return ((InternalEList<?>)getLocus_extensionalValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				return ((InternalEList<?>)getLocus_factory_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				return ((InternalEList<?>)getObjectNodeActivation_offeredTokenCount_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				return ((InternalEList<?>)getObjectToken_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				return ((InternalEList<?>)getObject_types_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<?>)getOffer_offeredTokens_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				return ((InternalEList<?>)getParameterValue_parameter_ParameterValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				return ((InternalEList<?>)getParameterValue_values_ParameterValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				return ((InternalEList<?>)getPinActivation_actionActivation_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				return ((InternalEList<?>)getPinActivation_count_temp_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				return ((InternalEList<?>)getPrimitiveValue_type_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				return ((InternalEList<?>)getReference_referent_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return ((InternalEList<?>)getSemanticVisitor_runtimeModelElement_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<?>)getToken_holder_Values()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return getActionActivation_firing_Values();
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				return getActionActivation_pinActivations_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				return getActivityEdgeInstance_edge_ActivityEdgeInstance_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				return getActivityEdgeInstance_group_ActivityEdgeInstance_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				return getActivityEdgeInstance_offers_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				return getActivityEdgeInstance_source_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				return getActivityEdgeInstance_target_Values();
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				return getActivityExecution_activationGroup_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				return getActivityNodeActivationGroup_activityExecution_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				return getActivityNodeActivationGroup_edgeInstances_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				return getActivityNodeActivationGroup_nodeActivations_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				return getActivityNodeActivation_group_ActivityNodeActivation_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				return getActivityNodeActivation_heldTokens_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				return getActivityNodeActivation_incomingEdges_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				return getActivityNodeActivation_isRunning_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				return getActivityNodeActivation_node_ActivityNodeActivation_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				return getActivityNodeActivation_outgoingEdges_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				return getActivityNodeActivation_running_Values();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				return getBooleanValue_value_BooleanValue_Values();
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				return getCallActionActivation_callExecutions_Values();
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				return getCompoundValue_featureValues_Values();
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				return getElementConfiguration_semanticVisitor_Values();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				return getEvaluation_locus_Evaluation_Values();
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				return getEvaluation_specification_Evaluation_Values();
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				return getExecutionEnvironment_locus_ExecutionEnvironment_Values();
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				return getExecutionFactory_builtInTypes_Values();
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				return getExecutionFactory_locus_ExecutionFactory_Values();
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				return getExecutionFactory_primitiveBehaviorPrototypes_Values();
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				return getExecution_context_Values();
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				return getExecution_parameterValues_Values();
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				return getExecutor_locus_Executor_Values();
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				return getExtensionalValue_locus_ExtensionalValue_Values();
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				return getFeatureValue_feature_Values();
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				return getFeatureValue_position_Values();
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				return getFeatureValue_values_FeatureValue_Values();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				return getForkedToken_baseTokenIsWithdrawn_Values();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return getForkedToken_baseToken_Values();
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return getForkedToken_remainingOffersCount_Values();
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				return getInputParameterValues_name_Values();
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				return getInputParameterValues_parameterValues_Values();
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				return getIntegerValue_value_IntegerValue_Values();
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				return getLocus_executor_Values();
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				return getLocus_extensionalValues_Values();
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				return getLocus_factory_Values();
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				return getObjectNodeActivation_offeredTokenCount_Values();
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				return getObjectToken_value_Values();
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				return getObject_types_Values();
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return getOffer_offeredTokens_Values();
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				return getParameterValue_parameter_ParameterValue_Values();
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				return getParameterValue_values_ParameterValue_Values();
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				return getPinActivation_actionActivation_Values();
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				return getPinActivation_count_temp_Values();
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				return getPrimitiveValue_type_Values();
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				return getReference_referent_Values();
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return getSemanticVisitor_runtimeModelElement_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return getToken_holder_Values();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				getActionActivation_firing_Values().clear();
				getActionActivation_firing_Values().addAll((Collection<? extends ActionActivation_firing_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				getActionActivation_pinActivations_Values().clear();
				getActionActivation_pinActivations_Values().addAll((Collection<? extends ActionActivation_pinActivations_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().clear();
				getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().addAll((Collection<? extends ActivityEdgeInstance_edge_ActivityEdgeInstance_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				getActivityEdgeInstance_group_ActivityEdgeInstance_Values().clear();
				getActivityEdgeInstance_group_ActivityEdgeInstance_Values().addAll((Collection<? extends ActivityEdgeInstance_group_ActivityEdgeInstance_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				getActivityEdgeInstance_offers_Values().clear();
				getActivityEdgeInstance_offers_Values().addAll((Collection<? extends ActivityEdgeInstance_offers_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				getActivityEdgeInstance_source_Values().clear();
				getActivityEdgeInstance_source_Values().addAll((Collection<? extends ActivityEdgeInstance_source_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				getActivityEdgeInstance_target_Values().clear();
				getActivityEdgeInstance_target_Values().addAll((Collection<? extends ActivityEdgeInstance_target_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				getActivityExecution_activationGroup_Values().clear();
				getActivityExecution_activationGroup_Values().addAll((Collection<? extends ActivityExecution_activationGroup_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				getActivityNodeActivationGroup_activityExecution_Values().clear();
				getActivityNodeActivationGroup_activityExecution_Values().addAll((Collection<? extends ActivityNodeActivationGroup_activityExecution_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				getActivityNodeActivationGroup_edgeInstances_Values().clear();
				getActivityNodeActivationGroup_edgeInstances_Values().addAll((Collection<? extends ActivityNodeActivationGroup_edgeInstances_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				getActivityNodeActivationGroup_nodeActivations_Values().clear();
				getActivityNodeActivationGroup_nodeActivations_Values().addAll((Collection<? extends ActivityNodeActivationGroup_nodeActivations_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				getActivityNodeActivation_group_ActivityNodeActivation_Values().clear();
				getActivityNodeActivation_group_ActivityNodeActivation_Values().addAll((Collection<? extends ActivityNodeActivation_group_ActivityNodeActivation_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				getActivityNodeActivation_heldTokens_Values().clear();
				getActivityNodeActivation_heldTokens_Values().addAll((Collection<? extends ActivityNodeActivation_heldTokens_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				getActivityNodeActivation_incomingEdges_Values().clear();
				getActivityNodeActivation_incomingEdges_Values().addAll((Collection<? extends ActivityNodeActivation_incomingEdges_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				getActivityNodeActivation_isRunning_Values().clear();
				getActivityNodeActivation_isRunning_Values().addAll((Collection<? extends ActivityNodeActivation_isRunning_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				getActivityNodeActivation_node_ActivityNodeActivation_Values().clear();
				getActivityNodeActivation_node_ActivityNodeActivation_Values().addAll((Collection<? extends ActivityNodeActivation_node_ActivityNodeActivation_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				getActivityNodeActivation_outgoingEdges_Values().clear();
				getActivityNodeActivation_outgoingEdges_Values().addAll((Collection<? extends ActivityNodeActivation_outgoingEdges_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				getActivityNodeActivation_running_Values().clear();
				getActivityNodeActivation_running_Values().addAll((Collection<? extends ActivityNodeActivation_running_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				getBooleanValue_value_BooleanValue_Values().clear();
				getBooleanValue_value_BooleanValue_Values().addAll((Collection<? extends BooleanValue_value_BooleanValue_Value>)newValue);
				return;
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				getCallActionActivation_callExecutions_Values().clear();
				getCallActionActivation_callExecutions_Values().addAll((Collection<? extends CallActionActivation_callExecutions_Value>)newValue);
				return;
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				getCompoundValue_featureValues_Values().clear();
				getCompoundValue_featureValues_Values().addAll((Collection<? extends CompoundValue_featureValues_Value>)newValue);
				return;
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				getElementConfiguration_semanticVisitor_Values().clear();
				getElementConfiguration_semanticVisitor_Values().addAll((Collection<? extends ElementConfiguration_semanticVisitor_Value>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				getEvaluation_locus_Evaluation_Values().clear();
				getEvaluation_locus_Evaluation_Values().addAll((Collection<? extends Evaluation_locus_Evaluation_Value>)newValue);
				return;
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				getEvaluation_specification_Evaluation_Values().clear();
				getEvaluation_specification_Evaluation_Values().addAll((Collection<? extends Evaluation_specification_Evaluation_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				getExecutionEnvironment_locus_ExecutionEnvironment_Values().clear();
				getExecutionEnvironment_locus_ExecutionEnvironment_Values().addAll((Collection<? extends ExecutionEnvironment_locus_ExecutionEnvironment_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				getExecutionFactory_builtInTypes_Values().clear();
				getExecutionFactory_builtInTypes_Values().addAll((Collection<? extends ExecutionFactory_builtInTypes_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				getExecutionFactory_locus_ExecutionFactory_Values().clear();
				getExecutionFactory_locus_ExecutionFactory_Values().addAll((Collection<? extends ExecutionFactory_locus_ExecutionFactory_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				getExecutionFactory_primitiveBehaviorPrototypes_Values().clear();
				getExecutionFactory_primitiveBehaviorPrototypes_Values().addAll((Collection<? extends ExecutionFactory_primitiveBehaviorPrototypes_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				getExecution_context_Values().clear();
				getExecution_context_Values().addAll((Collection<? extends Execution_context_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				getExecution_parameterValues_Values().clear();
				getExecution_parameterValues_Values().addAll((Collection<? extends Execution_parameterValues_Value>)newValue);
				return;
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				getExecutor_locus_Executor_Values().clear();
				getExecutor_locus_Executor_Values().addAll((Collection<? extends Executor_locus_Executor_Value>)newValue);
				return;
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				getExtensionalValue_locus_ExtensionalValue_Values().clear();
				getExtensionalValue_locus_ExtensionalValue_Values().addAll((Collection<? extends ExtensionalValue_locus_ExtensionalValue_Value>)newValue);
				return;
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				getFeatureValue_feature_Values().clear();
				getFeatureValue_feature_Values().addAll((Collection<? extends FeatureValue_feature_Value>)newValue);
				return;
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				getFeatureValue_position_Values().clear();
				getFeatureValue_position_Values().addAll((Collection<? extends FeatureValue_position_Value>)newValue);
				return;
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				getFeatureValue_values_FeatureValue_Values().clear();
				getFeatureValue_values_FeatureValue_Values().addAll((Collection<? extends FeatureValue_values_FeatureValue_Value>)newValue);
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				getForkedToken_baseTokenIsWithdrawn_Values().clear();
				getForkedToken_baseTokenIsWithdrawn_Values().addAll((Collection<? extends ForkedToken_baseTokenIsWithdrawn_Value>)newValue);
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				getForkedToken_baseToken_Values().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				getForkedToken_remainingOffersCount_Values().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
				return;
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				getInputParameterValues_name_Values().clear();
				getInputParameterValues_name_Values().addAll((Collection<? extends InputParameterValues_name_Value>)newValue);
				return;
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				getInputParameterValues_parameterValues_Values().clear();
				getInputParameterValues_parameterValues_Values().addAll((Collection<? extends InputParameterValues_parameterValues_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				getIntegerValue_value_IntegerValue_Values().clear();
				getIntegerValue_value_IntegerValue_Values().addAll((Collection<? extends IntegerValue_value_IntegerValue_Value>)newValue);
				return;
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				getLocus_executor_Values().clear();
				getLocus_executor_Values().addAll((Collection<? extends Locus_executor_Value>)newValue);
				return;
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				getLocus_extensionalValues_Values().clear();
				getLocus_extensionalValues_Values().addAll((Collection<? extends Locus_extensionalValues_Value>)newValue);
				return;
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				getLocus_factory_Values().clear();
				getLocus_factory_Values().addAll((Collection<? extends Locus_factory_Value>)newValue);
				return;
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				getObjectNodeActivation_offeredTokenCount_Values().clear();
				getObjectNodeActivation_offeredTokenCount_Values().addAll((Collection<? extends ObjectNodeActivation_offeredTokenCount_Value>)newValue);
				return;
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				getObjectToken_value_Values().clear();
				getObjectToken_value_Values().addAll((Collection<? extends ObjectToken_value_Value>)newValue);
				return;
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				getObject_types_Values().clear();
				getObject_types_Values().addAll((Collection<? extends Object_types_Value>)newValue);
				return;
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				getOffer_offeredTokens_Values().addAll((Collection<? extends Offer_offeredTokens_Value>)newValue);
				return;
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				getParameterValue_parameter_ParameterValue_Values().clear();
				getParameterValue_parameter_ParameterValue_Values().addAll((Collection<? extends ParameterValue_parameter_ParameterValue_Value>)newValue);
				return;
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				getParameterValue_values_ParameterValue_Values().clear();
				getParameterValue_values_ParameterValue_Values().addAll((Collection<? extends ParameterValue_values_ParameterValue_Value>)newValue);
				return;
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				getPinActivation_actionActivation_Values().clear();
				getPinActivation_actionActivation_Values().addAll((Collection<? extends PinActivation_actionActivation_Value>)newValue);
				return;
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				getPinActivation_count_temp_Values().clear();
				getPinActivation_count_temp_Values().addAll((Collection<? extends PinActivation_count_temp_Value>)newValue);
				return;
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				getPrimitiveValue_type_Values().clear();
				getPrimitiveValue_type_Values().addAll((Collection<? extends PrimitiveValue_type_Value>)newValue);
				return;
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				getReference_referent_Values().clear();
				getReference_referent_Values().addAll((Collection<? extends Reference_referent_Value>)newValue);
				return;
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				getSemanticVisitor_runtimeModelElement_Values().clear();
				getSemanticVisitor_runtimeModelElement_Values().addAll((Collection<? extends SemanticVisitor_runtimeModelElement_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				getToken_holder_Values().addAll((Collection<? extends Token_holder_Value>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				getActionActivation_firing_Values().clear();
				return;
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				getActionActivation_pinActivations_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				getActivityEdgeInstance_group_ActivityEdgeInstance_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				getActivityEdgeInstance_offers_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				getActivityEdgeInstance_source_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				getActivityEdgeInstance_target_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				getActivityExecution_activationGroup_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				getActivityNodeActivationGroup_activityExecution_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				getActivityNodeActivationGroup_edgeInstances_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				getActivityNodeActivationGroup_nodeActivations_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				getActivityNodeActivation_group_ActivityNodeActivation_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				getActivityNodeActivation_heldTokens_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				getActivityNodeActivation_incomingEdges_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				getActivityNodeActivation_isRunning_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				getActivityNodeActivation_node_ActivityNodeActivation_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				getActivityNodeActivation_outgoingEdges_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				getActivityNodeActivation_running_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				getBooleanValue_value_BooleanValue_Values().clear();
				return;
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				getCallActionActivation_callExecutions_Values().clear();
				return;
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				getCompoundValue_featureValues_Values().clear();
				return;
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				getElementConfiguration_semanticVisitor_Values().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				getEvaluation_locus_Evaluation_Values().clear();
				return;
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				getEvaluation_specification_Evaluation_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				getExecutionEnvironment_locus_ExecutionEnvironment_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				getExecutionFactory_builtInTypes_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				getExecutionFactory_locus_ExecutionFactory_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				getExecutionFactory_primitiveBehaviorPrototypes_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				getExecution_context_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				getExecution_parameterValues_Values().clear();
				return;
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				getExecutor_locus_Executor_Values().clear();
				return;
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				getExtensionalValue_locus_ExtensionalValue_Values().clear();
				return;
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				getFeatureValue_feature_Values().clear();
				return;
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				getFeatureValue_position_Values().clear();
				return;
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				getFeatureValue_values_FeatureValue_Values().clear();
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				getForkedToken_baseTokenIsWithdrawn_Values().clear();
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				return;
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				return;
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				getInputParameterValues_name_Values().clear();
				return;
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				getInputParameterValues_parameterValues_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				getIntegerValue_value_IntegerValue_Values().clear();
				return;
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				getLocus_executor_Values().clear();
				return;
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				getLocus_extensionalValues_Values().clear();
				return;
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				getLocus_factory_Values().clear();
				return;
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				getObjectNodeActivation_offeredTokenCount_Values().clear();
				return;
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				getObjectToken_value_Values().clear();
				return;
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				getObject_types_Values().clear();
				return;
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				return;
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				getParameterValue_parameter_ParameterValue_Values().clear();
				return;
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				getParameterValue_values_ParameterValue_Values().clear();
				return;
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				getPinActivation_actionActivation_Values().clear();
				return;
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				getPinActivation_count_temp_Values().clear();
				return;
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				getPrimitiveValue_type_Values().clear();
				return;
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				getReference_referent_Values().clear();
				return;
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				getSemanticVisitor_runtimeModelElement_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return actionActivation_firing_Values != null && !actionActivation_firing_Values.isEmpty();
			case StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES:
				return actionActivation_pinActivations_Values != null && !actionActivation_pinActivations_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES:
				return activityEdgeInstance_edge_ActivityEdgeInstance_Values != null && !activityEdgeInstance_edge_ActivityEdgeInstance_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES:
				return activityEdgeInstance_group_ActivityEdgeInstance_Values != null && !activityEdgeInstance_group_ActivityEdgeInstance_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES:
				return activityEdgeInstance_offers_Values != null && !activityEdgeInstance_offers_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES:
				return activityEdgeInstance_source_Values != null && !activityEdgeInstance_source_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES:
				return activityEdgeInstance_target_Values != null && !activityEdgeInstance_target_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES:
				return activityExecution_activationGroup_Values != null && !activityExecution_activationGroup_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES:
				return activityNodeActivationGroup_activityExecution_Values != null && !activityNodeActivationGroup_activityExecution_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES:
				return activityNodeActivationGroup_edgeInstances_Values != null && !activityNodeActivationGroup_edgeInstances_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES:
				return activityNodeActivationGroup_nodeActivations_Values != null && !activityNodeActivationGroup_nodeActivations_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES:
				return activityNodeActivation_group_ActivityNodeActivation_Values != null && !activityNodeActivation_group_ActivityNodeActivation_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES:
				return activityNodeActivation_heldTokens_Values != null && !activityNodeActivation_heldTokens_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES:
				return activityNodeActivation_incomingEdges_Values != null && !activityNodeActivation_incomingEdges_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES:
				return activityNodeActivation_isRunning_Values != null && !activityNodeActivation_isRunning_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES:
				return activityNodeActivation_node_ActivityNodeActivation_Values != null && !activityNodeActivation_node_ActivityNodeActivation_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES:
				return activityNodeActivation_outgoingEdges_Values != null && !activityNodeActivation_outgoingEdges_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES:
				return activityNodeActivation_running_Values != null && !activityNodeActivation_running_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES:
				return booleanValue_value_BooleanValue_Values != null && !booleanValue_value_BooleanValue_Values.isEmpty();
			case StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES:
				return callActionActivation_callExecutions_Values != null && !callActionActivation_callExecutions_Values.isEmpty();
			case StatesPackage.STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES:
				return compoundValue_featureValues_Values != null && !compoundValue_featureValues_Values.isEmpty();
			case StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES:
				return elementConfiguration_semanticVisitor_Values != null && !elementConfiguration_semanticVisitor_Values.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__EVALUATION_LOCUS_EVALUATION_VALUES:
				return evaluation_locus_Evaluation_Values != null && !evaluation_locus_Evaluation_Values.isEmpty();
			case StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES:
				return evaluation_specification_Evaluation_Values != null && !evaluation_specification_Evaluation_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES:
				return executionEnvironment_locus_ExecutionEnvironment_Values != null && !executionEnvironment_locus_ExecutionEnvironment_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES:
				return executionFactory_builtInTypes_Values != null && !executionFactory_builtInTypes_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES:
				return executionFactory_locus_ExecutionFactory_Values != null && !executionFactory_locus_ExecutionFactory_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES:
				return executionFactory_primitiveBehaviorPrototypes_Values != null && !executionFactory_primitiveBehaviorPrototypes_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_CONTEXT_VALUES:
				return execution_context_Values != null && !execution_context_Values.isEmpty();
			case StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES:
				return execution_parameterValues_Values != null && !execution_parameterValues_Values.isEmpty();
			case StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES:
				return executor_locus_Executor_Values != null && !executor_locus_Executor_Values.isEmpty();
			case StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES:
				return extensionalValue_locus_ExtensionalValue_Values != null && !extensionalValue_locus_ExtensionalValue_Values.isEmpty();
			case StatesPackage.STATE__FEATURE_VALUE_FEATURE_VALUES:
				return featureValue_feature_Values != null && !featureValue_feature_Values.isEmpty();
			case StatesPackage.STATE__FEATURE_VALUE_POSITION_VALUES:
				return featureValue_position_Values != null && !featureValue_position_Values.isEmpty();
			case StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES:
				return featureValue_values_FeatureValue_Values != null && !featureValue_values_FeatureValue_Values.isEmpty();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES:
				return forkedToken_baseTokenIsWithdrawn_Values != null && !forkedToken_baseTokenIsWithdrawn_Values.isEmpty();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return forkedToken_baseToken_Values != null && !forkedToken_baseToken_Values.isEmpty();
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return forkedToken_remainingOffersCount_Values != null && !forkedToken_remainingOffersCount_Values.isEmpty();
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_NAME_VALUES:
				return inputParameterValues_name_Values != null && !inputParameterValues_name_Values.isEmpty();
			case StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES:
				return inputParameterValues_parameterValues_Values != null && !inputParameterValues_parameterValues_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES:
				return integerValue_value_IntegerValue_Values != null && !integerValue_value_IntegerValue_Values.isEmpty();
			case StatesPackage.STATE__LOCUS_EXECUTOR_VALUES:
				return locus_executor_Values != null && !locus_executor_Values.isEmpty();
			case StatesPackage.STATE__LOCUS_EXTENSIONAL_VALUES_VALUES:
				return locus_extensionalValues_Values != null && !locus_extensionalValues_Values.isEmpty();
			case StatesPackage.STATE__LOCUS_FACTORY_VALUES:
				return locus_factory_Values != null && !locus_factory_Values.isEmpty();
			case StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES:
				return objectNodeActivation_offeredTokenCount_Values != null && !objectNodeActivation_offeredTokenCount_Values.isEmpty();
			case StatesPackage.STATE__OBJECT_TOKEN_VALUE_VALUES:
				return objectToken_value_Values != null && !objectToken_value_Values.isEmpty();
			case StatesPackage.STATE__OBJECT_TYPES_VALUES:
				return object_types_Values != null && !object_types_Values.isEmpty();
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return offer_offeredTokens_Values != null && !offer_offeredTokens_Values.isEmpty();
			case StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES:
				return parameterValue_parameter_ParameterValue_Values != null && !parameterValue_parameter_ParameterValue_Values.isEmpty();
			case StatesPackage.STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES:
				return parameterValue_values_ParameterValue_Values != null && !parameterValue_values_ParameterValue_Values.isEmpty();
			case StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES:
				return pinActivation_actionActivation_Values != null && !pinActivation_actionActivation_Values.isEmpty();
			case StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES:
				return pinActivation_count_temp_Values != null && !pinActivation_count_temp_Values.isEmpty();
			case StatesPackage.STATE__PRIMITIVE_VALUE_TYPE_VALUES:
				return primitiveValue_type_Values != null && !primitiveValue_type_Values.isEmpty();
			case StatesPackage.STATE__REFERENCE_REFERENT_VALUES:
				return reference_referent_Values != null && !reference_referent_Values.isEmpty();
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return semanticVisitor_runtimeModelElement_Values != null && !semanticVisitor_runtimeModelElement_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return token_holder_Values != null && !token_holder_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
