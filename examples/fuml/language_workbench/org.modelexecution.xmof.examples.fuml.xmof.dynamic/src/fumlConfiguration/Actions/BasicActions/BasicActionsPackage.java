/**
 */
package fumlConfiguration.Actions.BasicActions;

import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

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
