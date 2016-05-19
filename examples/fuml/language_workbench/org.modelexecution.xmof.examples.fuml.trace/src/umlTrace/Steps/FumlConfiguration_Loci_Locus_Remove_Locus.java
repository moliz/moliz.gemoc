/**
 */
package umlTrace.Steps;

import fumlConfiguration.Loci.Locus;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Locus Remove Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Loci_Locus_Remove_Locus()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_Locus_Remove_Locus extends SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Loci.Locus) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Locus getCaller();

} // FumlConfiguration_Loci_Locus_Remove_Locus
