/**
 */
package iml.util;

import iml.*;

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
 * @see iml.ImlPackage
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
	 * @parameter ePackage the package in question.
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
			case ImlPackage.IDENTIFYABLE_ELEMENT: {
				IdentifyableElement identifyableElement = (IdentifyableElement)theEObject;
				T result = caseIdentifyableElement(identifyableElement);
				if (result == null) result = caseElement(identifyableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseIdentifyableElement(header);
				if (result == null) result = caseElement(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.ADD_DATA: {
				AddData addData = (AddData)theEObject;
				T result = caseAddData(addData);
				if (result == null) result = caseIdentifyableElement(addData);
				if (result == null) result = caseElement(addData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseIdentifyableElement(state);
				if (result == null) result = caseConnectionPoint(state);
				if (result == null) result = caseElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.STATE_TRANSITION: {
				StateTransition stateTransition = (StateTransition)theEObject;
				T result = caseStateTransition(stateTransition);
				if (result == null) result = caseIdentifyableElement(stateTransition);
				if (result == null) result = caseConnectionPoint(stateTransition);
				if (result == null) result = caseElement(stateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseIdentifyableElement(jump);
				if (result == null) result = caseConnectionPoint(jump);
				if (result == null) result = caseElement(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseIdentifyableElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseIdentifyableElement(variable);
				if (result == null) result = caseElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.SIMULTANEOUS_DIVERGENCE: {
				SimultaneousDivergence simultaneousDivergence = (SimultaneousDivergence)theEObject;
				T result = caseSimultaneousDivergence(simultaneousDivergence);
				if (result == null) result = caseIdentifyableElement(simultaneousDivergence);
				if (result == null) result = caseConnectionPoint(simultaneousDivergence);
				if (result == null) result = caseElement(simultaneousDivergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.SIMULTANEOUS_CONVERGENCE: {
				SimultaneousConvergence simultaneousConvergence = (SimultaneousConvergence)theEObject;
				T result = caseSimultaneousConvergence(simultaneousConvergence);
				if (result == null) result = caseIdentifyableElement(simultaneousConvergence);
				if (result == null) result = caseConnectionPoint(simultaneousConvergence);
				if (result == null) result = caseElement(simultaneousConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.SELECTION_DIVERGENCE: {
				SelectionDivergence selectionDivergence = (SelectionDivergence)theEObject;
				T result = caseSelectionDivergence(selectionDivergence);
				if (result == null) result = caseIdentifyableElement(selectionDivergence);
				if (result == null) result = caseConnectionPoint(selectionDivergence);
				if (result == null) result = caseElement(selectionDivergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.SELECTION_CONVERGENCE: {
				SelectionConvergence selectionConvergence = (SelectionConvergence)theEObject;
				T result = caseSelectionConvergence(selectionConvergence);
				if (result == null) result = caseIdentifyableElement(selectionConvergence);
				if (result == null) result = caseConnectionPoint(selectionConvergence);
				if (result == null) result = caseElement(selectionConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImlPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseIdentifyableElement(connection);
				if (result == null) result = caseElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifyable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifyable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifyableElement(IdentifyableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddData(AddData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateTransition(StateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousDivergence(SimultaneousDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousConvergence(SimultaneousConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionDivergence(SelectionDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionConvergence(SelectionConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoint(ConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
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
