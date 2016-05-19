/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	DecisionNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation
