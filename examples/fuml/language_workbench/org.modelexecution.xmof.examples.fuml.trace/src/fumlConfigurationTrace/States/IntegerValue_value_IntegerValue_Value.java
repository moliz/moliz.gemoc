/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value value Integer Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getStates <em>States</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getValue_IntegerValue <em>Value Integer Value</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getIntegerValue_value_IntegerValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/IntegerValue/value_IntegerValue'"
 * @generated
 */
public interface IntegerValue_value_IntegerValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue#getValue_IntegerValueSequence <em>Value Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getIntegerValue_value_IntegerValue_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue#getValue_IntegerValueSequence
	 * @model opposite="value_IntegerValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedIntegerValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getIntegerValue_value_IntegerValue_Values <em>Integer Value value Integer Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getIntegerValue_value_IntegerValue_Value_States()
	 * @see fumlConfigurationTrace.States.State#getIntegerValue_value_IntegerValue_Values
	 * @model opposite="integerValue_value_IntegerValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Value Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer Value</em>' attribute.
	 * @see #setValue_IntegerValue(int)
	 * @see fumlConfigurationTrace.States.StatesPackage#getIntegerValue_value_IntegerValue_Value_Value_IntegerValue()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/IntegerValue/value_IntegerValue'"
	 * @generated
	 */
	int getValue_IntegerValue();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value#getValue_IntegerValue <em>Value Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer Value</em>' attribute.
	 * @see #getValue_IntegerValue()
	 * @generated
	 */
	void setValue_IntegerValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // IntegerValue_value_IntegerValue_Value
