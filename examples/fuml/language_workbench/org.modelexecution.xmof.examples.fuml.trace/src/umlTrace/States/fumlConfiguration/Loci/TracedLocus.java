/**
 */
package umlTrace.States.fumlConfiguration.Loci;

import fumlConfiguration.Loci.Locus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.Locus_executor_Value;
import umlTrace.States.Locus_extensionalValues_Value;
import umlTrace.States.Locus_factory_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExecutorSequence <em>Executor Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExtensionalValuesSequence <em>Extensional Values Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getFactorySequence <em>Factory Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedLocus()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus'"
 * @generated
 */
public interface TracedLocus extends EObject {
	/**
	 * Returns the value of the '<em><b>Executor Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Locus_executor_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Locus_executor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedLocus_ExecutorSequence()
	 * @see umlTrace.States.Locus_executor_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Locus_executor_Value> getExecutorSequence();

	/**
	 * Returns the value of the '<em><b>Extensional Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Locus_extensionalValues_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Locus_extensionalValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensional Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensional Values Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedLocus_ExtensionalValuesSequence()
	 * @see umlTrace.States.Locus_extensionalValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Locus_extensionalValues_Value> getExtensionalValuesSequence();

	/**
	 * Returns the value of the '<em><b>Factory Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Locus_factory_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Locus_factory_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedLocus_FactorySequence()
	 * @see umlTrace.States.Locus_factory_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Locus_factory_Value> getFactorySequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Locus)
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedLocus_OriginalObject()
	 * @model
	 * @generated
	 */
	Locus getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Locus value);

} // TracedLocus
