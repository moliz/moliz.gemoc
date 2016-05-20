/**
 */
package umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

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
 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory
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
	String eNS_URI = "umlTrace_BasicBehaviors";

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
	BasicBehaviorsPackage eINSTANCE = umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl <em>Traced Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedExecution()
	 * @generated
	 */
	int TRACED_EXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__RUNTIME_MODEL_ELEMENT_SEQUENCE = KernelPackage.TRACED_OBJECT__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__FEATURE_VALUES_SEQUENCE = KernelPackage.TRACED_OBJECT__FEATURE_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = KernelPackage.TRACED_OBJECT__LOCUS_EXTENSIONAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Types Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__TYPES_SEQUENCE = KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Context Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__CONTEXT_SEQUENCE = KernelPackage.TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE = KernelPackage.TRACED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FEATURE_COUNT = KernelPackage.TRACED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_OPERATION_COUNT = KernelPackage.TRACED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedOpaqueBehaviorExecutionImpl <em>Traced Opaque Behavior Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedOpaqueBehaviorExecutionImpl
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedOpaqueBehaviorExecution()
	 * @generated
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_EXECUTION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__FEATURE_VALUES_SEQUENCE = TRACED_EXECUTION__FEATURE_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = TRACED_EXECUTION__LOCUS_EXTENSIONAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Types Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__TYPES_SEQUENCE = TRACED_EXECUTION__TYPES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Context Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__CONTEXT_SEQUENCE = TRACED_EXECUTION__CONTEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION__PARAMETER_VALUES_SEQUENCE = TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Opaque Behavior Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION_FEATURE_COUNT = TRACED_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Behavior Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_BEHAVIOR_EXECUTION_OPERATION_COUNT = TRACED_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl <em>Traced Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedParameterValue()
	 * @generated
	 */
	int TRACED_PARAMETER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Parameter Parameter Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Values Parameter Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution <em>Traced Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution
	 * @generated
	 */
	EClass getTracedExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getContextSequence <em>Context Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getContextSequence()
	 * @see #getTracedExecution()
	 * @generated
	 */
	EReference getTracedExecution_ContextSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getParameterValuesSequence <em>Parameter Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution#getParameterValuesSequence()
	 * @see #getTracedExecution()
	 * @generated
	 */
	EReference getTracedExecution_ParameterValuesSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution <em>Traced Opaque Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Behavior Execution</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution
	 * @generated
	 */
	EClass getTracedOpaqueBehaviorExecution();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue <em>Traced Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameter Value</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue
	 * @generated
	 */
	EClass getTracedParameterValue();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence <em>Parameter Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Parameter Value Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence()
	 * @see #getTracedParameterValue()
	 * @generated
	 */
	EReference getTracedParameterValue_Parameter_ParameterValueSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence <em>Values Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values Parameter Value Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getValues_ParameterValueSequence()
	 * @see #getTracedParameterValue()
	 * @generated
	 */
	EReference getTracedParameterValue_Values_ParameterValueSequence();

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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl <em>Traced Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedExecution()
		 * @generated
		 */
		EClass TRACED_EXECUTION = eINSTANCE.getTracedExecution();

		/**
		 * The meta object literal for the '<em><b>Context Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION__CONTEXT_SEQUENCE = eINSTANCE.getTracedExecution_ContextSequence();

		/**
		 * The meta object literal for the '<em><b>Parameter Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE = eINSTANCE.getTracedExecution_ParameterValuesSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedOpaqueBehaviorExecutionImpl <em>Traced Opaque Behavior Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedOpaqueBehaviorExecutionImpl
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedOpaqueBehaviorExecution()
		 * @generated
		 */
		EClass TRACED_OPAQUE_BEHAVIOR_EXECUTION = eINSTANCE.getTracedOpaqueBehaviorExecution();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl <em>Traced Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl
		 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getTracedParameterValue()
		 * @generated
		 */
		EClass TRACED_PARAMETER_VALUE = eINSTANCE.getTracedParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Parameter Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE = eINSTANCE.getTracedParameterValue_Parameter_ParameterValueSequence();

		/**
		 * The meta object literal for the '<em><b>Values Parameter Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE = eINSTANCE.getTracedParameterValue_Values_ParameterValueSequence();

	}

} //BasicBehaviorsPackage
