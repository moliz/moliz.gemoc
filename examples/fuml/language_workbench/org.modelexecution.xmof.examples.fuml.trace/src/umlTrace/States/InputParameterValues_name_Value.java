/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter Values name Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.InputParameterValues_name_Value#getName <em>Name</em>}</li>
 *   <li>{@link umlTrace.States.InputParameterValues_name_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.InputParameterValues_name_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getInputParameterValues_name_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Input/InputParameterValues/name'"
 * @generated
 */
public interface InputParameterValues_name_Value extends Value {
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
	 * @see umlTrace.States.StatesPackage#getInputParameterValues_name_Value_Name()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Input/InputParameterValues/name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlTrace.States.InputParameterValues_name_Value#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence <em>Name Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInputParameterValues)
	 * @see umlTrace.States.StatesPackage#getInputParameterValues_name_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence
	 * @model opposite="nameSequence" required="true" transient="false"
	 * @generated
	 */
	TracedInputParameterValues getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.InputParameterValues_name_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInputParameterValues value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getInputParameterValues_name_Values <em>Input Parameter Values name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getInputParameterValues_name_Value_States()
	 * @see umlTrace.States.State#getInputParameterValues_name_Values
	 * @model opposite="inputParameterValues_name_Values" required="true"
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

} // InputParameterValues_name_Value
