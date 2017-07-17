/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation
