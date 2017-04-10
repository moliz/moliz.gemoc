/**
 */
package fsmConfiguration;

import fsm.FSM;
import fsm.State;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfiguration.FSMConfiguration#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fsmConfiguration.FSMConfiguration#getProducedSequence <em>Produced Sequence</em>}</li>
 *   <li>{@link fsmConfiguration.FSMConfiguration#getAcceptedSequence <em>Accepted Sequence</em>}</li>
 * </ul>
 *
 * @see fsmConfiguration.FsmConfigurationPackage#getFSMConfiguration()
 * @model
 * @generated
 */
public interface FSMConfiguration extends FSM {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see fsmConfiguration.FsmConfigurationPackage#getFSMConfiguration_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link fsmConfiguration.FSMConfiguration#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Produced Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Sequence</em>' attribute list.
	 * @see fsmConfiguration.FsmConfigurationPackage#getFSMConfiguration_ProducedSequence()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getProducedSequence();

	/**
	 * Returns the value of the '<em><b>Accepted Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Sequence</em>' attribute list.
	 * @see fsmConfiguration.FsmConfigurationPackage#getFSMConfiguration_AcceptedSequence()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAcceptedSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main(Input input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void run(EObject input);

} // FSMConfiguration
