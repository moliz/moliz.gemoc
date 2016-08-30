/**
 */
package fumlConfiguration.Classes.Kernel;

import fumlConfiguration.Loci.Locus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getExtensionalValue()
 * @model abstract="true"
 * @generated
 */
public interface ExtensionalValue extends CompoundValue {
	/**
	 * Returns the value of the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Loci.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Extensional Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Extensional Value</em>' container reference.
	 * @see #setLocus_ExtensionalValue(Locus)
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getExtensionalValue_Locus_ExtensionalValue()
	 * @see fumlConfiguration.Loci.Locus#getExtensionalValues
	 * @model opposite="extensionalValues" transient="false"
	 * @generated
	 */
	Locus getLocus_ExtensionalValue();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Extensional Value</em>' container reference.
	 * @see #getLocus_ExtensionalValue()
	 * @generated
	 */
	void setLocus_ExtensionalValue(Locus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void destroy();

} // ExtensionalValue
