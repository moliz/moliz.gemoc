/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage
 * @generated
 */
public interface LociFewStepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociFewStepsFactory eINSTANCE = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsFactoryImpl.init();

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
	LociFewStepsPackage getLociFewStepsPackage();

} //LociFewStepsFactory
