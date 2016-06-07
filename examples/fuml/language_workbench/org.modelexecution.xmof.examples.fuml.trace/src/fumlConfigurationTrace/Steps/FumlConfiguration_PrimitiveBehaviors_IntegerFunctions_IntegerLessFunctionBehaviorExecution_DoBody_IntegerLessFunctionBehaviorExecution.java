/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution extends FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIntegerLessFunctionBehaviorExecution getCaller();

} // FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution
