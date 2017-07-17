/**
 */
package fsmConfigurationTrace.States.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fsmConfiguration.FsmConfigurationPackage;

import fsmConfigurationTrace.FsmConfigurationTracePackage;

import fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value;
import fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_currentState_Value;
import fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value;
import fsmConfigurationTrace.States.Input_stringSeq_Dimension;
import fsmConfigurationTrace.States.Input_stringSeq_Value;
import fsmConfigurationTrace.States.SpecificAttributeValue;
import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificReferenceValue;
import fsmConfigurationTrace.States.SpecificState;
import fsmConfigurationTrace.States.SpecificTracedObject;
import fsmConfigurationTrace.States.SpecificValue;
import fsmConfigurationTrace.States.StatesFactory;
import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmPackage;

import fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl;

import fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl;

import fsmConfigurationTrace.Steps.StepsPackage;

import fsmConfigurationTrace.Steps.impl.StepsPackageImpl;

import fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

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
	private EClass fsmConfiguration_acceptedSequence_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_acceptedSequence_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_currentState_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_currentState_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_producedSequence_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_producedSequence_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass input_stringSeq_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass input_stringSeq_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificValueEClass = null;

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
	 * @see fsmConfigurationTrace.States.StatesPackage#eNS_URI
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
		TracePackage.eINSTANCE.eClass();
		FsmConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmConfigurationTracePackageImpl theFsmConfigurationTracePackage = (FsmConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) instanceof FsmConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) : FsmConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);
		FsmConfigurationPackageImpl theFsmConfigurationPackage_1 = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) : fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theFsmConfigurationTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theFsmPackage.createPackageContents();
		theFsmConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theFsmConfigurationTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theFsmPackage.initializePackageContents();
		theFsmConfigurationPackage_1.initializePackageContents();

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
	public EClass getFSMConfiguration_acceptedSequence_Dimension() {
		return fsmConfiguration_acceptedSequence_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration_acceptedSequence_Value() {
		return fsmConfiguration_acceptedSequence_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMConfiguration_acceptedSequence_Value_AcceptedSequence() {
		return (EAttribute)fsmConfiguration_acceptedSequence_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration_currentState_Dimension() {
		return fsmConfiguration_currentState_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration_currentState_Value() {
		return fsmConfiguration_currentState_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSMConfiguration_currentState_Value_CurrentState() {
		return (EReference)fsmConfiguration_currentState_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration_producedSequence_Dimension() {
		return fsmConfiguration_producedSequence_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration_producedSequence_Value() {
		return fsmConfiguration_producedSequence_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMConfiguration_producedSequence_Value_ProducedSequence() {
		return (EAttribute)fsmConfiguration_producedSequence_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput_stringSeq_Dimension() {
		return input_stringSeq_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput_stringSeq_Value() {
		return input_stringSeq_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_stringSeq_Value_StringSeq() {
		return (EAttribute)input_stringSeq_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificAttributeValue() {
		return specificAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDimension() {
		return specificDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificReferenceValue() {
		return specificReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificState() {
		return specificStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTracedObject() {
		return specificTracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificValue() {
		return specificValueEClass;
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
		fsmConfiguration_acceptedSequence_DimensionEClass = createEClass(FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION);

		fsmConfiguration_acceptedSequence_ValueEClass = createEClass(FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE);
		createEAttribute(fsmConfiguration_acceptedSequence_ValueEClass, FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE);

		fsmConfiguration_currentState_DimensionEClass = createEClass(FSM_CONFIGURATION_CURRENT_STATE_DIMENSION);

		fsmConfiguration_currentState_ValueEClass = createEClass(FSM_CONFIGURATION_CURRENT_STATE_VALUE);
		createEReference(fsmConfiguration_currentState_ValueEClass, FSM_CONFIGURATION_CURRENT_STATE_VALUE__CURRENT_STATE);

		fsmConfiguration_producedSequence_DimensionEClass = createEClass(FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION);

		fsmConfiguration_producedSequence_ValueEClass = createEClass(FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE);
		createEAttribute(fsmConfiguration_producedSequence_ValueEClass, FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE);

		input_stringSeq_DimensionEClass = createEClass(INPUT_STRING_SEQ_DIMENSION);

		input_stringSeq_ValueEClass = createEClass(INPUT_STRING_SEQ_VALUE);
		createEAttribute(input_stringSeq_ValueEClass, INPUT_STRING_SEQ_VALUE__STRING_SEQ);

		specificAttributeValueEClass = createEClass(SPECIFIC_ATTRIBUTE_VALUE);

		specificDimensionEClass = createEClass(SPECIFIC_DIMENSION);

		specificReferenceValueEClass = createEClass(SPECIFIC_REFERENCE_VALUE);

		specificStateEClass = createEClass(SPECIFIC_STATE);

		specificTracedObjectEClass = createEClass(SPECIFIC_TRACED_OBJECT);

		specificValueEClass = createEClass(SPECIFIC_VALUE);
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
		fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage theFsmConfigurationPackage_1 = (fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI);
		fsm.FsmPackage theFsmPackage_1 = (fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(fsm.FsmPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFsmPackage);
		getESubpackages().add(theFsmConfigurationPackage_1);

		// Create type parameters
		ETypeParameter specificDimensionEClass_ValueSubType = addETypeParameter(specificDimensionEClass, "ValueSubType");
		addETypeParameter(specificReferenceValueEClass, "T");
		ETypeParameter specificTracedObjectEClass_DimensionSubType = addETypeParameter(specificTracedObjectEClass, "DimensionSubType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificValue());
		specificDimensionEClass_ValueSubType.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSpecificValue());
		g2.setEUpperBound(g3);
		specificTracedObjectEClass_DimensionSubType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getFSMConfiguration_acceptedSequence_Value());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_acceptedSequence_DimensionEClass.getEGenericSuperTypes().add(g1);
		fsmConfiguration_acceptedSequence_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getFSMConfiguration_currentState_Value());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_currentState_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theFsmPackage_1.getState());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_currentState_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getFSMConfiguration_producedSequence_Value());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_producedSequence_DimensionEClass.getEGenericSuperTypes().add(g1);
		fsmConfiguration_producedSequence_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getInput_stringSeq_Value());
		g1.getETypeArguments().add(g2);
		input_stringSeq_DimensionEClass.getEGenericSuperTypes().add(g1);
		input_stringSeq_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		specificAttributeValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getDimension());
		g2 = createEGenericType(specificDimensionEClass_ValueSubType);
		g1.getETypeArguments().add(g2);
		specificDimensionEClass.getEGenericSuperTypes().add(g1);
		specificReferenceValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getState());
		g2 = createEGenericType(theStepsPackage.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSpecificValue());
		g1.getETypeArguments().add(g2);
		specificStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getTracedObject());
		g2 = createEGenericType(specificTracedObjectEClass_DimensionSubType);
		g1.getETypeArguments().add(g2);
		specificTracedObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getValue());
		g2 = createEGenericType(this.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(fsmConfiguration_acceptedSequence_DimensionEClass, FSMConfiguration_acceptedSequence_Dimension.class, "FSMConfiguration_acceptedSequence_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsmConfiguration_acceptedSequence_ValueEClass, FSMConfiguration_acceptedSequence_Value.class, "FSMConfiguration_acceptedSequence_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSMConfiguration_acceptedSequence_Value_AcceptedSequence(), ecorePackage.getEString(), "acceptedSequence", null, 0, -1, FSMConfiguration_acceptedSequence_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fsmConfiguration_currentState_DimensionEClass, FSMConfiguration_currentState_Dimension.class, "FSMConfiguration_currentState_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsmConfiguration_currentState_ValueEClass, FSMConfiguration_currentState_Value.class, "FSMConfiguration_currentState_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSMConfiguration_currentState_Value_CurrentState(), theFsmPackage_1.getState(), null, "currentState", null, 0, 1, FSMConfiguration_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fsmConfiguration_producedSequence_DimensionEClass, FSMConfiguration_producedSequence_Dimension.class, "FSMConfiguration_producedSequence_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsmConfiguration_producedSequence_ValueEClass, FSMConfiguration_producedSequence_Value.class, "FSMConfiguration_producedSequence_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSMConfiguration_producedSequence_Value_ProducedSequence(), ecorePackage.getEString(), "producedSequence", null, 0, -1, FSMConfiguration_producedSequence_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(input_stringSeq_DimensionEClass, Input_stringSeq_Dimension.class, "Input_stringSeq_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(input_stringSeq_ValueEClass, Input_stringSeq_Value.class, "Input_stringSeq_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_stringSeq_Value_StringSeq(), ecorePackage.getEString(), "stringSeq", null, 0, -1, Input_stringSeq_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeValueEClass, SpecificAttributeValue.class, "SpecificAttributeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificDimensionEClass, SpecificDimension.class, "SpecificDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificReferenceValueEClass, SpecificReferenceValue.class, "SpecificReferenceValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStateEClass, SpecificState.class, "SpecificState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificTracedObjectEClass, SpecificTracedObject.class, "SpecificTracedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificValueEClass, SpecificValue.class, "SpecificValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (fsmConfiguration_acceptedSequence_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsmConfiguration_currentState_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsmConfiguration_producedSequence_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (input_stringSeq_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

} //StatesPackageImpl
