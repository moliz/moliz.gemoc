/**
 */
package imlTrace.States.iml;

import imlTrace.States.State_current_Value;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedState#getCurrentSequence <em>Current Sequence</em>}</li>
 *   <li>{@link imlTrace.States.iml.TracedState#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedState()
 * @model
 * @generated
 */
public interface TracedState extends TracedIdentifyableElement, TracedConnectionPoint {
	/**
	 * Returns the value of the '<em><b>Current Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.State_current_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State_current_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Sequence</em>' containment reference list.
	 * @see imlTrace.States.iml.ImlPackage#getTracedState_CurrentSequence()
	 * @see imlTrace.States.State_current_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<State_current_Value> getCurrentSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(State)
	 * @see imlTrace.States.iml.ImlPackage#getTracedState_OriginalObject()
	 * @model
	 * @generated
	 */
	State getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedState#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(State value);

} // TracedState
