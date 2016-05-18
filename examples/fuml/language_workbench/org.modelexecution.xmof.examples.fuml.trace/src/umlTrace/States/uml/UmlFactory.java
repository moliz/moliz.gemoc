/**
 */
package umlTrace.States.uml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.uml.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlFactory eINSTANCE = umlTrace.States.uml.impl.UmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Class</em>'.
	 * @generated
	 */
	TracedClass createTracedClass();

	/**
	 * Returns a new object of class '<em>Traced Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Parameter</em>'.
	 * @generated
	 */
	TracedParameter createTracedParameter();

	/**
	 * Returns a new object of class '<em>Traced Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Primitive Type</em>'.
	 * @generated
	 */
	TracedPrimitiveType createTracedPrimitiveType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UmlPackage getUmlPackage();

} //UmlFactory
