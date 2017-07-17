/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution extends SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityExecution getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution
