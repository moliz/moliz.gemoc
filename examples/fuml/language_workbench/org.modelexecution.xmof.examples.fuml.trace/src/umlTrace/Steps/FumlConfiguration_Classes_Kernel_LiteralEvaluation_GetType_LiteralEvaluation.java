/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation extends FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStep, FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedLiteralEvaluation getCaller();

} // FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation
