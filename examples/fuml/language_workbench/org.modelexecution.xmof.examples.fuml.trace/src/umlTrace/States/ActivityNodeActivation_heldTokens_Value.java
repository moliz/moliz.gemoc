/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation held Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_heldTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/heldTokens'"
 * @generated
 */
public interface ActivityNodeActivation_heldTokens_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_heldTokens_Value_HeldTokens()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/heldTokens'"
	 * @generated
	 */
	EList<TracedToken> getHeldTokens();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getHeldTokensSequence <em>Held Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivation)
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_heldTokens_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getHeldTokensSequence
	 * @model opposite="heldTokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityNodeActivation_heldTokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityNodeActivation_heldTokens_Values <em>Activity Node Activation held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_heldTokens_Value_States()
	 * @see umlTrace.States.State#getActivityNodeActivation_heldTokens_Values
	 * @model opposite="activityNodeActivation_heldTokens_Values" required="true"
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

} // ActivityNodeActivation_heldTokens_Value
