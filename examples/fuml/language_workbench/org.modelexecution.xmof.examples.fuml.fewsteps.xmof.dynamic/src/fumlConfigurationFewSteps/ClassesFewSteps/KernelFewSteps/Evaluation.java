/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps;

import fumlConfigurationFewSteps.LociFewSteps.Locus;
import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Evaluation#getSpecification_Evaluation <em>Specification Evaluation</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Evaluation#getLocus_Evaluation <em>Locus Evaluation</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getEvaluation()
 * @model abstract="true"
 * @generated
 */
public interface Evaluation extends SemanticVisitor {
	/**
	 * Returns the value of the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Evaluation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Evaluation</em>' reference.
	 * @see #setSpecification_Evaluation(ValueSpecification)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getEvaluation_Specification_Evaluation()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecification getSpecification_Evaluation();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Evaluation#getSpecification_Evaluation <em>Specification Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Evaluation</em>' reference.
	 * @see #getSpecification_Evaluation()
	 * @generated
	 */
	void setSpecification_Evaluation(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Evaluation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Evaluation</em>' reference.
	 * @see #setLocus_Evaluation(Locus)
	 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getEvaluation_Locus_Evaluation()
	 * @model required="true"
	 * @generated
	 */
	Locus getLocus_Evaluation();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Evaluation#getLocus_Evaluation <em>Locus Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Evaluation</em>' reference.
	 * @see #getLocus_Evaluation()
	 * @generated
	 */
	void setLocus_Evaluation(Locus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void evaluate(Value value);

} // Evaluation
