/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Executor Execute Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Executor_Execute_Executor()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Executor_Execute_Executor extends FumlConfiguration_ModelConfiguration_Main_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecutor getCaller();

} // FumlConfiguration_Loci_Executor_Execute_Executor
