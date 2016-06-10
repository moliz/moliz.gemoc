/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Input;

import fumlConfigurationTrace.States.InputParameterValues_name_Value;
import fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input Parameter Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence <em>Name Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence <em>Parameter Values Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues()
 * @model
 * @generated
 */
public interface TracedInputParameterValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.InputParameterValues_name_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.InputParameterValues_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues_NameSequence()
	 * @see fumlConfigurationTrace.States.InputParameterValues_name_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputParameterValues_name_Value> getNameSequence();

	/**
	 * Returns the value of the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage#getTracedInputParameterValues_ParameterValuesSequence()
	 * @see fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputParameterValues_parameterValues_Value> getParameterValuesSequence();

} // TracedInputParameterValues
