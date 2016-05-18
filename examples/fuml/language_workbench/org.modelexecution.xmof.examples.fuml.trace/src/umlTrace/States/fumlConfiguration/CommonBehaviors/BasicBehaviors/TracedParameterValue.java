/**
 */
package umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ParameterValue_parameter_ParameterValue_Value;
import umlTrace.States.ParameterValue_values_ParameterValue_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence <em>Parameter Parameter Value Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence <em>Values Parameter Value Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/ParameterValue'"
 * @generated
 */
public interface TracedParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ParameterValue)
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue_OriginalObject()
	 * @model
	 * @generated
	 */
	ParameterValue getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ParameterValue value);

	/**
	 * Returns the value of the '<em><b>Parameter Parameter Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Parameter Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Parameter Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue_Parameter_ParameterValueSequence()
	 * @see umlTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ParameterValue_parameter_ParameterValue_Value> getParameter_ParameterValueSequence();

	/**
	 * Returns the value of the '<em><b>Values Parameter Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ParameterValue_values_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ParameterValue_values_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Parameter Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Parameter Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue_Values_ParameterValueSequence()
	 * @see umlTrace.States.ParameterValue_values_ParameterValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ParameterValue_values_ParameterValue_Value> getValues_ParameterValueSequence();

} // TracedParameterValue
