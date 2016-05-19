/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ForkedToken;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken extends FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ForkedToken getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken
