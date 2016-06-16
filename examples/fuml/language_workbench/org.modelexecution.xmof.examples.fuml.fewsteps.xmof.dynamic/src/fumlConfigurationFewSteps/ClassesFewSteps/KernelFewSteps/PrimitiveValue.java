/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps;

import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.PrimitiveValue#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getPrimitiveValue()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveValue extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PrimitiveType)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getPrimitiveValue_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.PrimitiveValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // PrimitiveValue
