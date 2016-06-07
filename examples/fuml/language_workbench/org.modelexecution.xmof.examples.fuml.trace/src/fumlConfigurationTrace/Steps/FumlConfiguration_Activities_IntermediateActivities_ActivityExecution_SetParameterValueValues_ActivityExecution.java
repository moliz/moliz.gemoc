/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution extends FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityExecution getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution
