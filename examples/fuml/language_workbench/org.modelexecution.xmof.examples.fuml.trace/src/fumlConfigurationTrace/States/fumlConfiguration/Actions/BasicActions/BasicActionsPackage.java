/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fumlConfigurationTrace_BasicActions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActionsPackage eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedActionActivation()
	 * @generated
	 */
	int TRACED_ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__RUNNING_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION_FEATURE_COUNT = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION_OPERATION_COUNT = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl <em>Traced Invocation Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInvocationActionActivation()
	 * @generated
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__RUNNING_SEQUENCE = TRACED_ACTION_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__FIRING_SEQUENCE = TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Invocation Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT = TRACED_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Invocation Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT = TRACED_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl <em>Traced Call Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallActionActivation()
	 * @generated
	 */
	int TRACED_CALL_ACTION_ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__RUNNING_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__FIRING_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__FIRING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Call Executions Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE = TRACED_INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Call Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION_FEATURE_COUNT = TRACED_INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Call Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION_OPERATION_COUNT = TRACED_INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallBehaviorActionActivationImpl <em>Traced Call Behavior Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallBehaviorActionActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallBehaviorActionActivation()
	 * @generated
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__RUNNING_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__FIRING_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__FIRING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Call Executions Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE = TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Call Behavior Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION_FEATURE_COUNT = TRACED_CALL_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Call Behavior Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION_OPERATION_COUNT = TRACED_CALL_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedPinActivation()
	 * @generated
	 */
	int TRACED_PIN_ACTIVATION = 7;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__HELD_TOKENS_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__INCOMING_EDGES_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__IS_RUNNING_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__OUTGOING_EDGES_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__RUNNING_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Action Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count temp Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION_FEATURE_COUNT = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION_OPERATION_COUNT = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInputPinActivationImpl <em>Traced Input Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInputPinActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInputPinActivation()
	 * @generated
	 */
	int TRACED_INPUT_PIN_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_PIN_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_PIN_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_PIN_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_PIN_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__RUNNING_SEQUENCE = TRACED_PIN_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE = TRACED_PIN_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Action Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Count temp Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE = TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Input Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION_FEATURE_COUNT = TRACED_PIN_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Input Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_ACTIVATION_OPERATION_COUNT = TRACED_PIN_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOpaqueActionActivationImpl <em>Traced Opaque Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOpaqueActionActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedOpaqueActionActivation()
	 * @generated
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_ACTION_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_ACTION_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_ACTION_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_ACTION_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__RUNNING_SEQUENCE = TRACED_ACTION_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__FIRING_SEQUENCE = TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION_FEATURE_COUNT = TRACED_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_ACTIVATION_OPERATION_COUNT = TRACED_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOutputPinActivationImpl <em>Traced Output Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOutputPinActivationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedOutputPinActivation()
	 * @generated
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION = 6;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_PIN_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_PIN_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_PIN_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_PIN_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__RUNNING_SEQUENCE = TRACED_PIN_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE = TRACED_PIN_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Action Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE = TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Count temp Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE = TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Output Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION_FEATURE_COUNT = TRACED_PIN_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Output Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_ACTIVATION_OPERATION_COUNT = TRACED_PIN_ACTIVATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation <em>Traced Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation
	 * @generated
	 */
	EClass getTracedActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firing Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getFiringSequence()
	 * @see #getTracedActionActivation()
	 * @generated
	 */
	EReference getTracedActionActivation_FiringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence <em>Pin Activations Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Activations Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence()
	 * @see #getTracedActionActivation()
	 * @generated
	 */
	EReference getTracedActionActivation_PinActivationsSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation <em>Traced Call Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Action Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation
	 * @generated
	 */
	EClass getTracedCallActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence <em>Call Executions Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call Executions Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence()
	 * @see #getTracedCallActionActivation()
	 * @generated
	 */
	EReference getTracedCallActionActivation_CallExecutionsSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation <em>Traced Call Behavior Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Behavior Action Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation
	 * @generated
	 */
	EClass getTracedCallBehaviorActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation <em>Traced Input Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input Pin Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation
	 * @generated
	 */
	EClass getTracedInputPinActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation <em>Traced Invocation Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Invocation Action Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation
	 * @generated
	 */
	EClass getTracedInvocationActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation <em>Traced Opaque Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Action Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation
	 * @generated
	 */
	EClass getTracedOpaqueActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation <em>Traced Output Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Output Pin Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation
	 * @generated
	 */
	EClass getTracedOutputPinActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation <em>Traced Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin Activation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation
	 * @generated
	 */
	EClass getTracedPinActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence <em>Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence()
	 * @see #getTracedPinActivation()
	 * @generated
	 */
	EReference getTracedPinActivation_ActionActivationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence <em>Count temp Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count temp Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence()
	 * @see #getTracedPinActivation()
	 * @generated
	 */
	EReference getTracedPinActivation_Count_tempSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicActionsFactory getBasicActionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedActionActivation()
		 * @generated
		 */
		EClass TRACED_ACTION_ACTIVATION = eINSTANCE.getTracedActionActivation();

		/**
		 * The meta object literal for the '<em><b>Firing Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE = eINSTANCE.getTracedActionActivation_FiringSequence();

		/**
		 * The meta object literal for the '<em><b>Pin Activations Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE = eINSTANCE.getTracedActionActivation_PinActivationsSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl <em>Traced Call Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallActionActivation()
		 * @generated
		 */
		EClass TRACED_CALL_ACTION_ACTIVATION = eINSTANCE.getTracedCallActionActivation();

		/**
		 * The meta object literal for the '<em><b>Call Executions Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE = eINSTANCE.getTracedCallActionActivation_CallExecutionsSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallBehaviorActionActivationImpl <em>Traced Call Behavior Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallBehaviorActionActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallBehaviorActionActivation()
		 * @generated
		 */
		EClass TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION = eINSTANCE.getTracedCallBehaviorActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInputPinActivationImpl <em>Traced Input Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInputPinActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInputPinActivation()
		 * @generated
		 */
		EClass TRACED_INPUT_PIN_ACTIVATION = eINSTANCE.getTracedInputPinActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl <em>Traced Invocation Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInvocationActionActivation()
		 * @generated
		 */
		EClass TRACED_INVOCATION_ACTION_ACTIVATION = eINSTANCE.getTracedInvocationActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOpaqueActionActivationImpl <em>Traced Opaque Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOpaqueActionActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedOpaqueActionActivation()
		 * @generated
		 */
		EClass TRACED_OPAQUE_ACTION_ACTIVATION = eINSTANCE.getTracedOpaqueActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOutputPinActivationImpl <em>Traced Output Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedOutputPinActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedOutputPinActivation()
		 * @generated
		 */
		EClass TRACED_OUTPUT_PIN_ACTIVATION = eINSTANCE.getTracedOutputPinActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedPinActivation()
		 * @generated
		 */
		EClass TRACED_PIN_ACTIVATION = eINSTANCE.getTracedPinActivation();

		/**
		 * The meta object literal for the '<em><b>Action Activation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getTracedPinActivation_ActionActivationSequence();

		/**
		 * The meta object literal for the '<em><b>Count temp Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE = eINSTANCE.getTracedPinActivation_Count_tempSequence();

	}

} //BasicActionsPackage
