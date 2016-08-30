/**
 */
package fumlConfiguration.Actions.BasicActions.util;

import fumlConfiguration.Actions.BasicActions.*;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;
import fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation;

import fumlConfiguration.Loci.SemanticVisitor;

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
 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage
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
			case BasicActionsPackage.ACTION_ACTIVATION: {
				ActionActivation actionActivation = (ActionActivation)theEObject;
				T result = caseActionActivation(actionActivation);
				if (result == null) result = caseActivityNodeActivation(actionActivation);
				if (result == null) result = caseSemanticVisitor(actionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.PIN_ACTIVATION: {
				PinActivation pinActivation = (PinActivation)theEObject;
				T result = casePinActivation(pinActivation);
				if (result == null) result = caseObjectNodeActivation(pinActivation);
				if (result == null) result = caseActivityNodeActivation(pinActivation);
				if (result == null) result = caseSemanticVisitor(pinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.INPUT_PIN_ACTIVATION: {
				InputPinActivation inputPinActivation = (InputPinActivation)theEObject;
				T result = caseInputPinActivation(inputPinActivation);
				if (result == null) result = casePinActivation(inputPinActivation);
				if (result == null) result = caseObjectNodeActivation(inputPinActivation);
				if (result == null) result = caseActivityNodeActivation(inputPinActivation);
				if (result == null) result = caseSemanticVisitor(inputPinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.OPAQUE_ACTION_ACTIVATION: {
				OpaqueActionActivation opaqueActionActivation = (OpaqueActionActivation)theEObject;
				T result = caseOpaqueActionActivation(opaqueActionActivation);
				if (result == null) result = caseActionActivation(opaqueActionActivation);
				if (result == null) result = caseActivityNodeActivation(opaqueActionActivation);
				if (result == null) result = caseSemanticVisitor(opaqueActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.OUTPUT_PIN_ACTIVATION: {
				OutputPinActivation outputPinActivation = (OutputPinActivation)theEObject;
				T result = caseOutputPinActivation(outputPinActivation);
				if (result == null) result = casePinActivation(outputPinActivation);
				if (result == null) result = caseObjectNodeActivation(outputPinActivation);
				if (result == null) result = caseActivityNodeActivation(outputPinActivation);
				if (result == null) result = caseSemanticVisitor(outputPinActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.CALL_ACTION_ACTIVATION: {
				CallActionActivation callActionActivation = (CallActionActivation)theEObject;
				T result = caseCallActionActivation(callActionActivation);
				if (result == null) result = caseInvocationActionActivation(callActionActivation);
				if (result == null) result = caseActionActivation(callActionActivation);
				if (result == null) result = caseActivityNodeActivation(callActionActivation);
				if (result == null) result = caseSemanticVisitor(callActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.INVOCATION_ACTION_ACTIVATION: {
				InvocationActionActivation invocationActionActivation = (InvocationActionActivation)theEObject;
				T result = caseInvocationActionActivation(invocationActionActivation);
				if (result == null) result = caseActionActivation(invocationActionActivation);
				if (result == null) result = caseActivityNodeActivation(invocationActionActivation);
				if (result == null) result = caseSemanticVisitor(invocationActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActionsPackage.CALL_BEHAVIOR_ACTION_ACTIVATION: {
				CallBehaviorActionActivation callBehaviorActionActivation = (CallBehaviorActionActivation)theEObject;
				T result = caseCallBehaviorActionActivation(callBehaviorActionActivation);
				if (result == null) result = caseCallActionActivation(callBehaviorActionActivation);
				if (result == null) result = caseInvocationActionActivation(callBehaviorActionActivation);
				if (result == null) result = caseActionActivation(callBehaviorActionActivation);
				if (result == null) result = caseActivityNodeActivation(callBehaviorActionActivation);
				if (result == null) result = caseSemanticVisitor(callBehaviorActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionActivation(ActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinActivation(PinActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPinActivation(InputPinActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueActionActivation(OpaqueActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPinActivation(OutputPinActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallActionActivation(CallActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationActionActivation(InvocationActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorActionActivation(CallBehaviorActionActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation(ActivityNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNodeActivation(ObjectNodeActivation object) {
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
