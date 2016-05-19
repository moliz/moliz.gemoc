/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.ActionActivation;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.ActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation
