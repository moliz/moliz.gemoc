/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.State#getActionActivation_firing_Values <em>Action Activation firing Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActionActivation_pinActivations_Values <em>Action Activation pin Activations Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values <em>Activity Edge Instance edge Activity Edge Instance Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_group_ActivityEdgeInstance_Values <em>Activity Edge Instance group Activity Edge Instance Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_offers_Values <em>Activity Edge Instance offers Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_source_Values <em>Activity Edge Instance source Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_target_Values <em>Activity Edge Instance target Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityExecution_activationGroup_Values <em>Activity Execution activation Group Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivationGroup_activityExecution_Values <em>Activity Node Activation Group activity Execution Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivationGroup_edgeInstances_Values <em>Activity Node Activation Group edge Instances Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivationGroup_nodeActivations_Values <em>Activity Node Activation Group node Activations Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_group_ActivityNodeActivation_Values <em>Activity Node Activation group Activity Node Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_heldTokens_Values <em>Activity Node Activation held Tokens Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_incomingEdges_Values <em>Activity Node Activation incoming Edges Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_isRunning_Values <em>Activity Node Activation is Running Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_node_ActivityNodeActivation_Values <em>Activity Node Activation node Activity Node Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_outgoingEdges_Values <em>Activity Node Activation outgoing Edges Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_running_Values <em>Activity Node Activation running Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getBooleanValue_value_BooleanValue_Values <em>Boolean Value value Boolean Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getCallActionActivation_callExecutions_Values <em>Call Action Activation call Executions Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getCompoundValue_featureValues_Values <em>Compound Value feature Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getElementConfiguration_semanticVisitor_Values <em>Element Configuration semantic Visitor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getEvaluation_locus_Evaluation_Values <em>Evaluation locus Evaluation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getEvaluation_specification_Evaluation_Values <em>Evaluation specification Evaluation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecutionEnvironment_locus_ExecutionEnvironment_Values <em>Execution Environment locus Execution Environment Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecutionFactory_builtInTypes_Values <em>Execution Factory built In Types Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecutionFactory_locus_ExecutionFactory_Values <em>Execution Factory locus Execution Factory Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecutionFactory_primitiveBehaviorPrototypes_Values <em>Execution Factory primitive Behavior Prototypes Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecution_context_Values <em>Execution context Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecution_parameterValues_Values <em>Execution parameter Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExecutor_locus_Executor_Values <em>Executor locus Executor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getExtensionalValue_locus_ExtensionalValue_Values <em>Extensional Value locus Extensional Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getFeatureValue_feature_Values <em>Feature Value feature Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getFeatureValue_position_Values <em>Feature Value position Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getFeatureValue_values_FeatureValue_Values <em>Feature Value values Feature Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getForkedToken_baseTokenIsWithdrawn_Values <em>Forked Token base Token Is Withdrawn Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getInputParameterValues_name_Values <em>Input Parameter Values name Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getInputParameterValues_parameterValues_Values <em>Input Parameter Values parameter Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getIntegerValue_value_IntegerValue_Values <em>Integer Value value Integer Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getLocus_executor_Values <em>Locus executor Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getLocus_extensionalValues_Values <em>Locus extensional Values Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getLocus_factory_Values <em>Locus factory Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getObjectNodeActivation_offeredTokenCount_Values <em>Object Node Activation offered Token Count Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getObjectToken_value_Values <em>Object Token value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getObject_types_Values <em>Object types Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getParameterValue_parameter_ParameterValue_Values <em>Parameter Value parameter Parameter Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getParameterValue_values_ParameterValue_Values <em>Parameter Value values Parameter Value Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getPinActivation_actionActivation_Values <em>Pin Activation action Activation Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getPinActivation_count_temp_Values <em>Pin Activation count temp Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getPrimitiveValue_type_Values <em>Primitive Value type Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getReference_referent_Values <em>Reference referent Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Activation firing Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActionActivation_firing_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActionActivation_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation firing Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation firing Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActionActivation_firing_Values()
	 * @see fumlConfigurationTrace.States.ActionActivation_firing_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActionActivation_firing_Value> getActionActivation_firing_Values();

	/**
	 * Returns the value of the '<em><b>Action Activation pin Activations Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation pin Activations Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation pin Activations Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActionActivation_pinActivations_Values()
	 * @see fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActionActivation_pinActivations_Value> getActionActivation_pinActivations_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge Instance edge Activity Edge Instance Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge Instance edge Activity Edge Instance Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge Instance edge Activity Edge Instance Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
	 * @see fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> getActivityEdgeInstance_edge_ActivityEdgeInstance_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge Instance group Activity Edge Instance Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge Instance group Activity Edge Instance Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge Instance group Activity Edge Instance Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values()
	 * @see fumlConfigurationTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> getActivityEdgeInstance_group_ActivityEdgeInstance_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge Instance offers Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityEdgeInstance_offers_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge Instance offers Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge Instance offers Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityEdgeInstance_offers_Values()
	 * @see fumlConfigurationTrace.States.ActivityEdgeInstance_offers_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdgeInstance_offers_Value> getActivityEdgeInstance_offers_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge Instance source Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityEdgeInstance_source_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_source_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge Instance source Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge Instance source Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityEdgeInstance_source_Values()
	 * @see fumlConfigurationTrace.States.ActivityEdgeInstance_source_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdgeInstance_source_Value> getActivityEdgeInstance_source_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge Instance target Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityEdgeInstance_target_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_target_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge Instance target Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge Instance target Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityEdgeInstance_target_Values()
	 * @see fumlConfigurationTrace.States.ActivityEdgeInstance_target_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdgeInstance_target_Value> getActivityEdgeInstance_target_Values();

	/**
	 * Returns the value of the '<em><b>Activity Execution activation Group Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution activation Group Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution activation Group Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityExecution_activationGroup_Values()
	 * @see fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityExecution_activationGroup_Value> getActivityExecution_activationGroup_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation Group activity Execution Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation Group activity Execution Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation Group activity Execution Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivationGroup_activityExecution_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_activityExecution_Value> getActivityNodeActivationGroup_activityExecution_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation Group edge Instances Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation Group edge Instances Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation Group edge Instances Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivationGroup_edgeInstances_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_edgeInstances_Value> getActivityNodeActivationGroup_edgeInstances_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation Group node Activations Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation Group node Activations Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation Group node Activations Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivationGroup_nodeActivations_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_nodeActivations_Value> getActivityNodeActivationGroup_nodeActivations_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation group Activity Node Activation Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation group Activity Node Activation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation group Activity Node Activation Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_group_ActivityNodeActivation_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> getActivityNodeActivation_group_ActivityNodeActivation_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation held Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation held Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation held Tokens Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_heldTokens_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_heldTokens_Value> getActivityNodeActivation_heldTokens_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation incoming Edges Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation incoming Edges Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation incoming Edges Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_incomingEdges_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_incomingEdges_Value> getActivityNodeActivation_incomingEdges_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation is Running Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation is Running Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation is Running Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_isRunning_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_isRunning_Value> getActivityNodeActivation_isRunning_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation node Activity Node Activation Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation node Activity Node Activation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation node Activity Node Activation Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_node_ActivityNodeActivation_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> getActivityNodeActivation_node_ActivityNodeActivation_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation outgoing Edges Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation outgoing Edges Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation outgoing Edges Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_outgoingEdges_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_outgoingEdges_Value> getActivityNodeActivation_outgoingEdges_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node Activation running Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_running_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_running_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node Activation running Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node Activation running Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ActivityNodeActivation_running_Values()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_running_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNodeActivation_running_Value> getActivityNodeActivation_running_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Value value Boolean Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value value Boolean Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value value Boolean Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_BooleanValue_value_BooleanValue_Values()
	 * @see fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanValue_value_BooleanValue_Value> getBooleanValue_value_BooleanValue_Values();

	/**
	 * Returns the value of the '<em><b>Call Action Activation call Executions Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Action Activation call Executions Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Action Activation call Executions Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_CallActionActivation_callExecutions_Values()
	 * @see fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<CallActionActivation_callExecutions_Value> getCallActionActivation_callExecutions_Values();

	/**
	 * Returns the value of the '<em><b>Compound Value feature Values Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.CompoundValue_featureValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.CompoundValue_featureValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Value feature Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Value feature Values Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_CompoundValue_featureValues_Values()
	 * @see fumlConfigurationTrace.States.CompoundValue_featureValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<CompoundValue_featureValues_Value> getCompoundValue_featureValues_Values();

	/**
	 * Returns the value of the '<em><b>Element Configuration semantic Visitor Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Configuration semantic Visitor Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Configuration semantic Visitor Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ElementConfiguration_semanticVisitor_Values()
	 * @see fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ElementConfiguration_semanticVisitor_Value> getElementConfiguration_semanticVisitor_Values();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_EndedSteps()
	 * @see fumlConfigurationTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Evaluation locus Evaluation Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation locus Evaluation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation locus Evaluation Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Evaluation_locus_Evaluation_Values()
	 * @see fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Evaluation_locus_Evaluation_Value> getEvaluation_locus_Evaluation_Values();

	/**
	 * Returns the value of the '<em><b>Evaluation specification Evaluation Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation specification Evaluation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation specification Evaluation Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Evaluation_specification_Evaluation_Values()
	 * @see fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Evaluation_specification_Evaluation_Value> getEvaluation_specification_Evaluation_Values();

	/**
	 * Returns the value of the '<em><b>Execution Environment locus Execution Environment Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environment locus Execution Environment Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environment locus Execution Environment Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values()
	 * @see fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> getExecutionEnvironment_locus_ExecutionEnvironment_Values();

	/**
	 * Returns the value of the '<em><b>Execution Factory built In Types Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Factory built In Types Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Factory built In Types Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ExecutionFactory_builtInTypes_Values()
	 * @see fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ExecutionFactory_builtInTypes_Value> getExecutionFactory_builtInTypes_Values();

	/**
	 * Returns the value of the '<em><b>Execution Factory locus Execution Factory Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Factory locus Execution Factory Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Factory locus Execution Factory Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ExecutionFactory_locus_ExecutionFactory_Values()
	 * @see fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ExecutionFactory_locus_ExecutionFactory_Value> getExecutionFactory_locus_ExecutionFactory_Values();

	/**
	 * Returns the value of the '<em><b>Execution Factory primitive Behavior Prototypes Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Factory primitive Behavior Prototypes Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Factory primitive Behavior Prototypes Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ExecutionFactory_primitiveBehaviorPrototypes_Values()
	 * @see fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> getExecutionFactory_primitiveBehaviorPrototypes_Values();

	/**
	 * Returns the value of the '<em><b>Execution context Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Execution_context_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Execution_context_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution context Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution context Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Execution_context_Values()
	 * @see fumlConfigurationTrace.States.Execution_context_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Execution_context_Value> getExecution_context_Values();

	/**
	 * Returns the value of the '<em><b>Execution parameter Values Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Execution_parameterValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Execution_parameterValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution parameter Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution parameter Values Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Execution_parameterValues_Values()
	 * @see fumlConfigurationTrace.States.Execution_parameterValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Execution_parameterValues_Value> getExecution_parameterValues_Values();

	/**
	 * Returns the value of the '<em><b>Executor locus Executor Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Executor_locus_Executor_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor locus Executor Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor locus Executor Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Executor_locus_Executor_Values()
	 * @see fumlConfigurationTrace.States.Executor_locus_Executor_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Executor_locus_Executor_Value> getExecutor_locus_Executor_Values();

	/**
	 * Returns the value of the '<em><b>Extensional Value locus Extensional Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensional Value locus Extensional Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensional Value locus Extensional Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ExtensionalValue_locus_ExtensionalValue_Values()
	 * @see fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ExtensionalValue_locus_ExtensionalValue_Value> getExtensionalValue_locus_ExtensionalValue_Values();

	/**
	 * Returns the value of the '<em><b>Feature Value feature Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.FeatureValue_feature_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.FeatureValue_feature_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Value feature Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Value feature Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_FeatureValue_feature_Values()
	 * @see fumlConfigurationTrace.States.FeatureValue_feature_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FeatureValue_feature_Value> getFeatureValue_feature_Values();

	/**
	 * Returns the value of the '<em><b>Feature Value position Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.FeatureValue_position_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Value position Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Value position Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_FeatureValue_position_Values()
	 * @see fumlConfigurationTrace.States.FeatureValue_position_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FeatureValue_position_Value> getFeatureValue_position_Values();

	/**
	 * Returns the value of the '<em><b>Feature Value values Feature Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Value values Feature Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Value values Feature Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_FeatureValue_values_FeatureValue_Values()
	 * @see fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FeatureValue_values_FeatureValue_Value> getFeatureValue_values_FeatureValue_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token base Token Is Withdrawn Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token base Token Is Withdrawn Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token base Token Is Withdrawn Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ForkedToken_baseTokenIsWithdrawn_Values()
	 * @see fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_baseTokenIsWithdrawn_Value> getForkedToken_baseTokenIsWithdrawn_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token base Token Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token base Token Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ForkedToken_baseToken_Values()
	 * @see fumlConfigurationTrace.States.ForkedToken_baseToken_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token remaining Offers Count Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token remaining Offers Count Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ForkedToken_remainingOffersCount_Values()
	 * @see fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the value of the '<em><b>Input Parameter Values name Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.InputParameterValues_name_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.InputParameterValues_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter Values name Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter Values name Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_InputParameterValues_name_Values()
	 * @see fumlConfigurationTrace.States.InputParameterValues_name_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputParameterValues_name_Value> getInputParameterValues_name_Values();

	/**
	 * Returns the value of the '<em><b>Input Parameter Values parameter Values Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter Values parameter Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter Values parameter Values Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_InputParameterValues_parameterValues_Values()
	 * @see fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputParameterValues_parameterValues_Value> getInputParameterValues_parameterValues_Values();

	/**
	 * Returns the value of the '<em><b>Integer Value value Integer Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value value Integer Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value value Integer Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_IntegerValue_value_IntegerValue_Values()
	 * @see fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerValue_value_IntegerValue_Value> getIntegerValue_value_IntegerValue_Values();

	/**
	 * Returns the value of the '<em><b>Locus executor Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Locus_executor_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Locus_executor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus executor Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus executor Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Locus_executor_Values()
	 * @see fumlConfigurationTrace.States.Locus_executor_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Locus_executor_Value> getLocus_executor_Values();

	/**
	 * Returns the value of the '<em><b>Locus extensional Values Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Locus_extensionalValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Locus_extensionalValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus extensional Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus extensional Values Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Locus_extensionalValues_Values()
	 * @see fumlConfigurationTrace.States.Locus_extensionalValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Locus_extensionalValues_Value> getLocus_extensionalValues_Values();

	/**
	 * Returns the value of the '<em><b>Locus factory Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Locus_factory_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Locus_factory_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus factory Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus factory Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Locus_factory_Values()
	 * @see fumlConfigurationTrace.States.Locus_factory_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Locus_factory_Value> getLocus_factory_Values();

	/**
	 * Returns the value of the '<em><b>Object Node Activation offered Token Count Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Node Activation offered Token Count Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Node Activation offered Token Count Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ObjectNodeActivation_offeredTokenCount_Values()
	 * @see fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ObjectNodeActivation_offeredTokenCount_Value> getObjectNodeActivation_offeredTokenCount_Values();

	/**
	 * Returns the value of the '<em><b>Object Token value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ObjectToken_value_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ObjectToken_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Token value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Token value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ObjectToken_value_Values()
	 * @see fumlConfigurationTrace.States.ObjectToken_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ObjectToken_value_Value> getObjectToken_value_Values();

	/**
	 * Returns the value of the '<em><b>Object types Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Object_types_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Object_types_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object types Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object types Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Object_types_Values()
	 * @see fumlConfigurationTrace.States.Object_types_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Object_types_Value> getObject_types_Values();

	/**
	 * Returns the value of the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Offer_offeredTokens_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer offered Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer offered Tokens Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Offer_offeredTokens_Values()
	 * @see fumlConfigurationTrace.States.Offer_offeredTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values();

	/**
	 * Returns the value of the '<em><b>Parameter Value parameter Parameter Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Value parameter Parameter Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value parameter Parameter Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ParameterValue_parameter_ParameterValue_Values()
	 * @see fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ParameterValue_parameter_ParameterValue_Value> getParameterValue_parameter_ParameterValue_Values();

	/**
	 * Returns the value of the '<em><b>Parameter Value values Parameter Value Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Value values Parameter Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value values Parameter Value Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_ParameterValue_values_ParameterValue_Values()
	 * @see fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ParameterValue_values_ParameterValue_Value> getParameterValue_values_ParameterValue_Values();

	/**
	 * Returns the value of the '<em><b>Pin Activation action Activation Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PinActivation_actionActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PinActivation_actionActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activation action Activation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activation action Activation Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_PinActivation_actionActivation_Values()
	 * @see fumlConfigurationTrace.States.PinActivation_actionActivation_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<PinActivation_actionActivation_Value> getPinActivation_actionActivation_Values();

	/**
	 * Returns the value of the '<em><b>Pin Activation count temp Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PinActivation_count_temp_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PinActivation_count_temp_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activation count temp Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activation count temp Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_PinActivation_count_temp_Values()
	 * @see fumlConfigurationTrace.States.PinActivation_count_temp_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<PinActivation_count_temp_Value> getPinActivation_count_temp_Values();

	/**
	 * Returns the value of the '<em><b>Primitive Value type Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PrimitiveValue_type_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Value type Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Value type Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_PrimitiveValue_type_Values()
	 * @see fumlConfigurationTrace.States.PrimitiveValue_type_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<PrimitiveValue_type_Value> getPrimitiveValue_type_Values();

	/**
	 * Returns the value of the '<em><b>Reference referent Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Reference_referent_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Reference_referent_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference referent Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference referent Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Reference_referent_Values()
	 * @see fumlConfigurationTrace.States.Reference_referent_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Reference_referent_Value> getReference_referent_Values();

	/**
	 * Returns the value of the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor runtime Model Element Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor runtime Model Element Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_SemanticVisitor_runtimeModelElement_Values()
	 * @see fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<SemanticVisitor_runtimeModelElement_Value> getSemanticVisitor_runtimeModelElement_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_StartedSteps()
	 * @see fumlConfigurationTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Token holder Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token holder Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token holder Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getState_Token_holder_Values()
	 * @see fumlConfigurationTrace.States.Token_holder_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Token_holder_Value> getToken_holder_Values();

} // State
