/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution extends FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStep>, FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecution getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution
