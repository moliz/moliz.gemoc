/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;

import fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation specification Evaluation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getSpecification_Evaluation <em>Specification Evaluation</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_specification_Evaluation_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Evaluation/specification_Evaluation'"
 * @generated
 */
public interface Evaluation_specification_Evaluation_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getSpecification_EvaluationSequence <em>Specification Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedEvaluation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_specification_Evaluation_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getSpecification_EvaluationSequence
	 * @model opposite="specification_EvaluationSequence" required="true" transient="false"
	 * @generated
	 */
	TracedEvaluation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedEvaluation value);

	/**
	 * Returns the value of the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Evaluation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Evaluation</em>' reference.
	 * @see #setSpecification_Evaluation(TracedValueSpecificationConfiguration)
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_specification_Evaluation_Value_Specification_Evaluation()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Evaluation/specification_Evaluation'"
	 * @generated
	 */
	TracedValueSpecificationConfiguration getSpecification_Evaluation();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value#getSpecification_Evaluation <em>Specification Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Evaluation</em>' reference.
	 * @see #getSpecification_Evaluation()
	 * @generated
	 */
	void setSpecification_Evaluation(TracedValueSpecificationConfiguration value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getEvaluation_specification_Evaluation_Values <em>Evaluation specification Evaluation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getEvaluation_specification_Evaluation_Value_States()
	 * @see fumlConfigurationTrace.States.State#getEvaluation_specification_Evaluation_Values
	 * @model opposite="evaluation_specification_Evaluation_Values" required="true"
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

} // Evaluation_specification_Evaluation_Value
