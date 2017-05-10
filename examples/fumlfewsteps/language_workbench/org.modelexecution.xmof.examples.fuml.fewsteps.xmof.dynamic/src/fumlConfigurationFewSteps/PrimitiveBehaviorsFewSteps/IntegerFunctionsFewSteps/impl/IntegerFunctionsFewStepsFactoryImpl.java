/**
 */
package fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.impl;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerFunctionsFewStepsFactoryImpl extends EFactoryImpl implements IntegerFunctionsFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegerFunctionsFewStepsFactory init() {
		try {
			IntegerFunctionsFewStepsFactory theIntegerFunctionsFewStepsFactory = (IntegerFunctionsFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(IntegerFunctionsFewStepsPackage.eNS_URI);
			if (theIntegerFunctionsFewStepsFactory != null) {
				return theIntegerFunctionsFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegerFunctionsFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsFewStepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntegerFunctionsFewStepsPackage.INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION: return createIntegerPlusFunctionBehaviorExecution();
			case IntegerFunctionsFewStepsPackage.INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION: return createIntegerGreaterFunctionBehaviorExecution();
			case IntegerFunctionsFewStepsPackage.INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION: return createIntegerLessFunctionBehaviorExecution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerPlusFunctionBehaviorExecution createIntegerPlusFunctionBehaviorExecution() {
		IntegerPlusFunctionBehaviorExecutionImpl integerPlusFunctionBehaviorExecution = new IntegerPlusFunctionBehaviorExecutionImpl();
		return integerPlusFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerGreaterFunctionBehaviorExecution createIntegerGreaterFunctionBehaviorExecution() {
		IntegerGreaterFunctionBehaviorExecutionImpl integerGreaterFunctionBehaviorExecution = new IntegerGreaterFunctionBehaviorExecutionImpl();
		return integerGreaterFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLessFunctionBehaviorExecution createIntegerLessFunctionBehaviorExecution() {
		IntegerLessFunctionBehaviorExecutionImpl integerLessFunctionBehaviorExecution = new IntegerLessFunctionBehaviorExecutionImpl();
		return integerLessFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsFewStepsPackage getIntegerFunctionsFewStepsPackage() {
		return (IntegerFunctionsFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegerFunctionsFewStepsPackage getPackage() {
		return IntegerFunctionsFewStepsPackage.eINSTANCE;
	}

} //IntegerFunctionsFewStepsFactoryImpl
