/**
 */
package fumlConfiguration.Actions.BasicActions;

import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fumlConfiguration.Actions.BasicActions.BasicActionsFactory
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
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/actions/basicactions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BasicActionsConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActionsPackage eINSTANCE = fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl <em>Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getActionActivation()
	 * @generated
	 */
	int ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__RUNNING = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__INCOMING_EDGES = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__OUTGOING_EDGES = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__IS_RUNNING = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__HELD_TOKENS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__PIN_ACTIVATIONS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION__FIRING = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FEATURE_COUNT = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___INITIALIZE = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_TOKENS__ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___RUN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___RECEIVE_OFFER = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___IS_READY__BOOLEAN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___FIRE__ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___ADD_TOKENS__ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___SEND_OFFERS__ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___ADD_TOKEN__TOKEN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___TERMINATE = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___CLEAR_TOKENS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___SEND_OFFERS = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___DO_ACTION = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_OPERATION_COUNT = IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl <em>Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getPinActivation()
	 * @generated
	 */
	int PIN_ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__RUNNING = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__INCOMING_EDGES = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__OUTGOING_EDGES = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__IS_RUNNING = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__HELD_TOKENS = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__OFFERED_TOKEN_COUNT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT;

	/**
	 * The feature id for the '<em><b>Action Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__ACTION_ACTIVATION = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION__COUNT_TEMP = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_FEATURE_COUNT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___INITIALIZE = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_TOKENS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___CREATE_NODE_ACTIVATIONS = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___CREATE_EDGE_INSTANCES = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___RUN = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___RECEIVE_OFFER = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___IS_READY__BOOLEAN = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___FIRE__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___IS_RUNNING__BOOLEAN = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___HAS_OFFERS__BOOLEAN = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___ADD_TOKENS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___SEND_OFFERS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___ADD_TOKEN__TOKEN = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___TERMINATE = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___CLEAR_TOKENS = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Count Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT;

	/**
	 * The operation id for the '<em>Send Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___SEND_UNOFFERED_TOKENS = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS;

	/**
	 * The operation id for the '<em>Get Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___COUNT_OFFERED_VALUES__INT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT;

	/**
	 * The operation id for the '<em>Take Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST;

	/**
	 * The number of operations of the '<em>Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_OPERATION_COUNT = IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.InputPinActivationImpl <em>Input Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.InputPinActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getInputPinActivation()
	 * @generated
	 */
	int INPUT_PIN_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT = PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__RUNNING = PIN_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__INCOMING_EDGES = PIN_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__OUTGOING_EDGES = PIN_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__IS_RUNNING = PIN_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__HELD_TOKENS = PIN_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__OFFERED_TOKEN_COUNT = PIN_ACTIVATION__OFFERED_TOKEN_COUNT;

	/**
	 * The feature id for the '<em><b>Action Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__ACTION_ACTIVATION = PIN_ACTIVATION__ACTION_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION__COUNT_TEMP = PIN_ACTIVATION__COUNT_TEMP;

	/**
	 * The number of structural features of the '<em>Input Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION_FEATURE_COUNT = PIN_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___INITIALIZE = PIN_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_TOKENS__ELIST = PIN_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___CREATE_NODE_ACTIVATIONS = PIN_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___CREATE_EDGE_INSTANCES = PIN_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___RUN = PIN_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___RECEIVE_OFFER = PIN_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___IS_READY__BOOLEAN = PIN_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = PIN_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___FIRE__ELIST = PIN_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___IS_RUNNING__BOOLEAN = PIN_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___HAS_OFFERS__BOOLEAN = PIN_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = PIN_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___ADD_TOKENS__ELIST = PIN_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___SEND_OFFERS__ELIST = PIN_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___ADD_TOKEN__TOKEN = PIN_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = PIN_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = PIN_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___TERMINATE = PIN_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___CLEAR_TOKENS = PIN_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = PIN_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = PIN_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = PIN_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Count Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = PIN_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT;

	/**
	 * The operation id for the '<em>Send Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___SEND_UNOFFERED_TOKENS = PIN_ACTIVATION___SEND_UNOFFERED_TOKENS;

	/**
	 * The operation id for the '<em>Get Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = PIN_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___COUNT_OFFERED_VALUES__INT = PIN_ACTIVATION___COUNT_OFFERED_VALUES__INT;

	/**
	 * The operation id for the '<em>Take Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = PIN_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST;

	/**
	 * The number of operations of the '<em>Input Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_ACTIVATION_OPERATION_COUNT = PIN_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.OpaqueActionActivationImpl <em>Opaque Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.OpaqueActionActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getOpaqueActionActivation()
	 * @generated
	 */
	int OPAQUE_ACTION_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__RUNNING = ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__INCOMING_EDGES = ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__OUTGOING_EDGES = ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__IS_RUNNING = ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__HELD_TOKENS = ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__PIN_ACTIVATIONS = ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION__FIRING = ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Opaque Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION_FEATURE_COUNT = ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___INITIALIZE = ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_TOKENS__ELIST = ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___RUN = ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___RECEIVE_OFFER = ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___IS_READY__BOOLEAN = ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___FIRE__ELIST = ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___ADD_TOKENS__ELIST = ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___SEND_OFFERS__ELIST = ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___TERMINATE = ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___CLEAR_TOKENS = ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___SEND_OFFERS = ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___DO_ACTION = ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Opaque Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVATION_OPERATION_COUNT = ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.OutputPinActivationImpl <em>Output Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.OutputPinActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getOutputPinActivation()
	 * @generated
	 */
	int OUTPUT_PIN_ACTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT = PIN_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = PIN_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = PIN_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__RUNNING = PIN_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__INCOMING_EDGES = PIN_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__OUTGOING_EDGES = PIN_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__IS_RUNNING = PIN_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__HELD_TOKENS = PIN_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__OFFERED_TOKEN_COUNT = PIN_ACTIVATION__OFFERED_TOKEN_COUNT;

	/**
	 * The feature id for the '<em><b>Action Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__ACTION_ACTIVATION = PIN_ACTIVATION__ACTION_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION__COUNT_TEMP = PIN_ACTIVATION__COUNT_TEMP;

	/**
	 * The number of structural features of the '<em>Output Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION_FEATURE_COUNT = PIN_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___INITIALIZE = PIN_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_TOKENS__ELIST = PIN_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___CREATE_NODE_ACTIVATIONS = PIN_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___CREATE_EDGE_INSTANCES = PIN_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___RUN = PIN_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___RECEIVE_OFFER = PIN_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___IS_READY__BOOLEAN = PIN_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = PIN_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___FIRE__ELIST = PIN_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___IS_RUNNING__BOOLEAN = PIN_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___HAS_OFFERS__BOOLEAN = PIN_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = PIN_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___ADD_TOKENS__ELIST = PIN_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___SEND_OFFERS__ELIST = PIN_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___ADD_TOKEN__TOKEN = PIN_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = PIN_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = PIN_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___TERMINATE = PIN_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___CLEAR_TOKENS = PIN_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = PIN_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = PIN_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = PIN_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Count Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = PIN_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT;

	/**
	 * The operation id for the '<em>Send Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___SEND_UNOFFERED_TOKENS = PIN_ACTIVATION___SEND_UNOFFERED_TOKENS;

	/**
	 * The operation id for the '<em>Get Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = PIN_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___COUNT_OFFERED_VALUES__INT = PIN_ACTIVATION___COUNT_OFFERED_VALUES__INT;

	/**
	 * The operation id for the '<em>Take Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = PIN_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST;

	/**
	 * The number of operations of the '<em>Output Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_ACTIVATION_OPERATION_COUNT = PIN_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.InvocationActionActivationImpl <em>Invocation Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.InvocationActionActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getInvocationActionActivation()
	 * @generated
	 */
	int INVOCATION_ACTION_ACTIVATION = 6;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__RUNNING = ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__INCOMING_EDGES = ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__OUTGOING_EDGES = ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__IS_RUNNING = ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__HELD_TOKENS = ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__PIN_ACTIVATIONS = ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION__FIRING = ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Invocation Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT = ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___INITIALIZE = ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_TOKENS__ELIST = ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___RUN = ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___RECEIVE_OFFER = ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___IS_READY__BOOLEAN = ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___FIRE__ELIST = ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___ADD_TOKENS__ELIST = ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___SEND_OFFERS__ELIST = ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___TERMINATE = ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___CLEAR_TOKENS = ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___SEND_OFFERS = ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___DO_ACTION = ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Invocation Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT = ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.CallActionActivationImpl <em>Call Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.CallActionActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getCallActionActivation()
	 * @generated
	 */
	int CALL_ACTION_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = INVOCATION_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = INVOCATION_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = INVOCATION_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__RUNNING = INVOCATION_ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__INCOMING_EDGES = INVOCATION_ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__OUTGOING_EDGES = INVOCATION_ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__IS_RUNNING = INVOCATION_ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__HELD_TOKENS = INVOCATION_ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__PIN_ACTIVATIONS = INVOCATION_ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__FIRING = INVOCATION_ACTION_ACTIVATION__FIRING;

	/**
	 * The feature id for the '<em><b>Call Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION__CALL_EXECUTIONS = INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_FEATURE_COUNT = INVOCATION_ACTION_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___INITIALIZE = INVOCATION_ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_TOKENS__ELIST = INVOCATION_ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = INVOCATION_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = INVOCATION_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___RUN = INVOCATION_ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___RECEIVE_OFFER = INVOCATION_ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___IS_READY__BOOLEAN = INVOCATION_ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = INVOCATION_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___FIRE__ELIST = INVOCATION_ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = INVOCATION_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = INVOCATION_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = INVOCATION_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___ADD_TOKENS__ELIST = INVOCATION_ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___SEND_OFFERS__ELIST = INVOCATION_ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = INVOCATION_ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = INVOCATION_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = INVOCATION_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___TERMINATE = INVOCATION_ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___CLEAR_TOKENS = INVOCATION_ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = INVOCATION_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = INVOCATION_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = INVOCATION_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = INVOCATION_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___SEND_OFFERS = INVOCATION_ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___DO_ACTION = INVOCATION_ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = INVOCATION_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = INVOCATION_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = INVOCATION_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = INVOCATION_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Get Call Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___GET_CALL_EXECUTION__EXECUTION = INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Call Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___REMOVE_CALL_EXECUTION__EXECUTION = INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize Input Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___INITIALIZE_INPUT_PARAMETER_VALUES__EXECUTION = INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION___COLLECT_OUTPUT_PARAMETER_VALUES__EXECUTION = INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Call Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_OPERATION_COUNT = INVOCATION_ACTION_ACTIVATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Actions.BasicActions.impl.CallBehaviorActionActivationImpl <em>Call Behavior Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Actions.BasicActions.impl.CallBehaviorActionActivationImpl
	 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getCallBehaviorActionActivation()
	 * @generated
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION = 7;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = CALL_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CALL_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CALL_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__RUNNING = CALL_ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__INCOMING_EDGES = CALL_ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__OUTGOING_EDGES = CALL_ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__IS_RUNNING = CALL_ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__HELD_TOKENS = CALL_ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__PIN_ACTIVATIONS = CALL_ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__FIRING = CALL_ACTION_ACTIVATION__FIRING;

	/**
	 * The feature id for the '<em><b>Call Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION__CALL_EXECUTIONS = CALL_ACTION_ACTIVATION__CALL_EXECUTIONS;

	/**
	 * The number of structural features of the '<em>Call Behavior Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION_FEATURE_COUNT = CALL_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___INITIALIZE = CALL_ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_TOKENS__ELIST = CALL_ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = CALL_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = CALL_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___RUN = CALL_ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___RECEIVE_OFFER = CALL_ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___IS_READY__BOOLEAN = CALL_ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CALL_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___FIRE__ELIST = CALL_ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = CALL_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = CALL_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CALL_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___ADD_TOKENS__ELIST = CALL_ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___SEND_OFFERS__ELIST = CALL_ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = CALL_ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CALL_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CALL_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___TERMINATE = CALL_ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___CLEAR_TOKENS = CALL_ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CALL_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CALL_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CALL_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = CALL_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___SEND_OFFERS = CALL_ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___DO_ACTION = CALL_ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = CALL_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = CALL_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = CALL_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = CALL_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Get Call Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___GET_CALL_EXECUTION__EXECUTION = CALL_ACTION_ACTIVATION___GET_CALL_EXECUTION__EXECUTION;

	/**
	 * The operation id for the '<em>Remove Call Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___REMOVE_CALL_EXECUTION__EXECUTION = CALL_ACTION_ACTIVATION___REMOVE_CALL_EXECUTION__EXECUTION;

	/**
	 * The operation id for the '<em>Initialize Input Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___INITIALIZE_INPUT_PARAMETER_VALUES__EXECUTION = CALL_ACTION_ACTIVATION___INITIALIZE_INPUT_PARAMETER_VALUES__EXECUTION;

	/**
	 * The operation id for the '<em>Collect Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION___COLLECT_OUTPUT_PARAMETER_VALUES__EXECUTION = CALL_ACTION_ACTIVATION___COLLECT_OUTPUT_PARAMETER_VALUES__EXECUTION;

	/**
	 * The number of operations of the '<em>Call Behavior Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_ACTIVATION_OPERATION_COUNT = CALL_ACTION_ACTIVATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.ActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation
	 * @generated
	 */
	EClass getActionActivation();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivations <em>Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin Activations</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivations()
	 * @see #getActionActivation()
	 * @generated
	 */
	EReference getActionActivation_PinActivations();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#isFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#isFiring()
	 * @see #getActionActivation()
	 * @generated
	 */
	EAttribute getActionActivation_Firing();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivation(org.eclipse.uml2.uml.Pin, fumlConfiguration.Actions.BasicActions.PinActivation) <em>Get Pin Activation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Activation</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivation(org.eclipse.uml2.uml.Pin, fumlConfiguration.Actions.BasicActions.PinActivation)
	 * @generated
	 */
	EOperation getActionActivation__GetPinActivation__Pin_PinActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#sendOffers() <em>Send Offers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Offers</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#sendOffers()
	 * @generated
	 */
	EOperation getActionActivation__SendOffers();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#doAction() <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#doAction()
	 * @generated
	 */
	EOperation getActionActivation__DoAction();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#shouldFireAgain(boolean) <em>Should Fire Again</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Fire Again</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#shouldFireAgain(boolean)
	 * @generated
	 */
	EOperation getActionActivation__ShouldFireAgain__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#putToken(org.eclipse.uml2.uml.OutputPin, fumlConfiguration.Classes.Kernel.Value) <em>Put Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Token</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#putToken(org.eclipse.uml2.uml.OutputPin, fumlConfiguration.Classes.Kernel.Value)
	 * @generated
	 */
	EOperation getActionActivation__PutToken__OutputPin_Value();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#takeTokens(org.eclipse.uml2.uml.InputPin, org.eclipse.emf.common.util.EList) <em>Take Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Tokens</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#takeTokens(org.eclipse.uml2.uml.InputPin, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActionActivation__TakeTokens__InputPin_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#putTokens(org.eclipse.uml2.uml.OutputPin, org.eclipse.emf.common.util.EList) <em>Put Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Tokens</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#putTokens(org.eclipse.uml2.uml.OutputPin, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActionActivation__PutTokens__OutputPin_EList();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.PinActivation <em>Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.PinActivation
	 * @generated
	 */
	EClass getPinActivation();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation()
	 * @see #getPinActivation()
	 * @generated
	 */
	EReference getPinActivation_ActionActivation();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Actions.BasicActions.PinActivation#getCount_temp <em>Count temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count temp</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.PinActivation#getCount_temp()
	 * @see #getPinActivation()
	 * @generated
	 */
	EAttribute getPinActivation_Count_temp();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.InputPinActivation <em>Input Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.InputPinActivation
	 * @generated
	 */
	EClass getInputPinActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.OpaqueActionActivation <em>Opaque Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.OpaqueActionActivation
	 * @generated
	 */
	EClass getOpaqueActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.OutputPinActivation <em>Output Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.OutputPinActivation
	 * @generated
	 */
	EClass getOutputPinActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation <em>Call Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation
	 * @generated
	 */
	EClass getCallActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation#getCallExecutions <em>Call Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call Executions</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation#getCallExecutions()
	 * @see #getCallActionActivation()
	 * @generated
	 */
	EReference getCallActionActivation_CallExecutions();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation#getCallExecution(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) <em>Get Call Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Call Execution</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation#getCallExecution(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution)
	 * @generated
	 */
	EOperation getCallActionActivation__GetCallExecution__Execution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation#removeCallExecution(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) <em>Remove Call Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Call Execution</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation#removeCallExecution(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution)
	 * @generated
	 */
	EOperation getCallActionActivation__RemoveCallExecution__Execution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation#initializeInputParameterValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) <em>Initialize Input Parameter Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Input Parameter Values</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation#initializeInputParameterValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution)
	 * @generated
	 */
	EOperation getCallActionActivation__InitializeInputParameterValues__Execution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Actions.BasicActions.CallActionActivation#collectOutputParameterValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) <em>Collect Output Parameter Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Output Parameter Values</em>' operation.
	 * @see fumlConfiguration.Actions.BasicActions.CallActionActivation#collectOutputParameterValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution)
	 * @generated
	 */
	EOperation getCallActionActivation__CollectOutputParameterValues__Execution();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.InvocationActionActivation <em>Invocation Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.InvocationActionActivation
	 * @generated
	 */
	EClass getInvocationActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation <em>Call Behavior Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Behavior Action Activation</em>'.
	 * @see fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation
	 * @generated
	 */
	EClass getCallBehaviorActionActivation();

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
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl <em>Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getActionActivation()
		 * @generated
		 */
		EClass ACTION_ACTIVATION = eINSTANCE.getActionActivation();

		/**
		 * The meta object literal for the '<em><b>Pin Activations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION__PIN_ACTIVATIONS = eINSTANCE.getActionActivation_PinActivations();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ACTIVATION__FIRING = eINSTANCE.getActionActivation_Firing();

		/**
		 * The meta object literal for the '<em><b>Get Pin Activation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = eINSTANCE.getActionActivation__GetPinActivation__Pin_PinActivation();

		/**
		 * The meta object literal for the '<em><b>Send Offers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___SEND_OFFERS = eINSTANCE.getActionActivation__SendOffers();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___DO_ACTION = eINSTANCE.getActionActivation__DoAction();

		/**
		 * The meta object literal for the '<em><b>Should Fire Again</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = eINSTANCE.getActionActivation__ShouldFireAgain__boolean();

		/**
		 * The meta object literal for the '<em><b>Put Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = eINSTANCE.getActionActivation__PutToken__OutputPin_Value();

		/**
		 * The meta object literal for the '<em><b>Take Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = eINSTANCE.getActionActivation__TakeTokens__InputPin_EList();

		/**
		 * The meta object literal for the '<em><b>Put Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = eINSTANCE.getActionActivation__PutTokens__OutputPin_EList();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl <em>Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getPinActivation()
		 * @generated
		 */
		EClass PIN_ACTIVATION = eINSTANCE.getPinActivation();

		/**
		 * The meta object literal for the '<em><b>Action Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION__ACTION_ACTIVATION = eINSTANCE.getPinActivation_ActionActivation();

		/**
		 * The meta object literal for the '<em><b>Count temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_ACTIVATION__COUNT_TEMP = eINSTANCE.getPinActivation_Count_temp();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.InputPinActivationImpl <em>Input Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.InputPinActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getInputPinActivation()
		 * @generated
		 */
		EClass INPUT_PIN_ACTIVATION = eINSTANCE.getInputPinActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.OpaqueActionActivationImpl <em>Opaque Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.OpaqueActionActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getOpaqueActionActivation()
		 * @generated
		 */
		EClass OPAQUE_ACTION_ACTIVATION = eINSTANCE.getOpaqueActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.OutputPinActivationImpl <em>Output Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.OutputPinActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getOutputPinActivation()
		 * @generated
		 */
		EClass OUTPUT_PIN_ACTIVATION = eINSTANCE.getOutputPinActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.CallActionActivationImpl <em>Call Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.CallActionActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getCallActionActivation()
		 * @generated
		 */
		EClass CALL_ACTION_ACTIVATION = eINSTANCE.getCallActionActivation();

		/**
		 * The meta object literal for the '<em><b>Call Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION_ACTIVATION__CALL_EXECUTIONS = eINSTANCE.getCallActionActivation_CallExecutions();

		/**
		 * The meta object literal for the '<em><b>Get Call Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION_ACTIVATION___GET_CALL_EXECUTION__EXECUTION = eINSTANCE.getCallActionActivation__GetCallExecution__Execution();

		/**
		 * The meta object literal for the '<em><b>Remove Call Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION_ACTIVATION___REMOVE_CALL_EXECUTION__EXECUTION = eINSTANCE.getCallActionActivation__RemoveCallExecution__Execution();

		/**
		 * The meta object literal for the '<em><b>Initialize Input Parameter Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION_ACTIVATION___INITIALIZE_INPUT_PARAMETER_VALUES__EXECUTION = eINSTANCE.getCallActionActivation__InitializeInputParameterValues__Execution();

		/**
		 * The meta object literal for the '<em><b>Collect Output Parameter Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION_ACTIVATION___COLLECT_OUTPUT_PARAMETER_VALUES__EXECUTION = eINSTANCE.getCallActionActivation__CollectOutputParameterValues__Execution();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.InvocationActionActivationImpl <em>Invocation Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.InvocationActionActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getInvocationActionActivation()
		 * @generated
		 */
		EClass INVOCATION_ACTION_ACTIVATION = eINSTANCE.getInvocationActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Actions.BasicActions.impl.CallBehaviorActionActivationImpl <em>Call Behavior Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Actions.BasicActions.impl.CallBehaviorActionActivationImpl
		 * @see fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getCallBehaviorActionActivation()
		 * @generated
		 */
		EClass CALL_BEHAVIOR_ACTION_ACTIVATION = eINSTANCE.getCallBehaviorActionActivation();

	}

} //BasicActionsPackage
