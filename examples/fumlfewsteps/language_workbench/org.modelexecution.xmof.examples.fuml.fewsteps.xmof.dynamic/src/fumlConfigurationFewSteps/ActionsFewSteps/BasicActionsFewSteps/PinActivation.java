/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ObjectNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getActionActivation <em>Action Activation</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getCount_temp <em>Count temp</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getPinActivation()
 * @model abstract="true"
 * @generated
 */
public interface PinActivation extends ObjectNodeActivation {
	/**
	 * Returns the value of the '<em><b>Action Activation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation#getPinActivations <em>Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation</em>' reference.
	 * @see #setActionActivation(ActionActivation)
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getPinActivation_ActionActivation()
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation#getPinActivations
	 * @model opposite="pinActivations"
	 * @generated
	 */
	ActionActivation getActionActivation();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getActionActivation <em>Action Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Activation</em>' reference.
	 * @see #getActionActivation()
	 * @generated
	 */
	void setActionActivation(ActionActivation value);

	/**
	 * Returns the value of the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count temp</em>' attribute.
	 * @see #setCount_temp(int)
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getPinActivation_Count_temp()
	 * @model
	 * @generated
	 */
	int getCount_temp();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getCount_temp <em>Count temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count temp</em>' attribute.
	 * @see #getCount_temp()
	 * @generated
	 */
	void setCount_temp(int value);

} // PinActivation
