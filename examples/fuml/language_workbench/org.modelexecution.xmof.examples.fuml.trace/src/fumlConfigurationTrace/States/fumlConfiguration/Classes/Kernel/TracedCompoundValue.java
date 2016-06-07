/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel;

import fumlConfigurationTrace.States.CompoundValue_featureValues_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue#getFeatureValuesSequence <em>Feature Values Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedCompoundValue()
 * @model abstract="true"
 * @generated
 */
public interface TracedCompoundValue extends TracedStructuredValue {
	/**
	 * Returns the value of the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.CompoundValue_featureValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.CompoundValue_featureValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Values Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedCompoundValue_FeatureValuesSequence()
	 * @see fumlConfigurationTrace.States.CompoundValue_featureValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CompoundValue_featureValues_Value> getFeatureValuesSequence();

} // TracedCompoundValue
