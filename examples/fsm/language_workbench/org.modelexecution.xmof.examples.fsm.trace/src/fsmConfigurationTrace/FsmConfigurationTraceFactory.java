/**
 */
package fsmConfigurationTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.FsmConfigurationTracePackage
 * @generated
 */
public interface FsmConfigurationTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationTraceFactory eINSTANCE = fsmConfigurationTrace.impl.FsmConfigurationTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specific Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Trace</em>'.
	 * @generated
	 */
	SpecificTrace createSpecificTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FsmConfigurationTracePackage getFsmConfigurationTracePackage();

} //FsmConfigurationTraceFactory
