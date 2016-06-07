/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation extends FumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedLiteralIntegerEvaluation getCaller();

} // FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation
