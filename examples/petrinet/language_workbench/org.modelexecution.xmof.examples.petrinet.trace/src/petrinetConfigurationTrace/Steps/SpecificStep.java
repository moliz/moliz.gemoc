/**
 */
package petrinetConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.Step;

import petrinetConfigurationTrace.States.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}</li>
 * </ul>
 *
 * @see petrinetConfigurationTrace.Steps.StepsPackage#getSpecificStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SpecificStep extends Step {
	/**
	 * Returns the value of the '<em><b>Ending State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending State</em>' reference.
	 * @see #setEndingState(State)
	 * @see petrinetConfigurationTrace.Steps.StepsPackage#getSpecificStep_EndingState()
	 * @see petrinetConfigurationTrace.States.State#getEndedSteps
	 * @model opposite="endedSteps"
	 * @generated
	 */
	State getEndingState();

	/**
	 * Sets the value of the '{@link petrinetConfigurationTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending State</em>' reference.
	 * @see #getEndingState()
	 * @generated
	 */
	void setEndingState(State value);

	/**
	 * Returns the value of the '<em><b>Starting State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting State</em>' reference.
	 * @see #setStartingState(State)
	 * @see petrinetConfigurationTrace.Steps.StepsPackage#getSpecificStep_StartingState()
	 * @see petrinetConfigurationTrace.States.State#getStartedSteps
	 * @model opposite="startedSteps" required="true"
	 * @generated
	 */
	State getStartingState();

	/**
	 * Sets the value of the '{@link petrinetConfigurationTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting State</em>' reference.
	 * @see #getStartingState()
	 * @generated
	 */
	void setStartingState(State value);

} // SpecificStep
