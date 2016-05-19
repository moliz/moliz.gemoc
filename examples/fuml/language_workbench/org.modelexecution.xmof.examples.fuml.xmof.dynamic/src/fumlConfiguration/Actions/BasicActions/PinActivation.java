/**
 */
package fumlConfiguration.Actions.BasicActions;

import fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation <em>Action Activation</em>}</li>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.PinActivation#getCount_temp <em>Count temp</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getPinActivation()
 * @model abstract="true"
 * @generated
 */
public interface PinActivation extends ObjectNodeActivation {
	/**
	 * Returns the value of the '<em><b>Action Activation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivations <em>Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation</em>' reference.
	 * @see #setActionActivation(ActionActivation)
	 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getPinActivation_ActionActivation()
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivations
	 * @model opposite="pinActivations"
	 * @generated
	 */
	ActionActivation getActionActivation();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation <em>Action Activation</em>}' reference.
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
	 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getPinActivation_Count_temp()
	 * @model
	 * @generated
	 */
	int getCount_temp();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Actions.BasicActions.PinActivation#getCount_temp <em>Count temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count temp</em>' attribute.
	 * @see #getCount_temp()
	 * @generated
	 */
	void setCount_temp(int value);

} // PinActivation
