/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution#getActivationGroup <em>Activation Group</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityExecution()
 * @model
 * @generated
 */
public interface ActivityExecution extends Execution {
	/**
	 * Returns the value of the '<em><b>Activation Group</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group</em>' containment reference.
	 * @see #setActivationGroup(ActivityNodeActivationGroup)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityExecution_ActivationGroup()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getActivityExecution
	 * @model opposite="activityExecution" containment="true" required="true"
	 * @generated
	 */
	ActivityNodeActivationGroup getActivationGroup();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution#getActivationGroup <em>Activation Group</em>}' containment reference.
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
	 * @model
	 * @generated
	 */
	void collectOutputParameterValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterValueRequired="true" outputActivationRequired="true"
	 * @generated
	 */
	void setParameterValueValues(ParameterValue parameterValue, ActivityParameterNodeActivation outputActivation);

} // ActivityExecution
