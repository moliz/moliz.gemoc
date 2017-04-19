/**
 */
package fsmConfigurationTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = fsmConfigurationTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FSM Configuration accepted Sequence Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration accepted Sequence Dimension</em>'.
	 * @generated
	 */
	FSMConfiguration_acceptedSequence_Dimension createFSMConfiguration_acceptedSequence_Dimension();

	/**
	 * Returns a new object of class '<em>FSM Configuration accepted Sequence Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration accepted Sequence Value</em>'.
	 * @generated
	 */
	FSMConfiguration_acceptedSequence_Value createFSMConfiguration_acceptedSequence_Value();

	/**
	 * Returns a new object of class '<em>FSM Configuration current State Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration current State Dimension</em>'.
	 * @generated
	 */
	FSMConfiguration_currentState_Dimension createFSMConfiguration_currentState_Dimension();

	/**
	 * Returns a new object of class '<em>FSM Configuration current State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration current State Value</em>'.
	 * @generated
	 */
	FSMConfiguration_currentState_Value createFSMConfiguration_currentState_Value();

	/**
	 * Returns a new object of class '<em>FSM Configuration produced Sequence Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration produced Sequence Dimension</em>'.
	 * @generated
	 */
	FSMConfiguration_producedSequence_Dimension createFSMConfiguration_producedSequence_Dimension();

	/**
	 * Returns a new object of class '<em>FSM Configuration produced Sequence Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration produced Sequence Value</em>'.
	 * @generated
	 */
	FSMConfiguration_producedSequence_Value createFSMConfiguration_producedSequence_Value();

	/**
	 * Returns a new object of class '<em>Input string Seq Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input string Seq Dimension</em>'.
	 * @generated
	 */
	Input_stringSeq_Dimension createInput_stringSeq_Dimension();

	/**
	 * Returns a new object of class '<em>Input string Seq Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input string Seq Value</em>'.
	 * @generated
	 */
	Input_stringSeq_Value createInput_stringSeq_Value();

	/**
	 * Returns a new object of class '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific State</em>'.
	 * @generated
	 */
	SpecificState createSpecificState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
