/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

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

import umlTrace.States.fumlConfiguration.Input.InputPackage;

import umlTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import umlTrace.States.fumlConfiguration.Loci.LociFactory;
import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutor;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;
import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

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
public class LociPackageImpl extends EPackageImpl implements LociPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLocusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSemanticVisitorEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LociPackageImpl() {
		super(eNS_URI, LociFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LociPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LociPackage init() {
		if (isInited) return (LociPackage)EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI);

		// Obtain or create and register package
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LociPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) : UmlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theLociPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theLociPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLociPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LociPackage.eNS_URI, theLociPackage);
		return theLociPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutionEnvironment() {
		return tracedExecutionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence() {
		return (EReference)tracedExecutionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionEnvironment_OriginalObject() {
		return (EReference)tracedExecutionEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutionFactory() {
		return tracedExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionFactory_BuiltInTypesSequence() {
		return (EReference)tracedExecutionFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionFactory_Locus_ExecutionFactorySequence() {
		return (EReference)tracedExecutionFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionFactory_OriginalObject() {
		return (EReference)tracedExecutionFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence() {
		return (EReference)tracedExecutionFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutor() {
		return tracedExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutor_Locus_ExecutorSequence() {
		return (EReference)tracedExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecutor_OriginalObject() {
		return (EReference)tracedExecutorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLocus() {
		return tracedLocusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLocus_ExecutorSequence() {
		return (EReference)tracedLocusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLocus_ExtensionalValuesSequence() {
		return (EReference)tracedLocusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLocus_FactorySequence() {
		return (EReference)tracedLocusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLocus_OriginalObject() {
		return (EReference)tracedLocusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSemanticVisitor() {
		return tracedSemanticVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSemanticVisitor_OriginalObject_SemanticVisitor() {
		return (EReference)tracedSemanticVisitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSemanticVisitor_RuntimeModelElementSequence() {
		return (EReference)tracedSemanticVisitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociFactory getLociFactory() {
		return (LociFactory)getEFactoryInstance();
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
		tracedExecutionEnvironmentEClass = createEClass(TRACED_EXECUTION_ENVIRONMENT);
		createEReference(tracedExecutionEnvironmentEClass, TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE);
		createEReference(tracedExecutionEnvironmentEClass, TRACED_EXECUTION_ENVIRONMENT__ORIGINAL_OBJECT);

		tracedExecutionFactoryEClass = createEClass(TRACED_EXECUTION_FACTORY);
		createEReference(tracedExecutionFactoryEClass, TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE);
		createEReference(tracedExecutionFactoryEClass, TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE);
		createEReference(tracedExecutionFactoryEClass, TRACED_EXECUTION_FACTORY__ORIGINAL_OBJECT);
		createEReference(tracedExecutionFactoryEClass, TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE);

		tracedExecutorEClass = createEClass(TRACED_EXECUTOR);
		createEReference(tracedExecutorEClass, TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE);
		createEReference(tracedExecutorEClass, TRACED_EXECUTOR__ORIGINAL_OBJECT);

		tracedLocusEClass = createEClass(TRACED_LOCUS);
		createEReference(tracedLocusEClass, TRACED_LOCUS__EXECUTOR_SEQUENCE);
		createEReference(tracedLocusEClass, TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE);
		createEReference(tracedLocusEClass, TRACED_LOCUS__FACTORY_SEQUENCE);
		createEReference(tracedLocusEClass, TRACED_LOCUS__ORIGINAL_OBJECT);

		tracedSemanticVisitorEClass = createEClass(TRACED_SEMANTIC_VISITOR);
		createEReference(tracedSemanticVisitorEClass, TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR);
		createEReference(tracedSemanticVisitorEClass, TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE);
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
		fumlConfiguration.Loci.LociPackage theLociPackage_1 = (fumlConfiguration.Loci.LociPackage)EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.Loci.LociPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedExecutionEnvironmentEClass, TracedExecutionEnvironment.class, "TracedExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence(), theStatesPackage.getExecutionEnvironment_locus_ExecutionEnvironment_Value(), theStatesPackage.getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent(), "locus_ExecutionEnvironmentSequence", null, 0, -1, TracedExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecutionEnvironment_OriginalObject(), theLociPackage_1.getExecutionEnvironment(), null, "originalObject", null, 0, 1, TracedExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExecutionFactoryEClass, TracedExecutionFactory.class, "TracedExecutionFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedExecutionFactory_BuiltInTypesSequence(), theStatesPackage.getExecutionFactory_builtInTypes_Value(), theStatesPackage.getExecutionFactory_builtInTypes_Value_Parent(), "builtInTypesSequence", null, 0, -1, TracedExecutionFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecutionFactory_Locus_ExecutionFactorySequence(), theStatesPackage.getExecutionFactory_locus_ExecutionFactory_Value(), theStatesPackage.getExecutionFactory_locus_ExecutionFactory_Value_Parent(), "locus_ExecutionFactorySequence", null, 0, -1, TracedExecutionFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecutionFactory_OriginalObject(), theLociPackage_1.getExecutionFactory(), null, "originalObject", null, 0, 1, TracedExecutionFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence(), theStatesPackage.getExecutionFactory_primitiveBehaviorPrototypes_Value(), theStatesPackage.getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent(), "primitiveBehaviorPrototypesSequence", null, 0, -1, TracedExecutionFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExecutorEClass, TracedExecutor.class, "TracedExecutor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedExecutor_Locus_ExecutorSequence(), theStatesPackage.getExecutor_locus_Executor_Value(), theStatesPackage.getExecutor_locus_Executor_Value_Parent(), "locus_ExecutorSequence", null, 0, -1, TracedExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecutor_OriginalObject(), theLociPackage_1.getExecutor(), null, "originalObject", null, 0, 1, TracedExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedLocusEClass, TracedLocus.class, "TracedLocus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedLocus_ExecutorSequence(), theStatesPackage.getLocus_executor_Value(), theStatesPackage.getLocus_executor_Value_Parent(), "executorSequence", null, 0, -1, TracedLocus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedLocus_ExtensionalValuesSequence(), theStatesPackage.getLocus_extensionalValues_Value(), theStatesPackage.getLocus_extensionalValues_Value_Parent(), "extensionalValuesSequence", null, 0, -1, TracedLocus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedLocus_FactorySequence(), theStatesPackage.getLocus_factory_Value(), theStatesPackage.getLocus_factory_Value_Parent(), "factorySequence", null, 0, -1, TracedLocus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedLocus_OriginalObject(), theLociPackage_1.getLocus(), null, "originalObject", null, 0, 1, TracedLocus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSemanticVisitorEClass, TracedSemanticVisitor.class, "TracedSemanticVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSemanticVisitor_OriginalObject_SemanticVisitor(), theLociPackage_1.getSemanticVisitor(), null, "originalObject_SemanticVisitor", null, 0, 1, TracedSemanticVisitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedSemanticVisitor_RuntimeModelElementSequence(), theStatesPackage.getSemanticVisitor_runtimeModelElement_Value(), theStatesPackage.getSemanticVisitor_runtimeModelElement_Value_Parent(), "runtimeModelElementSequence", null, 0, -1, TracedSemanticVisitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (tracedExecutionEnvironmentEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionEnvironment"
		   });	
		addAnnotation
		  (tracedExecutionFactoryEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory"
		   });	
		addAnnotation
		  (tracedExecutorEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Executor"
		   });	
		addAnnotation
		  (tracedLocusEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus"
		   });	
		addAnnotation
		  (tracedSemanticVisitorEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/SemanticVisitor"
		   });
	}

} //LociPackageImpl
