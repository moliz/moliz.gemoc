/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps;

import fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor#getRuntimeModelElementSequence <em>Runtime Model Element Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getTracedSemanticVisitor()
 * @model
 * @generated
 */
public interface TracedSemanticVisitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Model Element Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Model Element Sequence</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage#getTracedSemanticVisitor_RuntimeModelElementSequence()
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SemanticVisitor_runtimeModelElement_Value> getRuntimeModelElementSequence();

} // TracedSemanticVisitor
