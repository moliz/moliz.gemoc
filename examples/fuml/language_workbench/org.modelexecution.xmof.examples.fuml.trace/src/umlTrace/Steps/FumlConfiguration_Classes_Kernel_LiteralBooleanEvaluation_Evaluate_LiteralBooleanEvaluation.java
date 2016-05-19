/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation extends FumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	LiteralBooleanEvaluation getCaller();

} // FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation
