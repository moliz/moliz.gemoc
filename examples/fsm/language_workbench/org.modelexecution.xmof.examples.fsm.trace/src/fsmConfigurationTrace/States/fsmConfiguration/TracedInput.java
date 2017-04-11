/**
 */
package fsmConfigurationTrace.States.fsmConfiguration;

import fsmConfiguration.Input;

import fsmConfigurationTrace.States.Input_stringSeq_Dimension;
import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getInput_stringSeq_Dimension <em>Input string Seq Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedInput()
 * @model
 * @generated
 */
public interface TracedInput extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * Returns the value of the '<em><b>Input string Seq Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input string Seq Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input string Seq Dimension</em>' containment reference.
	 * @see #setInput_stringSeq_Dimension(Input_stringSeq_Dimension)
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedInput_Input_stringSeq_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Input_stringSeq_Dimension getInput_stringSeq_Dimension();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getInput_stringSeq_Dimension <em>Input string Seq Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input string Seq Dimension</em>' containment reference.
	 * @see #getInput_stringSeq_Dimension()
	 * @generated
	 */
	void setInput_stringSeq_Dimension(Input_stringSeq_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Input)
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#getTracedInput_OriginalObject()
	 * @model
	 * @generated
	 */
	Input getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Input value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\r\nresult.addAll(super.getDimensionsInternal());\r\nresult.add(getInput_stringSeq_Dimension());\r\nreturn result;\r\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedInput
