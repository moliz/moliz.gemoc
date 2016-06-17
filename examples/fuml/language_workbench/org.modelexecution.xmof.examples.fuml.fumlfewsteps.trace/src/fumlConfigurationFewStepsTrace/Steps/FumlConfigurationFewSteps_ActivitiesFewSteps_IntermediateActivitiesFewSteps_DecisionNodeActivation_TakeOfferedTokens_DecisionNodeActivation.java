/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep>, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNodeActivation getCaller();

} // FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation
