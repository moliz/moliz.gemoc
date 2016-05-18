/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation Group activity Execution Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityNodeActivationGroup_activityExecution_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivationGroup/activityExecution'"
 * @generated
 */
public interface ActivityNodeActivationGroup_activityExecution_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Activity Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution</em>' reference.
	 * @see #setActivityExecution(TracedActivityExecution)
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivationGroup/activityExecution'"
	 * @generated
	 */
	TracedActivityExecution getActivityExecution();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getActivityExecution <em>Activity Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Execution</em>' reference.
	 * @see #getActivityExecution()
	 * @generated
	 */
	void setActivityExecution(TracedActivityExecution value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence <em>Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivationGroup)
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivationGroup_activityExecution_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence
	 * @model opposite="activityExecutionSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityNodeActivationGroup_activityExecution_Values <em>Activity Node Activation Group activity Execution Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivationGroup_activityExecution_Value_States()
	 * @see umlTrace.States.State#getActivityNodeActivationGroup_activityExecution_Values
	 * @model opposite="activityNodeActivationGroup_activityExecution_Values" required="true"
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

} // ActivityNodeActivationGroup_activityExecution_Value
