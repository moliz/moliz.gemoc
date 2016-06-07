/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory extends FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStep, FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecutionFactory getCaller();

} // FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory
