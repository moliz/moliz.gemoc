/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment locus Execution Environment Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionEnvironment_locus_ExecutionEnvironment_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionEnvironment/locus_ExecutionEnvironment'"
 * @generated
 */
public interface ExecutionEnvironment_locus_ExecutionEnvironment_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Locus Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Environment</em>' reference.
	 * @see #setLocus_ExecutionEnvironment(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionEnvironment/locus_ExecutionEnvironment'"
	 * @generated
	 */
	TracedLocus getLocus_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Execution Environment</em>' reference.
	 * @see #getLocus_ExecutionEnvironment()
	 * @generated
	 */
	void setLocus_ExecutionEnvironment(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence <em>Locus Execution Environment Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecutionEnvironment)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence
	 * @model opposite="locus_ExecutionEnvironmentSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecutionEnvironment getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getExecutionEnvironment_locus_ExecutionEnvironment_Values <em>Execution Environment locus Execution Environment Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionEnvironment_locus_ExecutionEnvironment_Value_States()
	 * @see fumlConfigurationTrace.States.State#getExecutionEnvironment_locus_ExecutionEnvironment_Values
	 * @model opposite="executionEnvironment_locus_ExecutionEnvironment_Values" required="true"
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

} // ExecutionEnvironment_locus_ExecutionEnvironment_Value
