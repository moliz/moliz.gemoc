/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter Values parameter Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getInputParameterValues_parameterValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Input/InputParameterValues/parameterValues'"
 * @generated
 */
public interface InputParameterValues_parameterValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getInputParameterValues_parameterValues_Value_ParameterValues()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Input/InputParameterValues/parameterValues'"
	 * @generated
	 */
	EList<TracedParameterValue> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence <em>Parameter Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInputParameterValues)
	 * @see fumlConfigurationTrace.States.StatesPackage#getInputParameterValues_parameterValues_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence
	 * @model opposite="parameterValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedInputParameterValues getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInputParameterValues value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getInputParameterValues_parameterValues_Values <em>Input Parameter Values parameter Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getInputParameterValues_parameterValues_Value_States()
	 * @see fumlConfigurationTrace.States.State#getInputParameterValues_parameterValues_Values
	 * @model opposite="inputParameterValues_parameterValues_Values" required="true"
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

} // InputParameterValues_parameterValues_Value
