/**
 */
package fsmConfigurationTrace.States.fsmConfiguration;

import fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension;
import fsmConfigurationTrace.States.SpecificDimension;

import fsmConfigurationTrace.States.fsm.TracedFSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced FSM Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedFSMConfiguration()
 * @model
 * @generated
 */
public interface TracedFSMConfiguration extends TracedFSM {
	/**
	 * Returns the value of the '<em><b>FSM Configuration accepted Sequence Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM Configuration accepted Sequence Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM Configuration accepted Sequence Dimension</em>' containment reference.
	 * @see #setFSMConfiguration_acceptedSequence_Dimension(FSMConfiguration_acceptedSequence_Dimension)
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedFSMConfiguration_FSMConfiguration_acceptedSequence_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	FSMConfiguration_acceptedSequence_Dimension getFSMConfiguration_acceptedSequence_Dimension();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FSM Configuration accepted Sequence Dimension</em>' containment reference.
	 * @see #getFSMConfiguration_acceptedSequence_Dimension()
	 * @generated
	 */
	void setFSMConfiguration_acceptedSequence_Dimension(FSMConfiguration_acceptedSequence_Dimension value);

	/**
	 * Returns the value of the '<em><b>FSM Configuration current State Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM Configuration current State Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM Configuration current State Dimension</em>' containment reference.
	 * @see #setFSMConfiguration_currentState_Dimension(FSMConfiguration_currentState_Dimension)
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedFSMConfiguration_FSMConfiguration_currentState_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	FSMConfiguration_currentState_Dimension getFSMConfiguration_currentState_Dimension();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FSM Configuration current State Dimension</em>' containment reference.
	 * @see #getFSMConfiguration_currentState_Dimension()
	 * @generated
	 */
	void setFSMConfiguration_currentState_Dimension(FSMConfiguration_currentState_Dimension value);

	/**
	 * Returns the value of the '<em><b>FSM Configuration produced Sequence Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM Configuration produced Sequence Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM Configuration produced Sequence Dimension</em>' containment reference.
	 * @see #setFSMConfiguration_producedSequence_Dimension(FSMConfiguration_producedSequence_Dimension)
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedFSMConfiguration_FSMConfiguration_producedSequence_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	FSMConfiguration_producedSequence_Dimension getFSMConfiguration_producedSequence_Dimension();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FSM Configuration produced Sequence Dimension</em>' containment reference.
	 * @see #getFSMConfiguration_producedSequence_Dimension()
	 * @generated
	 */
	void setFSMConfiguration_producedSequence_Dimension(FSMConfiguration_producedSequence_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\r\nresult.addAll(super.getDimensionsInternal());\r\nresult.add(getFSMConfiguration_currentState_Dimension());\r\nresult.add(getFSMConfiguration_acceptedSequence_Dimension());\r\nresult.add(getFSMConfiguration_producedSequence_Dimension());\r\nreturn result;\r\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedFSMConfiguration
