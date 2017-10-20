/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup
