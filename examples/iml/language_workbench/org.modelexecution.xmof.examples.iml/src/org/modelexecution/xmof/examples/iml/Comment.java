/**
 */
package org.modelexecution.xmof.examples.iml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Comment#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getComment_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Comment#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Comment
