/**
 */
package fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.Object#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends ExtensionalValue {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getObject_Types()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getTypes();

} // Object
