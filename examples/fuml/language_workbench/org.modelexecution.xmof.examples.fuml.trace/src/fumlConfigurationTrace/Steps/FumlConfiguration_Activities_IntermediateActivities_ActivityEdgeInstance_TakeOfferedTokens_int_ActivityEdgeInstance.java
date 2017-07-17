/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance extends FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityEdgeInstance getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance
