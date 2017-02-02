/**
 */
package imlTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import imlTrace.ImlTracePackage;

import imlTrace.States.StatesPackage;

import imlTrace.States.iml.impl.ImlPackageImpl;

import imlTrace.States.impl.StatesPackageImpl;

import imlTrace.Steps.Iml_Activity_DoExecute;
import imlTrace.Steps.Iml_Header_Execute;
import imlTrace.Steps.Iml_Header_Execute_AbstractSubStep;
import imlTrace.Steps.Iml_Header_Execute_ImplicitStep;
import imlTrace.Steps.Iml_SelectionConvergence_DoFire;
import imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep;
import imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep;
import imlTrace.Steps.Iml_SelectionDivergence_DoFire;
import imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep;
import imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep;
import imlTrace.Steps.Iml_SimultaneousConvergence_DoFire;
import imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep;
import imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep;
import imlTrace.Steps.Iml_SimultaneousDivergence_DoFire;
import imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep;
import imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep;
import imlTrace.Steps.Iml_StateTransition_DoFire;
import imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep;
import imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep;
import imlTrace.Steps.Iml_State_Activate;
import imlTrace.Steps.Iml_State_Activate_AbstractSubStep;
import imlTrace.Steps.Iml_State_Activate_ImplicitStep;
import imlTrace.Steps.Iml_State_Deactivate;
import imlTrace.Steps.Iml_State_ExecuteActivities;
import imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep;
import imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep;
import imlTrace.Steps.RootImplicitStep;
import imlTrace.Steps.SpecificStep;
import imlTrace.Steps.StepsFactory;
import imlTrace.Steps.StepsPackage;

import imlTrace.impl.ImlTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_Activity_DoExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_Header_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_Header_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_Header_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionConvergence_DoFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionConvergence_DoFire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionConvergence_DoFire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionDivergence_DoFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionDivergence_DoFire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SelectionDivergence_DoFire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousConvergence_DoFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousConvergence_DoFire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousConvergence_DoFire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousDivergence_DoFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousDivergence_DoFire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_SimultaneousDivergence_DoFire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_StateTransition_DoFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_StateTransition_DoFire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_StateTransition_DoFire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_ActivateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_Activate_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_Activate_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_DeactivateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_ExecuteActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_ExecuteActivities_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iml_State_ExecuteActivities_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see imlTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ImlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ImlTracePackageImpl theImlTracePackage = (ImlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) instanceof ImlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) : ImlTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ImlPackageImpl theImlPackage_1 = (ImlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) instanceof ImlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) : imlTrace.States.iml.ImlPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theImlTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theImlPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theImlTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theImlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_Activity_DoExecute() {
		return iml_Activity_DoExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_Activity_DoExecute__GetCaller() {
		return iml_Activity_DoExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_Header_Execute() {
		return iml_Header_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_Header_Execute__GetCaller() {
		return iml_Header_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_Header_Execute_AbstractSubStep() {
		return iml_Header_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_Header_Execute_ImplicitStep() {
		return iml_Header_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionConvergence_DoFire() {
		return iml_SelectionConvergence_DoFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_SelectionConvergence_DoFire__GetCaller() {
		return iml_SelectionConvergence_DoFireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionConvergence_DoFire_AbstractSubStep() {
		return iml_SelectionConvergence_DoFire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionConvergence_DoFire_ImplicitStep() {
		return iml_SelectionConvergence_DoFire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionDivergence_DoFire() {
		return iml_SelectionDivergence_DoFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_SelectionDivergence_DoFire__GetCaller() {
		return iml_SelectionDivergence_DoFireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionDivergence_DoFire_AbstractSubStep() {
		return iml_SelectionDivergence_DoFire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SelectionDivergence_DoFire_ImplicitStep() {
		return iml_SelectionDivergence_DoFire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousConvergence_DoFire() {
		return iml_SimultaneousConvergence_DoFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_SimultaneousConvergence_DoFire__GetCaller() {
		return iml_SimultaneousConvergence_DoFireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousConvergence_DoFire_AbstractSubStep() {
		return iml_SimultaneousConvergence_DoFire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousConvergence_DoFire_ImplicitStep() {
		return iml_SimultaneousConvergence_DoFire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousDivergence_DoFire() {
		return iml_SimultaneousDivergence_DoFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_SimultaneousDivergence_DoFire__GetCaller() {
		return iml_SimultaneousDivergence_DoFireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousDivergence_DoFire_AbstractSubStep() {
		return iml_SimultaneousDivergence_DoFire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_SimultaneousDivergence_DoFire_ImplicitStep() {
		return iml_SimultaneousDivergence_DoFire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_StateTransition_DoFire() {
		return iml_StateTransition_DoFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_StateTransition_DoFire__GetCaller() {
		return iml_StateTransition_DoFireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_StateTransition_DoFire_AbstractSubStep() {
		return iml_StateTransition_DoFire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_StateTransition_DoFire_ImplicitStep() {
		return iml_StateTransition_DoFire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_Activate() {
		return iml_State_ActivateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_State_Activate__GetCaller() {
		return iml_State_ActivateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_Activate_AbstractSubStep() {
		return iml_State_Activate_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_Activate_ImplicitStep() {
		return iml_State_Activate_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_Deactivate() {
		return iml_State_DeactivateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_State_Deactivate__GetCaller() {
		return iml_State_DeactivateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_ExecuteActivities() {
		return iml_State_ExecuteActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIml_State_ExecuteActivities__GetCaller() {
		return iml_State_ExecuteActivitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_ExecuteActivities_AbstractSubStep() {
		return iml_State_ExecuteActivities_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIml_State_ExecuteActivities_ImplicitStep() {
		return iml_State_ExecuteActivities_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iml_Activity_DoExecuteEClass = createEClass(IML_ACTIVITY_DO_EXECUTE);
		createEOperation(iml_Activity_DoExecuteEClass, IML_ACTIVITY_DO_EXECUTE___GET_CALLER);

		iml_Header_ExecuteEClass = createEClass(IML_HEADER_EXECUTE);
		createEOperation(iml_Header_ExecuteEClass, IML_HEADER_EXECUTE___GET_CALLER);

		iml_Header_Execute_AbstractSubStepEClass = createEClass(IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP);

		iml_Header_Execute_ImplicitStepEClass = createEClass(IML_HEADER_EXECUTE_IMPLICIT_STEP);

		iml_SelectionConvergence_DoFireEClass = createEClass(IML_SELECTION_CONVERGENCE_DO_FIRE);
		createEOperation(iml_SelectionConvergence_DoFireEClass, IML_SELECTION_CONVERGENCE_DO_FIRE___GET_CALLER);

		iml_SelectionConvergence_DoFire_AbstractSubStepEClass = createEClass(IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP);

		iml_SelectionConvergence_DoFire_ImplicitStepEClass = createEClass(IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP);

		iml_SelectionDivergence_DoFireEClass = createEClass(IML_SELECTION_DIVERGENCE_DO_FIRE);
		createEOperation(iml_SelectionDivergence_DoFireEClass, IML_SELECTION_DIVERGENCE_DO_FIRE___GET_CALLER);

		iml_SelectionDivergence_DoFire_AbstractSubStepEClass = createEClass(IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP);

		iml_SelectionDivergence_DoFire_ImplicitStepEClass = createEClass(IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP);

		iml_SimultaneousConvergence_DoFireEClass = createEClass(IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE);
		createEOperation(iml_SimultaneousConvergence_DoFireEClass, IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE___GET_CALLER);

		iml_SimultaneousConvergence_DoFire_AbstractSubStepEClass = createEClass(IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP);

		iml_SimultaneousConvergence_DoFire_ImplicitStepEClass = createEClass(IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP);

		iml_SimultaneousDivergence_DoFireEClass = createEClass(IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE);
		createEOperation(iml_SimultaneousDivergence_DoFireEClass, IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE___GET_CALLER);

		iml_SimultaneousDivergence_DoFire_AbstractSubStepEClass = createEClass(IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP);

		iml_SimultaneousDivergence_DoFire_ImplicitStepEClass = createEClass(IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP);

		iml_StateTransition_DoFireEClass = createEClass(IML_STATE_TRANSITION_DO_FIRE);
		createEOperation(iml_StateTransition_DoFireEClass, IML_STATE_TRANSITION_DO_FIRE___GET_CALLER);

		iml_StateTransition_DoFire_AbstractSubStepEClass = createEClass(IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP);

		iml_StateTransition_DoFire_ImplicitStepEClass = createEClass(IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP);

		iml_State_ActivateEClass = createEClass(IML_STATE_ACTIVATE);
		createEOperation(iml_State_ActivateEClass, IML_STATE_ACTIVATE___GET_CALLER);

		iml_State_Activate_AbstractSubStepEClass = createEClass(IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP);

		iml_State_Activate_ImplicitStepEClass = createEClass(IML_STATE_ACTIVATE_IMPLICIT_STEP);

		iml_State_DeactivateEClass = createEClass(IML_STATE_DEACTIVATE);
		createEOperation(iml_State_DeactivateEClass, IML_STATE_DEACTIVATE___GET_CALLER);

		iml_State_ExecuteActivitiesEClass = createEClass(IML_STATE_EXECUTE_ACTIVITIES);
		createEOperation(iml_State_ExecuteActivitiesEClass, IML_STATE_EXECUTE_ACTIVITIES___GET_CALLER);

		iml_State_ExecuteActivities_AbstractSubStepEClass = createEClass(IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP);

		iml_State_ExecuteActivities_ImplicitStepEClass = createEClass(IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		imlTrace.States.iml.ImlPackage theImlPackage_1 = (imlTrace.States.iml.ImlPackage)EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iml_Activity_DoExecuteEClass.getESuperTypes().add(this.getIml_State_ExecuteActivities_AbstractSubStep());
		iml_Activity_DoExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		iml_Activity_DoExecuteEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		iml_Header_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_Header_ExecuteEClass.getEGenericSuperTypes().add(g1);
		iml_Header_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_Header_Execute_ImplicitStepEClass.getESuperTypes().add(this.getIml_Header_Execute_AbstractSubStep());
		iml_Header_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_SelectionConvergence_DoFire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_SelectionConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		iml_SelectionConvergence_DoFire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_SelectionConvergence_DoFire_ImplicitStepEClass.getESuperTypes().add(this.getIml_SelectionConvergence_DoFire_AbstractSubStep());
		iml_SelectionConvergence_DoFire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_SelectionDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		iml_SelectionDivergence_DoFire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_SelectionDivergence_DoFire_ImplicitStepEClass.getESuperTypes().add(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_SelectionDivergence_DoFire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_SimultaneousConvergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		iml_SimultaneousConvergence_DoFire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_SimultaneousConvergence_DoFire_ImplicitStepEClass.getESuperTypes().add(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_SimultaneousConvergence_DoFire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_SimultaneousDivergence_DoFire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_SimultaneousDivergence_DoFireEClass.getEGenericSuperTypes().add(g1);
		iml_SimultaneousDivergence_DoFire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_SimultaneousDivergence_DoFire_ImplicitStepEClass.getESuperTypes().add(this.getIml_SimultaneousDivergence_DoFire_AbstractSubStep());
		iml_SimultaneousDivergence_DoFire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_StateTransition_DoFireEClass.getEGenericSuperTypes().add(g1);
		iml_StateTransition_DoFire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_StateTransition_DoFire_ImplicitStepEClass.getESuperTypes().add(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_StateTransition_DoFire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getIml_Header_Execute_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_State_Activate_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionConvergence_DoFire_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SimultaneousDivergence_DoFire_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		iml_State_ActivateEClass.getEGenericSuperTypes().add(g1);
		iml_State_Activate_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_State_Activate_ImplicitStepEClass.getESuperTypes().add(this.getIml_State_Activate_AbstractSubStep());
		iml_State_Activate_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		iml_State_DeactivateEClass.getESuperTypes().add(this.getSpecificStep());
		iml_State_DeactivateEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		iml_State_DeactivateEClass.getESuperTypes().add(this.getIml_Header_Execute_AbstractSubStep());
		iml_State_DeactivateEClass.getESuperTypes().add(this.getIml_StateTransition_DoFire_AbstractSubStep());
		iml_State_DeactivateEClass.getESuperTypes().add(this.getIml_SimultaneousConvergence_DoFire_AbstractSubStep());
		iml_State_DeactivateEClass.getESuperTypes().add(this.getIml_SelectionDivergence_DoFire_AbstractSubStep());
		g1 = createEGenericType(this.getSpecificStep());
		iml_State_ExecuteActivitiesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getIml_State_ExecuteActivities_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		iml_State_ExecuteActivitiesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIml_State_Activate_AbstractSubStep());
		iml_State_ExecuteActivitiesEClass.getEGenericSuperTypes().add(g1);
		iml_State_ExecuteActivities_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		iml_State_ExecuteActivities_ImplicitStepEClass.getESuperTypes().add(this.getIml_State_ExecuteActivities_AbstractSubStep());
		iml_State_ExecuteActivities_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(iml_Activity_DoExecuteEClass, Iml_Activity_DoExecute.class, "Iml_Activity_DoExecute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_Activity_DoExecute__GetCaller(), theImlPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_Header_ExecuteEClass, Iml_Header_Execute.class, "Iml_Header_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_Header_Execute__GetCaller(), theImlPackage_1.getTracedHeader(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_Header_Execute_AbstractSubStepEClass, Iml_Header_Execute_AbstractSubStep.class, "Iml_Header_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_Header_Execute_ImplicitStepEClass, Iml_Header_Execute_ImplicitStep.class, "Iml_Header_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SelectionConvergence_DoFireEClass, Iml_SelectionConvergence_DoFire.class, "Iml_SelectionConvergence_DoFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_SelectionConvergence_DoFire__GetCaller(), theImlPackage_1.getTracedSelectionConvergence(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_SelectionConvergence_DoFire_AbstractSubStepEClass, Iml_SelectionConvergence_DoFire_AbstractSubStep.class, "Iml_SelectionConvergence_DoFire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SelectionConvergence_DoFire_ImplicitStepEClass, Iml_SelectionConvergence_DoFire_ImplicitStep.class, "Iml_SelectionConvergence_DoFire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SelectionDivergence_DoFireEClass, Iml_SelectionDivergence_DoFire.class, "Iml_SelectionDivergence_DoFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_SelectionDivergence_DoFire__GetCaller(), theImlPackage_1.getTracedSelectionDivergence(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_SelectionDivergence_DoFire_AbstractSubStepEClass, Iml_SelectionDivergence_DoFire_AbstractSubStep.class, "Iml_SelectionDivergence_DoFire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SelectionDivergence_DoFire_ImplicitStepEClass, Iml_SelectionDivergence_DoFire_ImplicitStep.class, "Iml_SelectionDivergence_DoFire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SimultaneousConvergence_DoFireEClass, Iml_SimultaneousConvergence_DoFire.class, "Iml_SimultaneousConvergence_DoFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_SimultaneousConvergence_DoFire__GetCaller(), theImlPackage_1.getTracedSimultaneousConvergence(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_SimultaneousConvergence_DoFire_AbstractSubStepEClass, Iml_SimultaneousConvergence_DoFire_AbstractSubStep.class, "Iml_SimultaneousConvergence_DoFire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SimultaneousConvergence_DoFire_ImplicitStepEClass, Iml_SimultaneousConvergence_DoFire_ImplicitStep.class, "Iml_SimultaneousConvergence_DoFire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SimultaneousDivergence_DoFireEClass, Iml_SimultaneousDivergence_DoFire.class, "Iml_SimultaneousDivergence_DoFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_SimultaneousDivergence_DoFire__GetCaller(), theImlPackage_1.getTracedSimultaneousDivergence(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_SimultaneousDivergence_DoFire_AbstractSubStepEClass, Iml_SimultaneousDivergence_DoFire_AbstractSubStep.class, "Iml_SimultaneousDivergence_DoFire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_SimultaneousDivergence_DoFire_ImplicitStepEClass, Iml_SimultaneousDivergence_DoFire_ImplicitStep.class, "Iml_SimultaneousDivergence_DoFire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_StateTransition_DoFireEClass, Iml_StateTransition_DoFire.class, "Iml_StateTransition_DoFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_StateTransition_DoFire__GetCaller(), theImlPackage_1.getTracedStateTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_StateTransition_DoFire_AbstractSubStepEClass, Iml_StateTransition_DoFire_AbstractSubStep.class, "Iml_StateTransition_DoFire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_StateTransition_DoFire_ImplicitStepEClass, Iml_StateTransition_DoFire_ImplicitStep.class, "Iml_StateTransition_DoFire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_State_ActivateEClass, Iml_State_Activate.class, "Iml_State_Activate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_State_Activate__GetCaller(), theImlPackage_1.getTracedState(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_State_Activate_AbstractSubStepEClass, Iml_State_Activate_AbstractSubStep.class, "Iml_State_Activate_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_State_Activate_ImplicitStepEClass, Iml_State_Activate_ImplicitStep.class, "Iml_State_Activate_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_State_DeactivateEClass, Iml_State_Deactivate.class, "Iml_State_Deactivate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_State_Deactivate__GetCaller(), theImlPackage_1.getTracedState(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_State_ExecuteActivitiesEClass, Iml_State_ExecuteActivities.class, "Iml_State_ExecuteActivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIml_State_ExecuteActivities__GetCaller(), theImlPackage_1.getTracedState(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iml_State_ExecuteActivities_AbstractSubStepEClass, Iml_State_ExecuteActivities_AbstractSubStep.class, "Iml_State_ExecuteActivities_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iml_State_ExecuteActivities_ImplicitStepEClass, Iml_State_ExecuteActivities_ImplicitStep.class, "Iml_State_ExecuteActivities_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
