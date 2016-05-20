/**
 */
package umlTrace.States.fumlConfiguration.Loci;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ExecutionFactory_builtInTypes_Value;
import umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value;
import umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getBuiltInTypesSequence <em>Built In Types Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getLocus_ExecutionFactorySequence <em>Locus Execution Factory Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getPrimitiveBehaviorPrototypesSequence <em>Primitive Behavior Prototypes Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionFactory()
 * @model
 * @generated
 */
public interface TracedExecutionFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Built In Types Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ExecutionFactory_builtInTypes_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Types Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Types Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionFactory_BuiltInTypesSequence()
	 * @see umlTrace.States.ExecutionFactory_builtInTypes_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExecutionFactory_builtInTypes_Value> getBuiltInTypesSequence();

	/**
	 * Returns the value of the '<em><b>Locus Execution Factory Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Factory Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Factory Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionFactory_Locus_ExecutionFactorySequence()
	 * @see umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExecutionFactory_locus_ExecutionFactory_Value> getLocus_ExecutionFactorySequence();

	/**
	 * Returns the value of the '<em><b>Primitive Behavior Prototypes Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Behavior Prototypes Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Behavior Prototypes Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence()
	 * @see umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> getPrimitiveBehaviorPrototypesSequence();

} // TracedExecutionFactory
