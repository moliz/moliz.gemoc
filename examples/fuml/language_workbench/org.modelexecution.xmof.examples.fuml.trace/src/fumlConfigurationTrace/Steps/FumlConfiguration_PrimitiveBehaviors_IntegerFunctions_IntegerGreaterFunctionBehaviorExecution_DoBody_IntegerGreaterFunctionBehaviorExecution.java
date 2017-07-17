/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution()
 * @model
 * @generated
 */
public interface FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution extends FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIntegerGreaterFunctionBehaviorExecution getCaller();

} // FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution
