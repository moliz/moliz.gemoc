/**
 */
package fumlConfigurationFewStepsTrace.States;

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
 * @see fumlConfigurationFewStepsTrace.States.StatesFactory
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
	String eNS_URI = "fumlConfigurationFewStepsTrace_States";

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
	StatesPackage eINSTANCE = fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.Value
	 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

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
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.impl.ActionActivation_firing_ValueImpl <em>Action Activation firing Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.impl.ActionActivation_firing_ValueImpl
	 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getActionActivation_firing_Value()
	 * @generated
	 */
	int ACTION_ACTIVATION_FIRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__FIRING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Activation firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Activation firing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVATION_FIRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl <em>Semantic Visitor runtime Model Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl
	 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Semantic Visitor runtime Model Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Visitor runtime Model Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.impl.StateImpl
	 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Action Activation firing Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION_ACTIVATION_FIRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value <em>Action Activation firing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Activation firing Value</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value
	 * @generated
	 */
	EClass getActionActivation_firing_Value();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#isFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#isFiring()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EAttribute getActionActivation_firing_Value_Firing();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getParent()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EReference getActionActivation_firing_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStates()
	 * @see #getActionActivation_firing_Value()
	 * @generated
	 */
	EReference getActionActivation_firing_Value_States();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getActionActivation_firing_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value <em>Semantic Visitor runtime Model Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Visitor runtime Model Element Value</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value
	 * @generated
	 */
	EClass getSemanticVisitor_runtimeModelElement_Value();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getParent()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_Parent();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Model Element</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getRuntimeModelElement()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStates()
	 * @see #getSemanticVisitor_runtimeModelElement_Value()
	 * @generated
	 */
	EReference getSemanticVisitor_runtimeModelElement_Value_States();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.State#getActionActivation_firing_Values <em>Action Activation firing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Activation firing Values</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.State#getActionActivation_firing_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActionActivation_firing_Values();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.State#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Visitor runtime Model Element Values</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.State#getSemanticVisitor_runtimeModelElement_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SemanticVisitor_runtimeModelElement_Values();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewStepsTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.Value#getStatesNoOpposite()
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
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.impl.ActionActivation_firing_ValueImpl <em>Action Activation firing Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.impl.ActionActivation_firing_ValueImpl
		 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getActionActivation_firing_Value()
		 * @generated
		 */
		EClass ACTION_ACTIVATION_FIRING_VALUE = eINSTANCE.getActionActivation_firing_Value();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ACTIVATION_FIRING_VALUE__FIRING = eINSTANCE.getActionActivation_firing_Value_Firing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_FIRING_VALUE__PARENT = eINSTANCE.getActionActivation_firing_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ACTIVATION_FIRING_VALUE__STATES = eINSTANCE.getActionActivation_firing_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getActionActivation_firing_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl <em>Semantic Visitor runtime Model Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl
		 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getSemanticVisitor_runtimeModelElement_Value()
		 * @generated
		 */
		EClass SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Runtime Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.impl.StateImpl
		 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Action Activation firing Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION_ACTIVATION_FIRING_VALUES = eINSTANCE.getState_ActionActivation_firing_Values();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Semantic Visitor runtime Model Element Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES = eINSTANCE.getState_SemanticVisitor_runtimeModelElement_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.Value
		 * @see fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl#getValue()
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
