/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps;

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
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getEdgeInstances <em>Edge Instances</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getNodeActivations <em>Node Activations</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityNodeActivationGroup()
 * @model
 * @generated
 */
public interface ActivityNodeActivationGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Execution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution</em>' container reference.
	 * @see #setActivityExecution(ActivityExecution)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityNodeActivationGroup_ActivityExecution()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution#getActivationGroup
	 * @model opposite="activationGroup" transient="false"
	 * @generated
	 */
	ActivityExecution getActivityExecution();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getActivityExecution <em>Activity Execution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Execution</em>' container reference.
	 * @see #getActivityExecution()
	 * @generated
	 */
	void setActivityExecution(ActivityExecution value);

	/**
	 * Returns the value of the '<em><b>Edge Instances</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Instances</em>' containment reference list.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityNodeActivationGroup_EdgeInstances()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getGroup_ActivityEdgeInstance
	 * @model opposite="group_ActivityEdgeInstance" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance> getEdgeInstances();

	/**
	 * Returns the value of the '<em><b>Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityNodeActivationGroup_NodeActivations()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getGroup_ActivityNodeActivation
	 * @model opposite="group_ActivityNodeActivation" containment="true"
	 * @generated
	 */
	EList<ActivityNodeActivation> getNodeActivations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodesMany="true" edgesMany="true"
	 * @generated
	 */
	void activate(EList<ActivityNode> nodes, EList<ActivityEdge> edges);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outputParameterNodeActivationsMany="true"
	 * @generated
	 */
	void getOutputParameterNodeActivations(EList<EObject> outputParameterNodeActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodesMany="true"
	 * @generated
	 */
	void createNodeActivations(EList<ActivityNode> nodes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model edgesMany="true"
	 * @generated
	 */
	void createEdgeInstances(EList<ActivityEdge> edges);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true"
	 * @generated
	 */
	void run(EList<ActivityNodeActivation> activations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodeRequired="true"
	 * @generated
	 */
	void createNodeActivation(ActivityNode node, ActivityNodeActivation activation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getActivityExecution(ActivityExecution activityExecution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodeRequired="true"
	 * @generated
	 */
	void getNodeActivation(ActivityNode node, ActivityNodeActivation activation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true"
	 * @generated
	 */
	void runNodes(EList<ActivityNodeActivation> activations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true" enabledActivationsMany="true"
	 * @generated
	 */
	void getInitiallyEnabledNodeActivations(EList<ActivityNodeActivation> activations, EList<ActivityNodeActivation> enabledActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationMany="true" activationsMany="true" returnRequired="true"
	 * @generated
	 */
	void checkIncomingEdges(EList<ActivityNodeActivation> activation, EList<ActivityNodeActivation> activations, boolean return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activationsMany="true" incomingEdgeRequired="true" sourceActivationsMany="true"
	 * @generated
	 */
	void getSourceActivations(EList<ActivityNodeActivation> activations, ActivityEdgeInstance incomingEdge, EList<ActivityNodeActivation> sourceActivations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void terminateAll();

} // ActivityNodeActivationGroup
