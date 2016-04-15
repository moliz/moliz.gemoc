/**
 */
package fumlConfiguration.Actions.IntermediateActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public interface IntermediateActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsFactory eINSTANCE = fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Value Specification Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification Action Activation</em>'.
	 * @generated
	 */
	ValueSpecificationActionActivation createValueSpecificationActionActivation();

	/**
	 * Returns a new object of class '<em>Create Object Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Object Action Activation</em>'.
	 * @generated
	 */
	CreateObjectActionActivation createCreateObjectActionActivation();

	/**
	 * Returns a new object of class '<em>Read Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Structural Feature Action Activation</em>'.
	 * @generated
	 */
	ReadStructuralFeatureActionActivation createReadStructuralFeatureActionActivation();

	/**
	 * Returns a new object of class '<em>Add Structural Feature Value Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Structural Feature Value Action Activation</em>'.
	 * @generated
	 */
	AddStructuralFeatureValueActionActivation createAddStructuralFeatureValueActionActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateActionsPackage getIntermediateActionsPackage();

} //IntermediateActionsFactory
