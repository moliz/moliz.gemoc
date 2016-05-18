/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.ActionActivation_firing_Value;
import umlTrace.States.ActionActivation_pinActivations_Value;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence <em>Pin Activations Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedActionActivation()
 * @model abstract="true"
 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/ActionActivation'"
 * @generated
 */
public interface TracedActionActivation extends TracedActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActionActivation_firing_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedActionActivation_FiringSequence()
	 * @see umlTrace.States.ActionActivation_firing_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActionActivation_firing_Value> getFiringSequence();

	/**
	 * Returns the value of the '<em><b>Pin Activations Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActionActivation_pinActivations_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActionActivation_pinActivations_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activations Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activations Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedActionActivation_PinActivationsSequence()
	 * @see umlTrace.States.ActionActivation_pinActivations_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActionActivation_pinActivations_Value> getPinActivationsSequence();

} // TracedActionActivation
