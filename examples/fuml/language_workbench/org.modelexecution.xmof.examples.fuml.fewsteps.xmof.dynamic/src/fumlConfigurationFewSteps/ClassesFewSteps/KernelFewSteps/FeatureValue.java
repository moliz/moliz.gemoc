/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue#getValues_FeatureValue <em>Values Feature Value</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getFeatureValue()
 * @model abstract="true"
 * @generated
 */
public interface FeatureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(StructuralFeature)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getFeatureValue_Feature()
	 * @model required="true"
	 * @generated
	 */
	StructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Values Feature Value</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Feature Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Feature Value</em>' containment reference list.
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getFeatureValue_Values_FeatureValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues_FeatureValue();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getFeatureValue_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void copy(FeatureValue value);

} // FeatureValue
