/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
 * @generated
 */
public interface IntermediateActivitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActivitiesFactory eINSTANCE = fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Execution</em>'.
	 * @generated
	 */
	ActivityExecution createActivityExecution();

	/**
	 * Returns a new object of class '<em>Activity Node Activation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node Activation Group</em>'.
	 * @generated
	 */
	ActivityNodeActivationGroup createActivityNodeActivationGroup();

	/**
	 * Returns a new object of class '<em>Activity Parameter Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Parameter Node Activation</em>'.
	 * @generated
	 */
	ActivityParameterNodeActivation createActivityParameterNodeActivation();

	/**
	 * Returns a new object of class '<em>Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node Activation</em>'.
	 * @generated
	 */
	ActivityNodeActivation createActivityNodeActivation();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Activity Edge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge Instance</em>'.
	 * @generated
	 */
	ActivityEdgeInstance createActivityEdgeInstance();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Decision Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node Activation</em>'.
	 * @generated
	 */
	DecisionNodeActivation createDecisionNodeActivation();

	/**
	 * Returns a new object of class '<em>Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Token</em>'.
	 * @generated
	 */
	ControlToken createControlToken();

	/**
	 * Returns a new object of class '<em>Object Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Token</em>'.
	 * @generated
	 */
	ObjectToken createObjectToken();

	/**
	 * Returns a new object of class '<em>Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token</em>'.
	 * @generated
	 */
	ForkedToken createForkedToken();

	/**
	 * Returns a new object of class '<em>Initial Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node Activation</em>'.
	 * @generated
	 */
	InitialNodeActivation createInitialNodeActivation();

	/**
	 * Returns a new object of class '<em>Merge Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node Activation</em>'.
	 * @generated
	 */
	MergeNodeActivation createMergeNodeActivation();

	/**
	 * Returns a new object of class '<em>Join Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node Activation</em>'.
	 * @generated
	 */
	JoinNodeActivation createJoinNodeActivation();

	/**
	 * Returns a new object of class '<em>Fork Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node Activation</em>'.
	 * @generated
	 */
	ForkNodeActivation createForkNodeActivation();

	/**
	 * Returns a new object of class '<em>Activity Final Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Final Node Activation</em>'.
	 * @generated
	 */
	ActivityFinalNodeActivation createActivityFinalNodeActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateActivitiesPackage getIntermediateActivitiesPackage();

} //IntermediateActivitiesFactory
