/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage;

import fumlConfigurationFewStepsTrace.States.StatesPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsFactory;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.IntermediateActivitiesFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl;

import fumlConfigurationFewStepsTrace.Steps.StepsPackage;

import fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationFewStepsTrace.impl.FumlConfigurationFewStepsTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicActionsFewStepsPackageImpl extends EPackageImpl implements BasicActionsFewStepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPinActivationEClass = null;

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
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicActionsFewStepsPackageImpl() {
		super(eNS_URI, BasicActionsFewStepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicActionsFewStepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicActionsFewStepsPackage init() {
		if (isInited) return (BasicActionsFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI);

		// Obtain or create and register package
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicActionsFewStepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationFewStepsPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationFewStepsTracePackageImpl theFumlConfigurationFewStepsTracePackage = (FumlConfigurationFewStepsTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) instanceof FumlConfigurationFewStepsTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) : FumlConfigurationFewStepsTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		LociFewStepsPackageImpl theLociFewStepsPackage = (LociFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) instanceof LociFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) : LociFewStepsPackage.eINSTANCE);
		IntermediateActivitiesFewStepsPackageImpl theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) instanceof IntermediateActivitiesFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) : IntermediateActivitiesFewStepsPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicActionsFewStepsPackage.createPackageContents();
		theFumlConfigurationFewStepsTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theLociFewStepsPackage.createPackageContents();
		theIntermediateActivitiesFewStepsPackage.createPackageContents();

		// Initialize created meta-data
		theBasicActionsFewStepsPackage.initializePackageContents();
		theFumlConfigurationFewStepsTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theLociFewStepsPackage.initializePackageContents();
		theIntermediateActivitiesFewStepsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicActionsFewStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicActionsFewStepsPackage.eNS_URI, theBasicActionsFewStepsPackage);
		return theBasicActionsFewStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActionActivation() {
		return tracedActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActionActivation_FiringSequence() {
		return (EReference)tracedActionActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPinActivation() {
		return tracedPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsFewStepsFactory getBasicActionsFewStepsFactory() {
		return (BasicActionsFewStepsFactory)getEFactoryInstance();
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
		tracedActionActivationEClass = createEClass(TRACED_ACTION_ACTIVATION);
		createEReference(tracedActionActivationEClass, TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE);

		tracedPinActivationEClass = createEClass(TRACED_PIN_ACTIVATION);
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
		IntermediateActivitiesFewStepsPackage theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		LociFewStepsPackage theLociFewStepsPackage = (LociFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActionActivationEClass.getESuperTypes().add(theIntermediateActivitiesFewStepsPackage.getTracedActivityNodeActivation());
		tracedPinActivationEClass.getESuperTypes().add(theLociFewStepsPackage.getTracedSemanticVisitor());
		tracedPinActivationEClass.getESuperTypes().add(theIntermediateActivitiesFewStepsPackage.getTracedActivityNodeActivation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedActionActivationEClass, TracedActionActivation.class, "TracedActionActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActionActivation_FiringSequence(), theStatesPackage.getActionActivation_firing_Value(), theStatesPackage.getActionActivation_firing_Value_Parent(), "firingSequence", null, 0, -1, TracedActionActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedPinActivationEClass, TracedPinActivation.class, "TracedPinActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BasicActionsFewStepsPackageImpl
