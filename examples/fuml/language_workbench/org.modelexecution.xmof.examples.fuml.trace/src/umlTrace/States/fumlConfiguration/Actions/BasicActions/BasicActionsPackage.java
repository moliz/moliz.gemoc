/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

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
 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory
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
	String eNS_URI = "umlTrace_BasicActions";

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
	BasicActionsPackage eINSTANCE = umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedActionActivation()
	 * @generated
	 */
	int TRACED_ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

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
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl <em>Traced Invocation Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInvocationActionActivation()
	 * @generated
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = TRACED_ACTION_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

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
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl <em>Traced Call Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallActionActivation()
	 * @generated
	 */
	int TRACED_CALL_ACTION_ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = TRACED_INVOCATION_ACTION_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

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
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedPinActivation()
	 * @generated
	 */
	int TRACED_PIN_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Original Object Semantic Visitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR = IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__ORIGINAL_OBJECT_SEMANTIC_VISITOR;

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
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation <em>Traced Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation
	 * @generated
	 */
	EClass getTracedActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firing Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getFiringSequence()
	 * @see #getTracedActionActivation()
	 * @generated
	 */
	EReference getTracedActionActivation_FiringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence <em>Pin Activations Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Activations Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence()
	 * @see #getTracedActionActivation()
	 * @generated
	 */
	EReference getTracedActionActivation_PinActivationsSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation <em>Traced Call Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Action Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation
	 * @generated
	 */
	EClass getTracedCallActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence <em>Call Executions Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call Executions Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence()
	 * @see #getTracedCallActionActivation()
	 * @generated
	 */
	EReference getTracedCallActionActivation_CallExecutionsSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation <em>Traced Invocation Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Invocation Action Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation
	 * @generated
	 */
	EClass getTracedInvocationActionActivation();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation <em>Traced Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin Activation</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation
	 * @generated
	 */
	EClass getTracedPinActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence <em>Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Activation Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence()
	 * @see #getTracedPinActivation()
	 * @generated
	 */
	EReference getTracedPinActivation_ActionActivationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence <em>Count temp Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count temp Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence()
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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedActionActivation()
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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl <em>Traced Call Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedCallActionActivation()
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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl <em>Traced Invocation Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedInvocationActionActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedInvocationActionActivation()
		 * @generated
		 */
		EClass TRACED_INVOCATION_ACTION_ACTIVATION = eINSTANCE.getTracedInvocationActionActivation();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl
		 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl#getTracedPinActivation()
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
