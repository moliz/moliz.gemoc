/**
 */
package fumlConfigurationTrace.States.fumlConfiguration;

import fumlConfiguration.ElementConfiguration;

import fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject_ElementConfiguration <em>Original Object Element Configuration</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//ElementConfiguration'"
 * @generated
 */
public interface TracedElementConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Element Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Element Configuration</em>' reference.
	 * @see #setOriginalObject_ElementConfiguration(ElementConfiguration)
	 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration_OriginalObject_ElementConfiguration()
	 * @model
	 * @generated
	 */
	ElementConfiguration getOriginalObject_ElementConfiguration();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject_ElementConfiguration <em>Original Object Element Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Element Configuration</em>' reference.
	 * @see #getOriginalObject_ElementConfiguration()
	 * @generated
	 */
	void setOriginalObject_ElementConfiguration(ElementConfiguration value);

	/**
	 * Returns the value of the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedElementConfiguration_SemanticVisitorSequence()
	 * @see fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ElementConfiguration_semanticVisitor_Value> getSemanticVisitorSequence();

} // TracedElementConfiguration
