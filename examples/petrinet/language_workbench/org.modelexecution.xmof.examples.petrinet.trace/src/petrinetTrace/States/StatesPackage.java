/**
 */
package petrinetTrace.States;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see petrinetTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = petrinetTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.States.Value
	 * @see petrinetTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.States.impl.PlaceConfiguration_tokens_ValueImpl <em>Place Configuration tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.States.impl.PlaceConfiguration_tokens_ValueImpl
	 * @see petrinetTrace.States.impl.StatesPackageImpl#getPlaceConfiguration_tokens_Value()
	 * @generated
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place Configuration tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place Configuration tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_TOKENS_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.States.impl.StateImpl
	 * @see petrinetTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Place Configuration tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PLACE_CONFIGURATION_TOKENS_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value <em>Place Configuration tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Configuration tokens Value</em>'.
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value
	 * @generated
	 */
	EClass getPlaceConfiguration_tokens_Value();

	/**
	 * Returns the meta object for the container reference '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value#getParent()
	 * @see #getPlaceConfiguration_tokens_Value()
	 * @generated
	 */
	EReference getPlaceConfiguration_tokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value#getStates()
	 * @see #getPlaceConfiguration_tokens_Value()
	 * @generated
	 */
	EReference getPlaceConfiguration_tokens_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value#getTokens()
	 * @see #getPlaceConfiguration_tokens_Value()
	 * @generated
	 */
	EAttribute getPlaceConfiguration_tokens_Value_Tokens();

	/**
	 * Returns the meta object for the '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getPlaceConfiguration_tokens_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see petrinetTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see petrinetTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.States.State#getPlaceConfiguration_tokens_Values <em>Place Configuration tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place Configuration tokens Values</em>'.
	 * @see petrinetTrace.States.State#getPlaceConfiguration_tokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_PlaceConfiguration_tokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see petrinetTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see petrinetTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see petrinetTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link petrinetTrace.States.impl.PlaceConfiguration_tokens_ValueImpl <em>Place Configuration tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.States.impl.PlaceConfiguration_tokens_ValueImpl
		 * @see petrinetTrace.States.impl.StatesPackageImpl#getPlaceConfiguration_tokens_Value()
		 * @generated
		 */
		EClass PLACE_CONFIGURATION_TOKENS_VALUE = eINSTANCE.getPlaceConfiguration_tokens_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_CONFIGURATION_TOKENS_VALUE__PARENT = eINSTANCE.getPlaceConfiguration_tokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_CONFIGURATION_TOKENS_VALUE__STATES = eINSTANCE.getPlaceConfiguration_tokens_Value_States();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS = eINSTANCE.getPlaceConfiguration_tokens_Value_Tokens();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_CONFIGURATION_TOKENS_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getPlaceConfiguration_tokens_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link petrinetTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.States.impl.StateImpl
		 * @see petrinetTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Place Configuration tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PLACE_CONFIGURATION_TOKENS_VALUES = eINSTANCE.getState_PlaceConfiguration_tokens_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '{@link petrinetTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.States.Value
		 * @see petrinetTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
