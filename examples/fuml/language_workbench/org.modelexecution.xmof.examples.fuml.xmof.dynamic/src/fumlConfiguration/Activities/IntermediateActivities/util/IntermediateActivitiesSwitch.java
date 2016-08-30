/**
 */
package fumlConfiguration.Activities.IntermediateActivities.util;

import fumlConfiguration.Activities.IntermediateActivities.*;

import fumlConfiguration.Classes.Kernel.CompoundValue;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;

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
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION: {
				ActivityExecution activityExecution = (ActivityExecution)theEObject;
				T result = caseActivityExecution(activityExecution);
				if (result == null) result = caseExecution(activityExecution);
				if (result == null) result = caseObject(activityExecution);
				if (result == null) result = caseExtensionalValue(activityExecution);
				if (result == null) result = caseCompoundValue(activityExecution);
				if (result == null) result = caseStructuredValue(activityExecution);
				if (result == null) result = caseValue(activityExecution);
				if (result == null) result = caseSemanticVisitor(activityExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP: {
				ActivityNodeActivationGroup activityNodeActivationGroup = (ActivityNodeActivationGroup)theEObject;
				T result = caseActivityNodeActivationGroup(activityNodeActivationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.ACTIVITY_PARAMETER_NODE_ACTIVATION: {
				ActivityParameterNodeActivation activityParameterNodeActivation = (ActivityParameterNodeActivation)theEObject;
				T result = caseActivityParameterNodeActivation(activityParameterNodeActivation);
				if (result == null) result = caseObjectNodeActivation(activityParameterNodeActivation);
				if (result == null) result = caseActivityNodeActivation(activityParameterNodeActivation);
				if (result == null) result = caseSemanticVisitor(activityParameterNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION: {
				ActivityNodeActivation activityNodeActivation = (ActivityNodeActivation)theEObject;
				T result = caseActivityNodeActivation(activityNodeActivation);
				if (result == null) result = caseSemanticVisitor(activityNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE: {
				ActivityEdgeInstance activityEdgeInstance = (ActivityEdgeInstance)theEObject;
				T result = caseActivityEdgeInstance(activityEdgeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.CONTROL_NODE_ACTIVATION: {
				ControlNodeActivation controlNodeActivation = (ControlNodeActivation)theEObject;
				T result = caseControlNodeActivation(controlNodeActivation);
				if (result == null) result = caseActivityNodeActivation(controlNodeActivation);
				if (result == null) result = caseSemanticVisitor(controlNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION: {
				ObjectNodeActivation objectNodeActivation = (ObjectNodeActivation)theEObject;
				T result = caseObjectNodeActivation(objectNodeActivation);
				if (result == null) result = caseActivityNodeActivation(objectNodeActivation);
				if (result == null) result = caseSemanticVisitor(objectNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.OFFER: {
				Offer offer = (Offer)theEObject;
				T result = caseOffer(offer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION: {
				DecisionNodeActivation decisionNodeActivation = (DecisionNodeActivation)theEObject;
				T result = caseDecisionNodeActivation(decisionNodeActivation);
				if (result == null) result = caseControlNodeActivation(decisionNodeActivation);
				if (result == null) result = caseActivityNodeActivation(decisionNodeActivation);
				if (result == null) result = caseSemanticVisitor(decisionNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.CONTROL_TOKEN: {
				ControlToken controlToken = (ControlToken)theEObject;
				T result = caseControlToken(controlToken);
				if (result == null) result = caseToken(controlToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.OBJECT_TOKEN: {
				ObjectToken objectToken = (ObjectToken)theEObject;
				T result = caseObjectToken(objectToken);
				if (result == null) result = caseToken(objectToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.FORKED_TOKEN: {
				ForkedToken forkedToken = (ForkedToken)theEObject;
				T result = caseForkedToken(forkedToken);
				if (result == null) result = caseToken(forkedToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.INITIAL_NODE_ACTIVATION: {
				InitialNodeActivation initialNodeActivation = (InitialNodeActivation)theEObject;
				T result = caseInitialNodeActivation(initialNodeActivation);
				if (result == null) result = caseControlNodeActivation(initialNodeActivation);
				if (result == null) result = caseActivityNodeActivation(initialNodeActivation);
				if (result == null) result = caseSemanticVisitor(initialNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.MERGE_NODE_ACTIVATION: {
				MergeNodeActivation mergeNodeActivation = (MergeNodeActivation)theEObject;
				T result = caseMergeNodeActivation(mergeNodeActivation);
				if (result == null) result = caseControlNodeActivation(mergeNodeActivation);
				if (result == null) result = caseActivityNodeActivation(mergeNodeActivation);
				if (result == null) result = caseSemanticVisitor(mergeNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.JOIN_NODE_ACTIVATION: {
				JoinNodeActivation joinNodeActivation = (JoinNodeActivation)theEObject;
				T result = caseJoinNodeActivation(joinNodeActivation);
				if (result == null) result = caseControlNodeActivation(joinNodeActivation);
				if (result == null) result = caseActivityNodeActivation(joinNodeActivation);
				if (result == null) result = caseSemanticVisitor(joinNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.FORK_NODE_ACTIVATION: {
				ForkNodeActivation forkNodeActivation = (ForkNodeActivation)theEObject;
				T result = caseForkNodeActivation(forkNodeActivation);
				if (result == null) result = caseControlNodeActivation(forkNodeActivation);
				if (result == null) result = caseActivityNodeActivation(forkNodeActivation);
				if (result == null) result = caseSemanticVisitor(forkNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.ACTIVITY_FINAL_NODE_ACTIVATION: {
				ActivityFinalNodeActivation activityFinalNodeActivation = (ActivityFinalNodeActivation)theEObject;
				T result = caseActivityFinalNodeActivation(activityFinalNodeActivation);
				if (result == null) result = caseControlNodeActivation(activityFinalNodeActivation);
				if (result == null) result = caseActivityNodeActivation(activityFinalNodeActivation);
				if (result == null) result = caseSemanticVisitor(activityFinalNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExecution(ActivityExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivationGroup(ActivityNodeActivationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNodeActivation(ActivityParameterNodeActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeInstance(ActivityEdgeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNodeActivation(ControlNodeActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer(Offer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNodeActivation(DecisionNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlToken(ControlToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectToken(ObjectToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken(ForkedToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNodeActivation(InitialNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNodeActivation(MergeNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNodeActivation(JoinNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNodeActivation(ForkNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNodeActivation(ActivityFinalNodeActivation object) {
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
	public T caseObject(fumlConfiguration.Classes.Kernel.Object object) {
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
