/**
 */
package imlTrace.States.iml.util;

import imlTrace.States.iml.*;

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
 * @see imlTrace.States.iml.ImlPackage
 * @generated
 */
public class ImlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlSwitch() {
		if (modelPackage == null) {
			modelPackage = ImlPackage.eINSTANCE;
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
			case ImlPackage.TRACED_ACTIVITY: {
				TracedActivity tracedActivity = (TracedActivity)theEObject;
				T result = caseTracedActivity(tracedActivity);
				if (result == null) result = caseTracedIdentifyableElement(tracedActivity);
				if (result == null) result = caseTracedElement(tracedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_ADD_DATA: {
				TracedAddData tracedAddData = (TracedAddData)theEObject;
				T result = caseTracedAddData(tracedAddData);
				if (result == null) result = caseTracedIdentifyableElement(tracedAddData);
				if (result == null) result = caseTracedElement(tracedAddData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_CONNECTION: {
				TracedConnection tracedConnection = (TracedConnection)theEObject;
				T result = caseTracedConnection(tracedConnection);
				if (result == null) result = caseTracedIdentifyableElement(tracedConnection);
				if (result == null) result = caseTracedElement(tracedConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_CONNECTION_POINT: {
				TracedConnectionPoint tracedConnectionPoint = (TracedConnectionPoint)theEObject;
				T result = caseTracedConnectionPoint(tracedConnectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_ELEMENT: {
				TracedElement tracedElement = (TracedElement)theEObject;
				T result = caseTracedElement(tracedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_EVENT: {
				TracedEvent tracedEvent = (TracedEvent)theEObject;
				T result = caseTracedEvent(tracedEvent);
				if (result == null) result = caseTracedElement(tracedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_HEADER: {
				TracedHeader tracedHeader = (TracedHeader)theEObject;
				T result = caseTracedHeader(tracedHeader);
				if (result == null) result = caseTracedIdentifyableElement(tracedHeader);
				if (result == null) result = caseTracedElement(tracedHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_IDENTIFYABLE_ELEMENT: {
				TracedIdentifyableElement tracedIdentifyableElement = (TracedIdentifyableElement)theEObject;
				T result = caseTracedIdentifyableElement(tracedIdentifyableElement);
				if (result == null) result = caseTracedElement(tracedIdentifyableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_JUMP: {
				TracedJump tracedJump = (TracedJump)theEObject;
				T result = caseTracedJump(tracedJump);
				if (result == null) result = caseTracedIdentifyableElement(tracedJump);
				if (result == null) result = caseTracedConnectionPoint(tracedJump);
				if (result == null) result = caseTracedElement(tracedJump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_SELECTION_CONVERGENCE: {
				TracedSelectionConvergence tracedSelectionConvergence = (TracedSelectionConvergence)theEObject;
				T result = caseTracedSelectionConvergence(tracedSelectionConvergence);
				if (result == null) result = caseTracedIdentifyableElement(tracedSelectionConvergence);
				if (result == null) result = caseTracedConnectionPoint(tracedSelectionConvergence);
				if (result == null) result = caseTracedElement(tracedSelectionConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_SELECTION_DIVERGENCE: {
				TracedSelectionDivergence tracedSelectionDivergence = (TracedSelectionDivergence)theEObject;
				T result = caseTracedSelectionDivergence(tracedSelectionDivergence);
				if (result == null) result = caseTracedIdentifyableElement(tracedSelectionDivergence);
				if (result == null) result = caseTracedConnectionPoint(tracedSelectionDivergence);
				if (result == null) result = caseTracedElement(tracedSelectionDivergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_SIMULTANEOUS_CONVERGENCE: {
				TracedSimultaneousConvergence tracedSimultaneousConvergence = (TracedSimultaneousConvergence)theEObject;
				T result = caseTracedSimultaneousConvergence(tracedSimultaneousConvergence);
				if (result == null) result = caseTracedIdentifyableElement(tracedSimultaneousConvergence);
				if (result == null) result = caseTracedConnectionPoint(tracedSimultaneousConvergence);
				if (result == null) result = caseTracedElement(tracedSimultaneousConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_SIMULTANEOUS_DIVERGENCE: {
				TracedSimultaneousDivergence tracedSimultaneousDivergence = (TracedSimultaneousDivergence)theEObject;
				T result = caseTracedSimultaneousDivergence(tracedSimultaneousDivergence);
				if (result == null) result = caseTracedIdentifyableElement(tracedSimultaneousDivergence);
				if (result == null) result = caseTracedConnectionPoint(tracedSimultaneousDivergence);
				if (result == null) result = caseTracedElement(tracedSimultaneousDivergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_STATE: {
				TracedState tracedState = (TracedState)theEObject;
				T result = caseTracedState(tracedState);
				if (result == null) result = caseTracedIdentifyableElement(tracedState);
				if (result == null) result = caseTracedConnectionPoint(tracedState);
				if (result == null) result = caseTracedElement(tracedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_STATE_TRANSITION: {
				TracedStateTransition tracedStateTransition = (TracedStateTransition)theEObject;
				T result = caseTracedStateTransition(tracedStateTransition);
				if (result == null) result = caseTracedIdentifyableElement(tracedStateTransition);
				if (result == null) result = caseTracedConnectionPoint(tracedStateTransition);
				if (result == null) result = caseTracedElement(tracedStateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.TRACED_VARIABLE: {
				TracedVariable tracedVariable = (TracedVariable)theEObject;
				T result = caseTracedVariable(tracedVariable);
				if (result == null) result = caseTracedIdentifyableElement(tracedVariable);
				if (result == null) result = caseTracedElement(tracedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivity(TracedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Add Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAddData(TracedAddData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnection(TracedConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectionPoint(TracedConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedElement(TracedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEvent(TracedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedHeader(TracedHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Identifyable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Identifyable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIdentifyableElement(TracedIdentifyableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedJump(TracedJump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Selection Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSelectionConvergence(TracedSelectionConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Selection Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSelectionDivergence(TracedSelectionDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Simultaneous Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Simultaneous Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSimultaneousConvergence(TracedSimultaneousConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Simultaneous Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Simultaneous Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSimultaneousDivergence(TracedSimultaneousDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedState(TracedState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStateTransition(TracedStateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariable(TracedVariable object) {
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

} //ImlSwitch
