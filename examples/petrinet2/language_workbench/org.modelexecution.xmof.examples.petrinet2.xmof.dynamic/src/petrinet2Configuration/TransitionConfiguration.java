/**
 */
package petrinet2Configuration;

import org.eclipse.emf.ecore.EObject;

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
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void isEnabled(EObject enabled);

} // TransitionConfiguration
