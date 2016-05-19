/**
 */
package fumlConfiguration.Loci;

import fumlConfiguration.Classes.Kernel.Evaluation;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.ExecutionFactory#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.ExecutionFactory#getBuiltInTypes <em>Built In Types</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Loci.LociPackage#getExecutionFactory()
 * @model
 * @generated
 */
public interface ExecutionFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Execution Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Loci.Locus#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Factory</em>' container reference.
	 * @see #setLocus_ExecutionFactory(Locus)
	 * @see fumlConfiguration.Loci.LociPackage#getExecutionFactory_Locus_ExecutionFactory()
	 * @see fumlConfiguration.Loci.Locus#getFactory
	 * @model opposite="factory" transient="false"
	 * @generated
	 */
	Locus getLocus_ExecutionFactory();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus Execution Factory</em>' container reference.
	 * @see #getLocus_ExecutionFactory()
	 * @generated
	 */
	void setLocus_ExecutionFactory(Locus value);

	/**
	 * Returns the value of the '<em><b>Primitive Behavior Prototypes</b></em>' reference list.
	 * The list contents are of type {@link fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Behavior Prototypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Behavior Prototypes</em>' reference list.
	 * @see fumlConfiguration.Loci.LociPackage#getExecutionFactory_PrimitiveBehaviorPrototypes()
	 * @model
	 * @generated
	 */
	EList<OpaqueBehaviorExecution> getPrimitiveBehaviorPrototypes();

	/**
	 * Returns the value of the '<em><b>Built In Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Types</em>' reference list.
	 * @see fumlConfiguration.Loci.LociPackage#getExecutionFactory_BuiltInTypes()
	 * @model
	 * @generated
	 */
	EList<PrimitiveType> getBuiltInTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model behaviorRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createExecution(Behavior behavior, fumlConfiguration.Classes.Kernel.Object context, Execution execution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void instantiateVisitor(Element element, SemanticVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model evaluationRequired="true" specificationRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void createEvaluation(Evaluation evaluation, ValueSpecification specification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" typeRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getBuiltInType(String name, PrimitiveType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model behaviorRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void instantiateOpaqueBehaviorExecution(OpaqueBehavior behavior, OpaqueBehaviorExecution execution);

} // ExecutionFactory
