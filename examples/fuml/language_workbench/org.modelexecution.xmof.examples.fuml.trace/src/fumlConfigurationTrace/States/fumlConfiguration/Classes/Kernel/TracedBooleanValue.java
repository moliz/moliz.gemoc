/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel;

import fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence <em>Value Boolean Value Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedBooleanValue()
 * @model
 * @generated
 */
public interface TracedBooleanValue extends TracedPrimitiveValue {
	/**
	 * Returns the value of the '<em><b>Value Boolean Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Boolean Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean Value Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedBooleanValue_Value_BooleanValueSequence()
	 * @see fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanValue_value_BooleanValue_Value> getValue_BooleanValueSequence();

} // TracedBooleanValue
