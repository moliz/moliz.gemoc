/**
 */
package fumlConfiguration.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.Reference#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends StructuredValue {
	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(fumlConfiguration.Classes.Kernel.Object)
	 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getReference_Referent()
	 * @model required="true"
	 * @generated
	 */
	fumlConfiguration.Classes.Kernel.Object getReferent();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Classes.Kernel.Reference#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(fumlConfiguration.Classes.Kernel.Object value);

} // Reference
