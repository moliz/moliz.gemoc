/**
 */
package iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iml.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link iml.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see iml.ImlPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends IdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectionPoint)
	 * @see iml.ImlPackage#getConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	ConnectionPoint getSource();

	/**
	 * Sets the value of the '{@link iml.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectionPoint)
	 * @see iml.ImlPackage#getConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	ConnectionPoint getTarget();

	/**
	 * Sets the value of the '{@link iml.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectionPoint value);

} // Connection
