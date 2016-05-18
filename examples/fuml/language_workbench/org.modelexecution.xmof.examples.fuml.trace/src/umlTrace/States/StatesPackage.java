/**
 */
package umlTrace.States;

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
 * @see umlTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = umlTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.Value
	 * @see umlTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 57;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActionActivation_firing_ValueImpl <em>Action Activation firing Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActionActivation_firing_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActionActivation_firing_Value()
	 * @generated
	 */
	int ACTION_ACTIVATION_FIRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__FIRING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Activation firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Activation firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActionActivation_pinActivations_ValueImpl <em>Action Activation pin Activations Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActionActivation_pinActivations_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActionActivation_pinActivations_Value()
	 * @generated
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Activation pin Activations Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Activation pin Activations Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl <em>Activity Edge Instance edge Activity Edge Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Edge Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__EDGE_ACTIVITY_EDGE_INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance edge Activity Edge Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Edge Instance edge Activity Edge Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl <em>Activity Edge Instance group Activity Edge Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Group Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance group Activity Edge Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Edge Instance group Activity Edge Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityEdgeInstance_offers_ValueImpl <em>Activity Edge Instance offers Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityEdgeInstance_offers_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_offers_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__OFFERS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Edge Instance offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityEdgeInstance_source_ValueImpl <em>Activity Edge Instance source Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityEdgeInstance_source_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_source_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__SOURCE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance source Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Edge Instance source Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityEdgeInstance_target_ValueImpl <em>Activity Edge Instance target Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityEdgeInstance_target_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_target_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE = 6;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__TARGET = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge Instance target Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Edge Instance target Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_INSTANCE_TARGET_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityExecution_activationGroup_ValueImpl <em>Activity Execution activation Group Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityExecution_activationGroup_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityExecution_activationGroup_Value()
	 * @generated
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Activation Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__ACTIVATION_GROUP = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Execution activation Group Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Execution activation Group Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_activityExecution_ValueImpl <em>Activity Node Activation Group activity Execution Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivationGroup_activityExecution_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_activityExecution_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE = 8;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__ACTIVITY_EXECUTION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation Group activity Execution Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation Group activity Execution Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl <em>Activity Node Activation Group edge Instances Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_edgeInstances_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE = 9;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Edge Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation Group edge Instances Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation Group edge Instances Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_nodeActivations_ValueImpl <em>Activity Node Activation Group node Activations Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivationGroup_nodeActivations_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_nodeActivations_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE = 10;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Node Activations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__NODE_ACTIVATIONS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation Group node Activations Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation Group node Activations Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl <em>Activity Node Activation group Activity Node Activation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_group_ActivityNodeActivation_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE = 11;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Group Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__GROUP_ACTIVITY_NODE_ACTIVATION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation group Activity Node Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation group Activity Node Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_heldTokens_ValueImpl <em>Activity Node Activation held Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_heldTokens_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_heldTokens_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE = 12;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__HELD_TOKENS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_incomingEdges_ValueImpl <em>Activity Node Activation incoming Edges Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_incomingEdges_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_incomingEdges_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE = 13;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__INCOMING_EDGES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation incoming Edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation incoming Edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_isRunning_ValueImpl <em>Activity Node Activation is Running Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_isRunning_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_isRunning_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE = 14;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__IS_RUNNING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation is Running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation is Running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl <em>Activity Node Activation node Activity Node Activation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_node_ActivityNodeActivation_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE = 15;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__NODE_ACTIVITY_NODE_ACTIVATION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation node Activity Node Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation node Activity Node Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl <em>Activity Node Activation outgoing Edges Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_outgoingEdges_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE = 16;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation outgoing Edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation outgoing Edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ActivityNodeActivation_running_ValueImpl <em>Activity Node Activation running Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ActivityNodeActivation_running_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_running_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE = 17;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__RUNNING = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Node Activation running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node Activation running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl <em>Boolean Value value Boolean Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getBooleanValue_value_BooleanValue_Value()
	 * @generated
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE = 18;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Value value Boolean Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Value value Boolean Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.CallActionActivation_callExecutions_ValueImpl <em>Call Action Activation call Executions Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.CallActionActivation_callExecutions_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getCallActionActivation_callExecutions_Value()
	 * @generated
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE = 19;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Call Executions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Action Activation call Executions Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Action Activation call Executions Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.CompoundValue_featureValues_ValueImpl <em>Compound Value feature Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.CompoundValue_featureValues_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getCompoundValue_featureValues_Value()
	 * @generated
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE = 20;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE__FEATURE_VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compound Value feature Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound Value feature Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_VALUES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl <em>Element Configuration semantic Visitor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getElementConfiguration_semanticVisitor_Value()
	 * @generated
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE = 21;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Visitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Configuration semantic Visitor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Configuration semantic Visitor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Evaluation_locus_Evaluation_ValueImpl <em>Evaluation locus Evaluation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Evaluation_locus_Evaluation_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getEvaluation_locus_Evaluation_Value()
	 * @generated
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE = 22;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE__LOCUS_EVALUATION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation locus Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evaluation locus Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_LOCUS_EVALUATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl <em>Evaluation specification Evaluation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getEvaluation_specification_Evaluation_Value()
	 * @generated
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE = 23;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation specification Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evaluation specification Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_EVALUATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl <em>Execution Environment locus Execution Environment Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionEnvironment_locus_ExecutionEnvironment_Value()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE = 24;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Locus Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Environment locus Execution Environment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Environment locus Execution Environment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl <em>Execution Factory built In Types Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_builtInTypes_Value()
	 * @generated
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE = 25;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Built In Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Factory built In Types Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Factory built In Types Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl <em>Execution Factory locus Execution Factory Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_locus_ExecutionFactory_Value()
	 * @generated
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE = 26;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Locus Execution Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Factory locus Execution Factory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Factory locus Execution Factory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl <em>Execution Factory primitive Behavior Prototypes Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_primitiveBehaviorPrototypes_Value()
	 * @generated
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE = 27;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Behavior Prototypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PRIMITIVE_BEHAVIOR_PROTOTYPES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Factory primitive Behavior Prototypes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Factory primitive Behavior Prototypes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Execution_context_ValueImpl <em>Execution context Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Execution_context_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecution_context_Value()
	 * @generated
	 */
	int EXECUTION_CONTEXT_VALUE = 28;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE__CONTEXT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution context Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution context Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl <em>Execution parameter Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Execution_parameterValues_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecution_parameterValues_Value()
	 * @generated
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE = 29;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution parameter Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution parameter Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PARAMETER_VALUES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Executor_locus_Executor_ValueImpl <em>Executor locus Executor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Executor_locus_Executor_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExecutor_locus_Executor_Value()
	 * @generated
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE = 30;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Locus Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Executor locus Executor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executor locus Executor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_LOCUS_EXECUTOR_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl <em>Extensional Value locus Extensional Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getExtensionalValue_locus_ExtensionalValue_Value()
	 * @generated
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE = 31;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extensional Value locus Extensional Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extensional Value locus Extensional Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.FeatureValue_feature_ValueImpl <em>Feature Value feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.FeatureValue_feature_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_feature_Value()
	 * @generated
	 */
	int FEATURE_VALUE_FEATURE_VALUE = 32;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE__FEATURE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Value feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Value feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.FeatureValue_position_ValueImpl <em>Feature Value position Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.FeatureValue_position_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_position_Value()
	 * @generated
	 */
	int FEATURE_VALUE_POSITION_VALUE = 33;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE__POSITION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Value position Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Value position Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_POSITION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl <em>Feature Value values Feature Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_values_FeatureValue_Value()
	 * @generated
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE = 34;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values Feature Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Value values Feature Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Value values Feature Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl <em>Forked Token base Token Is Withdrawn Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_baseTokenIsWithdrawn_Value()
	 * @generated
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE = 35;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Base Token Is Withdrawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Is Withdrawn Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forked Token base Token Is Withdrawn Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ForkedToken_baseToken_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
	 * @generated
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE = 36;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = 37;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.InputParameterValues_name_ValueImpl <em>Input Parameter Values name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.InputParameterValues_name_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getInputParameterValues_name_Value()
	 * @generated
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE = 38;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE__NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Parameter Values name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Parameter Values name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_NAME_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.InputParameterValues_parameterValues_ValueImpl <em>Input Parameter Values parameter Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.InputParameterValues_parameterValues_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getInputParameterValues_parameterValues_Value()
	 * @generated
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE = 39;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Parameter Values parameter Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Parameter Values parameter Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.IntegerValue_value_IntegerValue_ValueImpl <em>Integer Value value Integer Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.IntegerValue_value_IntegerValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getIntegerValue_value_IntegerValue_Value()
	 * @generated
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE = 40;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__VALUE_INTEGER_VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Value value Integer Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Value value Integer Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Locus_executor_ValueImpl <em>Locus executor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Locus_executor_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_executor_Value()
	 * @generated
	 */
	int LOCUS_EXECUTOR_VALUE = 41;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE__EXECUTOR = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locus executor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locus executor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXECUTOR_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Locus_extensionalValues_ValueImpl <em>Locus extensional Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Locus_extensionalValues_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_extensionalValues_Value()
	 * @generated
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE = 42;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Extensional Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE__EXTENSIONAL_VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locus extensional Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locus extensional Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_EXTENSIONAL_VALUES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Locus_factory_ValueImpl <em>Locus factory Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Locus_factory_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_factory_Value()
	 * @generated
	 */
	int LOCUS_FACTORY_VALUE = 43;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE__FACTORY = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locus factory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locus factory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FACTORY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl <em>Object Node Activation offered Token Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getObjectNodeActivation_offeredTokenCount_Value()
	 * @generated
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE = 44;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Node Activation offered Token Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Node Activation offered Token Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ObjectToken_value_ValueImpl <em>Object Token value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ObjectToken_value_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getObjectToken_value_Value()
	 * @generated
	 */
	int OBJECT_TOKEN_VALUE_VALUE = 45;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Token value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Token value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Object_types_ValueImpl <em>Object types Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Object_types_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getObject_types_Value()
	 * @generated
	 */
	int OBJECT_TYPES_VALUE = 46;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE__TYPES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object types Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object types Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPES_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Offer_offeredTokens_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
	 * @generated
	 */
	int OFFER_OFFERED_TOKENS_VALUE = 47;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl <em>Parameter Value parameter Parameter Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getParameterValue_parameter_ParameterValue_Value()
	 * @generated
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE = 48;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parameter Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Value parameter Parameter Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Value parameter Parameter Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.ParameterValue_values_ParameterValue_ValueImpl <em>Parameter Value values Parameter Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.ParameterValue_values_ParameterValue_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getParameterValue_values_ParameterValue_Value()
	 * @generated
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE = 49;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values Parameter Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__VALUES_PARAMETER_VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Value values Parameter Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Value values Parameter Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl <em>Pin Activation action Activation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.PinActivation_actionActivation_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getPinActivation_actionActivation_Value()
	 * @generated
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE = 50;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Action Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pin Activation action Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pin Activation action Activation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_ACTION_ACTIVATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl <em>Pin Activation count temp Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.PinActivation_count_temp_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getPinActivation_count_temp_Value()
	 * @generated
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE = 51;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pin Activation count temp Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pin Activation count temp Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_ACTIVATION_COUNT_TEMP_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.PrimitiveValue_type_ValueImpl <em>Primitive Value type Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.PrimitiveValue_type_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getPrimitiveValue_type_Value()
	 * @generated
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE = 52;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE__TYPE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Primitive Value type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Value type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_TYPE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Reference_referent_ValueImpl <em>Reference referent Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Reference_referent_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getReference_referent_Value()
	 * @generated
	 */
	int REFERENCE_REFERENT_VALUE = 53;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE__REFERENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference referent Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference referent Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REFERENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl <em>Semantic Visitor runtime Model Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE = 54;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Semantic Visitor runtime Model Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Visitor runtime Model Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.StateImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 55;

	/**
	 * The feature id for the '<em><b>Action Activation firing Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION_ACTIVATION_FIRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Action Activation pin Activations Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Activity Edge Instance edge Activity Edge Instance Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Activity Edge Instance group Activity Edge Instance Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Activity Edge Instance offers Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Activity Edge Instance source Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Activity Edge Instance target Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Activity Execution activation Group Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Activity Node Activation Group activity Execution Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Activity Node Activation Group edge Instances Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Activity Node Activation Group node Activations Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Activity Node Activation group Activity Node Activation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Activity Node Activation held Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Activity Node Activation incoming Edges Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Activity Node Activation is Running Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Activity Node Activation node Activity Node Activation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Activity Node Activation outgoing Edges Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Activity Node Activation running Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Boolean Value value Boolean Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Call Action Activation call Executions Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Compound Value feature Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Element Configuration semantic Visitor Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 22;

	/**
	 * The feature id for the '<em><b>Evaluation locus Evaluation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVALUATION_LOCUS_EVALUATION_VALUES = 23;

	/**
	 * The feature id for the '<em><b>Evaluation specification Evaluation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Execution Environment locus Execution Environment Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES = 25;

	/**
	 * The feature id for the '<em><b>Execution Factory built In Types Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES = 26;

	/**
	 * The feature id for the '<em><b>Execution Factory locus Execution Factory Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES = 27;

	/**
	 * The feature id for the '<em><b>Execution Factory primitive Behavior Prototypes Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES = 28;

	/**
	 * The feature id for the '<em><b>Execution context Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_CONTEXT_VALUES = 29;

	/**
	 * The feature id for the '<em><b>Execution parameter Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_PARAMETER_VALUES_VALUES = 30;

	/**
	 * The feature id for the '<em><b>Executor locus Executor Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES = 31;

	/**
	 * The feature id for the '<em><b>Extensional Value locus Extensional Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES = 32;

	/**
	 * The feature id for the '<em><b>Feature Value feature Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FEATURE_VALUE_FEATURE_VALUES = 33;

	/**
	 * The feature id for the '<em><b>Feature Value position Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FEATURE_VALUE_POSITION_VALUES = 34;

	/**
	 * The feature id for the '<em><b>Feature Value values Feature Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES = 35;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Is Withdrawn Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES = 36;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = 37;

	/**
	 * The feature id for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = 38;

	/**
	 * The feature id for the '<em><b>Input Parameter Values name Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_PARAMETER_VALUES_NAME_VALUES = 39;

	/**
	 * The feature id for the '<em><b>Input Parameter Values parameter Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES = 40;

	/**
	 * The feature id for the '<em><b>Integer Value value Integer Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES = 41;

	/**
	 * The feature id for the '<em><b>Locus executor Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCUS_EXECUTOR_VALUES = 42;

	/**
	 * The feature id for the '<em><b>Locus extensional Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCUS_EXTENSIONAL_VALUES_VALUES = 43;

	/**
	 * The feature id for the '<em><b>Locus factory Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCUS_FACTORY_VALUES = 44;

	/**
	 * The feature id for the '<em><b>Object Node Activation offered Token Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES = 45;

	/**
	 * The feature id for the '<em><b>Object Token value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECT_TOKEN_VALUE_VALUES = 46;

	/**
	 * The feature id for the '<em><b>Object types Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECT_TYPES_VALUES = 47;

	/**
	 * The feature id for the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OFFER_OFFERED_TOKENS_VALUES = 48;

	/**
	 * The feature id for the '<em><b>Parameter Value parameter Parameter Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES = 49;

	/**
	 * The feature id for the '<em><b>Parameter Value values Parameter Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES = 50;

	/**
	 * The feature id for the '<em><b>Pin Activation action Activation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES = 51;

	/**
	 * The feature id for the '<em><b>Pin Activation count temp Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES = 52;

	/**
	 * The feature id for the '<em><b>Primitive Value type Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PRIMITIVE_VALUE_TYPE_VALUES = 53;

	/**
	 * The feature id for the '<em><b>Reference referent Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REFERENCE_REFERENT_VALUES = 54;

	/**
	 * The feature id for the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES = 55;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 56;

	/**
	 * The feature id for the '<em><b>Token holder Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TOKEN_HOLDER_VALUES = 57;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 58;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.impl.Token_holder_ValueImpl
	 * @see umlTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
	 * @generated
	 */
	int TOKEN_HOLDER_VALUE = 56;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__HOLDER = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActionActivation_firing_Value <em>Action Activation firing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Activation firing Value</em>'.
	 * @see umlTrace.States.ActionActivation_firing_Value
	 * @generated
	 */
	EClass getActionActivation_firing_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ActionActivation_firing_Value#isFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing</em>'.
	 * @see umlTrace.States.ActionActivation_firing_Value#isFiring()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EAttribute getActionActivation_firing_Value_Firing();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActionActivation_firing_Value#getParent()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EReference getActionActivation_firing_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActionActivation_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActionActivation_firing_Value#getStates()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EReference getActionActivation_firing_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActionActivation_firing_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActionActivation_firing_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActionActivation_firing_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActionActivation_pinActivations_Value <em>Action Activation pin Activations Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Activation pin Activations Value</em>'.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value
	 * @generated
	 */
	EClass getActionActivation_pinActivations_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActionActivation_pinActivations_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value#getParent()
	 * @see #getActionActivation_pinActivations_Value()
	 * @generated
	 */
	EReference getActionActivation_pinActivations_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActionActivation_pinActivations_Value#getPinActivations <em>Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin Activations</em>'.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value#getPinActivations()
	 * @see #getActionActivation_pinActivations_Value()
	 * @generated
	 */
	EReference getActionActivation_pinActivations_Value_PinActivations();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActionActivation_pinActivations_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value#getStates()
	 * @see #getActionActivation_pinActivations_Value()
	 * @generated
	 */
	EReference getActionActivation_pinActivations_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActionActivation_pinActivations_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActionActivation_pinActivations_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActionActivation_pinActivations_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value <em>Activity Edge Instance edge Activity Edge Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance edge Activity Edge Instance Value</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value
	 * @generated
	 */
	EClass getActivityEdgeInstance_edge_ActivityEdgeInstance_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge Activity Edge Instance</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getEdge_ActivityEdgeInstance()
	 * @see #getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent()
	 * @see #getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStates()
	 * @see #getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityEdgeInstance_edge_ActivityEdgeInstance_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value <em>Activity Edge Instance group Activity Edge Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance group Activity Edge Instance Value</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value
	 * @generated
	 */
	EClass getActivityEdgeInstance_group_ActivityEdgeInstance_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Activity Edge Instance</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getGroup_ActivityEdgeInstance()
	 * @see #getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent()
	 * @see #getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStates()
	 * @see #getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityEdgeInstance_group_ActivityEdgeInstance_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityEdgeInstance_offers_Value <em>Activity Edge Instance offers Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance offers Value</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value
	 * @generated
	 */
	EClass getActivityEdgeInstance_offers_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value#getOffers()
	 * @see #getActivityEdgeInstance_offers_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_offers_Value_Offers();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value#getParent()
	 * @see #getActivityEdgeInstance_offers_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_offers_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value#getStates()
	 * @see #getActivityEdgeInstance_offers_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_offers_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityEdgeInstance_offers_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityEdgeInstance_source_Value <em>Activity Edge Instance source Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance source Value</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value
	 * @generated
	 */
	EClass getActivityEdgeInstance_source_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityEdgeInstance_source_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value#getParent()
	 * @see #getActivityEdgeInstance_source_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_source_Value_Parent();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityEdgeInstance_source_Value#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value#getSource()
	 * @see #getActivityEdgeInstance_source_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_source_Value_Source();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_source_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value#getStates()
	 * @see #getActivityEdgeInstance_source_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_source_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityEdgeInstance_source_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityEdgeInstance_source_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityEdgeInstance_target_Value <em>Activity Edge Instance target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Instance target Value</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value
	 * @generated
	 */
	EClass getActivityEdgeInstance_target_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value#getParent()
	 * @see #getActivityEdgeInstance_target_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_target_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value#getStates()
	 * @see #getActivityEdgeInstance_target_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_target_Value_States();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value#getTarget()
	 * @see #getActivityEdgeInstance_target_Value()
	 * @generated
	 */
	EReference getActivityEdgeInstance_target_Value_Target();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityEdgeInstance_target_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityExecution_activationGroup_Value <em>Activity Execution activation Group Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execution activation Group Value</em>'.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value
	 * @generated
	 */
	EClass getActivityExecution_activationGroup_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityExecution_activationGroup_Value#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Group</em>'.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value#getActivationGroup()
	 * @see #getActivityExecution_activationGroup_Value()
	 * @generated
	 */
	EReference getActivityExecution_activationGroup_Value_ActivationGroup();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityExecution_activationGroup_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value#getParent()
	 * @see #getActivityExecution_activationGroup_Value()
	 * @generated
	 */
	EReference getActivityExecution_activationGroup_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityExecution_activationGroup_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value#getStates()
	 * @see #getActivityExecution_activationGroup_Value()
	 * @generated
	 */
	EReference getActivityExecution_activationGroup_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityExecution_activationGroup_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityExecution_activationGroup_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value <em>Activity Node Activation Group activity Execution Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation Group activity Execution Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value
	 * @generated
	 */
	EClass getActivityNodeActivationGroup_activityExecution_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Execution</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getActivityExecution()
	 * @see #getActivityNodeActivationGroup_activityExecution_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent()
	 * @see #getActivityNodeActivationGroup_activityExecution_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_activityExecution_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStates()
	 * @see #getActivityNodeActivationGroup_activityExecution_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_activityExecution_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup_activityExecution_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value <em>Activity Node Activation Group edge Instances Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation Group edge Instances Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value
	 * @generated
	 */
	EClass getActivityNodeActivationGroup_edgeInstances_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getEdgeInstances <em>Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edge Instances</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getEdgeInstances()
	 * @see #getActivityNodeActivationGroup_edgeInstances_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent()
	 * @see #getActivityNodeActivationGroup_edgeInstances_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_edgeInstances_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStates()
	 * @see #getActivityNodeActivationGroup_edgeInstances_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_edgeInstances_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup_edgeInstances_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value <em>Activity Node Activation Group node Activations Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation Group node Activations Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value
	 * @generated
	 */
	EClass getActivityNodeActivationGroup_nodeActivations_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getNodeActivations <em>Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Activations</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getNodeActivations()
	 * @see #getActivityNodeActivationGroup_nodeActivations_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent()
	 * @see #getActivityNodeActivationGroup_nodeActivations_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_nodeActivations_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStates()
	 * @see #getActivityNodeActivationGroup_nodeActivations_Value()
	 * @generated
	 */
	EReference getActivityNodeActivationGroup_nodeActivations_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivationGroup_nodeActivations_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value <em>Activity Node Activation group Activity Node Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation group Activity Node Activation Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_group_ActivityNodeActivation_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Activity Node Activation</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getGroup_ActivityNodeActivation()
	 * @see #getActivityNodeActivation_group_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent()
	 * @see #getActivityNodeActivation_group_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStates()
	 * @see #getActivityNodeActivation_group_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_group_ActivityNodeActivation_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value <em>Activity Node Activation held Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation held Tokens Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_heldTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held Tokens</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value#getHeldTokens()
	 * @see #getActivityNodeActivation_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_heldTokens_Value_HeldTokens();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value#getParent()
	 * @see #getActivityNodeActivation_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_heldTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value#getStates()
	 * @see #getActivityNodeActivation_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_heldTokens_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_heldTokens_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_heldTokens_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value <em>Activity Node Activation incoming Edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation incoming Edges Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_incomingEdges_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getIncomingEdges()
	 * @see #getActivityNodeActivation_incomingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_incomingEdges_Value_IncomingEdges();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent()
	 * @see #getActivityNodeActivation_incomingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_incomingEdges_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getStates()
	 * @see #getActivityNodeActivation_incomingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_incomingEdges_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_incomingEdges_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value <em>Activity Node Activation is Running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation is Running Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_isRunning_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value#isIsRunning()
	 * @see #getActivityNodeActivation_isRunning_Value()
	 * @generated
	 */
	EAttribute getActivityNodeActivation_isRunning_Value_IsRunning();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value#getParent()
	 * @see #getActivityNodeActivation_isRunning_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_isRunning_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value#getStates()
	 * @see #getActivityNodeActivation_isRunning_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_isRunning_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_isRunning_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_isRunning_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_isRunning_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value <em>Activity Node Activation node Activity Node Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation node Activity Node Activation Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_node_ActivityNodeActivation_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getNode_ActivityNodeActivation <em>Node Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Activity Node Activation</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getNode_ActivityNodeActivation()
	 * @see #getActivityNodeActivation_node_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getParent()
	 * @see #getActivityNodeActivation_node_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStates()
	 * @see #getActivityNodeActivation_node_ActivityNodeActivation_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_node_ActivityNodeActivation_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value <em>Activity Node Activation outgoing Edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation outgoing Edges Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_outgoingEdges_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getOutgoingEdges()
	 * @see #getActivityNodeActivation_outgoingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent()
	 * @see #getActivityNodeActivation_outgoingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_outgoingEdges_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStates()
	 * @see #getActivityNodeActivation_outgoingEdges_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_outgoingEdges_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_outgoingEdges_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ActivityNodeActivation_running_Value <em>Activity Node Activation running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activation running Value</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value
	 * @generated
	 */
	EClass getActivityNodeActivation_running_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ActivityNodeActivation_running_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value#getParent()
	 * @see #getActivityNodeActivation_running_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_running_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ActivityNodeActivation_running_Value#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value#isRunning()
	 * @see #getActivityNodeActivation_running_Value()
	 * @generated
	 */
	EAttribute getActivityNodeActivation_running_Value_Running();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ActivityNodeActivation_running_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value#getStates()
	 * @see #getActivityNodeActivation_running_Value()
	 * @generated
	 */
	EReference getActivityNodeActivation_running_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ActivityNodeActivation_running_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ActivityNodeActivation_running_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivityNodeActivation_running_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value <em>Boolean Value value Boolean Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value value Boolean Value Value</em>'.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value
	 * @generated
	 */
	EClass getBooleanValue_value_BooleanValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent()
	 * @see #getBooleanValue_value_BooleanValue_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_BooleanValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value#getStates()
	 * @see #getBooleanValue_value_BooleanValue_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_BooleanValue_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#isValue_BooleanValue <em>Value Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Boolean Value</em>'.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value#isValue_BooleanValue()
	 * @see #getBooleanValue_value_BooleanValue_Value()
	 * @generated
	 */
	EAttribute getBooleanValue_value_BooleanValue_Value_Value_BooleanValue();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getBooleanValue_value_BooleanValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.CallActionActivation_callExecutions_Value <em>Call Action Activation call Executions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action Activation call Executions Value</em>'.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value
	 * @generated
	 */
	EClass getCallActionActivation_callExecutions_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getCallExecutions <em>Call Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Executions</em>'.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value#getCallExecutions()
	 * @see #getCallActionActivation_callExecutions_Value()
	 * @generated
	 */
	EReference getCallActionActivation_callExecutions_Value_CallExecutions();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value#getParent()
	 * @see #getCallActionActivation_callExecutions_Value()
	 * @generated
	 */
	EReference getCallActionActivation_callExecutions_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value#getStates()
	 * @see #getCallActionActivation_callExecutions_Value()
	 * @generated
	 */
	EReference getCallActionActivation_callExecutions_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getCallActionActivation_callExecutions_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.CompoundValue_featureValues_Value <em>Compound Value feature Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Value feature Values Value</em>'.
	 * @see umlTrace.States.CompoundValue_featureValues_Value
	 * @generated
	 */
	EClass getCompoundValue_featureValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.CompoundValue_featureValues_Value#getFeatureValues <em>Feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Values</em>'.
	 * @see umlTrace.States.CompoundValue_featureValues_Value#getFeatureValues()
	 * @see #getCompoundValue_featureValues_Value()
	 * @generated
	 */
	EReference getCompoundValue_featureValues_Value_FeatureValues();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.CompoundValue_featureValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.CompoundValue_featureValues_Value#getParent()
	 * @see #getCompoundValue_featureValues_Value()
	 * @generated
	 */
	EReference getCompoundValue_featureValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.CompoundValue_featureValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.CompoundValue_featureValues_Value#getStates()
	 * @see #getCompoundValue_featureValues_Value()
	 * @generated
	 */
	EReference getCompoundValue_featureValues_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.CompoundValue_featureValues_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.CompoundValue_featureValues_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getCompoundValue_featureValues_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value <em>Element Configuration semantic Visitor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Configuration semantic Visitor Value</em>'.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value
	 * @generated
	 */
	EClass getElementConfiguration_semanticVisitor_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent()
	 * @see #getElementConfiguration_semanticVisitor_Value()
	 * @generated
	 */
	EReference getElementConfiguration_semanticVisitor_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getSemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Visitor</em>'.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value#getSemanticVisitor()
	 * @see #getElementConfiguration_semanticVisitor_Value()
	 * @generated
	 */
	EReference getElementConfiguration_semanticVisitor_Value_SemanticVisitor();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value#getStates()
	 * @see #getElementConfiguration_semanticVisitor_Value()
	 * @generated
	 */
	EReference getElementConfiguration_semanticVisitor_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getElementConfiguration_semanticVisitor_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Evaluation_locus_Evaluation_Value <em>Evaluation locus Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation locus Evaluation Value</em>'.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value
	 * @generated
	 */
	EClass getEvaluation_locus_Evaluation_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Evaluation_locus_Evaluation_Value#getLocus_Evaluation <em>Locus Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Evaluation</em>'.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value#getLocus_Evaluation()
	 * @see #getEvaluation_locus_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_locus_Evaluation_Value_Locus_Evaluation();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Evaluation_locus_Evaluation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value#getParent()
	 * @see #getEvaluation_locus_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_locus_Evaluation_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Evaluation_locus_Evaluation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value#getStates()
	 * @see #getEvaluation_locus_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_locus_Evaluation_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Evaluation_locus_Evaluation_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getEvaluation_locus_Evaluation_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Evaluation_specification_Evaluation_Value <em>Evaluation specification Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation specification Evaluation Value</em>'.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value
	 * @generated
	 */
	EClass getEvaluation_specification_Evaluation_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Evaluation_specification_Evaluation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value#getParent()
	 * @see #getEvaluation_specification_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_specification_Evaluation_Value_Parent();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Evaluation_specification_Evaluation_Value#getSpecification_Evaluation <em>Specification Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification Evaluation</em>'.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value#getSpecification_Evaluation()
	 * @see #getEvaluation_specification_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_specification_Evaluation_Value_Specification_Evaluation();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Evaluation_specification_Evaluation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value#getStates()
	 * @see #getEvaluation_specification_Evaluation_Value()
	 * @generated
	 */
	EReference getEvaluation_specification_Evaluation_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Evaluation_specification_Evaluation_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getEvaluation_specification_Evaluation_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value <em>Execution Environment locus Execution Environment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment locus Execution Environment Value</em>'.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value
	 * @generated
	 */
	EClass getExecutionEnvironment_locus_ExecutionEnvironment_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Execution Environment</em>'.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getLocus_ExecutionEnvironment()
	 * @see #getExecutionEnvironment_locus_ExecutionEnvironment_Value()
	 * @generated
	 */
	EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent()
	 * @see #getExecutionEnvironment_locus_ExecutionEnvironment_Value()
	 * @generated
	 */
	EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStates()
	 * @see #getExecutionEnvironment_locus_ExecutionEnvironment_Value()
	 * @generated
	 */
	EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecutionEnvironment_locus_ExecutionEnvironment_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value <em>Execution Factory built In Types Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Factory built In Types Value</em>'.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value
	 * @generated
	 */
	EClass getExecutionFactory_builtInTypes_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getBuiltInTypes <em>Built In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Built In Types</em>'.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value#getBuiltInTypes()
	 * @see #getExecutionFactory_builtInTypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_builtInTypes_Value_BuiltInTypes();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent()
	 * @see #getExecutionFactory_builtInTypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_builtInTypes_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value#getStates()
	 * @see #getExecutionFactory_builtInTypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_builtInTypes_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecutionFactory_builtInTypes_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value <em>Execution Factory locus Execution Factory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Factory locus Execution Factory Value</em>'.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value
	 * @generated
	 */
	EClass getExecutionFactory_locus_ExecutionFactory_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Execution Factory</em>'.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getLocus_ExecutionFactory()
	 * @see #getExecutionFactory_locus_ExecutionFactory_Value()
	 * @generated
	 */
	EReference getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent()
	 * @see #getExecutionFactory_locus_ExecutionFactory_Value()
	 * @generated
	 */
	EReference getExecutionFactory_locus_ExecutionFactory_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStates()
	 * @see #getExecutionFactory_locus_ExecutionFactory_Value()
	 * @generated
	 */
	EReference getExecutionFactory_locus_ExecutionFactory_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecutionFactory_locus_ExecutionFactory_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value <em>Execution Factory primitive Behavior Prototypes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Factory primitive Behavior Prototypes Value</em>'.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value
	 * @generated
	 */
	EClass getExecutionFactory_primitiveBehaviorPrototypes_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent()
	 * @see #getExecutionFactory_primitiveBehaviorPrototypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitive Behavior Prototypes</em>'.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getPrimitiveBehaviorPrototypes()
	 * @see #getExecutionFactory_primitiveBehaviorPrototypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStates()
	 * @see #getExecutionFactory_primitiveBehaviorPrototypes_Value()
	 * @generated
	 */
	EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecutionFactory_primitiveBehaviorPrototypes_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Execution_context_Value <em>Execution context Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution context Value</em>'.
	 * @see umlTrace.States.Execution_context_Value
	 * @generated
	 */
	EClass getExecution_context_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Execution_context_Value#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see umlTrace.States.Execution_context_Value#getContext()
	 * @see #getExecution_context_Value()
	 * @generated
	 */
	EReference getExecution_context_Value_Context();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Execution_context_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Execution_context_Value#getParent()
	 * @see #getExecution_context_Value()
	 * @generated
	 */
	EReference getExecution_context_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Execution_context_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Execution_context_Value#getStates()
	 * @see #getExecution_context_Value()
	 * @generated
	 */
	EReference getExecution_context_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Execution_context_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Execution_context_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecution_context_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Execution_parameterValues_Value <em>Execution parameter Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution parameter Values Value</em>'.
	 * @see umlTrace.States.Execution_parameterValues_Value
	 * @generated
	 */
	EClass getExecution_parameterValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Execution_parameterValues_Value#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Values</em>'.
	 * @see umlTrace.States.Execution_parameterValues_Value#getParameterValues()
	 * @see #getExecution_parameterValues_Value()
	 * @generated
	 */
	EReference getExecution_parameterValues_Value_ParameterValues();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Execution_parameterValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Execution_parameterValues_Value#getParent()
	 * @see #getExecution_parameterValues_Value()
	 * @generated
	 */
	EReference getExecution_parameterValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Execution_parameterValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Execution_parameterValues_Value#getStates()
	 * @see #getExecution_parameterValues_Value()
	 * @generated
	 */
	EReference getExecution_parameterValues_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Execution_parameterValues_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Execution_parameterValues_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecution_parameterValues_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Executor_locus_Executor_Value <em>Executor locus Executor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor locus Executor Value</em>'.
	 * @see umlTrace.States.Executor_locus_Executor_Value
	 * @generated
	 */
	EClass getExecutor_locus_Executor_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Executor_locus_Executor_Value#getLocus_Executor <em>Locus Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Executor</em>'.
	 * @see umlTrace.States.Executor_locus_Executor_Value#getLocus_Executor()
	 * @see #getExecutor_locus_Executor_Value()
	 * @generated
	 */
	EReference getExecutor_locus_Executor_Value_Locus_Executor();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Executor_locus_Executor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Executor_locus_Executor_Value#getParent()
	 * @see #getExecutor_locus_Executor_Value()
	 * @generated
	 */
	EReference getExecutor_locus_Executor_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Executor_locus_Executor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Executor_locus_Executor_Value#getStates()
	 * @see #getExecutor_locus_Executor_Value()
	 * @generated
	 */
	EReference getExecutor_locus_Executor_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Executor_locus_Executor_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Executor_locus_Executor_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExecutor_locus_Executor_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value <em>Extensional Value locus Extensional Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensional Value locus Extensional Value Value</em>'.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value
	 * @generated
	 */
	EClass getExtensionalValue_locus_ExtensionalValue_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Extensional Value</em>'.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getLocus_ExtensionalValue()
	 * @see #getExtensionalValue_locus_ExtensionalValue_Value()
	 * @generated
	 */
	EReference getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent()
	 * @see #getExtensionalValue_locus_ExtensionalValue_Value()
	 * @generated
	 */
	EReference getExtensionalValue_locus_ExtensionalValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStates()
	 * @see #getExtensionalValue_locus_ExtensionalValue_Value()
	 * @generated
	 */
	EReference getExtensionalValue_locus_ExtensionalValue_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getExtensionalValue_locus_ExtensionalValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.FeatureValue_feature_Value <em>Feature Value feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value feature Value</em>'.
	 * @see umlTrace.States.FeatureValue_feature_Value
	 * @generated
	 */
	EClass getFeatureValue_feature_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.FeatureValue_feature_Value#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see umlTrace.States.FeatureValue_feature_Value#getFeature()
	 * @see #getFeatureValue_feature_Value()
	 * @generated
	 */
	EReference getFeatureValue_feature_Value_Feature();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.FeatureValue_feature_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.FeatureValue_feature_Value#getParent()
	 * @see #getFeatureValue_feature_Value()
	 * @generated
	 */
	EReference getFeatureValue_feature_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.FeatureValue_feature_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.FeatureValue_feature_Value#getStates()
	 * @see #getFeatureValue_feature_Value()
	 * @generated
	 */
	EReference getFeatureValue_feature_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.FeatureValue_feature_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.FeatureValue_feature_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getFeatureValue_feature_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.FeatureValue_position_Value <em>Feature Value position Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value position Value</em>'.
	 * @see umlTrace.States.FeatureValue_position_Value
	 * @generated
	 */
	EClass getFeatureValue_position_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.FeatureValue_position_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.FeatureValue_position_Value#getParent()
	 * @see #getFeatureValue_position_Value()
	 * @generated
	 */
	EReference getFeatureValue_position_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.FeatureValue_position_Value#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see umlTrace.States.FeatureValue_position_Value#getPosition()
	 * @see #getFeatureValue_position_Value()
	 * @generated
	 */
	EAttribute getFeatureValue_position_Value_Position();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.FeatureValue_position_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.FeatureValue_position_Value#getStates()
	 * @see #getFeatureValue_position_Value()
	 * @generated
	 */
	EReference getFeatureValue_position_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.FeatureValue_position_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.FeatureValue_position_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getFeatureValue_position_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value <em>Feature Value values Feature Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value values Feature Value Value</em>'.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value
	 * @generated
	 */
	EClass getFeatureValue_values_FeatureValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent()
	 * @see #getFeatureValue_values_FeatureValue_Value()
	 * @generated
	 */
	EReference getFeatureValue_values_FeatureValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value#getStates()
	 * @see #getFeatureValue_values_FeatureValue_Value()
	 * @generated
	 */
	EReference getFeatureValue_values_FeatureValue_Value_States();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getValues_FeatureValue <em>Values Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values Feature Value</em>'.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value#getValues_FeatureValue()
	 * @see #getFeatureValue_values_FeatureValue_Value()
	 * @generated
	 */
	EReference getFeatureValue_values_FeatureValue_Value_Values_FeatureValue();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getFeatureValue_values_FeatureValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value <em>Forked Token base Token Is Withdrawn Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token base Token Is Withdrawn Value</em>'.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value
	 * @generated
	 */
	EClass getForkedToken_baseTokenIsWithdrawn_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Token Is Withdrawn</em>'.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#isBaseTokenIsWithdrawn()
	 * @see #getForkedToken_baseTokenIsWithdrawn_Value()
	 * @generated
	 */
	EAttribute getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent()
	 * @see #getForkedToken_baseTokenIsWithdrawn_Value()
	 * @generated
	 */
	EReference getForkedToken_baseTokenIsWithdrawn_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStates()
	 * @see #getForkedToken_baseTokenIsWithdrawn_Value()
	 * @generated
	 */
	EReference getForkedToken_baseTokenIsWithdrawn_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getForkedToken_baseTokenIsWithdrawn_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ForkedToken_baseToken_Value <em>Forked Token base Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token base Token Value</em>'.
	 * @see umlTrace.States.ForkedToken_baseToken_Value
	 * @generated
	 */
	EClass getForkedToken_baseToken_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see umlTrace.States.ForkedToken_baseToken_Value#getBaseToken()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_BaseToken();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ForkedToken_baseToken_Value#getParent()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ForkedToken_baseToken_Value#getStates()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ForkedToken_baseToken_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ForkedToken_baseToken_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getForkedToken_baseToken_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value <em>Forked Token remaining Offers Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value
	 * @generated
	 */
	EClass getForkedToken_remainingOffersCount_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value#getStates()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getForkedToken_remainingOffersCount_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.InputParameterValues_name_Value <em>Input Parameter Values name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Values name Value</em>'.
	 * @see umlTrace.States.InputParameterValues_name_Value
	 * @generated
	 */
	EClass getInputParameterValues_name_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.InputParameterValues_name_Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlTrace.States.InputParameterValues_name_Value#getName()
	 * @see #getInputParameterValues_name_Value()
	 * @generated
	 */
	EAttribute getInputParameterValues_name_Value_Name();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.InputParameterValues_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.InputParameterValues_name_Value#getParent()
	 * @see #getInputParameterValues_name_Value()
	 * @generated
	 */
	EReference getInputParameterValues_name_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.InputParameterValues_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.InputParameterValues_name_Value#getStates()
	 * @see #getInputParameterValues_name_Value()
	 * @generated
	 */
	EReference getInputParameterValues_name_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.InputParameterValues_name_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.InputParameterValues_name_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getInputParameterValues_name_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.InputParameterValues_parameterValues_Value <em>Input Parameter Values parameter Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Values parameter Values Value</em>'.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value
	 * @generated
	 */
	EClass getInputParameterValues_parameterValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.InputParameterValues_parameterValues_Value#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Values</em>'.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value#getParameterValues()
	 * @see #getInputParameterValues_parameterValues_Value()
	 * @generated
	 */
	EReference getInputParameterValues_parameterValues_Value_ParameterValues();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.InputParameterValues_parameterValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value#getParent()
	 * @see #getInputParameterValues_parameterValues_Value()
	 * @generated
	 */
	EReference getInputParameterValues_parameterValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.InputParameterValues_parameterValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value#getStates()
	 * @see #getInputParameterValues_parameterValues_Value()
	 * @generated
	 */
	EReference getInputParameterValues_parameterValues_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.InputParameterValues_parameterValues_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getInputParameterValues_parameterValues_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value <em>Integer Value value Integer Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value value Integer Value Value</em>'.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value
	 * @generated
	 */
	EClass getIntegerValue_value_IntegerValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value#getParent()
	 * @see #getIntegerValue_value_IntegerValue_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_IntegerValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value#getStates()
	 * @see #getIntegerValue_value_IntegerValue_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_IntegerValue_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value#getValue_IntegerValue <em>Value Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Integer Value</em>'.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value#getValue_IntegerValue()
	 * @see #getIntegerValue_value_IntegerValue_Value()
	 * @generated
	 */
	EAttribute getIntegerValue_value_IntegerValue_Value_Value_IntegerValue();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getIntegerValue_value_IntegerValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Locus_executor_Value <em>Locus executor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus executor Value</em>'.
	 * @see umlTrace.States.Locus_executor_Value
	 * @generated
	 */
	EClass getLocus_executor_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Locus_executor_Value#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see umlTrace.States.Locus_executor_Value#getExecutor()
	 * @see #getLocus_executor_Value()
	 * @generated
	 */
	EReference getLocus_executor_Value_Executor();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Locus_executor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Locus_executor_Value#getParent()
	 * @see #getLocus_executor_Value()
	 * @generated
	 */
	EReference getLocus_executor_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Locus_executor_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Locus_executor_Value#getStates()
	 * @see #getLocus_executor_Value()
	 * @generated
	 */
	EReference getLocus_executor_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Locus_executor_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Locus_executor_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getLocus_executor_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Locus_extensionalValues_Value <em>Locus extensional Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus extensional Values Value</em>'.
	 * @see umlTrace.States.Locus_extensionalValues_Value
	 * @generated
	 */
	EClass getLocus_extensionalValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Locus_extensionalValues_Value#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extensional Values</em>'.
	 * @see umlTrace.States.Locus_extensionalValues_Value#getExtensionalValues()
	 * @see #getLocus_extensionalValues_Value()
	 * @generated
	 */
	EReference getLocus_extensionalValues_Value_ExtensionalValues();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Locus_extensionalValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Locus_extensionalValues_Value#getParent()
	 * @see #getLocus_extensionalValues_Value()
	 * @generated
	 */
	EReference getLocus_extensionalValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Locus_extensionalValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Locus_extensionalValues_Value#getStates()
	 * @see #getLocus_extensionalValues_Value()
	 * @generated
	 */
	EReference getLocus_extensionalValues_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Locus_extensionalValues_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Locus_extensionalValues_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getLocus_extensionalValues_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Locus_factory_Value <em>Locus factory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus factory Value</em>'.
	 * @see umlTrace.States.Locus_factory_Value
	 * @generated
	 */
	EClass getLocus_factory_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Locus_factory_Value#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factory</em>'.
	 * @see umlTrace.States.Locus_factory_Value#getFactory()
	 * @see #getLocus_factory_Value()
	 * @generated
	 */
	EReference getLocus_factory_Value_Factory();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Locus_factory_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Locus_factory_Value#getParent()
	 * @see #getLocus_factory_Value()
	 * @generated
	 */
	EReference getLocus_factory_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Locus_factory_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Locus_factory_Value#getStates()
	 * @see #getLocus_factory_Value()
	 * @generated
	 */
	EReference getLocus_factory_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Locus_factory_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Locus_factory_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getLocus_factory_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value <em>Object Node Activation offered Token Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node Activation offered Token Count Value</em>'.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value
	 * @generated
	 */
	EClass getObjectNodeActivation_offeredTokenCount_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getOfferedTokenCount <em>Offered Token Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offered Token Count</em>'.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getOfferedTokenCount()
	 * @see #getObjectNodeActivation_offeredTokenCount_Value()
	 * @generated
	 */
	EAttribute getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent()
	 * @see #getObjectNodeActivation_offeredTokenCount_Value()
	 * @generated
	 */
	EReference getObjectNodeActivation_offeredTokenCount_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStates()
	 * @see #getObjectNodeActivation_offeredTokenCount_Value()
	 * @generated
	 */
	EReference getObjectNodeActivation_offeredTokenCount_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getObjectNodeActivation_offeredTokenCount_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ObjectToken_value_Value <em>Object Token value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Token value Value</em>'.
	 * @see umlTrace.States.ObjectToken_value_Value
	 * @generated
	 */
	EClass getObjectToken_value_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ObjectToken_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ObjectToken_value_Value#getParent()
	 * @see #getObjectToken_value_Value()
	 * @generated
	 */
	EReference getObjectToken_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ObjectToken_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ObjectToken_value_Value#getStates()
	 * @see #getObjectToken_value_Value()
	 * @generated
	 */
	EReference getObjectToken_value_Value_States();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ObjectToken_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see umlTrace.States.ObjectToken_value_Value#getValue()
	 * @see #getObjectToken_value_Value()
	 * @generated
	 */
	EReference getObjectToken_value_Value_Value();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ObjectToken_value_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ObjectToken_value_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getObjectToken_value_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Object_types_Value <em>Object types Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object types Value</em>'.
	 * @see umlTrace.States.Object_types_Value
	 * @generated
	 */
	EClass getObject_types_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Object_types_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Object_types_Value#getParent()
	 * @see #getObject_types_Value()
	 * @generated
	 */
	EReference getObject_types_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Object_types_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Object_types_Value#getStates()
	 * @see #getObject_types_Value()
	 * @generated
	 */
	EReference getObject_types_Value_States();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Object_types_Value#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see umlTrace.States.Object_types_Value#getTypes()
	 * @see #getObject_types_Value()
	 * @generated
	 */
	EReference getObject_types_Value_Types();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Object_types_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Object_types_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getObject_types_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Offer_offeredTokens_Value <em>Offer offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer offered Tokens Value</em>'.
	 * @see umlTrace.States.Offer_offeredTokens_Value
	 * @generated
	 */
	EClass getOffer_offeredTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see umlTrace.States.Offer_offeredTokens_Value#getOfferedTokens()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_OfferedTokens();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Offer_offeredTokens_Value#getParent()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Offer_offeredTokens_Value#getStates()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Offer_offeredTokens_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Offer_offeredTokens_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getOffer_offeredTokens_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value <em>Parameter Value parameter Parameter Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value parameter Parameter Value Value</em>'.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value
	 * @generated
	 */
	EClass getParameterValue_parameter_ParameterValue_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParameter_ParameterValue <em>Parameter Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Parameter Value</em>'.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParameter_ParameterValue()
	 * @see #getParameterValue_parameter_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent()
	 * @see #getParameterValue_parameter_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_parameter_ParameterValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getStates()
	 * @see #getParameterValue_parameter_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_parameter_ParameterValue_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getParameterValue_parameter_ParameterValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value <em>Parameter Value values Parameter Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value values Parameter Value Value</em>'.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value
	 * @generated
	 */
	EClass getParameterValue_values_ParameterValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value#getParent()
	 * @see #getParameterValue_values_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_values_ParameterValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value#getStates()
	 * @see #getParameterValue_values_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_values_ParameterValue_Value_States();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value#getValues_ParameterValue <em>Values Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values Parameter Value</em>'.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value#getValues_ParameterValue()
	 * @see #getParameterValue_values_ParameterValue_Value()
	 * @generated
	 */
	EReference getParameterValue_values_ParameterValue_Value_Values_ParameterValue();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getParameterValue_values_ParameterValue_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.PinActivation_actionActivation_Value <em>Pin Activation action Activation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Activation action Activation Value</em>'.
	 * @see umlTrace.States.PinActivation_actionActivation_Value
	 * @generated
	 */
	EClass getPinActivation_actionActivation_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.PinActivation_actionActivation_Value#getActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Activation</em>'.
	 * @see umlTrace.States.PinActivation_actionActivation_Value#getActionActivation()
	 * @see #getPinActivation_actionActivation_Value()
	 * @generated
	 */
	EReference getPinActivation_actionActivation_Value_ActionActivation();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.PinActivation_actionActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.PinActivation_actionActivation_Value#getParent()
	 * @see #getPinActivation_actionActivation_Value()
	 * @generated
	 */
	EReference getPinActivation_actionActivation_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.PinActivation_actionActivation_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.PinActivation_actionActivation_Value#getStates()
	 * @see #getPinActivation_actionActivation_Value()
	 * @generated
	 */
	EReference getPinActivation_actionActivation_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.PinActivation_actionActivation_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.PinActivation_actionActivation_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getPinActivation_actionActivation_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.PinActivation_count_temp_Value <em>Pin Activation count temp Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Activation count temp Value</em>'.
	 * @see umlTrace.States.PinActivation_count_temp_Value
	 * @generated
	 */
	EClass getPinActivation_count_temp_Value();

	/**
	 * Returns the meta object for the attribute '{@link umlTrace.States.PinActivation_count_temp_Value#getCount_temp <em>Count temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count temp</em>'.
	 * @see umlTrace.States.PinActivation_count_temp_Value#getCount_temp()
	 * @see #getPinActivation_count_temp_Value()
	 * @generated
	 */
	EAttribute getPinActivation_count_temp_Value_Count_temp();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.PinActivation_count_temp_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.PinActivation_count_temp_Value#getParent()
	 * @see #getPinActivation_count_temp_Value()
	 * @generated
	 */
	EReference getPinActivation_count_temp_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.PinActivation_count_temp_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.PinActivation_count_temp_Value#getStates()
	 * @see #getPinActivation_count_temp_Value()
	 * @generated
	 */
	EReference getPinActivation_count_temp_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.PinActivation_count_temp_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.PinActivation_count_temp_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getPinActivation_count_temp_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.PrimitiveValue_type_Value <em>Primitive Value type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value type Value</em>'.
	 * @see umlTrace.States.PrimitiveValue_type_Value
	 * @generated
	 */
	EClass getPrimitiveValue_type_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.PrimitiveValue_type_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.PrimitiveValue_type_Value#getParent()
	 * @see #getPrimitiveValue_type_Value()
	 * @generated
	 */
	EReference getPrimitiveValue_type_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.PrimitiveValue_type_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.PrimitiveValue_type_Value#getStates()
	 * @see #getPrimitiveValue_type_Value()
	 * @generated
	 */
	EReference getPrimitiveValue_type_Value_States();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.PrimitiveValue_type_Value#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see umlTrace.States.PrimitiveValue_type_Value#getType()
	 * @see #getPrimitiveValue_type_Value()
	 * @generated
	 */
	EReference getPrimitiveValue_type_Value_Type();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.PrimitiveValue_type_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.PrimitiveValue_type_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getPrimitiveValue_type_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Reference_referent_Value <em>Reference referent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference referent Value</em>'.
	 * @see umlTrace.States.Reference_referent_Value
	 * @generated
	 */
	EClass getReference_referent_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Reference_referent_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Reference_referent_Value#getParent()
	 * @see #getReference_referent_Value()
	 * @generated
	 */
	EReference getReference_referent_Value_Parent();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Reference_referent_Value#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see umlTrace.States.Reference_referent_Value#getReferent()
	 * @see #getReference_referent_Value()
	 * @generated
	 */
	EReference getReference_referent_Value_Referent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Reference_referent_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Reference_referent_Value#getStates()
	 * @see #getReference_referent_Value()
	 * @generated
	 */
	EReference getReference_referent_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Reference_referent_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Reference_referent_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getReference_referent_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value <em>Semantic Visitor runtime Model Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value
	 * @generated
	 */
	EClass getSemanticVisitor_runtimeModelElement_Value();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_Parent();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Model Element</em>'.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.SemanticVisitor_runtimeModelElement_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see umlTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActionActivation_firing_Values <em>Action Activation firing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Activation firing Values</em>'.
	 * @see umlTrace.States.State#getActionActivation_firing_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActionActivation_firing_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActionActivation_pinActivations_Values <em>Action Activation pin Activations Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Activation pin Activations Values</em>'.
	 * @see umlTrace.States.State#getActionActivation_pinActivations_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActionActivation_pinActivations_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values <em>Activity Edge Instance edge Activity Edge Instance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge Instance edge Activity Edge Instance Values</em>'.
	 * @see umlTrace.States.State#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityEdgeInstance_group_ActivityEdgeInstance_Values <em>Activity Edge Instance group Activity Edge Instance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge Instance group Activity Edge Instance Values</em>'.
	 * @see umlTrace.States.State#getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityEdgeInstance_offers_Values <em>Activity Edge Instance offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge Instance offers Values</em>'.
	 * @see umlTrace.States.State#getActivityEdgeInstance_offers_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdgeInstance_offers_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityEdgeInstance_source_Values <em>Activity Edge Instance source Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge Instance source Values</em>'.
	 * @see umlTrace.States.State#getActivityEdgeInstance_source_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdgeInstance_source_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityEdgeInstance_target_Values <em>Activity Edge Instance target Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge Instance target Values</em>'.
	 * @see umlTrace.States.State#getActivityEdgeInstance_target_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdgeInstance_target_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityExecution_activationGroup_Values <em>Activity Execution activation Group Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Execution activation Group Values</em>'.
	 * @see umlTrace.States.State#getActivityExecution_activationGroup_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityExecution_activationGroup_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivationGroup_activityExecution_Values <em>Activity Node Activation Group activity Execution Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation Group activity Execution Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivationGroup_activityExecution_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivationGroup_activityExecution_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivationGroup_edgeInstances_Values <em>Activity Node Activation Group edge Instances Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation Group edge Instances Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivationGroup_edgeInstances_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivationGroup_edgeInstances_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivationGroup_nodeActivations_Values <em>Activity Node Activation Group node Activations Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation Group node Activations Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivationGroup_nodeActivations_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivationGroup_nodeActivations_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_group_ActivityNodeActivation_Values <em>Activity Node Activation group Activity Node Activation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation group Activity Node Activation Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_group_ActivityNodeActivation_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_group_ActivityNodeActivation_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_heldTokens_Values <em>Activity Node Activation held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation held Tokens Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_heldTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_heldTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_incomingEdges_Values <em>Activity Node Activation incoming Edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation incoming Edges Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_incomingEdges_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_incomingEdges_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_isRunning_Values <em>Activity Node Activation is Running Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation is Running Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_isRunning_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_isRunning_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_node_ActivityNodeActivation_Values <em>Activity Node Activation node Activity Node Activation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation node Activity Node Activation Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_node_ActivityNodeActivation_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_node_ActivityNodeActivation_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_outgoingEdges_Values <em>Activity Node Activation outgoing Edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation outgoing Edges Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_outgoingEdges_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_outgoingEdges_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getActivityNodeActivation_running_Values <em>Activity Node Activation running Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node Activation running Values</em>'.
	 * @see umlTrace.States.State#getActivityNodeActivation_running_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNodeActivation_running_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getBooleanValue_value_BooleanValue_Values <em>Boolean Value value Boolean Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Boolean Value Values</em>'.
	 * @see umlTrace.States.State#getBooleanValue_value_BooleanValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_BooleanValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getCallActionActivation_callExecutions_Values <em>Call Action Activation call Executions Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Action Activation call Executions Values</em>'.
	 * @see umlTrace.States.State#getCallActionActivation_callExecutions_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_CallActionActivation_callExecutions_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getCompoundValue_featureValues_Values <em>Compound Value feature Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compound Value feature Values Values</em>'.
	 * @see umlTrace.States.State#getCompoundValue_featureValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_CompoundValue_featureValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getElementConfiguration_semanticVisitor_Values <em>Element Configuration semantic Visitor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Configuration semantic Visitor Values</em>'.
	 * @see umlTrace.States.State#getElementConfiguration_semanticVisitor_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ElementConfiguration_semanticVisitor_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see umlTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getEvaluation_locus_Evaluation_Values <em>Evaluation locus Evaluation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation locus Evaluation Values</em>'.
	 * @see umlTrace.States.State#getEvaluation_locus_Evaluation_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Evaluation_locus_Evaluation_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getEvaluation_specification_Evaluation_Values <em>Evaluation specification Evaluation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation specification Evaluation Values</em>'.
	 * @see umlTrace.States.State#getEvaluation_specification_Evaluation_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Evaluation_specification_Evaluation_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecutionEnvironment_locus_ExecutionEnvironment_Values <em>Execution Environment locus Execution Environment Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution Environment locus Execution Environment Values</em>'.
	 * @see umlTrace.States.State#getExecutionEnvironment_locus_ExecutionEnvironment_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecutionFactory_builtInTypes_Values <em>Execution Factory built In Types Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution Factory built In Types Values</em>'.
	 * @see umlTrace.States.State#getExecutionFactory_builtInTypes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExecutionFactory_builtInTypes_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecutionFactory_locus_ExecutionFactory_Values <em>Execution Factory locus Execution Factory Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution Factory locus Execution Factory Values</em>'.
	 * @see umlTrace.States.State#getExecutionFactory_locus_ExecutionFactory_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExecutionFactory_locus_ExecutionFactory_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecutionFactory_primitiveBehaviorPrototypes_Values <em>Execution Factory primitive Behavior Prototypes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution Factory primitive Behavior Prototypes Values</em>'.
	 * @see umlTrace.States.State#getExecutionFactory_primitiveBehaviorPrototypes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExecutionFactory_primitiveBehaviorPrototypes_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecution_context_Values <em>Execution context Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution context Values</em>'.
	 * @see umlTrace.States.State#getExecution_context_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Execution_context_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecution_parameterValues_Values <em>Execution parameter Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execution parameter Values Values</em>'.
	 * @see umlTrace.States.State#getExecution_parameterValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Execution_parameterValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExecutor_locus_Executor_Values <em>Executor locus Executor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executor locus Executor Values</em>'.
	 * @see umlTrace.States.State#getExecutor_locus_Executor_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Executor_locus_Executor_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getExtensionalValue_locus_ExtensionalValue_Values <em>Extensional Value locus Extensional Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extensional Value locus Extensional Value Values</em>'.
	 * @see umlTrace.States.State#getExtensionalValue_locus_ExtensionalValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExtensionalValue_locus_ExtensionalValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getFeatureValue_feature_Values <em>Feature Value feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Value feature Values</em>'.
	 * @see umlTrace.States.State#getFeatureValue_feature_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FeatureValue_feature_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getFeatureValue_position_Values <em>Feature Value position Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Value position Values</em>'.
	 * @see umlTrace.States.State#getFeatureValue_position_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FeatureValue_position_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getFeatureValue_values_FeatureValue_Values <em>Feature Value values Feature Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Value values Feature Value Values</em>'.
	 * @see umlTrace.States.State#getFeatureValue_values_FeatureValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FeatureValue_values_FeatureValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getForkedToken_baseTokenIsWithdrawn_Values <em>Forked Token base Token Is Withdrawn Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token base Token Is Withdrawn Values</em>'.
	 * @see umlTrace.States.State#getForkedToken_baseTokenIsWithdrawn_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_baseTokenIsWithdrawn_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token base Token Values</em>'.
	 * @see umlTrace.States.State#getForkedToken_baseToken_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_baseToken_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token remaining Offers Count Values</em>'.
	 * @see umlTrace.States.State#getForkedToken_remainingOffersCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getInputParameterValues_name_Values <em>Input Parameter Values name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameter Values name Values</em>'.
	 * @see umlTrace.States.State#getInputParameterValues_name_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputParameterValues_name_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getInputParameterValues_parameterValues_Values <em>Input Parameter Values parameter Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameter Values parameter Values Values</em>'.
	 * @see umlTrace.States.State#getInputParameterValues_parameterValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputParameterValues_parameterValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getIntegerValue_value_IntegerValue_Values <em>Integer Value value Integer Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Value value Integer Value Values</em>'.
	 * @see umlTrace.States.State#getIntegerValue_value_IntegerValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerValue_value_IntegerValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getLocus_executor_Values <em>Locus executor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locus executor Values</em>'.
	 * @see umlTrace.States.State#getLocus_executor_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Locus_executor_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getLocus_extensionalValues_Values <em>Locus extensional Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locus extensional Values Values</em>'.
	 * @see umlTrace.States.State#getLocus_extensionalValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Locus_extensionalValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getLocus_factory_Values <em>Locus factory Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locus factory Values</em>'.
	 * @see umlTrace.States.State#getLocus_factory_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Locus_factory_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getObjectNodeActivation_offeredTokenCount_Values <em>Object Node Activation offered Token Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Node Activation offered Token Count Values</em>'.
	 * @see umlTrace.States.State#getObjectNodeActivation_offeredTokenCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ObjectNodeActivation_offeredTokenCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getObjectToken_value_Values <em>Object Token value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Token value Values</em>'.
	 * @see umlTrace.States.State#getObjectToken_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ObjectToken_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getObject_types_Values <em>Object types Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object types Values</em>'.
	 * @see umlTrace.States.State#getObject_types_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Object_types_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offer offered Tokens Values</em>'.
	 * @see umlTrace.States.State#getOffer_offeredTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Offer_offeredTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getParameterValue_parameter_ParameterValue_Values <em>Parameter Value parameter Parameter Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Value parameter Parameter Value Values</em>'.
	 * @see umlTrace.States.State#getParameterValue_parameter_ParameterValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParameterValue_parameter_ParameterValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getParameterValue_values_ParameterValue_Values <em>Parameter Value values Parameter Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Value values Parameter Value Values</em>'.
	 * @see umlTrace.States.State#getParameterValue_values_ParameterValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParameterValue_values_ParameterValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getPinActivation_actionActivation_Values <em>Pin Activation action Activation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin Activation action Activation Values</em>'.
	 * @see umlTrace.States.State#getPinActivation_actionActivation_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_PinActivation_actionActivation_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getPinActivation_count_temp_Values <em>Pin Activation count temp Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin Activation count temp Values</em>'.
	 * @see umlTrace.States.State#getPinActivation_count_temp_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_PinActivation_count_temp_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getPrimitiveValue_type_Values <em>Primitive Value type Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitive Value type Values</em>'.
	 * @see umlTrace.States.State#getPrimitiveValue_type_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_PrimitiveValue_type_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getReference_referent_Values <em>Reference referent Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference referent Values</em>'.
	 * @see umlTrace.States.State#getReference_referent_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Reference_referent_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Visitor runtime Model Element Values</em>'.
	 * @see umlTrace.States.State#getSemanticVisitor_runtimeModelElement_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SemanticVisitor_runtimeModelElement_Values();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see umlTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token holder Values</em>'.
	 * @see umlTrace.States.State#getToken_holder_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Token_holder_Values();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Token_holder_Value <em>Token holder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token holder Value</em>'.
	 * @see umlTrace.States.Token_holder_Value
	 * @generated
	 */
	EClass getToken_holder_Value();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.Token_holder_Value#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see umlTrace.States.Token_holder_Value#getHolder()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Holder();

	/**
	 * Returns the meta object for the container reference '{@link umlTrace.States.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see umlTrace.States.Token_holder_Value#getParent()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see umlTrace.States.Token_holder_Value#getStates()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_States();

	/**
	 * Returns the meta object for the '{@link umlTrace.States.Token_holder_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see umlTrace.States.Token_holder_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getToken_holder_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see umlTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see umlTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link umlTrace.States.impl.ActionActivation_firing_ValueImpl <em>Action Activation firing Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActionActivation_firing_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActionActivation_firing_Value()
		 * @generated
		 */
		EClass ACTION_ACTIVATION_FIRING_VALUE = eINSTANCE.getActionActivation_firing_Value();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ACTIVATION_FIRING_VALUE__FIRING = eINSTANCE.getActionActivation_firing_Value_Firing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_FIRING_VALUE__PARENT = eINSTANCE.getActionActivation_firing_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_FIRING_VALUE__STATES = eINSTANCE.getActionActivation_firing_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActionActivation_firing_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActionActivation_pinActivations_ValueImpl <em>Action Activation pin Activations Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActionActivation_pinActivations_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActionActivation_pinActivations_Value()
		 * @generated
		 */
		EClass ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE = eINSTANCE.getActionActivation_pinActivations_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT = eINSTANCE.getActionActivation_pinActivations_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Pin Activations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS = eINSTANCE.getActionActivation_pinActivations_Value_PinActivations();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES = eINSTANCE.getActionActivation_pinActivations_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActionActivation_pinActivations_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl <em>Activity Edge Instance edge Activity Edge Instance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityEdgeInstance_edge_ActivityEdgeInstance_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE = eINSTANCE.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Edge Activity Edge Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__EDGE_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT = eINSTANCE.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__STATES = eINSTANCE.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl <em>Activity Edge Instance group Activity Edge Instance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE = eINSTANCE.getActivityEdgeInstance_group_ActivityEdgeInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Group Activity Edge Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT = eINSTANCE.getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES = eINSTANCE.getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityEdgeInstance_group_ActivityEdgeInstance_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityEdgeInstance_offers_ValueImpl <em>Activity Edge Instance offers Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityEdgeInstance_offers_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_offers_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE = eINSTANCE.getActivityEdgeInstance_offers_Value();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__OFFERS = eINSTANCE.getActivityEdgeInstance_offers_Value_Offers();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__PARENT = eINSTANCE.getActivityEdgeInstance_offers_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__STATES = eINSTANCE.getActivityEdgeInstance_offers_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityEdgeInstance_offers_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityEdgeInstance_source_ValueImpl <em>Activity Edge Instance source Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityEdgeInstance_source_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_source_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE = eINSTANCE.getActivityEdgeInstance_source_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__PARENT = eINSTANCE.getActivityEdgeInstance_source_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__SOURCE = eINSTANCE.getActivityEdgeInstance_source_Value_Source();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__STATES = eINSTANCE.getActivityEdgeInstance_source_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityEdgeInstance_source_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityEdgeInstance_target_ValueImpl <em>Activity Edge Instance target Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityEdgeInstance_target_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityEdgeInstance_target_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_INSTANCE_TARGET_VALUE = eINSTANCE.getActivityEdgeInstance_target_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__PARENT = eINSTANCE.getActivityEdgeInstance_target_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__STATES = eINSTANCE.getActivityEdgeInstance_target_Value_States();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__TARGET = eINSTANCE.getActivityEdgeInstance_target_Value_Target();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EDGE_INSTANCE_TARGET_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityEdgeInstance_target_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityExecution_activationGroup_ValueImpl <em>Activity Execution activation Group Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityExecution_activationGroup_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityExecution_activationGroup_Value()
		 * @generated
		 */
		EClass ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE = eINSTANCE.getActivityExecution_activationGroup_Value();

		/**
		 * The meta object literal for the '<em><b>Activation Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__ACTIVATION_GROUP = eINSTANCE.getActivityExecution_activationGroup_Value_ActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__PARENT = eINSTANCE.getActivityExecution_activationGroup_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__STATES = eINSTANCE.getActivityExecution_activationGroup_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityExecution_activationGroup_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_activityExecution_ValueImpl <em>Activity Node Activation Group activity Execution Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivationGroup_activityExecution_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_activityExecution_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE = eINSTANCE.getActivityNodeActivationGroup_activityExecution_Value();

		/**
		 * The meta object literal for the '<em><b>Activity Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__ACTIVITY_EXECUTION = eINSTANCE.getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__PARENT = eINSTANCE.getActivityNodeActivationGroup_activityExecution_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__STATES = eINSTANCE.getActivityNodeActivationGroup_activityExecution_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivationGroup_activityExecution_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl <em>Activity Node Activation Group edge Instances Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_edgeInstances_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE = eINSTANCE.getActivityNodeActivationGroup_edgeInstances_Value();

		/**
		 * The meta object literal for the '<em><b>Edge Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES = eINSTANCE.getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT = eINSTANCE.getActivityNodeActivationGroup_edgeInstances_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES = eINSTANCE.getActivityNodeActivationGroup_edgeInstances_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivationGroup_edgeInstances_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivationGroup_nodeActivations_ValueImpl <em>Activity Node Activation Group node Activations Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivationGroup_nodeActivations_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivationGroup_nodeActivations_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE = eINSTANCE.getActivityNodeActivationGroup_nodeActivations_Value();

		/**
		 * The meta object literal for the '<em><b>Node Activations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__NODE_ACTIVATIONS = eINSTANCE.getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__PARENT = eINSTANCE.getActivityNodeActivationGroup_nodeActivations_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__STATES = eINSTANCE.getActivityNodeActivationGroup_nodeActivations_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivationGroup_nodeActivations_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl <em>Activity Node Activation group Activity Node Activation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_group_ActivityNodeActivation_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_group_ActivityNodeActivation_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE = eINSTANCE.getActivityNodeActivation_group_ActivityNodeActivation_Value();

		/**
		 * The meta object literal for the '<em><b>Group Activity Node Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__GROUP_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__STATES = eINSTANCE.getActivityNodeActivation_group_ActivityNodeActivation_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_group_ActivityNodeActivation_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_heldTokens_ValueImpl <em>Activity Node Activation held Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_heldTokens_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_heldTokens_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE = eINSTANCE.getActivityNodeActivation_heldTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__HELD_TOKENS = eINSTANCE.getActivityNodeActivation_heldTokens_Value_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_heldTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__STATES = eINSTANCE.getActivityNodeActivation_heldTokens_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_heldTokens_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_incomingEdges_ValueImpl <em>Activity Node Activation incoming Edges Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_incomingEdges_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_incomingEdges_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE = eINSTANCE.getActivityNodeActivation_incomingEdges_Value();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__INCOMING_EDGES = eINSTANCE.getActivityNodeActivation_incomingEdges_Value_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_incomingEdges_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__STATES = eINSTANCE.getActivityNodeActivation_incomingEdges_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_incomingEdges_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_isRunning_ValueImpl <em>Activity Node Activation is Running Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_isRunning_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_isRunning_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE = eINSTANCE.getActivityNodeActivation_isRunning_Value();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__IS_RUNNING = eINSTANCE.getActivityNodeActivation_isRunning_Value_IsRunning();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_isRunning_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__STATES = eINSTANCE.getActivityNodeActivation_isRunning_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_isRunning_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl <em>Activity Node Activation node Activity Node Activation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_node_ActivityNodeActivation_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_node_ActivityNodeActivation_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE = eINSTANCE.getActivityNodeActivation_node_ActivityNodeActivation_Value();

		/**
		 * The meta object literal for the '<em><b>Node Activity Node Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__NODE_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__STATES = eINSTANCE.getActivityNodeActivation_node_ActivityNodeActivation_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_node_ActivityNodeActivation_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl <em>Activity Node Activation outgoing Edges Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_outgoingEdges_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE = eINSTANCE.getActivityNodeActivation_outgoingEdges_Value();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES = eINSTANCE.getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_outgoingEdges_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES = eINSTANCE.getActivityNodeActivation_outgoingEdges_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_outgoingEdges_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ActivityNodeActivation_running_ValueImpl <em>Activity Node Activation running Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ActivityNodeActivation_running_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getActivityNodeActivation_running_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE = eINSTANCE.getActivityNodeActivation_running_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__PARENT = eINSTANCE.getActivityNodeActivation_running_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__RUNNING = eINSTANCE.getActivityNodeActivation_running_Value_Running();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__STATES = eINSTANCE.getActivityNodeActivation_running_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivityNodeActivation_running_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl <em>Boolean Value value Boolean Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getBooleanValue_value_BooleanValue_Value()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE = eINSTANCE.getBooleanValue_value_BooleanValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT = eINSTANCE.getBooleanValue_value_BooleanValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES = eINSTANCE.getBooleanValue_value_BooleanValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE = eINSTANCE.getBooleanValue_value_BooleanValue_Value_Value_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getBooleanValue_value_BooleanValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.CallActionActivation_callExecutions_ValueImpl <em>Call Action Activation call Executions Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.CallActionActivation_callExecutions_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getCallActionActivation_callExecutions_Value()
		 * @generated
		 */
		EClass CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE = eINSTANCE.getCallActionActivation_callExecutions_Value();

		/**
		 * The meta object literal for the '<em><b>Call Executions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS = eINSTANCE.getCallActionActivation_callExecutions_Value_CallExecutions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT = eINSTANCE.getCallActionActivation_callExecutions_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES = eINSTANCE.getCallActionActivation_callExecutions_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getCallActionActivation_callExecutions_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.CompoundValue_featureValues_ValueImpl <em>Compound Value feature Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.CompoundValue_featureValues_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getCompoundValue_featureValues_Value()
		 * @generated
		 */
		EClass COMPOUND_VALUE_FEATURE_VALUES_VALUE = eINSTANCE.getCompoundValue_featureValues_Value();

		/**
		 * The meta object literal for the '<em><b>Feature Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_VALUE_FEATURE_VALUES_VALUE__FEATURE_VALUES = eINSTANCE.getCompoundValue_featureValues_Value_FeatureValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_VALUE_FEATURE_VALUES_VALUE__PARENT = eINSTANCE.getCompoundValue_featureValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_VALUE_FEATURE_VALUES_VALUE__STATES = eINSTANCE.getCompoundValue_featureValues_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOUND_VALUE_FEATURE_VALUES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getCompoundValue_featureValues_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl <em>Element Configuration semantic Visitor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getElementConfiguration_semanticVisitor_Value()
		 * @generated
		 */
		EClass ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE = eINSTANCE.getElementConfiguration_semanticVisitor_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT = eINSTANCE.getElementConfiguration_semanticVisitor_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Semantic Visitor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR = eINSTANCE.getElementConfiguration_semanticVisitor_Value_SemanticVisitor();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES = eINSTANCE.getElementConfiguration_semanticVisitor_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getElementConfiguration_semanticVisitor_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Evaluation_locus_Evaluation_ValueImpl <em>Evaluation locus Evaluation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Evaluation_locus_Evaluation_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getEvaluation_locus_Evaluation_Value()
		 * @generated
		 */
		EClass EVALUATION_LOCUS_EVALUATION_VALUE = eINSTANCE.getEvaluation_locus_Evaluation_Value();

		/**
		 * The meta object literal for the '<em><b>Locus Evaluation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_LOCUS_EVALUATION_VALUE__LOCUS_EVALUATION = eINSTANCE.getEvaluation_locus_Evaluation_Value_Locus_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_LOCUS_EVALUATION_VALUE__PARENT = eINSTANCE.getEvaluation_locus_Evaluation_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_LOCUS_EVALUATION_VALUE__STATES = eINSTANCE.getEvaluation_locus_Evaluation_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATION_LOCUS_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getEvaluation_locus_Evaluation_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl <em>Evaluation specification Evaluation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getEvaluation_specification_Evaluation_Value()
		 * @generated
		 */
		EClass EVALUATION_SPECIFICATION_EVALUATION_VALUE = eINSTANCE.getEvaluation_specification_Evaluation_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT = eINSTANCE.getEvaluation_specification_Evaluation_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Specification Evaluation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION = eINSTANCE.getEvaluation_specification_Evaluation_Value_Specification_Evaluation();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES = eINSTANCE.getEvaluation_specification_Evaluation_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATION_SPECIFICATION_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getEvaluation_specification_Evaluation_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl <em>Execution Environment locus Execution Environment Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionEnvironment_locus_ExecutionEnvironment_Value()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE = eINSTANCE.getExecutionEnvironment_locus_ExecutionEnvironment_Value();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT = eINSTANCE.getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES = eINSTANCE.getExecutionEnvironment_locus_ExecutionEnvironment_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecutionEnvironment_locus_ExecutionEnvironment_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl <em>Execution Factory built In Types Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_builtInTypes_Value()
		 * @generated
		 */
		EClass EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE = eINSTANCE.getExecutionFactory_builtInTypes_Value();

		/**
		 * The meta object literal for the '<em><b>Built In Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES = eINSTANCE.getExecutionFactory_builtInTypes_Value_BuiltInTypes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT = eINSTANCE.getExecutionFactory_builtInTypes_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES = eINSTANCE.getExecutionFactory_builtInTypes_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecutionFactory_builtInTypes_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl <em>Execution Factory locus Execution Factory Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_locus_ExecutionFactory_Value()
		 * @generated
		 */
		EClass EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE = eINSTANCE.getExecutionFactory_locus_ExecutionFactory_Value();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY = eINSTANCE.getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT = eINSTANCE.getExecutionFactory_locus_ExecutionFactory_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES = eINSTANCE.getExecutionFactory_locus_ExecutionFactory_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecutionFactory_locus_ExecutionFactory_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl <em>Execution Factory primitive Behavior Prototypes Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ExecutionFactory_primitiveBehaviorPrototypes_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecutionFactory_primitiveBehaviorPrototypes_Value()
		 * @generated
		 */
		EClass EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE = eINSTANCE.getExecutionFactory_primitiveBehaviorPrototypes_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PARENT = eINSTANCE.getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Primitive Behavior Prototypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PRIMITIVE_BEHAVIOR_PROTOTYPES = eINSTANCE.getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__STATES = eINSTANCE.getExecutionFactory_primitiveBehaviorPrototypes_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecutionFactory_primitiveBehaviorPrototypes_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Execution_context_ValueImpl <em>Execution context Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Execution_context_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecution_context_Value()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT_VALUE = eINSTANCE.getExecution_context_Value();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT_VALUE__CONTEXT = eINSTANCE.getExecution_context_Value_Context();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT_VALUE__PARENT = eINSTANCE.getExecution_context_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT_VALUE__STATES = eINSTANCE.getExecution_context_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecution_context_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl <em>Execution parameter Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Execution_parameterValues_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecution_parameterValues_Value()
		 * @generated
		 */
		EClass EXECUTION_PARAMETER_VALUES_VALUE = eINSTANCE.getExecution_parameterValues_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES = eINSTANCE.getExecution_parameterValues_Value_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PARAMETER_VALUES_VALUE__PARENT = eINSTANCE.getExecution_parameterValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PARAMETER_VALUES_VALUE__STATES = eINSTANCE.getExecution_parameterValues_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecution_parameterValues_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Executor_locus_Executor_ValueImpl <em>Executor locus Executor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Executor_locus_Executor_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExecutor_locus_Executor_Value()
		 * @generated
		 */
		EClass EXECUTOR_LOCUS_EXECUTOR_VALUE = eINSTANCE.getExecutor_locus_Executor_Value();

		/**
		 * The meta object literal for the '<em><b>Locus Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR = eINSTANCE.getExecutor_locus_Executor_Value_Locus_Executor();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT = eINSTANCE.getExecutor_locus_Executor_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES = eINSTANCE.getExecutor_locus_Executor_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTOR_LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExecutor_locus_Executor_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl <em>Extensional Value locus Extensional Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getExtensionalValue_locus_ExtensionalValue_Value()
		 * @generated
		 */
		EClass EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE = eINSTANCE.getExtensionalValue_locus_ExtensionalValue_Value();

		/**
		 * The meta object literal for the '<em><b>Locus Extensional Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE = eINSTANCE.getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT = eINSTANCE.getExtensionalValue_locus_ExtensionalValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES = eINSTANCE.getExtensionalValue_locus_ExtensionalValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getExtensionalValue_locus_ExtensionalValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.FeatureValue_feature_ValueImpl <em>Feature Value feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.FeatureValue_feature_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_feature_Value()
		 * @generated
		 */
		EClass FEATURE_VALUE_FEATURE_VALUE = eINSTANCE.getFeatureValue_feature_Value();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_FEATURE_VALUE__FEATURE = eINSTANCE.getFeatureValue_feature_Value_Feature();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_FEATURE_VALUE__PARENT = eINSTANCE.getFeatureValue_feature_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_FEATURE_VALUE__STATES = eINSTANCE.getFeatureValue_feature_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUE_FEATURE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getFeatureValue_feature_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.FeatureValue_position_ValueImpl <em>Feature Value position Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.FeatureValue_position_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_position_Value()
		 * @generated
		 */
		EClass FEATURE_VALUE_POSITION_VALUE = eINSTANCE.getFeatureValue_position_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_POSITION_VALUE__PARENT = eINSTANCE.getFeatureValue_position_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VALUE_POSITION_VALUE__POSITION = eINSTANCE.getFeatureValue_position_Value_Position();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_POSITION_VALUE__STATES = eINSTANCE.getFeatureValue_position_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUE_POSITION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getFeatureValue_position_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl <em>Feature Value values Feature Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getFeatureValue_values_FeatureValue_Value()
		 * @generated
		 */
		EClass FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE = eINSTANCE.getFeatureValue_values_FeatureValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT = eINSTANCE.getFeatureValue_values_FeatureValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES = eINSTANCE.getFeatureValue_values_FeatureValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Values Feature Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE = eINSTANCE.getFeatureValue_values_FeatureValue_Value_Values_FeatureValue();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getFeatureValue_values_FeatureValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl <em>Forked Token base Token Is Withdrawn Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_baseTokenIsWithdrawn_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE = eINSTANCE.getForkedToken_baseTokenIsWithdrawn_Value();

		/**
		 * The meta object literal for the '<em><b>Base Token Is Withdrawn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN = eINSTANCE.getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT = eINSTANCE.getForkedToken_baseTokenIsWithdrawn_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES = eINSTANCE.getForkedToken_baseTokenIsWithdrawn_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getForkedToken_baseTokenIsWithdrawn_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ForkedToken_baseToken_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_BASE_TOKEN_VALUE = eINSTANCE.getForkedToken_baseToken_Value();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = eINSTANCE.getForkedToken_baseToken_Value_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = eINSTANCE.getForkedToken_baseToken_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = eINSTANCE.getForkedToken_baseToken_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORKED_TOKEN_BASE_TOKEN_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getForkedToken_baseToken_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = eINSTANCE.getForkedToken_remainingOffersCount_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = eINSTANCE.getForkedToken_remainingOffersCount_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = eINSTANCE.getForkedToken_remainingOffersCount_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getForkedToken_remainingOffersCount_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.InputParameterValues_name_ValueImpl <em>Input Parameter Values name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.InputParameterValues_name_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getInputParameterValues_name_Value()
		 * @generated
		 */
		EClass INPUT_PARAMETER_VALUES_NAME_VALUE = eINSTANCE.getInputParameterValues_name_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMETER_VALUES_NAME_VALUE__NAME = eINSTANCE.getInputParameterValues_name_Value_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES_NAME_VALUE__PARENT = eINSTANCE.getInputParameterValues_name_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES_NAME_VALUE__STATES = eINSTANCE.getInputParameterValues_name_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_PARAMETER_VALUES_NAME_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getInputParameterValues_name_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.InputParameterValues_parameterValues_ValueImpl <em>Input Parameter Values parameter Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.InputParameterValues_parameterValues_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getInputParameterValues_parameterValues_Value()
		 * @generated
		 */
		EClass INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE = eINSTANCE.getInputParameterValues_parameterValues_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES = eINSTANCE.getInputParameterValues_parameterValues_Value_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT = eINSTANCE.getInputParameterValues_parameterValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES = eINSTANCE.getInputParameterValues_parameterValues_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getInputParameterValues_parameterValues_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.IntegerValue_value_IntegerValue_ValueImpl <em>Integer Value value Integer Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.IntegerValue_value_IntegerValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getIntegerValue_value_IntegerValue_Value()
		 * @generated
		 */
		EClass INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE = eINSTANCE.getIntegerValue_value_IntegerValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__PARENT = eINSTANCE.getIntegerValue_value_IntegerValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__STATES = eINSTANCE.getIntegerValue_value_IntegerValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__VALUE_INTEGER_VALUE = eINSTANCE.getIntegerValue_value_IntegerValue_Value_Value_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getIntegerValue_value_IntegerValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Locus_executor_ValueImpl <em>Locus executor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Locus_executor_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_executor_Value()
		 * @generated
		 */
		EClass LOCUS_EXECUTOR_VALUE = eINSTANCE.getLocus_executor_Value();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXECUTOR_VALUE__EXECUTOR = eINSTANCE.getLocus_executor_Value_Executor();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXECUTOR_VALUE__PARENT = eINSTANCE.getLocus_executor_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXECUTOR_VALUE__STATES = eINSTANCE.getLocus_executor_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getLocus_executor_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Locus_extensionalValues_ValueImpl <em>Locus extensional Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Locus_extensionalValues_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_extensionalValues_Value()
		 * @generated
		 */
		EClass LOCUS_EXTENSIONAL_VALUES_VALUE = eINSTANCE.getLocus_extensionalValues_Value();

		/**
		 * The meta object literal for the '<em><b>Extensional Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXTENSIONAL_VALUES_VALUE__EXTENSIONAL_VALUES = eINSTANCE.getLocus_extensionalValues_Value_ExtensionalValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXTENSIONAL_VALUES_VALUE__PARENT = eINSTANCE.getLocus_extensionalValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_EXTENSIONAL_VALUES_VALUE__STATES = eINSTANCE.getLocus_extensionalValues_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS_EXTENSIONAL_VALUES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getLocus_extensionalValues_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Locus_factory_ValueImpl <em>Locus factory Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Locus_factory_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getLocus_factory_Value()
		 * @generated
		 */
		EClass LOCUS_FACTORY_VALUE = eINSTANCE.getLocus_factory_Value();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_FACTORY_VALUE__FACTORY = eINSTANCE.getLocus_factory_Value_Factory();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_FACTORY_VALUE__PARENT = eINSTANCE.getLocus_factory_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS_FACTORY_VALUE__STATES = eINSTANCE.getLocus_factory_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS_FACTORY_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getLocus_factory_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl <em>Object Node Activation offered Token Count Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getObjectNodeActivation_offeredTokenCount_Value()
		 * @generated
		 */
		EClass OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE = eINSTANCE.getObjectNodeActivation_offeredTokenCount_Value();

		/**
		 * The meta object literal for the '<em><b>Offered Token Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT = eINSTANCE.getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT = eINSTANCE.getObjectNodeActivation_offeredTokenCount_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES = eINSTANCE.getObjectNodeActivation_offeredTokenCount_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getObjectNodeActivation_offeredTokenCount_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ObjectToken_value_ValueImpl <em>Object Token value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ObjectToken_value_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getObjectToken_value_Value()
		 * @generated
		 */
		EClass OBJECT_TOKEN_VALUE_VALUE = eINSTANCE.getObjectToken_value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TOKEN_VALUE_VALUE__PARENT = eINSTANCE.getObjectToken_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TOKEN_VALUE_VALUE__STATES = eINSTANCE.getObjectToken_value_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TOKEN_VALUE_VALUE__VALUE = eINSTANCE.getObjectToken_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_TOKEN_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getObjectToken_value_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Object_types_ValueImpl <em>Object types Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Object_types_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getObject_types_Value()
		 * @generated
		 */
		EClass OBJECT_TYPES_VALUE = eINSTANCE.getObject_types_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPES_VALUE__PARENT = eINSTANCE.getObject_types_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPES_VALUE__STATES = eINSTANCE.getObject_types_Value_States();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPES_VALUE__TYPES = eINSTANCE.getObject_types_Value_Types();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_TYPES_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getObject_types_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Offer_offeredTokens_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
		 * @generated
		 */
		EClass OFFER_OFFERED_TOKENS_VALUE = eINSTANCE.getOffer_offeredTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = eINSTANCE.getOffer_offeredTokens_Value_OfferedTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__PARENT = eINSTANCE.getOffer_offeredTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__STATES = eINSTANCE.getOffer_offeredTokens_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER_OFFERED_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getOffer_offeredTokens_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl <em>Parameter Value parameter Parameter Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getParameterValue_parameter_ParameterValue_Value()
		 * @generated
		 */
		EClass PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE = eINSTANCE.getParameterValue_parameter_ParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter Parameter Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE = eINSTANCE.getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT = eINSTANCE.getParameterValue_parameter_ParameterValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES = eINSTANCE.getParameterValue_parameter_ParameterValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getParameterValue_parameter_ParameterValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.ParameterValue_values_ParameterValue_ValueImpl <em>Parameter Value values Parameter Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.ParameterValue_values_ParameterValue_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getParameterValue_values_ParameterValue_Value()
		 * @generated
		 */
		EClass PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE = eINSTANCE.getParameterValue_values_ParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__PARENT = eINSTANCE.getParameterValue_values_ParameterValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__STATES = eINSTANCE.getParameterValue_values_ParameterValue_Value_States();

		/**
		 * The meta object literal for the '<em><b>Values Parameter Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__VALUES_PARAMETER_VALUE = eINSTANCE.getParameterValue_values_ParameterValue_Value_Values_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getParameterValue_values_ParameterValue_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl <em>Pin Activation action Activation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.PinActivation_actionActivation_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getPinActivation_actionActivation_Value()
		 * @generated
		 */
		EClass PIN_ACTIVATION_ACTION_ACTIVATION_VALUE = eINSTANCE.getPinActivation_actionActivation_Value();

		/**
		 * The meta object literal for the '<em><b>Action Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION = eINSTANCE.getPinActivation_actionActivation_Value_ActionActivation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT = eINSTANCE.getPinActivation_actionActivation_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES = eINSTANCE.getPinActivation_actionActivation_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN_ACTIVATION_ACTION_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getPinActivation_actionActivation_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl <em>Pin Activation count temp Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.PinActivation_count_temp_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getPinActivation_count_temp_Value()
		 * @generated
		 */
		EClass PIN_ACTIVATION_COUNT_TEMP_VALUE = eINSTANCE.getPinActivation_count_temp_Value();

		/**
		 * The meta object literal for the '<em><b>Count temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP = eINSTANCE.getPinActivation_count_temp_Value_Count_temp();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT = eINSTANCE.getPinActivation_count_temp_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES = eINSTANCE.getPinActivation_count_temp_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN_ACTIVATION_COUNT_TEMP_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getPinActivation_count_temp_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.PrimitiveValue_type_ValueImpl <em>Primitive Value type Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.PrimitiveValue_type_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getPrimitiveValue_type_Value()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE_TYPE_VALUE = eINSTANCE.getPrimitiveValue_type_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE_TYPE_VALUE__PARENT = eINSTANCE.getPrimitiveValue_type_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE_TYPE_VALUE__STATES = eINSTANCE.getPrimitiveValue_type_Value_States();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE_TYPE_VALUE__TYPE = eINSTANCE.getPrimitiveValue_type_Value_Type();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE_TYPE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getPrimitiveValue_type_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Reference_referent_ValueImpl <em>Reference referent Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Reference_referent_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getReference_referent_Value()
		 * @generated
		 */
		EClass REFERENCE_REFERENT_VALUE = eINSTANCE.getReference_referent_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_REFERENT_VALUE__PARENT = eINSTANCE.getReference_referent_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_REFERENT_VALUE__REFERENT = eINSTANCE.getReference_referent_Value_Referent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_REFERENT_VALUE__STATES = eINSTANCE.getReference_referent_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_REFERENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getReference_referent_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl <em>Semantic Visitor runtime Model Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getSemanticVisitor_runtimeModelElement_Value()
		 * @generated
		 */
		EClass SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Runtime Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.StateImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Action Activation firing Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION_ACTIVATION_FIRING_VALUES = eINSTANCE.getState_ActionActivation_firing_Values();

		/**
		 * The meta object literal for the '<em><b>Action Activation pin Activations Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES = eINSTANCE.getState_ActionActivation_pinActivations_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge Instance edge Activity Edge Instance Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES = eINSTANCE.getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge Instance group Activity Edge Instance Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES = eINSTANCE.getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge Instance offers Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES = eINSTANCE.getState_ActivityEdgeInstance_offers_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge Instance source Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES = eINSTANCE.getState_ActivityEdgeInstance_source_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge Instance target Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES = eINSTANCE.getState_ActivityEdgeInstance_target_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Execution activation Group Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES = eINSTANCE.getState_ActivityExecution_activationGroup_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation Group activity Execution Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES = eINSTANCE.getState_ActivityNodeActivationGroup_activityExecution_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation Group edge Instances Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES = eINSTANCE.getState_ActivityNodeActivationGroup_edgeInstances_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation Group node Activations Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES = eINSTANCE.getState_ActivityNodeActivationGroup_nodeActivations_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation group Activity Node Activation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES = eINSTANCE.getState_ActivityNodeActivation_group_ActivityNodeActivation_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation held Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES = eINSTANCE.getState_ActivityNodeActivation_heldTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation incoming Edges Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES = eINSTANCE.getState_ActivityNodeActivation_incomingEdges_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation is Running Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES = eINSTANCE.getState_ActivityNodeActivation_isRunning_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation node Activity Node Activation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES = eINSTANCE.getState_ActivityNodeActivation_node_ActivityNodeActivation_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation outgoing Edges Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES = eINSTANCE.getState_ActivityNodeActivation_outgoingEdges_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node Activation running Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES = eINSTANCE.getState_ActivityNodeActivation_running_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Boolean Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_BooleanValue_Values();

		/**
		 * The meta object literal for the '<em><b>Call Action Activation call Executions Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES = eINSTANCE.getState_CallActionActivation_callExecutions_Values();

		/**
		 * The meta object literal for the '<em><b>Compound Value feature Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES = eINSTANCE.getState_CompoundValue_featureValues_Values();

		/**
		 * The meta object literal for the '<em><b>Element Configuration semantic Visitor Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES = eINSTANCE.getState_ElementConfiguration_semanticVisitor_Values();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Evaluation locus Evaluation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVALUATION_LOCUS_EVALUATION_VALUES = eINSTANCE.getState_Evaluation_locus_Evaluation_Values();

		/**
		 * The meta object literal for the '<em><b>Evaluation specification Evaluation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES = eINSTANCE.getState_Evaluation_specification_Evaluation_Values();

		/**
		 * The meta object literal for the '<em><b>Execution Environment locus Execution Environment Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES = eINSTANCE.getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values();

		/**
		 * The meta object literal for the '<em><b>Execution Factory built In Types Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES = eINSTANCE.getState_ExecutionFactory_builtInTypes_Values();

		/**
		 * The meta object literal for the '<em><b>Execution Factory locus Execution Factory Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES = eINSTANCE.getState_ExecutionFactory_locus_ExecutionFactory_Values();

		/**
		 * The meta object literal for the '<em><b>Execution Factory primitive Behavior Prototypes Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES = eINSTANCE.getState_ExecutionFactory_primitiveBehaviorPrototypes_Values();

		/**
		 * The meta object literal for the '<em><b>Execution context Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_CONTEXT_VALUES = eINSTANCE.getState_Execution_context_Values();

		/**
		 * The meta object literal for the '<em><b>Execution parameter Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTION_PARAMETER_VALUES_VALUES = eINSTANCE.getState_Execution_parameterValues_Values();

		/**
		 * The meta object literal for the '<em><b>Executor locus Executor Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES = eINSTANCE.getState_Executor_locus_Executor_Values();

		/**
		 * The meta object literal for the '<em><b>Extensional Value locus Extensional Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES = eINSTANCE.getState_ExtensionalValue_locus_ExtensionalValue_Values();

		/**
		 * The meta object literal for the '<em><b>Feature Value feature Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FEATURE_VALUE_FEATURE_VALUES = eINSTANCE.getState_FeatureValue_feature_Values();

		/**
		 * The meta object literal for the '<em><b>Feature Value position Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FEATURE_VALUE_POSITION_VALUES = eINSTANCE.getState_FeatureValue_position_Values();

		/**
		 * The meta object literal for the '<em><b>Feature Value values Feature Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES = eINSTANCE.getState_FeatureValue_values_FeatureValue_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token base Token Is Withdrawn Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES = eINSTANCE.getState_ForkedToken_baseTokenIsWithdrawn_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token base Token Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = eINSTANCE.getState_ForkedToken_baseToken_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = eINSTANCE.getState_ForkedToken_remainingOffersCount_Values();

		/**
		 * The meta object literal for the '<em><b>Input Parameter Values name Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_PARAMETER_VALUES_NAME_VALUES = eINSTANCE.getState_InputParameterValues_name_Values();

		/**
		 * The meta object literal for the '<em><b>Input Parameter Values parameter Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES = eINSTANCE.getState_InputParameterValues_parameterValues_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Value value Integer Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES = eINSTANCE.getState_IntegerValue_value_IntegerValue_Values();

		/**
		 * The meta object literal for the '<em><b>Locus executor Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCUS_EXECUTOR_VALUES = eINSTANCE.getState_Locus_executor_Values();

		/**
		 * The meta object literal for the '<em><b>Locus extensional Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCUS_EXTENSIONAL_VALUES_VALUES = eINSTANCE.getState_Locus_extensionalValues_Values();

		/**
		 * The meta object literal for the '<em><b>Locus factory Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCUS_FACTORY_VALUES = eINSTANCE.getState_Locus_factory_Values();

		/**
		 * The meta object literal for the '<em><b>Object Node Activation offered Token Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES = eINSTANCE.getState_ObjectNodeActivation_offeredTokenCount_Values();

		/**
		 * The meta object literal for the '<em><b>Object Token value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECT_TOKEN_VALUE_VALUES = eINSTANCE.getState_ObjectToken_value_Values();

		/**
		 * The meta object literal for the '<em><b>Object types Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECT_TYPES_VALUES = eINSTANCE.getState_Object_types_Values();

		/**
		 * The meta object literal for the '<em><b>Offer offered Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OFFER_OFFERED_TOKENS_VALUES = eINSTANCE.getState_Offer_offeredTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Parameter Value parameter Parameter Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES = eINSTANCE.getState_ParameterValue_parameter_ParameterValue_Values();

		/**
		 * The meta object literal for the '<em><b>Parameter Value values Parameter Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES = eINSTANCE.getState_ParameterValue_values_ParameterValue_Values();

		/**
		 * The meta object literal for the '<em><b>Pin Activation action Activation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES = eINSTANCE.getState_PinActivation_actionActivation_Values();

		/**
		 * The meta object literal for the '<em><b>Pin Activation count temp Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES = eINSTANCE.getState_PinActivation_count_temp_Values();

		/**
		 * The meta object literal for the '<em><b>Primitive Value type Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PRIMITIVE_VALUE_TYPE_VALUES = eINSTANCE.getState_PrimitiveValue_type_Values();

		/**
		 * The meta object literal for the '<em><b>Reference referent Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REFERENCE_REFERENT_VALUES = eINSTANCE.getState_Reference_referent_Values();

		/**
		 * The meta object literal for the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES = eINSTANCE.getState_SemanticVisitor_runtimeModelElement_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Token holder Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TOKEN_HOLDER_VALUES = eINSTANCE.getState_Token_holder_Values();

		/**
		 * The meta object literal for the '{@link umlTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.impl.Token_holder_ValueImpl
		 * @see umlTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
		 * @generated
		 */
		EClass TOKEN_HOLDER_VALUE = eINSTANCE.getToken_holder_Value();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__HOLDER = eINSTANCE.getToken_holder_Value_Holder();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__PARENT = eINSTANCE.getToken_holder_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__STATES = eINSTANCE.getToken_holder_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN_HOLDER_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getToken_holder_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link umlTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.Value
		 * @see umlTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
