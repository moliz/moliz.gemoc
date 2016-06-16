/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

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
 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicActionsFewStepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicActionsFewSteps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fumlConfigurationFewStepsTrace_BasicActionsFewSteps";

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
	BasicActionsFewStepsPackage eINSTANCE = fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedActionActivationImpl
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl#getTracedActionActivation()
	 * @generated
	 */
	int TRACED_ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE = IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION_FEATURE_COUNT = IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_ACTIVATION_OPERATION_COUNT = IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedPinActivationImpl
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl#getTracedPinActivation()
	 * @generated
	 */
	int TRACED_PIN_ACTIVATION = 1;

	/**
	 * The number of structural features of the '<em>Traced Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_ACTIVATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation <em>Traced Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation
	 * @generated
	 */
	EClass getTracedActionActivation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firing Sequence</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation#getFiringSequence()
	 * @see #getTracedActionActivation()
	 * @generated
	 */
	EReference getTracedActionActivation_FiringSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation <em>Traced Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation
	 * @generated
	 */
	EClass getTracedPinActivation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicActionsFewStepsFactory getBasicActionsFewStepsFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedActionActivationImpl <em>Traced Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedActionActivationImpl
		 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl#getTracedActionActivation()
		 * @generated
		 */
		EClass TRACED_ACTION_ACTIVATION = eINSTANCE.getTracedActionActivation();

		/**
		 * The meta object literal for the '<em><b>Firing Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE = eINSTANCE.getTracedActionActivation_FiringSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedPinActivationImpl <em>Traced Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedPinActivationImpl
		 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl#getTracedPinActivation()
		 * @generated
		 */
		EClass TRACED_PIN_ACTIVATION = eINSTANCE.getTracedPinActivation();

	}

} //BasicActionsFewStepsPackage
