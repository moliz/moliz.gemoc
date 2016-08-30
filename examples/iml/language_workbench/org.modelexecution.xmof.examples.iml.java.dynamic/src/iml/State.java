/**
 */
package iml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iml.State#getName <em>Name</em>}</li>
 *   <li>{@link iml.State#isInit <em>Init</em>}</li>
 *   <li>{@link iml.State#isCurrent <em>Current</em>}</li>
 *   <li>{@link iml.State#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link iml.State#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see iml.ImlPackage#getState()
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
	 * @see iml.ImlPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iml.State#getName <em>Name</em>}' attribute.
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
	 * @see iml.ImlPackage#getState_Init()
	 * @model
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link iml.State#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #setCurrent(boolean)
	 * @see iml.ImlPackage#getState_Current()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link iml.State#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);
	
	/**
	 * Unsets the value of the '{@link iml.State#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrent()
	 * @see #isCurrent()
	 * @see #setCurrent(boolean)
	 * @generated
	 */
	void unsetCurrent();

	/**
	 * Returns whether the value of the '{@link iml.State#isCurrent <em>Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current</em>' attribute is set.
	 * @see #unsetCurrent()
	 * @see #isCurrent()
	 * @see #setCurrent(boolean)
	 * @generated
	 */
	boolean isSetCurrent();

	void setCurrent(boolean value, Header context);

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
	 * @see iml.ImlPackage#getState_Terminal()
	 * @model
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * Sets the value of the '{@link iml.State#isTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #isTerminal()
	 * @generated
	 */
	void setTerminal(boolean value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link iml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see iml.ImlPackage#getState_Activities()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allActivitiesFinished();

} // State
