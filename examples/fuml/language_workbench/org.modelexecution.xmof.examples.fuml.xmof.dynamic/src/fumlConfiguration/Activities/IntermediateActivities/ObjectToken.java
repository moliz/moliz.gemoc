/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Classes.Kernel.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ObjectToken#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getObjectToken()
 * @model
 * @generated
 */
public interface ObjectToken extends Token {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getObjectToken_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectToken#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // ObjectToken
