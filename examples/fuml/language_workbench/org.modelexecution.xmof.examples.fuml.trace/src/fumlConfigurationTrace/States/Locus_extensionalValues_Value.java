/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locus extensional Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.Locus_extensionalValues_Value#getExtensionalValues <em>Extensional Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Locus_extensionalValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Locus_extensionalValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getLocus_extensionalValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/extensionalValues'"
 * @generated
 */
public interface Locus_extensionalValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Extensional Values</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensional Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensional Values</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getLocus_extensionalValues_Value_ExtensionalValues()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/extensionalValues'"
	 * @generated
	 */
	EList<TracedExtensionalValue> getExtensionalValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus#getExtensionalValuesSequence <em>Extensional Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedLocus)
	 * @see fumlConfigurationTrace.States.StatesPackage#getLocus_extensionalValues_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus#getExtensionalValuesSequence
	 * @model opposite="extensionalValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedLocus getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Locus_extensionalValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getLocus_extensionalValues_Values <em>Locus extensional Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getLocus_extensionalValues_Value_States()
	 * @see fumlConfigurationTrace.States.State#getLocus_extensionalValues_Values
	 * @model opposite="locus_extensionalValues_Values" required="true"
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

} // Locus_extensionalValues_Value
