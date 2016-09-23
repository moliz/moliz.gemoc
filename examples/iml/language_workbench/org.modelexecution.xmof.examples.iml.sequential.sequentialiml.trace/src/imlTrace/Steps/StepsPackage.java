/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see imlTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "imlTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = imlTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link imlTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.SpecificStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 27;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = TracePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep <em>Iml State Execute Activities Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities_AbstractSubStep()
	 * @generated
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP = 24;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Execute Activities Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Execute Activities Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_Activity_DoExecuteImpl <em>Iml Activity Do Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_Activity_DoExecuteImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Activity_DoExecute()
	 * @generated
	 */
	int IML_ACTIVITY_DO_EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE__MSEOCCURRENCE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE__ENDING_STATE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE__STARTING_STATE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Activity Do Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE_FEATURE_COUNT = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE___GET_CALLER = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Activity Do Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_ACTIVITY_DO_EXECUTE_OPERATION_COUNT = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_Header_ExecuteImpl <em>Iml Header Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_Header_ExecuteImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute()
	 * @generated
	 */
	int IML_HEADER_EXECUTE = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml Header Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Header Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_Header_Execute_AbstractSubStep <em>Iml Header Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_Header_Execute_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute_AbstractSubStep()
	 * @generated
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Header Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Header Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_Header_Execute_ImplicitStepImpl <em>Iml Header Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_Header_Execute_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute_ImplicitStep()
	 * @generated
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Header Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Header Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_HEADER_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SelectionConvergence_DoFireImpl <em>Iml Selection Convergence Do Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SelectionConvergence_DoFireImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire()
	 * @generated
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml Selection Convergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Convergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep <em>Iml Selection Convergence Do Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire_AbstractSubStep()
	 * @generated
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Selection Convergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Convergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SelectionConvergence_DoFire_ImplicitStepImpl <em>Iml Selection Convergence Do Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SelectionConvergence_DoFire_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire_ImplicitStep()
	 * @generated
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__ENDING_STATE = IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__STARTING_STATE = IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Selection Convergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP_FEATURE_COUNT = IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Convergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP_OPERATION_COUNT = IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SelectionDivergence_DoFireImpl <em>Iml Selection Divergence Do Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SelectionDivergence_DoFireImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire()
	 * @generated
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml Selection Divergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Divergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep <em>Iml Selection Divergence Do Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire_AbstractSubStep()
	 * @generated
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Selection Divergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Divergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SelectionDivergence_DoFire_ImplicitStepImpl <em>Iml Selection Divergence Do Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SelectionDivergence_DoFire_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire_ImplicitStep()
	 * @generated
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__ENDING_STATE = IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__STARTING_STATE = IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Selection Divergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP_FEATURE_COUNT = IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Selection Divergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP_OPERATION_COUNT = IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFireImpl <em>Iml Simultaneous Convergence Do Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFireImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire()
	 * @generated
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Convergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Convergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep <em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire_AbstractSubStep()
	 * @generated
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl <em>Iml Simultaneous Convergence Do Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire_ImplicitStep()
	 * @generated
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__ENDING_STATE = IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP__STARTING_STATE = IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Convergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP_FEATURE_COUNT = IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Convergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP_OPERATION_COUNT = IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFireImpl <em>Iml Simultaneous Divergence Do Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFireImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire()
	 * @generated
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Divergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Divergence Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep <em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire_AbstractSubStep()
	 * @generated
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl <em>Iml Simultaneous Divergence Do Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire_ImplicitStep()
	 * @generated
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__ENDING_STATE = IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP__STARTING_STATE = IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml Simultaneous Divergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP_FEATURE_COUNT = IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml Simultaneous Divergence Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP_OPERATION_COUNT = IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_StateTransition_DoFireImpl <em>Iml State Transition Do Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_StateTransition_DoFireImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire()
	 * @generated
	 */
	int IML_STATE_TRANSITION_DO_FIRE = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml State Transition Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Transition Do Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep <em>Iml State Transition Do Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire_AbstractSubStep()
	 * @generated
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP = 17;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Transition Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Transition Do Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_StateTransition_DoFire_ImplicitStepImpl <em>Iml State Transition Do Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_StateTransition_DoFire_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire_ImplicitStep()
	 * @generated
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP__ENDING_STATE = IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP__STARTING_STATE = IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Transition Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP_FEATURE_COUNT = IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Transition Do Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP_OPERATION_COUNT = IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_State_ActivateImpl <em>Iml State Activate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_State_ActivateImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate()
	 * @generated
	 */
	int IML_STATE_ACTIVATE = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE__MSEOCCURRENCE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE__ENDING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE__STARTING_STATE = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE__SUB_STEPS = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml State Activate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_FEATURE_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE___GET_CALLER = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Activate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_OPERATION_COUNT = IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.Iml_State_Activate_AbstractSubStep <em>Iml State Activate Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.Iml_State_Activate_AbstractSubStep
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate_AbstractSubStep()
	 * @generated
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP = 20;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Activate Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Activate Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_State_Activate_ImplicitStepImpl <em>Iml State Activate Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_State_Activate_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate_ImplicitStep()
	 * @generated
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP = 21;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP__MSEOCCURRENCE = IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP__ENDING_STATE = IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP__STARTING_STATE = IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Activate Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP_FEATURE_COUNT = IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Activate Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_ACTIVATE_IMPLICIT_STEP_OPERATION_COUNT = IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_State_DeactivateImpl <em>Iml State Deactivate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_State_DeactivateImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Deactivate()
	 * @generated
	 */
	int IML_STATE_DEACTIVATE = 22;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Deactivate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Deactivate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_DEACTIVATE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_State_ExecuteActivitiesImpl <em>Iml State Execute Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_State_ExecuteActivitiesImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities()
	 * @generated
	 */
	int IML_STATE_EXECUTE_ACTIVITIES = 23;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iml State Execute Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Execute Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.Iml_State_ExecuteActivities_ImplicitStepImpl <em>Iml State Execute Activities Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.Iml_State_ExecuteActivities_ImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities_ImplicitStep()
	 * @generated
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP = 25;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP__MSEOCCURRENCE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP__ENDING_STATE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP__STARTING_STATE = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Iml State Execute Activities Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP_FEATURE_COUNT = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iml State Execute Activities Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP_OPERATION_COUNT = IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imlTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.Steps.impl.RootImplicitStepImpl
	 * @see imlTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 26;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = TracePackage.SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_Activity_DoExecute <em>Iml Activity Do Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Activity Do Execute</em>'.
	 * @see imlTrace.Steps.Iml_Activity_DoExecute
	 * @generated
	 */
	EClass getIml_Activity_DoExecute();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_Activity_DoExecute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_Activity_DoExecute#getCaller()
	 * @generated
	 */
	EOperation getIml_Activity_DoExecute__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_Header_Execute <em>Iml Header Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Header Execute</em>'.
	 * @see imlTrace.Steps.Iml_Header_Execute
	 * @generated
	 */
	EClass getIml_Header_Execute();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_Header_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_Header_Execute#getCaller()
	 * @generated
	 */
	EOperation getIml_Header_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_Header_Execute_AbstractSubStep <em>Iml Header Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Header Execute Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_Header_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getIml_Header_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_Header_Execute_ImplicitStep <em>Iml Header Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Header Execute Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_Header_Execute_ImplicitStep
	 * @generated
	 */
	EClass getIml_Header_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire <em>Iml Selection Convergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Convergence Do Fire</em>'.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire
	 * @generated
	 */
	EClass getIml_SelectionConvergence_DoFire();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire#getCaller()
	 * @generated
	 */
	EOperation getIml_SelectionConvergence_DoFire__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep <em>Iml Selection Convergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Convergence Do Fire Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep
	 * @generated
	 */
	EClass getIml_SelectionConvergence_DoFire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep <em>Iml Selection Convergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Convergence Do Fire Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep
	 * @generated
	 */
	EClass getIml_SelectionConvergence_DoFire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire <em>Iml Selection Divergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Divergence Do Fire</em>'.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire
	 * @generated
	 */
	EClass getIml_SelectionDivergence_DoFire();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire#getCaller()
	 * @generated
	 */
	EOperation getIml_SelectionDivergence_DoFire__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep <em>Iml Selection Divergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Divergence Do Fire Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep
	 * @generated
	 */
	EClass getIml_SelectionDivergence_DoFire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep <em>Iml Selection Divergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Selection Divergence Do Fire Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep
	 * @generated
	 */
	EClass getIml_SelectionDivergence_DoFire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire <em>Iml Simultaneous Convergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Convergence Do Fire</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire
	 * @generated
	 */
	EClass getIml_SimultaneousConvergence_DoFire();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire#getCaller()
	 * @generated
	 */
	EOperation getIml_SimultaneousConvergence_DoFire__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep <em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep
	 * @generated
	 */
	EClass getIml_SimultaneousConvergence_DoFire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep <em>Iml Simultaneous Convergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Convergence Do Fire Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep
	 * @generated
	 */
	EClass getIml_SimultaneousConvergence_DoFire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire <em>Iml Simultaneous Divergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Divergence Do Fire</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire
	 * @generated
	 */
	EClass getIml_SimultaneousDivergence_DoFire();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire#getCaller()
	 * @generated
	 */
	EOperation getIml_SimultaneousDivergence_DoFire__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep <em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep
	 * @generated
	 */
	EClass getIml_SimultaneousDivergence_DoFire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep <em>Iml Simultaneous Divergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml Simultaneous Divergence Do Fire Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep
	 * @generated
	 */
	EClass getIml_SimultaneousDivergence_DoFire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_StateTransition_DoFire <em>Iml State Transition Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Transition Do Fire</em>'.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire
	 * @generated
	 */
	EClass getIml_StateTransition_DoFire();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_StateTransition_DoFire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire#getCaller()
	 * @generated
	 */
	EOperation getIml_StateTransition_DoFire__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep <em>Iml State Transition Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Transition Do Fire Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep
	 * @generated
	 */
	EClass getIml_StateTransition_DoFire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep <em>Iml State Transition Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Transition Do Fire Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep
	 * @generated
	 */
	EClass getIml_StateTransition_DoFire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_Activate <em>Iml State Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Activate</em>'.
	 * @see imlTrace.Steps.Iml_State_Activate
	 * @generated
	 */
	EClass getIml_State_Activate();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_State_Activate#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_State_Activate#getCaller()
	 * @generated
	 */
	EOperation getIml_State_Activate__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_Activate_AbstractSubStep <em>Iml State Activate Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Activate Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_State_Activate_AbstractSubStep
	 * @generated
	 */
	EClass getIml_State_Activate_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_Activate_ImplicitStep <em>Iml State Activate Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Activate Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_State_Activate_ImplicitStep
	 * @generated
	 */
	EClass getIml_State_Activate_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_Deactivate <em>Iml State Deactivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Deactivate</em>'.
	 * @see imlTrace.Steps.Iml_State_Deactivate
	 * @generated
	 */
	EClass getIml_State_Deactivate();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_State_Deactivate#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_State_Deactivate#getCaller()
	 * @generated
	 */
	EOperation getIml_State_Deactivate__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_ExecuteActivities <em>Iml State Execute Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Execute Activities</em>'.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities
	 * @generated
	 */
	EClass getIml_State_ExecuteActivities();

	/**
	 * Returns the meta object for the '{@link imlTrace.Steps.Iml_State_ExecuteActivities#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities#getCaller()
	 * @generated
	 */
	EOperation getIml_State_ExecuteActivities__GetCaller();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep <em>Iml State Execute Activities Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Execute Activities Abstract Sub Step</em>'.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep
	 * @generated
	 */
	EClass getIml_State_ExecuteActivities_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep <em>Iml State Execute Activities Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iml State Execute Activities Implicit Step</em>'.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep
	 * @generated
	 */
	EClass getIml_State_ExecuteActivities_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see imlTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link imlTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see imlTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see imlTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link imlTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see imlTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_Activity_DoExecuteImpl <em>Iml Activity Do Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_Activity_DoExecuteImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Activity_DoExecute()
		 * @generated
		 */
		EClass IML_ACTIVITY_DO_EXECUTE = eINSTANCE.getIml_Activity_DoExecute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_ACTIVITY_DO_EXECUTE___GET_CALLER = eINSTANCE.getIml_Activity_DoExecute__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_Header_ExecuteImpl <em>Iml Header Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_Header_ExecuteImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute()
		 * @generated
		 */
		EClass IML_HEADER_EXECUTE = eINSTANCE.getIml_Header_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_HEADER_EXECUTE___GET_CALLER = eINSTANCE.getIml_Header_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_Header_Execute_AbstractSubStep <em>Iml Header Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_Header_Execute_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_Header_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_Header_Execute_ImplicitStepImpl <em>Iml Header Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_Header_Execute_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_Header_Execute_ImplicitStep()
		 * @generated
		 */
		EClass IML_HEADER_EXECUTE_IMPLICIT_STEP = eINSTANCE.getIml_Header_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SelectionConvergence_DoFireImpl <em>Iml Selection Convergence Do Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SelectionConvergence_DoFireImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire()
		 * @generated
		 */
		EClass IML_SELECTION_CONVERGENCE_DO_FIRE = eINSTANCE.getIml_SelectionConvergence_DoFire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_SELECTION_CONVERGENCE_DO_FIRE___GET_CALLER = eINSTANCE.getIml_SelectionConvergence_DoFire__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep <em>Iml Selection Convergence Do Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire_AbstractSubStep()
		 * @generated
		 */
		EClass IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_SelectionConvergence_DoFire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SelectionConvergence_DoFire_ImplicitStepImpl <em>Iml Selection Convergence Do Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SelectionConvergence_DoFire_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionConvergence_DoFire_ImplicitStep()
		 * @generated
		 */
		EClass IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP = eINSTANCE.getIml_SelectionConvergence_DoFire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SelectionDivergence_DoFireImpl <em>Iml Selection Divergence Do Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SelectionDivergence_DoFireImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire()
		 * @generated
		 */
		EClass IML_SELECTION_DIVERGENCE_DO_FIRE = eINSTANCE.getIml_SelectionDivergence_DoFire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_SELECTION_DIVERGENCE_DO_FIRE___GET_CALLER = eINSTANCE.getIml_SelectionDivergence_DoFire__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep <em>Iml Selection Divergence Do Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire_AbstractSubStep()
		 * @generated
		 */
		EClass IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_SelectionDivergence_DoFire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SelectionDivergence_DoFire_ImplicitStepImpl <em>Iml Selection Divergence Do Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SelectionDivergence_DoFire_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SelectionDivergence_DoFire_ImplicitStep()
		 * @generated
		 */
		EClass IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP = eINSTANCE.getIml_SelectionDivergence_DoFire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFireImpl <em>Iml Simultaneous Convergence Do Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFireImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE = eINSTANCE.getIml_SimultaneousConvergence_DoFire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE___GET_CALLER = eINSTANCE.getIml_SimultaneousConvergence_DoFire__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep <em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire_AbstractSubStep()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_SimultaneousConvergence_DoFire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl <em>Iml Simultaneous Convergence Do Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousConvergence_DoFire_ImplicitStep()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP = eINSTANCE.getIml_SimultaneousConvergence_DoFire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFireImpl <em>Iml Simultaneous Divergence Do Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFireImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE = eINSTANCE.getIml_SimultaneousDivergence_DoFire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE___GET_CALLER = eINSTANCE.getIml_SimultaneousDivergence_DoFire__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep <em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire_AbstractSubStep()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_SimultaneousDivergence_DoFire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl <em>Iml Simultaneous Divergence Do Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_SimultaneousDivergence_DoFire_ImplicitStep()
		 * @generated
		 */
		EClass IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP = eINSTANCE.getIml_SimultaneousDivergence_DoFire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_StateTransition_DoFireImpl <em>Iml State Transition Do Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_StateTransition_DoFireImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire()
		 * @generated
		 */
		EClass IML_STATE_TRANSITION_DO_FIRE = eINSTANCE.getIml_StateTransition_DoFire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_STATE_TRANSITION_DO_FIRE___GET_CALLER = eINSTANCE.getIml_StateTransition_DoFire__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep <em>Iml State Transition Do Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire_AbstractSubStep()
		 * @generated
		 */
		EClass IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_StateTransition_DoFire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_StateTransition_DoFire_ImplicitStepImpl <em>Iml State Transition Do Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_StateTransition_DoFire_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_StateTransition_DoFire_ImplicitStep()
		 * @generated
		 */
		EClass IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP = eINSTANCE.getIml_StateTransition_DoFire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_State_ActivateImpl <em>Iml State Activate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_State_ActivateImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate()
		 * @generated
		 */
		EClass IML_STATE_ACTIVATE = eINSTANCE.getIml_State_Activate();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_STATE_ACTIVATE___GET_CALLER = eINSTANCE.getIml_State_Activate__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_State_Activate_AbstractSubStep <em>Iml State Activate Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_State_Activate_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate_AbstractSubStep()
		 * @generated
		 */
		EClass IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP = eINSTANCE.getIml_State_Activate_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_State_Activate_ImplicitStepImpl <em>Iml State Activate Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_State_Activate_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Activate_ImplicitStep()
		 * @generated
		 */
		EClass IML_STATE_ACTIVATE_IMPLICIT_STEP = eINSTANCE.getIml_State_Activate_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_State_DeactivateImpl <em>Iml State Deactivate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_State_DeactivateImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_Deactivate()
		 * @generated
		 */
		EClass IML_STATE_DEACTIVATE = eINSTANCE.getIml_State_Deactivate();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_STATE_DEACTIVATE___GET_CALLER = eINSTANCE.getIml_State_Deactivate__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_State_ExecuteActivitiesImpl <em>Iml State Execute Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_State_ExecuteActivitiesImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities()
		 * @generated
		 */
		EClass IML_STATE_EXECUTE_ACTIVITIES = eINSTANCE.getIml_State_ExecuteActivities();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IML_STATE_EXECUTE_ACTIVITIES___GET_CALLER = eINSTANCE.getIml_State_ExecuteActivities__GetCaller();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep <em>Iml State Execute Activities Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities_AbstractSubStep()
		 * @generated
		 */
		EClass IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP = eINSTANCE.getIml_State_ExecuteActivities_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.Iml_State_ExecuteActivities_ImplicitStepImpl <em>Iml State Execute Activities Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.Iml_State_ExecuteActivities_ImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getIml_State_ExecuteActivities_ImplicitStep()
		 * @generated
		 */
		EClass IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP = eINSTANCE.getIml_State_ExecuteActivities_ImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.impl.RootImplicitStepImpl
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link imlTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.Steps.SpecificStep
		 * @see imlTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
