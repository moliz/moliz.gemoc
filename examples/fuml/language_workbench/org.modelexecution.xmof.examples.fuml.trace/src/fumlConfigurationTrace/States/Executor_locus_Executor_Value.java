/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor locus Executor Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getLocus_Executor <em>Locus Executor</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getExecutor_locus_Executor_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Executor/locus_Executor'"
 * @generated
 */
public interface Executor_locus_Executor_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Locus Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Executor</em>' reference.
	 * @see #setLocus_Executor(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutor_locus_Executor_Value_Locus_Executor()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Executor/locus_Executor'"
	 * @generated
	 */
	TracedLocus getLocus_Executor();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getLocus_Executor <em>Locus Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Executor</em>' reference.
	 * @see #getLocus_Executor()
	 * @generated
	 */
	void setLocus_Executor(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence <em>Locus Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecutor)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutor_locus_Executor_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence
	 * @model opposite="locus_ExecutorSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecutor getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Executor_locus_Executor_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecutor value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getExecutor_locus_Executor_Values <em>Executor locus Executor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutor_locus_Executor_Value_States()
	 * @see fumlConfigurationTrace.States.State#getExecutor_locus_Executor_Values
	 * @model opposite="executor_locus_Executor_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Executor_locus_Executor_Value
