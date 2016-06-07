/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution extends FumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecution getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution
