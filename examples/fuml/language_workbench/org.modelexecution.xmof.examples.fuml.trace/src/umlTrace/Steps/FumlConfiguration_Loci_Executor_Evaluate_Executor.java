/**
 */
package umlTrace.Steps;

import fumlConfiguration.Loci.Executor;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Executor Evaluate Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Executor_Evaluate_Executor()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Executor_Evaluate_Executor extends SpecificStep, SequentialStep<FumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Loci.Executor) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Executor getCaller();

} // FumlConfiguration_Loci_Executor_Evaluate_Executor
