/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Input;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Input";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fumlConfigurationTrace_Input";

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
	InputPackage eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl <em>Traced Input Parameter Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl#getTracedInputParameterValues()
	 * @generated
	 */
	int TRACED_INPUT_PARAMETER_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Input Parameter Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PARAMETER_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Input Parameter Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_PARAMETER_VALUES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues <em>Traced Input Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input Parameter Values</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues
	 * @generated
	 */
	EClass getTracedInputParameterValues();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence <em>Name Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getNameSequence()
	 * @see #getTracedInputParameterValues()
	 * @generated
	 */
	EReference getTracedInputParameterValues_NameSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence <em>Parameter Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues#getParameterValuesSequence()
	 * @see #getTracedInputParameterValues()
	 * @generated
	 */
	EReference getTracedInputParameterValues_ParameterValuesSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputFactory getInputFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl <em>Traced Input Parameter Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl#getTracedInputParameterValues()
		 * @generated
		 */
		EClass TRACED_INPUT_PARAMETER_VALUES = eINSTANCE.getTracedInputParameterValues();

		/**
		 * The meta object literal for the '<em><b>Name Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE = eINSTANCE.getTracedInputParameterValues_NameSequence();

		/**
		 * The meta object literal for the '<em><b>Parameter Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE = eINSTANCE.getTracedInputParameterValues_ParameterValuesSequence();

	}

} //InputPackage
