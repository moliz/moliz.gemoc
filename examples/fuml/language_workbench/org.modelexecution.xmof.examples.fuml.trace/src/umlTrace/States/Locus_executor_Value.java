/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Loci.TracedExecutor;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locus executor Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Locus_executor_Value#getExecutor <em>Executor</em>}</li>
 *   <li>{@link umlTrace.States.Locus_executor_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Locus_executor_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getLocus_executor_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/executor'"
 * @generated
 */
public interface Locus_executor_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(TracedExecutor)
	 * @see umlTrace.States.StatesPackage#getLocus_executor_Value_Executor()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/executor'"
	 * @generated
	 */
	TracedExecutor getExecutor();

	/**
	 * Sets the value of the '{@link umlTrace.States.Locus_executor_Value#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(TracedExecutor value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExecutorSequence <em>Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedLocus)
	 * @see umlTrace.States.StatesPackage#getLocus_executor_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExecutorSequence
	 * @model opposite="executorSequence" required="true" transient="false"
	 * @generated
	 */
	TracedLocus getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Locus_executor_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getLocus_executor_Values <em>Locus executor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getLocus_executor_Value_States()
	 * @see umlTrace.States.State#getLocus_executor_Values
	 * @model opposite="locus_executor_Values" required="true"
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

} // Locus_executor_Value
