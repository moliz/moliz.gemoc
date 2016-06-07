/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence <em>Activation Group Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityExecution()
 * @model
 * @generated
 */
public interface TracedActivityExecution extends TracedExecution {
	/**
	 * Returns the value of the '<em><b>Activation Group Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityExecution_ActivationGroupSequence()
	 * @see fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityExecution_activationGroup_Value> getActivationGroupSequence();

} // TracedActivityExecution
