/**
 */
package fumlConfigurationFewSteps.InputFewSteps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.InputFewSteps.InputFewStepsPackage
 * @generated
 */
public interface InputFewStepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputFewStepsFactory eINSTANCE = fumlConfigurationFewSteps.InputFewSteps.impl.InputFewStepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Parameter Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter Values</em>'.
	 * @generated
	 */
	InputParameterValues createInputParameterValues();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InputFewStepsPackage getInputFewStepsPackage();

} //InputFewStepsFactory
