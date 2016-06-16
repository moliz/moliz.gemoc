/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getSource <em>Source</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getTarget <em>Target</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance()
 * @model
 * @generated
 */
public interface ActivityEdgeInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Activity Edge Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getEdgeInstances <em>Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Edge Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Edge Instance</em>' container reference.
	 * @see #setGroup_ActivityEdgeInstance(ActivityNodeActivationGroup)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance_Group_ActivityEdgeInstance()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup#getEdgeInstances
	 * @model opposite="edgeInstances" required="true" transient="false"
	 * @generated
	 */
	ActivityNodeActivationGroup getGroup_ActivityEdgeInstance();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Activity Edge Instance</em>' container reference.
	 * @see #getGroup_ActivityEdgeInstance()
	 * @generated
	 */
	void setGroup_ActivityEdgeInstance(ActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>Edge Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Activity Edge Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Activity Edge Instance</em>' reference.
	 * @see #setEdge_ActivityEdgeInstance(ActivityEdge)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance_Edge_ActivityEdgeInstance()
	 * @model
	 * @generated
	 */
	ActivityEdge getEdge_ActivityEdgeInstance();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Activity Edge Instance</em>' reference.
	 * @see #getEdge_ActivityEdgeInstance()
	 * @generated
	 */
	void setEdge_ActivityEdgeInstance(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNodeActivation)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance_Source()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 * @generated
	 */
	ActivityNodeActivation getSource();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNodeActivation)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance_Target()
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 * @generated
	 */
	ActivityNodeActivation getTarget();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Offer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getActivityEdgeInstance_Offers()
	 * @model
	 * @generated
	 */
	EList<Offer> getOffers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hasOfferRequired="true"
	 * @generated
	 */
	void hasOffer(boolean hasOffer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model offeredTokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void takeOfferedTokens(EList<Token> offeredTokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model countRequired="true"
	 * @generated
	 */
	void countOfferedValues(int count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model offeredTokensMany="true" maxCountRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void takeOfferedTokens(EList<Token> offeredTokens, int maxCount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 * @generated
	 */
	void sendOffer(EList<Token> tokens);

} // ActivityEdgeInstance
