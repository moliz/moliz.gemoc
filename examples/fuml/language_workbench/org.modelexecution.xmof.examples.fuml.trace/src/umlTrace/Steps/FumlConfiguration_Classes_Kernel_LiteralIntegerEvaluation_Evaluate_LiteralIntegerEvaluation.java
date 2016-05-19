/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation extends FumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	LiteralIntegerEvaluation getCaller();

} // FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation
