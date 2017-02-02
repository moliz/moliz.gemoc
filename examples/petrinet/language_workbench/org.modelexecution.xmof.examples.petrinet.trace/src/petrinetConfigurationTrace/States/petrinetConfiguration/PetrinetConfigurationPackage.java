/**
 */
package petrinetConfigurationTrace.States.petrinetConfiguration;

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
 * @see petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetConfigurationTrace_petrinetConfiguration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetConfigurationPackage eINSTANCE = petrinetConfigurationTrace.States.petrinetConfiguration.impl.PetrinetConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl <em>Traced Place Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getTracedPlaceConfiguration()
	 * @generated
	 */
	int TRACED_PLACE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Place Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_CONFIGURATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration <em>Traced Place Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place Configuration</em>'.
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration
	 * @generated
	 */
	EClass getTracedPlaceConfiguration();

	/**
	 * Returns the meta object for the reference '{@link petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getOriginalObject()
	 * @see #getTracedPlaceConfiguration()
	 * @generated
	 */
	EReference getTracedPlaceConfiguration_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getTokensSequence()
	 * @see #getTracedPlaceConfiguration()
	 * @generated
	 */
	EReference getTracedPlaceConfiguration_TokensSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetConfigurationFactory getPetrinetConfigurationFactory();

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
		 * The meta object literal for the '{@link petrinetConfigurationTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl <em>Traced Place Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl
		 * @see petrinetConfigurationTrace.States.petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getTracedPlaceConfiguration()
		 * @generated
		 */
		EClass TRACED_PLACE_CONFIGURATION = eINSTANCE.getTracedPlaceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT = eINSTANCE.getTracedPlaceConfiguration_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE = eINSTANCE.getTracedPlaceConfiguration_TokensSequence();

	}

} //PetrinetConfigurationPackage
