/**
 */
package umlTrace.States.fumlConfiguration.Input;

import fumlConfiguration.Input.InputParameterValues;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.InputParameterValues_name_Value;
import umlTrace.States.InputParameterValues_parameterValues_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input Parameter Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence <em>Name Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence <em>Parameter Values Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Input/InputParameterValues'"
 * @generated
 */
public interface TracedInputParameterValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.InputParameterValues_name_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.InputParameterValues_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues_NameSequence()
	 * @see umlTrace.States.InputParameterValues_name_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputParameterValues_name_Value> getNameSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(InputParameterValues)
	 * @see umlTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues_OriginalObject()
	 * @model
	 * @generated
	 */
	InputParameterValues getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(InputParameterValues value);

	/**
	 * Returns the value of the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.InputParameterValues_parameterValues_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.InputParameterValues_parameterValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues_ParameterValuesSequence()
	 * @see umlTrace.States.InputParameterValues_parameterValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputParameterValues_parameterValues_Value> getParameterValuesSequence();

} // TracedInputParameterValues
