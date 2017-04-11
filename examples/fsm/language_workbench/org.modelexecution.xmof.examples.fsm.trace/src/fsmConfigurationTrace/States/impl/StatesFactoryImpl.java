/**
 */
package fsmConfigurationTrace.States.impl;

import fsmConfigurationTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION: return createFSMConfiguration_acceptedSequence_Dimension();
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE: return createFSMConfiguration_acceptedSequence_Value();
			case StatesPackage.FSM_CONFIGURATION_CURRENT_STATE_DIMENSION: return createFSMConfiguration_currentState_Dimension();
			case StatesPackage.FSM_CONFIGURATION_CURRENT_STATE_VALUE: return createFSMConfiguration_currentState_Value();
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION: return createFSMConfiguration_producedSequence_Dimension();
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE: return createFSMConfiguration_producedSequence_Value();
			case StatesPackage.INPUT_STRING_SEQ_DIMENSION: return createInput_stringSeq_Dimension();
			case StatesPackage.INPUT_STRING_SEQ_VALUE: return createInput_stringSeq_Value();
			case StatesPackage.SPECIFIC_STATE: return createSpecificState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_acceptedSequence_Dimension createFSMConfiguration_acceptedSequence_Dimension() {
		FSMConfiguration_acceptedSequence_DimensionImpl fsmConfiguration_acceptedSequence_Dimension = new FSMConfiguration_acceptedSequence_DimensionImpl();
		return fsmConfiguration_acceptedSequence_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_acceptedSequence_Value createFSMConfiguration_acceptedSequence_Value() {
		FSMConfiguration_acceptedSequence_ValueImpl fsmConfiguration_acceptedSequence_Value = new FSMConfiguration_acceptedSequence_ValueImpl();
		return fsmConfiguration_acceptedSequence_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_currentState_Dimension createFSMConfiguration_currentState_Dimension() {
		FSMConfiguration_currentState_DimensionImpl fsmConfiguration_currentState_Dimension = new FSMConfiguration_currentState_DimensionImpl();
		return fsmConfiguration_currentState_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_currentState_Value createFSMConfiguration_currentState_Value() {
		FSMConfiguration_currentState_ValueImpl fsmConfiguration_currentState_Value = new FSMConfiguration_currentState_ValueImpl();
		return fsmConfiguration_currentState_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_producedSequence_Dimension createFSMConfiguration_producedSequence_Dimension() {
		FSMConfiguration_producedSequence_DimensionImpl fsmConfiguration_producedSequence_Dimension = new FSMConfiguration_producedSequence_DimensionImpl();
		return fsmConfiguration_producedSequence_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_producedSequence_Value createFSMConfiguration_producedSequence_Value() {
		FSMConfiguration_producedSequence_ValueImpl fsmConfiguration_producedSequence_Value = new FSMConfiguration_producedSequence_ValueImpl();
		return fsmConfiguration_producedSequence_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_stringSeq_Dimension createInput_stringSeq_Dimension() {
		Input_stringSeq_DimensionImpl input_stringSeq_Dimension = new Input_stringSeq_DimensionImpl();
		return input_stringSeq_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_stringSeq_Value createInput_stringSeq_Value() {
		Input_stringSeq_ValueImpl input_stringSeq_Value = new Input_stringSeq_ValueImpl();
		return input_stringSeq_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificState createSpecificState() {
		SpecificStateImpl specificState = new SpecificStateImpl();
		return specificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
