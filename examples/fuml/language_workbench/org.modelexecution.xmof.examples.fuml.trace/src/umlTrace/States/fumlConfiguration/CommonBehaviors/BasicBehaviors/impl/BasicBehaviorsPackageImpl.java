/**
 */
package umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl;

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

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import umlTrace.States.fumlConfiguration.Input.InputPackage;

import umlTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

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
public class BasicBehaviorsPackageImpl extends EPackageImpl implements BasicBehaviorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOpaqueBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedParameterValueEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicBehaviorsPackageImpl() {
		super(eNS_URI, BasicBehaviorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicBehaviorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicBehaviorsPackage init() {
		if (isInited) return (BasicBehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI);

		// Obtain or create and register package
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicBehaviorsPackageImpl());

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
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theBasicBehaviorsPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theLociPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theBasicBehaviorsPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theLociPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicBehaviorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicBehaviorsPackage.eNS_URI, theBasicBehaviorsPackage);
		return theBasicBehaviorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecution() {
		return tracedExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecution_ContextSequence() {
		return (EReference)tracedExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExecution_ParameterValuesSequence() {
		return (EReference)tracedExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOpaqueBehaviorExecution() {
		return tracedOpaqueBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedParameterValue() {
		return tracedParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedParameterValue_OriginalObject() {
		return (EReference)tracedParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedParameterValue_Parameter_ParameterValueSequence() {
		return (EReference)tracedParameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedParameterValue_Values_ParameterValueSequence() {
		return (EReference)tracedParameterValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsFactory getBasicBehaviorsFactory() {
		return (BasicBehaviorsFactory)getEFactoryInstance();
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
		tracedExecutionEClass = createEClass(TRACED_EXECUTION);
		createEReference(tracedExecutionEClass, TRACED_EXECUTION__CONTEXT_SEQUENCE);
		createEReference(tracedExecutionEClass, TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE);

		tracedOpaqueBehaviorExecutionEClass = createEClass(TRACED_OPAQUE_BEHAVIOR_EXECUTION);

		tracedParameterValueEClass = createEClass(TRACED_PARAMETER_VALUE);
		createEReference(tracedParameterValueEClass, TRACED_PARAMETER_VALUE__ORIGINAL_OBJECT);
		createEReference(tracedParameterValueEClass, TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE);
		createEReference(tracedParameterValueEClass, TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE);
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
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage theBasicBehaviorsPackage_1 = (fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedExecutionEClass.getESuperTypes().add(theKernelPackage.getTracedObject());
		tracedOpaqueBehaviorExecutionEClass.getESuperTypes().add(this.getTracedExecution());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedExecutionEClass, TracedExecution.class, "TracedExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedExecution_ContextSequence(), theStatesPackage.getExecution_context_Value(), theStatesPackage.getExecution_context_Value_Parent(), "contextSequence", null, 0, -1, TracedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedExecution_ParameterValuesSequence(), theStatesPackage.getExecution_parameterValues_Value(), theStatesPackage.getExecution_parameterValues_Value_Parent(), "parameterValuesSequence", null, 0, -1, TracedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOpaqueBehaviorExecutionEClass, TracedOpaqueBehaviorExecution.class, "TracedOpaqueBehaviorExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedParameterValueEClass, TracedParameterValue.class, "TracedParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedParameterValue_OriginalObject(), theBasicBehaviorsPackage_1.getParameterValue(), null, "originalObject", null, 0, 1, TracedParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedParameterValue_Parameter_ParameterValueSequence(), theStatesPackage.getParameterValue_parameter_ParameterValue_Value(), theStatesPackage.getParameterValue_parameter_ParameterValue_Value_Parent(), "parameter_ParameterValueSequence", null, 0, -1, TracedParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedParameterValue_Values_ParameterValueSequence(), theStatesPackage.getParameterValue_values_ParameterValue_Value(), theStatesPackage.getParameterValue_values_ParameterValue_Value_Parent(), "values_ParameterValueSequence", null, 0, -1, TracedParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (tracedExecutionEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/Execution"
		   });	
		addAnnotation
		  (tracedParameterValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/ParameterValue"
		   });
	}

} //BasicBehaviorsPackageImpl
