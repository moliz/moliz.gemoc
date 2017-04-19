/**
 */
package fsmConfigurationTrace.States.fsm;

import fsmConfigurationTrace.States.StatesPackage;

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
 * @see fsmConfigurationTrace.States.fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmConfigurationTrace_fsm";

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
	FsmPackage eINSTANCE = fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl <em>Traced FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl
	 * @see fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl#getTracedFSM()
	 * @generated
	 */
	int TRACED_FSM = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__ORIGINAL_OBJECT_FSM = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.fsm.TracedFSM <em>Traced FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced FSM</em>'.
	 * @see fsmConfigurationTrace.States.fsm.TracedFSM
	 * @generated
	 */
	EClass getTracedFSM();

	/**
	 * Returns the meta object for the reference '{@link fsmConfigurationTrace.States.fsm.TracedFSM#getOriginalObject_FSM <em>Original Object FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object FSM</em>'.
	 * @see fsmConfigurationTrace.States.fsm.TracedFSM#getOriginalObject_FSM()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_OriginalObject_FSM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

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
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl <em>Traced FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl
		 * @see fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl#getTracedFSM()
		 * @generated
		 */
		EClass TRACED_FSM = eINSTANCE.getTracedFSM();

		/**
		 * The meta object literal for the '<em><b>Original Object FSM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__ORIGINAL_OBJECT_FSM = eINSTANCE.getTracedFSM_OriginalObject_FSM();

	}

} //FsmPackage
