/**
 */
package fumlConfigurationFewStepsTrace.States;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Activation firing Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#isFiring <em>Firing</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getActionActivation_firing_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ActionsFewSteps/BasicActionsFewSteps/ActionActivation/firing'"
 * @generated
 */
public interface ActionActivation_firing_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' attribute.
	 * @see #setFiring(boolean)
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getActionActivation_firing_Value_Firing()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ActionsFewSteps/BasicActionsFewSteps/ActionActivation/firing'"
	 * @generated
	 */
	boolean isFiring();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#isFiring <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing</em>' attribute.
	 * @see #isFiring()
	 * @generated
	 */
	void setFiring(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActionActivation)
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getActionActivation_firing_Value_Parent()
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation#getFiringSequence
	 * @model opposite="firingSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActionActivation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActionActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.State#getActionActivation_firing_Values <em>Action Activation firing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getActionActivation_firing_Value_States()
	 * @see fumlConfigurationFewStepsTrace.States.State#getActionActivation_firing_Values
	 * @model opposite="actionActivation_firing_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ActionActivation_firing_Value
