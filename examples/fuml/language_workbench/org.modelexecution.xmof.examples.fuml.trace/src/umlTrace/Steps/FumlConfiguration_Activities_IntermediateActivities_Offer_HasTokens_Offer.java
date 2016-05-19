/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.Offer;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer extends FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.Offer) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Offer getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer
