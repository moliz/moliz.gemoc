/**
 */
package petrinetConfigurationTrace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetConfigurationTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.State#getPlaceConfiguration_tokens_Values <em>Place Configuration tokens Values</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @see petrinetConfigurationTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see petrinetConfigurationTrace.States.StatesPackage#getState_EndedSteps()
	 * @see petrinetConfigurationTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Place Configuration tokens Values</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Configuration tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Configuration tokens Values</em>' reference list.
	 * @see petrinetConfigurationTrace.States.StatesPackage#getState_PlaceConfiguration_tokens_Values()
	 * @see petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<PlaceConfiguration_tokens_Value> getPlaceConfiguration_tokens_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see petrinetConfigurationTrace.States.StatesPackage#getState_StartedSteps()
	 * @see petrinetConfigurationTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

} // State
