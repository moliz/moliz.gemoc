/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityFinalNodeActivation getCaller();

} // FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation
