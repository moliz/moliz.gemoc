/**
 */
package fumlConfiguration.Loci;

import fumlConfiguration.Classes.Kernel.ExtensionalValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.Locus#getFactory <em>Factory</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.Locus#getExecutor <em>Executor</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.Locus#getExtensionalValues <em>Extensional Values</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Loci.LociPackage#getLocus()
 * @model
 * @generated
 */
public interface Locus extends EObject {
	/**
	 * Returns the value of the '<em><b>Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' containment reference.
	 * @see #setFactory(ExecutionFactory)
	 * @see fumlConfiguration.Loci.LociPackage#getLocus_Factory()
	 * @see fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory
	 * @model opposite="locus_ExecutionFactory" containment="true"
	 * @generated
	 */
	ExecutionFactory getFactory();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Loci.Locus#getFactory <em>Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' containment reference.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(ExecutionFactory value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Loci.Executor#getLocus_Executor <em>Locus Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' containment reference.
	 * @see #setExecutor(Executor)
	 * @see fumlConfiguration.Loci.LociPackage#getLocus_Executor()
	 * @see fumlConfiguration.Loci.Executor#getLocus_Executor
	 * @model opposite="locus_Executor" containment="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Loci.Locus#getExecutor <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' containment reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Extensional Values</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Classes.Kernel.ExtensionalValue}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensional Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensional Values</em>' containment reference list.
	 * @see fumlConfiguration.Loci.LociPackage#getLocus_ExtensionalValues()
	 * @see fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue
	 * @model opposite="locus_ExtensionalValue" containment="true"
	 * @generated
	 */
	EList<ExtensionalValue> getExtensionalValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void remove(ExtensionalValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void add(ExtensionalValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true" objectRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void instantiate(org.eclipse.uml2.uml.Class type, fumlConfiguration.Classes.Kernel.Object object);

} // Locus
