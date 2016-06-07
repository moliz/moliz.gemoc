/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value values Parameter Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getStates <em>States</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getValues_ParameterValue <em>Values Parameter Value</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_values_ParameterValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/ParameterValue/values_ParameterValue'"
 * @generated
 */
public interface ParameterValue_values_ParameterValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence <em>Values Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedParameterValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_values_ParameterValue_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence
	 * @model opposite="values_ParameterValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedParameterValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedParameterValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getParameterValue_values_ParameterValue_Values <em>Parameter Value values Parameter Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_values_ParameterValue_Value_States()
	 * @see fumlConfigurationTrace.States.State#getParameterValue_values_ParameterValue_Values
	 * @model opposite="parameterValue_values_ParameterValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Values Parameter Value</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Parameter Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Parameter Value</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_values_ParameterValue_Value_Values_ParameterValue()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/ParameterValue/values_ParameterValue'"
	 * @generated
	 */
	EList<TracedValue> getValues_ParameterValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ParameterValue_values_ParameterValue_Value
