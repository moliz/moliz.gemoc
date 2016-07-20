/**
 */
package imlTrace.States.iml;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedEvent#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedEvent()
 * @model
 * @generated
 */
public interface TracedEvent extends TracedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Event)
	 * @see imlTrace.States.iml.ImlPackage#getTracedEvent_OriginalObject()
	 * @model
	 * @generated
	 */
	Event getOriginalObject();

	/**
	 * Sets the value of the '{@link imlTrace.States.iml.TracedEvent#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Event value);

} // TracedEvent
