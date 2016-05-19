/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.ActionActivation;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation extends FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.ActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation
