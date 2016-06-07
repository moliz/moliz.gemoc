/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation group Activity Node Activation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_group_ActivityNodeActivation_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/group_ActivityNodeActivation'"
 * @generated
 */
public interface ActivityNodeActivation_group_ActivityNodeActivation_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Group Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Node Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Node Activation</em>' reference.
	 * @see #setGroup_ActivityNodeActivation(TracedActivityNodeActivationGroup)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/group_ActivityNodeActivation'"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getGroup_ActivityNodeActivation();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Activity Node Activation</em>' reference.
	 * @see #getGroup_ActivityNodeActivation()
	 * @generated
	 */
	void setGroup_ActivityNodeActivation(TracedActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getGroup_ActivityNodeActivationSequence <em>Group Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getGroup_ActivityNodeActivationSequence
	 * @model opposite="group_ActivityNodeActivationSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_group_ActivityNodeActivation_Values <em>Activity Node Activation group Activity Node Activation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_group_ActivityNodeActivation_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityNodeActivation_group_ActivityNodeActivation_Values
	 * @model opposite="activityNodeActivation_group_ActivityNodeActivation_Values" required="true"
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

} // ActivityNodeActivation_group_ActivityNodeActivation_Value
