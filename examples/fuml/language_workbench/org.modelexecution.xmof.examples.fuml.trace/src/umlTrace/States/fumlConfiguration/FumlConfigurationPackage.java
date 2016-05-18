/**
 */
package umlTrace.States.fumlConfiguration;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.FumlConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface FumlConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fumlConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace_fumlConfiguration";

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
	FumlConfigurationPackage eINSTANCE = umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl <em>Traced Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl
	 * @see umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedElementConfiguration()
	 * @generated
	 */
	int TRACED_ELEMENT_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration <em>Traced Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Element Configuration</em>'.
	 * @see umlTrace.States.fumlConfiguration.TracedElementConfiguration
	 * @generated
	 */
	EClass getTracedElementConfiguration();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject()
	 * @see #getTracedElementConfiguration()
	 * @generated
	 */
	EReference getTracedElementConfiguration_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Visitor Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence()
	 * @see #getTracedElementConfiguration()
	 * @generated
	 */
	EReference getTracedElementConfiguration_SemanticVisitorSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FumlConfigurationFactory getFumlConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl <em>Traced Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl
		 * @see umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedElementConfiguration()
		 * @generated
		 */
		EClass TRACED_ELEMENT_CONFIGURATION = eINSTANCE.getTracedElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT = eINSTANCE.getTracedElementConfiguration_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = eINSTANCE.getTracedElementConfiguration_SemanticVisitorSequence();

	}

} //FumlConfigurationPackage
