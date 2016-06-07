/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Activation pin Activations Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActionActivation_pinActivations_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/ActionActivation/pinActivations'"
 * @generated
 */
public interface ActionActivation_pinActivations_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence <em>Pin Activations Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActionActivation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActionActivation_pinActivations_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation#getPinActivationsSequence
	 * @model opposite="pinActivationsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActionActivation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActionActivation_pinActivations_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActionActivation value);

	/**
	 * Returns the value of the '<em><b>Pin Activations</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activations</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActionActivation_pinActivations_Value_PinActivations()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Actions/BasicActions/ActionActivation/pinActivations'"
	 * @generated
	 */
	EList<TracedPinActivation> getPinActivations();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActionActivation_pinActivations_Values <em>Action Activation pin Activations Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActionActivation_pinActivations_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActionActivation_pinActivations_Values
	 * @model opposite="actionActivation_pinActivations_Values" required="true"
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

} // ActionActivation_pinActivations_Value
