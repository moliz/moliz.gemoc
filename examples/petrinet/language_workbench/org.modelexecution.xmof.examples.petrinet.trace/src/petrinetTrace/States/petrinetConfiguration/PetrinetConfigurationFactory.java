/**
 */
package petrinetTrace.States.petrinetConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage
 * @generated
 */
public interface PetrinetConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetConfigurationFactory eINSTANCE = petrinetTrace.States.petrinetConfiguration.impl.PetrinetConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Place Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Place Configuration</em>'.
	 * @generated
	 */
	TracedPlaceConfiguration createTracedPlaceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetrinetConfigurationPackage getPetrinetConfigurationPackage();

} //PetrinetConfigurationFactory
