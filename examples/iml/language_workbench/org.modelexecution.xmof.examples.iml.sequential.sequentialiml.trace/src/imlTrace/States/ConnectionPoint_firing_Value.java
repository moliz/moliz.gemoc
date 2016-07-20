/**
 */
package imlTrace.States;

import imlTrace.States.iml.TracedConnectionPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point firing Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.ConnectionPoint_firing_Value#isFiring <em>Firing</em>}</li>
 *   <li>{@link imlTrace.States.ConnectionPoint_firing_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link imlTrace.States.ConnectionPoint_firing_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see imlTrace.States.StatesPackage#getConnectionPoint_firing_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ConnectionPoint_firing_Value extends Value {
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
	 * @see imlTrace.States.StatesPackage#getConnectionPoint_firing_Value_Firing()
	 * @model
	 * @generated
	 */
	boolean isFiring();

	/**
	 * Sets the value of the '{@link imlTrace.States.ConnectionPoint_firing_Value#isFiring <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing</em>' attribute.
	 * @see #isFiring()
	 * @generated
	 */
	void setFiring(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.iml.TracedConnectionPoint#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedConnectionPoint)
	 * @see imlTrace.States.StatesPackage#getConnectionPoint_firing_Value_Parent()
	 * @see imlTrace.States.iml.TracedConnectionPoint#getFiringSequence
	 * @model opposite="firingSequence" required="true" transient="false"
	 * @generated
	 */
	TracedConnectionPoint getParent();

	/**
	 * Sets the value of the '{@link imlTrace.States.ConnectionPoint_firing_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link imlTrace.States.State#getConnectionPoint_firing_Values <em>Connection Point firing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see imlTrace.States.StatesPackage#getConnectionPoint_firing_Value_States()
	 * @see imlTrace.States.State#getConnectionPoint_firing_Values
	 * @model opposite="connectionPoint_firing_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ConnectionPoint_firing_Value
