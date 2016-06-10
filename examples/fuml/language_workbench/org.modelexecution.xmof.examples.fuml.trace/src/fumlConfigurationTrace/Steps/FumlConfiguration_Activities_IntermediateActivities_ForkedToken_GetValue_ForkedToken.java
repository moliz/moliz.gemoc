/**
 */
package fumlConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken extends FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedForkedToken getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken
