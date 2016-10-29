/**
 */
package petrinetConfigurationTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetConfigurationTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = petrinetConfigurationTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petrinet Configuration Net Configuration Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Configuration Net Configuration Main</em>'.
	 * @generated
	 */
	PetrinetConfiguration_NetConfiguration_Main createPetrinetConfiguration_NetConfiguration_Main();

	/**
	 * Returns a new object of class '<em>Petrinet Configuration Net Configuration Main Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Configuration Net Configuration Main Implicit Step</em>'.
	 * @generated
	 */
	PetrinetConfiguration_NetConfiguration_Main_ImplicitStep createPetrinetConfiguration_NetConfiguration_Main_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Configuration Net Configuration Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Configuration Net Configuration Run</em>'.
	 * @generated
	 */
	PetrinetConfiguration_NetConfiguration_Run createPetrinetConfiguration_NetConfiguration_Run();

	/**
	 * Returns a new object of class '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>'.
	 * @generated
	 */
	PetrinetConfiguration_NetConfiguration_Run_ImplicitStep createPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Configuration Transition Configuration Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Configuration Transition Configuration Fire</em>'.
	 * @generated
	 */
	PetrinetConfiguration_TransitionConfiguration_Fire createPetrinetConfiguration_TransitionConfiguration_Fire();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
