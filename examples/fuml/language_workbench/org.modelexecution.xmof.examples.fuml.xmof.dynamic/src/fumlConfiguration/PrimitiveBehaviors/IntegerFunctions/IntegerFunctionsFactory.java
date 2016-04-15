/**
 */
package fumlConfiguration.PrimitiveBehaviors.IntegerFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage
 * @generated
 */
public interface IntegerFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegerFunctionsFactory eINSTANCE = fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integer Plus Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Plus Function Behavior Execution</em>'.
	 * @generated
	 */
	IntegerPlusFunctionBehaviorExecution createIntegerPlusFunctionBehaviorExecution();

	/**
	 * Returns a new object of class '<em>Integer Greater Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Greater Function Behavior Execution</em>'.
	 * @generated
	 */
	IntegerGreaterFunctionBehaviorExecution createIntegerGreaterFunctionBehaviorExecution();

	/**
	 * Returns a new object of class '<em>Integer Less Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Less Function Behavior Execution</em>'.
	 * @generated
	 */
	IntegerLessFunctionBehaviorExecution createIntegerLessFunctionBehaviorExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntegerFunctionsPackage getIntegerFunctionsPackage();

} //IntegerFunctionsFactory
