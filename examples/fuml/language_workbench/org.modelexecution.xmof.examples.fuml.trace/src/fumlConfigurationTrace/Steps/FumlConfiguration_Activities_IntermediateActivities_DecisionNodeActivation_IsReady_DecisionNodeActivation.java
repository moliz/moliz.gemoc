/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation
