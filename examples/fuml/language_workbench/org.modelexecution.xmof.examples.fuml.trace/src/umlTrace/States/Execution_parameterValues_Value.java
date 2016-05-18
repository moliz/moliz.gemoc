/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution parameter Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Execution_parameterValues_Value#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link umlTrace.States.Execution_parameterValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Execution_parameterValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getExecution_parameterValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/Execution/parameterValues'"
 * @generated
 */
public interface Execution_parameterValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecution_parameterValues_Value_ParameterValues()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/Execution/parameterValues'"
	 * @generated
	 */
	EList<TracedParameterValue> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getParameterValuesSequence <em>Parameter Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecution)
	 * @see umlTrace.States.StatesPackage#getExecution_parameterValues_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getParameterValuesSequence
	 * @model opposite="parameterValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecution getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Execution_parameterValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecution value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getExecution_parameterValues_Values <em>Execution parameter Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecution_parameterValues_Value_States()
	 * @see umlTrace.States.State#getExecution_parameterValues_Values
	 * @model opposite="execution_parameterValues_Values" required="true"
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

} // Execution_parameterValues_Value
