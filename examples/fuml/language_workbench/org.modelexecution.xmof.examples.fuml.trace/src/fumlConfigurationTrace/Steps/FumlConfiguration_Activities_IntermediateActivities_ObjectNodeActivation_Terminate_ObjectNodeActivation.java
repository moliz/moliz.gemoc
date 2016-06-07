/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObjectNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation
