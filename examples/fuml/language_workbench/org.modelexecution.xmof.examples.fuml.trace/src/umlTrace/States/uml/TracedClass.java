/**
 */
package umlTrace.States.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.uml.TracedClass#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.uml.UmlPackage#getTracedClass()
 * @model
 * @generated
 */
public interface TracedClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(org.eclipse.uml2.uml.Class)
	 * @see umlTrace.States.uml.UmlPackage#getTracedClass_OriginalObject()
	 * @model
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.uml.TracedClass#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(org.eclipse.uml2.uml.Class value);

} // TracedClass
