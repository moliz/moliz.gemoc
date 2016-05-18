/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action Activation call Executions Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.CallActionActivation_callExecutions_Value#getCallExecutions <em>Call Executions</em>}</li>
 *   <li>{@link umlTrace.States.CallActionActivation_callExecutions_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.CallActionActivation_callExecutions_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getCallActionActivation_callExecutions_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/CallActionActivation/callExecutions'"
 * @generated
 */
public interface CallActionActivation_callExecutions_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Call Executions</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Executions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Executions</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getCallActionActivation_callExecutions_Value_CallExecutions()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/CallActionActivation/callExecutions'"
	 * @generated
	 */
	EList<TracedExecution> getCallExecutions();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence <em>Call Executions Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedCallActionActivation)
	 * @see umlTrace.States.StatesPackage#getCallActionActivation_callExecutions_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence
	 * @model opposite="callExecutionsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedCallActionActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedCallActionActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getCallActionActivation_callExecutions_Values <em>Call Action Activation call Executions Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getCallActionActivation_callExecutions_Value_States()
	 * @see umlTrace.States.State#getCallActionActivation_callExecutions_Values
	 * @model opposite="callActionActivation_callExecutions_Values" required="true"
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

} // CallActionActivation_callExecutions_Value
