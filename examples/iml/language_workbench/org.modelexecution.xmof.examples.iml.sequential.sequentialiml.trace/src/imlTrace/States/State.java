/**
 */
package imlTrace.States;

import imlTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.State#getActivity_current_Values <em>Activity current Values</em>}</li>
 *   <li>{@link imlTrace.States.State#getConnectionPoint_firing_Values <em>Connection Point firing Values</em>}</li>
 *   <li>{@link imlTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link imlTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link imlTrace.States.State#getState_current_Values <em>State current Values</em>}</li>
 *   <li>{@link imlTrace.States.State#getVariable_value_Values <em>Variable value Values</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity current Values</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.Activity_current_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.Activity_current_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity current Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity current Values</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_Activity_current_Values()
	 * @see imlTrace.States.Activity_current_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_current_Value> getActivity_current_Values();

	/**
	 * Returns the value of the '<em><b>Connection Point firing Values</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.ConnectionPoint_firing_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.ConnectionPoint_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point firing Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point firing Values</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_ConnectionPoint_firing_Values()
	 * @see imlTrace.States.ConnectionPoint_firing_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ConnectionPoint_firing_Value> getConnectionPoint_firing_Values();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link imlTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_EndedSteps()
	 * @see imlTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link imlTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_StartedSteps()
	 * @see imlTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>State current Values</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.State_current_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State_current_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State current Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State current Values</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_State_current_Values()
	 * @see imlTrace.States.State_current_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<State_current_Value> getState_current_Values();

	/**
	 * Returns the value of the '<em><b>Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.Variable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable value Values</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_Variable_value_Values()
	 * @see imlTrace.States.Variable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_value_Value> getVariable_value_Values();

} // State
