/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage
 * @generated
 */
public interface BasicActionsFewStepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActionsFewStepsFactory eINSTANCE = fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pin Activation</em>'.
	 * @generated
	 */
	InputPinActivation createInputPinActivation();

	/**
	 * Returns a new object of class '<em>Opaque Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action Activation</em>'.
	 * @generated
	 */
	OpaqueActionActivation createOpaqueActionActivation();

	/**
	 * Returns a new object of class '<em>Output Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pin Activation</em>'.
	 * @generated
	 */
	OutputPinActivation createOutputPinActivation();

	/**
	 * Returns a new object of class '<em>Call Behavior Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Behavior Action Activation</em>'.
	 * @generated
	 */
	CallBehaviorActionActivation createCallBehaviorActionActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicActionsFewStepsPackage getBasicActionsFewStepsPackage();

} //BasicActionsFewStepsFactory
