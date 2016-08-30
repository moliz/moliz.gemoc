/**
 */
package imlTrace.States;

import imlTrace.States.iml.TracedVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.Variable_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link imlTrace.States.Variable_value_Value#getStates <em>States</em>}</li>
 *   <li>{@link imlTrace.States.Variable_value_Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.StatesPackage#getVariable_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Variable_value_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.iml.TracedVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVariable)
	 * @see imlTrace.States.StatesPackage#getVariable_value_Value_Parent()
	 * @see imlTrace.States.iml.TracedVariable#getValueSequence
	 * @model opposite="valueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedVariable getParent();

	/**
	 * Sets the value of the '{@link imlTrace.States.Variable_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedVariable value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State#getVariable_value_Values <em>Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getVariable_value_Value_States()
	 * @see imlTrace.States.State#getVariable_value_Values
	 * @model opposite="variable_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see imlTrace.States.StatesPackage#getVariable_value_Value_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link imlTrace.States.Variable_value_Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Variable_value_Value
