/**
 */
package fumlConfigurationFewStepsTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewStepsTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = fumlConfigurationFewStepsTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Activation firing Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Activation firing Value</em>'.
	 * @generated
	 */
	ActionActivation_firing_Value createActionActivation_firing_Value();

	/**
	 * Returns a new object of class '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * @generated
	 */
	SemanticVisitor_runtimeModelElement_Value createSemanticVisitor_runtimeModelElement_Value();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
