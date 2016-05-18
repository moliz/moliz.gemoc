/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Token remaining Offers Count Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 *   <li>{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getForkedToken_remainingOffersCount_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ForkedToken/remainingOffersCount'"
 * @generated
 */
public interface ForkedToken_remainingOffersCount_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedForkedToken)
	 * @see umlTrace.States.StatesPackage#getForkedToken_remainingOffersCount_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getRemainingOffersCountSequence
	 * @model opposite="remainingOffersCountSequence" required="true" transient="false"
	 * @generated
	 */
	TracedForkedToken getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedForkedToken value);

	/**
	 * Returns the value of the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count</em>' attribute.
	 * @see #setRemainingOffersCount(int)
	 * @see umlTrace.States.StatesPackage#getForkedToken_remainingOffersCount_Value_RemainingOffersCount()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ForkedToken/remainingOffersCount'"
	 * @generated
	 */
	int getRemainingOffersCount();

	/**
	 * Sets the value of the '{@link umlTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Offers Count</em>' attribute.
	 * @see #getRemainingOffersCount()
	 * @generated
	 */
	void setRemainingOffersCount(int value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getForkedToken_remainingOffersCount_Value_States()
	 * @see umlTrace.States.State#getForkedToken_remainingOffersCount_Values
	 * @model opposite="forkedToken_remainingOffersCount_Values" required="true"
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

} // ForkedToken_remainingOffersCount_Value
