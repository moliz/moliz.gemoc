/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation locus Evaluation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getLocus_Evaluation <em>Locus Evaluation</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_locus_Evaluation_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Evaluation/locus_Evaluation'"
 * @generated
 */
public interface Evaluation_locus_Evaluation_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Evaluation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Evaluation</em>' reference.
	 * @see #setLocus_Evaluation(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_locus_Evaluation_Value_Locus_Evaluation()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Evaluation/locus_Evaluation'"
	 * @generated
	 */
	TracedLocus getLocus_Evaluation();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getLocus_Evaluation <em>Locus Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Evaluation</em>' reference.
	 * @see #getLocus_Evaluation()
	 * @generated
	 */
	void setLocus_Evaluation(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getLocus_EvaluationSequence <em>Locus Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedEvaluation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_locus_Evaluation_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getLocus_EvaluationSequence
	 * @model opposite="locus_EvaluationSequence" required="true" transient="false"
	 * @generated
	 */
	TracedEvaluation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedEvaluation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getEvaluation_locus_Evaluation_Values <em>Evaluation locus Evaluation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_locus_Evaluation_Value_States()
	 * @see fumlConfigurationTrace.States.State#getEvaluation_locus_Evaluation_Values
	 * @model opposite="evaluation_locus_Evaluation_Values" required="true"
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

} // Evaluation_locus_Evaluation_Value
