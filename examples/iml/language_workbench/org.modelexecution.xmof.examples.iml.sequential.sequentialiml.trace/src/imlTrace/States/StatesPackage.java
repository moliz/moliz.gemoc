/**
 */
package imlTrace.States;

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
 * @see imlTrace.States.StatesFactory
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
	String eNS_URI = "imlTrace_States";

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
	StatesPackage eINSTANCE = imlTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link imlTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.Value
	 * @see imlTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 4;

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
	 * The meta object id for the '{@link imlTrace.States.impl.Activity_current_ValueImpl <em>Activity current Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.impl.Activity_current_ValueImpl
	 * @see imlTrace.States.impl.StatesPackageImpl#getActivity_current_Value()
	 * @generated
	 */
	int ACTIVITY_CURRENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE__CURRENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity current Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity current Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CURRENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl <em>Connection Point firing Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.impl.ConnectionPoint_firing_ValueImpl
	 * @see imlTrace.States.impl.StatesPackageImpl#getConnectionPoint_firing_Value()
	 * @generated
	 */
	int CONNECTION_POINT_FIRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE__FIRING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Point firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FIRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.impl.StateImpl
	 * @see imlTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Activity current Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_CURRENT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Connection Point firing Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION_POINT_FIRING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 3;

	/**
	 * The feature id for the '<em><b>State current Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_CURRENT_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_VALUE_VALUES = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.impl.State_current_ValueImpl <em>State current Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.impl.State_current_ValueImpl
	 * @see imlTrace.States.impl.StatesPackageImpl#getState_current_Value()
	 * @generated
	 */
	int STATE_CURRENT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE__CURRENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State current Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>State current Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CURRENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.States.impl.Variable_value_ValueImpl <em>Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.impl.Variable_value_ValueImpl
	 * @see imlTrace.States.impl.StatesPackageImpl#getVariable_value_Value()
	 * @generated
	 */
	int VARIABLE_VALUE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link imlTrace.States.Activity_current_Value <em>Activity current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity current Value</em>'.
	 * @see imlTrace.States.Activity_current_Value
	 * @generated
	 */
	EClass getActivity_current_Value();

	/**
	 * Returns the meta object for the attribute '{@link imlTrace.States.Activity_current_Value#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see imlTrace.States.Activity_current_Value#isCurrent()
	 * @see #getActivity_current_Value()
	 * @generated
	 */
	EAttribute getActivity_current_Value_Current();

	/**
	 * Returns the meta object for the container reference '{@link imlTrace.States.Activity_current_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see imlTrace.States.Activity_current_Value#getParent()
	 * @see #getActivity_current_Value()
	 * @generated
	 */
	EReference getActivity_current_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.Activity_current_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see imlTrace.States.Activity_current_Value#getStates()
	 * @see #getActivity_current_Value()
	 * @generated
	 */
	EReference getActivity_current_Value_States();

	/**
	 * Returns the meta object for the '{@link imlTrace.States.Activity_current_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see imlTrace.States.Activity_current_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActivity_current_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.ConnectionPoint_firing_Value <em>Connection Point firing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point firing Value</em>'.
	 * @see imlTrace.States.ConnectionPoint_firing_Value
	 * @generated
	 */
	EClass getConnectionPoint_firing_Value();

	/**
	 * Returns the meta object for the attribute '{@link imlTrace.States.ConnectionPoint_firing_Value#isFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing</em>'.
	 * @see imlTrace.States.ConnectionPoint_firing_Value#isFiring()
	 * @see #getConnectionPoint_firing_Value()
	 * @generated
	 */
	EAttribute getConnectionPoint_firing_Value_Firing();

	/**
	 * Returns the meta object for the container reference '{@link imlTrace.States.ConnectionPoint_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see imlTrace.States.ConnectionPoint_firing_Value#getParent()
	 * @see #getConnectionPoint_firing_Value()
	 * @generated
	 */
	EReference getConnectionPoint_firing_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.ConnectionPoint_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see imlTrace.States.ConnectionPoint_firing_Value#getStates()
	 * @see #getConnectionPoint_firing_Value()
	 * @generated
	 */
	EReference getConnectionPoint_firing_Value_States();

	/**
	 * Returns the meta object for the '{@link imlTrace.States.ConnectionPoint_firing_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see imlTrace.States.ConnectionPoint_firing_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getConnectionPoint_firing_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see imlTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getActivity_current_Values <em>Activity current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity current Values</em>'.
	 * @see imlTrace.States.State#getActivity_current_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_current_Values();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getConnectionPoint_firing_Values <em>Connection Point firing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Point firing Values</em>'.
	 * @see imlTrace.States.State#getConnectionPoint_firing_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ConnectionPoint_firing_Values();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see imlTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see imlTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getState_current_Values <em>State current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State current Values</em>'.
	 * @see imlTrace.States.State#getState_current_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_State_current_Values();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State#getVariable_value_Values <em>Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable value Values</em>'.
	 * @see imlTrace.States.State#getVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_value_Values();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.State_current_Value <em>State current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State current Value</em>'.
	 * @see imlTrace.States.State_current_Value
	 * @generated
	 */
	EClass getState_current_Value();

	/**
	 * Returns the meta object for the attribute '{@link imlTrace.States.State_current_Value#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see imlTrace.States.State_current_Value#isCurrent()
	 * @see #getState_current_Value()
	 * @generated
	 */
	EAttribute getState_current_Value_Current();

	/**
	 * Returns the meta object for the container reference '{@link imlTrace.States.State_current_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see imlTrace.States.State_current_Value#getParent()
	 * @see #getState_current_Value()
	 * @generated
	 */
	EReference getState_current_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.State_current_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see imlTrace.States.State_current_Value#getStates()
	 * @see #getState_current_Value()
	 * @generated
	 */
	EReference getState_current_Value_States();

	/**
	 * Returns the meta object for the '{@link imlTrace.States.State_current_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see imlTrace.States.State_current_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getState_current_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see imlTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see imlTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.Variable_value_Value <em>Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable value Value</em>'.
	 * @see imlTrace.States.Variable_value_Value
	 * @generated
	 */
	EClass getVariable_value_Value();

	/**
	 * Returns the meta object for the container reference '{@link imlTrace.States.Variable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see imlTrace.States.Variable_value_Value#getParent()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EReference getVariable_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.States.Variable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see imlTrace.States.Variable_value_Value#getStates()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EReference getVariable_value_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link imlTrace.States.Variable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see imlTrace.States.Variable_value_Value#getValue()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EAttribute getVariable_value_Value_Value();

	/**
	 * Returns the meta object for the '{@link imlTrace.States.Variable_value_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see imlTrace.States.Variable_value_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getVariable_value_Value__GetStatesNoOpposite();

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
		 * The meta object literal for the '{@link imlTrace.States.impl.Activity_current_ValueImpl <em>Activity current Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.impl.Activity_current_ValueImpl
		 * @see imlTrace.States.impl.StatesPackageImpl#getActivity_current_Value()
		 * @generated
		 */
		EClass ACTIVITY_CURRENT_VALUE = eINSTANCE.getActivity_current_Value();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_CURRENT_VALUE__CURRENT = eINSTANCE.getActivity_current_Value_Current();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CURRENT_VALUE__PARENT = eINSTANCE.getActivity_current_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CURRENT_VALUE__STATES = eINSTANCE.getActivity_current_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_CURRENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActivity_current_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl <em>Connection Point firing Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.impl.ConnectionPoint_firing_ValueImpl
		 * @see imlTrace.States.impl.StatesPackageImpl#getConnectionPoint_firing_Value()
		 * @generated
		 */
		EClass CONNECTION_POINT_FIRING_VALUE = eINSTANCE.getConnectionPoint_firing_Value();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT_FIRING_VALUE__FIRING = eINSTANCE.getConnectionPoint_firing_Value_Firing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_FIRING_VALUE__PARENT = eINSTANCE.getConnectionPoint_firing_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_FIRING_VALUE__STATES = eINSTANCE.getConnectionPoint_firing_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION_POINT_FIRING_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getConnectionPoint_firing_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link imlTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.impl.StateImpl
		 * @see imlTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Activity current Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_CURRENT_VALUES = eINSTANCE.getState_Activity_current_Values();

		/**
		 * The meta object literal for the '<em><b>Connection Point firing Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION_POINT_FIRING_VALUES = eINSTANCE.getState_ConnectionPoint_firing_Values();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>State current Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_CURRENT_VALUES = eINSTANCE.getState_State_current_Values();

		/**
		 * The meta object literal for the '<em><b>Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_VALUE_VALUES = eINSTANCE.getState_Variable_value_Values();

		/**
		 * The meta object literal for the '{@link imlTrace.States.impl.State_current_ValueImpl <em>State current Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.impl.State_current_ValueImpl
		 * @see imlTrace.States.impl.StatesPackageImpl#getState_current_Value()
		 * @generated
		 */
		EClass STATE_CURRENT_VALUE = eINSTANCE.getState_current_Value();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CURRENT_VALUE__CURRENT = eINSTANCE.getState_current_Value_Current();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CURRENT_VALUE__PARENT = eINSTANCE.getState_current_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CURRENT_VALUE__STATES = eINSTANCE.getState_current_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_CURRENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getState_current_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link imlTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.Value
		 * @see imlTrace.States.impl.StatesPackageImpl#getValue()
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

		/**
		 * The meta object literal for the '{@link imlTrace.States.impl.Variable_value_ValueImpl <em>Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.impl.Variable_value_ValueImpl
		 * @see imlTrace.States.impl.StatesPackageImpl#getVariable_value_Value()
		 * @generated
		 */
		EClass VARIABLE_VALUE_VALUE = eINSTANCE.getVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_VALUE__PARENT = eINSTANCE.getVariable_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_VALUE__STATES = eINSTANCE.getVariable_value_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getVariable_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getVariable_value_Value__GetStatesNoOpposite();

	}

} //StatesPackage
