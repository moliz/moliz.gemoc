/**
 */
package fumlConfigurationFewSteps.LociFewSteps;

import fumlConfigurationFewSteps.ElementConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getSemanticVisitor()
 * @model
 * @generated
 */
public interface SemanticVisitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Model Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.ElementConfiguration#getSemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Model Element</em>' reference.
	 * @see #setRuntimeModelElement(ElementConfiguration)
	 * @see fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getSemanticVisitor_RuntimeModelElement()
	 * @see fumlConfigurationFewSteps.ElementConfiguration#getSemanticVisitor
	 * @model opposite="semanticVisitor"
	 * @generated
	 */
	ElementConfiguration getRuntimeModelElement();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Model Element</em>' reference.
	 * @see #getRuntimeModelElement()
	 * @generated
	 */
	void setRuntimeModelElement(ElementConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // SemanticVisitor
