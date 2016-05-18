/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Activation action Activation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.PinActivation_actionActivation_Value#getActionActivation <em>Action Activation</em>}</li>
 *   <li>{@link umlTrace.States.PinActivation_actionActivation_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.PinActivation_actionActivation_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getPinActivation_actionActivation_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/PinActivation/actionActivation'"
 * @generated
 */
public interface PinActivation_actionActivation_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Action Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation</em>' reference.
	 * @see #setActionActivation(TracedActionActivation)
	 * @see umlTrace.States.StatesPackage#getPinActivation_actionActivation_Value_ActionActivation()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/PinActivation/actionActivation'"
	 * @generated
	 */
	TracedActionActivation getActionActivation();

	/**
	 * Sets the value of the '{@link umlTrace.States.PinActivation_actionActivation_Value#getActionActivation <em>Action Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Activation</em>' reference.
	 * @see #getActionActivation()
	 * @generated
	 */
	void setActionActivation(TracedActionActivation value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence <em>Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPinActivation)
	 * @see umlTrace.States.StatesPackage#getPinActivation_actionActivation_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence
	 * @model opposite="actionActivationSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPinActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.PinActivation_actionActivation_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getPinActivation_actionActivation_Values <em>Pin Activation action Activation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getPinActivation_actionActivation_Value_States()
	 * @see umlTrace.States.State#getPinActivation_actionActivation_Values
	 * @model opposite="pinActivation_actionActivation_Values" required="true"
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

} // PinActivation_actionActivation_Value
