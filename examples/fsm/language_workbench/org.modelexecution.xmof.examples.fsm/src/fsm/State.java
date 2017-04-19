/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link fsm.State#getContainingFSM <em>Containing FSM</em>}</li>
 * </ul>
 *
 * @see fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fsm.FsmPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see fsm.FsmPackage#getState_OutgoingTransitions()
	 * @see fsm.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see fsm.FsmPackage#getState_IncomingTransitions()
	 * @see fsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Containing FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsm.FSM#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing FSM</em>' container reference.
	 * @see #setContainingFSM(FSM)
	 * @see fsm.FsmPackage#getState_ContainingFSM()
	 * @see fsm.FSM#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	FSM getContainingFSM();

	/**
	 * Sets the value of the '{@link fsm.State#getContainingFSM <em>Containing FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing FSM</em>' container reference.
	 * @see #getContainingFSM()
	 * @generated
	 */
	void setContainingFSM(FSM value);

} // State
