/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Activation count temp Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.PinActivation_count_temp_Value#getCount_temp <em>Count temp</em>}</li>
 *   <li>{@link umlTrace.States.PinActivation_count_temp_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.PinActivation_count_temp_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getPinActivation_count_temp_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/PinActivation/count_temp'"
 * @generated
 */
public interface PinActivation_count_temp_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Count temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count temp</em>' attribute.
	 * @see #setCount_temp(int)
	 * @see umlTrace.States.StatesPackage#getPinActivation_count_temp_Value_Count_temp()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/PinActivation/count_temp'"
	 * @generated
	 */
	int getCount_temp();

	/**
	 * Sets the value of the '{@link umlTrace.States.PinActivation_count_temp_Value#getCount_temp <em>Count temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count temp</em>' attribute.
	 * @see #getCount_temp()
	 * @generated
	 */
	void setCount_temp(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence <em>Count temp Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPinActivation)
	 * @see umlTrace.States.StatesPackage#getPinActivation_count_temp_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence
	 * @model opposite="count_tempSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPinActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.PinActivation_count_temp_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPinActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getPinActivation_count_temp_Values <em>Pin Activation count temp Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getPinActivation_count_temp_Value_States()
	 * @see umlTrace.States.State#getPinActivation_count_temp_Values
	 * @model opposite="pinActivation_count_temp_Values" required="true"
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

} // PinActivation_count_temp_Value
