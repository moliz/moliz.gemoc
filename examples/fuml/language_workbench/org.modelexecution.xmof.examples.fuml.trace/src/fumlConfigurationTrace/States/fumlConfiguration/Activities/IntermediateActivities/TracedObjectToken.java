/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfigurationTrace.States.ObjectToken_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Object Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectToken()
 * @model
 * @generated
 */
public interface TracedObjectToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ObjectToken_value_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ObjectToken_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectToken_ValueSequence()
	 * @see fumlConfigurationTrace.States.ObjectToken_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ObjectToken_value_Value> getValueSequence();

} // TracedObjectToken
