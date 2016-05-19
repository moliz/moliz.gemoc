/**
 */
package fumlConfiguration.Classes.Kernel;

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
 *   <li>{@link fumlConfiguration.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link fumlConfiguration.Classes.Kernel.FeatureValue#getValues_FeatureValue <em>Values Feature Value</em>}</li>
 *   <li>{@link fumlConfiguration.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getFeatureValue()
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
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getFeatureValue_Feature()
	 * @model required="true"
	 * @generated
	 */
	StructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Values Feature Value</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Classes.Kernel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Feature Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Feature Value</em>' containment reference list.
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getFeatureValue_Values_FeatureValue()
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
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getFeatureValue_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}' attribute.
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
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void copy(FeatureValue value);

} // FeatureValue
