/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Execution activation Group Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getActivationGroup <em>Activation Group</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityExecution_activationGroup_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityExecution/activationGroup'"
 * @generated
 */
public interface ActivityExecution_activationGroup_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Activation Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group</em>' reference.
	 * @see #setActivationGroup(TracedActivityNodeActivationGroup)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityExecution_activationGroup_Value_ActivationGroup()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityExecution/activationGroup'"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getActivationGroup();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getActivationGroup <em>Activation Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Group</em>' reference.
	 * @see #getActivationGroup()
	 * @generated
	 */
	void setActivationGroup(TracedActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence <em>Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityExecution)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityExecution_activationGroup_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence
	 * @model opposite="activationGroupSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityExecution getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityExecution value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityExecution_activationGroup_Values <em>Activity Execution activation Group Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityExecution_activationGroup_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityExecution_activationGroup_Values
	 * @model opposite="activityExecution_activationGroup_Values" required="true"
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

} // ActivityExecution_activationGroup_Value
