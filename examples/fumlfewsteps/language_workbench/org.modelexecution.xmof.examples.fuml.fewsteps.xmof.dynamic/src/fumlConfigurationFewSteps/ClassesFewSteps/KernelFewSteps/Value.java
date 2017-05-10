/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps;

import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends SemanticVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typesMany="true"
	 * @generated
	 */
	void getTypes(EList<Classifier> types);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void copy(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void new_(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherValueRequired="true" returnRequired="true"
	 * @generated
	 */
	void equals(Value otherValue, boolean return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true" hasTypeRequired="true"
	 * @generated
	 */
	void hasType(Classifier type, boolean hasType);

} // Value
