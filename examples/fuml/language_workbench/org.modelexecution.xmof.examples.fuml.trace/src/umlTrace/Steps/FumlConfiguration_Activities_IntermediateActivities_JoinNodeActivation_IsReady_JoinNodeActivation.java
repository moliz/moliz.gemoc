/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	JoinNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation
