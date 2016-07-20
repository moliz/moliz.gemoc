/**
 */
package imlTrace.States;

import imlTrace.States.iml.TracedActivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity current Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.Activity_current_Value#isCurrent <em>Current</em>}</li>
 *   <li>{@link imlTrace.States.Activity_current_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link imlTrace.States.Activity_current_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.StatesPackage#getActivity_current_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_current_Value extends Value {
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
	 * @see imlTrace.States.StatesPackage#getActivity_current_Value_Current()
	 * @model
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link imlTrace.States.Activity_current_Value#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.iml.TracedActivity#getCurrentSequence <em>Current Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see imlTrace.States.StatesPackage#getActivity_current_Value_Parent()
	 * @see imlTrace.States.iml.TracedActivity#getCurrentSequence
	 * @model opposite="currentSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link imlTrace.States.Activity_current_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State#getActivity_current_Values <em>Activity current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getActivity_current_Value_States()
	 * @see imlTrace.States.State#getActivity_current_Values
	 * @model opposite="activity_current_Values" required="true"
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

} // Activity_current_Value
