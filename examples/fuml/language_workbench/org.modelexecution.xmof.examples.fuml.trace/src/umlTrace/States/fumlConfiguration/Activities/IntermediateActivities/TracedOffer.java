/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Activities.IntermediateActivities.Offer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.Offer_offeredTokens_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedOffer()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Offer'"
 * @generated
 */
public interface TracedOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Offer_offeredTokens_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedOffer_OfferedTokensSequence()
	 * @see umlTrace.States.Offer_offeredTokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Offer_offeredTokens_Value> getOfferedTokensSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Offer)
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedOffer_OriginalObject()
	 * @model
	 * @generated
	 */
	Offer getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Offer value);

} // TracedOffer
