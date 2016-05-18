/**
 */
package umlTrace.States.fumlConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.FumlConfigurationPackage
 * @generated
 */
public interface FumlConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FumlConfigurationFactory eINSTANCE = umlTrace.States.fumlConfiguration.impl.FumlConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Element Configuration</em>'.
	 * @generated
	 */
	TracedElementConfiguration createTracedElementConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FumlConfigurationPackage getFumlConfigurationPackage();

} //FumlConfigurationFactory
