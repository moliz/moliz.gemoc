/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors;

import fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value;
import fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence <em>Parameter Parameter Value Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence <em>Values Parameter Value Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue()
 * @model
 * @generated
 */
public interface TracedParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Parameter Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Parameter Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Parameter Value Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue_Parameter_ParameterValueSequence()
	 * @see fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ParameterValue_parameter_ParameterValue_Value> getParameter_ParameterValueSequence();

	/**
	 * Returns the value of the '<em><b>Values Parameter Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Parameter Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Parameter Value Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedParameterValue_Values_ParameterValueSequence()
	 * @see fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ParameterValue_values_ParameterValue_Value> getValues_ParameterValueSequence();

} // TracedParameterValue
