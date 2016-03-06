/**
 */
package xmofxdsml;

import org.gemoc.executionframework.xdsml_base.LanguageDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMOF Language Definiton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmofxdsml.XMOFLanguageDefiniton#getXmofFileName <em>Xmof File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmofxdsml.XmofxdsmlPackage#getXMOFLanguageDefiniton()
 * @model
 * @generated
 */
public interface XMOFLanguageDefiniton extends LanguageDefinition {
	/**
	 * Returns the value of the '<em><b>Xmof File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmof File Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmof File Name</em>' containment reference.
	 * @see #setXmofFileName(XMFFile)
	 * @see xmofxdsml.XmofxdsmlPackage#getXMOFLanguageDefiniton_XmofFileName()
	 * @model containment="true"
	 * @generated
	 */
	XMFFile getXmofFileName();

	/**
	 * Sets the value of the '{@link xmofxdsml.XMOFLanguageDefiniton#getXmofFileName <em>Xmof File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmof File Name</em>' containment reference.
	 * @see #getXmofFileName()
	 * @generated
	 */
	void setXmofFileName(XMFFile value);

} // XMOFLanguageDefiniton
