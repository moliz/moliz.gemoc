/**
 */
package iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifyable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iml.IdentifyableElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see iml.ImlPackage#getIdentifyableElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifyableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see iml.ImlPackage#getIdentifyableElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link iml.IdentifyableElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifyableElement
