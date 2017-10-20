/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation extends SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation
