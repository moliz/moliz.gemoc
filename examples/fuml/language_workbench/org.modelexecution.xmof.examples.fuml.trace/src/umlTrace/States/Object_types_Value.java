/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;

import umlTrace.States.uml.TracedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object types Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Object_types_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Object_types_Value#getStates <em>States</em>}</li>
 *   <li>{@link umlTrace.States.Object_types_Value#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getObject_types_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Object/types'"
 * @generated
 */
public interface Object_types_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject#getTypesSequence <em>Types Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedObject)
	 * @see umlTrace.States.StatesPackage#getObject_types_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject#getTypesSequence
	 * @model opposite="typesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedObject getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Object_types_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedObject value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getObject_types_Values <em>Object types Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getObject_types_Value_States()
	 * @see umlTrace.States.State#getObject_types_Values
	 * @model opposite="object_types_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.uml.TracedClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getObject_types_Value_Types()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Object/types'"
	 * @generated
	 */
	EList<TracedClass> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Object_types_Value
