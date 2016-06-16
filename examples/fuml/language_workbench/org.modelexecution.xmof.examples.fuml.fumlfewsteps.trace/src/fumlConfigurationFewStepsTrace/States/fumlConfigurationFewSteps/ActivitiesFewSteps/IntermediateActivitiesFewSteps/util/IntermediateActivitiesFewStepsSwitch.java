/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.util;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.*;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor;

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
 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage
 * @generated
 */
public class IntermediateActivitiesFewStepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActivitiesFewStepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFewStepsSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediateActivitiesFewStepsPackage.eINSTANCE;
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
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_EDGE_INSTANCE: {
				TracedActivityEdgeInstance tracedActivityEdgeInstance = (TracedActivityEdgeInstance)theEObject;
				T result = caseTracedActivityEdgeInstance(tracedActivityEdgeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_FINAL_NODE_ACTIVATION: {
				TracedActivityFinalNodeActivation tracedActivityFinalNodeActivation = (TracedActivityFinalNodeActivation)theEObject;
				T result = caseTracedActivityFinalNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedActivityFinalNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityFinalNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION: {
				TracedActivityNodeActivation tracedActivityNodeActivation = (TracedActivityNodeActivation)theEObject;
				T result = caseTracedActivityNodeActivation(tracedActivityNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedActivityNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATION: {
				TracedActivityParameterNodeActivation tracedActivityParameterNodeActivation = (TracedActivityParameterNodeActivation)theEObject;
				T result = caseTracedActivityParameterNodeActivation(tracedActivityParameterNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_CONTROL_NODE_ACTIVATION: {
				TracedControlNodeActivation tracedControlNodeActivation = (TracedControlNodeActivation)theEObject;
				T result = caseTracedControlNodeActivation(tracedControlNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedControlNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedControlNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_DECISION_NODE_ACTIVATION: {
				TracedDecisionNodeActivation tracedDecisionNodeActivation = (TracedDecisionNodeActivation)theEObject;
				T result = caseTracedDecisionNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedDecisionNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedDecisionNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_FORK_NODE_ACTIVATION: {
				TracedForkNodeActivation tracedForkNodeActivation = (TracedForkNodeActivation)theEObject;
				T result = caseTracedForkNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedForkNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedForkNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_INITIAL_NODE_ACTIVATION: {
				TracedInitialNodeActivation tracedInitialNodeActivation = (TracedInitialNodeActivation)theEObject;
				T result = caseTracedInitialNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedControlNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedInitialNodeActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedInitialNodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActivitiesFewStepsPackage.TRACED_TOKEN: {
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

} //IntermediateActivitiesFewStepsSwitch
