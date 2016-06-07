/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedInputPinActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation
