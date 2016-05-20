/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.Object_types_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject#getTypesSequence <em>Types Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedObject()
 * @model
 * @generated
 */
public interface TracedObject extends TracedExtensionalValue {
	/**
	 * Returns the value of the '<em><b>Types Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Object_types_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Object_types_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedObject_TypesSequence()
	 * @see umlTrace.States.Object_types_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Object_types_Value> getTypesSequence();

} // TracedObject
