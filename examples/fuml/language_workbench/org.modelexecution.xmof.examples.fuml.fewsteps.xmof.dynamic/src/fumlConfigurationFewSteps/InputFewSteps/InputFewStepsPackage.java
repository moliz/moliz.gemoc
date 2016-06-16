/**
 */
package fumlConfigurationFewSteps.InputFewSteps;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.InputFewSteps.InputFewStepsFactory
 * @model kind="package"
 * @generated
 */
public interface InputFewStepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InputFewSteps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/inputFewSteps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InputConfFewSteps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputFewStepsPackage eINSTANCE = fumlConfigurationFewSteps.InputFewSteps.impl.InputFewStepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.InputFewSteps.impl.InputParameterValuesImpl <em>Input Parameter Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.InputFewSteps.impl.InputParameterValuesImpl
	 * @see fumlConfigurationFewSteps.InputFewSteps.impl.InputFewStepsPackageImpl#getInputParameterValues()
	 * @generated
	 */
	int INPUT_PARAMETER_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES__PARAMETER_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Input Parameter Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Parameter Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.InputFewSteps.InputParameterValues <em>Input Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Values</em>'.
	 * @see fumlConfigurationFewSteps.InputFewSteps.InputParameterValues
	 * @generated
	 */
	EClass getInputParameterValues();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfigurationFewSteps.InputFewSteps.InputParameterValues#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fumlConfigurationFewSteps.InputFewSteps.InputParameterValues#getName()
	 * @see #getInputParameterValues()
	 * @generated
	 */
	EAttribute getInputParameterValues_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationFewSteps.InputFewSteps.InputParameterValues#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see fumlConfigurationFewSteps.InputFewSteps.InputParameterValues#getParameterValues()
	 * @see #getInputParameterValues()
	 * @generated
	 */
	EReference getInputParameterValues_ParameterValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputFewStepsFactory getInputFewStepsFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.InputFewSteps.impl.InputParameterValuesImpl <em>Input Parameter Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.InputFewSteps.impl.InputParameterValuesImpl
		 * @see fumlConfigurationFewSteps.InputFewSteps.impl.InputFewStepsPackageImpl#getInputParameterValues()
		 * @generated
		 */
		EClass INPUT_PARAMETER_VALUES = eINSTANCE.getInputParameterValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMETER_VALUES__NAME = eINSTANCE.getInputParameterValues_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_VALUES__PARAMETER_VALUES = eINSTANCE.getInputParameterValues_ParameterValues();

	}

} //InputFewStepsPackage
