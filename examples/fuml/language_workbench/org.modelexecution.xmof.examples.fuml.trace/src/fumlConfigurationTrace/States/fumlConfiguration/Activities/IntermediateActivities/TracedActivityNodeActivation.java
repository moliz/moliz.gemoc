/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_running_Value;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getGroup_ActivityNodeActivationSequence <em>Group Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIncomingEdgesSequence <em>Incoming Edges Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIsRunningSequence <em>Is Running Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getNode_ActivityNodeActivationSequence <em>Node Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getOutgoingEdgesSequence <em>Outgoing Edges Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getRunningSequence <em>Running Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation()
 * @model
 * @generated
 */
public interface TracedActivityNodeActivation extends TracedSemanticVisitor {
	/**
	 * Returns the value of the '<em><b>Group Activity Node Activation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Node Activation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Node Activation Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> getGroup_ActivityNodeActivationSequence();

	/**
	 * Returns the value of the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_HeldTokensSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_heldTokens_Value> getHeldTokensSequence();

	/**
	 * Returns the value of the '<em><b>Incoming Edges Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_IncomingEdgesSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_incomingEdges_Value> getIncomingEdgesSequence();

	/**
	 * Returns the value of the '<em><b>Is Running Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Running Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_IsRunningSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_isRunning_Value> getIsRunningSequence();

	/**
	 * Returns the value of the '<em><b>Node Activity Node Activation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activity Node Activation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activity Node Activation Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> getNode_ActivityNodeActivationSequence();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_OutgoingEdgesSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_outgoingEdges_Value> getOutgoingEdgesSequence();

	/**
	 * Returns the value of the '<em><b>Running Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ActivityNodeActivation_running_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ActivityNodeActivation_running_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityNodeActivation_RunningSequence()
	 * @see fumlConfigurationTrace.States.ActivityNodeActivation_running_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation_running_Value> getRunningSequence();

} // TracedActivityNodeActivation
