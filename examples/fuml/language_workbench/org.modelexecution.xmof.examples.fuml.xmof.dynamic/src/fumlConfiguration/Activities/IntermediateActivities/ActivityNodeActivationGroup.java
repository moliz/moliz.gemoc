/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getEdgeInstances <em>Edge Instances</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivations <em>Node Activations</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivationGroup()
 * @model
 * @generated
 */
public interface ActivityNodeActivationGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Execution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution</em>' container reference.
	 * @see #setActivityExecution(ActivityExecution)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivationGroup_ActivityExecution()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution#getActivationGroup
	 * @model opposite="activationGroup" transient="false"
	 * @generated
	 */
	ActivityExecution getActivityExecution();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Execution</em>' container reference.
	 * @see #getActivityExecution()
	 * @generated
	 */
	void setActivityExecution(ActivityExecution value);

	/**
	 * Returns the value of the '<em><b>Edge Instances</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Instances</em>' containment reference list.
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivationGroup_EdgeInstances()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getGroup_ActivityEdgeInstance
	 * @model opposite="group_ActivityEdgeInstance" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance> getEdgeInstances();

	/**
	 * Returns the value of the '<em><b>Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activations</em>' containment reference list.
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivationGroup_NodeActivations()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation
	 * @model opposite="group_ActivityNodeActivation" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation> getNodeActivations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodesMany="true" edgesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void activate(EList<ActivityNode> nodes, EList<ActivityEdge> edges);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outputParameterNodeActivationsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getOutputParameterNodeActivations(EList<EObject> outputParameterNodeActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createNodeActivations(EList<ActivityNode> nodes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model edgesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createEdgeInstances(EList<ActivityEdge> edges);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void run(EList<ActivityNodeActivation> activations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodeRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createNodeActivation(ActivityNode node, ActivityNodeActivation activation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getActivityExecution(ActivityExecution activityExecution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodeRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getNodeActivation(ActivityNode node, ActivityNodeActivation activation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void runNodes(EList<ActivityNodeActivation> activations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true" enabledActivationsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getInitiallyEnabledNodeActivations(EList<ActivityNodeActivation> activations, EList<ActivityNodeActivation> enabledActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationMany="true" activationsMany="true" returnRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void checkIncomingEdges(EList<ActivityNodeActivation> activation, EList<ActivityNodeActivation> activations, boolean return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true" incomingEdgeRequired="true" sourceActivationsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getSourceActivations(EList<ActivityNodeActivation> activations, ActivityEdgeInstance incomingEdge, EList<ActivityNodeActivation> sourceActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void terminateAll();

} // ActivityNodeActivationGroup
