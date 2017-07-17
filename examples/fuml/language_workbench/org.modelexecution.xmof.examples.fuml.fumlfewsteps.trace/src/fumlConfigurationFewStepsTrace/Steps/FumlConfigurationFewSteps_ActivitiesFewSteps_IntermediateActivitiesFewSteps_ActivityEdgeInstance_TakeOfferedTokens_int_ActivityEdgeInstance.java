/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance()
 * @model
 * @generated
 */
public interface FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityEdgeInstance getCaller();

} // FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance
