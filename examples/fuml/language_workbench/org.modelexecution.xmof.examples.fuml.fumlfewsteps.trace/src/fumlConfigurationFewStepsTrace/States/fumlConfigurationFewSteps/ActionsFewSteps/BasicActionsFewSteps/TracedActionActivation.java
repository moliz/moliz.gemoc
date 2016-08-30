/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityNodeActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getTracedActionActivation()
 * @model
 * @generated
 */
public interface TracedActionActivation extends TracedActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing Sequence</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getTracedActionActivation_FiringSequence()
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActionActivation_firing_Value> getFiringSequence();

} // TracedActionActivation
