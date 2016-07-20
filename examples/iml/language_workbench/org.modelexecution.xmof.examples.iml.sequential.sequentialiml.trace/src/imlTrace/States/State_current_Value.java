/**
 */
package imlTrace.States;

import imlTrace.States.iml.TracedState;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State current Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.State_current_Value#isCurrent <em>Current</em>}</li>
 *   <li>{@link imlTrace.States.State_current_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link imlTrace.States.State_current_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.StatesPackage#getState_current_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface State_current_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(boolean)
	 * @see imlTrace.States.StatesPackage#getState_current_Value_Current()
	 * @model
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link imlTrace.States.State_current_Value#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.iml.TracedState#getCurrentSequence <em>Current Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedState)
	 * @see imlTrace.States.StatesPackage#getState_current_Value_Parent()
	 * @see imlTrace.States.iml.TracedState#getCurrentSequence
	 * @model opposite="currentSequence" required="true" transient="false"
	 * @generated
	 */
	TracedState getParent();

	/**
	 * Sets the value of the '{@link imlTrace.States.State_current_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State#getState_current_Values <em>State current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getState_current_Value_States()
	 * @see imlTrace.States.State#getState_current_Values
	 * @model opposite="state_current_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // State_current_Value
