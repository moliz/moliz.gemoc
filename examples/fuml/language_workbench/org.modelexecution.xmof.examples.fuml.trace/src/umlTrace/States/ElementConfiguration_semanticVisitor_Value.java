/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import umlTrace.States.fumlConfiguration.TracedElementConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Configuration semantic Visitor Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 *   <li>{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getElementConfiguration_semanticVisitor_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ElementConfiguration/semanticVisitor'"
 * @generated
 */
public interface ElementConfiguration_semanticVisitor_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedElementConfiguration)
	 * @see umlTrace.States.StatesPackage#getElementConfiguration_semanticVisitor_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence
	 * @model opposite="semanticVisitorSequence" required="true" transient="false"
	 * @generated
	 */
	TracedElementConfiguration getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedElementConfiguration value);

	/**
	 * Returns the value of the '<em><b>Semantic Visitor</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getElementConfiguration_semanticVisitor_Value_SemanticVisitor()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ElementConfiguration/semanticVisitor'"
	 * @generated
	 */
	EList<TracedSemanticVisitor> getSemanticVisitor();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getElementConfiguration_semanticVisitor_Values <em>Element Configuration semantic Visitor Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getElementConfiguration_semanticVisitor_Value_States()
	 * @see umlTrace.States.State#getElementConfiguration_semanticVisitor_Values
	 * @model opposite="elementConfiguration_semanticVisitor_Values" required="true"
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

} // ElementConfiguration_semanticVisitor_Value
