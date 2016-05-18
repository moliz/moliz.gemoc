/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locus factory Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Locus_factory_Value#getFactory <em>Factory</em>}</li>
 *   <li>{@link umlTrace.States.Locus_factory_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Locus_factory_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getLocus_factory_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/factory'"
 * @generated
 */
public interface Locus_factory_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' reference.
	 * @see #setFactory(TracedExecutionFactory)
	 * @see umlTrace.States.StatesPackage#getLocus_factory_Value_Factory()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/Locus/factory'"
	 * @generated
	 */
	TracedExecutionFactory getFactory();

	/**
	 * Sets the value of the '{@link umlTrace.States.Locus_factory_Value#getFactory <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' reference.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(TracedExecutionFactory value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getFactorySequence <em>Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedLocus)
	 * @see umlTrace.States.StatesPackage#getLocus_factory_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus#getFactorySequence
	 * @model opposite="factorySequence" required="true" transient="false"
	 * @generated
	 */
	TracedLocus getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Locus_factory_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedLocus value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getLocus_factory_Values <em>Locus factory Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getLocus_factory_Value_States()
	 * @see umlTrace.States.State#getLocus_factory_Values
	 * @model opposite="locus_factory_Values" required="true"
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

} // Locus_factory_Value
