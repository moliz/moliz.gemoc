/**
 */
package org.modelexecution.xmof.examples.iml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.xmof.examples.iml.ImlPackage
 * @generated
 */
public interface ImlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImlFactory eINSTANCE = org.modelexecution.xmof.examples.iml.impl.ImlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Data</em>'.
	 * @generated
	 */
	AddData createAddData();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition</em>'.
	 * @generated
	 */
	StateTransition createStateTransition();

	/**
	 * Returns a new object of class '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump</em>'.
	 * @generated
	 */
	Jump createJump();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Simultaneous Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simultaneous Divergence</em>'.
	 * @generated
	 */
	SimultaneousDivergence createSimultaneousDivergence();

	/**
	 * Returns a new object of class '<em>Simultaneous Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simultaneous Convergence</em>'.
	 * @generated
	 */
	SimultaneousConvergence createSimultaneousConvergence();

	/**
	 * Returns a new object of class '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Divergence</em>'.
	 * @generated
	 */
	SelectionDivergence createSelectionDivergence();

	/**
	 * Returns a new object of class '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Convergence</em>'.
	 * @generated
	 */
	SelectionConvergence createSelectionConvergence();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImlPackage getImlPackage();

} //ImlFactory
