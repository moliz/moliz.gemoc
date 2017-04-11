/**
 */
package fsmConfigurationTrace.States;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmConfigurationTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = fsmConfigurationTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.SpecificDimensionImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificDimension()
	 * @generated
	 */
	int SPECIFIC_DIMENSION = 9;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION__VALUES = TracePackage.DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Specific Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION_FEATURE_COUNT = TracePackage.DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_DimensionImpl <em>FSM Configuration accepted Sequence Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_DimensionImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_acceptedSequence_Dimension()
	 * @generated
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>FSM Configuration accepted Sequence Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.SpecificValueImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 13;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE__STATES = TracePackage.VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE_FEATURE_COUNT = TracePackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.SpecificAttributeValue
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_ValueImpl <em>FSM Configuration accepted Sequence Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_ValueImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_acceptedSequence_Value()
	 * @generated
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Accepted Sequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Configuration accepted Sequence Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_DimensionImpl <em>FSM Configuration current State Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_DimensionImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_currentState_Dimension()
	 * @generated
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>FSM Configuration current State Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.SpecificReferenceValue
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
	 * @generated
	 */
	int SPECIFIC_REFERENCE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_ValueImpl <em>FSM Configuration current State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_ValueImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_currentState_Value()
	 * @generated
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_VALUE__CURRENT_STATE = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Configuration current State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_CURRENT_STATE_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_DimensionImpl <em>FSM Configuration produced Sequence Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_DimensionImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_producedSequence_Dimension()
	 * @generated
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>FSM Configuration produced Sequence Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_ValueImpl <em>FSM Configuration produced Sequence Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_ValueImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_producedSequence_Value()
	 * @generated
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Produced Sequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Configuration produced Sequence Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.Input_stringSeq_DimensionImpl <em>Input string Seq Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.Input_stringSeq_DimensionImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getInput_stringSeq_Dimension()
	 * @generated
	 */
	int INPUT_STRING_SEQ_DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_SEQ_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Input string Seq Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_SEQ_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.Input_stringSeq_ValueImpl <em>Input string Seq Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.Input_stringSeq_ValueImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getInput_stringSeq_Value()
	 * @generated
	 */
	int INPUT_STRING_SEQ_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_SEQ_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>String Seq</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_SEQ_VALUE__STRING_SEQ = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input string Seq Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STRING_SEQ_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.SpecificStateImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 11;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__STARTED_STEPS = TracePackage.STATE__STARTED_STEPS;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__ENDED_STEPS = TracePackage.STATE__ENDED_STEPS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__VALUES = TracePackage.STATE__VALUES;

	/**
	 * The number of structural features of the '<em>Specific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE_FEATURE_COUNT = TracePackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl
	 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
	 * @generated
	 */
	int SPECIFIC_TRACED_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT__DIMENSIONS = TracePackage.TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Specific Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT_FEATURE_COUNT = TracePackage.TRACED_OBJECT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration accepted Sequence Dimension</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension
	 * @generated
	 */
	EClass getFSMConfiguration_acceptedSequence_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value <em>FSM Configuration accepted Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration accepted Sequence Value</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value
	 * @generated
	 */
	EClass getFSMConfiguration_acceptedSequence_Value();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value#getAcceptedSequence <em>Accepted Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Sequence</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value#getAcceptedSequence()
	 * @see #getFSMConfiguration_acceptedSequence_Value()
	 * @generated
	 */
	EAttribute getFSMConfiguration_acceptedSequence_Value_AcceptedSequence();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration current State Dimension</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension
	 * @generated
	 */
	EClass getFSMConfiguration_currentState_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_currentState_Value <em>FSM Configuration current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration current State Value</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_currentState_Value
	 * @generated
	 */
	EClass getFSMConfiguration_currentState_Value();

	/**
	 * Returns the meta object for the reference '{@link fsmConfigurationTrace.States.FSMConfiguration_currentState_Value#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_currentState_Value#getCurrentState()
	 * @see #getFSMConfiguration_currentState_Value()
	 * @generated
	 */
	EReference getFSMConfiguration_currentState_Value_CurrentState();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration produced Sequence Dimension</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension
	 * @generated
	 */
	EClass getFSMConfiguration_producedSequence_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value <em>FSM Configuration produced Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration produced Sequence Value</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value
	 * @generated
	 */
	EClass getFSMConfiguration_producedSequence_Value();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value#getProducedSequence <em>Produced Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produced Sequence</em>'.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value#getProducedSequence()
	 * @see #getFSMConfiguration_producedSequence_Value()
	 * @generated
	 */
	EAttribute getFSMConfiguration_producedSequence_Value_ProducedSequence();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.Input_stringSeq_Dimension <em>Input string Seq Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input string Seq Dimension</em>'.
	 * @see fsmConfigurationTrace.States.Input_stringSeq_Dimension
	 * @generated
	 */
	EClass getInput_stringSeq_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.Input_stringSeq_Value <em>Input string Seq Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input string Seq Value</em>'.
	 * @see fsmConfigurationTrace.States.Input_stringSeq_Value
	 * @generated
	 */
	EClass getInput_stringSeq_Value();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfigurationTrace.States.Input_stringSeq_Value#getStringSeq <em>String Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Seq</em>'.
	 * @see fsmConfigurationTrace.States.Input_stringSeq_Value#getStringSeq()
	 * @see #getInput_stringSeq_Value()
	 * @generated
	 */
	EAttribute getInput_stringSeq_Value_StringSeq();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute Value</em>'.
	 * @see fsmConfigurationTrace.States.SpecificAttributeValue
	 * @generated
	 */
	EClass getSpecificAttributeValue();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Dimension</em>'.
	 * @see fsmConfigurationTrace.States.SpecificDimension
	 * @generated
	 */
	EClass getSpecificDimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Reference Value</em>'.
	 * @see fsmConfigurationTrace.States.SpecificReferenceValue
	 * @generated
	 */
	EClass getSpecificReferenceValue();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific State</em>'.
	 * @see fsmConfigurationTrace.States.SpecificState
	 * @generated
	 */
	EClass getSpecificState();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Traced Object</em>'.
	 * @see fsmConfigurationTrace.States.SpecificTracedObject
	 * @generated
	 */
	EClass getSpecificTracedObject();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Value</em>'.
	 * @see fsmConfigurationTrace.States.SpecificValue
	 * @generated
	 */
	EClass getSpecificValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_DimensionImpl <em>FSM Configuration accepted Sequence Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_DimensionImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_acceptedSequence_Dimension()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION = eINSTANCE.getFSMConfiguration_acceptedSequence_Dimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_ValueImpl <em>FSM Configuration accepted Sequence Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_ValueImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_acceptedSequence_Value()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE = eINSTANCE.getFSMConfiguration_acceptedSequence_Value();

		/**
		 * The meta object literal for the '<em><b>Accepted Sequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE = eINSTANCE.getFSMConfiguration_acceptedSequence_Value_AcceptedSequence();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_DimensionImpl <em>FSM Configuration current State Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_DimensionImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_currentState_Dimension()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_CURRENT_STATE_DIMENSION = eINSTANCE.getFSMConfiguration_currentState_Dimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_ValueImpl <em>FSM Configuration current State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_currentState_ValueImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_currentState_Value()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_CURRENT_STATE_VALUE = eINSTANCE.getFSMConfiguration_currentState_Value();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_CONFIGURATION_CURRENT_STATE_VALUE__CURRENT_STATE = eINSTANCE.getFSMConfiguration_currentState_Value_CurrentState();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_DimensionImpl <em>FSM Configuration produced Sequence Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_DimensionImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_producedSequence_Dimension()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION = eINSTANCE.getFSMConfiguration_producedSequence_Dimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_ValueImpl <em>FSM Configuration produced Sequence Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_ValueImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getFSMConfiguration_producedSequence_Value()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE = eINSTANCE.getFSMConfiguration_producedSequence_Value();

		/**
		 * The meta object literal for the '<em><b>Produced Sequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE = eINSTANCE.getFSMConfiguration_producedSequence_Value_ProducedSequence();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.Input_stringSeq_DimensionImpl <em>Input string Seq Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.Input_stringSeq_DimensionImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getInput_stringSeq_Dimension()
		 * @generated
		 */
		EClass INPUT_STRING_SEQ_DIMENSION = eINSTANCE.getInput_stringSeq_Dimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.Input_stringSeq_ValueImpl <em>Input string Seq Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.Input_stringSeq_ValueImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getInput_stringSeq_Value()
		 * @generated
		 */
		EClass INPUT_STRING_SEQ_VALUE = eINSTANCE.getInput_stringSeq_Value();

		/**
		 * The meta object literal for the '<em><b>String Seq</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_STRING_SEQ_VALUE__STRING_SEQ = eINSTANCE.getInput_stringSeq_Value_StringSeq();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.SpecificAttributeValue
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE_VALUE = eINSTANCE.getSpecificAttributeValue();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.SpecificDimensionImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificDimension()
		 * @generated
		 */
		EClass SPECIFIC_DIMENSION = eINSTANCE.getSpecificDimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.SpecificReferenceValue
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
		 * @generated
		 */
		EClass SPECIFIC_REFERENCE_VALUE = eINSTANCE.getSpecificReferenceValue();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.SpecificStateImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificState()
		 * @generated
		 */
		EClass SPECIFIC_STATE = eINSTANCE.getSpecificState();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
		 * @generated
		 */
		EClass SPECIFIC_TRACED_OBJECT = eINSTANCE.getSpecificTracedObject();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.impl.SpecificValueImpl
		 * @see fsmConfigurationTrace.States.impl.StatesPackageImpl#getSpecificValue()
		 * @generated
		 */
		EClass SPECIFIC_VALUE = eINSTANCE.getSpecificValue();

	}

} //StatesPackage
