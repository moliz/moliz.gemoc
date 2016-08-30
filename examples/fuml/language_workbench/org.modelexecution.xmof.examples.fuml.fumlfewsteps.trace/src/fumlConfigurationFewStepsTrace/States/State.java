/**
 */
package fumlConfigurationFewStepsTrace.States;

import fumlConfigurationFewStepsTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.State#getActionActivation_firing_Values <em>Action Activation firing Values</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.State#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Activation firing Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation firing Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation firing Values</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getState_ActionActivation_firing_Values()
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActionActivation_firing_Value> getActionActivation_firing_Values();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getState_EndedSteps()
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor runtime Model Element Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor runtime Model Element Values</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getState_SemanticVisitor_runtimeModelElement_Values()
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<SemanticVisitor_runtimeModelElement_Value> getSemanticVisitor_runtimeModelElement_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getState_StartedSteps()
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

} // State
