/**
 */
package fsmConfigurationTrace.States.fsmConfiguration.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmConfigurationTrace.FsmConfigurationTracePackage;

import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmPackage;

import fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl;

import fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationFactory;
import fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage;
import fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration;
import fsmConfigurationTrace.States.fsmConfiguration.TracedInput;

import fsmConfigurationTrace.States.impl.StatesPackageImpl;

import fsmConfigurationTrace.Steps.StepsPackage;

import fsmConfigurationTrace.Steps.impl.StepsPackageImpl;

import fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmConfigurationPackageImpl extends EPackageImpl implements FsmConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFSMConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInputEClass = null;

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
	 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmConfigurationPackageImpl() {
		super(eNS_URI, FsmConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FsmConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmConfigurationPackage init() {
		if (isInited) return (FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		FsmConfigurationPackageImpl theFsmConfigurationPackage = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		fsmConfiguration.FsmConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmConfigurationTracePackageImpl theFsmConfigurationTracePackage = (FsmConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) instanceof FsmConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) : FsmConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmConfigurationPackage.createPackageContents();
		theFsmConfigurationTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmPackage.createPackageContents();

		// Initialize created meta-data
		theFsmConfigurationPackage.initializePackageContents();
		theFsmConfigurationTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmConfigurationPackage.eNS_URI, theFsmConfigurationPackage);
		return theFsmConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFSMConfiguration() {
		return tracedFSMConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFSMConfiguration_FSMConfiguration_acceptedSequence_Dimension() {
		return (EReference)tracedFSMConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFSMConfiguration_FSMConfiguration_currentState_Dimension() {
		return (EReference)tracedFSMConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFSMConfiguration_FSMConfiguration_producedSequence_Dimension() {
		return (EReference)tracedFSMConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInput() {
		return tracedInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInput_Input_stringSeq_Dimension() {
		return (EReference)tracedInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInput_OriginalObject() {
		return (EReference)tracedInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationFactory getFsmConfigurationFactory() {
		return (FsmConfigurationFactory)getEFactoryInstance();
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
		tracedFSMConfigurationEClass = createEClass(TRACED_FSM_CONFIGURATION);
		createEReference(tracedFSMConfigurationEClass, TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION);
		createEReference(tracedFSMConfigurationEClass, TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION);
		createEReference(tracedFSMConfigurationEClass, TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION);

		tracedInputEClass = createEClass(TRACED_INPUT);
		createEReference(tracedInputEClass, TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION);
		createEReference(tracedInputEClass, TRACED_INPUT__ORIGINAL_OBJECT);
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
		FsmPackage theFsmPackage = (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		fsmConfiguration.FsmConfigurationPackage theFsmConfigurationPackage_1 = (fsmConfiguration.FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(fsmConfiguration.FsmConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedFSMConfigurationEClass.getESuperTypes().add(theFsmPackage.getTracedFSM());
		EGenericType g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedInputEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(tracedFSMConfigurationEClass, TracedFSMConfiguration.class, "TracedFSMConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFSMConfiguration_FSMConfiguration_acceptedSequence_Dimension(), theStatesPackage.getFSMConfiguration_acceptedSequence_Dimension(), null, "fSMConfiguration_acceptedSequence_Dimension", null, 0, 1, TracedFSMConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFSMConfiguration_FSMConfiguration_currentState_Dimension(), theStatesPackage.getFSMConfiguration_currentState_Dimension(), null, "fSMConfiguration_currentState_Dimension", null, 0, 1, TracedFSMConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFSMConfiguration_FSMConfiguration_producedSequence_Dimension(), theStatesPackage.getFSMConfiguration_producedSequence_Dimension(), null, "fSMConfiguration_producedSequence_Dimension", null, 0, 1, TracedFSMConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tracedFSMConfigurationEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInputEClass, TracedInput.class, "TracedInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInput_Input_stringSeq_Dimension(), theStatesPackage.getInput_stringSeq_Dimension(), null, "input_stringSeq_Dimension", null, 0, 1, TracedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInput_OriginalObject(), theFsmConfigurationPackage_1.getInput(), null, "originalObject", null, 0, 1, TracedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedInputEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //FsmConfigurationPackageImpl
