/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.util;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;
import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.*;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage
 * @generated
 */
public class IntegerFunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegerFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = IntegerFunctionsPackage.eINSTANCE;
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
			case IntegerFunctionsPackage.TRACED_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION: {
				TracedIntegerGreaterFunctionBehaviorExecution tracedIntegerGreaterFunctionBehaviorExecution = (TracedIntegerGreaterFunctionBehaviorExecution)theEObject;
				T result = caseTracedIntegerGreaterFunctionBehaviorExecution(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedOpaqueBehaviorExecution(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedExecution(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedObject(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedCompoundValue(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedStructuredValue(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedValue(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedIntegerGreaterFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegerFunctionsPackage.TRACED_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION: {
				TracedIntegerLessFunctionBehaviorExecution tracedIntegerLessFunctionBehaviorExecution = (TracedIntegerLessFunctionBehaviorExecution)theEObject;
				T result = caseTracedIntegerLessFunctionBehaviorExecution(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedOpaqueBehaviorExecution(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedExecution(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedObject(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedCompoundValue(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedStructuredValue(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedValue(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedIntegerLessFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegerFunctionsPackage.TRACED_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION: {
				TracedIntegerPlusFunctionBehaviorExecution tracedIntegerPlusFunctionBehaviorExecution = (TracedIntegerPlusFunctionBehaviorExecution)theEObject;
				T result = caseTracedIntegerPlusFunctionBehaviorExecution(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedOpaqueBehaviorExecution(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedExecution(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedObject(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedCompoundValue(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedStructuredValue(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedValue(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedIntegerPlusFunctionBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Greater Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Greater Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerGreaterFunctionBehaviorExecution(TracedIntegerGreaterFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Less Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Less Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerLessFunctionBehaviorExecution(TracedIntegerLessFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Plus Function Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Plus Function Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerPlusFunctionBehaviorExecution(TracedIntegerPlusFunctionBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Semantic Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSemanticVisitor(TracedSemanticVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValue(TracedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structured Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuredValue(TracedStructuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Compound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Compound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCompoundValue(TracedCompoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extensional Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extensional Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtensionalValue(TracedExtensionalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObject(TracedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExecution(TracedExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueBehaviorExecution(TracedOpaqueBehaviorExecution object) {
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

} //IntegerFunctionsSwitch
