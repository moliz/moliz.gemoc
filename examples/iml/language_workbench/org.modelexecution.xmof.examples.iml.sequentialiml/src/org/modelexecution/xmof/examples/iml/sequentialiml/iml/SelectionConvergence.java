/**
 */
package org.modelexecution.xmof.examples.iml.sequentialiml.iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Convergence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage#getSelectionConvergence()
 * @model
 * @generated
 */
public interface SelectionConvergence extends IdentifyableElement, ConnectionPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doFire();

} // SelectionConvergence
