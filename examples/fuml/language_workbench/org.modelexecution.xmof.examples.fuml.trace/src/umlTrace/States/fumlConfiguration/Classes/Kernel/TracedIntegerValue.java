/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.IntegerValue_value_IntegerValue_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue#getValue_IntegerValueSequence <em>Value Integer Value Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedIntegerValue()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/IntegerValue'"
 * @generated
 */
public interface TracedIntegerValue extends TracedPrimitiveValue {
	/**
	 * Returns the value of the '<em><b>Value Integer Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.IntegerValue_value_IntegerValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.IntegerValue_value_IntegerValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Integer Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedIntegerValue_Value_IntegerValueSequence()
	 * @see umlTrace.States.IntegerValue_value_IntegerValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerValue_value_IntegerValue_Value> getValue_IntegerValueSequence();

} // TracedIntegerValue
