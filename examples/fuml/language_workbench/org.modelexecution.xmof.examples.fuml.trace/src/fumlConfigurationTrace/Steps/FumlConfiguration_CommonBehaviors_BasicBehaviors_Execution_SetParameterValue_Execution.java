/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution extends FumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecution getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution
