/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage
 * @generated
 */
public interface KernelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelFactory eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Boolean Value</em>'.
	 * @generated
	 */
	TracedBooleanValue createTracedBooleanValue();

	/**
	 * Returns a new object of class '<em>Traced Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Integer Value</em>'.
	 * @generated
	 */
	TracedIntegerValue createTracedIntegerValue();

	/**
	 * Returns a new object of class '<em>Traced Literal Boolean Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Literal Boolean Evaluation</em>'.
	 * @generated
	 */
	TracedLiteralBooleanEvaluation createTracedLiteralBooleanEvaluation();

	/**
	 * Returns a new object of class '<em>Traced Literal Integer Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Literal Integer Evaluation</em>'.
	 * @generated
	 */
	TracedLiteralIntegerEvaluation createTracedLiteralIntegerEvaluation();

	/**
	 * Returns a new object of class '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Object</em>'.
	 * @generated
	 */
	TracedObject createTracedObject();

	/**
	 * Returns a new object of class '<em>Traced Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Reference</em>'.
	 * @generated
	 */
	TracedReference createTracedReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KernelPackage getKernelPackage();

} //KernelFactory
