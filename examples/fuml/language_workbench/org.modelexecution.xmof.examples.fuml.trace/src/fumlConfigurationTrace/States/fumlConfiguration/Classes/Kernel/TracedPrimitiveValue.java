/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel;

import fumlConfigurationTrace.States.PrimitiveValue_type_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence <em>Type Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedPrimitiveValue()
 * @model abstract="true"
 * @generated
 */
public interface TracedPrimitiveValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Type Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PrimitiveValue_type_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PrimitiveValue_type_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedPrimitiveValue_TypeSequence()
	 * @see fumlConfigurationTrace.States.PrimitiveValue_type_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PrimitiveValue_type_Value> getTypeSequence();

} // TracedPrimitiveValue
