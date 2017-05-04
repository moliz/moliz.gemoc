/**
 */
package fumlConfigurationFewSteps.LociFewSteps;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.Executor#getLocus_Executor <em>Locus Executor</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getExecutor()
 * @model
 * @generated
 */
public interface Executor extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Executor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.LociFewSteps.Locus#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Executor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Executor</em>' container reference.
	 * @see #setLocus_Executor(Locus)
	 * @see fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getExecutor_Locus_Executor()
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus#getExecutor
	 * @model opposite="executor" transient="false"
	 * @generated
	 */
	Locus getLocus_Executor();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.LociFewSteps.Executor#getLocus_Executor <em>Locus Executor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Executor</em>' container reference.
	 * @see #getLocus_Executor()
	 * @generated
	 */
	void setLocus_Executor(Locus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model behaviorRequired="true" inputsMany="true" outputsMany="true"
	 * @generated
	 */
	void execute(Behavior behavior, fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context, EList<ParameterValue> inputs, EList<ParameterValue> outputs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specificationRequired="true" valueRequired="true"
	 * @generated
	 */
	void evaluate(ValueSpecification specification, Value value);

} // Executor
