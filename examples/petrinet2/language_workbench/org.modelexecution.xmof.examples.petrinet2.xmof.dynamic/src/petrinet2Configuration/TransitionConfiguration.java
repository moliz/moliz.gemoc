/**
 */
package petrinet2Configuration;

import petrinet2.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getTransitionConfiguration()
 * @model
 * @generated
 */
public interface TransitionConfiguration extends Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEnabled();

} // TransitionConfiguration