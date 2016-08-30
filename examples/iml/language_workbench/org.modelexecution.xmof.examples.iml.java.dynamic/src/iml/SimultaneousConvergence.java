/**
 */
package iml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simultaneous Convergence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see iml.ImlPackage#getSimultaneousConvergence()
 * @model
 * @generated
 */
public interface SimultaneousConvergence extends IdentifyableElement, ConnectionPoint {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allIncomingStatesActive(Header context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateAllIncomingStates(Header context);

} // SimultaneousConvergence
