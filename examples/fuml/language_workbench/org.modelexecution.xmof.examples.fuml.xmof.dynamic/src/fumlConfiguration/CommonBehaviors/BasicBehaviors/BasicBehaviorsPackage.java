/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors;

import fumlConfiguration.Classes.Kernel.KernelPackage;

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
	 * Returns the meta object for class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution <em>Opaque Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior Execution</em>'.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution
	 * @generated
	 */
	EClass getOpaqueBehaviorExecution();

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
		 * The meta object literal for the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl <em>Opaque Behavior Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.OpaqueBehaviorExecutionImpl
		 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getOpaqueBehaviorExecution()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR_EXECUTION = eINSTANCE.getOpaqueBehaviorExecution();

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

	}

} //BasicBehaviorsPackage
