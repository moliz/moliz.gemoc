/**
 */
package fumlConfigurationFewSteps;

import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ElementConfiguration#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage#getElementConfiguration()
 * @model
 * @generated
 */
public interface ElementConfiguration extends Element {
	/**
	 * Returns the value of the '<em><b>Semantic Visitor</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor</em>' reference list.
	 * @see fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage#getElementConfiguration_SemanticVisitor()
	 * @see fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement
	 * @model opposite="runtimeModelElement"
	 * @generated
	 */
	EList<SemanticVisitor> getSemanticVisitor();

} // ElementConfiguration
