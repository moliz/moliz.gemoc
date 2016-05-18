/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.impl;

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

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory;
import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

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
public class KernelPackageImpl extends EPackageImpl implements KernelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCompoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExtensionalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFeatureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPrimitiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuredValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValueEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KernelPackageImpl() {
		super(eNS_URI, KernelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KernelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KernelPackage init() {
		if (isInited) return (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);

		// Obtain or create and register package
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KernelPackageImpl());

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
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theKernelPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theLociPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theKernelPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theLociPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKernelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KernelPackage.eNS_URI, theKernelPackage);
		return theKernelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanValue() {
		return tracedBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanValue_Value_BooleanValueSequence() {
		return (EReference)tracedBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCompoundValue() {
		return tracedCompoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedCompoundValue_FeatureValuesSequence() {
		return (EReference)tracedCompoundValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEvaluation() {
		return tracedEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedEvaluation_Locus_EvaluationSequence() {
		return (EReference)tracedEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedEvaluation_Specification_EvaluationSequence() {
		return (EReference)tracedEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExtensionalValue() {
		return tracedExtensionalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedExtensionalValue_Locus_ExtensionalValueSequence() {
		return (EReference)tracedExtensionalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFeatureValue() {
		return tracedFeatureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFeatureValue_FeatureSequence() {
		return (EReference)tracedFeatureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFeatureValue_PositionSequence() {
		return (EReference)tracedFeatureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFeatureValue_Values_FeatureValueSequence() {
		return (EReference)tracedFeatureValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerValue() {
		return tracedIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerValue_Value_IntegerValueSequence() {
		return (EReference)tracedIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObject() {
		return tracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObject_TypesSequence() {
		return (EReference)tracedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPrimitiveValue() {
		return tracedPrimitiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPrimitiveValue_TypeSequence() {
		return (EReference)tracedPrimitiveValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReference() {
		return tracedReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedReference_ReferentSequence() {
		return (EReference)tracedReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuredValue() {
		return tracedStructuredValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValue() {
		return tracedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFactory getKernelFactory() {
		return (KernelFactory)getEFactoryInstance();
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
		tracedBooleanValueEClass = createEClass(TRACED_BOOLEAN_VALUE);
		createEReference(tracedBooleanValueEClass, TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE);

		tracedCompoundValueEClass = createEClass(TRACED_COMPOUND_VALUE);
		createEReference(tracedCompoundValueEClass, TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE);

		tracedEvaluationEClass = createEClass(TRACED_EVALUATION);
		createEReference(tracedEvaluationEClass, TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE);
		createEReference(tracedEvaluationEClass, TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE);

		tracedExtensionalValueEClass = createEClass(TRACED_EXTENSIONAL_VALUE);
		createEReference(tracedExtensionalValueEClass, TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE);

		tracedFeatureValueEClass = createEClass(TRACED_FEATURE_VALUE);
		createEReference(tracedFeatureValueEClass, TRACED_FEATURE_VALUE__FEATURE_SEQUENCE);
		createEReference(tracedFeatureValueEClass, TRACED_FEATURE_VALUE__POSITION_SEQUENCE);
		createEReference(tracedFeatureValueEClass, TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE);

		tracedIntegerValueEClass = createEClass(TRACED_INTEGER_VALUE);
		createEReference(tracedIntegerValueEClass, TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE);

		tracedObjectEClass = createEClass(TRACED_OBJECT);
		createEReference(tracedObjectEClass, TRACED_OBJECT__TYPES_SEQUENCE);

		tracedPrimitiveValueEClass = createEClass(TRACED_PRIMITIVE_VALUE);
		createEReference(tracedPrimitiveValueEClass, TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE);

		tracedReferenceEClass = createEClass(TRACED_REFERENCE);
		createEReference(tracedReferenceEClass, TRACED_REFERENCE__REFERENT_SEQUENCE);

		tracedStructuredValueEClass = createEClass(TRACED_STRUCTURED_VALUE);

		tracedValueEClass = createEClass(TRACED_VALUE);
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
		LociPackage theLociPackage = (LociPackage)EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedPrimitiveValue());
		tracedCompoundValueEClass.getESuperTypes().add(this.getTracedStructuredValue());
		tracedEvaluationEClass.getESuperTypes().add(theLociPackage.getTracedSemanticVisitor());
		tracedExtensionalValueEClass.getESuperTypes().add(this.getTracedCompoundValue());
		tracedIntegerValueEClass.getESuperTypes().add(this.getTracedPrimitiveValue());
		tracedObjectEClass.getESuperTypes().add(this.getTracedExtensionalValue());
		tracedPrimitiveValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedReferenceEClass.getESuperTypes().add(this.getTracedStructuredValue());
		tracedStructuredValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedValueEClass.getESuperTypes().add(theLociPackage.getTracedSemanticVisitor());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedBooleanValueEClass, TracedBooleanValue.class, "TracedBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanValue_Value_BooleanValueSequence(), theStatesPackage.getBooleanValue_value_BooleanValue_Value(), theStatesPackage.getBooleanValue_value_BooleanValue_Value_Parent(), "value_BooleanValueSequence", null, 0, -1, TracedBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedCompoundValueEClass, TracedCompoundValue.class, "TracedCompoundValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedCompoundValue_FeatureValuesSequence(), theStatesPackage.getCompoundValue_featureValues_Value(), theStatesPackage.getCompoundValue_featureValues_Value_Parent(), "featureValuesSequence", null, 0, -1, TracedCompoundValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedEvaluationEClass, TracedEvaluation.class, "TracedEvaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedEvaluation_Locus_EvaluationSequence(), theStatesPackage.getEvaluation_locus_Evaluation_Value(), theStatesPackage.getEvaluation_locus_Evaluation_Value_Parent(), "locus_EvaluationSequence", null, 0, -1, TracedEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedEvaluation_Specification_EvaluationSequence(), theStatesPackage.getEvaluation_specification_Evaluation_Value(), theStatesPackage.getEvaluation_specification_Evaluation_Value_Parent(), "specification_EvaluationSequence", null, 0, -1, TracedEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExtensionalValueEClass, TracedExtensionalValue.class, "TracedExtensionalValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedExtensionalValue_Locus_ExtensionalValueSequence(), theStatesPackage.getExtensionalValue_locus_ExtensionalValue_Value(), theStatesPackage.getExtensionalValue_locus_ExtensionalValue_Value_Parent(), "locus_ExtensionalValueSequence", null, 0, -1, TracedExtensionalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedFeatureValueEClass, TracedFeatureValue.class, "TracedFeatureValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFeatureValue_FeatureSequence(), theStatesPackage.getFeatureValue_feature_Value(), theStatesPackage.getFeatureValue_feature_Value_Parent(), "featureSequence", null, 0, -1, TracedFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFeatureValue_PositionSequence(), theStatesPackage.getFeatureValue_position_Value(), theStatesPackage.getFeatureValue_position_Value_Parent(), "positionSequence", null, 0, -1, TracedFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedFeatureValue_Values_FeatureValueSequence(), theStatesPackage.getFeatureValue_values_FeatureValue_Value(), theStatesPackage.getFeatureValue_values_FeatureValue_Value_Parent(), "values_FeatureValueSequence", null, 0, -1, TracedFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerValueEClass, TracedIntegerValue.class, "TracedIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerValue_Value_IntegerValueSequence(), theStatesPackage.getIntegerValue_value_IntegerValue_Value(), theStatesPackage.getIntegerValue_value_IntegerValue_Value_Parent(), "value_IntegerValueSequence", null, 0, -1, TracedIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedObjectEClass, TracedObject.class, "TracedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObject_TypesSequence(), theStatesPackage.getObject_types_Value(), theStatesPackage.getObject_types_Value_Parent(), "typesSequence", null, 0, -1, TracedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedPrimitiveValueEClass, TracedPrimitiveValue.class, "TracedPrimitiveValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPrimitiveValue_TypeSequence(), theStatesPackage.getPrimitiveValue_type_Value(), theStatesPackage.getPrimitiveValue_type_Value_Parent(), "typeSequence", null, 0, -1, TracedPrimitiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedReferenceEClass, TracedReference.class, "TracedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedReference_ReferentSequence(), theStatesPackage.getReference_referent_Value(), theStatesPackage.getReference_referent_Value_Parent(), "referentSequence", null, 0, -1, TracedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedStructuredValueEClass, TracedStructuredValue.class, "TracedStructuredValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedValueEClass, TracedValue.class, "TracedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (tracedBooleanValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/BooleanValue"
		   });	
		addAnnotation
		  (tracedCompoundValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/CompoundValue"
		   });	
		addAnnotation
		  (tracedEvaluationEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Evaluation"
		   });	
		addAnnotation
		  (tracedExtensionalValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/ExtensionalValue"
		   });	
		addAnnotation
		  (tracedFeatureValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue"
		   });	
		addAnnotation
		  (tracedIntegerValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/IntegerValue"
		   });	
		addAnnotation
		  (tracedObjectEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Object"
		   });	
		addAnnotation
		  (tracedPrimitiveValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/PrimitiveValue"
		   });	
		addAnnotation
		  (tracedReferenceEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Reference"
		   });
	}

} //KernelPackageImpl
