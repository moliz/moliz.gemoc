/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.util;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.*;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_FINAL_NODE_ACTIVATION: {
				TracedActivityFinalNodeActivation tracedActivityFinalNodeActivation = (TracedActivityFinalNodeActivation)theEObject;
				T result = caseTracedActivityFinalNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityFinalNodeActivation);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATION: {
				TracedActivityParameterNodeActivation tracedActivityParameterNodeActivation = (TracedActivityParameterNodeActivation)theEObject;
				T result = caseTracedActivityParameterNodeActivation(tracedActivityParameterNodeActivation);
				if (result == null) result = caseTracedObjectNodeActivation(tracedActivityParameterNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedActivityParameterNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityParameterNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_CONTROL_NODE_ACTIVATION: {
				TracedControlNodeActivation tracedControlNodeActivation = (TracedControlNodeActivation)theEObject;
				T result = caseTracedControlNodeActivation(tracedControlNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedControlNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedControlNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_CONTROL_TOKEN: {
				TracedControlToken tracedControlToken = (TracedControlToken)theEObject;
				T result = caseTracedControlToken(tracedControlToken);
				if (result == null) result = caseTracedToken(tracedControlToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_DECISION_NODE_ACTIVATION: {
				TracedDecisionNodeActivation tracedDecisionNodeActivation = (TracedDecisionNodeActivation)theEObject;
				T result = caseTracedDecisionNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedDecisionNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_FORK_NODE_ACTIVATION: {
				TracedForkNodeActivation tracedForkNodeActivation = (TracedForkNodeActivation)theEObject;
				T result = caseTracedForkNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedForkNodeActivation);
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
			case IntermediateActivitiesPackage.TRACED_INITIAL_NODE_ACTIVATION: {
				TracedInitialNodeActivation tracedInitialNodeActivation = (TracedInitialNodeActivation)theEObject;
				T result = caseTracedInitialNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedInitialNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_JOIN_NODE_ACTIVATION: {
				TracedJoinNodeActivation tracedJoinNodeActivation = (TracedJoinNodeActivation)theEObject;
				T result = caseTracedJoinNodeActivation(tracedJoinNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedJoinNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedJoinNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedJoinNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesPackage.TRACED_MERGE_NODE_ACTIVATION: {
				TracedMergeNodeActivation tracedMergeNodeActivation = (TracedMergeNodeActivation)theEObject;
				T result = caseTracedMergeNodeActivation(tracedMergeNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedMergeNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedMergeNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedMergeNodeActivation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Final Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Final Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityFinalNodeActivation(TracedActivityFinalNodeActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Parameter Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Parameter Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityParameterNodeActivation(TracedActivityParameterNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlNodeActivation(TracedControlNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlToken(TracedControlToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Decision Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Decision Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDecisionNodeActivation(TracedDecisionNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Fork Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Fork Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedForkNodeActivation(TracedForkNodeActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Initial Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Initial Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInitialNodeActivation(TracedInitialNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Join Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Join Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedJoinNodeActivation(TracedJoinNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Merge Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Merge Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMergeNodeActivation(TracedMergeNodeActivation object) {
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
