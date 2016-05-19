/**
 */
package umlTrace.Steps;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution extends FumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	OpaqueBehaviorExecution getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution
