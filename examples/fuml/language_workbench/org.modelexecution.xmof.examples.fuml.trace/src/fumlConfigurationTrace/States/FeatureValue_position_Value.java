/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value position Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getPosition <em>Position</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getFeatureValue_position_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/position'"
 * @generated
 */
public interface FeatureValue_position_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getPositionSequence <em>Position Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFeatureValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getFeatureValue_position_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getPositionSequence
	 * @model opposite="positionSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFeatureValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedFeatureValue value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see fumlConfigurationTrace.States.StatesPackage#getFeatureValue_position_Value_Position()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/position'"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.FeatureValue_position_Value#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getFeatureValue_position_Values <em>Feature Value position Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getFeatureValue_position_Value_States()
	 * @see fumlConfigurationTrace.States.State#getFeatureValue_position_Values
	 * @model opposite="featureValue_position_Values" required="true"
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

} // FeatureValue_position_Value
