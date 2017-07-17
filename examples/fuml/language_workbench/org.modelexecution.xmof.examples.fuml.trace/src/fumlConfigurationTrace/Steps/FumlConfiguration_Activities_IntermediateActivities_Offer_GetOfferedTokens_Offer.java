/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer extends FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedOffer getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer
