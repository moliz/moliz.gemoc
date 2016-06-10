/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Loci;

import fumlConfigurationTrace.States.Executor_locus_Executor_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence <em>Locus Executor Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutor()
 * @model
 * @generated
 */
public interface TracedExecutor extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Executor Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.Executor_locus_Executor_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Executor Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Executor Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutor_Locus_ExecutorSequence()
	 * @see fumlConfigurationTrace.States.Executor_locus_Executor_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Executor_locus_Executor_Value> getLocus_ExecutorSequence();

} // TracedExecutor
