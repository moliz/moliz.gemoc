/**
 */
package fsmConfigurationTrace.States.fsm;

import fsm.FSM;

import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsm.TracedFSM#getOriginalObject_FSM <em>Original Object FSM</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.fsm.FsmPackage#getTracedFSM()
 * @model
 * @generated
 */
public interface TracedFSM extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * Returns the value of the '<em><b>Original Object FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object FSM</em>' reference.
	 * @see #setOriginalObject_FSM(FSM)
	 * @see fsmConfigurationTrace.States.fsm.FsmPackage#getTracedFSM_OriginalObject_FSM()
	 * @model
	 * @generated
	 */
	FSM getOriginalObject_FSM();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsm.TracedFSM#getOriginalObject_FSM <em>Original Object FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object FSM</em>' reference.
	 * @see #getOriginalObject_FSM()
	 * @generated
	 */
	void setOriginalObject_FSM(FSM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\r\nresult.addAll(super.getDimensionsInternal());\r\nreturn result;\r\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedFSM
