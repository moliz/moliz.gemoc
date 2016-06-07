/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup
