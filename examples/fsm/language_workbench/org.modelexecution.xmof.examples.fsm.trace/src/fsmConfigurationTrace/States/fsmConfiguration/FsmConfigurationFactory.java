/**
 */
package fsmConfigurationTrace.States.fsmConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage
 * @generated
 */
public interface FsmConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationFactory eINSTANCE = fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced FSM Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced FSM Configuration</em>'.
	 * @generated
	 */
	TracedFSMConfiguration createTracedFSMConfiguration();

	/**
	 * Returns a new object of class '<em>Traced Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Input</em>'.
	 * @generated
	 */
	TracedInput createTracedInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FsmConfigurationPackage getFsmConfigurationPackage();

} //FsmConfigurationFactory
