/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Loci;

import fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence <em>Locus Execution Environment Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionEnvironment()
 * @model
 * @generated
 */
public interface TracedExecutionEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Execution Environment Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Environment Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Environment Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence()
	 * @see fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> getLocus_ExecutionEnvironmentSequence();

} // TracedExecutionEnvironment
