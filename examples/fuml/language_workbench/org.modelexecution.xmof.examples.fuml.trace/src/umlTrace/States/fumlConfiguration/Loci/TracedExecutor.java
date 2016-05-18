/**
 */
package umlTrace.States.fumlConfiguration.Loci;

import fumlConfiguration.Loci.Executor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.Executor_locus_Executor_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence <em>Locus Executor Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutor()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Executor'"
 * @generated
 */
public interface TracedExecutor extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Executor Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Executor_locus_Executor_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Executor_locus_Executor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Executor Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Executor Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutor_Locus_ExecutorSequence()
	 * @see umlTrace.States.Executor_locus_Executor_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Executor_locus_Executor_Value> getLocus_ExecutorSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Executor)
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutor_OriginalObject()
	 * @model
	 * @generated
	 */
	Executor getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Executor value);

} // TracedExecutor
