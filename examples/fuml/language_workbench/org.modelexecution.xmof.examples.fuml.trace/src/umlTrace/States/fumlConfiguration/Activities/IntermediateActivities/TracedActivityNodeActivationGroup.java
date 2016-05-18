/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value;
import umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence <em>Activity Execution Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getEdgeInstancesSequence <em>Edge Instances Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence <em>Node Activations Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivationGroup'"
 * @generated
 */
public interface TracedActivityNodeActivationGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Execution Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_ActivityExecutionSequence()
	 * @see umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_activityExecution_Value> getActivityExecutionSequence();

	/**
	 * Returns the value of the '<em><b>Edge Instances Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Instances Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Instances Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_EdgeInstancesSequence()
	 * @see umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_edgeInstances_Value> getEdgeInstancesSequence();

	/**
	 * Returns the value of the '<em><b>Node Activations Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activations Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activations Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_NodeActivationsSequence()
	 * @see umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_nodeActivations_Value> getNodeActivationsSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ActivityNodeActivationGroup)
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_OriginalObject()
	 * @model
	 * @generated
	 */
	ActivityNodeActivationGroup getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ActivityNodeActivationGroup value);

} // TracedActivityNodeActivationGroup
