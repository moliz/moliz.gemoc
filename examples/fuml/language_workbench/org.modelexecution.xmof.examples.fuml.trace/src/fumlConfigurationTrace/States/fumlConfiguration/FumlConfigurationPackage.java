/**
 */
package fumlConfigurationTrace.States.fumlConfiguration;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationFactory
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
	String eNS_URI = "fumlConfigurationTrace_fumlConfiguration";

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
	FumlConfigurationPackage eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl <em>Traced Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedElementConfiguration()
	 * @generated
	 */
	int TRACED_ELEMENT_CONFIGURATION = 77;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = 0;

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
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNamedElementConfigurationImpl <em>Traced Named Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNamedElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedNamedElementConfiguration()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT_CONFIGURATION = 146;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Named Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Named Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageableElementConfigurationImpl <em>Traced Packageable Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageableElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPackageableElementConfiguration()
	 * @generated
	 */
	int TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION = 162;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Packageable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Packageable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDependencyConfigurationImpl <em>Traced Dependency Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDependencyConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDependencyConfiguration()
	 * @generated
	 */
	int TRACED_DEPENDENCY_CONFIGURATION = 63;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPENDENCY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPENDENCY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Dependency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPENDENCY_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Dependency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPENDENCY_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAbstractionConfigurationImpl <em>Traced Abstraction Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAbstractionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAbstractionConfiguration()
	 * @generated
	 */
	int TRACED_ABSTRACTION_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ABSTRACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DEPENDENCY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ABSTRACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DEPENDENCY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Abstraction Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ABSTRACTION_CONFIGURATION_FEATURE_COUNT = TRACED_DEPENDENCY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Abstraction Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ABSTRACTION_CONFIGURATION_OPERATION_COUNT = TRACED_DEPENDENCY_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRedefinableElementConfigurationImpl <em>Traced Redefinable Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRedefinableElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRedefinableElementConfiguration()
	 * @generated
	 */
	int TRACED_REDEFINABLE_ELEMENT_CONFIGURATION = 190;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Redefinable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Redefinable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityNodeConfigurationImpl <em>Traced Activity Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityNodeConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Activity Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutableNodeConfigurationImpl <em>Traced Executable Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutableNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExecutableNodeConfiguration()
	 * @generated
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION = 84;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Executable Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Executable Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionConfigurationImpl <em>Traced Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActionConfiguration()
	 * @generated
	 */
	int TRACED_ACTION_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EXECUTABLE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EXECUTABLE_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_EXECUTABLE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_EXECUTABLE_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_EXECUTABLE_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAcceptEventActionConfigurationImpl <em>Traced Accept Event Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAcceptEventActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAcceptEventActionConfiguration()
	 * @generated
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Accept Event Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Accept Event Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAcceptCallActionConfigurationImpl <em>Traced Accept Call Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAcceptCallActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAcceptCallActionConfiguration()
	 * @generated
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Accept Call Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Accept Call Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACCEPT_CALL_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionFragmentConfigurationImpl <em>Traced Interaction Fragment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionFragmentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInteractionFragmentConfiguration()
	 * @generated
	 */
	int TRACED_INTERACTION_FRAGMENT_CONFIGURATION = 115;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interaction Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interaction Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionSpecificationConfigurationImpl <em>Traced Execution Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExecutionSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_EXECUTION_SPECIFICATION_CONFIGURATION = 87;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionExecutionSpecificationConfigurationImpl <em>Traced Action Execution Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionExecutionSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActionExecutionSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Action Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Action Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObjectNodeConfigurationImpl <em>Traced Object Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObjectNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedObjectNodeConfiguration()
	 * @generated
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION = 150;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Object Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Object Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPinConfigurationImpl <em>Traced Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPinConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPinConfiguration()
	 * @generated
	 */
	int TRACED_PIN_CONFIGURATION = 167;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBJECT_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_CONFIGURATION_FEATURE_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_CONFIGURATION_OPERATION_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInputPinConfigurationImpl <em>Traced Input Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInputPinConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInputPinConfiguration()
	 * @generated
	 */
	int TRACED_INPUT_PIN_CONFIGURATION = 110;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Input Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_CONFIGURATION_FEATURE_COUNT = TRACED_PIN_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Input Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PIN_CONFIGURATION_OPERATION_COUNT = TRACED_PIN_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionInputPinConfigurationImpl <em>Traced Action Input Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActionInputPinConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActionInputPinConfiguration()
	 * @generated
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INPUT_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Action Input Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION_FEATURE_COUNT = TRACED_INPUT_PIN_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Action Input Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_INPUT_PIN_CONFIGURATION_OPERATION_COUNT = TRACED_INPUT_PIN_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNamespaceConfigurationImpl <em>Traced Namespace Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNamespaceConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedNamespaceConfiguration()
	 * @generated
	 */
	int TRACED_NAMESPACE_CONFIGURATION = 147;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Namespace Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Namespace Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassifierConfigurationImpl <em>Traced Classifier Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassifierConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClassifierConfiguration()
	 * @generated
	 */
	int TRACED_CLASSIFIER_CONFIGURATION = 33;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuredClassifierConfigurationImpl <em>Traced Structured Classifier Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuredClassifierConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStructuredClassifierConfiguration()
	 * @generated
	 */
	int TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION = 214;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Structured Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Structured Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEncapsulatedClassifierConfigurationImpl <em>Traced Encapsulated Classifier Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEncapsulatedClassifierConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedEncapsulatedClassifierConfiguration()
	 * @generated
	 */
	int TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION = 79;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Encapsulated Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Encapsulated Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassConfigurationImpl <em>Traced Class Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClassConfiguration()
	 * @generated
	 */
	int TRACED_CLASS_CONFIGURATION = 32;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Class Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_CONFIGURATION_FEATURE_COUNT = TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Class Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_CONFIGURATION_OPERATION_COUNT = TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehaviorConfigurationImpl <em>Traced Behavior Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehaviorConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedBehaviorConfiguration()
	 * @generated
	 */
	int TRACED_BEHAVIOR_CONFIGURATION = 21;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_CONFIGURATION_FEATURE_COUNT = TRACED_CLASS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_CONFIGURATION_OPERATION_COUNT = TRACED_CLASS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityConfigurationImpl <em>Traced Activity Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Activity Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityContentConfigurationImpl <em>Traced Activity Content Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityContentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityContentConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_CONTENT_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONTENT_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Content Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONTENT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Activity Content Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_CONTENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityEdgeConfigurationImpl <em>Traced Activity Edge Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityEdgeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityEdgeConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_EDGE_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_CONFIGURATION_FEATURE_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Edge Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_CONFIGURATION_OPERATION_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedControlNodeConfigurationImpl <em>Traced Control Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedControlNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedControlNodeConfiguration()
	 * @generated
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION = 56;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Control Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Control Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFinalNodeConfigurationImpl <em>Traced Final Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFinalNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedFinalNodeConfiguration()
	 * @generated
	 */
	int TRACED_FINAL_NODE_CONFIGURATION = 96;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityFinalNodeConfigurationImpl <em>Traced Activity Final Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityFinalNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityFinalNodeConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_FINAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Activity Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_FINAL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_FINAL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityGroupConfigurationImpl <em>Traced Activity Group Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityGroupConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityGroupConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Group Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Activity Group Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_GROUP_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityParameterNodeConfigurationImpl <em>Traced Activity Parameter Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityParameterNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityParameterNodeConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBJECT_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Activity Parameter Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Parameter Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityPartitionConfigurationImpl <em>Traced Activity Partition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityPartitionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActivityPartitionConfiguration()
	 * @generated
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_GROUP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Activity Partition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_GROUP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Partition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_PARTITION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_GROUP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehavioredClassifierConfigurationImpl <em>Traced Behaviored Classifier Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehavioredClassifierConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedBehavioredClassifierConfiguration()
	 * @generated
	 */
	int TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION = 24;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Behaviored Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Behaviored Classifier Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActorConfigurationImpl <em>Traced Actor Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActorConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedActorConfiguration()
	 * @generated
	 */
	int TRACED_ACTOR_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Actor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTOR_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Actor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTOR_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuralFeatureActionConfigurationImpl <em>Traced Structural Feature Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuralFeatureActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStructuralFeatureActionConfiguration()
	 * @generated
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION = 211;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteStructuralFeatureActionConfigurationImpl <em>Traced Write Structural Feature Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteStructuralFeatureActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedWriteStructuralFeatureActionConfiguration()
	 * @generated
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION = 241;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Write Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Write Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAddStructuralFeatureValueActionConfigurationImpl <em>Traced Add Structural Feature Value Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAddStructuralFeatureValueActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAddStructuralFeatureValueActionConfiguration()
	 * @generated
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION = 15;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Add Structural Feature Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Add Structural Feature Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVariableActionConfigurationImpl <em>Traced Variable Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVariableActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedVariableActionConfiguration()
	 * @generated
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION = 237;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteVariableActionConfigurationImpl <em>Traced Write Variable Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteVariableActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedWriteVariableActionConfiguration()
	 * @generated
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION = 242;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Write Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Write Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAddVariableValueActionConfigurationImpl <em>Traced Add Variable Value Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAddVariableValueActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAddVariableValueActionConfiguration()
	 * @generated
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Add Variable Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Add Variable Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEventConfigurationImpl <em>Traced Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedEventConfiguration()
	 * @generated
	 */
	int TRACED_EVENT_CONFIGURATION = 82;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageEventConfigurationImpl <em>Traced Message Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMessageEventConfiguration()
	 * @generated
	 */
	int TRACED_MESSAGE_EVENT_CONFIGURATION = 142;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Message Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Message Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAnyReceiveEventConfigurationImpl <em>Traced Any Receive Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAnyReceiveEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAnyReceiveEventConfiguration()
	 * @generated
	 */
	int TRACED_ANY_RECEIVE_EVENT_CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANY_RECEIVE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MESSAGE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANY_RECEIVE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MESSAGE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Any Receive Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANY_RECEIVE_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Any Receive Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANY_RECEIVE_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedArtifactConfigurationImpl <em>Traced Artifact Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedArtifactConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedArtifactConfiguration()
	 * @generated
	 */
	int TRACED_ARTIFACT_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARTIFACT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARTIFACT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Artifact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARTIFACT_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Artifact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARTIFACT_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAssociationClassConfigurationImpl <em>Traced Association Class Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAssociationClassConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAssociationClassConfiguration()
	 * @generated
	 */
	int TRACED_ASSOCIATION_CLASS_CONFIGURATION = 19;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Association Class Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CLASS_CONFIGURATION_FEATURE_COUNT = TRACED_CLASS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Association Class Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CLASS_CONFIGURATION_OPERATION_COUNT = TRACED_CLASS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAssociationConfigurationImpl <em>Traced Association Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedAssociationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedAssociationConfiguration()
	 * @generated
	 */
	int TRACED_ASSOCIATION_CONFIGURATION = 20;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Association Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Association Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSOCIATION_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehaviorExecutionSpecificationConfigurationImpl <em>Traced Behavior Execution Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehaviorExecutionSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedBehaviorExecutionSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION = 22;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Behavior Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Behavior Execution Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_EXECUTION_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehavioralFeatureConfigurationImpl <em>Traced Behavioral Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBehavioralFeatureConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedBehavioralFeatureConfiguration()
	 * @generated
	 */
	int TRACED_BEHAVIORAL_FEATURE_CONFIGURATION = 23;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Behavioral Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Behavioral Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInvocationActionConfigurationImpl <em>Traced Invocation Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInvocationActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInvocationActionConfiguration()
	 * @generated
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION = 123;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Invocation Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Invocation Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INVOCATION_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBroadcastSignalActionConfigurationImpl <em>Traced Broadcast Signal Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedBroadcastSignalActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedBroadcastSignalActionConfiguration()
	 * @generated
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION = 25;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INVOCATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Broadcast Signal Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Broadcast Signal Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallActionConfigurationImpl <em>Traced Call Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCallActionConfiguration()
	 * @generated
	 */
	int TRACED_CALL_ACTION_CONFIGURATION = 26;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INVOCATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Call Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Call Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallBehaviorActionConfigurationImpl <em>Traced Call Behavior Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallBehaviorActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCallBehaviorActionConfiguration()
	 * @generated
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Call Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_CALL_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Call Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_CALL_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallEventConfigurationImpl <em>Traced Call Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCallEventConfiguration()
	 * @generated
	 */
	int TRACED_CALL_EVENT_CONFIGURATION = 28;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MESSAGE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MESSAGE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Call Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Call Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallOperationActionConfigurationImpl <em>Traced Call Operation Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCallOperationActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCallOperationActionConfiguration()
	 * @generated
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION = 29;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Call Operation Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_CALL_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Call Operation Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CALL_OPERATION_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_CALL_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCentralBufferNodeConfigurationImpl <em>Traced Central Buffer Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCentralBufferNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCentralBufferNodeConfiguration()
	 * @generated
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION = 30;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBJECT_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Central Buffer Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Central Buffer Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedChangeEventConfigurationImpl <em>Traced Change Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedChangeEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedChangeEventConfiguration()
	 * @generated
	 */
	int TRACED_CHANGE_EVENT_CONFIGURATION = 31;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CHANGE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CHANGE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Change Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CHANGE_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Change Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CHANGE_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateParameterConfigurationImpl <em>Traced Template Parameter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateParameterConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTemplateParameterConfiguration()
	 * @generated
	 */
	int TRACED_TEMPLATE_PARAMETER_CONFIGURATION = 217;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassifierTemplateParameterConfigurationImpl <em>Traced Classifier Template Parameter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClassifierTemplateParameterConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClassifierTemplateParameterConfiguration()
	 * @generated
	 */
	int TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION = 34;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Classifier Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Classifier Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClauseConfigurationImpl <em>Traced Clause Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClauseConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClauseConfiguration()
	 * @generated
	 */
	int TRACED_CLAUSE_CONFIGURATION = 35;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLAUSE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLAUSE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Clause Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLAUSE_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Clause Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLAUSE_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearAssociationActionConfigurationImpl <em>Traced Clear Association Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearAssociationActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClearAssociationActionConfiguration()
	 * @generated
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION = 36;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Clear Association Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Clear Association Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearStructuralFeatureActionConfigurationImpl <em>Traced Clear Structural Feature Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearStructuralFeatureActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClearStructuralFeatureActionConfiguration()
	 * @generated
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION = 37;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Clear Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Clear Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearVariableActionConfigurationImpl <em>Traced Clear Variable Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedClearVariableActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedClearVariableActionConfiguration()
	 * @generated
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION = 38;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Clear Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Clear Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCollaborationConfigurationImpl <em>Traced Collaboration Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCollaborationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCollaborationConfiguration()
	 * @generated
	 */
	int TRACED_COLLABORATION_CONFIGURATION = 39;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Collaboration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Collaboration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCollaborationUseConfigurationImpl <em>Traced Collaboration Use Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCollaborationUseConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCollaborationUseConfiguration()
	 * @generated
	 */
	int TRACED_COLLABORATION_USE_CONFIGURATION = 40;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_USE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_USE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Collaboration Use Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_USE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Collaboration Use Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COLLABORATION_USE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCombinedFragmentConfigurationImpl <em>Traced Combined Fragment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCombinedFragmentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCombinedFragmentConfiguration()
	 * @generated
	 */
	int TRACED_COMBINED_FRAGMENT_CONFIGURATION = 41;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMBINED_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMBINED_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Combined Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMBINED_FRAGMENT_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Combined Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMBINED_FRAGMENT_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCommentConfigurationImpl <em>Traced Comment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCommentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCommentConfiguration()
	 * @generated
	 */
	int TRACED_COMMENT_CONFIGURATION = 42;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Comment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMENT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Comment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMENT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCommunicationPathConfigurationImpl <em>Traced Communication Path Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCommunicationPathConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCommunicationPathConfiguration()
	 * @generated
	 */
	int TRACED_COMMUNICATION_PATH_CONFIGURATION = 43;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMUNICATION_PATH_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ASSOCIATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMUNICATION_PATH_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ASSOCIATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Communication Path Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMUNICATION_PATH_CONFIGURATION_FEATURE_COUNT = TRACED_ASSOCIATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Communication Path Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMMUNICATION_PATH_CONFIGURATION_OPERATION_COUNT = TRACED_ASSOCIATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedComponentConfigurationImpl <em>Traced Component Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedComponentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedComponentConfiguration()
	 * @generated
	 */
	int TRACED_COMPONENT_CONFIGURATION = 44;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Component Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_CONFIGURATION_FEATURE_COUNT = TRACED_CLASS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Component Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_CONFIGURATION_OPERATION_COUNT = TRACED_CLASS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRealizationConfigurationImpl <em>Traced Realization Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRealizationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRealizationConfiguration()
	 * @generated
	 */
	int TRACED_REALIZATION_CONFIGURATION = 187;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ABSTRACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ABSTRACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALIZATION_CONFIGURATION_FEATURE_COUNT = TRACED_ABSTRACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALIZATION_CONFIGURATION_OPERATION_COUNT = TRACED_ABSTRACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedComponentRealizationConfigurationImpl <em>Traced Component Realization Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedComponentRealizationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedComponentRealizationConfiguration()
	 * @generated
	 */
	int TRACED_COMPONENT_REALIZATION_CONFIGURATION = 45;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Component Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_REALIZATION_CONFIGURATION_FEATURE_COUNT = TRACED_REALIZATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Component Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPONENT_REALIZATION_CONFIGURATION_OPERATION_COUNT = TRACED_REALIZATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuredActivityNodeConfigurationImpl <em>Traced Structured Activity Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuredActivityNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStructuredActivityNodeConfiguration()
	 * @generated
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION = 213;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Structured Activity Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Structured Activity Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConditionalNodeConfigurationImpl <em>Traced Conditional Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConditionalNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConditionalNodeConfiguration()
	 * @generated
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION = 46;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Conditional Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Conditional Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONDITIONAL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTypedElementConfigurationImpl <em>Traced Typed Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTypedElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTypedElementConfiguration()
	 * @generated
	 */
	int TRACED_TYPED_ELEMENT_CONFIGURATION = 230;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Typed Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPED_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Typed Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPED_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectableElementConfigurationImpl <em>Traced Connectable Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectableElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConnectableElementConfiguration()
	 * @generated
	 */
	int TRACED_CONNECTABLE_ELEMENT_CONFIGURATION = 47;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_TYPED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_TYPED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Connectable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_TYPED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Connectable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_TYPED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectableElementTemplateParameterConfigurationImpl <em>Traced Connectable Element Template Parameter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectableElementTemplateParameterConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConnectableElementTemplateParameterConfiguration()
	 * @generated
	 */
	int TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION = 48;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Connectable Element Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Connectable Element Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVertexConfigurationImpl <em>Traced Vertex Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVertexConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedVertexConfiguration()
	 * @generated
	 */
	int TRACED_VERTEX_CONFIGURATION = 239;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Vertex Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Vertex Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectionPointReferenceConfigurationImpl <em>Traced Connection Point Reference Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectionPointReferenceConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConnectionPointReferenceConfiguration()
	 * @generated
	 */
	int TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION = 49;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VERTEX_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VERTEX_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Connection Point Reference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION_FEATURE_COUNT = TRACED_VERTEX_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Connection Point Reference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION_OPERATION_COUNT = TRACED_VERTEX_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFeatureConfigurationImpl <em>Traced Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFeatureConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedFeatureConfiguration()
	 * @generated
	 */
	int TRACED_FEATURE_CONFIGURATION = 95;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_CONFIGURATION_FEATURE_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_CONFIGURATION_OPERATION_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectorConfigurationImpl <em>Traced Connector Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectorConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConnectorConfiguration()
	 * @generated
	 */
	int TRACED_CONNECTOR_CONFIGURATION = 50;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Connector Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_CONFIGURATION_FEATURE_COUNT = TRACED_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Connector Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_CONFIGURATION_OPERATION_COUNT = TRACED_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMultiplicityElementConfigurationImpl <em>Traced Multiplicity Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMultiplicityElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMultiplicityElementConfiguration()
	 * @generated
	 */
	int TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION = 145;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Multiplicity Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Multiplicity Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectorEndConfigurationImpl <em>Traced Connector End Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConnectorEndConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConnectorEndConfiguration()
	 * @generated
	 */
	int TRACED_CONNECTOR_END_CONFIGURATION = 51;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_END_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_END_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Connector End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_END_CONFIGURATION_FEATURE_COUNT = TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Connector End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTOR_END_CONFIGURATION_OPERATION_COUNT = TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConsiderIgnoreFragmentConfigurationImpl <em>Traced Consider Ignore Fragment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConsiderIgnoreFragmentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConsiderIgnoreFragmentConfiguration()
	 * @generated
	 */
	int TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION = 52;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_COMBINED_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_COMBINED_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Consider Ignore Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION_FEATURE_COUNT = TRACED_COMBINED_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Consider Ignore Fragment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION_OPERATION_COUNT = TRACED_COMBINED_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConstraintConfigurationImpl <em>Traced Constraint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedConstraintConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedConstraintConfiguration()
	 * @generated
	 */
	int TRACED_CONSTRAINT_CONFIGURATION = 53;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSTRAINT_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONSTRAINT_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedContinuationConfigurationImpl <em>Traced Continuation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedContinuationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedContinuationConfiguration()
	 * @generated
	 */
	int TRACED_CONTINUATION_CONFIGURATION = 54;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTINUATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTINUATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Continuation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTINUATION_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Continuation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTINUATION_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedControlFlowConfigurationImpl <em>Traced Control Flow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedControlFlowConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedControlFlowConfiguration()
	 * @generated
	 */
	int TRACED_CONTROL_FLOW_CONFIGURATION = 55;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_EDGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_EDGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Control Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_EDGE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Control Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_EDGE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkActionConfigurationImpl <em>Traced Link Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLinkActionConfiguration()
	 * @generated
	 */
	int TRACED_LINK_ACTION_CONFIGURATION = 126;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteLinkActionConfigurationImpl <em>Traced Write Link Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedWriteLinkActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedWriteLinkActionConfiguration()
	 * @generated
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION = 240;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Write Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_LINK_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Write Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WRITE_LINK_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_LINK_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateLinkActionConfigurationImpl <em>Traced Create Link Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateLinkActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCreateLinkActionConfiguration()
	 * @generated
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION = 57;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Create Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_LINK_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Create Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_LINK_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateLinkObjectActionConfigurationImpl <em>Traced Create Link Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateLinkObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCreateLinkObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION = 58;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CREATE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CREATE_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CREATE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Create Link Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_CREATE_LINK_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Create Link Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_CREATE_LINK_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateObjectActionConfigurationImpl <em>Traced Create Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedCreateObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedCreateObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION = 59;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Create Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Create Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CREATE_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDataStoreNodeConfigurationImpl <em>Traced Data Store Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDataStoreNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDataStoreNodeConfiguration()
	 * @generated
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION = 60;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Data Store Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Data Store Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_STORE_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDataTypeConfigurationImpl <em>Traced Data Type Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDataTypeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDataTypeConfiguration()
	 * @generated
	 */
	int TRACED_DATA_TYPE_CONFIGURATION = 61;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_TYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_TYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Data Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_TYPE_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Data Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DATA_TYPE_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDecisionNodeConfigurationImpl <em>Traced Decision Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDecisionNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDecisionNodeConfiguration()
	 * @generated
	 */
	int TRACED_DECISION_NODE_CONFIGURATION = 62;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Decision Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Decision Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeployedArtifactConfigurationImpl <em>Traced Deployed Artifact Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeployedArtifactConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDeployedArtifactConfiguration()
	 * @generated
	 */
	int TRACED_DEPLOYED_ARTIFACT_CONFIGURATION = 64;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYED_ARTIFACT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYED_ARTIFACT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Deployed Artifact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYED_ARTIFACT_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Deployed Artifact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYED_ARTIFACT_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentConfigurationImpl <em>Traced Deployment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDeploymentConfiguration()
	 * @generated
	 */
	int TRACED_DEPLOYMENT_CONFIGURATION = 65;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DEPENDENCY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DEPENDENCY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_CONFIGURATION_FEATURE_COUNT = TRACED_DEPENDENCY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_CONFIGURATION_OPERATION_COUNT = TRACED_DEPENDENCY_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentSpecificationConfigurationImpl <em>Traced Deployment Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDeploymentSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION = 66;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ARTIFACT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ARTIFACT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Deployment Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_ARTIFACT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Deployment Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_ARTIFACT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentTargetConfigurationImpl <em>Traced Deployment Target Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeploymentTargetConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDeploymentTargetConfiguration()
	 * @generated
	 */
	int TRACED_DEPLOYMENT_TARGET_CONFIGURATION = 67;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_TARGET_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_TARGET_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Deployment Target Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_TARGET_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Deployment Target Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEPLOYMENT_TARGET_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestroyLinkActionConfigurationImpl <em>Traced Destroy Link Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestroyLinkActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDestroyLinkActionConfiguration()
	 * @generated
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION = 68;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Destroy Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_LINK_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Destroy Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_LINK_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_LINK_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestroyObjectActionConfigurationImpl <em>Traced Destroy Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestroyObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDestroyObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION = 69;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Destroy Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Destroy Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOccurrenceSpecificationConfigurationImpl <em>Traced Occurrence Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOccurrenceSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOccurrenceSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION = 152;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageOccurrenceSpecificationConfigurationImpl <em>Traced Message Occurrence Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageOccurrenceSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMessageOccurrenceSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION = 143;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Message Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Message Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestructionOccurrenceSpecificationConfigurationImpl <em>Traced Destruction Occurrence Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDestructionOccurrenceSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDestructionOccurrenceSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION = 70;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Destruction Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Destruction Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNodeConfigurationImpl <em>Traced Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedNodeConfiguration()
	 * @generated
	 */
	int TRACED_NODE_CONFIGURATION = 148;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CLASS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CLASS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeviceConfigurationImpl <em>Traced Device Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDeviceConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDeviceConfiguration()
	 * @generated
	 */
	int TRACED_DEVICE_CONFIGURATION = 71;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEVICE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEVICE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Device Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEVICE_CONFIGURATION_FEATURE_COUNT = TRACED_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Device Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DEVICE_CONFIGURATION_OPERATION_COUNT = TRACED_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRelationshipConfigurationImpl <em>Traced Relationship Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRelationshipConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRelationshipConfiguration()
	 * @generated
	 */
	int TRACED_RELATIONSHIP_CONFIGURATION = 194;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Relationship Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Relationship Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDirectedRelationshipConfigurationImpl <em>Traced Directed Relationship Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDirectedRelationshipConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDirectedRelationshipConfiguration()
	 * @generated
	 */
	int TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION = 72;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Directed Relationship Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT = TRACED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Directed Relationship Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT = TRACED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValueSpecificationConfigurationImpl <em>Traced Value Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValueSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedValueSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_VALUE_SPECIFICATION_CONFIGURATION = 236;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Value Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Value Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationConfigurationImpl <em>Traced Duration Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDurationConfiguration()
	 * @generated
	 */
	int TRACED_DURATION_CONFIGURATION = 73;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Duration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Duration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIntervalConstraintConfigurationImpl <em>Traced Interval Constraint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIntervalConstraintConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedIntervalConstraintConfiguration()
	 * @generated
	 */
	int TRACED_INTERVAL_CONSTRAINT_CONFIGURATION = 122;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interval Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_FEATURE_COUNT = TRACED_CONSTRAINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interval Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_OPERATION_COUNT = TRACED_CONSTRAINT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationConstraintConfigurationImpl <em>Traced Duration Constraint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationConstraintConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDurationConstraintConfiguration()
	 * @generated
	 */
	int TRACED_DURATION_CONSTRAINT_CONFIGURATION = 74;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Duration Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONSTRAINT_CONFIGURATION_FEATURE_COUNT = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Duration Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_CONSTRAINT_CONFIGURATION_OPERATION_COUNT = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIntervalConfigurationImpl <em>Traced Interval Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIntervalConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedIntervalConfiguration()
	 * @generated
	 */
	int TRACED_INTERVAL_CONFIGURATION = 121;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERVAL_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationIntervalConfigurationImpl <em>Traced Duration Interval Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationIntervalConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDurationIntervalConfiguration()
	 * @generated
	 */
	int TRACED_DURATION_INTERVAL_CONFIGURATION = 75;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_INTERVAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERVAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_INTERVAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERVAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Duration Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_INTERVAL_CONFIGURATION_FEATURE_COUNT = TRACED_INTERVAL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Duration Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_INTERVAL_CONFIGURATION_OPERATION_COUNT = TRACED_INTERVAL_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObservationConfigurationImpl <em>Traced Observation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObservationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedObservationConfiguration()
	 * @generated
	 */
	int TRACED_OBSERVATION_CONFIGURATION = 151;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBSERVATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBSERVATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBSERVATION_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBSERVATION_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationObservationConfigurationImpl <em>Traced Duration Observation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedDurationObservationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedDurationObservationConfiguration()
	 * @generated
	 */
	int TRACED_DURATION_OBSERVATION_CONFIGURATION = 76;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_OBSERVATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBSERVATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_OBSERVATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBSERVATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Duration Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_OBSERVATION_CONFIGURATION_FEATURE_COUNT = TRACED_OBSERVATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Duration Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DURATION_OBSERVATION_CONFIGURATION_OPERATION_COUNT = TRACED_OBSERVATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementImportConfigurationImpl <em>Traced Element Import Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementImportConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedElementImportConfiguration()
	 * @generated
	 */
	int TRACED_ELEMENT_IMPORT_CONFIGURATION = 78;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_IMPORT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_IMPORT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Element Import Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_IMPORT_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Element Import Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_IMPORT_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEnumerationConfigurationImpl <em>Traced Enumeration Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEnumerationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedEnumerationConfiguration()
	 * @generated
	 */
	int TRACED_ENUMERATION_CONFIGURATION = 80;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DATA_TYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DATA_TYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Enumeration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_CONFIGURATION_FEATURE_COUNT = TRACED_DATA_TYPE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Enumeration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_CONFIGURATION_OPERATION_COUNT = TRACED_DATA_TYPE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInstanceSpecificationConfigurationImpl <em>Traced Instance Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInstanceSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInstanceSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_INSTANCE_SPECIFICATION_CONFIGURATION = 111;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DEPLOYMENT_TARGET_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DEPLOYMENT_TARGET_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Instance Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_DEPLOYMENT_TARGET_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Instance Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_DEPLOYMENT_TARGET_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEnumerationLiteralConfigurationImpl <em>Traced Enumeration Literal Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedEnumerationLiteralConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedEnumerationLiteralConfiguration()
	 * @generated
	 */
	int TRACED_ENUMERATION_LITERAL_CONFIGURATION = 81;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_LITERAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INSTANCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_LITERAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INSTANCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Enumeration Literal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_LITERAL_CONFIGURATION_FEATURE_COUNT = TRACED_INSTANCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Enumeration Literal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ENUMERATION_LITERAL_CONFIGURATION_OPERATION_COUNT = TRACED_INSTANCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExceptionHandlerConfigurationImpl <em>Traced Exception Handler Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExceptionHandlerConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExceptionHandlerConfiguration()
	 * @generated
	 */
	int TRACED_EXCEPTION_HANDLER_CONFIGURATION = 83;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXCEPTION_HANDLER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXCEPTION_HANDLER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Exception Handler Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXCEPTION_HANDLER_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Exception Handler Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXCEPTION_HANDLER_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionEnvironmentConfigurationImpl <em>Traced Execution Environment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionEnvironmentConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExecutionEnvironmentConfiguration()
	 * @generated
	 */
	int TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION = 85;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Execution Environment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION_FEATURE_COUNT = TRACED_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Execution Environment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION_OPERATION_COUNT = TRACED_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionOccurrenceSpecificationConfigurationImpl <em>Traced Execution Occurrence Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExecutionOccurrenceSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExecutionOccurrenceSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION = 86;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Execution Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Execution Occurrence Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpansionNodeConfigurationImpl <em>Traced Expansion Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpansionNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExpansionNodeConfiguration()
	 * @generated
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION = 88;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBJECT_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_OBJECT_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Expansion Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Expansion Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_OBJECT_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpansionRegionConfigurationImpl <em>Traced Expansion Region Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpansionRegionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExpansionRegionConfiguration()
	 * @generated
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION = 89;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Expansion Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Expansion Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPANSION_REGION_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpressionConfigurationImpl <em>Traced Expression Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExpressionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExpressionConfiguration()
	 * @generated
	 */
	int TRACED_EXPRESSION_CONFIGURATION = 90;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtendConfigurationImpl <em>Traced Extend Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtendConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExtendConfiguration()
	 * @generated
	 */
	int TRACED_EXTEND_CONFIGURATION = 91;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTEND_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTEND_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Extend Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTEND_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Extend Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTEND_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionConfigurationImpl <em>Traced Extension Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExtensionConfiguration()
	 * @generated
	 */
	int TRACED_EXTENSION_CONFIGURATION = 92;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ASSOCIATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ASSOCIATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Extension Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_CONFIGURATION_FEATURE_COUNT = TRACED_ASSOCIATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Extension Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_CONFIGURATION_OPERATION_COUNT = TRACED_ASSOCIATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuralFeatureConfigurationImpl <em>Traced Structural Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStructuralFeatureConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStructuralFeatureConfiguration()
	 * @generated
	 */
	int TRACED_STRUCTURAL_FEATURE_CONFIGURATION = 212;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Structural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT = TRACED_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Structural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT = TRACED_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPropertyConfigurationImpl <em>Traced Property Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPropertyConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPropertyConfiguration()
	 * @generated
	 */
	int TRACED_PROPERTY_CONFIGURATION = 172;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROPERTY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROPERTY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURAL_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Property Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROPERTY_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Property Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROPERTY_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionEndConfigurationImpl <em>Traced Extension End Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionEndConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExtensionEndConfiguration()
	 * @generated
	 */
	int TRACED_EXTENSION_END_CONFIGURATION = 93;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_END_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PROPERTY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_END_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PROPERTY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Extension End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_END_CONFIGURATION_FEATURE_COUNT = TRACED_PROPERTY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Extension End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_END_CONFIGURATION_OPERATION_COUNT = TRACED_PROPERTY_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionPointConfigurationImpl <em>Traced Extension Point Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedExtensionPointConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedExtensionPointConfiguration()
	 * @generated
	 */
	int TRACED_EXTENSION_POINT_CONFIGURATION = 94;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_POINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_POINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Extension Point Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_POINT_CONFIGURATION_FEATURE_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Extension Point Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSION_POINT_CONFIGURATION_OPERATION_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateConfigurationImpl <em>Traced State Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStateConfiguration()
	 * @generated
	 */
	int TRACED_STATE_CONFIGURATION = 206;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced State Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced State Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFinalStateConfigurationImpl <em>Traced Final State Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFinalStateConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedFinalStateConfiguration()
	 * @generated
	 */
	int TRACED_FINAL_STATE_CONFIGURATION = 97;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_STATE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STATE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_STATE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STATE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Final State Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_STATE_CONFIGURATION_FEATURE_COUNT = TRACED_STATE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Final State Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_STATE_CONFIGURATION_OPERATION_COUNT = TRACED_STATE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFlowFinalNodeConfigurationImpl <em>Traced Flow Final Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFlowFinalNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedFlowFinalNodeConfiguration()
	 * @generated
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION = 98;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_FINAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_FINAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Flow Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_FINAL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Flow Final Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_FINAL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedForkNodeConfigurationImpl <em>Traced Fork Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedForkNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedForkNodeConfiguration()
	 * @generated
	 */
	int TRACED_FORK_NODE_CONFIGURATION = 99;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Fork Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Fork Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueBehaviorConfigurationImpl <em>Traced Opaque Behavior Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueBehaviorConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOpaqueBehaviorConfiguration()
	 * @generated
	 */
	int TRACED_OPAQUE_BEHAVIOR_CONFIGURATION = 154;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Opaque Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFunctionBehaviorConfigurationImpl <em>Traced Function Behavior Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedFunctionBehaviorConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedFunctionBehaviorConfiguration()
	 * @generated
	 */
	int TRACED_FUNCTION_BEHAVIOR_CONFIGURATION = 100;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FUNCTION_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OPAQUE_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FUNCTION_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OPAQUE_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Function Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FUNCTION_BEHAVIOR_CONFIGURATION_FEATURE_COUNT = TRACED_OPAQUE_BEHAVIOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Function Behavior Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FUNCTION_BEHAVIOR_CONFIGURATION_OPERATION_COUNT = TRACED_OPAQUE_BEHAVIOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageEndConfigurationImpl <em>Traced Message End Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageEndConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMessageEndConfiguration()
	 * @generated
	 */
	int TRACED_MESSAGE_END_CONFIGURATION = 141;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_END_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_END_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Message End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_END_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Message End Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_END_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGateConfigurationImpl <em>Traced Gate Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGateConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedGateConfiguration()
	 * @generated
	 */
	int TRACED_GATE_CONFIGURATION = 101;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GATE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MESSAGE_END_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GATE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MESSAGE_END_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Gate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GATE_CONFIGURATION_FEATURE_COUNT = TRACED_MESSAGE_END_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Gate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GATE_CONFIGURATION_OPERATION_COUNT = TRACED_MESSAGE_END_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralOrderingConfigurationImpl <em>Traced General Ordering Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralOrderingConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedGeneralOrderingConfiguration()
	 * @generated
	 */
	int TRACED_GENERAL_ORDERING_CONFIGURATION = 102;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERAL_ORDERING_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERAL_ORDERING_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced General Ordering Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERAL_ORDERING_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced General Ordering Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERAL_ORDERING_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralizationConfigurationImpl <em>Traced Generalization Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralizationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedGeneralizationConfiguration()
	 * @generated
	 */
	int TRACED_GENERALIZATION_CONFIGURATION = 103;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Generalization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Generalization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralizationSetConfigurationImpl <em>Traced Generalization Set Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedGeneralizationSetConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedGeneralizationSetConfiguration()
	 * @generated
	 */
	int TRACED_GENERALIZATION_SET_CONFIGURATION = 104;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_SET_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_SET_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Generalization Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_SET_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Generalization Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERALIZATION_SET_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedImageConfigurationImpl <em>Traced Image Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedImageConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedImageConfiguration()
	 * @generated
	 */
	int TRACED_IMAGE_CONFIGURATION = 105;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IMAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IMAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Image Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IMAGE_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Image Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IMAGE_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIncludeConfigurationImpl <em>Traced Include Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedIncludeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedIncludeConfiguration()
	 * @generated
	 */
	int TRACED_INCLUDE_CONFIGURATION = 106;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INCLUDE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INCLUDE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Include Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INCLUDE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Include Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INCLUDE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInformationFlowConfigurationImpl <em>Traced Information Flow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInformationFlowConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInformationFlowConfiguration()
	 * @generated
	 */
	int TRACED_INFORMATION_FLOW_CONFIGURATION = 107;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_FLOW_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_FLOW_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Information Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_FLOW_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Information Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_FLOW_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInformationItemConfigurationImpl <em>Traced Information Item Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInformationItemConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInformationItemConfiguration()
	 * @generated
	 */
	int TRACED_INFORMATION_ITEM_CONFIGURATION = 108;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_ITEM_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_ITEM_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Information Item Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_ITEM_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Information Item Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFORMATION_ITEM_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInitialNodeConfigurationImpl <em>Traced Initial Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInitialNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInitialNodeConfiguration()
	 * @generated
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION = 109;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Initial Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Initial Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInstanceValueConfigurationImpl <em>Traced Instance Value Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInstanceValueConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInstanceValueConfiguration()
	 * @generated
	 */
	int TRACED_INSTANCE_VALUE_CONFIGURATION = 112;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_VALUE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_VALUE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Instance Value Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_VALUE_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Instance Value Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTANCE_VALUE_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionConfigurationImpl <em>Traced Interaction Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInteractionConfiguration()
	 * @generated
	 */
	int TRACED_INTERACTION_CONFIGURATION = 113;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interaction Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interaction Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionConstraintConfigurationImpl <em>Traced Interaction Constraint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionConstraintConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInteractionConstraintConfiguration()
	 * @generated
	 */
	int TRACED_INTERACTION_CONSTRAINT_CONFIGURATION = 114;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interaction Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONSTRAINT_CONFIGURATION_FEATURE_COUNT = TRACED_CONSTRAINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interaction Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_CONSTRAINT_CONFIGURATION_OPERATION_COUNT = TRACED_CONSTRAINT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionOperandConfigurationImpl <em>Traced Interaction Operand Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionOperandConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInteractionOperandConfiguration()
	 * @generated
	 */
	int TRACED_INTERACTION_OPERAND_CONFIGURATION = 116;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_OPERAND_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_OPERAND_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interaction Operand Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_OPERAND_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interaction Operand Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_OPERAND_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionUseConfigurationImpl <em>Traced Interaction Use Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInteractionUseConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInteractionUseConfiguration()
	 * @generated
	 */
	int TRACED_INTERACTION_USE_CONFIGURATION = 117;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_USE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_USE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interaction Use Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_USE_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interaction Use Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERACTION_USE_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterfaceConfigurationImpl <em>Traced Interface Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterfaceConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInterfaceConfiguration()
	 * @generated
	 */
	int TRACED_INTERFACE_CONFIGURATION = 118;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterfaceRealizationConfigurationImpl <em>Traced Interface Realization Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterfaceRealizationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInterfaceRealizationConfiguration()
	 * @generated
	 */
	int TRACED_INTERFACE_REALIZATION_CONFIGURATION = 119;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Interface Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_REALIZATION_CONFIGURATION_FEATURE_COUNT = TRACED_REALIZATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interface Realization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERFACE_REALIZATION_CONFIGURATION_OPERATION_COUNT = TRACED_REALIZATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterruptibleActivityRegionConfigurationImpl <em>Traced Interruptible Activity Region Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedInterruptibleActivityRegionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedInterruptibleActivityRegionConfiguration()
	 * @generated
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION = 120;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_GROUP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Interruptible Activity Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_GROUP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Interruptible Activity Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_GROUP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedJoinNodeConfigurationImpl <em>Traced Join Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedJoinNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedJoinNodeConfiguration()
	 * @generated
	 */
	int TRACED_JOIN_NODE_CONFIGURATION = 124;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Join Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Join Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLifelineConfigurationImpl <em>Traced Lifeline Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLifelineConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLifelineConfiguration()
	 * @generated
	 */
	int TRACED_LIFELINE_CONFIGURATION = 125;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LIFELINE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LIFELINE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Lifeline Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LIFELINE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Lifeline Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LIFELINE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndDataConfigurationImpl <em>Traced Link End Data Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndDataConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLinkEndDataConfiguration()
	 * @generated
	 */
	int TRACED_LINK_END_DATA_CONFIGURATION = 128;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DATA_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DATA_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Link End Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DATA_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Link End Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DATA_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndCreationDataConfigurationImpl <em>Traced Link End Creation Data Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndCreationDataConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLinkEndCreationDataConfiguration()
	 * @generated
	 */
	int TRACED_LINK_END_CREATION_DATA_CONFIGURATION = 127;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_CREATION_DATA_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LINK_END_DATA_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_CREATION_DATA_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LINK_END_DATA_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Link End Creation Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_CREATION_DATA_CONFIGURATION_FEATURE_COUNT = TRACED_LINK_END_DATA_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Link End Creation Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_CREATION_DATA_CONFIGURATION_OPERATION_COUNT = TRACED_LINK_END_DATA_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndDestructionDataConfigurationImpl <em>Traced Link End Destruction Data Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLinkEndDestructionDataConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLinkEndDestructionDataConfiguration()
	 * @generated
	 */
	int TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION = 129;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LINK_END_DATA_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LINK_END_DATA_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Link End Destruction Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION_FEATURE_COUNT = TRACED_LINK_END_DATA_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Link End Destruction Data Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION_OPERATION_COUNT = TRACED_LINK_END_DATA_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralSpecificationConfigurationImpl <em>Traced Literal Specification Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralSpecificationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralSpecificationConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_SPECIFICATION_CONFIGURATION = 134;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Specification Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralBooleanConfigurationImpl <em>Traced Literal Boolean Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralBooleanConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralBooleanConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_BOOLEAN_CONFIGURATION = 130;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Boolean Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Boolean Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralIntegerConfigurationImpl <em>Traced Literal Integer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralIntegerConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralIntegerConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_INTEGER_CONFIGURATION = 131;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Integer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Integer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralNullConfigurationImpl <em>Traced Literal Null Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralNullConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralNullConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_NULL_CONFIGURATION = 132;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_NULL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_NULL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Null Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_NULL_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Null Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_NULL_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralRealConfigurationImpl <em>Traced Literal Real Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralRealConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralRealConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_REAL_CONFIGURATION = 133;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_REAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_REAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Real Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_REAL_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Real Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_REAL_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralStringConfigurationImpl <em>Traced Literal String Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralStringConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralStringConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_STRING_CONFIGURATION = 135;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_STRING_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_STRING_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal String Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_STRING_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal String Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_STRING_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralUnlimitedNaturalConfigurationImpl <em>Traced Literal Unlimited Natural Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLiteralUnlimitedNaturalConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLiteralUnlimitedNaturalConfiguration()
	 * @generated
	 */
	int TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION = 136;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LITERAL_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Unlimited Natural Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION_FEATURE_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Unlimited Natural Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION_OPERATION_COUNT = TRACED_LITERAL_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLoopNodeConfigurationImpl <em>Traced Loop Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedLoopNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedLoopNodeConfiguration()
	 * @generated
	 */
	int TRACED_LOOP_NODE_CONFIGURATION = 137;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOOP_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOOP_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOOP_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Loop Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOOP_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Loop Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOOP_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedManifestationConfigurationImpl <em>Traced Manifestation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedManifestationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedManifestationConfiguration()
	 * @generated
	 */
	int TRACED_MANIFESTATION_CONFIGURATION = 138;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANIFESTATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ABSTRACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANIFESTATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ABSTRACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Manifestation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANIFESTATION_CONFIGURATION_FEATURE_COUNT = TRACED_ABSTRACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Manifestation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANIFESTATION_CONFIGURATION_OPERATION_COUNT = TRACED_ABSTRACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMergeNodeConfigurationImpl <em>Traced Merge Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMergeNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMergeNodeConfiguration()
	 * @generated
	 */
	int TRACED_MERGE_NODE_CONFIGURATION = 139;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONTROL_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CONTROL_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Merge Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Merge Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_CONTROL_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageConfigurationImpl <em>Traced Message Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedMessageConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedMessageConfiguration()
	 * @generated
	 */
	int TRACED_MESSAGE_CONFIGURATION = 140;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Message Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Message Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MESSAGE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageConfigurationImpl <em>Traced Package Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPackageConfiguration()
	 * @generated
	 */
	int TRACED_PACKAGE_CONFIGURATION = 159;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Package Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Package Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedModelConfigurationImpl <em>Traced Model Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedModelConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedModelConfiguration()
	 * @generated
	 */
	int TRACED_MODEL_CONFIGURATION = 144;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Model Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Model Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODEL_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObjectFlowConfigurationImpl <em>Traced Object Flow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedObjectFlowConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedObjectFlowConfiguration()
	 * @generated
	 */
	int TRACED_OBJECT_FLOW_CONFIGURATION = 149;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_FLOW_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTIVITY_EDGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_FLOW_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTIVITY_EDGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Object Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_FLOW_CONFIGURATION_FEATURE_COUNT = TRACED_ACTIVITY_EDGE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Object Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_FLOW_CONFIGURATION_OPERATION_COUNT = TRACED_ACTIVITY_EDGE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueActionConfigurationImpl <em>Traced Opaque Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOpaqueActionConfiguration()
	 * @generated
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION = 153;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueExpressionConfigurationImpl <em>Traced Opaque Expression Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOpaqueExpressionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOpaqueExpressionConfiguration()
	 * @generated
	 */
	int TRACED_OPAQUE_EXPRESSION_CONFIGURATION = 155;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_EXPRESSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_EXPRESSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Opaque Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_EXPRESSION_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_EXPRESSION_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOperationConfigurationImpl <em>Traced Operation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOperationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOperationConfiguration()
	 * @generated
	 */
	int TRACED_OPERATION_CONFIGURATION = 156;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Operation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Operation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOperationTemplateParameterConfigurationImpl <em>Traced Operation Template Parameter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOperationTemplateParameterConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOperationTemplateParameterConfiguration()
	 * @generated
	 */
	int TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION = 157;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_TEMPLATE_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Operation Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Operation Template Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT = TRACED_TEMPLATE_PARAMETER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOutputPinConfigurationImpl <em>Traced Output Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedOutputPinConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedOutputPinConfiguration()
	 * @generated
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION = 158;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Output Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION_FEATURE_COUNT = TRACED_PIN_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Output Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OUTPUT_PIN_CONFIGURATION_OPERATION_COUNT = TRACED_PIN_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageImportConfigurationImpl <em>Traced Package Import Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageImportConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPackageImportConfiguration()
	 * @generated
	 */
	int TRACED_PACKAGE_IMPORT_CONFIGURATION = 160;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_IMPORT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_IMPORT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Package Import Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_IMPORT_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Package Import Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_IMPORT_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageMergeConfigurationImpl <em>Traced Package Merge Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPackageMergeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPackageMergeConfiguration()
	 * @generated
	 */
	int TRACED_PACKAGE_MERGE_CONFIGURATION = 161;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_MERGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_MERGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Package Merge Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_MERGE_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Package Merge Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PACKAGE_MERGE_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterConfigurationImpl <em>Traced Parameter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedParameterConfiguration()
	 * @generated
	 */
	int TRACED_PARAMETER_CONFIGURATION = 163;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_CONFIGURATION_FEATURE_COUNT = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Parameter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_CONFIGURATION_OPERATION_COUNT = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterSetConfigurationImpl <em>Traced Parameter Set Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterSetConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedParameterSetConfiguration()
	 * @generated
	 */
	int TRACED_PARAMETER_SET_CONFIGURATION = 164;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_SET_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_SET_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Parameter Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_SET_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Parameter Set Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_SET_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterableElementConfigurationImpl <em>Traced Parameterable Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedParameterableElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedParameterableElementConfiguration()
	 * @generated
	 */
	int TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION = 165;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Parameterable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Parameterable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPartDecompositionConfigurationImpl <em>Traced Part Decomposition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPartDecompositionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPartDecompositionConfiguration()
	 * @generated
	 */
	int TRACED_PART_DECOMPOSITION_CONFIGURATION = 166;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PART_DECOMPOSITION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_USE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PART_DECOMPOSITION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_USE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Part Decomposition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PART_DECOMPOSITION_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_USE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Part Decomposition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PART_DECOMPOSITION_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_USE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPortConfigurationImpl <em>Traced Port Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPortConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPortConfiguration()
	 * @generated
	 */
	int TRACED_PORT_CONFIGURATION = 168;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PROPERTY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PROPERTY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_CONFIGURATION_FEATURE_COUNT = TRACED_PROPERTY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_CONFIGURATION_OPERATION_COUNT = TRACED_PROPERTY_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPrimitiveTypeConfigurationImpl <em>Traced Primitive Type Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPrimitiveTypeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPrimitiveTypeConfiguration()
	 * @generated
	 */
	int TRACED_PRIMITIVE_TYPE_CONFIGURATION = 169;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DATA_TYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DATA_TYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Primitive Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_CONFIGURATION_FEATURE_COUNT = TRACED_DATA_TYPE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Primitive Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_CONFIGURATION_OPERATION_COUNT = TRACED_DATA_TYPE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProfileApplicationConfigurationImpl <em>Traced Profile Application Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProfileApplicationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedProfileApplicationConfiguration()
	 * @generated
	 */
	int TRACED_PROFILE_APPLICATION_CONFIGURATION = 170;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_APPLICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_APPLICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Profile Application Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_APPLICATION_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Profile Application Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_APPLICATION_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProfileConfigurationImpl <em>Traced Profile Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProfileConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedProfileConfiguration()
	 * @generated
	 */
	int TRACED_PROFILE_CONFIGURATION = 171;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Profile Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Profile Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROFILE_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolConformanceConfigurationImpl <em>Traced Protocol Conformance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolConformanceConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedProtocolConformanceConfiguration()
	 * @generated
	 */
	int TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION = 173;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Protocol Conformance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Protocol Conformance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateMachineConfigurationImpl <em>Traced State Machine Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateMachineConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStateMachineConfiguration()
	 * @generated
	 */
	int TRACED_STATE_MACHINE_CONFIGURATION = 208;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIOR_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIOR_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced State Machine Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced State Machine Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolStateMachineConfigurationImpl <em>Traced Protocol State Machine Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolStateMachineConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedProtocolStateMachineConfiguration()
	 * @generated
	 */
	int TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION = 174;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STATE_MACHINE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STATE_MACHINE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Protocol State Machine Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION_FEATURE_COUNT = TRACED_STATE_MACHINE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Protocol State Machine Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION_OPERATION_COUNT = TRACED_STATE_MACHINE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTransitionConfigurationImpl <em>Traced Transition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTransitionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTransitionConfiguration()
	 * @generated
	 */
	int TRACED_TRANSITION_CONFIGURATION = 227;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolTransitionConfigurationImpl <em>Traced Protocol Transition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedProtocolTransitionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedProtocolTransitionConfiguration()
	 * @generated
	 */
	int TRACED_PROTOCOL_TRANSITION_CONFIGURATION = 175;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_TRANSITION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_TRANSITION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_TRANSITION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_TRANSITION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Protocol Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_TRANSITION_CONFIGURATION_FEATURE_COUNT = TRACED_TRANSITION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Protocol Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PROTOCOL_TRANSITION_CONFIGURATION_OPERATION_COUNT = TRACED_TRANSITION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPseudostateConfigurationImpl <em>Traced Pseudostate Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedPseudostateConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedPseudostateConfiguration()
	 * @generated
	 */
	int TRACED_PSEUDOSTATE_CONFIGURATION = 176;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PSEUDOSTATE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VERTEX_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PSEUDOSTATE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VERTEX_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Pseudostate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PSEUDOSTATE_CONFIGURATION_FEATURE_COUNT = TRACED_VERTEX_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Pseudostate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PSEUDOSTATE_CONFIGURATION_OPERATION_COUNT = TRACED_VERTEX_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedQualifierValueConfigurationImpl <em>Traced Qualifier Value Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedQualifierValueConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedQualifierValueConfiguration()
	 * @generated
	 */
	int TRACED_QUALIFIER_VALUE_CONFIGURATION = 177;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_QUALIFIER_VALUE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_QUALIFIER_VALUE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Qualifier Value Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_QUALIFIER_VALUE_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Qualifier Value Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_QUALIFIER_VALUE_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRaiseExceptionActionConfigurationImpl <em>Traced Raise Exception Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRaiseExceptionActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRaiseExceptionActionConfiguration()
	 * @generated
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION = 178;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Raise Exception Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Raise Exception Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadExtentActionConfigurationImpl <em>Traced Read Extent Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadExtentActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadExtentActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION = 179;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Extent Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Extent Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_EXTENT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadIsClassifiedObjectActionConfigurationImpl <em>Traced Read Is Classified Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadIsClassifiedObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadIsClassifiedObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION = 180;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Is Classified Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Is Classified Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkActionConfigurationImpl <em>Traced Read Link Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadLinkActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION = 181;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_LINK_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_LINK_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_LINK_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Link Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_LINK_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkObjectEndActionConfigurationImpl <em>Traced Read Link Object End Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkObjectEndActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadLinkObjectEndActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION = 182;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Link Object End Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Link Object End Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkObjectEndQualifierActionConfigurationImpl <em>Traced Read Link Object End Qualifier Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadLinkObjectEndQualifierActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadLinkObjectEndQualifierActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION = 183;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Link Object End Qualifier Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Link Object End Qualifier Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadSelfActionConfigurationImpl <em>Traced Read Self Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadSelfActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadSelfActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION = 184;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Self Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Self Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_SELF_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadStructuralFeatureActionConfigurationImpl <em>Traced Read Structural Feature Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadStructuralFeatureActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadStructuralFeatureActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION = 185;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Structural Feature Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadVariableActionConfigurationImpl <em>Traced Read Variable Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReadVariableActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReadVariableActionConfiguration()
	 * @generated
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION = 186;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Read Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Read Variable Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_READ_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReceptionConfigurationImpl <em>Traced Reception Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReceptionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReceptionConfiguration()
	 * @generated
	 */
	int TRACED_RECEPTION_CONFIGURATION = 188;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECEPTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECEPTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Reception Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECEPTION_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Reception Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECEPTION_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIORAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReclassifyObjectActionConfigurationImpl <em>Traced Reclassify Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReclassifyObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReclassifyObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION = 189;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Reclassify Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Reclassify Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRedefinableTemplateSignatureConfigurationImpl <em>Traced Redefinable Template Signature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRedefinableTemplateSignatureConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRedefinableTemplateSignatureConfiguration()
	 * @generated
	 */
	int TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION = 191;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Redefinable Template Signature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION_FEATURE_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Redefinable Template Signature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION_OPERATION_COUNT = TRACED_REDEFINABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReduceActionConfigurationImpl <em>Traced Reduce Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReduceActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReduceActionConfiguration()
	 * @generated
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION = 192;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Reduce Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Reduce Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REDUCE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRegionConfigurationImpl <em>Traced Region Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRegionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRegionConfiguration()
	 * @generated
	 */
	int TRACED_REGION_CONFIGURATION = 193;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REGION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMESPACE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REGION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMESPACE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REGION_CONFIGURATION_FEATURE_COUNT = TRACED_NAMESPACE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Region Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REGION_CONFIGURATION_OPERATION_COUNT = TRACED_NAMESPACE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRemoveStructuralFeatureValueActionConfigurationImpl <em>Traced Remove Structural Feature Value Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRemoveStructuralFeatureValueActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRemoveStructuralFeatureValueActionConfiguration()
	 * @generated
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION = 195;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Remove Structural Feature Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Remove Structural Feature Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRemoveVariableValueActionConfigurationImpl <em>Traced Remove Variable Value Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedRemoveVariableValueActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedRemoveVariableValueActionConfiguration()
	 * @generated
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION = 196;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Remove Variable Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Remove Variable Value Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReplyActionConfigurationImpl <em>Traced Reply Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedReplyActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedReplyActionConfiguration()
	 * @generated
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION = 197;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Reply Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Reply Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPLY_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSendObjectActionConfigurationImpl <em>Traced Send Object Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSendObjectActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSendObjectActionConfiguration()
	 * @generated
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION = 198;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INVOCATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Send Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Send Object Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_OBJECT_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSendSignalActionConfigurationImpl <em>Traced Send Signal Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSendSignalActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSendSignalActionConfiguration()
	 * @generated
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION = 199;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INVOCATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INVOCATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Send Signal Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Send Signal Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEND_SIGNAL_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_INVOCATION_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSequenceNodeConfigurationImpl <em>Traced Sequence Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSequenceNodeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSequenceNodeConfiguration()
	 * @generated
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION = 200;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Sequence Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION_FEATURE_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Sequence Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_NODE_CONFIGURATION_OPERATION_COUNT = TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSignalConfigurationImpl <em>Traced Signal Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSignalConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSignalConfiguration()
	 * @generated
	 */
	int TRACED_SIGNAL_CONFIGURATION = 201;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Signal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_CONFIGURATION_FEATURE_COUNT = TRACED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Signal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_CONFIGURATION_OPERATION_COUNT = TRACED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSignalEventConfigurationImpl <em>Traced Signal Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSignalEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSignalEventConfiguration()
	 * @generated
	 */
	int TRACED_SIGNAL_EVENT_CONFIGURATION = 202;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_MESSAGE_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_MESSAGE_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Signal Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Signal Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIGNAL_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_MESSAGE_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSlotConfigurationImpl <em>Traced Slot Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSlotConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSlotConfiguration()
	 * @generated
	 */
	int TRACED_SLOT_CONFIGURATION = 203;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SLOT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SLOT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Slot Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SLOT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Slot Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SLOT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStartClassifierBehaviorActionConfigurationImpl <em>Traced Start Classifier Behavior Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStartClassifierBehaviorActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStartClassifierBehaviorActionConfiguration()
	 * @generated
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION = 204;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Start Classifier Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Start Classifier Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStartObjectBehaviorActionConfigurationImpl <em>Traced Start Object Behavior Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStartObjectBehaviorActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStartObjectBehaviorActionConfiguration()
	 * @generated
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION = 205;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_CALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Start Object Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_CALL_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Start Object Behavior Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_CALL_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateInvariantConfigurationImpl <em>Traced State Invariant Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStateInvariantConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStateInvariantConfiguration()
	 * @generated
	 */
	int TRACED_STATE_INVARIANT_CONFIGURATION = 207;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_INVARIANT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_INVARIANT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERACTION_FRAGMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced State Invariant Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_INVARIANT_CONFIGURATION_FEATURE_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced State Invariant Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_INVARIANT_CONFIGURATION_OPERATION_COUNT = TRACED_INTERACTION_FRAGMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStereotypeConfigurationImpl <em>Traced Stereotype Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStereotypeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStereotypeConfiguration()
	 * @generated
	 */
	int TRACED_STEREOTYPE_CONFIGURATION = 209;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STEREOTYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CLASS_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STEREOTYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CLASS_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Stereotype Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STEREOTYPE_CONFIGURATION_FEATURE_COUNT = TRACED_CLASS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Stereotype Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STEREOTYPE_CONFIGURATION_OPERATION_COUNT = TRACED_CLASS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStringExpressionConfigurationImpl <em>Traced String Expression Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedStringExpressionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedStringExpressionConfiguration()
	 * @generated
	 */
	int TRACED_STRING_EXPRESSION_CONFIGURATION = 210;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_EXPRESSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EXPRESSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_EXPRESSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EXPRESSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced String Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_EXPRESSION_CONFIGURATION_FEATURE_COUNT = TRACED_EXPRESSION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced String Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_EXPRESSION_CONFIGURATION_OPERATION_COUNT = TRACED_EXPRESSION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSubstitutionConfigurationImpl <em>Traced Substitution Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedSubstitutionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedSubstitutionConfiguration()
	 * @generated
	 */
	int TRACED_SUBSTITUTION_CONFIGURATION = 215;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SUBSTITUTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_REALIZATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SUBSTITUTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_REALIZATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Substitution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SUBSTITUTION_CONFIGURATION_FEATURE_COUNT = TRACED_REALIZATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Substitution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SUBSTITUTION_CONFIGURATION_OPERATION_COUNT = TRACED_REALIZATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateBindingConfigurationImpl <em>Traced Template Binding Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateBindingConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTemplateBindingConfiguration()
	 * @generated
	 */
	int TRACED_TEMPLATE_BINDING_CONFIGURATION = 216;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_BINDING_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_BINDING_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Template Binding Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_BINDING_CONFIGURATION_FEATURE_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Template Binding Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_BINDING_CONFIGURATION_OPERATION_COUNT = TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateParameterSubstitutionConfigurationImpl <em>Traced Template Parameter Substitution Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateParameterSubstitutionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTemplateParameterSubstitutionConfiguration()
	 * @generated
	 */
	int TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION = 218;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Template Parameter Substitution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Template Parameter Substitution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateSignatureConfigurationImpl <em>Traced Template Signature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateSignatureConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTemplateSignatureConfiguration()
	 * @generated
	 */
	int TRACED_TEMPLATE_SIGNATURE_CONFIGURATION = 219;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_SIGNATURE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_SIGNATURE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Template Signature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_SIGNATURE_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Template Signature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATE_SIGNATURE_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateableElementConfigurationImpl <em>Traced Templateable Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTemplateableElementConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTemplateableElementConfiguration()
	 * @generated
	 */
	int TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION = 220;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Templateable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = TRACED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Templateable Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = TRACED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTestIdentityActionConfigurationImpl <em>Traced Test Identity Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTestIdentityActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTestIdentityActionConfiguration()
	 * @generated
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION = 221;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Test Identity Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Test Identity Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TEST_IDENTITY_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeConstraintConfigurationImpl <em>Traced Time Constraint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeConstraintConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTimeConstraintConfiguration()
	 * @generated
	 */
	int TRACED_TIME_CONSTRAINT_CONFIGURATION = 222;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Time Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_CONSTRAINT_CONFIGURATION_FEATURE_COUNT = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Time Constraint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_CONSTRAINT_CONFIGURATION_OPERATION_COUNT = TRACED_INTERVAL_CONSTRAINT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeEventConfigurationImpl <em>Traced Time Event Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeEventConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTimeEventConfiguration()
	 * @generated
	 */
	int TRACED_TIME_EVENT_CONFIGURATION = 223;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_EVENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_EVENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Time Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EVENT_CONFIGURATION_FEATURE_COUNT = TRACED_EVENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Time Event Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EVENT_CONFIGURATION_OPERATION_COUNT = TRACED_EVENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeExpressionConfigurationImpl <em>Traced Time Expression Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeExpressionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTimeExpressionConfiguration()
	 * @generated
	 */
	int TRACED_TIME_EXPRESSION_CONFIGURATION = 224;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EXPRESSION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_VALUE_SPECIFICATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EXPRESSION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_VALUE_SPECIFICATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Time Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EXPRESSION_CONFIGURATION_FEATURE_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Time Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_EXPRESSION_CONFIGURATION_OPERATION_COUNT = TRACED_VALUE_SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeIntervalConfigurationImpl <em>Traced Time Interval Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeIntervalConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTimeIntervalConfiguration()
	 * @generated
	 */
	int TRACED_TIME_INTERVAL_CONFIGURATION = 225;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_INTERVAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INTERVAL_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_INTERVAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INTERVAL_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Time Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_INTERVAL_CONFIGURATION_FEATURE_COUNT = TRACED_INTERVAL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Time Interval Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_INTERVAL_CONFIGURATION_OPERATION_COUNT = TRACED_INTERVAL_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeObservationConfigurationImpl <em>Traced Time Observation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTimeObservationConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTimeObservationConfiguration()
	 * @generated
	 */
	int TRACED_TIME_OBSERVATION_CONFIGURATION = 226;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_OBSERVATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_OBSERVATION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_OBSERVATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_OBSERVATION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Time Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_OBSERVATION_CONFIGURATION_FEATURE_COUNT = TRACED_OBSERVATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Time Observation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TIME_OBSERVATION_CONFIGURATION_OPERATION_COUNT = TRACED_OBSERVATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTriggerConfigurationImpl <em>Traced Trigger Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTriggerConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTriggerConfiguration()
	 * @generated
	 */
	int TRACED_TRIGGER_CONFIGURATION = 228;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRIGGER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_NAMED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRIGGER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_NAMED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Trigger Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRIGGER_CONFIGURATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Trigger Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRIGGER_CONFIGURATION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTypeConfigurationImpl <em>Traced Type Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedTypeConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedTypeConfiguration()
	 * @generated
	 */
	int TRACED_TYPE_CONFIGURATION = 229;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPE_CONFIGURATION_FEATURE_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Type Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TYPE_CONFIGURATION_OPERATION_COUNT = TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUnmarshallActionConfigurationImpl <em>Traced Unmarshall Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUnmarshallActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedUnmarshallActionConfiguration()
	 * @generated
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION = 231;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Unmarshall Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Unmarshall Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UNMARSHALL_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUsageConfigurationImpl <em>Traced Usage Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUsageConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedUsageConfiguration()
	 * @generated
	 */
	int TRACED_USAGE_CONFIGURATION = 232;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USAGE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_DEPENDENCY_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USAGE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_DEPENDENCY_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Usage Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USAGE_CONFIGURATION_FEATURE_COUNT = TRACED_DEPENDENCY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Usage Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USAGE_CONFIGURATION_OPERATION_COUNT = TRACED_DEPENDENCY_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUseCaseConfigurationImpl <em>Traced Use Case Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedUseCaseConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedUseCaseConfiguration()
	 * @generated
	 */
	int TRACED_USE_CASE_CONFIGURATION = 233;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USE_CASE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USE_CASE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Use Case Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USE_CASE_CONFIGURATION_FEATURE_COUNT = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Use Case Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_USE_CASE_CONFIGURATION_OPERATION_COUNT = TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValuePinConfigurationImpl <em>Traced Value Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValuePinConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedValuePinConfiguration()
	 * @generated
	 */
	int TRACED_VALUE_PIN_CONFIGURATION = 234;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_INPUT_PIN_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_INPUT_PIN_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Value Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_PIN_CONFIGURATION_FEATURE_COUNT = TRACED_INPUT_PIN_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Value Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_PIN_CONFIGURATION_OPERATION_COUNT = TRACED_INPUT_PIN_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValueSpecificationActionConfigurationImpl <em>Traced Value Specification Action Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedValueSpecificationActionConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedValueSpecificationActionConfiguration()
	 * @generated
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION = 235;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_ACTION_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION = TRACED_ACTION_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Traced Value Specification Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION_FEATURE_COUNT = TRACED_ACTION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Value Specification Action Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION_OPERATION_COUNT = TRACED_ACTION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVariableConfigurationImpl <em>Traced Variable Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.TracedVariableConfigurationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl#getTracedVariableConfiguration()
	 * @generated
	 */
	int TRACED_VARIABLE_CONFIGURATION = 238;

	/**
	 * The feature id for the '<em><b>Original Object Element Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Semantic Visitor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_CONFIGURATION_FEATURE_COUNT = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_CONFIGURATION_OPERATION_COUNT = TRACED_CONNECTABLE_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration <em>Traced Abstraction Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Abstraction Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration
	 * @generated
	 */
	EClass getTracedAbstractionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration <em>Traced Accept Call Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Accept Call Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration
	 * @generated
	 */
	EClass getTracedAcceptCallActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration <em>Traced Accept Event Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Accept Event Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration
	 * @generated
	 */
	EClass getTracedAcceptEventActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration <em>Traced Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration
	 * @generated
	 */
	EClass getTracedActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration <em>Traced Action Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Execution Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedActionExecutionSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration <em>Traced Action Input Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Input Pin Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration
	 * @generated
	 */
	EClass getTracedActionInputPinConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration <em>Traced Activity Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration
	 * @generated
	 */
	EClass getTracedActivityConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration <em>Traced Activity Content Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Content Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration
	 * @generated
	 */
	EClass getTracedActivityContentConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration#getOriginalObject_ActivityContentConfiguration <em>Original Object Activity Content Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Activity Content Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration#getOriginalObject_ActivityContentConfiguration()
	 * @see #getTracedActivityContentConfiguration()
	 * @generated
	 */
	EReference getTracedActivityContentConfiguration_OriginalObject_ActivityContentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration <em>Traced Activity Edge Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration
	 * @generated
	 */
	EClass getTracedActivityEdgeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration <em>Traced Activity Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Final Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration
	 * @generated
	 */
	EClass getTracedActivityFinalNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration <em>Traced Activity Group Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Group Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration
	 * @generated
	 */
	EClass getTracedActivityGroupConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration <em>Traced Activity Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration
	 * @generated
	 */
	EClass getTracedActivityNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration <em>Traced Activity Parameter Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Parameter Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration
	 * @generated
	 */
	EClass getTracedActivityParameterNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration <em>Traced Activity Partition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Partition Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration
	 * @generated
	 */
	EClass getTracedActivityPartitionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration <em>Traced Actor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Actor Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration
	 * @generated
	 */
	EClass getTracedActorConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration <em>Traced Add Structural Feature Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Add Structural Feature Value Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration
	 * @generated
	 */
	EClass getTracedAddStructuralFeatureValueActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration <em>Traced Add Variable Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Add Variable Value Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration
	 * @generated
	 */
	EClass getTracedAddVariableValueActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration <em>Traced Any Receive Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Any Receive Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration
	 * @generated
	 */
	EClass getTracedAnyReceiveEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration <em>Traced Artifact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Artifact Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration
	 * @generated
	 */
	EClass getTracedArtifactConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration <em>Traced Association Class Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Association Class Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration
	 * @generated
	 */
	EClass getTracedAssociationClassConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration <em>Traced Association Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Association Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration
	 * @generated
	 */
	EClass getTracedAssociationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration <em>Traced Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Behavior Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration
	 * @generated
	 */
	EClass getTracedBehaviorConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration <em>Traced Behavior Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Behavior Execution Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedBehaviorExecutionSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration <em>Traced Behavioral Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Behavioral Feature Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration
	 * @generated
	 */
	EClass getTracedBehavioralFeatureConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration <em>Traced Behaviored Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Behaviored Classifier Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration
	 * @generated
	 */
	EClass getTracedBehavioredClassifierConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration <em>Traced Broadcast Signal Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Broadcast Signal Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration
	 * @generated
	 */
	EClass getTracedBroadcastSignalActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration <em>Traced Call Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration
	 * @generated
	 */
	EClass getTracedCallActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration <em>Traced Call Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Behavior Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration
	 * @generated
	 */
	EClass getTracedCallBehaviorActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration <em>Traced Call Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration
	 * @generated
	 */
	EClass getTracedCallEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration <em>Traced Call Operation Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Call Operation Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration
	 * @generated
	 */
	EClass getTracedCallOperationActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration <em>Traced Central Buffer Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Central Buffer Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration
	 * @generated
	 */
	EClass getTracedCentralBufferNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration <em>Traced Change Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Change Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration
	 * @generated
	 */
	EClass getTracedChangeEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration <em>Traced Class Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Class Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration
	 * @generated
	 */
	EClass getTracedClassConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration <em>Traced Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Classifier Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration
	 * @generated
	 */
	EClass getTracedClassifierConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration <em>Traced Classifier Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Classifier Template Parameter Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration
	 * @generated
	 */
	EClass getTracedClassifierTemplateParameterConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration <em>Traced Clause Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Clause Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration
	 * @generated
	 */
	EClass getTracedClauseConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration <em>Traced Clear Association Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Clear Association Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration
	 * @generated
	 */
	EClass getTracedClearAssociationActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration <em>Traced Clear Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Clear Structural Feature Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration
	 * @generated
	 */
	EClass getTracedClearStructuralFeatureActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration <em>Traced Clear Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Clear Variable Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration
	 * @generated
	 */
	EClass getTracedClearVariableActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration <em>Traced Collaboration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Collaboration Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration
	 * @generated
	 */
	EClass getTracedCollaborationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration <em>Traced Collaboration Use Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Collaboration Use Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration
	 * @generated
	 */
	EClass getTracedCollaborationUseConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration <em>Traced Combined Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Combined Fragment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration
	 * @generated
	 */
	EClass getTracedCombinedFragmentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration <em>Traced Comment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Comment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration
	 * @generated
	 */
	EClass getTracedCommentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration <em>Traced Communication Path Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Communication Path Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration
	 * @generated
	 */
	EClass getTracedCommunicationPathConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration <em>Traced Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Component Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration
	 * @generated
	 */
	EClass getTracedComponentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration <em>Traced Component Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Component Realization Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration
	 * @generated
	 */
	EClass getTracedComponentRealizationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration <em>Traced Conditional Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Conditional Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration
	 * @generated
	 */
	EClass getTracedConditionalNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration <em>Traced Connectable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connectable Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration
	 * @generated
	 */
	EClass getTracedConnectableElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration <em>Traced Connectable Element Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connectable Element Template Parameter Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration
	 * @generated
	 */
	EClass getTracedConnectableElementTemplateParameterConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration <em>Traced Connection Point Reference Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connection Point Reference Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration
	 * @generated
	 */
	EClass getTracedConnectionPointReferenceConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration <em>Traced Connector Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connector Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration
	 * @generated
	 */
	EClass getTracedConnectorConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration <em>Traced Connector End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connector End Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration
	 * @generated
	 */
	EClass getTracedConnectorEndConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration <em>Traced Consider Ignore Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Consider Ignore Fragment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration
	 * @generated
	 */
	EClass getTracedConsiderIgnoreFragmentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration <em>Traced Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Constraint Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration
	 * @generated
	 */
	EClass getTracedConstraintConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration <em>Traced Continuation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Continuation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration
	 * @generated
	 */
	EClass getTracedContinuationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration <em>Traced Control Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Flow Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration
	 * @generated
	 */
	EClass getTracedControlFlowConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration <em>Traced Control Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration
	 * @generated
	 */
	EClass getTracedControlNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration <em>Traced Create Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Create Link Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration
	 * @generated
	 */
	EClass getTracedCreateLinkActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration <em>Traced Create Link Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Create Link Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedCreateLinkObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration <em>Traced Create Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Create Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedCreateObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration <em>Traced Data Store Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Data Store Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration
	 * @generated
	 */
	EClass getTracedDataStoreNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration <em>Traced Data Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Data Type Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration
	 * @generated
	 */
	EClass getTracedDataTypeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration <em>Traced Decision Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Decision Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration
	 * @generated
	 */
	EClass getTracedDecisionNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration <em>Traced Dependency Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Dependency Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration
	 * @generated
	 */
	EClass getTracedDependencyConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration <em>Traced Deployed Artifact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Deployed Artifact Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration
	 * @generated
	 */
	EClass getTracedDeployedArtifactConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration <em>Traced Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Deployment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration
	 * @generated
	 */
	EClass getTracedDeploymentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration <em>Traced Deployment Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Deployment Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedDeploymentSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration <em>Traced Deployment Target Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Deployment Target Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration
	 * @generated
	 */
	EClass getTracedDeploymentTargetConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration <em>Traced Destroy Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Destroy Link Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration
	 * @generated
	 */
	EClass getTracedDestroyLinkActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration <em>Traced Destroy Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Destroy Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedDestroyObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration <em>Traced Destruction Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Destruction Occurrence Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedDestructionOccurrenceSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration <em>Traced Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Device Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration
	 * @generated
	 */
	EClass getTracedDeviceConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration <em>Traced Directed Relationship Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Directed Relationship Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration
	 * @generated
	 */
	EClass getTracedDirectedRelationshipConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration <em>Traced Duration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Duration Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration
	 * @generated
	 */
	EClass getTracedDurationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration <em>Traced Duration Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Duration Constraint Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration
	 * @generated
	 */
	EClass getTracedDurationConstraintConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration <em>Traced Duration Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Duration Interval Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration
	 * @generated
	 */
	EClass getTracedDurationIntervalConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration <em>Traced Duration Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Duration Observation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration
	 * @generated
	 */
	EClass getTracedDurationObservationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration <em>Traced Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration
	 * @generated
	 */
	EClass getTracedElementConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject_ElementConfiguration <em>Original Object Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getOriginalObject_ElementConfiguration()
	 * @see #getTracedElementConfiguration()
	 * @generated
	 */
	EReference getTracedElementConfiguration_OriginalObject_ElementConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Visitor Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration#getSemanticVisitorSequence()
	 * @see #getTracedElementConfiguration()
	 * @generated
	 */
	EReference getTracedElementConfiguration_SemanticVisitorSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration <em>Traced Element Import Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Element Import Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration
	 * @generated
	 */
	EClass getTracedElementImportConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration <em>Traced Encapsulated Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Encapsulated Classifier Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration
	 * @generated
	 */
	EClass getTracedEncapsulatedClassifierConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration <em>Traced Enumeration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Enumeration Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration
	 * @generated
	 */
	EClass getTracedEnumerationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration <em>Traced Enumeration Literal Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Enumeration Literal Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration
	 * @generated
	 */
	EClass getTracedEnumerationLiteralConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration <em>Traced Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration
	 * @generated
	 */
	EClass getTracedEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration <em>Traced Exception Handler Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Exception Handler Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration
	 * @generated
	 */
	EClass getTracedExceptionHandlerConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration <em>Traced Executable Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Executable Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration
	 * @generated
	 */
	EClass getTracedExecutableNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration <em>Traced Execution Environment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution Environment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration
	 * @generated
	 */
	EClass getTracedExecutionEnvironmentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration <em>Traced Execution Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution Occurrence Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedExecutionOccurrenceSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration <em>Traced Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedExecutionSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration <em>Traced Expansion Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expansion Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration
	 * @generated
	 */
	EClass getTracedExpansionNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration <em>Traced Expansion Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expansion Region Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration
	 * @generated
	 */
	EClass getTracedExpansionRegionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration <em>Traced Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expression Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration
	 * @generated
	 */
	EClass getTracedExpressionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration <em>Traced Extend Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Extend Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration
	 * @generated
	 */
	EClass getTracedExtendConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration <em>Traced Extension Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Extension Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration
	 * @generated
	 */
	EClass getTracedExtensionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration <em>Traced Extension End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Extension End Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration
	 * @generated
	 */
	EClass getTracedExtensionEndConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration <em>Traced Extension Point Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Extension Point Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration
	 * @generated
	 */
	EClass getTracedExtensionPointConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration <em>Traced Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Feature Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration
	 * @generated
	 */
	EClass getTracedFeatureConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration <em>Traced Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Final Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration
	 * @generated
	 */
	EClass getTracedFinalNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration <em>Traced Final State Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Final State Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration
	 * @generated
	 */
	EClass getTracedFinalStateConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration <em>Traced Flow Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Flow Final Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration
	 * @generated
	 */
	EClass getTracedFlowFinalNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration <em>Traced Fork Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Fork Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration
	 * @generated
	 */
	EClass getTracedForkNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration <em>Traced Function Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Function Behavior Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration
	 * @generated
	 */
	EClass getTracedFunctionBehaviorConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration <em>Traced Gate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Gate Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration
	 * @generated
	 */
	EClass getTracedGateConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration <em>Traced General Ordering Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced General Ordering Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration
	 * @generated
	 */
	EClass getTracedGeneralOrderingConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration <em>Traced Generalization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Generalization Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration
	 * @generated
	 */
	EClass getTracedGeneralizationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration <em>Traced Generalization Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Generalization Set Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration
	 * @generated
	 */
	EClass getTracedGeneralizationSetConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration <em>Traced Image Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Image Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration
	 * @generated
	 */
	EClass getTracedImageConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration <em>Traced Include Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Include Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration
	 * @generated
	 */
	EClass getTracedIncludeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration <em>Traced Information Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Information Flow Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration
	 * @generated
	 */
	EClass getTracedInformationFlowConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration <em>Traced Information Item Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Information Item Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration
	 * @generated
	 */
	EClass getTracedInformationItemConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration <em>Traced Initial Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Initial Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration
	 * @generated
	 */
	EClass getTracedInitialNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration <em>Traced Input Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input Pin Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration
	 * @generated
	 */
	EClass getTracedInputPinConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration <em>Traced Instance Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Instance Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedInstanceSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration <em>Traced Instance Value Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Instance Value Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration
	 * @generated
	 */
	EClass getTracedInstanceValueConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration <em>Traced Interaction Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interaction Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration
	 * @generated
	 */
	EClass getTracedInteractionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration <em>Traced Interaction Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interaction Constraint Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration
	 * @generated
	 */
	EClass getTracedInteractionConstraintConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration <em>Traced Interaction Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interaction Fragment Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration
	 * @generated
	 */
	EClass getTracedInteractionFragmentConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration <em>Traced Interaction Operand Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interaction Operand Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration
	 * @generated
	 */
	EClass getTracedInteractionOperandConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration <em>Traced Interaction Use Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interaction Use Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration
	 * @generated
	 */
	EClass getTracedInteractionUseConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration <em>Traced Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interface Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration
	 * @generated
	 */
	EClass getTracedInterfaceConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration <em>Traced Interface Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interface Realization Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration
	 * @generated
	 */
	EClass getTracedInterfaceRealizationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration <em>Traced Interruptible Activity Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interruptible Activity Region Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration
	 * @generated
	 */
	EClass getTracedInterruptibleActivityRegionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration <em>Traced Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interval Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration
	 * @generated
	 */
	EClass getTracedIntervalConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration <em>Traced Interval Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Interval Constraint Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration
	 * @generated
	 */
	EClass getTracedIntervalConstraintConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration <em>Traced Invocation Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Invocation Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration
	 * @generated
	 */
	EClass getTracedInvocationActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration <em>Traced Join Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Join Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration
	 * @generated
	 */
	EClass getTracedJoinNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration <em>Traced Lifeline Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Lifeline Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration
	 * @generated
	 */
	EClass getTracedLifelineConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration <em>Traced Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Link Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration
	 * @generated
	 */
	EClass getTracedLinkActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration <em>Traced Link End Creation Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Link End Creation Data Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration
	 * @generated
	 */
	EClass getTracedLinkEndCreationDataConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration <em>Traced Link End Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Link End Data Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration
	 * @generated
	 */
	EClass getTracedLinkEndDataConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration <em>Traced Link End Destruction Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Link End Destruction Data Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration
	 * @generated
	 */
	EClass getTracedLinkEndDestructionDataConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration <em>Traced Literal Boolean Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Boolean Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration
	 * @generated
	 */
	EClass getTracedLiteralBooleanConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration <em>Traced Literal Integer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Integer Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration
	 * @generated
	 */
	EClass getTracedLiteralIntegerConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration <em>Traced Literal Null Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Null Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration
	 * @generated
	 */
	EClass getTracedLiteralNullConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration <em>Traced Literal Real Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Real Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration
	 * @generated
	 */
	EClass getTracedLiteralRealConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration <em>Traced Literal Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedLiteralSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration <em>Traced Literal String Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal String Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration
	 * @generated
	 */
	EClass getTracedLiteralStringConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration <em>Traced Literal Unlimited Natural Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Unlimited Natural Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration
	 * @generated
	 */
	EClass getTracedLiteralUnlimitedNaturalConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration <em>Traced Loop Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Loop Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration
	 * @generated
	 */
	EClass getTracedLoopNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration <em>Traced Manifestation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Manifestation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration
	 * @generated
	 */
	EClass getTracedManifestationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration <em>Traced Merge Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Merge Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration
	 * @generated
	 */
	EClass getTracedMergeNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration <em>Traced Message Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Message Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration
	 * @generated
	 */
	EClass getTracedMessageConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration <em>Traced Message End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Message End Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration
	 * @generated
	 */
	EClass getTracedMessageEndConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration <em>Traced Message Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Message Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration
	 * @generated
	 */
	EClass getTracedMessageEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration <em>Traced Message Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Message Occurrence Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedMessageOccurrenceSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration <em>Traced Model Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Model Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration
	 * @generated
	 */
	EClass getTracedModelConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration <em>Traced Multiplicity Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Multiplicity Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration
	 * @generated
	 */
	EClass getTracedMultiplicityElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration <em>Traced Named Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration
	 * @generated
	 */
	EClass getTracedNamedElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration <em>Traced Namespace Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Namespace Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration
	 * @generated
	 */
	EClass getTracedNamespaceConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration <em>Traced Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration
	 * @generated
	 */
	EClass getTracedNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration <em>Traced Object Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object Flow Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration
	 * @generated
	 */
	EClass getTracedObjectFlowConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration <em>Traced Object Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration
	 * @generated
	 */
	EClass getTracedObjectNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration <em>Traced Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Observation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration
	 * @generated
	 */
	EClass getTracedObservationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration <em>Traced Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Occurrence Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedOccurrenceSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration <em>Traced Opaque Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration
	 * @generated
	 */
	EClass getTracedOpaqueActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration <em>Traced Opaque Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Behavior Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration
	 * @generated
	 */
	EClass getTracedOpaqueBehaviorConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration <em>Traced Opaque Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Expression Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration
	 * @generated
	 */
	EClass getTracedOpaqueExpressionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration <em>Traced Operation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Operation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration
	 * @generated
	 */
	EClass getTracedOperationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration <em>Traced Operation Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Operation Template Parameter Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration
	 * @generated
	 */
	EClass getTracedOperationTemplateParameterConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration <em>Traced Output Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Output Pin Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration
	 * @generated
	 */
	EClass getTracedOutputPinConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration <em>Traced Package Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Package Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration
	 * @generated
	 */
	EClass getTracedPackageConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration <em>Traced Package Import Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Package Import Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration
	 * @generated
	 */
	EClass getTracedPackageImportConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration <em>Traced Package Merge Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Package Merge Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration
	 * @generated
	 */
	EClass getTracedPackageMergeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration <em>Traced Packageable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Packageable Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration
	 * @generated
	 */
	EClass getTracedPackageableElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration <em>Traced Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameter Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration
	 * @generated
	 */
	EClass getTracedParameterConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration <em>Traced Parameter Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameter Set Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration
	 * @generated
	 */
	EClass getTracedParameterSetConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration <em>Traced Parameterable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameterable Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration
	 * @generated
	 */
	EClass getTracedParameterableElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration <em>Traced Part Decomposition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Part Decomposition Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration
	 * @generated
	 */
	EClass getTracedPartDecompositionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration <em>Traced Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration
	 * @generated
	 */
	EClass getTracedPinConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration <em>Traced Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Port Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration
	 * @generated
	 */
	EClass getTracedPortConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration <em>Traced Primitive Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Primitive Type Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration
	 * @generated
	 */
	EClass getTracedPrimitiveTypeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration <em>Traced Profile Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Profile Application Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration
	 * @generated
	 */
	EClass getTracedProfileApplicationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration <em>Traced Profile Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Profile Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration
	 * @generated
	 */
	EClass getTracedProfileConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration <em>Traced Property Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Property Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration
	 * @generated
	 */
	EClass getTracedPropertyConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration <em>Traced Protocol Conformance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Protocol Conformance Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration
	 * @generated
	 */
	EClass getTracedProtocolConformanceConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration <em>Traced Protocol State Machine Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Protocol State Machine Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration
	 * @generated
	 */
	EClass getTracedProtocolStateMachineConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration <em>Traced Protocol Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Protocol Transition Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration
	 * @generated
	 */
	EClass getTracedProtocolTransitionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration <em>Traced Pseudostate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pseudostate Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration
	 * @generated
	 */
	EClass getTracedPseudostateConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration <em>Traced Qualifier Value Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Qualifier Value Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration
	 * @generated
	 */
	EClass getTracedQualifierValueConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration <em>Traced Raise Exception Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Raise Exception Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration
	 * @generated
	 */
	EClass getTracedRaiseExceptionActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration <em>Traced Read Extent Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Extent Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration
	 * @generated
	 */
	EClass getTracedReadExtentActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration <em>Traced Read Is Classified Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Is Classified Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedReadIsClassifiedObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration <em>Traced Read Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Link Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration
	 * @generated
	 */
	EClass getTracedReadLinkActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration <em>Traced Read Link Object End Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Link Object End Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration
	 * @generated
	 */
	EClass getTracedReadLinkObjectEndActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration <em>Traced Read Link Object End Qualifier Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Link Object End Qualifier Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration
	 * @generated
	 */
	EClass getTracedReadLinkObjectEndQualifierActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration <em>Traced Read Self Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Self Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration
	 * @generated
	 */
	EClass getTracedReadSelfActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration <em>Traced Read Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Structural Feature Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration
	 * @generated
	 */
	EClass getTracedReadStructuralFeatureActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration <em>Traced Read Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Read Variable Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration
	 * @generated
	 */
	EClass getTracedReadVariableActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration <em>Traced Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Realization Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration
	 * @generated
	 */
	EClass getTracedRealizationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration <em>Traced Reception Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Reception Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration
	 * @generated
	 */
	EClass getTracedReceptionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration <em>Traced Reclassify Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Reclassify Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedReclassifyObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration <em>Traced Redefinable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Redefinable Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration
	 * @generated
	 */
	EClass getTracedRedefinableElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration <em>Traced Redefinable Template Signature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Redefinable Template Signature Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration
	 * @generated
	 */
	EClass getTracedRedefinableTemplateSignatureConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration <em>Traced Reduce Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Reduce Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration
	 * @generated
	 */
	EClass getTracedReduceActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration <em>Traced Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Region Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration
	 * @generated
	 */
	EClass getTracedRegionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration <em>Traced Relationship Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Relationship Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration
	 * @generated
	 */
	EClass getTracedRelationshipConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration <em>Traced Remove Structural Feature Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Remove Structural Feature Value Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration
	 * @generated
	 */
	EClass getTracedRemoveStructuralFeatureValueActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration <em>Traced Remove Variable Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Remove Variable Value Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration
	 * @generated
	 */
	EClass getTracedRemoveVariableValueActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration <em>Traced Reply Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Reply Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration
	 * @generated
	 */
	EClass getTracedReplyActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration <em>Traced Send Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Send Object Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration
	 * @generated
	 */
	EClass getTracedSendObjectActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration <em>Traced Send Signal Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Send Signal Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration
	 * @generated
	 */
	EClass getTracedSendSignalActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration <em>Traced Sequence Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sequence Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration
	 * @generated
	 */
	EClass getTracedSequenceNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration <em>Traced Signal Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Signal Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration
	 * @generated
	 */
	EClass getTracedSignalConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration <em>Traced Signal Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Signal Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration
	 * @generated
	 */
	EClass getTracedSignalEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration <em>Traced Slot Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Slot Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration
	 * @generated
	 */
	EClass getTracedSlotConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration <em>Traced Start Classifier Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Start Classifier Behavior Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration
	 * @generated
	 */
	EClass getTracedStartClassifierBehaviorActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration <em>Traced Start Object Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Start Object Behavior Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration
	 * @generated
	 */
	EClass getTracedStartObjectBehaviorActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration <em>Traced State Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration
	 * @generated
	 */
	EClass getTracedStateConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration <em>Traced State Invariant Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State Invariant Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration
	 * @generated
	 */
	EClass getTracedStateInvariantConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration <em>Traced State Machine Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State Machine Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration
	 * @generated
	 */
	EClass getTracedStateMachineConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration <em>Traced Stereotype Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Stereotype Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration
	 * @generated
	 */
	EClass getTracedStereotypeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration <em>Traced String Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced String Expression Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration
	 * @generated
	 */
	EClass getTracedStringExpressionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration <em>Traced Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structural Feature Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration
	 * @generated
	 */
	EClass getTracedStructuralFeatureActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration <em>Traced Structural Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structural Feature Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration
	 * @generated
	 */
	EClass getTracedStructuralFeatureConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration <em>Traced Structured Activity Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structured Activity Node Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration
	 * @generated
	 */
	EClass getTracedStructuredActivityNodeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration <em>Traced Structured Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structured Classifier Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration
	 * @generated
	 */
	EClass getTracedStructuredClassifierConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration <em>Traced Substitution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Substitution Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration
	 * @generated
	 */
	EClass getTracedSubstitutionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration <em>Traced Template Binding Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Template Binding Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration
	 * @generated
	 */
	EClass getTracedTemplateBindingConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration <em>Traced Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Template Parameter Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration
	 * @generated
	 */
	EClass getTracedTemplateParameterConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration <em>Traced Template Parameter Substitution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Template Parameter Substitution Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration
	 * @generated
	 */
	EClass getTracedTemplateParameterSubstitutionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration <em>Traced Template Signature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Template Signature Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration
	 * @generated
	 */
	EClass getTracedTemplateSignatureConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration <em>Traced Templateable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Templateable Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration
	 * @generated
	 */
	EClass getTracedTemplateableElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration <em>Traced Test Identity Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Test Identity Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration
	 * @generated
	 */
	EClass getTracedTestIdentityActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration <em>Traced Time Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Time Constraint Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration
	 * @generated
	 */
	EClass getTracedTimeConstraintConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration <em>Traced Time Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Time Event Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration
	 * @generated
	 */
	EClass getTracedTimeEventConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration <em>Traced Time Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Time Expression Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration
	 * @generated
	 */
	EClass getTracedTimeExpressionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration <em>Traced Time Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Time Interval Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration
	 * @generated
	 */
	EClass getTracedTimeIntervalConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration <em>Traced Time Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Time Observation Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration
	 * @generated
	 */
	EClass getTracedTimeObservationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration <em>Traced Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transition Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration
	 * @generated
	 */
	EClass getTracedTransitionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration <em>Traced Trigger Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Trigger Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration
	 * @generated
	 */
	EClass getTracedTriggerConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration <em>Traced Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Type Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration
	 * @generated
	 */
	EClass getTracedTypeConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration <em>Traced Typed Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Typed Element Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration
	 * @generated
	 */
	EClass getTracedTypedElementConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration <em>Traced Unmarshall Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Unmarshall Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration
	 * @generated
	 */
	EClass getTracedUnmarshallActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration <em>Traced Usage Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Usage Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration
	 * @generated
	 */
	EClass getTracedUsageConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration <em>Traced Use Case Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Use Case Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration
	 * @generated
	 */
	EClass getTracedUseCaseConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration <em>Traced Value Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value Pin Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration
	 * @generated
	 */
	EClass getTracedValuePinConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration <em>Traced Value Specification Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value Specification Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration
	 * @generated
	 */
	EClass getTracedValueSpecificationActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration <em>Traced Value Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value Specification Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration
	 * @generated
	 */
	EClass getTracedValueSpecificationConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration <em>Traced Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration
	 * @generated
	 */
	EClass getTracedVariableActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration <em>Traced Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration
	 * @generated
	 */
	EClass getTracedVariableConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration <em>Traced Vertex Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Vertex Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration
	 * @generated
	 */
	EClass getTracedVertexConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration <em>Traced Write Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Write Link Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration
	 * @generated
	 */
	EClass getTracedWriteLinkActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration <em>Traced Write Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Write Structural Feature Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration
	 * @generated
	 */
	EClass getTracedWriteStructuralFeatureActionConfiguration();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration <em>Traced Write Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Write Variable Action Configuration</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration
	 * @generated
	 */
	EClass getTracedWriteVariableActionConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FumlConfigurationFactory getFumlConfigurationFactory();

} //FumlConfigurationPackage
