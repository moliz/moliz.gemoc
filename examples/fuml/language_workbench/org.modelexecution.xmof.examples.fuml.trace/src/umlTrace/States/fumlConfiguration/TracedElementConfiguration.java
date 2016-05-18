/**
 */
package umlTrace.States.fumlConfiguration;

import fumlConfiguration.ElementConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ElementConfiguration_semanticVisitor_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ElementConfiguration'"
 * @generated
 */
public interface TracedElementConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ElementConfiguration)
	 * @see umlTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration_OriginalObject()
	 * @model
	 * @generated
	 */
	ElementConfiguration getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ElementConfiguration value);

	/**
	 * Returns the value of the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ElementConfiguration_semanticVisitor_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration_SemanticVisitorSequence()
	 * @see umlTrace.States.ElementConfiguration_semanticVisitor_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ElementConfiguration_semanticVisitor_Value> getSemanticVisitorSequence();

} // TracedElementConfiguration
