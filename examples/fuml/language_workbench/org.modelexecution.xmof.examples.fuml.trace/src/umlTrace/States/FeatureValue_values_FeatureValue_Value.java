/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value values Feature Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getStates <em>States</em>}</li>
 *   <li>{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getValues_FeatureValue <em>Values Feature Value</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getFeatureValue_values_FeatureValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/values_FeatureValue'"
 * @generated
 */
public interface FeatureValue_values_FeatureValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getValues_FeatureValueSequence <em>Values Feature Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFeatureValue)
	 * @see umlTrace.States.StatesPackage#getFeatureValue_values_FeatureValue_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getValues_FeatureValueSequence
	 * @model opposite="values_FeatureValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFeatureValue getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedFeatureValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getFeatureValue_values_FeatureValue_Values <em>Feature Value values Feature Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getFeatureValue_values_FeatureValue_Value_States()
	 * @see umlTrace.States.State#getFeatureValue_values_FeatureValue_Values
	 * @model opposite="featureValue_values_FeatureValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Values Feature Value</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Feature Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Feature Value</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getFeatureValue_values_FeatureValue_Value_Values_FeatureValue()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/values_FeatureValue'"
	 * @generated
	 */
	EList<TracedValue> getValues_FeatureValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // FeatureValue_values_FeatureValue_Value
