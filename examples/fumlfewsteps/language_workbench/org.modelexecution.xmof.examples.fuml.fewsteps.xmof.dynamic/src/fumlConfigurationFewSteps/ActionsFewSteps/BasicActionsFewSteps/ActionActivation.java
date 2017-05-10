/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

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
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation#isFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getActionActivation()
 * @model abstract="true"
 * @generated
 */
public interface ActionActivation extends ActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Pin Activations</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Activations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Activations</em>' reference list.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getActionActivation_PinActivations()
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation#getActionActivation
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
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getActionActivation_Firing()
	 * @model required="true"
	 * @generated
	 */
	boolean isFiring();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation#isFiring <em>Firing</em>}' attribute.
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
	 * @generated
	 */
	void getPinActivation(Pin pin, PinActivation return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendOffers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
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
	 * @generated
	 */
	void putToken(OutputPin pin, Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true" valuesMany="true"
	 * @generated
	 */
	void takeTokens(InputPin pin, EList<Value> values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinRequired="true" valuesRequired="true" valuesMany="true"
	 * @generated
	 */
	void putTokens(OutputPin pin, EList<Value> values);

} // ActionActivation
