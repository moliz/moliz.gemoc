/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Locus Instantiate Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Locus_Instantiate_Locus()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Locus_Instantiate_Locus extends SpecificStep, SequentialStep<FumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStep>, FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedLocus getCaller();

} // FumlConfiguration_Loci_Locus_Instantiate_Locus
