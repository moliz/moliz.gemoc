/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors;

import fumlConfiguration.Classes.Kernel.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter_ParameterValue <em>Parameter Parameter Value</em>}</li>
 *   <li>{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getValues_ParameterValue <em>Values Parameter Value</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue()
 * @model
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Parameter Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Parameter Value</em>' reference.
	 * @see #setParameter_ParameterValue(Parameter)
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue_Parameter_ParameterValue()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter_ParameterValue();

	/**
	 * Sets the value of the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter_ParameterValue <em>Parameter Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Parameter Value</em>' reference.
	 * @see #getParameter_ParameterValue()
	 * @generated
	 */
	void setParameter_ParameterValue(Parameter value);

	/**
	 * Returns the value of the '<em><b>Values Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.Classes.Kernel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Parameter Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Parameter Value</em>' containment reference list.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue_Values_ParameterValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues_ParameterValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void copy(ParameterValue value);

} // ParameterValue
