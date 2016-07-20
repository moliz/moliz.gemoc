/**
 */
package imlTrace.States.iml;

import imlTrace.States.Activity_current_Value;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedActivity#getCurrentSequence <em>Current Sequence</em>}</li>
 *   <li>{@link imlTrace.States.iml.TracedActivity#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedActivity()
 * @model
 * @generated
 */
public interface TracedActivity extends TracedIdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Current Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.Activity_current_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.Activity_current_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Sequence</em>' containment reference list.
	 * @see imlTrace.States.iml.ImlPackage#getTracedActivity_CurrentSequence()
	 * @see imlTrace.States.Activity_current_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_current_Value> getCurrentSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Activity)
	 * @see imlTrace.States.iml.ImlPackage#getTracedActivity_OriginalObject()
	 * @model
	 * @generated
	 */
	Activity getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedActivity#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Activity value);

} // TracedActivity
