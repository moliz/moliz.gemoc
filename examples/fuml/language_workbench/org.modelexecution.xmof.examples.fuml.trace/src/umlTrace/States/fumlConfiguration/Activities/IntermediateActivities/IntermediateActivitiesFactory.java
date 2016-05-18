/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
 * @generated
 */
public interface IntermediateActivitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActivitiesFactory eINSTANCE = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Activity Edge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Edge Instance</em>'.
	 * @generated
	 */
	TracedActivityEdgeInstance createTracedActivityEdgeInstance();

	/**
	 * Returns a new object of class '<em>Traced Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Execution</em>'.
	 * @generated
	 */
	TracedActivityExecution createTracedActivityExecution();

	/**
	 * Returns a new object of class '<em>Traced Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Node Activation</em>'.
	 * @generated
	 */
	TracedActivityNodeActivation createTracedActivityNodeActivation();

	/**
	 * Returns a new object of class '<em>Traced Activity Node Activation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Node Activation Group</em>'.
	 * @generated
	 */
	TracedActivityNodeActivationGroup createTracedActivityNodeActivationGroup();

	/**
	 * Returns a new object of class '<em>Traced Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Forked Token</em>'.
	 * @generated
	 */
	TracedForkedToken createTracedForkedToken();

	/**
	 * Returns a new object of class '<em>Traced Object Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Object Token</em>'.
	 * @generated
	 */
	TracedObjectToken createTracedObjectToken();

	/**
	 * Returns a new object of class '<em>Traced Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Offer</em>'.
	 * @generated
	 */
	TracedOffer createTracedOffer();

	/**
	 * Returns a new object of class '<em>Traced Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Token</em>'.
	 * @generated
	 */
	TracedToken createTracedToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateActivitiesPackage getIntermediateActivitiesPackage();

} //IntermediateActivitiesFactory
