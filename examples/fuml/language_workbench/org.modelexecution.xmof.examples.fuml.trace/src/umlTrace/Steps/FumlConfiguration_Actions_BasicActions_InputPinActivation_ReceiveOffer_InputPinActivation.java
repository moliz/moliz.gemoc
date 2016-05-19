/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.InputPinActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.InputPinActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	InputPinActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation
