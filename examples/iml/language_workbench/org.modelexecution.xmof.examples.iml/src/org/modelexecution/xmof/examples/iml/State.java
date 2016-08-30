/**
 */
package org.modelexecution.xmof.examples.iml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.State#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.State#isInit <em>Init</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.State#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.State#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getState()
 * @model
 * @generated
 */
public interface State extends IdentifyableElement, ConnectionPoint {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getState_Init()
	 * @model
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.State#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' attribute.
	 * @see #setTerminal(boolean)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getState_Terminal()
	 * @model
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.State#isTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #isTerminal()
	 * @generated
	 */
	void setTerminal(boolean value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.xmof.examples.iml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getState_Activities()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

} // State
