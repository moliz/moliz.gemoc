/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node Activation offered Token Count Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getOfferedTokenCount <em>Offered Token Count</em>}</li>
 *   <li>{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getObjectNodeActivation_offeredTokenCount_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ObjectNodeActivation/offeredTokenCount'"
 * @generated
 */
public interface ObjectNodeActivation_offeredTokenCount_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Token Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Token Count</em>' attribute.
	 * @see #setOfferedTokenCount(int)
	 * @see umlTrace.States.StatesPackage#getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ObjectNodeActivation/offeredTokenCount'"
	 * @generated
	 */
	int getOfferedTokenCount();

	/**
	 * Sets the value of the '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getOfferedTokenCount <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offered Token Count</em>' attribute.
	 * @see #getOfferedTokenCount()
	 * @generated
	 */
	void setOfferedTokenCount(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence <em>Offered Token Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedObjectNodeActivation)
	 * @see umlTrace.States.StatesPackage#getObjectNodeActivation_offeredTokenCount_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence
	 * @model opposite="offeredTokenCountSequence" required="true" transient="false"
	 * @generated
	 */
	TracedObjectNodeActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedObjectNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getObjectNodeActivation_offeredTokenCount_Values <em>Object Node Activation offered Token Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getObjectNodeActivation_offeredTokenCount_Value_States()
	 * @see umlTrace.States.State#getObjectNodeActivation_offeredTokenCount_Values
	 * @model opposite="objectNodeActivation_offeredTokenCount_Values" required="true"
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

} // ObjectNodeActivation_offeredTokenCount_Value
