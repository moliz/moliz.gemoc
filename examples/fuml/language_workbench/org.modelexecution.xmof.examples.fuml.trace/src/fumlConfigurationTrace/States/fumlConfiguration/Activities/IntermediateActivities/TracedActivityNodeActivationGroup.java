/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value;
import fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getActivityExecutionSequence <em>Activity Execution Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getEdgeInstancesSequence <em>Edge Instances Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence <em>Node Activations Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup()
 * @model
 * @generated
 */
public interface TracedActivityNodeActivationGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Execution Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_ActivityExecutionSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_activityExecution_Value> getActivityExecutionSequence();

	/**
	 * Returns the value of the '<em><b>Edge Instances Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Instances Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Instances Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_EdgeInstancesSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_edgeInstances_Value> getEdgeInstancesSequence();

	/**
	 * Returns the value of the '<em><b>Node Activations Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activations Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activations Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivationGroup_NodeActivationsSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivationGroup_nodeActivations_Value> getNodeActivationsSequence();

} // TracedActivityNodeActivationGroup
