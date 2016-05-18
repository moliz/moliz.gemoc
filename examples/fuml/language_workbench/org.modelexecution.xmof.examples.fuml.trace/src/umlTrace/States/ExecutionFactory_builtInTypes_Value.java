/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

import umlTrace.States.uml.TracedPrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Factory built In Types Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getExecutionFactory_builtInTypes_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/builtInTypes'"
 * @generated
 */
public interface ExecutionFactory_builtInTypes_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Built In Types</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.uml.TracedPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Types</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_builtInTypes_Value_BuiltInTypes()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/builtInTypes'"
	 * @generated
	 */
	EList<TracedPrimitiveType> getBuiltInTypes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getBuiltInTypesSequence <em>Built In Types Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecutionFactory)
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_builtInTypes_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getBuiltInTypesSequence
	 * @model opposite="builtInTypesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecutionFactory getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecutionFactory value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getExecutionFactory_builtInTypes_Values <em>Execution Factory built In Types Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_builtInTypes_Value_States()
	 * @see umlTrace.States.State#getExecutionFactory_builtInTypes_Values
	 * @model opposite="executionFactory_builtInTypes_Values" required="true"
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

} // ExecutionFactory_builtInTypes_Value
