/**
 */
package fumlConfiguration.Loci;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.ExecutionEnvironment#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Loci.LociPackage#getExecutionEnvironment()
 * @model
 * @generated
 */
public interface ExecutionEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Execution Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Environment</em>' containment reference.
	 * @see #setLocus_ExecutionEnvironment(Locus)
	 * @see fumlConfiguration.Loci.LociPackage#getExecutionEnvironment_Locus_ExecutionEnvironment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Locus getLocus_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Loci.ExecutionEnvironment#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Execution Environment</em>' containment reference.
	 * @see #getLocus_ExecutionEnvironment()
	 * @generated
	 */
	void setLocus_ExecutionEnvironment(Locus value);

} // ExecutionEnvironment
