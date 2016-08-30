/**
 */
package org.modelexecution.xmof.examples.iml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getEarliestStart <em>Earliest Start</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getLatestStart <em>Latest Start</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getEarliestEnd <em>Earliest End</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getLatestEnd <em>Latest End</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.Time#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Earliest Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earliest Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Start</em>' attribute.
	 * @see #setEarliestStart(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_EarliestStart()
	 * @model
	 * @generated
	 */
	int getEarliestStart();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getEarliestStart <em>Earliest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Start</em>' attribute.
	 * @see #getEarliestStart()
	 * @generated
	 */
	void setEarliestStart(int value);

	/**
	 * Returns the value of the '<em><b>Latest Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Start</em>' attribute.
	 * @see #setLatestStart(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_LatestStart()
	 * @model
	 * @generated
	 */
	int getLatestStart();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getLatestStart <em>Latest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Start</em>' attribute.
	 * @see #getLatestStart()
	 * @generated
	 */
	void setLatestStart(int value);

	/**
	 * Returns the value of the '<em><b>Earliest End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earliest End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest End</em>' attribute.
	 * @see #setEarliestEnd(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_EarliestEnd()
	 * @model
	 * @generated
	 */
	int getEarliestEnd();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getEarliestEnd <em>Earliest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest End</em>' attribute.
	 * @see #getEarliestEnd()
	 * @generated
	 */
	void setEarliestEnd(int value);

	/**
	 * Returns the value of the '<em><b>Latest End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest End</em>' attribute.
	 * @see #setLatestEnd(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_LatestEnd()
	 * @model
	 * @generated
	 */
	int getLatestEnd();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getLatestEnd <em>Latest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest End</em>' attribute.
	 * @see #getLatestEnd()
	 * @generated
	 */
	void setLatestEnd(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see org.modelexecution.xmof.examples.iml.ImlPackage#getTime_Delay()
	 * @model
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.examples.iml.Time#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // Time
