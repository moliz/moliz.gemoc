/**
 */
package imlTrace.States.iml;

import imlTrace.States.ConnectionPoint_firing_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.TracedConnectionPoint#getFiringSequence <em>Firing Sequence</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.iml.ImlPackage#getTracedConnectionPoint()
 * @model abstract="true"
 * @generated
 */
public interface TracedConnectionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.ConnectionPoint_firing_Value}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.ConnectionPoint_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing Sequence</em>' containment reference list.
	 * @see imlTrace.States.iml.ImlPackage#getTracedConnectionPoint_FiringSequence()
	 * @see imlTrace.States.ConnectionPoint_firing_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ConnectionPoint_firing_Value> getFiringSequence();

} // TracedConnectionPoint
