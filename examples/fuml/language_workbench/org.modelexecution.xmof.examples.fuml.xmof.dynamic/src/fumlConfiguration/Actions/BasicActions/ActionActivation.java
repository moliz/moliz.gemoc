/**
 */
package fumlConfiguration.Actions.BasicActions;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;

import fumlConfiguration.Classes.Kernel.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Pin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.ActionActivation#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.ActionActivation#isFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getActionActivation()
 * @model abstract="true"
 * @generated
 */
public interface ActionActivation extends ActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Pin Activations</b></em>' reference list.
	 * The list contents are of type {@link fumlConfiguration.Actions.BasicActions.PinActivation}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activations</em>' reference list.
	 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getActionActivation_PinActivations()
	 * @see fumlConfiguration.Actions.BasicActions.PinActivation#getActionActivation
	 * @model opposite="actionActivation"
	 * @generated
	 */
	EList<PinActivation> getPinActivations();

	/**
	 * Returns the value of the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' attribute.
	 * @see #setFiring(boolean)
	 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getActionActivation_Firing()
	 * @model required="true"
	 * @generated
	 */
	boolean isFiring();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Actions.BasicActions.ActionActivation#isFiring <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing</em>' attribute.
	 * @see #isFiring()
	 * @generated
	 */
	void setFiring(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getPinActivation(Pin pin, PinActivation return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void sendOffers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void doAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fireAgainRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void shouldFireAgain(boolean fireAgain);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true" valueRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void putToken(OutputPin pin, Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true" valuesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void takeTokens(InputPin pin, EList<Value> values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true" valuesRequired="true" valuesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void putTokens(OutputPin pin, EList<Value> values);

} // ActionActivation
