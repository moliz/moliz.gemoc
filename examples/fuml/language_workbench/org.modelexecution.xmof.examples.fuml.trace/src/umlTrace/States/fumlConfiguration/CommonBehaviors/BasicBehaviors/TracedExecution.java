/**
 */
package umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.Execution_context_Value;
import umlTrace.States.Execution_parameterValues_Value;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getContextSequence <em>Context Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getParameterValuesSequence <em>Parameter Values Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedExecution()
 * @model abstract="true"
 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/Execution'"
 * @generated
 */
public interface TracedExecution extends TracedObject {
	/**
	 * Returns the value of the '<em><b>Context Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Execution_context_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Execution_context_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedExecution_ContextSequence()
	 * @see umlTrace.States.Execution_context_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Execution_context_Value> getContextSequence();

	/**
	 * Returns the value of the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Execution_parameterValues_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Execution_parameterValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getTracedExecution_ParameterValuesSequence()
	 * @see umlTrace.States.Execution_parameterValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Execution_parameterValues_Value> getParameterValuesSequence();

} // TracedExecution
