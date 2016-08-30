/**
 */
package fumlConfiguration.Input;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fumlConfiguration.Input.InputFactory
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
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/input";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InputConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputPackage eINSTANCE = fumlConfiguration.Input.impl.InputPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.Input.impl.InputParameterValuesImpl <em>Parameter Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Input.impl.InputParameterValuesImpl
	 * @see fumlConfiguration.Input.impl.InputPackageImpl#getInputParameterValues()
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
	 * The number of structural features of the '<em>Parameter Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_VALUES_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Input.InputParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Values</em>'.
	 * @see fumlConfiguration.Input.InputParameterValues
	 * @generated
	 */
	EClass getInputParameterValues();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Input.InputParameterValues#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fumlConfiguration.Input.InputParameterValues#getName()
	 * @see #getInputParameterValues()
	 * @generated
	 */
	EAttribute getInputParameterValues_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Input.InputParameterValues#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see fumlConfiguration.Input.InputParameterValues#getParameterValues()
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
	InputFactory getInputFactory();

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
		 * The meta object literal for the '{@link fumlConfiguration.Input.impl.InputParameterValuesImpl <em>Parameter Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Input.impl.InputParameterValuesImpl
		 * @see fumlConfiguration.Input.impl.InputPackageImpl#getInputParameterValues()
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

} //InputPackage
