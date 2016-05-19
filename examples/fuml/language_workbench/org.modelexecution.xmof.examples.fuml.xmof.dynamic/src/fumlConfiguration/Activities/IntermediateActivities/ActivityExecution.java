/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup <em>Activation Group</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityExecution()
 * @model
 * @generated
 */
public interface ActivityExecution extends Execution {
	/**
	 * Returns the value of the '<em><b>Activation Group</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group</em>' containment reference.
	 * @see #setActivationGroup(ActivityNodeActivationGroup)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityExecution_ActivationGroup()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution
	 * @model opposite="activityExecution" containment="true" required="true"
	 * @generated
	 */
	ActivityNodeActivationGroup getActivationGroup();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup <em>Activation Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Group</em>' containment reference.
	 * @see #getActivationGroup()
	 * @generated
	 */
	void setActivationGroup(ActivityNodeActivationGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void collectOutputParameterValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterValueRequired="true" outputActivationRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void setParameterValueValues(ParameterValue parameterValue, ActivityParameterNodeActivation outputActivation);

} // ActivityExecution
