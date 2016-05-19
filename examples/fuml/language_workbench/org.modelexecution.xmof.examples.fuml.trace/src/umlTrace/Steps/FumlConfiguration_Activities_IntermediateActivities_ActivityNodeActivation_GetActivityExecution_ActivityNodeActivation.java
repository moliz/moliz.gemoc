/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ActivityNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation
