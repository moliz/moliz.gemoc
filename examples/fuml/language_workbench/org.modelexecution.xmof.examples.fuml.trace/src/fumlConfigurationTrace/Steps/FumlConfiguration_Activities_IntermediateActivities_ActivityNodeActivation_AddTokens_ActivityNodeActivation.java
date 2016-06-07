/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation
