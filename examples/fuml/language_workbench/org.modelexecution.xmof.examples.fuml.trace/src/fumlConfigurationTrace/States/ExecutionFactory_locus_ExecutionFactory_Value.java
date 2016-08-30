/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Factory locus Execution Factory Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionFactory_locus_ExecutionFactory_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/locus_ExecutionFactory'"
 * @generated
 */
public interface ExecutionFactory_locus_ExecutionFactory_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Locus Execution Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Factory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Factory</em>' reference.
	 * @see #setLocus_ExecutionFactory(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/locus_ExecutionFactory'"
	 * @generated
	 */
	TracedLocus getLocus_ExecutionFactory();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Execution Factory</em>' reference.
	 * @see #getLocus_ExecutionFactory()
	 * @generated
	 */
	void setLocus_ExecutionFactory(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getLocus_ExecutionFactorySequence <em>Locus Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecutionFactory)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionFactory_locus_ExecutionFactory_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getLocus_ExecutionFactorySequence
	 * @model opposite="locus_ExecutionFactorySequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecutionFactory getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecutionFactory value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getExecutionFactory_locus_ExecutionFactory_Values <em>Execution Factory locus Execution Factory Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getExecutionFactory_locus_ExecutionFactory_Value_States()
	 * @see fumlConfigurationTrace.States.State#getExecutionFactory_locus_ExecutionFactory_Values
	 * @model opposite="executionFactory_locus_ExecutionFactory_Values" required="true"
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

} // ExecutionFactory_locus_ExecutionFactory_Value
