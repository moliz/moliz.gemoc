/**
 */
package fsmConfiguration;

import fsm.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmConfiguration.FsmConfigurationPackage#getStateConfiguration()
 * @model
 * @generated
 */
public interface StateConfiguration extends State {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model currentInputElementRequired="true"
	 * @generated
	 */
	void process(String currentInputElement);

} // StateConfiguration
