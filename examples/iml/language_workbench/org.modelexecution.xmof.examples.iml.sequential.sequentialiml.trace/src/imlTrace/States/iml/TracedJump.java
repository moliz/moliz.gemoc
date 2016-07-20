/**
 */
package imlTrace.States.iml;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedJump#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedJump()
 * @model
 * @generated
 */
public interface TracedJump extends TracedIdentifyableElement, TracedConnectionPoint {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Jump)
	 * @see imlTrace.States.iml.ImlPackage#getTracedJump_OriginalObject()
	 * @model
	 * @generated
	 */
	Jump getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedJump#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Jump value);

} // TracedJump
