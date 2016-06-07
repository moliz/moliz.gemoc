/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensional Value locus Extensional Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getExtensionalValue_locus_ExtensionalValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/ExtensionalValue/locus_ExtensionalValue'"
 * @generated
 */
public interface ExtensionalValue_locus_ExtensionalValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Locus Extensional Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Extensional Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Extensional Value</em>' reference.
	 * @see #setLocus_ExtensionalValue(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/ExtensionalValue/locus_ExtensionalValue'"
	 * @generated
	 */
	TracedLocus getLocus_ExtensionalValue();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Extensional Value</em>' reference.
	 * @see #getLocus_ExtensionalValue()
	 * @generated
	 */
	void setLocus_ExtensionalValue(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue#getLocus_ExtensionalValueSequence <em>Locus Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExtensionalValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getExtensionalValue_locus_ExtensionalValue_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue#getLocus_ExtensionalValueSequence
	 * @model opposite="locus_ExtensionalValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExtensionalValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExtensionalValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getExtensionalValue_locus_ExtensionalValue_Values <em>Extensional Value locus Extensional Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getExtensionalValue_locus_ExtensionalValue_Value_States()
	 * @see fumlConfigurationTrace.States.State#getExtensionalValue_locus_ExtensionalValue_Values
	 * @model opposite="extensionalValue_locus_ExtensionalValue_Values" required="true"
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

} // ExtensionalValue_locus_ExtensionalValue_Value
