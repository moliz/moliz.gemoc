/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityParameterNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation
