/**
 */
package fumlConfigurationFewStepsTrace.States;

import fumlConfigurationFewSteps.ElementConfiguration;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Visitor runtime Model Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement <em>Runtime Model Element</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getSemanticVisitor_runtimeModelElement_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//LociFewSteps/SemanticVisitor/runtimeModelElement'"
 * @generated
 */
public interface SemanticVisitor_runtimeModelElement_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor#getRuntimeModelElementSequence <em>Runtime Model Element Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedSemanticVisitor)
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getSemanticVisitor_runtimeModelElement_Value_Parent()
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor#getRuntimeModelElementSequence
	 * @model opposite="runtimeModelElementSequence" required="true" transient="false"
	 * @generated
	 */
	TracedSemanticVisitor getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedSemanticVisitor value);

	/**
	 * Returns the value of the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Model Element</em>' reference.
	 * @see #setRuntimeModelElement(ElementConfiguration)
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//LociFewSteps/SemanticVisitor/runtimeModelElement'"
	 * @generated
	 */
	ElementConfiguration getRuntimeModelElement();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement <em>Runtime Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Model Element</em>' reference.
	 * @see #getRuntimeModelElement()
	 * @generated
	 */
	void setRuntimeModelElement(ElementConfiguration value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationFewStepsTrace.States.State#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#getSemanticVisitor_runtimeModelElement_Value_States()
	 * @see fumlConfigurationFewStepsTrace.States.State#getSemanticVisitor_runtimeModelElement_Values
	 * @model opposite="semanticVisitor_runtimeModelElement_Values" required="true"
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

} // SemanticVisitor_runtimeModelElement_Value
