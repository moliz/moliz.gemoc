/**
 */
package fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getStructuredValue()
 * @model abstract="true"
 * @generated
 */
public interface StructuredValue extends Value {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createFeatureValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getFeatureValue(StructuralFeature feature, FeatureValue featureValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureRequired="true" valuesMany="true" positionRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void setFeatureValue(StructuralFeature feature, EList<Value> values, int position);

} // StructuredValue
