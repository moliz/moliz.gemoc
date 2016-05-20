/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.CallActionActivation_callExecutions_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Call Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation#getCallExecutionsSequence <em>Call Executions Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedCallActionActivation()
 * @model abstract="true"
 * @generated
 */
public interface TracedCallActionActivation extends TracedInvocationActionActivation {
	/**
	 * Returns the value of the '<em><b>Call Executions Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.CallActionActivation_callExecutions_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.CallActionActivation_callExecutions_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Executions Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Executions Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedCallActionActivation_CallExecutionsSequence()
	 * @see umlTrace.States.CallActionActivation_callExecutions_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CallActionActivation_callExecutions_Value> getCallExecutionsSequence();

} // TracedCallActionActivation
