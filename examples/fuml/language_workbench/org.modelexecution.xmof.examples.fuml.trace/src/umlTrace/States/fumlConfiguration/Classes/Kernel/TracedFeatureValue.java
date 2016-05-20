/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.FeatureValue_feature_Value;
import umlTrace.States.FeatureValue_position_Value;
import umlTrace.States.FeatureValue_values_FeatureValue_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getFeatureSequence <em>Feature Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getPositionSequence <em>Position Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getValues_FeatureValueSequence <em>Values Feature Value Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedFeatureValue()
 * @model abstract="true"
 * @generated
 */
public interface TracedFeatureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.FeatureValue_feature_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.FeatureValue_feature_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedFeatureValue_FeatureSequence()
	 * @see umlTrace.States.FeatureValue_feature_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FeatureValue_feature_Value> getFeatureSequence();

	/**
	 * Returns the value of the '<em><b>Position Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.FeatureValue_position_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.FeatureValue_position_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedFeatureValue_PositionSequence()
	 * @see umlTrace.States.FeatureValue_position_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FeatureValue_position_Value> getPositionSequence();

	/**
	 * Returns the value of the '<em><b>Values Feature Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.FeatureValue_values_FeatureValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Feature Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Feature Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedFeatureValue_Values_FeatureValueSequence()
	 * @see umlTrace.States.FeatureValue_values_FeatureValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FeatureValue_values_FeatureValue_Value> getValues_FeatureValueSequence();

} // TracedFeatureValue
