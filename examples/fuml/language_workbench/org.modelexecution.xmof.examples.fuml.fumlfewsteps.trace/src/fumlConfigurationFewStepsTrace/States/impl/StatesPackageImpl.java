/**
 */
package fumlConfigurationFewStepsTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage;

import fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value;
import fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationFewStepsTrace.States.State;
import fumlConfigurationFewStepsTrace.States.StatesFactory;
import fumlConfigurationFewStepsTrace.States.StatesPackage;
import fumlConfigurationFewStepsTrace.States.Value;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.IntermediateActivitiesFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.Steps.StepsPackage;

import fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationFewStepsTrace.impl.FumlConfigurationFewStepsTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionActivation_firing_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticVisitor_runtimeModelElement_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	 * @see fumlConfigurationFewStepsTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationFewStepsPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationFewStepsTracePackageImpl theFumlConfigurationFewStepsTracePackage = (FumlConfigurationFewStepsTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) instanceof FumlConfigurationFewStepsTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) : FumlConfigurationFewStepsTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		LociFewStepsPackageImpl theLociFewStepsPackage = (LociFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) instanceof LociFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) : LociFewStepsPackage.eINSTANCE);
		IntermediateActivitiesFewStepsPackageImpl theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) instanceof IntermediateActivitiesFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) : IntermediateActivitiesFewStepsPackage.eINSTANCE);
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) : BasicActionsFewStepsPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theFumlConfigurationFewStepsTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theLociFewStepsPackage.createPackageContents();
		theIntermediateActivitiesFewStepsPackage.createPackageContents();
		theBasicActionsFewStepsPackage.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theFumlConfigurationFewStepsTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theLociFewStepsPackage.initializePackageContents();
		theIntermediateActivitiesFewStepsPackage.initializePackageContents();
		theBasicActionsFewStepsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionActivation_firing_Value() {
		return actionActivation_firing_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionActivation_firing_Value_Firing() {
		return (EAttribute)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_Parent() {
		return (EReference)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_States() {
		return (EReference)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation_firing_Value__GetStatesNoOpposite() {
		return actionActivation_firing_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticVisitor_runtimeModelElement_Value() {
		return semanticVisitor_runtimeModelElement_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_Parent() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_States() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite() {
		return semanticVisitor_runtimeModelElement_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionActivation_firing_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_SemanticVisitor_runtimeModelElement_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		actionActivation_firing_ValueEClass = createEClass(ACTION_ACTIVATION_FIRING_VALUE);
		createEAttribute(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__FIRING);
		createEReference(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__PARENT);
		createEReference(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__STATES);
		createEOperation(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE);

		semanticVisitor_runtimeModelElement_ValueEClass = createEClass(SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES);
		createEOperation(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTION_ACTIVATION_FIRING_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);
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
		LociFewStepsPackage theLociFewStepsPackage = (LociFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI);
		IntermediateActivitiesFewStepsPackage theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI);
		BasicActionsFewStepsPackage theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI);
		FumlConfigurationFewStepsPackage theFumlConfigurationFewStepsPackage = (FumlConfigurationFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLociFewStepsPackage);
		getESubpackages().add(theIntermediateActivitiesFewStepsPackage);
		getESubpackages().add(theBasicActionsFewStepsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionActivation_firing_ValueEClass.getESuperTypes().add(this.getValue());
		semanticVisitor_runtimeModelElement_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionActivation_firing_ValueEClass, ActionActivation_firing_Value.class, "ActionActivation_firing_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionActivation_firing_Value_Firing(), ecorePackage.getEBoolean(), "firing", null, 1, 1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_firing_Value_Parent(), theBasicActionsFewStepsPackage.getTracedActionActivation(), theBasicActionsFewStepsPackage.getTracedActionActivation_FiringSequence(), "parent", null, 1, 1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_firing_Value_States(), this.getState(), this.getState_ActionActivation_firing_Values(), "states", null, 1, -1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionActivation_firing_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(semanticVisitor_runtimeModelElement_ValueEClass, SemanticVisitor_runtimeModelElement_Value.class, "SemanticVisitor_runtimeModelElement_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_Parent(), theLociFewStepsPackage.getTracedSemanticVisitor(), theLociFewStepsPackage.getTracedSemanticVisitor_RuntimeModelElementSequence(), "parent", null, 1, 1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement(), theFumlConfigurationFewStepsPackage.getElementConfiguration(), null, "runtimeModelElement", null, 0, 1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_States(), this.getState(), this.getState_SemanticVisitor_runtimeModelElement_Values(), "states", null, 1, -1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_ActionActivation_firing_Values(), this.getActionActivation_firing_Value(), this.getActionActivation_firing_Value_States(), "actionActivation_firing_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_SemanticVisitor_runtimeModelElement_Values(), this.getSemanticVisitor_runtimeModelElement_Value(), this.getSemanticVisitor_runtimeModelElement_Value_States(), "semanticVisitor_runtimeModelElement_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (actionActivation_firing_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//ActionsFewSteps/BasicActionsFewSteps/ActionActivation/firing"
		   });	
		addAnnotation
		  (getActionActivation_firing_Value_Firing(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//ActionsFewSteps/BasicActionsFewSteps/ActionActivation/firing"
		   });	
		addAnnotation
		  (semanticVisitor_runtimeModelElement_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//LociFewSteps/SemanticVisitor/runtimeModelElement"
		   });	
		addAnnotation
		  (getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//LociFewSteps/SemanticVisitor/runtimeModelElement"
		   });
	}

} //StatesPackageImpl
