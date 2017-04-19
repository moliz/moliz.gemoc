/**
 */
package fsmConfigurationTrace.States.fsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.States.fsm.FsmPackage
 * @generated
 */
public interface FsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmFactory eINSTANCE = fsmConfigurationTrace.States.fsm.impl.FsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced FSM</em>'.
	 * @generated
	 */
	TracedFSM createTracedFSM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FsmPackage getFsmPackage();

} //FsmFactory
