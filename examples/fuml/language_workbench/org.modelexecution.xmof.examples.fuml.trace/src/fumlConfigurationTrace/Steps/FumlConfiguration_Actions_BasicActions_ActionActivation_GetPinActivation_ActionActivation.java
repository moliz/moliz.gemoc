/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation
