/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Instance offers Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getOffers <em>Offers</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_offers_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/offers'"
 * @generated
 */
public interface ActivityEdgeInstance_offers_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_offers_Value_Offers()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/offers'"
	 * @generated
	 */
	EList<TracedOffer> getOffers();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOffersSequence <em>Offers Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdgeInstance)
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_offers_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOffersSequence
	 * @model opposite="offersSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdgeInstance getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdgeInstance value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityEdgeInstance_offers_Values <em>Activity Edge Instance offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_offers_Value_States()
	 * @see umlTrace.States.State#getActivityEdgeInstance_offers_Values
	 * @model opposite="activityEdgeInstance_offers_Values" required="true"
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

} // ActivityEdgeInstance_offers_Value
