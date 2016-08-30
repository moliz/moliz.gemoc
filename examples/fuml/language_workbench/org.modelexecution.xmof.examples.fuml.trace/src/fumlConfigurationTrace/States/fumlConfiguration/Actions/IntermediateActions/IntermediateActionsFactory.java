/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public interface IntermediateActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsFactory eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Add Structural Feature Value Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Add Structural Feature Value Action Activation</em>'.
	 * @generated
	 */
	TracedAddStructuralFeatureValueActionActivation createTracedAddStructuralFeatureValueActionActivation();

	/**
	 * Returns a new object of class '<em>Traced Create Object Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Create Object Action Activation</em>'.
	 * @generated
	 */
	TracedCreateObjectActionActivation createTracedCreateObjectActionActivation();

	/**
	 * Returns a new object of class '<em>Traced Read Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Read Structural Feature Action Activation</em>'.
	 * @generated
	 */
	TracedReadStructuralFeatureActionActivation createTracedReadStructuralFeatureActionActivation();

	/**
	 * Returns a new object of class '<em>Traced Value Specification Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Value Specification Action Activation</em>'.
	 * @generated
	 */
	TracedValueSpecificationActionActivation createTracedValueSpecificationActionActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateActionsPackage getIntermediateActionsPackage();

} //IntermediateActionsFactory
