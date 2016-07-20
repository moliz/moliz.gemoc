/**
 */
package imlTrace.States.iml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imlTrace.States.iml.ImlPackage
 * @generated
 */
public interface ImlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImlFactory eINSTANCE = imlTrace.States.iml.impl.ImlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity</em>'.
	 * @generated
	 */
	TracedActivity createTracedActivity();

	/**
	 * Returns a new object of class '<em>Traced Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Add Data</em>'.
	 * @generated
	 */
	TracedAddData createTracedAddData();

	/**
	 * Returns a new object of class '<em>Traced Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Connection</em>'.
	 * @generated
	 */
	TracedConnection createTracedConnection();

	/**
	 * Returns a new object of class '<em>Traced Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Event</em>'.
	 * @generated
	 */
	TracedEvent createTracedEvent();

	/**
	 * Returns a new object of class '<em>Traced Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Header</em>'.
	 * @generated
	 */
	TracedHeader createTracedHeader();

	/**
	 * Returns a new object of class '<em>Traced Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Jump</em>'.
	 * @generated
	 */
	TracedJump createTracedJump();

	/**
	 * Returns a new object of class '<em>Traced Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Selection Convergence</em>'.
	 * @generated
	 */
	TracedSelectionConvergence createTracedSelectionConvergence();

	/**
	 * Returns a new object of class '<em>Traced Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Selection Divergence</em>'.
	 * @generated
	 */
	TracedSelectionDivergence createTracedSelectionDivergence();

	/**
	 * Returns a new object of class '<em>Traced Simultaneous Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Simultaneous Convergence</em>'.
	 * @generated
	 */
	TracedSimultaneousConvergence createTracedSimultaneousConvergence();

	/**
	 * Returns a new object of class '<em>Traced Simultaneous Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Simultaneous Divergence</em>'.
	 * @generated
	 */
	TracedSimultaneousDivergence createTracedSimultaneousDivergence();

	/**
	 * Returns a new object of class '<em>Traced State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced State</em>'.
	 * @generated
	 */
	TracedState createTracedState();

	/**
	 * Returns a new object of class '<em>Traced State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced State Transition</em>'.
	 * @generated
	 */
	TracedStateTransition createTracedStateTransition();

	/**
	 * Returns a new object of class '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Variable</em>'.
	 * @generated
	 */
	TracedVariable createTracedVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImlPackage getImlPackage();

} //ImlFactory
