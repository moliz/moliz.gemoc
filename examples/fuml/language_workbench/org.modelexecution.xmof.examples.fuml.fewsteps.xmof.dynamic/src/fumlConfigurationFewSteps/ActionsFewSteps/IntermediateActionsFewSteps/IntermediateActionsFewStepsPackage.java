/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateActionsFewStepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntermediateActionsFewSteps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/actions/intermediateactionsFewSteps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IntermediateActionsConfFewSteps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsFewStepsPackage eINSTANCE = fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ValueSpecificationActionActivationImpl <em>Value Specification Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ValueSpecificationActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getValueSpecificationActionActivation()
	 * @generated
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__INCOMING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__OUTGOING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__IS_RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__HELD_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__PIN_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION__FIRING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Value Specification Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION_FEATURE_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___INITIALIZE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___RUN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___RECEIVE_OFFER = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___IS_READY__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___FIRE__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___ADD_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___SEND_OFFERS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___TERMINATE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___CLEAR_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___SEND_OFFERS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___DO_ACTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Value Specification Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_ACTIVATION_OPERATION_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.CreateObjectActionActivationImpl <em>Create Object Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.CreateObjectActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getCreateObjectActionActivation()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__INCOMING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__OUTGOING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__IS_RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__HELD_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__PIN_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION__FIRING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Create Object Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION_FEATURE_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___INITIALIZE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___RUN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___RECEIVE_OFFER = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___IS_READY__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___FIRE__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___ADD_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___SEND_OFFERS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___TERMINATE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___CLEAR_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___SEND_OFFERS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___DO_ACTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Create Object Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_ACTIVATION_OPERATION_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.StructuralFeatureActionActivationImpl <em>Structural Feature Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.StructuralFeatureActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getStructuralFeatureActionActivation()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES = BasicActionsFewStepsPackage.ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING = BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER = BasicActionsFewStepsPackage.ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION = BasicActionsFewStepsPackage.ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = BasicActionsFewStepsPackage.ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = BasicActionsFewStepsPackage.ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT = BasicActionsFewStepsPackage.ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ReadStructuralFeatureActionActivationImpl <em>Read Structural Feature Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ReadStructuralFeatureActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getReadStructuralFeatureActionActivation()
	 * @generated
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES = STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES = STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS = STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS = STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Read Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER = STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Read Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.WriteStructuralFeatureActionActivationImpl <em>Write Structural Feature Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.WriteStructuralFeatureActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getWriteStructuralFeatureActionActivation()
	 * @generated
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES = STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES = STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS = STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS = STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING = STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Write Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER = STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION = STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Write Structural Feature Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.AddStructuralFeatureValueActionActivationImpl <em>Add Structural Feature Value Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.AddStructuralFeatureValueActionActivationImpl
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getAddStructuralFeatureValueActionActivation()
	 * @generated
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__RUNNING = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__INCOMING_EDGES = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__OUTGOING_EDGES = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__IS_RUNNING = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__HELD_TOKENS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__PIN_ACTIVATIONS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__PIN_ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION__FIRING = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION__FIRING;

	/**
	 * The number of structural features of the '<em>Add Structural Feature Value Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___INITIALIZE = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_TOKENS__ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___RUN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___RECEIVE_OFFER = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___IS_READY__BOOLEAN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___FIRE__ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___ADD_TOKENS__ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___SEND_OFFERS__ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___TERMINATE = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___CLEAR_TOKENS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Get Pin Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___SEND_OFFERS = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SEND_OFFERS;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___DO_ACTION = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___DO_ACTION;

	/**
	 * The operation id for the '<em>Should Fire Again</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN;

	/**
	 * The operation id for the '<em>Put Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE;

	/**
	 * The operation id for the '<em>Take Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST;

	/**
	 * The operation id for the '<em>Put Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST;

	/**
	 * The number of operations of the '<em>Add Structural Feature Value Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_OPERATION_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ValueSpecificationActionActivation <em>Value Specification Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ValueSpecificationActionActivation
	 * @generated
	 */
	EClass getValueSpecificationActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.CreateObjectActionActivation <em>Create Object Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.CreateObjectActionActivation
	 * @generated
	 */
	EClass getCreateObjectActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.StructuralFeatureActionActivation <em>Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.StructuralFeatureActionActivation
	 * @generated
	 */
	EClass getStructuralFeatureActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ReadStructuralFeatureActionActivation <em>Read Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Structural Feature Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ReadStructuralFeatureActionActivation
	 * @generated
	 */
	EClass getReadStructuralFeatureActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.WriteStructuralFeatureActionActivation <em>Write Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Structural Feature Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.WriteStructuralFeatureActionActivation
	 * @generated
	 */
	EClass getWriteStructuralFeatureActionActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.AddStructuralFeatureValueActionActivation <em>Add Structural Feature Value Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Structural Feature Value Action Activation</em>'.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.AddStructuralFeatureValueActionActivation
	 * @generated
	 */
	EClass getAddStructuralFeatureValueActionActivation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateActionsFewStepsFactory getIntermediateActionsFewStepsFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ValueSpecificationActionActivationImpl <em>Value Specification Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ValueSpecificationActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getValueSpecificationActionActivation()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION_ACTION_ACTIVATION = eINSTANCE.getValueSpecificationActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.CreateObjectActionActivationImpl <em>Create Object Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.CreateObjectActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getCreateObjectActionActivation()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION_ACTIVATION = eINSTANCE.getCreateObjectActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.StructuralFeatureActionActivationImpl <em>Structural Feature Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.StructuralFeatureActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getStructuralFeatureActionActivation()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_ACTION_ACTIVATION = eINSTANCE.getStructuralFeatureActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ReadStructuralFeatureActionActivationImpl <em>Read Structural Feature Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.ReadStructuralFeatureActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getReadStructuralFeatureActionActivation()
		 * @generated
		 */
		EClass READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION = eINSTANCE.getReadStructuralFeatureActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.WriteStructuralFeatureActionActivationImpl <em>Write Structural Feature Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.WriteStructuralFeatureActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getWriteStructuralFeatureActionActivation()
		 * @generated
		 */
		EClass WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION = eINSTANCE.getWriteStructuralFeatureActionActivation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.AddStructuralFeatureValueActionActivationImpl <em>Add Structural Feature Value Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.AddStructuralFeatureValueActionActivationImpl
		 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl#getAddStructuralFeatureValueActionActivation()
		 * @generated
		 */
		EClass ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION = eINSTANCE.getAddStructuralFeatureValueActionActivation();

	}

} //IntermediateActionsFewStepsPackage
