/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfiguration.Loci.LociPackage;

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
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntermediateActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/activities/intermediateactivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IntermediateActivitiesConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActivitiesPackage eINSTANCE = fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityExecutionImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityExecution()
	 * @generated
	 */
	int ACTIVITY_EXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__RUNTIME_MODEL_ELEMENT = BasicBehaviorsPackage.EXECUTION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__FEATURE_VALUES = BasicBehaviorsPackage.EXECUTION__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__LOCUS_EXTENSIONAL_VALUE = BasicBehaviorsPackage.EXECUTION__LOCUS_EXTENSIONAL_VALUE;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__TYPES = BasicBehaviorsPackage.EXECUTION__TYPES;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__CONTEXT = BasicBehaviorsPackage.EXECUTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__PARAMETER_VALUES = BasicBehaviorsPackage.EXECUTION__PARAMETER_VALUES;

	/**
	 * The feature id for the '<em><b>Activation Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__ACTIVATION_GROUP = BasicBehaviorsPackage.EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_FEATURE_COUNT = BasicBehaviorsPackage.EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___INITIALIZE = BasicBehaviorsPackage.EXECUTION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___GET_TYPES__ELIST = BasicBehaviorsPackage.EXECUTION___GET_TYPES__ELIST;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___COPY__VALUE = BasicBehaviorsPackage.EXECUTION___COPY__VALUE;

	/**
	 * The operation id for the '<em>New </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___NEW____VALUE = BasicBehaviorsPackage.EXECUTION___NEW____VALUE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___EQUALS__VALUE_BOOLEAN = BasicBehaviorsPackage.EXECUTION___EQUALS__VALUE_BOOLEAN;

	/**
	 * The operation id for the '<em>Has Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___HAS_TYPE__CLASSIFIER_BOOLEAN = BasicBehaviorsPackage.EXECUTION___HAS_TYPE__CLASSIFIER_BOOLEAN;

	/**
	 * The operation id for the '<em>Create Feature Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___CREATE_FEATURE_VALUES = BasicBehaviorsPackage.EXECUTION___CREATE_FEATURE_VALUES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE = BasicBehaviorsPackage.EXECUTION___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE;

	/**
	 * The operation id for the '<em>Set Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT = BasicBehaviorsPackage.EXECUTION___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___DESTROY = BasicBehaviorsPackage.EXECUTION___DESTROY;

	/**
	 * The operation id for the '<em>Set Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE = BasicBehaviorsPackage.EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___EXECUTE = BasicBehaviorsPackage.EXECUTION___EXECUTE;

	/**
	 * The operation id for the '<em>Get Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST = BasicBehaviorsPackage.EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE = BasicBehaviorsPackage.EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___TERMINATE = BasicBehaviorsPackage.EXECUTION___TERMINATE;

	/**
	 * The operation id for the '<em>Get Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___GET_BEHAVIOR__BEHAVIOR = BasicBehaviorsPackage.EXECUTION___GET_BEHAVIOR__BEHAVIOR;

	/**
	 * The operation id for the '<em>Collect Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___COLLECT_OUTPUT_PARAMETER_VALUES = BasicBehaviorsPackage.EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameter Value Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION___SET_PARAMETER_VALUE_VALUES__PARAMETERVALUE_ACTIVITYPARAMETERNODEACTIVATION = BasicBehaviorsPackage.EXECUTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_OPERATION_COUNT = BasicBehaviorsPackage.EXECUTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationGroupImpl <em>Activity Node Activation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationGroupImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityNodeActivationGroup()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Edge Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS = 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___ACTIVATE__ELIST_ELIST = 0;

	/**
	 * The operation id for the '<em>Get Output Parameter Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS__ELIST = 1;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATIONS__ELIST = 2;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_EDGE_INSTANCES__ELIST = 3;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___RUN__ELIST = 4;

	/**
	 * The operation id for the '<em>Create Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = 5;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = 6;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = 7;

	/**
	 * The operation id for the '<em>Run Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___RUN_NODES__ELIST = 8;

	/**
	 * The operation id for the '<em>Get Initially Enabled Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___GET_INITIALLY_ENABLED_NODE_ACTIVATIONS__ELIST_ELIST = 9;

	/**
	 * The operation id for the '<em>Check Incoming Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___CHECK_INCOMING_EDGES__ELIST_ELIST_BOOLEAN = 10;

	/**
	 * The operation id for the '<em>Get Source Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___GET_SOURCE_ACTIVATIONS__ELIST_ACTIVITYEDGEINSTANCE_ELIST = 11;

	/**
	 * The operation id for the '<em>Terminate All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP___TERMINATE_ALL = 12;

	/**
	 * The number of operations of the '<em>Activity Node Activation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_OPERATION_COUNT = 13;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationImpl <em>Activity Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityNodeActivation()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__RUNNING = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__IS_RUNNING = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION__HELD_TOKENS = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___INITIALIZE = LociPackage.SEMANTIC_VISITOR___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___GET_TOKENS__ELIST = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___RUN = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___RECEIVE_OFFER = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___IS_READY__BOOLEAN = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___FIRE__ELIST = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___ADD_TOKENS__ELIST = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___SEND_OFFERS__ELIST = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___ADD_TOKEN__TOKEN = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___TERMINATE = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___CLEAR_TOKENS = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 20;

	/**
	 * The number of operations of the '<em>Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT = LociPackage.SEMANTIC_VISITOR_OPERATION_COUNT + 21;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl <em>Object Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getObjectNodeActivation()
	 * @generated
	 */
	int OBJECT_NODE_ACTIVATION = 7;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__RUNNING = ACTIVITY_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__INCOMING_EDGES = ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__OUTGOING_EDGES = ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__IS_RUNNING = ACTIVITY_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__HELD_TOKENS = ACTIVITY_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT = ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_FEATURE_COUNT = ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___INITIALIZE = ACTIVITY_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = ACTIVITY_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = ACTIVITY_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___RUN = ACTIVITY_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___RECEIVE_OFFER = ACTIVITY_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___IS_READY__BOOLEAN = ACTIVITY_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___FIRE__ELIST = ACTIVITY_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = ACTIVITY_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = ACTIVITY_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = ACTIVITY_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___ADD_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___SEND_OFFERS__ELIST = ACTIVITY_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___ADD_TOKEN__TOKEN = ACTIVITY_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = ACTIVITY_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = ACTIVITY_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___TERMINATE = ACTIVITY_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___CLEAR_TOKENS = ACTIVITY_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = ACTIVITY_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Count Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Take Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Object Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OPERATION_COUNT = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityParameterNodeActivationImpl <em>Activity Parameter Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityParameterNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityParameterNodeActivation()
	 * @generated
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = OBJECT_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = OBJECT_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = OBJECT_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__RUNNING = OBJECT_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__INCOMING_EDGES = OBJECT_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__OUTGOING_EDGES = OBJECT_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__IS_RUNNING = OBJECT_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__HELD_TOKENS = OBJECT_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION__OFFERED_TOKEN_COUNT = OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT;

	/**
	 * The number of structural features of the '<em>Activity Parameter Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION_FEATURE_COUNT = OBJECT_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___INITIALIZE = OBJECT_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_TOKENS__ELIST = OBJECT_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = OBJECT_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = OBJECT_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___RUN = OBJECT_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___RECEIVE_OFFER = OBJECT_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___IS_READY__BOOLEAN = OBJECT_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = OBJECT_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___FIRE__ELIST = OBJECT_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = OBJECT_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = OBJECT_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = OBJECT_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___ADD_TOKENS__ELIST = OBJECT_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___SEND_OFFERS__ELIST = OBJECT_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___ADD_TOKEN__TOKEN = OBJECT_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = OBJECT_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = OBJECT_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___TERMINATE = OBJECT_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___CLEAR_TOKENS = OBJECT_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = OBJECT_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = OBJECT_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = OBJECT_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Count Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = OBJECT_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT;

	/**
	 * The operation id for the '<em>Send Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS = OBJECT_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS;

	/**
	 * The operation id for the '<em>Get Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = OBJECT_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT = OBJECT_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT;

	/**
	 * The operation id for the '<em>Take Unoffered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = OBJECT_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST;

	/**
	 * The number of operations of the '<em>Activity Parameter Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_ACTIVATION_OPERATION_COUNT = OBJECT_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.TokenImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___WITHDRAW = 0;

	/**
	 * The operation id for the '<em>Is Withdrawn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___IS_WITHDRAWN__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN = 2;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___GET_VALUE__VALUE = 3;

	/**
	 * The operation id for the '<em>Is Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___IS_CONTROL__BOOLEAN = 4;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl <em>Activity Edge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityEdgeInstance()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Group Activity Edge Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Edge Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE__OFFERS = 4;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Has Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE___HAS_OFFER__BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE___TAKE_OFFERED_TOKENS__ELIST = 1;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE___COUNT_OFFERED_VALUES__INT = 2;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE___TAKE_OFFERED_TOKENS__ELIST_INT = 3;

	/**
	 * The operation id for the '<em>Send Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE___SEND_OFFER__ELIST = 4;

	/**
	 * The number of operations of the '<em>Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ControlNodeActivationImpl <em>Control Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ControlNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getControlNodeActivation()
	 * @generated
	 */
	int CONTROL_NODE_ACTIVATION = 6;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__RUNNING = ACTIVITY_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__INCOMING_EDGES = ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__OUTGOING_EDGES = ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__IS_RUNNING = ACTIVITY_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION__HELD_TOKENS = ACTIVITY_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Control Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION_FEATURE_COUNT = ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___INITIALIZE = ACTIVITY_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = ACTIVITY_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = ACTIVITY_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___RUN = ACTIVITY_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___RECEIVE_OFFER = ACTIVITY_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN = ACTIVITY_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___FIRE__ELIST = ACTIVITY_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = ACTIVITY_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = ACTIVITY_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = ACTIVITY_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST = ACTIVITY_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST = ACTIVITY_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN = ACTIVITY_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = ACTIVITY_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = ACTIVITY_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___TERMINATE = ACTIVITY_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___CLEAR_TOKENS = ACTIVITY_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = ACTIVITY_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Control Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVATION_OPERATION_COUNT = ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.OfferImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 8;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFERED_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Has Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___HAS_TOKENS__BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Get Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___GET_OFFERED_TOKENS__ELIST = 1;

	/**
	 * The operation id for the '<em>Count Offered Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___COUNT_OFFERED_VALUES__INT = 2;

	/**
	 * The operation id for the '<em>Remove Withdrawn Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___REMOVE_WITHDRAWN_TOKENS = 3;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl <em>Decision Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDecisionNodeActivation()
	 * @generated
	 */
	int DECISION_NODE_ACTIVATION = 9;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The operation id for the '<em>Remove Joined Control Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___REMOVE_JOINED_CONTROL_TOKENS__ELIST_ELIST_ELIST = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Decision Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_DECISION_VALUES__ELIST_ELIST = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Determine Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___DETERMINE_OFFERED_TOKENS__ELIST_ELIST_ACTIVITYEDGEINSTANCE_ELIST_BOOLEAN = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___TEST__VALUESPECIFICATION_VALUE_BOOLEAN = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Object Flow Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___HAS_OBJECT_FLOW_INPUT__BOOLEAN = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Decision Input Flow Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_VALUE__VALUE = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Execute Decision Input Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___EXECUTE_DECISION_INPUT_BEHAVIOR__VALUE_VALUE_VALUE = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Decision Input Flow Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_INSTANCE__ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ControlTokenImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 10;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN___WITHDRAW = TOKEN___WITHDRAW;

	/**
	 * The operation id for the '<em>Is Withdrawn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN___IS_WITHDRAWN__BOOLEAN = TOKEN___IS_WITHDRAWN__BOOLEAN;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN = TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN___GET_VALUE__VALUE = TOKEN___GET_VALUE__VALUE;

	/**
	 * The operation id for the '<em>Is Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN___IS_CONTROL__BOOLEAN = TOKEN___IS_CONTROL__BOOLEAN;

	/**
	 * The number of operations of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ObjectTokenImpl <em>Object Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ObjectTokenImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getObjectToken()
	 * @generated
	 */
	int OBJECT_TOKEN = 11;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN__VALUE = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN___WITHDRAW = TOKEN___WITHDRAW;

	/**
	 * The operation id for the '<em>Is Withdrawn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN___IS_WITHDRAWN__BOOLEAN = TOKEN___IS_WITHDRAWN__BOOLEAN;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN = TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN___GET_VALUE__VALUE = TOKEN___GET_VALUE__VALUE;

	/**
	 * The operation id for the '<em>Is Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN___IS_CONTROL__BOOLEAN = TOKEN___IS_CONTROL__BOOLEAN;

	/**
	 * The number of operations of the '<em>Object Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 12;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__REMAINING_OFFERS_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Token Is Withdrawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___WITHDRAW = TOKEN___WITHDRAW;

	/**
	 * The operation id for the '<em>Is Withdrawn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___IS_WITHDRAWN__BOOLEAN = TOKEN___IS_WITHDRAWN__BOOLEAN;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN = TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___GET_VALUE__VALUE = TOKEN___GET_VALUE__VALUE;

	/**
	 * The operation id for the '<em>Is Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___IS_CONTROL__BOOLEAN = TOKEN___IS_CONTROL__BOOLEAN;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN___INITIALIZE = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.InitialNodeActivationImpl <em>Initial Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.InitialNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getInitialNodeActivation()
	 * @generated
	 */
	int INITIAL_NODE_ACTIVATION = 13;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Initial Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Initial Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.MergeNodeActivationImpl <em>Merge Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.MergeNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getMergeNodeActivation()
	 * @generated
	 */
	int MERGE_NODE_ACTIVATION = 14;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Merge Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Merge Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.JoinNodeActivationImpl <em>Join Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.JoinNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getJoinNodeActivation()
	 * @generated
	 */
	int JOIN_NODE_ACTIVATION = 15;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Join Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Join Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkNodeActivationImpl <em>Fork Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ForkNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkNodeActivation()
	 * @generated
	 */
	int FORK_NODE_ACTIVATION = 16;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Fork Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Fork Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityFinalNodeActivationImpl <em>Activity Final Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityFinalNodeActivationImpl
	 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityFinalNodeActivation()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION = 17;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT = CONTROL_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = CONTROL_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__RUNNING = CONTROL_NODE_ACTIVATION__RUNNING;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__INCOMING_EDGES = CONTROL_NODE_ACTIVATION__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__OUTGOING_EDGES = CONTROL_NODE_ACTIVATION__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__IS_RUNNING = CONTROL_NODE_ACTIVATION__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION__HELD_TOKENS = CONTROL_NODE_ACTIVATION__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Activity Final Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION_FEATURE_COUNT = CONTROL_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___INITIALIZE = CONTROL_NODE_ACTIVATION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___GET_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___GET_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Create Node Activations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = CONTROL_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS;

	/**
	 * The operation id for the '<em>Create Edge Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = CONTROL_NODE_ACTIVATION___CREATE_EDGE_INSTANCES;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___RUN = CONTROL_NODE_ACTIVATION___RUN;

	/**
	 * The operation id for the '<em>Receive Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___RECEIVE_OFFER = CONTROL_NODE_ACTIVATION___RECEIVE_OFFER;

	/**
	 * The operation id for the '<em>Is Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___IS_READY__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_READY__BOOLEAN;

	/**
	 * The operation id for the '<em>Take Offered Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___FIRE__ELIST = CONTROL_NODE_ACTIVATION___FIRE__ELIST;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = CONTROL_NODE_ACTIVATION___IS_RUNNING__BOOLEAN;

	/**
	 * The operation id for the '<em>Has Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = CONTROL_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = CONTROL_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT;

	/**
	 * The operation id for the '<em>Add Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___ADD_TOKENS__ELIST = CONTROL_NODE_ACTIVATION___ADD_TOKENS__ELIST;

	/**
	 * The operation id for the '<em>Send Offers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___SEND_OFFERS__ELIST = CONTROL_NODE_ACTIVATION___SEND_OFFERS__ELIST;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___ADD_TOKEN__TOKEN = CONTROL_NODE_ACTIVATION___ADD_TOKEN__TOKEN;

	/**
	 * The operation id for the '<em>Is Source For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = CONTROL_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE;

	/**
	 * The operation id for the '<em>Get Node Activation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = CONTROL_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___TERMINATE = CONTROL_NODE_ACTIVATION___TERMINATE;

	/**
	 * The operation id for the '<em>Clear Tokens</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___CLEAR_TOKENS = CONTROL_NODE_ACTIVATION___CLEAR_TOKENS;

	/**
	 * The operation id for the '<em>Get Execution Locus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = CONTROL_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS;

	/**
	 * The operation id for the '<em>Get Activity Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = CONTROL_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION;

	/**
	 * The operation id for the '<em>Get Execution Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = CONTROL_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT;

	/**
	 * The number of operations of the '<em>Activity Final Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVATION_OPERATION_COUNT = CONTROL_NODE_ACTIVATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execution</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution
	 * @generated
	 */
	EClass getActivityExecution();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Group</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_ActivationGroup();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#collectOutputParameterValues() <em>Collect Output Parameter Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Output Parameter Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#collectOutputParameterValues()
	 * @generated
	 */
	EOperation getActivityExecution__CollectOutputParameterValues();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#setParameterValueValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue, fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation) <em>Set Parameter Value Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameter Value Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#setParameterValueValues(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue, fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation)
	 * @generated
	 */
	EOperation getActivityExecution__SetParameterValueValues__ParameterValue_ActivityParameterNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup <em>Activity Node Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation Group</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup
	 * @generated
	 */
	EClass getActivityNodeActivationGroup();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Execution</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution()
	 * @see #getActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_ActivityExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getEdgeInstances <em>Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Instances</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getEdgeInstances()
	 * @see #getActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_EdgeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivations <em>Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Activations</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivations()
	 * @see #getActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_NodeActivations();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#activate(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#activate(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__Activate__EList_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getOutputParameterNodeActivations(org.eclipse.emf.common.util.EList) <em>Get Output Parameter Node Activations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Parameter Node Activations</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getOutputParameterNodeActivations(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__GetOutputParameterNodeActivations__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createNodeActivations(org.eclipse.emf.common.util.EList) <em>Create Node Activations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Activations</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createNodeActivations(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__CreateNodeActivations__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createEdgeInstances(org.eclipse.emf.common.util.EList) <em>Create Edge Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Edge Instances</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createEdgeInstances(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__CreateEdgeInstances__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#run(org.eclipse.emf.common.util.EList) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#run(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__Run__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) <em>Create Node Activation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Activation</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#createNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__CreateNodeActivation__ActivityNode_ActivityNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) <em>Get Activity Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activity Execution</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__GetActivityExecution__ActivityExecution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) <em>Get Node Activation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Activation</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__GetNodeActivation__ActivityNode_ActivityNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#runNodes(org.eclipse.emf.common.util.EList) <em>Run Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Nodes</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#runNodes(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__RunNodes__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getInitiallyEnabledNodeActivations(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Initially Enabled Node Activations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initially Enabled Node Activations</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getInitiallyEnabledNodeActivations(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__GetInitiallyEnabledNodeActivations__EList_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#checkIncomingEdges(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Check Incoming Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Incoming Edges</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#checkIncomingEdges(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__CheckIncomingEdges__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getSourceActivations(org.eclipse.emf.common.util.EList, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance, org.eclipse.emf.common.util.EList) <em>Get Source Activations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Activations</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getSourceActivations(org.eclipse.emf.common.util.EList, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__GetSourceActivations__EList_ActivityEdgeInstance_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#terminateAll() <em>Terminate All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate All</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#terminateAll()
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup__TerminateAll();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation <em>Activity Parameter Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Parameter Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation
	 * @generated
	 */
	EClass getActivityParameterNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation <em>Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation
	 * @generated
	 */
	EClass getActivityNodeActivation();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group Activity Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EReference getActivityNodeActivation_Group_ActivityNodeActivation();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNode_ActivityNodeActivation <em>Node Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Activity Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNode_ActivityNodeActivation()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EReference getActivityNodeActivation_Node_ActivityNodeActivation();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EAttribute getActivityNodeActivation_Running();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getIncomingEdges()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EReference getActivityNodeActivation_IncomingEdges();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getOutgoingEdges()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EReference getActivityNodeActivation_OutgoingEdges();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isIsRunning()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EAttribute getActivityNodeActivation_IsRunning();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getHeldTokens()
	 * @see #getActivityNodeActivation()
	 * @generated
	 */
	EReference getActivityNodeActivation_HeldTokens();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getTokens(org.eclipse.emf.common.util.EList) <em>Get Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivation__GetTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#createNodeActivations() <em>Create Node Activations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Activations</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#createNodeActivations()
	 * @generated
	 */
	EOperation getActivityNodeActivation__CreateNodeActivations();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#createEdgeInstances() <em>Create Edge Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Edge Instances</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#createEdgeInstances()
	 * @generated
	 */
	EOperation getActivityNodeActivation__CreateEdgeInstances();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#run()
	 * @generated
	 */
	EOperation getActivityNodeActivation__Run();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#receiveOffer() <em>Receive Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Offer</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#receiveOffer()
	 * @generated
	 */
	EOperation getActivityNodeActivation__ReceiveOffer();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isReady(boolean) <em>Is Ready</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ready</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isReady(boolean)
	 * @generated
	 */
	EOperation getActivityNodeActivation__IsReady__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#takeOfferedTokens(org.eclipse.emf.common.util.EList) <em>Take Offered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Offered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#takeOfferedTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivation__TakeOfferedTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#fire(org.eclipse.emf.common.util.EList) <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#fire(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivation__Fire__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning(boolean) <em>Is Running</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Running</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning(boolean)
	 * @generated
	 */
	EOperation getActivityNodeActivation__IsRunning__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#hasOffers(boolean) <em>Has Offers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Offers</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#hasOffers(boolean)
	 * @generated
	 */
	EOperation getActivityNodeActivation__HasOffers__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#removeToken(fumlConfiguration.Activities.IntermediateActivities.Token, int) <em>Remove Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Token</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#removeToken(fumlConfiguration.Activities.IntermediateActivities.Token, int)
	 * @generated
	 */
	EOperation getActivityNodeActivation__RemoveToken__Token_int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#addTokens(org.eclipse.emf.common.util.EList) <em>Add Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#addTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivation__AddTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#sendOffers(org.eclipse.emf.common.util.EList) <em>Send Offers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Offers</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#sendOffers(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityNodeActivation__SendOffers__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#addToken(fumlConfiguration.Activities.IntermediateActivities.Token) <em>Add Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Token</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#addToken(fumlConfiguration.Activities.IntermediateActivities.Token)
	 * @generated
	 */
	EOperation getActivityNodeActivation__AddToken__Token();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isSourceFor(boolean, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) <em>Is Source For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Source For</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isSourceFor(boolean, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance)
	 * @generated
	 */
	EOperation getActivityNodeActivation__IsSourceFor__boolean_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) <em>Get Node Activation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Activation</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNodeActivation(org.eclipse.uml2.uml.ActivityNode, fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation)
	 * @generated
	 */
	EOperation getActivityNodeActivation__GetNodeActivation__ActivityNode_ActivityNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#terminate()
	 * @generated
	 */
	EOperation getActivityNodeActivation__Terminate();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#clearTokens() <em>Clear Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#clearTokens()
	 * @generated
	 */
	EOperation getActivityNodeActivation__ClearTokens();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getExecutionLocus(fumlConfiguration.Loci.Locus) <em>Get Execution Locus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Execution Locus</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getExecutionLocus(fumlConfiguration.Loci.Locus)
	 * @generated
	 */
	EOperation getActivityNodeActivation__GetExecutionLocus__Locus();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getActivityExecution(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) <em>Get Activity Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activity Execution</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getActivityExecution(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution)
	 * @generated
	 */
	EOperation getActivityNodeActivation__GetActivityExecution__ActivityExecution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getExecutionContext(fumlConfiguration.Classes.Kernel.Object) <em>Get Execution Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Execution Context</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getExecutionContext(fumlConfiguration.Classes.Kernel.Object)
	 * @generated
	 */
	EOperation getActivityNodeActivation__GetExecutionContext__Object();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Activities.IntermediateActivities.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Holder</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#withdraw() <em>Withdraw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Withdraw</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#withdraw()
	 * @generated
	 */
	EOperation getToken__Withdraw();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#isWithdrawn(boolean) <em>Is Withdrawn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Withdrawn</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#isWithdrawn(boolean)
	 * @generated
	 */
	EOperation getToken__IsWithdrawn__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#transfer(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation, fumlConfiguration.Activities.IntermediateActivities.Token) <em>Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#transfer(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation, fumlConfiguration.Activities.IntermediateActivities.Token)
	 * @generated
	 */
	EOperation getToken__Transfer__ActivityNodeActivation_Token();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#getValue(fumlConfiguration.Classes.Kernel.Value) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#getValue(fumlConfiguration.Classes.Kernel.Value)
	 * @generated
	 */
	EOperation getToken__GetValue__Value();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#isControl(boolean) <em>Is Control</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Control</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#isControl(boolean)
	 * @generated
	 */
	EOperation getToken__IsControl__boolean();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance <em>Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance
	 * @generated
	 */
	EClass getActivityEdgeInstance();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group Activity Edge Instance</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getGroup_ActivityEdgeInstance()
	 * @see #getActivityEdgeInstance()
	 * @generated
	 */
	EReference getActivityEdgeInstance_Group_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge Activity Edge Instance</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getEdge_ActivityEdgeInstance()
	 * @see #getActivityEdgeInstance()
	 * @generated
	 */
	EReference getActivityEdgeInstance_Edge_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getSource()
	 * @see #getActivityEdgeInstance()
	 * @generated
	 */
	EReference getActivityEdgeInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getTarget()
	 * @see #getActivityEdgeInstance()
	 * @generated
	 */
	EReference getActivityEdgeInstance_Target();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getOffers()
	 * @see #getActivityEdgeInstance()
	 * @generated
	 */
	EReference getActivityEdgeInstance_Offers();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#hasOffer(boolean) <em>Has Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Offer</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#hasOffer(boolean)
	 * @generated
	 */
	EOperation getActivityEdgeInstance__HasOffer__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#takeOfferedTokens(org.eclipse.emf.common.util.EList) <em>Take Offered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Offered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#takeOfferedTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityEdgeInstance__TakeOfferedTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#countOfferedValues(int) <em>Count Offered Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Offered Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#countOfferedValues(int)
	 * @generated
	 */
	EOperation getActivityEdgeInstance__CountOfferedValues__int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#takeOfferedTokens(org.eclipse.emf.common.util.EList, int) <em>Take Offered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Offered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#takeOfferedTokens(org.eclipse.emf.common.util.EList, int)
	 * @generated
	 */
	EOperation getActivityEdgeInstance__TakeOfferedTokens__EList_int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#sendOffer(org.eclipse.emf.common.util.EList) <em>Send Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Offer</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#sendOffer(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivityEdgeInstance__SendOffer__EList();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation <em>Control Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation
	 * @generated
	 */
	EClass getControlNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation <em>Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation
	 * @generated
	 */
	EClass getObjectNodeActivation();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getOfferedTokenCount <em>Offered Token Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offered Token Count</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getOfferedTokenCount()
	 * @see #getObjectNodeActivation()
	 * @generated
	 */
	EAttribute getObjectNodeActivation_OfferedTokenCount();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#countUnofferedTokens(int) <em>Count Unoffered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Unoffered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#countUnofferedTokens(int)
	 * @generated
	 */
	EOperation getObjectNodeActivation__CountUnofferedTokens__int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#sendUnofferedTokens() <em>Send Unoffered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Unoffered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#sendUnofferedTokens()
	 * @generated
	 */
	EOperation getObjectNodeActivation__SendUnofferedTokens();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getUnofferedTokens(org.eclipse.emf.common.util.EList) <em>Get Unoffered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unoffered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getUnofferedTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getObjectNodeActivation__GetUnofferedTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#countOfferedValues(int) <em>Count Offered Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Offered Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#countOfferedValues(int)
	 * @generated
	 */
	EOperation getObjectNodeActivation__CountOfferedValues__int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#takeUnofferedTokens(org.eclipse.emf.common.util.EList) <em>Take Unoffered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Unoffered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#takeUnofferedTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getObjectNodeActivation__TakeUnofferedTokens__EList();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Activities.IntermediateActivities.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Offer#hasTokens(boolean) <em>Has Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer#hasTokens(boolean)
	 * @generated
	 */
	EOperation getOffer__HasTokens__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Offer#getOfferedTokens(org.eclipse.emf.common.util.EList) <em>Get Offered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer#getOfferedTokens(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getOffer__GetOfferedTokens__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Offer#countOfferedValues(int) <em>Count Offered Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Offered Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer#countOfferedValues(int)
	 * @generated
	 */
	EOperation getOffer__CountOfferedValues__int();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.Offer#removeWithdrawnTokens() <em>Remove Withdrawn Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Withdrawn Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer#removeWithdrawnTokens()
	 * @generated
	 */
	EOperation getOffer__RemoveWithdrawnTokens();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation <em>Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation
	 * @generated
	 */
	EClass getDecisionNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#removeJoinedControlTokens(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Remove Joined Control Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Joined Control Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#removeJoinedControlTokens(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__RemoveJoinedControlTokens__EList_EList_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionValues(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Decision Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Decision Values</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionValues(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__GetDecisionValues__EList_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#determineOfferedTokens(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance, org.eclipse.emf.common.util.EList, boolean) <em>Determine Offered Tokens</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Determine Offered Tokens</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#determineOfferedTokens(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__DetermineOfferedTokens__EList_EList_ActivityEdgeInstance_EList_boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#test(org.eclipse.uml2.uml.ValueSpecification, fumlConfiguration.Classes.Kernel.Value, boolean) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#test(org.eclipse.uml2.uml.ValueSpecification, fumlConfiguration.Classes.Kernel.Value, boolean)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__Test__ValueSpecification_Value_boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#hasObjectFlowInput(boolean) <em>Has Object Flow Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Object Flow Input</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#hasObjectFlowInput(boolean)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__HasObjectFlowInput__boolean();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionInputFlowValue(fumlConfiguration.Classes.Kernel.Value) <em>Get Decision Input Flow Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Decision Input Flow Value</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionInputFlowValue(fumlConfiguration.Classes.Kernel.Value)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__GetDecisionInputFlowValue__Value();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#executeDecisionInputBehavior(fumlConfiguration.Classes.Kernel.Value, fumlConfiguration.Classes.Kernel.Value, fumlConfiguration.Classes.Kernel.Value) <em>Execute Decision Input Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Decision Input Behavior</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#executeDecisionInputBehavior(fumlConfiguration.Classes.Kernel.Value, fumlConfiguration.Classes.Kernel.Value, fumlConfiguration.Classes.Kernel.Value)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__ExecuteDecisionInputBehavior__Value_Value_Value();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionInputFlowInstance(fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) <em>Get Decision Input Flow Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Decision Input Flow Instance</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation#getDecisionInputFlowInstance(fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance)
	 * @generated
	 */
	EOperation getDecisionNodeActivation__GetDecisionInputFlowInstance__ActivityEdgeInstance();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectToken <em>Object Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Token</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectToken
	 * @generated
	 */
	EClass getObjectToken();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectToken#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectToken#getValue()
	 * @see #getObjectToken()
	 * @generated
	 */
	EReference getObjectToken_Value();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Token Is Withdrawn</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken#isBaseTokenIsWithdrawn()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_BaseTokenIsWithdrawn();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken#initialize()
	 * @generated
	 */
	EOperation getForkedToken__Initialize();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation <em>Initial Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation
	 * @generated
	 */
	EClass getInitialNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation <em>Merge Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation
	 * @generated
	 */
	EClass getMergeNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation <em>Join Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation
	 * @generated
	 */
	EClass getJoinNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation <em>Fork Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation
	 * @generated
	 */
	EClass getForkNodeActivation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation <em>Activity Final Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation
	 * @generated
	 */
	EClass getActivityFinalNodeActivation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateActivitiesFactory getIntermediateActivitiesFactory();

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
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityExecutionImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityExecution()
		 * @generated
		 */
		EClass ACTIVITY_EXECUTION = eINSTANCE.getActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Activation Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__ACTIVATION_GROUP = eINSTANCE.getActivityExecution_ActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Collect Output Parameter Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EXECUTION___COLLECT_OUTPUT_PARAMETER_VALUES = eINSTANCE.getActivityExecution__CollectOutputParameterValues();

		/**
		 * The meta object literal for the '<em><b>Set Parameter Value Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EXECUTION___SET_PARAMETER_VALUE_VALUES__PARAMETERVALUE_ACTIVITYPARAMETERNODEACTIVATION = eINSTANCE.getActivityExecution__SetParameterValueValues__ParameterValue_ActivityParameterNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationGroupImpl <em>Activity Node Activation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationGroupImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityNodeActivationGroup()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_GROUP = eINSTANCE.getActivityNodeActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Activity Execution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION = eINSTANCE.getActivityNodeActivationGroup_ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Edge Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES = eINSTANCE.getActivityNodeActivationGroup_EdgeInstances();

		/**
		 * The meta object literal for the '<em><b>Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS = eINSTANCE.getActivityNodeActivationGroup_NodeActivations();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___ACTIVATE__ELIST_ELIST = eINSTANCE.getActivityNodeActivationGroup__Activate__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Output Parameter Node Activations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS__ELIST = eINSTANCE.getActivityNodeActivationGroup__GetOutputParameterNodeActivations__EList();

		/**
		 * The meta object literal for the '<em><b>Create Node Activations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATIONS__ELIST = eINSTANCE.getActivityNodeActivationGroup__CreateNodeActivations__EList();

		/**
		 * The meta object literal for the '<em><b>Create Edge Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_EDGE_INSTANCES__ELIST = eINSTANCE.getActivityNodeActivationGroup__CreateEdgeInstances__EList();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___RUN__ELIST = eINSTANCE.getActivityNodeActivationGroup__Run__EList();

		/**
		 * The meta object literal for the '<em><b>Create Node Activation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = eINSTANCE.getActivityNodeActivationGroup__CreateNodeActivation__ActivityNode_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Activity Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = eINSTANCE.getActivityNodeActivationGroup__GetActivityExecution__ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Get Node Activation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = eINSTANCE.getActivityNodeActivationGroup__GetNodeActivation__ActivityNode_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Run Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___RUN_NODES__ELIST = eINSTANCE.getActivityNodeActivationGroup__RunNodes__EList();

		/**
		 * The meta object literal for the '<em><b>Get Initially Enabled Node Activations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___GET_INITIALLY_ENABLED_NODE_ACTIVATIONS__ELIST_ELIST = eINSTANCE.getActivityNodeActivationGroup__GetInitiallyEnabledNodeActivations__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Check Incoming Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___CHECK_INCOMING_EDGES__ELIST_ELIST_BOOLEAN = eINSTANCE.getActivityNodeActivationGroup__CheckIncomingEdges__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Source Activations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___GET_SOURCE_ACTIVATIONS__ELIST_ACTIVITYEDGEINSTANCE_ELIST = eINSTANCE.getActivityNodeActivationGroup__GetSourceActivations__EList_ActivityEdgeInstance_EList();

		/**
		 * The meta object literal for the '<em><b>Terminate All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP___TERMINATE_ALL = eINSTANCE.getActivityNodeActivationGroup__TerminateAll();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityParameterNodeActivationImpl <em>Activity Parameter Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityParameterNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityParameterNodeActivation()
		 * @generated
		 */
		EClass ACTIVITY_PARAMETER_NODE_ACTIVATION = eINSTANCE.getActivityParameterNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationImpl <em>Activity Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityNodeActivation()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION = eINSTANCE.getActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Group Activity Node Activation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getActivityNodeActivation_Group_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Node Activity Node Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getActivityNodeActivation_Node_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ACTIVATION__RUNNING = eINSTANCE.getActivityNodeActivation_Running();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES = eINSTANCE.getActivityNodeActivation_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES = eINSTANCE.getActivityNodeActivation_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ACTIVATION__IS_RUNNING = eINSTANCE.getActivityNodeActivation_IsRunning();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION__HELD_TOKENS = eINSTANCE.getActivityNodeActivation_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Get Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___GET_TOKENS__ELIST = eINSTANCE.getActivityNodeActivation__GetTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Create Node Activations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___CREATE_NODE_ACTIVATIONS = eINSTANCE.getActivityNodeActivation__CreateNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Create Edge Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___CREATE_EDGE_INSTANCES = eINSTANCE.getActivityNodeActivation__CreateEdgeInstances();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___RUN = eINSTANCE.getActivityNodeActivation__Run();

		/**
		 * The meta object literal for the '<em><b>Receive Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___RECEIVE_OFFER = eINSTANCE.getActivityNodeActivation__ReceiveOffer();

		/**
		 * The meta object literal for the '<em><b>Is Ready</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___IS_READY__BOOLEAN = eINSTANCE.getActivityNodeActivation__IsReady__boolean();

		/**
		 * The meta object literal for the '<em><b>Take Offered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___TAKE_OFFERED_TOKENS__ELIST = eINSTANCE.getActivityNodeActivation__TakeOfferedTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___FIRE__ELIST = eINSTANCE.getActivityNodeActivation__Fire__EList();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___IS_RUNNING__BOOLEAN = eINSTANCE.getActivityNodeActivation__IsRunning__boolean();

		/**
		 * The meta object literal for the '<em><b>Has Offers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___HAS_OFFERS__BOOLEAN = eINSTANCE.getActivityNodeActivation__HasOffers__boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___REMOVE_TOKEN__TOKEN_INT = eINSTANCE.getActivityNodeActivation__RemoveToken__Token_int();

		/**
		 * The meta object literal for the '<em><b>Add Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___ADD_TOKENS__ELIST = eINSTANCE.getActivityNodeActivation__AddTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Send Offers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___SEND_OFFERS__ELIST = eINSTANCE.getActivityNodeActivation__SendOffers__EList();

		/**
		 * The meta object literal for the '<em><b>Add Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___ADD_TOKEN__TOKEN = eINSTANCE.getActivityNodeActivation__AddToken__Token();

		/**
		 * The meta object literal for the '<em><b>Is Source For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___IS_SOURCE_FOR__BOOLEAN_ACTIVITYEDGEINSTANCE = eINSTANCE.getActivityNodeActivation__IsSourceFor__boolean_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Get Node Activation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION = eINSTANCE.getActivityNodeActivation__GetNodeActivation__ActivityNode_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___TERMINATE = eINSTANCE.getActivityNodeActivation__Terminate();

		/**
		 * The meta object literal for the '<em><b>Clear Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___CLEAR_TOKENS = eINSTANCE.getActivityNodeActivation__ClearTokens();

		/**
		 * The meta object literal for the '<em><b>Get Execution Locus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_LOCUS__LOCUS = eINSTANCE.getActivityNodeActivation__GetExecutionLocus__Locus();

		/**
		 * The meta object literal for the '<em><b>Get Activity Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION = eINSTANCE.getActivityNodeActivation__GetActivityExecution__ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Get Execution Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION___GET_EXECUTION_CONTEXT__OBJECT = eINSTANCE.getActivityNodeActivation__GetExecutionContext__Object();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.TokenImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '<em><b>Withdraw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___WITHDRAW = eINSTANCE.getToken__Withdraw();

		/**
		 * The meta object literal for the '<em><b>Is Withdrawn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___IS_WITHDRAWN__BOOLEAN = eINSTANCE.getToken__IsWithdrawn__boolean();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___TRANSFER__ACTIVITYNODEACTIVATION_TOKEN = eINSTANCE.getToken__Transfer__ActivityNodeActivation_Token();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___GET_VALUE__VALUE = eINSTANCE.getToken__GetValue__Value();

		/**
		 * The meta object literal for the '<em><b>Is Control</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___IS_CONTROL__BOOLEAN = eINSTANCE.getToken__IsControl__boolean();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl <em>Activity Edge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityEdgeInstance()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE = eINSTANCE.getActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Group Activity Edge Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getActivityEdgeInstance_Group_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Edge Activity Edge Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getActivityEdgeInstance_Edge_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE__SOURCE = eINSTANCE.getActivityEdgeInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE__TARGET = eINSTANCE.getActivityEdgeInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE__OFFERS = eINSTANCE.getActivityEdgeInstance_Offers();

		/**
		 * The meta object literal for the '<em><b>Has Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE___HAS_OFFER__BOOLEAN = eINSTANCE.getActivityEdgeInstance__HasOffer__boolean();

		/**
		 * The meta object literal for the '<em><b>Take Offered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE___TAKE_OFFERED_TOKENS__ELIST = eINSTANCE.getActivityEdgeInstance__TakeOfferedTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Count Offered Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE___COUNT_OFFERED_VALUES__INT = eINSTANCE.getActivityEdgeInstance__CountOfferedValues__int();

		/**
		 * The meta object literal for the '<em><b>Take Offered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE___TAKE_OFFERED_TOKENS__ELIST_INT = eINSTANCE.getActivityEdgeInstance__TakeOfferedTokens__EList_int();

		/**
		 * The meta object literal for the '<em><b>Send Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE___SEND_OFFER__ELIST = eINSTANCE.getActivityEdgeInstance__SendOffer__EList();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ControlNodeActivationImpl <em>Control Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ControlNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getControlNodeActivation()
		 * @generated
		 */
		EClass CONTROL_NODE_ACTIVATION = eINSTANCE.getControlNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl <em>Object Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getObjectNodeActivation()
		 * @generated
		 */
		EClass OBJECT_NODE_ACTIVATION = eINSTANCE.getObjectNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Offered Token Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT = eINSTANCE.getObjectNodeActivation_OfferedTokenCount();

		/**
		 * The meta object literal for the '<em><b>Count Unoffered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT = eINSTANCE.getObjectNodeActivation__CountUnofferedTokens__int();

		/**
		 * The meta object literal for the '<em><b>Send Unoffered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS = eINSTANCE.getObjectNodeActivation__SendUnofferedTokens();

		/**
		 * The meta object literal for the '<em><b>Get Unoffered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST = eINSTANCE.getObjectNodeActivation__GetUnofferedTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Count Offered Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT = eINSTANCE.getObjectNodeActivation__CountOfferedValues__int();

		/**
		 * The meta object literal for the '<em><b>Take Unoffered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST = eINSTANCE.getObjectNodeActivation__TakeUnofferedTokens__EList();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.OfferImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__OFFERED_TOKENS = eINSTANCE.getOffer_OfferedTokens();

		/**
		 * The meta object literal for the '<em><b>Has Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___HAS_TOKENS__BOOLEAN = eINSTANCE.getOffer__HasTokens__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Offered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___GET_OFFERED_TOKENS__ELIST = eINSTANCE.getOffer__GetOfferedTokens__EList();

		/**
		 * The meta object literal for the '<em><b>Count Offered Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___COUNT_OFFERED_VALUES__INT = eINSTANCE.getOffer__CountOfferedValues__int();

		/**
		 * The meta object literal for the '<em><b>Remove Withdrawn Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___REMOVE_WITHDRAWN_TOKENS = eINSTANCE.getOffer__RemoveWithdrawnTokens();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl <em>Decision Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDecisionNodeActivation()
		 * @generated
		 */
		EClass DECISION_NODE_ACTIVATION = eINSTANCE.getDecisionNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Remove Joined Control Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___REMOVE_JOINED_CONTROL_TOKENS__ELIST_ELIST_ELIST = eINSTANCE.getDecisionNodeActivation__RemoveJoinedControlTokens__EList_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Decision Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___GET_DECISION_VALUES__ELIST_ELIST = eINSTANCE.getDecisionNodeActivation__GetDecisionValues__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Determine Offered Tokens</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___DETERMINE_OFFERED_TOKENS__ELIST_ELIST_ACTIVITYEDGEINSTANCE_ELIST_BOOLEAN = eINSTANCE.getDecisionNodeActivation__DetermineOfferedTokens__EList_EList_ActivityEdgeInstance_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___TEST__VALUESPECIFICATION_VALUE_BOOLEAN = eINSTANCE.getDecisionNodeActivation__Test__ValueSpecification_Value_boolean();

		/**
		 * The meta object literal for the '<em><b>Has Object Flow Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___HAS_OBJECT_FLOW_INPUT__BOOLEAN = eINSTANCE.getDecisionNodeActivation__HasObjectFlowInput__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Decision Input Flow Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_VALUE__VALUE = eINSTANCE.getDecisionNodeActivation__GetDecisionInputFlowValue__Value();

		/**
		 * The meta object literal for the '<em><b>Execute Decision Input Behavior</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___EXECUTE_DECISION_INPUT_BEHAVIOR__VALUE_VALUE_VALUE = eINSTANCE.getDecisionNodeActivation__ExecuteDecisionInputBehavior__Value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Get Decision Input Flow Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_INSTANCE__ACTIVITYEDGEINSTANCE = eINSTANCE.getDecisionNodeActivation__GetDecisionInputFlowInstance__ActivityEdgeInstance();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ControlTokenImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ObjectTokenImpl <em>Object Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ObjectTokenImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getObjectToken()
		 * @generated
		 */
		EClass OBJECT_TOKEN = eINSTANCE.getObjectToken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TOKEN__VALUE = eINSTANCE.getObjectToken_Value();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getForkedToken_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_RemainingOffersCount();

		/**
		 * The meta object literal for the '<em><b>Base Token Is Withdrawn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN = eINSTANCE.getForkedToken_BaseTokenIsWithdrawn();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORKED_TOKEN___INITIALIZE = eINSTANCE.getForkedToken__Initialize();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.InitialNodeActivationImpl <em>Initial Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.InitialNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getInitialNodeActivation()
		 * @generated
		 */
		EClass INITIAL_NODE_ACTIVATION = eINSTANCE.getInitialNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.MergeNodeActivationImpl <em>Merge Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.MergeNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getMergeNodeActivation()
		 * @generated
		 */
		EClass MERGE_NODE_ACTIVATION = eINSTANCE.getMergeNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.JoinNodeActivationImpl <em>Join Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.JoinNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getJoinNodeActivation()
		 * @generated
		 */
		EClass JOIN_NODE_ACTIVATION = eINSTANCE.getJoinNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkNodeActivationImpl <em>Fork Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ForkNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getForkNodeActivation()
		 * @generated
		 */
		EClass FORK_NODE_ACTIVATION = eINSTANCE.getForkNodeActivation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityFinalNodeActivationImpl <em>Activity Final Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.ActivityFinalNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getActivityFinalNodeActivation()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE_ACTIVATION = eINSTANCE.getActivityFinalNodeActivation();

	}

} //IntermediateActivitiesPackage
