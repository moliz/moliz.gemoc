/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution;

import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Factory primitive Behavior Prototypes Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}</li>
 *   <li>{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getExecutionFactory_primitiveBehaviorPrototypes_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/primitiveBehaviorPrototypes'"
 * @generated
 */
public interface ExecutionFactory_primitiveBehaviorPrototypes_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getPrimitiveBehaviorPrototypesSequence <em>Primitive Behavior Prototypes Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedExecutionFactory)
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getPrimitiveBehaviorPrototypesSequence
	 * @model opposite="primitiveBehaviorPrototypesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedExecutionFactory getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedExecutionFactory value);

	/**
	 * Returns the value of the '<em><b>Primitive Behavior Prototypes</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Behavior Prototypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Behavior Prototypes</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionFactory/primitiveBehaviorPrototypes'"
	 * @generated
	 */
	EList<TracedOpaqueBehaviorExecution> getPrimitiveBehaviorPrototypes();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getExecutionFactory_primitiveBehaviorPrototypes_Values <em>Execution Factory primitive Behavior Prototypes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getExecutionFactory_primitiveBehaviorPrototypes_Value_States()
	 * @see umlTrace.States.State#getExecutionFactory_primitiveBehaviorPrototypes_Values
	 * @model opposite="executionFactory_primitiveBehaviorPrototypes_Values" required="true"
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

} // ExecutionFactory_primitiveBehaviorPrototypes_Value
