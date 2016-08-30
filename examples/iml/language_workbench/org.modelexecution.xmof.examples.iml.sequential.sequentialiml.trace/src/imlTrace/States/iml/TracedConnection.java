/**
 */
package imlTrace.States.iml;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedConnection#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedConnection()
 * @model
 * @generated
 */
public interface TracedConnection extends TracedIdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Connection)
	 * @see imlTrace.States.iml.ImlPackage#getTracedConnection_OriginalObject()
	 * @model
	 * @generated
	 */
	Connection getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedConnection#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Connection value);

} // TracedConnection
