/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.*;

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
public class IntegerFunctionsFactoryImpl extends EFactoryImpl implements IntegerFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegerFunctionsFactory init() {
		try {
			IntegerFunctionsFactory theIntegerFunctionsFactory = (IntegerFunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(IntegerFunctionsPackage.eNS_URI);
			if (theIntegerFunctionsFactory != null) {
				return theIntegerFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegerFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsFactoryImpl() {
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
			case IntegerFunctionsPackage.TRACED_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION: return createTracedIntegerGreaterFunctionBehaviorExecution();
			case IntegerFunctionsPackage.TRACED_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION: return createTracedIntegerLessFunctionBehaviorExecution();
			case IntegerFunctionsPackage.TRACED_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION: return createTracedIntegerPlusFunctionBehaviorExecution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerGreaterFunctionBehaviorExecution createTracedIntegerGreaterFunctionBehaviorExecution() {
		TracedIntegerGreaterFunctionBehaviorExecutionImpl tracedIntegerGreaterFunctionBehaviorExecution = new TracedIntegerGreaterFunctionBehaviorExecutionImpl();
		return tracedIntegerGreaterFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerLessFunctionBehaviorExecution createTracedIntegerLessFunctionBehaviorExecution() {
		TracedIntegerLessFunctionBehaviorExecutionImpl tracedIntegerLessFunctionBehaviorExecution = new TracedIntegerLessFunctionBehaviorExecutionImpl();
		return tracedIntegerLessFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerPlusFunctionBehaviorExecution createTracedIntegerPlusFunctionBehaviorExecution() {
		TracedIntegerPlusFunctionBehaviorExecutionImpl tracedIntegerPlusFunctionBehaviorExecution = new TracedIntegerPlusFunctionBehaviorExecutionImpl();
		return tracedIntegerPlusFunctionBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsPackage getIntegerFunctionsPackage() {
		return (IntegerFunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegerFunctionsPackage getPackage() {
		return IntegerFunctionsPackage.eINSTANCE;
	}

} //IntegerFunctionsFactoryImpl
