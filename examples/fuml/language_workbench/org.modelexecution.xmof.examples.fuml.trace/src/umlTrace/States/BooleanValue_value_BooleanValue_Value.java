/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value value Boolean Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getStates <em>States</em>}</li>
 *   <li>{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#isValue_BooleanValue <em>Value Boolean Value</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getBooleanValue_value_BooleanValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/BooleanValue/value_BooleanValue'"
 * @generated
 */
public interface BooleanValue_value_BooleanValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence <em>Value Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBooleanValue)
	 * @see umlTrace.States.StatesPackage#getBooleanValue_value_BooleanValue_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence
	 * @model opposite="value_BooleanValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBooleanValue getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBooleanValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getBooleanValue_value_BooleanValue_Values <em>Boolean Value value Boolean Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getBooleanValue_value_BooleanValue_Value_States()
	 * @see umlTrace.States.State#getBooleanValue_value_BooleanValue_Values
	 * @model opposite="booleanValue_value_BooleanValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Value Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Boolean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean Value</em>' attribute.
	 * @see #setValue_BooleanValue(boolean)
	 * @see umlTrace.States.StatesPackage#getBooleanValue_value_BooleanValue_Value_Value_BooleanValue()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/BooleanValue/value_BooleanValue'"
	 * @generated
	 */
	boolean isValue_BooleanValue();

	/**
	 * Sets the value of the '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#isValue_BooleanValue <em>Value Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean Value</em>' attribute.
	 * @see #isValue_BooleanValue()
	 * @generated
	 */
	void setValue_BooleanValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // BooleanValue_value_BooleanValue_Value
