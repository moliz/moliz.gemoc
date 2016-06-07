/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference referent Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.Reference_referent_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Reference_referent_Value#getReferent <em>Referent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.Reference_referent_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getReference_referent_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Reference/referent'"
 * @generated
 */
public interface Reference_referent_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference#getReferentSequence <em>Referent Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedReference)
	 * @see fumlConfigurationTrace.States.StatesPackage#getReference_referent_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference#getReferentSequence
	 * @model opposite="referentSequence" required="true" transient="false"
	 * @generated
	 */
	TracedReference getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Reference_referent_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedReference value);

	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(TracedObject)
	 * @see fumlConfigurationTrace.States.StatesPackage#getReference_referent_Value_Referent()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/Reference/referent'"
	 * @generated
	 */
	TracedObject getReferent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.Reference_referent_Value#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(TracedObject value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getReference_referent_Values <em>Reference referent Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getReference_referent_Value_States()
	 * @see fumlConfigurationTrace.States.State#getReference_referent_Values
	 * @model opposite="reference_referent_Values" required="true"
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

} // Reference_referent_Value
