/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Locus Add Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Locus_Add_Locus()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Locus_Add_Locus extends SpecificStep, SmallStep, FumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStep, FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedLocus getCaller();

} // FumlConfiguration_Loci_Locus_Add_Locus
