/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.Token;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Control Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token extends SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.Token) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Token getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token
