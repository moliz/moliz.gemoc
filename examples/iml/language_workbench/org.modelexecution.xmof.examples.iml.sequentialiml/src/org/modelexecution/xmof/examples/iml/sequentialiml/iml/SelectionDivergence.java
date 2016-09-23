/**
 */
package org.modelexecution.xmof.examples.iml.sequentialiml.iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Divergence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage#getSelectionDivergence()
 * @model
 * @generated
 */
public interface SelectionDivergence extends IdentifyableElement, ConnectionPoint {
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

} // SelectionDivergence
