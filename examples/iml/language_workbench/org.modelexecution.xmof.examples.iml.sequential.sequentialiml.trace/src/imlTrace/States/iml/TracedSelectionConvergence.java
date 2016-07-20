/**
 */
package imlTrace.States.iml;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Selection Convergence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedSelectionConvergence#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedSelectionConvergence()
 * @model
 * @generated
 */
public interface TracedSelectionConvergence extends TracedIdentifyableElement, TracedConnectionPoint {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(SelectionConvergence)
	 * @see imlTrace.States.iml.ImlPackage#getTracedSelectionConvergence_OriginalObject()
	 * @model
	 * @generated
	 */
	SelectionConvergence getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedSelectionConvergence#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(SelectionConvergence value);

} // TracedSelectionConvergence
