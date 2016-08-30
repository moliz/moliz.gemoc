/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfiguration.Loci.LociPackage;

import org.eclipse.emf.ecore.EAttribute;
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
	 * Returns the meta object for class '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation <em>Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Activation</em>'.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation
	 * @generated
	 */
	EClass getDecisionNodeActivation();

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
		 * The meta object literal for the '{@link fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl <em>Decision Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.DecisionNodeActivationImpl
		 * @see fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getDecisionNodeActivation()
		 * @generated
		 */
		EClass DECISION_NODE_ACTIVATION = eINSTANCE.getDecisionNodeActivation();

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
