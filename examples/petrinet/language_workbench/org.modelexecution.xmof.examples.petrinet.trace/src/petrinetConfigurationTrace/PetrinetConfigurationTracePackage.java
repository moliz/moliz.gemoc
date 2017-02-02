/**
 */
package petrinetConfigurationTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see petrinetConfigurationTrace.PetrinetConfigurationTraceFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetConfigurationTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetConfigurationTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetConfigurationTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetConfigurationTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetConfigurationTracePackage eINSTANCE = petrinetConfigurationTrace.impl.PetrinetConfigurationTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.impl.SpecificTraceImpl
	 * @see petrinetConfigurationTrace.impl.PetrinetConfigurationTracePackageImpl#getSpecificTrace()
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
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Petrinet Configuration Net Configuration Main Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petrinet Configuration Net Configuration Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Petrinet Configuration Transition Configuration Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Petrinet Configuration traced Place Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Main_Sequence <em>Petrinet Configuration Net Configuration Main Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Configuration Net Configuration Main Sequence</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Main_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_PetrinetConfiguration_NetConfiguration_Main_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Run_Sequence <em>Petrinet Configuration Net Configuration Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Configuration Net Configuration Run Sequence</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Run_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence <em>Petrinet Configuration Transition Configuration Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Configuration Transition Configuration Fire Sequence</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_tracedPlaceConfigurations <em>Petrinet Configuration traced Place Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinet Configuration traced Place Configurations</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_tracedPlaceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetConfigurationTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see petrinetConfigurationTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetConfigurationTraceFactory getPetrinetConfigurationTraceFactory();

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
		 * The meta object literal for the '{@link petrinetConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.impl.SpecificTraceImpl
		 * @see petrinetConfigurationTrace.impl.PetrinetConfigurationTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Petrinet Configuration Net Configuration Main Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE = eINSTANCE.getSpecificTrace_PetrinetConfiguration_NetConfiguration_Main_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Configuration Net Configuration Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE = eINSTANCE.getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Configuration Transition Configuration Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Configuration traced Place Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //PetrinetConfigurationTracePackage
