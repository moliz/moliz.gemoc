/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.*;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

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
 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage
 * @generated
 */
public class BasicActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicActionsPackage.eINSTANCE;
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION: {
				TracedActionActivation tracedActionActivation = (TracedActionActivation)theEObject;
				T result = caseTracedActionActivation(tracedActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION: {
				TracedCallActionActivation tracedCallActionActivation = (TracedCallActionActivation)theEObject;
				T result = caseTracedCallActionActivation(tracedCallActionActivation);
				if (result == null) result = caseTracedInvocationActionActivation(tracedCallActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedCallActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedCallActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedCallActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION: {
				TracedCallBehaviorActionActivation tracedCallBehaviorActionActivation = (TracedCallBehaviorActionActivation)theEObject;
				T result = caseTracedCallBehaviorActionActivation(tracedCallBehaviorActionActivation);
				if (result == null) result = caseTracedCallActionActivation(tracedCallBehaviorActionActivation);
				if (result == null) result = caseTracedInvocationActionActivation(tracedCallBehaviorActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedCallBehaviorActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedCallBehaviorActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedCallBehaviorActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_INPUT_PIN_ACTIVATION: {
				TracedInputPinActivation tracedInputPinActivation = (TracedInputPinActivation)theEObject;
				T result = caseTracedInputPinActivation(tracedInputPinActivation);
				if (result == null) result = caseTracedPinActivation(tracedInputPinActivation);
				if (result == null) result = caseTracedObjectNodeActivation(tracedInputPinActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedInputPinActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedInputPinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_INVOCATION_ACTION_ACTIVATION: {
				TracedInvocationActionActivation tracedInvocationActionActivation = (TracedInvocationActionActivation)theEObject;
				T result = caseTracedInvocationActionActivation(tracedInvocationActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedInvocationActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedInvocationActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedInvocationActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_OPAQUE_ACTION_ACTIVATION: {
				TracedOpaqueActionActivation tracedOpaqueActionActivation = (TracedOpaqueActionActivation)theEObject;
				T result = caseTracedOpaqueActionActivation(tracedOpaqueActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedOpaqueActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedOpaqueActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedOpaqueActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_OUTPUT_PIN_ACTIVATION: {
				TracedOutputPinActivation tracedOutputPinActivation = (TracedOutputPinActivation)theEObject;
				T result = caseTracedOutputPinActivation(tracedOutputPinActivation);
				if (result == null) result = caseTracedPinActivation(tracedOutputPinActivation);
				if (result == null) result = caseTracedObjectNodeActivation(tracedOutputPinActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedOutputPinActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedOutputPinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.TRACED_PIN_ACTIVATION: {
				TracedPinActivation tracedPinActivation = (TracedPinActivation)theEObject;
				T result = caseTracedPinActivation(tracedPinActivation);
				if (result == null) result = caseTracedObjectNodeActivation(tracedPinActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedPinActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedPinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActionActivation(TracedActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallActionActivation(TracedCallActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Behavior Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Behavior Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallBehaviorActionActivation(TracedCallBehaviorActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Input Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Input Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInputPinActivation(TracedInputPinActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Invocation Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Invocation Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInvocationActionActivation(TracedInvocationActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueActionActivation(TracedOpaqueActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Output Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Output Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOutputPinActivation(TracedOutputPinActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPinActivation(TracedPinActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityNodeActivation(TracedActivityNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObjectNodeActivation(TracedObjectNodeActivation object) {
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

} //BasicActionsSwitch
