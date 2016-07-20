/**
 */
package org.modelexecution.xmof.examples.iml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.StateTransition#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.StateTransition#getBooleanGuard <em>Boolean Guard</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.StateTransition#getEventGuard <em>Event Guard</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getStateTransition()
 * @model
 * @generated
 */
public interface StateTransition extends IdentifyableElement, ConnectionPoint {
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
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getStateTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.StateTransition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Boolean Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Guard</em>' reference.
	 * @see #setBooleanGuard(Variable)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getStateTransition_BooleanGuard()
	 * @model
	 * @generated
	 */
	Variable getBooleanGuard();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.StateTransition#getBooleanGuard <em>Boolean Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Guard</em>' reference.
	 * @see #getBooleanGuard()
	 * @generated
	 */
	void setBooleanGuard(Variable value);

	/**
	 * Returns the value of the '<em><b>Event Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Guard</em>' reference.
	 * @see #setEventGuard(Event)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getStateTransition_EventGuard()
	 * @model
	 * @generated
	 */
	Event getEventGuard();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.StateTransition#getEventGuard <em>Event Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Guard</em>' reference.
	 * @see #getEventGuard()
	 * @generated
	 */
	void setEventGuard(Event value);

} // StateTransition
