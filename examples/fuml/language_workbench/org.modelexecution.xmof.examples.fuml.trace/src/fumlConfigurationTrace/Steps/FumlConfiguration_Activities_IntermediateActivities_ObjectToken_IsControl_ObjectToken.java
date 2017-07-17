/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken extends SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObjectToken getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken
