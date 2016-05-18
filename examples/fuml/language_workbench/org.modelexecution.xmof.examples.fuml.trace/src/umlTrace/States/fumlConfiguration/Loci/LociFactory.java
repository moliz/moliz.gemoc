/**
 */
package umlTrace.States.fumlConfiguration.Loci;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage
 * @generated
 */
public interface LociFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociFactory eINSTANCE = umlTrace.States.fumlConfiguration.Loci.impl.LociFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Execution Environment</em>'.
	 * @generated
	 */
	TracedExecutionEnvironment createTracedExecutionEnvironment();

	/**
	 * Returns a new object of class '<em>Traced Execution Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Execution Factory</em>'.
	 * @generated
	 */
	TracedExecutionFactory createTracedExecutionFactory();

	/**
	 * Returns a new object of class '<em>Traced Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Executor</em>'.
	 * @generated
	 */
	TracedExecutor createTracedExecutor();

	/**
	 * Returns a new object of class '<em>Traced Locus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Locus</em>'.
	 * @generated
	 */
	TracedLocus createTracedLocus();

	/**
	 * Returns a new object of class '<em>Traced Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Semantic Visitor</em>'.
	 * @generated
	 */
	TracedSemanticVisitor createTracedSemanticVisitor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LociPackage getLociPackage();

} //LociFactory
