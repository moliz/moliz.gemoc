/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue#getLocus_ExtensionalValueSequence <em>Locus Extensional Value Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedExtensionalValue()
 * @model abstract="true"
 * @generated
 */
public interface TracedExtensionalValue extends TracedCompoundValue {
	/**
	 * Returns the value of the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Extensional Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Extensional Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedExtensionalValue_Locus_ExtensionalValueSequence()
	 * @see umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExtensionalValue_locus_ExtensionalValue_Value> getLocus_ExtensionalValueSequence();

} // TracedExtensionalValue
