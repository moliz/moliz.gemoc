/**
 */
package fumlConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Locus Remove Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Locus_Remove_Locus()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Locus_Remove_Locus extends SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedLocus getCaller();

} // FumlConfiguration_Loci_Locus_Remove_Locus
