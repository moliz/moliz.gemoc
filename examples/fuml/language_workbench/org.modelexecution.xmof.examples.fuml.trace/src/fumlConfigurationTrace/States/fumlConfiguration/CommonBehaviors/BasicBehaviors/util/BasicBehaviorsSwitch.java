/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.util;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.*;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage
 * @generated
 */
public class BasicBehaviorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicBehaviorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicBehaviorsPackage.eINSTANCE;
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
			case BasicBehaviorsPackage.TRACED_EXECUTION: {
				TracedExecution tracedExecution = (TracedExecution)theEObject;
				T result = caseTracedExecution(tracedExecution);
				if (result == null) result = caseTracedObject(tracedExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedExecution);
				if (result == null) result = caseTracedCompoundValue(tracedExecution);
				if (result == null) result = caseTracedStructuredValue(tracedExecution);
				if (result == null) result = caseTracedValue(tracedExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicBehaviorsPackage.TRACED_OPAQUE_BEHAVIOR_EXECUTION: {
				TracedOpaqueBehaviorExecution tracedOpaqueBehaviorExecution = (TracedOpaqueBehaviorExecution)theEObject;
				T result = caseTracedOpaqueBehaviorExecution(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedExecution(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedObject(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedCompoundValue(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedStructuredValue(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedValue(tracedOpaqueBehaviorExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedOpaqueBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE: {
				TracedParameterValue tracedParameterValue = (TracedParameterValue)theEObject;
				T result = caseTracedParameterValue(tracedParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedParameterValue(TracedParameterValue object) {
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

} //BasicBehaviorsSwitch
