/**
 */
package imlTrace.States.iml;

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
 * @see imlTrace.States.iml.ImlFactory
 * @model kind="package"
 * @generated
 */
public interface ImlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "imlTrace_iml";

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
	ImlPackage eINSTANCE = imlTrace.States.iml.impl.ImlPackageImpl.init();

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedElementImpl <em>Traced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedElementImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedElement()
	 * @generated
	 */
	int TRACED_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Traced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedIdentifyableElementImpl <em>Traced Identifyable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedIdentifyableElementImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedIdentifyableElement()
	 * @generated
	 */
	int TRACED_IDENTIFYABLE_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Traced Identifyable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT = TRACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Identifyable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT = TRACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedActivityImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedActivity()
	 * @generated
	 */
	int TRACED_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Current Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__CURRENT_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedAddDataImpl <em>Traced Add Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedAddDataImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedAddData()
	 * @generated
	 */
	int TRACED_ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_DATA__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Add Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_DATA_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Add Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ADD_DATA_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedConnectionImpl <em>Traced Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedConnectionImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedConnection()
	 * @generated
	 */
	int TRACED_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedConnectionPointImpl <em>Traced Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedConnectionPointImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedConnectionPoint()
	 * @generated
	 */
	int TRACED_CONNECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT__FIRING_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Traced Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONNECTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedEventImpl <em>Traced Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedEventImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedEvent()
	 * @generated
	 */
	int TRACED_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT__ORIGINAL_OBJECT = TRACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_FEATURE_COUNT = TRACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVENT_OPERATION_COUNT = TRACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedHeaderImpl <em>Traced Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedHeaderImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedHeader()
	 * @generated
	 */
	int TRACED_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_HEADER__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_HEADER_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_HEADER_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedJumpImpl <em>Traced Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedJumpImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedJump()
	 * @generated
	 */
	int TRACED_JUMP = 8;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JUMP__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JUMP__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JUMP_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JUMP_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedSelectionConvergenceImpl <em>Traced Selection Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedSelectionConvergenceImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSelectionConvergence()
	 * @generated
	 */
	int TRACED_SELECTION_CONVERGENCE = 9;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_CONVERGENCE__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_CONVERGENCE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_CONVERGENCE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_CONVERGENCE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedSelectionDivergenceImpl <em>Traced Selection Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedSelectionDivergenceImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSelectionDivergence()
	 * @generated
	 */
	int TRACED_SELECTION_DIVERGENCE = 10;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_DIVERGENCE__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_DIVERGENCE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_DIVERGENCE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SELECTION_DIVERGENCE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedSimultaneousConvergenceImpl <em>Traced Simultaneous Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedSimultaneousConvergenceImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSimultaneousConvergence()
	 * @generated
	 */
	int TRACED_SIMULTANEOUS_CONVERGENCE = 11;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_CONVERGENCE__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_CONVERGENCE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Simultaneous Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_CONVERGENCE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Simultaneous Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_CONVERGENCE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedSimultaneousDivergenceImpl <em>Traced Simultaneous Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedSimultaneousDivergenceImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSimultaneousDivergence()
	 * @generated
	 */
	int TRACED_SIMULTANEOUS_DIVERGENCE = 12;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_DIVERGENCE__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_DIVERGENCE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Simultaneous Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_DIVERGENCE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Simultaneous Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SIMULTANEOUS_DIVERGENCE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedStateImpl <em>Traced State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedStateImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedState()
	 * @generated
	 */
	int TRACED_STATE = 13;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__CURRENT_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedStateTransitionImpl <em>Traced State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedStateTransitionImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedStateTransition()
	 * @generated
	 */
	int TRACED_STATE_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Firing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_TRANSITION__FIRING_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_TRANSITION__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_TRANSITION_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_TRANSITION_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.States.iml.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.States.iml.impl.TracedVariableImpl
	 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__ORIGINAL_OBJECT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__VALUE_SEQUENCE = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = TRACED_IDENTIFYABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedActivity <em>Traced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity</em>'.
	 * @see imlTrace.States.iml.TracedActivity
	 * @generated
	 */
	EClass getTracedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.States.iml.TracedActivity#getCurrentSequence <em>Current Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Sequence</em>'.
	 * @see imlTrace.States.iml.TracedActivity#getCurrentSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_CurrentSequence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedActivity#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedActivity#getOriginalObject()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedAddData <em>Traced Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Add Data</em>'.
	 * @see imlTrace.States.iml.TracedAddData
	 * @generated
	 */
	EClass getTracedAddData();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedAddData#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedAddData#getOriginalObject()
	 * @see #getTracedAddData()
	 * @generated
	 */
	EReference getTracedAddData_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedConnection <em>Traced Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connection</em>'.
	 * @see imlTrace.States.iml.TracedConnection
	 * @generated
	 */
	EClass getTracedConnection();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedConnection#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedConnection#getOriginalObject()
	 * @see #getTracedConnection()
	 * @generated
	 */
	EReference getTracedConnection_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedConnectionPoint <em>Traced Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Connection Point</em>'.
	 * @see imlTrace.States.iml.TracedConnectionPoint
	 * @generated
	 */
	EClass getTracedConnectionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.States.iml.TracedConnectionPoint#getFiringSequence <em>Firing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firing Sequence</em>'.
	 * @see imlTrace.States.iml.TracedConnectionPoint#getFiringSequence()
	 * @see #getTracedConnectionPoint()
	 * @generated
	 */
	EReference getTracedConnectionPoint_FiringSequence();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedElement <em>Traced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Element</em>'.
	 * @see imlTrace.States.iml.TracedElement
	 * @generated
	 */
	EClass getTracedElement();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedEvent <em>Traced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Event</em>'.
	 * @see imlTrace.States.iml.TracedEvent
	 * @generated
	 */
	EClass getTracedEvent();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedEvent#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedEvent#getOriginalObject()
	 * @see #getTracedEvent()
	 * @generated
	 */
	EReference getTracedEvent_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedHeader <em>Traced Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Header</em>'.
	 * @see imlTrace.States.iml.TracedHeader
	 * @generated
	 */
	EClass getTracedHeader();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedHeader#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedHeader#getOriginalObject()
	 * @see #getTracedHeader()
	 * @generated
	 */
	EReference getTracedHeader_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedIdentifyableElement <em>Traced Identifyable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Identifyable Element</em>'.
	 * @see imlTrace.States.iml.TracedIdentifyableElement
	 * @generated
	 */
	EClass getTracedIdentifyableElement();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedJump <em>Traced Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Jump</em>'.
	 * @see imlTrace.States.iml.TracedJump
	 * @generated
	 */
	EClass getTracedJump();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedJump#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedJump#getOriginalObject()
	 * @see #getTracedJump()
	 * @generated
	 */
	EReference getTracedJump_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedSelectionConvergence <em>Traced Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Selection Convergence</em>'.
	 * @see imlTrace.States.iml.TracedSelectionConvergence
	 * @generated
	 */
	EClass getTracedSelectionConvergence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedSelectionConvergence#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedSelectionConvergence#getOriginalObject()
	 * @see #getTracedSelectionConvergence()
	 * @generated
	 */
	EReference getTracedSelectionConvergence_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedSelectionDivergence <em>Traced Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Selection Divergence</em>'.
	 * @see imlTrace.States.iml.TracedSelectionDivergence
	 * @generated
	 */
	EClass getTracedSelectionDivergence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedSelectionDivergence#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedSelectionDivergence#getOriginalObject()
	 * @see #getTracedSelectionDivergence()
	 * @generated
	 */
	EReference getTracedSelectionDivergence_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedSimultaneousConvergence <em>Traced Simultaneous Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Simultaneous Convergence</em>'.
	 * @see imlTrace.States.iml.TracedSimultaneousConvergence
	 * @generated
	 */
	EClass getTracedSimultaneousConvergence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedSimultaneousConvergence#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedSimultaneousConvergence#getOriginalObject()
	 * @see #getTracedSimultaneousConvergence()
	 * @generated
	 */
	EReference getTracedSimultaneousConvergence_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedSimultaneousDivergence <em>Traced Simultaneous Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Simultaneous Divergence</em>'.
	 * @see imlTrace.States.iml.TracedSimultaneousDivergence
	 * @generated
	 */
	EClass getTracedSimultaneousDivergence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedSimultaneousDivergence#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedSimultaneousDivergence#getOriginalObject()
	 * @see #getTracedSimultaneousDivergence()
	 * @generated
	 */
	EReference getTracedSimultaneousDivergence_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedState <em>Traced State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State</em>'.
	 * @see imlTrace.States.iml.TracedState
	 * @generated
	 */
	EClass getTracedState();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.States.iml.TracedState#getCurrentSequence <em>Current Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Sequence</em>'.
	 * @see imlTrace.States.iml.TracedState#getCurrentSequence()
	 * @see #getTracedState()
	 * @generated
	 */
	EReference getTracedState_CurrentSequence();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedState#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedState#getOriginalObject()
	 * @see #getTracedState()
	 * @generated
	 */
	EReference getTracedState_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedStateTransition <em>Traced State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State Transition</em>'.
	 * @see imlTrace.States.iml.TracedStateTransition
	 * @generated
	 */
	EClass getTracedStateTransition();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedStateTransition#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedStateTransition#getOriginalObject()
	 * @see #getTracedStateTransition()
	 * @generated
	 */
	EReference getTracedStateTransition_OriginalObject();

	/**
	 * Returns the meta object for class '{@link imlTrace.States.iml.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see imlTrace.States.iml.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.States.iml.TracedVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see imlTrace.States.iml.TracedVariable#getOriginalObject()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.States.iml.TracedVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see imlTrace.States.iml.TracedVariable#getValueSequence()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_ValueSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImlFactory getImlFactory();

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
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedActivityImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedActivity()
		 * @generated
		 */
		EClass TRACED_ACTIVITY = eINSTANCE.getTracedActivity();

		/**
		 * The meta object literal for the '<em><b>Current Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__CURRENT_SEQUENCE = eINSTANCE.getTracedActivity_CurrentSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__ORIGINAL_OBJECT = eINSTANCE.getTracedActivity_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedAddDataImpl <em>Traced Add Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedAddDataImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedAddData()
		 * @generated
		 */
		EClass TRACED_ADD_DATA = eINSTANCE.getTracedAddData();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ADD_DATA__ORIGINAL_OBJECT = eINSTANCE.getTracedAddData_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedConnectionImpl <em>Traced Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedConnectionImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedConnection()
		 * @generated
		 */
		EClass TRACED_CONNECTION = eINSTANCE.getTracedConnection();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONNECTION__ORIGINAL_OBJECT = eINSTANCE.getTracedConnection_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedConnectionPointImpl <em>Traced Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedConnectionPointImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedConnectionPoint()
		 * @generated
		 */
		EClass TRACED_CONNECTION_POINT = eINSTANCE.getTracedConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Firing Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONNECTION_POINT__FIRING_SEQUENCE = eINSTANCE.getTracedConnectionPoint_FiringSequence();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedElementImpl <em>Traced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedElementImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedElement()
		 * @generated
		 */
		EClass TRACED_ELEMENT = eINSTANCE.getTracedElement();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedEventImpl <em>Traced Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedEventImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedEvent()
		 * @generated
		 */
		EClass TRACED_EVENT = eINSTANCE.getTracedEvent();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EVENT__ORIGINAL_OBJECT = eINSTANCE.getTracedEvent_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedHeaderImpl <em>Traced Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedHeaderImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedHeader()
		 * @generated
		 */
		EClass TRACED_HEADER = eINSTANCE.getTracedHeader();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_HEADER__ORIGINAL_OBJECT = eINSTANCE.getTracedHeader_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedIdentifyableElementImpl <em>Traced Identifyable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedIdentifyableElementImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedIdentifyableElement()
		 * @generated
		 */
		EClass TRACED_IDENTIFYABLE_ELEMENT = eINSTANCE.getTracedIdentifyableElement();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedJumpImpl <em>Traced Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedJumpImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedJump()
		 * @generated
		 */
		EClass TRACED_JUMP = eINSTANCE.getTracedJump();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_JUMP__ORIGINAL_OBJECT = eINSTANCE.getTracedJump_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedSelectionConvergenceImpl <em>Traced Selection Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedSelectionConvergenceImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSelectionConvergence()
		 * @generated
		 */
		EClass TRACED_SELECTION_CONVERGENCE = eINSTANCE.getTracedSelectionConvergence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SELECTION_CONVERGENCE__ORIGINAL_OBJECT = eINSTANCE.getTracedSelectionConvergence_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedSelectionDivergenceImpl <em>Traced Selection Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedSelectionDivergenceImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSelectionDivergence()
		 * @generated
		 */
		EClass TRACED_SELECTION_DIVERGENCE = eINSTANCE.getTracedSelectionDivergence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SELECTION_DIVERGENCE__ORIGINAL_OBJECT = eINSTANCE.getTracedSelectionDivergence_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedSimultaneousConvergenceImpl <em>Traced Simultaneous Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedSimultaneousConvergenceImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSimultaneousConvergence()
		 * @generated
		 */
		EClass TRACED_SIMULTANEOUS_CONVERGENCE = eINSTANCE.getTracedSimultaneousConvergence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SIMULTANEOUS_CONVERGENCE__ORIGINAL_OBJECT = eINSTANCE.getTracedSimultaneousConvergence_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedSimultaneousDivergenceImpl <em>Traced Simultaneous Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedSimultaneousDivergenceImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedSimultaneousDivergence()
		 * @generated
		 */
		EClass TRACED_SIMULTANEOUS_DIVERGENCE = eINSTANCE.getTracedSimultaneousDivergence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SIMULTANEOUS_DIVERGENCE__ORIGINAL_OBJECT = eINSTANCE.getTracedSimultaneousDivergence_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedStateImpl <em>Traced State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedStateImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedState()
		 * @generated
		 */
		EClass TRACED_STATE = eINSTANCE.getTracedState();

		/**
		 * The meta object literal for the '<em><b>Current Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE__CURRENT_SEQUENCE = eINSTANCE.getTracedState_CurrentSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE__ORIGINAL_OBJECT = eINSTANCE.getTracedState_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedStateTransitionImpl <em>Traced State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedStateTransitionImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedStateTransition()
		 * @generated
		 */
		EClass TRACED_STATE_TRANSITION = eINSTANCE.getTracedStateTransition();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE_TRANSITION__ORIGINAL_OBJECT = eINSTANCE.getTracedStateTransition_OriginalObject();

		/**
		 * The meta object literal for the '{@link imlTrace.States.iml.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.States.iml.impl.TracedVariableImpl
		 * @see imlTrace.States.iml.impl.ImlPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedVariable_ValueSequence();

	}

} //ImlPackage
