/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.Reference_referent_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference#getReferentSequence <em>Referent Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedReference()
 * @model
 * @generated
 */
public interface TracedReference extends TracedStructuredValue {
	/**
	 * Returns the value of the '<em><b>Referent Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Reference_referent_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Reference_referent_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedReference_ReferentSequence()
	 * @see umlTrace.States.Reference_referent_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Reference_referent_Value> getReferentSequence();

} // TracedReference
