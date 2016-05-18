/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;

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
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory
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
	String eNS_URI = "umlTrace_IntermediateActivities";

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
	IntermediateActivitiesPackage eINSTANCE = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl <em>Traced Activity Edge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityEdgeInstance()
	 * @generated
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Edge Activity Edge Instance Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Group Activity Edge Instance Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Source Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Target Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE = 5;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Traced Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityExecutionImpl <em>Traced Activity Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityExecutionImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityExecution()
	 * @generated
	 */
	int TRACED_ACTIVITY_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = BasicBehaviorsPackage.TRACED_EXECUTION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__RUNTIME_MODEL_ELEMENT_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__FEATURE_VALUES_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__FEATURE_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__LOCUS_EXTENSIONAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Types Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__TYPES_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__TYPES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Context Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__CONTEXT_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__PARAMETER_VALUES_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activation Group Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE = BasicBehaviorsPackage.TRACED_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION_FEATURE_COUNT = BasicBehaviorsPackage.TRACED_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EXECUTION_OPERATION_COUNT = BasicBehaviorsPackage.TRACED_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl <em>Traced Activity Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityNodeActivation()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Traced Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Traced Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl <em>Traced Activity Node Activation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityNodeActivationGroup()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Activity Execution Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Edge Instances Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Node Activations Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ORIGINAL_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Traced Activity Node Activation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Traced Activity Node Activation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_ACTIVATION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 8;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__HOLDER_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Original Object Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedForkedToken()
	 * @generated
	 */
	int TRACED_FORKED_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__HOLDER_SEQUENCE = TRACED_TOKEN__HOLDER_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__ORIGINAL_OBJECT_TOKEN = TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN;

	/**
	 * The feature id for the '<em><b>Base Token Is Withdrawn Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_OPERATION_COUNT = TRACED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectNodeActivationImpl <em>Traced Object Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectNodeActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedObjectNodeActivation()
	 * @generated
	 */
	int TRACED_OBJECT_NODE_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = TRACED_ACTIVITY_NODE_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__IS_RUNNING_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__RUNNING_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE = TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Object Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION_FEATURE_COUNT = TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Object Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_ACTIVATION_OPERATION_COUNT = TRACED_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectTokenImpl <em>Traced Object Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectTokenImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedObjectToken()
	 * @generated
	 */
	int TRACED_OBJECT_TOKEN = 6;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TOKEN__HOLDER_SEQUENCE = TRACED_TOKEN__HOLDER_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TOKEN__ORIGINAL_OBJECT_TOKEN = TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TOKEN__VALUE_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Object Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Object Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TOKEN_OPERATION_COUNT = TRACED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedOfferImpl
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedOffer()
	 * @generated
	 */
	int TRACED_OFFER = 7;

	/**
	 * The feature id for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__ORIGINAL_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance <em>Traced Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge Instance</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance
	 * @generated
	 */
	EClass getTracedActivityEdgeInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getEdge_ActivityEdgeInstanceSequence <em>Edge Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getEdge_ActivityEdgeInstanceSequence()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getGroup_ActivityEdgeInstanceSequence <em>Group Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getGroup_ActivityEdgeInstanceSequence()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOffersSequence <em>Offers Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOffersSequence()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_OffersSequence();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOriginalObject()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getSourceSequence <em>Source Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getSourceSequence()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_SourceSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getTargetSequence <em>Target Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getTargetSequence()
	 * @see #getTracedActivityEdgeInstance()
	 * @generated
	 */
	EReference getTracedActivityEdgeInstance_TargetSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution <em>Traced Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Execution</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution
	 * @generated
	 */
	EClass getTracedActivityExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence <em>Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Group Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence()
	 * @see #getTracedActivityExecution()
	 * @generated
	 */
	EReference getTracedActivityExecution_ActivationGroupSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation <em>Traced Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation
	 * @generated
	 */
	EClass getTracedActivityNodeActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getGroup_ActivityNodeActivationSequence <em>Group Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Activity Node Activation Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getGroup_ActivityNodeActivationSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getHeldTokensSequence <em>Held Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getHeldTokensSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_HeldTokensSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIncomingEdgesSequence <em>Incoming Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Edges Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIncomingEdgesSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_IncomingEdgesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIsRunningSequence <em>Is Running Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Running Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIsRunningSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_IsRunningSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getNode_ActivityNodeActivationSequence <em>Node Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Activity Node Activation Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getNode_ActivityNodeActivationSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getOutgoingEdgesSequence <em>Outgoing Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Edges Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getOutgoingEdgesSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_OutgoingEdgesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getRunningSequence <em>Running Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getRunningSequence()
	 * @see #getTracedActivityNodeActivation()
	 * @generated
	 */
	EReference getTracedActivityNodeActivation_RunningSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup <em>Traced Activity Node Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node Activation Group</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup
	 * @generated
	 */
	EClass getTracedActivityNodeActivationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence <em>Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Execution Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence()
	 * @see #getTracedActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getTracedActivityNodeActivationGroup_ActivityExecutionSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getEdgeInstancesSequence <em>Edge Instances Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Instances Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getEdgeInstancesSequence()
	 * @see #getTracedActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getTracedActivityNodeActivationGroup_EdgeInstancesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence <em>Node Activations Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Activations Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence()
	 * @see #getTracedActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getTracedActivityNodeActivationGroup_NodeActivationsSequence();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getOriginalObject()
	 * @see #getTracedActivityNodeActivationGroup()
	 * @generated
	 */
	EReference getTracedActivityNodeActivationGroup_OriginalObject();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken <em>Traced Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Forked Token</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken
	 * @generated
	 */
	EClass getTracedForkedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenIsWithdrawnSequence <em>Base Token Is Withdrawn Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Token Is Withdrawn Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenIsWithdrawnSequence()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_BaseTokenIsWithdrawnSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Token Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenSequence()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_BaseTokenSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remaining Offers Count Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getRemainingOffersCountSequence()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_RemainingOffersCountSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation <em>Traced Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object Node Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation
	 * @generated
	 */
	EClass getTracedObjectNodeActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence <em>Offered Token Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Token Count Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence()
	 * @see #getTracedObjectNodeActivation()
	 * @generated
	 */
	EReference getTracedObjectNodeActivation_OfferedTokenCountSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken <em>Traced Object Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object Token</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken
	 * @generated
	 */
	EClass getTracedObjectToken();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken#getValueSequence()
	 * @see #getTracedObjectToken()
	 * @generated
	 */
	EReference getTracedObjectToken_ValueSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer <em>Traced Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Offer</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer
	 * @generated
	 */
	EClass getTracedOffer();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Tokens Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOfferedTokensSequence()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OfferedTokensSequence();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOriginalObject()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getHolderSequence <em>Holder Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holder Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getHolderSequence()
	 * @see #getTracedToken()
	 * @generated
	 */
	EReference getTracedToken_HolderSequence();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getOriginalObject_Token <em>Original Object Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Token</em>'.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getOriginalObject_Token()
	 * @see #getTracedToken()
	 * @generated
	 */
	EReference getTracedToken_OriginalObject_Token();

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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl <em>Traced Activity Edge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityEdgeInstance()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getTracedActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Edge Activity Edge Instance Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence();

		/**
		 * The meta object literal for the '<em><b>Group Activity Edge Instance Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence();

		/**
		 * The meta object literal for the '<em><b>Offers Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE = eINSTANCE.getTracedActivityEdgeInstance_OffersSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT = eINSTANCE.getTracedActivityEdgeInstance_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Source Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE = eINSTANCE.getTracedActivityEdgeInstance_SourceSequence();

		/**
		 * The meta object literal for the '<em><b>Target Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE = eINSTANCE.getTracedActivityEdgeInstance_TargetSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityExecutionImpl <em>Traced Activity Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityExecutionImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityExecution()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_EXECUTION = eINSTANCE.getTracedActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Activation Group Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getTracedActivityExecution_ActivationGroupSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl <em>Traced Activity Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityNodeActivation()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getTracedActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence();

		/**
		 * The meta object literal for the '<em><b>Held Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_HeldTokensSequence();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_IncomingEdgesSequence();

		/**
		 * The meta object literal for the '<em><b>Is Running Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_IsRunningSequence();

		/**
		 * The meta object literal for the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_OutgoingEdgesSequence();

		/**
		 * The meta object literal for the '<em><b>Running Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE = eINSTANCE.getTracedActivityNodeActivation_RunningSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl <em>Traced Activity Node Activation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedActivityNodeActivationGroup()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_NODE_ACTIVATION_GROUP = eINSTANCE.getTracedActivityNodeActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Activity Execution Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE = eINSTANCE.getTracedActivityNodeActivationGroup_ActivityExecutionSequence();

		/**
		 * The meta object literal for the '<em><b>Edge Instances Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE = eINSTANCE.getTracedActivityNodeActivationGroup_EdgeInstancesSequence();

		/**
		 * The meta object literal for the '<em><b>Node Activations Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE = eINSTANCE.getTracedActivityNodeActivationGroup_NodeActivationsSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ORIGINAL_OBJECT = eINSTANCE.getTracedActivityNodeActivationGroup_OriginalObject();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedForkedToken()
		 * @generated
		 */
		EClass TRACED_FORKED_TOKEN = eINSTANCE.getTracedForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token Is Withdrawn Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE = eINSTANCE.getTracedForkedToken_BaseTokenIsWithdrawnSequence();

		/**
		 * The meta object literal for the '<em><b>Base Token Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = eINSTANCE.getTracedForkedToken_BaseTokenSequence();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE = eINSTANCE.getTracedForkedToken_RemainingOffersCountSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectNodeActivationImpl <em>Traced Object Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectNodeActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedObjectNodeActivation()
		 * @generated
		 */
		EClass TRACED_OBJECT_NODE_ACTIVATION = eINSTANCE.getTracedObjectNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Offered Token Count Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE = eINSTANCE.getTracedObjectNodeActivation_OfferedTokenCountSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectTokenImpl <em>Traced Object Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectTokenImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedObjectToken()
		 * @generated
		 */
		EClass TRACED_OBJECT_TOKEN = eINSTANCE.getTracedObjectToken();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECT_TOKEN__VALUE_SEQUENCE = eINSTANCE.getTracedObjectToken_ValueSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedOfferImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedOffer()
		 * @generated
		 */
		EClass TRACED_OFFER = eINSTANCE.getTracedOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = eINSTANCE.getTracedOffer_OfferedTokensSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__ORIGINAL_OBJECT = eINSTANCE.getTracedOffer_OriginalObject();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl
		 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

		/**
		 * The meta object literal for the '<em><b>Holder Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TOKEN__HOLDER_SEQUENCE = eINSTANCE.getTracedToken_HolderSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN = eINSTANCE.getTracedToken_OriginalObject_Token();

	}

} //IntermediateActivitiesPackage
