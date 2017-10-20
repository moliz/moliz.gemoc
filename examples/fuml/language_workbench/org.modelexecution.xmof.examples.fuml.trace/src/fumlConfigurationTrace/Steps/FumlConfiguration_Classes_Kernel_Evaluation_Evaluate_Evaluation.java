/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation extends FumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedEvaluation getCaller();

} // FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation
