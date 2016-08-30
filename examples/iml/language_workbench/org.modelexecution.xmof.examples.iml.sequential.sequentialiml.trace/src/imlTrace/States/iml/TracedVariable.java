/**
 */
package imlTrace.States.iml;

import imlTrace.States.Variable_value_Value;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedVariable#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link imlTrace.States.iml.TracedVariable#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedVariable()
 * @model
 * @generated
 */
public interface TracedVariable extends TracedIdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Variable)
	 * @see imlTrace.States.iml.ImlPackage#getTracedVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	Variable getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Variable value);

	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.Variable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see imlTrace.States.iml.ImlPackage#getTracedVariable_ValueSequence()
	 * @see imlTrace.States.Variable_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_value_Value> getValueSequence();

} // TracedVariable
