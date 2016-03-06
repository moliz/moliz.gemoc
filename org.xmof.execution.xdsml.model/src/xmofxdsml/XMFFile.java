/**
 */
package xmofxdsml;

import org.gemoc.executionframework.xdsml_base.ProjectResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMF File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmofxdsml.XMFFile#getXmofFileName <em>Xmof File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmofxdsml.XmofxdsmlPackage#getXMFFile()
 * @model
 * @generated
 */
public interface XMFFile extends ProjectResource {
	/**
	 * Returns the value of the '<em><b>Xmof File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmof File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmof File Name</em>' attribute.
	 * @see #setXmofFileName(String)
	 * @see xmofxdsml.XmofxdsmlPackage#getXMFFile_XmofFileName()
	 * @model
	 * @generated
	 */
	String getXmofFileName();

	/**
	 * Sets the value of the '{@link xmofxdsml.XMFFile#getXmofFileName <em>Xmof File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmof File Name</em>' attribute.
	 * @see #getXmofFileName()
	 * @generated
	 */
	void setXmofFileName(String value);

} // XMFFile
