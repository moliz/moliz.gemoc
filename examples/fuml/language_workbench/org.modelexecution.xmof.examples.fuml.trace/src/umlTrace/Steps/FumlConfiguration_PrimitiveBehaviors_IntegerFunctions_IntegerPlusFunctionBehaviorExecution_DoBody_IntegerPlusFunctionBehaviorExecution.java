/**
 */
package umlTrace.Steps;

import fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution extends FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IntegerPlusFunctionBehaviorExecution getCaller();

} // FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution
