/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation extends FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ObjectNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation
