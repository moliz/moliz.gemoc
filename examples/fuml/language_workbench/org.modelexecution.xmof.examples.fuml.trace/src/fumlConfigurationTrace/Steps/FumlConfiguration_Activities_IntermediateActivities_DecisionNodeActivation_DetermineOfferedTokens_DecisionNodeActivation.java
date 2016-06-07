/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation
