/**
 */
package xmofxdsml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xmofxdsml.XmofxdsmlPackage
 * @generated
 */
public interface XmofxdsmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmofxdsmlFactory eINSTANCE = xmofxdsml.impl.XmofxdsmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XMOF Language Definiton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMOF Language Definiton</em>'.
	 * @generated
	 */
	XMOFLanguageDefiniton createXMOFLanguageDefiniton();

	/**
	 * Returns a new object of class '<em>XMF File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMF File</em>'.
	 * @generated
	 */
	XMFFile createXMFFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmofxdsmlPackage getXmofxdsmlPackage();

} //XmofxdsmlFactory
