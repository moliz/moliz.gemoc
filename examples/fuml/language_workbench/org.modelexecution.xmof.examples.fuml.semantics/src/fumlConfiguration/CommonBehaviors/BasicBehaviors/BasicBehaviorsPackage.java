/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors;

import fumlConfiguration.Classes.Kernel.KernelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicBehaviorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicBehaviors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/commonbehaviors/basicbehaviors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BasicBehaviorsConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorsPackage eINSTANCE = fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ExecutionImpl
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__RUNTIME_MODEL_ELEMENT = KernelPackage.OBJECT__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__FEATURE_VALUES = KernelPackage.OBJECT__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__LOCUS_EXTENSIONAL_VALUE = KernelPackage.OBJECT__LOCUS_EXTENSIONAL_VALUE;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__TYPES = KernelPackage.OBJECT__TYPES;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CONTEXT = KernelPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__PARAMETER_VALUES = KernelPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = KernelPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___INITIALIZE = KernelPackage.OBJECT___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___GET_TYPES__ELIST = KernelPackage.OBJECT___GET_TYPES__ELIST;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___COPY__VALUE = KernelPackage.OBJECT___COPY__VALUE;

	/**
	 * The operation id for the '<em>New </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___NEW____VALUE = KernelPackage.OBJECT___NEW____VALUE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___EQUALS__VALUE_BOOLEAN = KernelPackage.OBJECT___EQUALS__VALUE_BOOLEAN;

	/**
	 * The operation id for the '<em>Has Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___HAS_TYPE__CLASSIFIER_BOOLEAN = KernelPackage.OBJECT___HAS_TYPE__CLASSIFIER_BOOLEAN;

	/**
	 * The operation id for the '<em>Create Feature Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___CREATE_FEATURE_VALUES = KernelPackage.OBJECT___CREATE_FEATURE_VALUES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE = KernelPackage.OBJECT___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE;

	/**
	 * The operation id for the '<em>Set Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT = KernelPackage.OBJECT___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___DESTROY = KernelPackage.OBJECT___DESTROY;

	/**
	 * The operation id for the '<em>Set Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE = KernelPackage.OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___EXECUTE = KernelPackage.OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST = KernelPackage.OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE = KernelPackage.OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___TERMINATE = KernelPackage.OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___GET_BEHAVIOR__BEHAVIOR = KernelPackage.OBJECT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = KernelPackage.OBJECT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl <em>Opaque Behavior Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getOpaqueBehaviorExecution()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__RUNTIME_MODEL_ELEMENT = EXECUTION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__FEATURE_VALUES = EXECUTION__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__LOCUS_EXTENSIONAL_VALUE = EXECUTION__LOCUS_EXTENSIONAL_VALUE;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__TYPES = EXECUTION__TYPES;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__CONTEXT = EXECUTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION__PARAMETER_VALUES = EXECUTION__PARAMETER_VALUES;

	/**
	 * The number of structural features of the '<em>Opaque Behavior Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___INITIALIZE = EXECUTION___INITIALIZE;

	/**
	 * The operation id for the '<em>Get Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___GET_TYPES__ELIST = EXECUTION___GET_TYPES__ELIST;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___COPY__VALUE = EXECUTION___COPY__VALUE;

	/**
	 * The operation id for the '<em>New </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___NEW____VALUE = EXECUTION___NEW____VALUE;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___EQUALS__VALUE_BOOLEAN = EXECUTION___EQUALS__VALUE_BOOLEAN;

	/**
	 * The operation id for the '<em>Has Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___HAS_TYPE__CLASSIFIER_BOOLEAN = EXECUTION___HAS_TYPE__CLASSIFIER_BOOLEAN;

	/**
	 * The operation id for the '<em>Create Feature Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___CREATE_FEATURE_VALUES = EXECUTION___CREATE_FEATURE_VALUES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE = EXECUTION___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE;

	/**
	 * The operation id for the '<em>Set Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT = EXECUTION___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___DESTROY = EXECUTION___DESTROY;

	/**
	 * The operation id for the '<em>Set Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE = EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___EXECUTE = EXECUTION___EXECUTE;

	/**
	 * The operation id for the '<em>Get Output Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST = EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE = EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___TERMINATE = EXECUTION___TERMINATE;

	/**
	 * The operation id for the '<em>Get Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___GET_BEHAVIOR__BEHAVIOR = EXECUTION___GET_BEHAVIOR__BEHAVIOR;

	/**
	 * The operation id for the '<em>Do Body</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION___DO_BODY__ELIST_ELIST = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opaque Behavior Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Parameter Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Values Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUES_PARAMETER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE___COPY__PARAMETERVALUE = 0;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getContext()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getParameterValues()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_ParameterValues();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#setParameterValue(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) <em>Set Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameter Value</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#setParameterValue(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue)
	 * @generated
	 */
	EOperation getExecution__SetParameterValue__ParameterValue();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#execute()
	 * @generated
	 */
	EOperation getExecution__Execute();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getOutputParameterValues(org.eclipse.emf.common.util.EList) <em>Get Output Parameter Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Parameter Values</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getOutputParameterValues(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExecution__GetOutputParameterValues__EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getParameterValue(org.eclipse.uml2.uml.Parameter, fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) <em>Get Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter Value</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getParameterValue(org.eclipse.uml2.uml.Parameter, fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue)
	 * @generated
	 */
	EOperation getExecution__GetParameterValue__Parameter_ParameterValue();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#terminate()
	 * @generated
	 */
	EOperation getExecution__Terminate();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getBehavior(org.eclipse.uml2.uml.Behavior) <em>Get Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Behavior</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getBehavior(org.eclipse.uml2.uml.Behavior)
	 * @generated
	 */
	EOperation getExecution__GetBehavior__Behavior();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution <em>Opaque Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior Execution</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution
	 * @generated
	 */
	EClass getOpaqueBehaviorExecution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution#doBody(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Do Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Body</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution#doBody(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getOpaqueBehaviorExecution__DoBody__EList_EList();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter_ParameterValue <em>Parameter Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Parameter Value</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter_ParameterValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Parameter_ParameterValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getValues_ParameterValue <em>Values Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values Parameter Value</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#getValues_ParameterValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Values_ParameterValue();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#copy(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue#copy(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue)
	 * @generated
	 */
	EOperation getParameterValue__Copy__ParameterValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicBehaviorsFactory getBasicBehaviorsFactory();

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
		 * The meta object literal for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ExecutionImpl
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__CONTEXT = eINSTANCE.getExecution_Context();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__PARAMETER_VALUES = eINSTANCE.getExecution_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Set Parameter Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE = eINSTANCE.getExecution__SetParameterValue__ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___EXECUTE = eINSTANCE.getExecution__Execute();

		/**
		 * The meta object literal for the '<em><b>Get Output Parameter Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST = eINSTANCE.getExecution__GetOutputParameterValues__EList();

		/**
		 * The meta object literal for the '<em><b>Get Parameter Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE = eINSTANCE.getExecution__GetParameterValue__Parameter_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___TERMINATE = eINSTANCE.getExecution__Terminate();

		/**
		 * The meta object literal for the '<em><b>Get Behavior</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___GET_BEHAVIOR__BEHAVIOR = eINSTANCE.getExecution__GetBehavior__Behavior();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl <em>Opaque Behavior Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getOpaqueBehaviorExecution()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR_EXECUTION = eINSTANCE.getOpaqueBehaviorExecution();

		/**
		 * The meta object literal for the '<em><b>Do Body</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_BEHAVIOR_EXECUTION___DO_BODY__ELIST_ELIST = eINSTANCE.getOpaqueBehaviorExecution__DoBody__EList_EList();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Parameter Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE = eINSTANCE.getParameterValue_Parameter_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Values Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__VALUES_PARAMETER_VALUE = eINSTANCE.getParameterValue_Values_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VALUE___COPY__PARAMETERVALUE = eINSTANCE.getParameterValue__Copy__ParameterValue();

	}

} //BasicBehaviorsPackage
