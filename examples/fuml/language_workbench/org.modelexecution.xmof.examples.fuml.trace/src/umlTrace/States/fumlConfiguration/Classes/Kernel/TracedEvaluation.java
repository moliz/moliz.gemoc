/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.Evaluation_locus_Evaluation_Value;
import umlTrace.States.Evaluation_specification_Evaluation_Value;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getLocus_EvaluationSequence <em>Locus Evaluation Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getSpecification_EvaluationSequence <em>Specification Evaluation Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedEvaluation()
 * @model abstract="true"
 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Evaluation'"
 * @generated
 */
public interface TracedEvaluation extends TracedSemanticVisitor {
	/**
	 * Returns the value of the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Evaluation_locus_Evaluation_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Evaluation_locus_Evaluation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Evaluation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Evaluation Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedEvaluation_Locus_EvaluationSequence()
	 * @see umlTrace.States.Evaluation_locus_Evaluation_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Evaluation_locus_Evaluation_Value> getLocus_EvaluationSequence();

	/**
	 * Returns the value of the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Evaluation_specification_Evaluation_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Evaluation_specification_Evaluation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Evaluation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Evaluation Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedEvaluation_Specification_EvaluationSequence()
	 * @see umlTrace.States.Evaluation_specification_Evaluation_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Evaluation_specification_Evaluation_Value> getSpecification_EvaluationSequence();

} // TracedEvaluation
