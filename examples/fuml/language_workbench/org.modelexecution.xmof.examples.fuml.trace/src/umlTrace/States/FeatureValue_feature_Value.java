/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;

import umlTrace.States.uml.TracedStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.FeatureValue_feature_Value#getFeature <em>Feature</em>}</li>
 *   <li>{@link umlTrace.States.FeatureValue_feature_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.FeatureValue_feature_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getFeatureValue_feature_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/feature'"
 * @generated
 */
public interface FeatureValue_feature_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(TracedStructuralFeature)
	 * @see umlTrace.States.StatesPackage#getFeatureValue_feature_Value_Feature()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/FeatureValue/feature'"
	 * @generated
	 */
	TracedStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link umlTrace.States.FeatureValue_feature_Value#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(TracedStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getFeatureSequence <em>Feature Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFeatureValue)
	 * @see umlTrace.States.StatesPackage#getFeatureValue_feature_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getFeatureSequence
	 * @model opposite="featureSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFeatureValue getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.FeatureValue_feature_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getFeatureValue_feature_Values <em>Feature Value feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getFeatureValue_feature_Value_States()
	 * @see umlTrace.States.State#getFeatureValue_feature_Values
	 * @model opposite="featureValue_feature_Values" required="true"
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

} // FeatureValue_feature_Value
