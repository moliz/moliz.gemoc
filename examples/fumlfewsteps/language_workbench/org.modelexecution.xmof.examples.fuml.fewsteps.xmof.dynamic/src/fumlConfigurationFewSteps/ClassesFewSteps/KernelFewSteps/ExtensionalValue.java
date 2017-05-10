/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps;

import fumlConfigurationFewSteps.LociFewSteps.Locus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getExtensionalValue()
 * @model abstract="true"
 * @generated
 */
public interface ExtensionalValue extends CompoundValue {
	/**
	 * Returns the value of the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.LociFewSteps.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Extensional Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Extensional Value</em>' container reference.
	 * @see #setLocus_ExtensionalValue(Locus)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getExtensionalValue_Locus_ExtensionalValue()
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus#getExtensionalValues
	 * @model opposite="extensionalValues" transient="false"
	 * @generated
	 */
	Locus getLocus_ExtensionalValue();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}' container reference.
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
	 * @model
	 * @generated
	 */
	void destroy();

} // ExtensionalValue
