/**
 */
package org.modelexecution.xmof.examples.iml.sequentialiml.iml;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint#isFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage#getConnectionPoint()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' attribute.
	 * @see #setFiring(boolean)
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage#getConnectionPoint_Firing()
	 * @model
	 * @generated
	 */
	boolean isFiring();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint#isFiring <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing</em>' attribute.
	 * @see #isFiring()
	 * @generated
	 */
	void setFiring(boolean value);

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
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doFire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.modelexecution.xmof.examples.iml.sequentialiml.iml.Iterable"
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	Iterable getPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.modelexecution.xmof.examples.iml.sequentialiml.iml.Iterable"
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	Iterable getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ConnectionPoint getSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ConnectionPoint getTarget();

} // ConnectionPoint
