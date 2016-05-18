/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Instance group Activity Edge Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_group_ActivityEdgeInstance_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/group_ActivityEdgeInstance'"
 * @generated
 */
public interface ActivityEdgeInstance_group_ActivityEdgeInstance_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Group Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Edge Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Edge Instance</em>' reference.
	 * @see #setGroup_ActivityEdgeInstance(TracedActivityNodeActivationGroup)
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/group_ActivityEdgeInstance'"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getGroup_ActivityEdgeInstance();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Activity Edge Instance</em>' reference.
	 * @see #getGroup_ActivityEdgeInstance()
	 * @generated
	 */
	void setGroup_ActivityEdgeInstance(TracedActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getGroup_ActivityEdgeInstanceSequence <em>Group Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdgeInstance)
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getGroup_ActivityEdgeInstanceSequence
	 * @model opposite="group_ActivityEdgeInstanceSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdgeInstance getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdgeInstance value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityEdgeInstance_group_ActivityEdgeInstance_Values <em>Activity Edge Instance group Activity Edge Instance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States()
	 * @see umlTrace.States.State#getActivityEdgeInstance_group_ActivityEdgeInstance_Values
	 * @model opposite="activityEdgeInstance_group_ActivityEdgeInstance_Values" required="true"
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

} // ActivityEdgeInstance_group_ActivityEdgeInstance_Value
