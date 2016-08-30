/**
 */
package org.modelexecution.xmof.examples.iml.sequentialiml.iml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlFactory
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
	String eNS_URI = "http://sequentialiml/iml/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImlPackage eINSTANCE = org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ElementImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.IdentifyableElementImpl <em>Identifyable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.IdentifyableElementImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getIdentifyableElement()
	 * @generated
	 */
	int IDENTIFYABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_ELEMENT__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_ELEMENT__ID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifyable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.HeaderImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MEMBERS = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.CommentImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.AddDataImpl <em>Add Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.AddDataImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getAddData()
	 * @generated
	 */
	int ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA__TYPE = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INIT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TERMINAL = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITIES = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CURRENT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateTransitionImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boolean Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__BOOLEAN_GUARD = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__EVENT_GUARD = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.JumpImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ActivityImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INIT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TERMINAL = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fired Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FIRED_EVENTS = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TIME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CURRENT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.VariableImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTENT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SI Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SI_UNIT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ADDRESS = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.EventImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousDivergenceImpl <em>Simultaneous Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousDivergenceImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSimultaneousDivergence()
	 * @generated
	 */
	int SIMULTANEOUS_DIVERGENCE = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simultaneous Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousConvergenceImpl <em>Simultaneous Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousConvergenceImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSimultaneousConvergence()
	 * @generated
	 */
	int SIMULTANEOUS_CONVERGENCE = 12;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simultaneous Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionDivergenceImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSelectionDivergence()
	 * @generated
	 */
	int SELECTION_DIVERGENCE = 13;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionConvergenceImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSelectionConvergence()
	 * @generated
	 */
	int SELECTION_CONVERGENCE = 14;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE__FIRING = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionPointImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 15;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__FIRING = 0;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 16;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__COMMENT = IDENTIFYABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = IDENTIFYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = IDENTIFYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.TimeImpl
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 17;

	/**
	 * The feature id for the '<em><b>Earliest Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EARLIEST_START = 0;

	/**
	 * The feature id for the '<em><b>Latest Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__LATEST_START = 1;

	/**
	 * The feature id for the '<em><b>Earliest End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EARLIEST_END = 2;

	/**
	 * The feature id for the '<em><b>Latest End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__LATEST_END = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DURATION = 4;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DELAY = 5;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>Iterable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Iterable
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getIterable()
	 * @generated
	 */
	int ITERABLE = 18;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement <em>Identifyable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifyable Element</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement
	 * @generated
	 */
	EClass getIdentifyableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement#getId()
	 * @see #getIdentifyableElement()
	 * @generated
	 */
	EAttribute getIdentifyableElement_Id();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header#getMembers()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Members();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element#getComment()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Comment();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Data</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData
	 * @generated
	 */
	EClass getAddData();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData#getType()
	 * @see #getAddData()
	 * @generated
	 */
	EAttribute getAddData_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData#getName()
	 * @see #getAddData()
	 * @generated
	 */
	EAttribute getAddData_Name();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isInit()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isTerminal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#getActivities()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activities();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.State#isCurrent()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Current();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getName()
	 * @see #getStateTransition()
	 * @generated
	 */
	EAttribute getStateTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getBooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boolean Guard</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getBooleanGuard()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_BooleanGuard();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getEventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Guard</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition#getEventGuard()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_EventGuard();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump#getTarget()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Target();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isInit()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isTerminal()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getFiredEvents <em>Fired Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fired Events</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getFiredEvents()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_FiredEvents();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#getTime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity#isCurrent()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Current();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getContent()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getSIUnit <em>SI Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SI Unit</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getSIUnit()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_SIUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getAddress()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence <em>Simultaneous Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Divergence</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence
	 * @generated
	 */
	EClass getSimultaneousDivergence();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence <em>Simultaneous Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Convergence</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence
	 * @generated
	 */
	EClass getSimultaneousConvergence();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence <em>Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Divergence</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence
	 * @generated
	 */
	EClass getSelectionDivergence();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence <em>Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Convergence</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence
	 * @generated
	 */
	EClass getSelectionConvergence();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint#isFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint#isFiring()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Firing();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getEarliestStart <em>Earliest Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Start</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getEarliestStart()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_EarliestStart();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getLatestStart <em>Latest Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Start</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getLatestStart()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_LatestStart();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getEarliestEnd <em>Earliest End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest End</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getEarliestEnd()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_EarliestEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getLatestEnd <em>Latest End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest End</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getLatestEnd()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_LatestEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getDuration()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.Time#getDelay()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Delay();

	/**
	 * Returns the meta object for data type '{@link java.lang.Iterable <em>Iterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterable</em>'.
	 * @see java.lang.Iterable
	 * @model instanceClass="java.lang.Iterable"
	 * @generated
	 */
	EDataType getIterable();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.IdentifyableElementImpl <em>Identifyable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.IdentifyableElementImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getIdentifyableElement()
		 * @generated
		 */
		EClass IDENTIFYABLE_ELEMENT = eINSTANCE.getIdentifyableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFYABLE_ELEMENT__ID = eINSTANCE.getIdentifyableElement_Id();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.HeaderImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__MEMBERS = eINSTANCE.getHeader_Members();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ElementImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__COMMENT = eINSTANCE.getElement_Comment();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.CommentImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.AddDataImpl <em>Add Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.AddDataImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getAddData()
		 * @generated
		 */
		EClass ADD_DATA = eINSTANCE.getAddData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_DATA__TYPE = eINSTANCE.getAddData_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_DATA__NAME = eINSTANCE.getAddData_Name();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INIT = eINSTANCE.getState_Init();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TERMINAL = eINSTANCE.getState_Terminal();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITIES = eINSTANCE.getState_Activities();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__CURRENT = eINSTANCE.getState_Current();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.StateTransitionImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TRANSITION__NAME = eINSTANCE.getStateTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Boolean Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__BOOLEAN_GUARD = eINSTANCE.getStateTransition_BooleanGuard();

		/**
		 * The meta object literal for the '<em><b>Event Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__EVENT_GUARD = eINSTANCE.getStateTransition_EventGuard();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.JumpImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__TARGET = eINSTANCE.getJump_Target();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ActivityImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__INIT = eINSTANCE.getActivity_Init();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TERMINAL = eINSTANCE.getActivity_Terminal();

		/**
		 * The meta object literal for the '<em><b>Fired Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FIRED_EVENTS = eINSTANCE.getActivity_FiredEvents();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TIME = eINSTANCE.getActivity_Time();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CURRENT = eINSTANCE.getActivity_Current();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.VariableImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__CONTENT = eINSTANCE.getVariable_Content();

		/**
		 * The meta object literal for the '<em><b>SI Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SI_UNIT = eINSTANCE.getVariable_SIUnit();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ADDRESS = eINSTANCE.getVariable_Address();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.EventImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousDivergenceImpl <em>Simultaneous Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousDivergenceImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSimultaneousDivergence()
		 * @generated
		 */
		EClass SIMULTANEOUS_DIVERGENCE = eINSTANCE.getSimultaneousDivergence();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousConvergenceImpl <em>Simultaneous Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SimultaneousConvergenceImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSimultaneousConvergence()
		 * @generated
		 */
		EClass SIMULTANEOUS_CONVERGENCE = eINSTANCE.getSimultaneousConvergence();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionDivergenceImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSelectionDivergence()
		 * @generated
		 */
		EClass SELECTION_DIVERGENCE = eINSTANCE.getSelectionDivergence();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.SelectionConvergenceImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getSelectionConvergence()
		 * @generated
		 */
		EClass SELECTION_CONVERGENCE = eINSTANCE.getSelectionConvergence();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionPointImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__FIRING = eINSTANCE.getConnectionPoint_Firing();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ConnectionImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.TimeImpl
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Earliest Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__EARLIEST_START = eINSTANCE.getTime_EarliestStart();

		/**
		 * The meta object literal for the '<em><b>Latest Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__LATEST_START = eINSTANCE.getTime_LatestStart();

		/**
		 * The meta object literal for the '<em><b>Earliest End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__EARLIEST_END = eINSTANCE.getTime_EarliestEnd();

		/**
		 * The meta object literal for the '<em><b>Latest End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__LATEST_END = eINSTANCE.getTime_LatestEnd();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__DURATION = eINSTANCE.getTime_Duration();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__DELAY = eINSTANCE.getTime_Delay();

		/**
		 * The meta object literal for the '<em>Iterable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.modelexecution.xmof.examples.iml.sequentialiml.iml.impl.ImlPackageImpl#getIterable()
		 * @generated
		 */
		EDataType ITERABLE = eINSTANCE.getIterable();

	}

} //ImlPackage
