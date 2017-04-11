/**
 */
package fsmConfigurationTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = fsmConfigurationTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fsm Configuration FSM Configuration Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Configuration FSM Configuration Run</em>'.
	 * @generated
	 */
	FsmConfiguration_FSMConfiguration_Run createFsmConfiguration_FSMConfiguration_Run();

	/**
	 * Returns a new object of class '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>'.
	 * @generated
	 */
	FsmConfiguration_FSMConfiguration_Run_ImplicitStep createFsmConfiguration_FSMConfiguration_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Fsm Configuration Transition Configuration Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Configuration Transition Configuration Fire</em>'.
	 * @generated
	 */
	FsmConfiguration_TransitionConfiguration_Fire createFsmConfiguration_TransitionConfiguration_Fire();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Specific Root Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Root Step</em>'.
	 * @generated
	 */
	SpecificRootStep createSpecificRootStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
