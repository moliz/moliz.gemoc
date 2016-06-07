/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance extends FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityEdgeInstance getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance
