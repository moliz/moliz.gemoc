/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage
 * @generated
 */
public interface BasicActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActionsFactory eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Call Behavior Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Call Behavior Action Activation</em>'.
	 * @generated
	 */
	TracedCallBehaviorActionActivation createTracedCallBehaviorActionActivation();

	/**
	 * Returns a new object of class '<em>Traced Input Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Input Pin Activation</em>'.
	 * @generated
	 */
	TracedInputPinActivation createTracedInputPinActivation();

	/**
	 * Returns a new object of class '<em>Traced Opaque Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Opaque Action Activation</em>'.
	 * @generated
	 */
	TracedOpaqueActionActivation createTracedOpaqueActionActivation();

	/**
	 * Returns a new object of class '<em>Traced Output Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Output Pin Activation</em>'.
	 * @generated
	 */
	TracedOutputPinActivation createTracedOutputPinActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicActionsPackage getBasicActionsPackage();

} //BasicActionsFactory
