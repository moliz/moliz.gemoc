/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link umlTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getOffer_offeredTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Offer/offeredTokens'"
 * @generated
 */
public interface Offer_offeredTokens_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getOffer_offeredTokens_Value_OfferedTokens()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Offer/offeredTokens'"
	 * @generated
	 */
	EList<TracedToken> getOfferedTokens();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedOffer)
	 * @see umlTrace.States.StatesPackage#getOffer_offeredTokens_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOfferedTokensSequence
	 * @model opposite="offeredTokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedOffer getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedOffer value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getOffer_offeredTokens_Value_States()
	 * @see umlTrace.States.State#getOffer_offeredTokens_Values
	 * @model opposite="offer_offeredTokens_Values" required="true"
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

} // Offer_offeredTokens_Value
