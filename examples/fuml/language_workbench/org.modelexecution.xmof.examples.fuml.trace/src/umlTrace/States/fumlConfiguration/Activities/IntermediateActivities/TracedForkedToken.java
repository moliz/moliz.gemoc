/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value;
import umlTrace.States.ForkedToken_baseToken_Value;
import umlTrace.States.ForkedToken_remainingOffersCount_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenIsWithdrawnSequence <em>Base Token Is Withdrawn Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedForkedToken()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ForkedToken'"
 * @generated
 */
public interface TracedForkedToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Base Token Is Withdrawn Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Is Withdrawn Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Is Withdrawn Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedForkedToken_BaseTokenIsWithdrawnSequence()
	 * @see umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_baseTokenIsWithdrawn_Value> getBaseTokenIsWithdrawnSequence();

	/**
	 * Returns the value of the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedForkedToken_BaseTokenSequence()
	 * @see umlTrace.States.ForkedToken_baseToken_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getBaseTokenSequence();

	/**
	 * Returns the value of the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedForkedToken_RemainingOffersCountSequence()
	 * @see umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountSequence();

} // TracedForkedToken
