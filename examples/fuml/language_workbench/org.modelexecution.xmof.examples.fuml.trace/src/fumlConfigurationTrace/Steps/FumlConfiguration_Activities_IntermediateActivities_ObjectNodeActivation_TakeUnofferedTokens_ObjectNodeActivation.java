/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation extends SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObjectNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation
