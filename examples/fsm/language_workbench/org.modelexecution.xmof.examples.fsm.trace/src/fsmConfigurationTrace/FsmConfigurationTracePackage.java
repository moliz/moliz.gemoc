/**
 */
package fsmConfigurationTrace;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

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
 * @see fsmConfigurationTrace.FsmConfigurationTraceFactory
 * @model kind="package"
 * @generated
 */
public interface FsmConfigurationTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsmConfigurationTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmConfigurationTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsmConfigurationTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationTracePackage eINSTANCE = fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.impl.SpecificTraceImpl
	 * @see fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Traced Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__TRACED_OBJECTS = TracePackage.TRACE__TRACED_OBJECTS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES = TracePackage.TRACE__STATES;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Fsm Configuration FSM Configuration Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fsm Configuration Transition Configuration Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see fsmConfigurationTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_FSMConfiguration_Run_Sequence <em>Fsm Configuration FSM Configuration Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Configuration FSM Configuration Run Sequence</em>'.
	 * @see fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_FSMConfiguration_Run_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FsmConfiguration_FSMConfiguration_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_TransitionConfiguration_Fire_Sequence <em>Fsm Configuration Transition Configuration Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Configuration Transition Configuration Fire Sequence</em>'.
	 * @see fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FsmConfiguration_TransitionConfiguration_Fire_Sequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmConfigurationTraceFactory getFsmConfigurationTraceFactory();

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
		 * The meta object literal for the '{@link fsmConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.impl.SpecificTraceImpl
		 * @see fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Fsm Configuration FSM Configuration Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE = eINSTANCE.getSpecificTrace_FsmConfiguration_FSMConfiguration_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Configuration Transition Configuration Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_FsmConfiguration_TransitionConfiguration_Fire_Sequence();

	}

} //FsmConfigurationTracePackage
