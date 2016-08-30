/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue;

import fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Value type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getStates <em>States</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getPrimitiveValue_type_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/PrimitiveValue/type'"
 * @generated
 */
public interface PrimitiveValue_type_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence <em>Type Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPrimitiveValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getPrimitiveValue_type_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence
	 * @model opposite="typeSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPrimitiveValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPrimitiveValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getPrimitiveValue_type_Values <em>Primitive Value type Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getPrimitiveValue_type_Value_States()
	 * @see fumlConfigurationTrace.States.State#getPrimitiveValue_type_Values
	 * @model opposite="primitiveValue_type_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TracedPrimitiveTypeConfiguration)
	 * @see fumlConfigurationTrace.States.StatesPackage#getPrimitiveValue_type_Value_Type()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/PrimitiveValue/type'"
	 * @generated
	 */
	TracedPrimitiveTypeConfiguration getType();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TracedPrimitiveTypeConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // PrimitiveValue_type_Value
