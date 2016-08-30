/**
 */
package fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.CompoundValue#getFeatureValues <em>Feature Values</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getCompoundValue()
 * @model abstract="true"
 * @generated
 */
public interface CompoundValue extends StructuredValue {
	/**
	 * Returns the value of the '<em><b>Feature Values</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Classes.Kernel.FeatureValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Values</em>' containment reference list.
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getCompoundValue_FeatureValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureValue> getFeatureValues();

} // CompoundValue
