/**
 */
package petrinet2Configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage
 * @generated
 */
public interface Petrinet2ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinet2ConfigurationFactory eINSTANCE = petrinet2Configuration.impl.Petrinet2ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Net Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Configuration</em>'.
	 * @generated
	 */
	NetConfiguration createNetConfiguration();

	/**
	 * Returns a new object of class '<em>Place Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Configuration</em>'.
	 * @generated
	 */
	PlaceConfiguration createPlaceConfiguration();

	/**
	 * Returns a new object of class '<em>Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Configuration</em>'.
	 * @generated
	 */
	TransitionConfiguration createTransitionConfiguration();

	/**
	 * Returns a new object of class '<em>Token Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Distribution</em>'.
	 * @generated
	 */
	TokenDistribution createTokenDistribution();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Petrinet2ConfigurationPackage getPetrinet2ConfigurationPackage();

} //Petrinet2ConfigurationFactory
