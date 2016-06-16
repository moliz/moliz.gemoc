/**
 */
package fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.util;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.CompoundValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.ExtensionalValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.StructuredValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.OpaqueBehaviorExecution;

import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.IntegerFunctionsFewStepsPackage
 * @generated
 */
public class IntegerFunctionsFewStepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegerFunctionsFewStepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsFewStepsSwitch() {
		if (modelPackage == null) {
			modelPackage = IntegerFunctionsFewStepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntegerFunctionsFewStepsPackage.INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION: {
				IntegerPlusFunctionBehaviorExecution integerPlusFunctionBehaviorExecution = (IntegerPlusFunctionBehaviorExecution)theEObject;
				T result = caseIntegerPlusFunctionBehaviorExecution(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseOpaqueBehaviorExecution(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseExecution(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseObject(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseExtensionalValue(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseCompoundValue(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseStructuredValue(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseValue(integerPlusFunctionBehaviorExecution);
				if (result == null) result = caseSemanticVisitor(integerPlusFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegerFunctionsFewStepsPackage.INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION: {
				IntegerGreaterFunctionBehaviorExecution integerGreaterFunctionBehaviorExecution = (IntegerGreaterFunctionBehaviorExecution)theEObject;
				T result = caseIntegerGreaterFunctionBehaviorExecution(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseOpaqueBehaviorExecution(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseExecution(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseObject(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseExtensionalValue(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseCompoundValue(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseStructuredValue(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseValue(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseSemanticVisitor(integerGreaterFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegerFunctionsFewStepsPackage.INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION: {
				IntegerLessFunctionBehaviorExecution integerLessFunctionBehaviorExecution = (IntegerLessFunctionBehaviorExecution)theEObject;
				T result = caseIntegerLessFunctionBehaviorExecution(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseOpaqueBehaviorExecution(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseExecution(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseObject(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseExtensionalValue(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseCompoundValue(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseStructuredValue(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseValue(integerLessFunctionBehaviorExecution);
				if (result == null) result = caseSemanticVisitor(integerLessFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Plus Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Plus Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerPlusFunctionBehaviorExecution(IntegerPlusFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Greater Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Greater Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerGreaterFunctionBehaviorExecution(IntegerGreaterFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Less Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Less Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLessFunctionBehaviorExecution(IntegerLessFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticVisitor(SemanticVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredValue(StructuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundValue(CompoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionalValue(ExtensionalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueBehaviorExecution(OpaqueBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntegerFunctionsFewStepsSwitch
