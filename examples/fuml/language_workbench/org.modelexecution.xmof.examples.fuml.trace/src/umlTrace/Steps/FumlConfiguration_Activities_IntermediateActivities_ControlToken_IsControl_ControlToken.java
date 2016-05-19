/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ControlToken;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken extends SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ControlToken) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ControlToken getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken
