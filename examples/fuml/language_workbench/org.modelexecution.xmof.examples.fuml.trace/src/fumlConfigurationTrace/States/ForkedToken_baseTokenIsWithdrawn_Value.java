/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Token base Token Is Withdrawn Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getForkedToken_baseTokenIsWithdrawn_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ForkedToken/baseTokenIsWithdrawn'"
 * @generated
 */
public interface ForkedToken_baseTokenIsWithdrawn_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Base Token Is Withdrawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Is Withdrawn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Is Withdrawn</em>' attribute.
	 * @see #setBaseTokenIsWithdrawn(boolean)
	 * @see fumlConfigurationTrace.States.StatesPackage#getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ForkedToken/baseTokenIsWithdrawn'"
	 * @generated
	 */
	boolean isBaseTokenIsWithdrawn();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token Is Withdrawn</em>' attribute.
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 */
	void setBaseTokenIsWithdrawn(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenIsWithdrawnSequence <em>Base Token Is Withdrawn Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedForkedToken)
	 * @see fumlConfigurationTrace.States.StatesPackage#getForkedToken_baseTokenIsWithdrawn_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken#getBaseTokenIsWithdrawnSequence
	 * @model opposite="baseTokenIsWithdrawnSequence" required="true" transient="false"
	 * @generated
	 */
	TracedForkedToken getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedForkedToken value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getForkedToken_baseTokenIsWithdrawn_Values <em>Forked Token base Token Is Withdrawn Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getForkedToken_baseTokenIsWithdrawn_Value_States()
	 * @see fumlConfigurationTrace.States.State#getForkedToken_baseTokenIsWithdrawn_Values
	 * @model opposite="forkedToken_baseTokenIsWithdrawn_Values" required="true"
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

} // ForkedToken_baseTokenIsWithdrawn_Value
