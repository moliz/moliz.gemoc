/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.PrimitiveValue_type_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence <em>Type Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedPrimitiveValue()
 * @model abstract="true"
 * @generated
 */
public interface TracedPrimitiveValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Type Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.PrimitiveValue_type_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.PrimitiveValue_type_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedPrimitiveValue_TypeSequence()
	 * @see umlTrace.States.PrimitiveValue_type_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PrimitiveValue_type_Value> getTypeSequence();

} // TracedPrimitiveValue
