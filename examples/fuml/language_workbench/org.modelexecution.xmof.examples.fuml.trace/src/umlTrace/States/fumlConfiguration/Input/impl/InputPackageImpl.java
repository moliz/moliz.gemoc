/**
 */
package umlTrace.States.fumlConfiguration.Input.impl;

import fumlConfiguration.FumlConfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import umlTrace.States.StatesPackage;

import umlTrace.States.ecore.EcorePackage;

import umlTrace.States.ecore.impl.EcorePackageImpl;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import umlTrace.States.fumlConfiguration.Input.InputFactory;
import umlTrace.States.fumlConfiguration.Input.InputPackage;
import umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;

import umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import umlTrace.States.impl.StatesPackageImpl;

import umlTrace.States.uml.UmlPackage;

import umlTrace.States.uml.impl.UmlPackageImpl;

import umlTrace.Steps.StepsPackage;

import umlTrace.Steps.impl.StepsPackageImpl;

import umlTrace.UmlTracePackage;

import umlTrace.impl.UmlTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputPackageImpl extends EPackageImpl implements InputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInputParameterValuesEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.Input.InputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InputPackageImpl() {
		super(eNS_URI, InputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InputPackage init() {
		if (isInited) return (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);

		// Obtain or create and register package
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) : UmlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theInputPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theLociPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theInputPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theLociPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InputPackage.eNS_URI, theInputPackage);
		return theInputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInputParameterValues() {
		return tracedInputParameterValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputParameterValues_NameSequence() {
		return (EReference)tracedInputParameterValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputParameterValues_OriginalObject() {
		return (EReference)tracedInputParameterValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputParameterValues_ParameterValuesSequence() {
		return (EReference)tracedInputParameterValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFactory getInputFactory() {
		return (InputFactory)getEFactoryInstance();
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
		tracedInputParameterValuesEClass = createEClass(TRACED_INPUT_PARAMETER_VALUES);
		createEReference(tracedInputParameterValuesEClass, TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE);
		createEReference(tracedInputParameterValuesEClass, TRACED_INPUT_PARAMETER_VALUES__ORIGINAL_OBJECT);
		createEReference(tracedInputParameterValuesEClass, TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		fumlConfiguration.Input.InputPackage theInputPackage_1 = (fumlConfiguration.Input.InputPackage)EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.Input.InputPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedInputParameterValuesEClass, TracedInputParameterValues.class, "TracedInputParameterValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInputParameterValues_NameSequence(), theStatesPackage.getInputParameterValues_name_Value(), theStatesPackage.getInputParameterValues_name_Value_Parent(), "nameSequence", null, 0, -1, TracedInputParameterValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInputParameterValues_OriginalObject(), theInputPackage_1.getInputParameterValues(), null, "originalObject", null, 0, 1, TracedInputParameterValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInputParameterValues_ParameterValuesSequence(), theStatesPackage.getInputParameterValues_parameterValues_Value(), theStatesPackage.getInputParameterValues_parameterValues_Value_Parent(), "parameterValuesSequence", null, 0, -1, TracedInputParameterValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (tracedInputParameterValuesEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Input/InputParameterValues"
		   });
	}

} //InputPackageImpl
