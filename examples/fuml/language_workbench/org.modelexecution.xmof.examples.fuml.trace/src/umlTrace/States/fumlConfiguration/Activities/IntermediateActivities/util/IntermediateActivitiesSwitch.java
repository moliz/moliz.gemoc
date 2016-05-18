/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.*;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

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
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
 * @generated
 */
public class IntermediateActivitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediateActivitiesPackage.eINSTANCE;
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE: {
				TracedActivityEdgeInstance tracedActivityEdgeInstance = (TracedActivityEdgeInstance)theEObject;
				T result = caseTracedActivityEdgeInstance(tracedActivityEdgeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION: {
				TracedActivityExecution tracedActivityExecution = (TracedActivityExecution)theEObject;
				T result = caseTracedActivityExecution(tracedActivityExecution);
				if (result == null) result = caseTracedExecution(tracedActivityExecution);
				if (result == null) result = caseTracedObject(tracedActivityExecution);
				if (result == null) result = caseTracedExtensionalValue(tracedActivityExecution);
				if (result == null) result = caseTracedCompoundValue(tracedActivityExecution);
				if (result == null) result = caseTracedStructuredValue(tracedActivityExecution);
				if (result == null) result = caseTracedValue(tracedActivityExecution);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION: {
				TracedActivityNodeActivation tracedActivityNodeActivation = (TracedActivityNodeActivation)theEObject;
				T result = caseTracedActivityNodeActivation(tracedActivityNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP: {
				TracedActivityNodeActivationGroup tracedActivityNodeActivationGroup = (TracedActivityNodeActivationGroup)theEObject;
				T result = caseTracedActivityNodeActivationGroup(tracedActivityNodeActivationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN: {
				TracedForkedToken tracedForkedToken = (TracedForkedToken)theEObject;
				T result = caseTracedForkedToken(tracedForkedToken);
				if (result == null) result = caseTracedToken(tracedForkedToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION: {
				TracedObjectNodeActivation tracedObjectNodeActivation = (TracedObjectNodeActivation)theEObject;
				T result = caseTracedObjectNodeActivation(tracedObjectNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedObjectNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedObjectNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_OBJECT_TOKEN: {
				TracedObjectToken tracedObjectToken = (TracedObjectToken)theEObject;
				T result = caseTracedObjectToken(tracedObjectToken);
				if (result == null) result = caseTracedToken(tracedObjectToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_OFFER: {
				TracedOffer tracedOffer = (TracedOffer)theEObject;
				T result = caseTracedOffer(tracedOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_TOKEN: {
				TracedToken tracedToken = (TracedToken)theEObject;
				T result = caseTracedToken(tracedToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Edge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Edge Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityEdgeInstance(TracedActivityEdgeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityExecution(TracedActivityExecution object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Node Activation Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Node Activation Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityNodeActivationGroup(TracedActivityNodeActivationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Forked Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedForkedToken(TracedForkedToken object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObjectToken(TracedObjectToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOffer(TracedOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedToken(TracedToken object) {
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

} //IntermediateActivitiesSwitch
