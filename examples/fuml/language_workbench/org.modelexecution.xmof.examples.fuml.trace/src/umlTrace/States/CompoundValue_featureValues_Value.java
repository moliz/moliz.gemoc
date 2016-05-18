/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Value feature Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.CompoundValue_featureValues_Value#getFeatureValues <em>Feature Values</em>}</li>
 *   <li>{@link umlTrace.States.CompoundValue_featureValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.CompoundValue_featureValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getCompoundValue_featureValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/CompoundValue/featureValues'"
 * @generated
 */
public interface CompoundValue_featureValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Feature Values</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Values</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getCompoundValue_featureValues_Value_FeatureValues()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/CompoundValue/featureValues'"
	 * @generated
	 */
	EList<TracedFeatureValue> getFeatureValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue#getFeatureValuesSequence <em>Feature Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedCompoundValue)
	 * @see umlTrace.States.StatesPackage#getCompoundValue_featureValues_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue#getFeatureValuesSequence
	 * @model opposite="featureValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedCompoundValue getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.CompoundValue_featureValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedCompoundValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getCompoundValue_featureValues_Values <em>Compound Value feature Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getCompoundValue_featureValues_Value_States()
	 * @see umlTrace.States.State#getCompoundValue_featureValues_Values
	 * @model opposite="compoundValue_featureValues_Values" required="true"
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

} // CompoundValue_featureValues_Value
