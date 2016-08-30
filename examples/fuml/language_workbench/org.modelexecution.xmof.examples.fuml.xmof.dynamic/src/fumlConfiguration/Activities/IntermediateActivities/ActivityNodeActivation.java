/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Loci.Locus;
import fumlConfiguration.Loci.SemanticVisitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNode_ActivityNodeActivation <em>Node Activity Node Activation</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning <em>Running</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation()
 * @model
 * @generated
 */
public interface ActivityNodeActivation extends SemanticVisitor {
	/**
	 * Returns the value of the '<em><b>Group Activity Node Activation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivations <em>Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Node Activation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Node Activation</em>' container reference.
	 * @see #setGroup_ActivityNodeActivation(ActivityNodeActivationGroup)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_Group_ActivityNodeActivation()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup#getNodeActivations
	 * @model opposite="nodeActivations" transient="false"
	 * @generated
	 */
	ActivityNodeActivationGroup getGroup_ActivityNodeActivation();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Activity Node Activation</em>' container reference.
	 * @see #getGroup_ActivityNodeActivation()
	 * @generated
	 */
	void setGroup_ActivityNodeActivation(ActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>Node Activity Node Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activity Node Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activity Node Activation</em>' reference.
	 * @see #setNode_ActivityNodeActivation(ActivityNode)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_Node_ActivityNodeActivation()
	 * @model
	 * @generated
	 */
	ActivityNode getNode_ActivityNodeActivation();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getNode_ActivityNodeActivation <em>Node Activity Node Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Activity Node Activation</em>' reference.
	 * @see #getNode_ActivityNodeActivation()
	 * @generated
	 */
	void setNode_ActivityNodeActivation(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_Running()
	 * @model required="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_IncomingEdges()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdgeInstance> getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_OutgoingEdges()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdgeInstance> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running</em>' attribute.
	 * @see #setIsRunning(boolean)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_IsRunning()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsRunning();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#isIsRunning <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Running</em>' attribute.
	 * @see #isIsRunning()
	 * @generated
	 */
	void setIsRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Activities.IntermediateActivities.Token}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNodeActivation_HeldTokens()
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token#getHolder
	 * @model opposite="holder" containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getTokens(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createNodeActivations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createEdgeInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void receiveOffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isReadyRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void isReady(boolean isReady);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void takeOfferedTokens(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model incomingTokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void fire(EList<Token> incomingTokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isRunningRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void isRunning(boolean isRunning);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hasOffersRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void hasOffers(boolean hasOffers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenRequired="true" positionRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void removeToken(Token token, int position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void addTokens(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void sendOffers(EList<Token> tokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void addToken(Token token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isSourceForRequired="true" edgeInstanceRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void isSourceFor(boolean isSourceFor, ActivityEdgeInstance edgeInstance);

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
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void clearTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model locusRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getExecutionLocus(Locus locus);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model activityExecutionRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getActivityExecution(ActivityExecution activityExecution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getExecutionContext(fumlConfiguration.Classes.Kernel.Object context);

} // ActivityNodeActivation
