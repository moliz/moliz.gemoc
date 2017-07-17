/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fumlConfiguration.FumlConfigurationPackage;

import fumlConfigurationTrace.FumlConfigurationTracePackage;

import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import fumlConfigurationTrace.States.impl.StatesPackageImpl;

import fumlConfigurationTrace.Steps.StepsPackage;

import fumlConfigurationTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActionsPackageImpl extends EPackageImpl implements IntermediateActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAddStructuralFeatureValueActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCreateObjectActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadStructuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValueSpecificationActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedWriteStructuralFeatureActionActivationEClass = null;

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
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActionsPackageImpl() {
		super(eNS_URI, IntermediateActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IntermediateActionsPackage init() {
		if (isInited) return (IntermediateActionsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationTracePackageImpl theFumlConfigurationTracePackage = (FumlConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) instanceof FumlConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) : FumlConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) : IntegerFunctionsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationTracePackage.loadPackage();

		// Fix loaded packages
		theIntermediateActionsPackage.fixPackageContents();
		theFumlConfigurationTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
		theFumlConfigurationPackage_1.fixPackageContents();
		theLociPackage.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theIntegerFunctionsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActionsPackage.eNS_URI, theIntermediateActionsPackage);
		return theIntermediateActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAddStructuralFeatureValueActionActivation() {
		if (tracedAddStructuralFeatureValueActionActivationEClass == null) {
			tracedAddStructuralFeatureValueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return tracedAddStructuralFeatureValueActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCreateObjectActionActivation() {
		if (tracedCreateObjectActionActivationEClass == null) {
			tracedCreateObjectActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return tracedCreateObjectActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadStructuralFeatureActionActivation() {
		if (tracedReadStructuralFeatureActionActivationEClass == null) {
			tracedReadStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tracedReadStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuralFeatureActionActivation() {
		if (tracedStructuralFeatureActionActivationEClass == null) {
			tracedStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tracedStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValueSpecificationActionActivation() {
		if (tracedValueSpecificationActionActivationEClass == null) {
			tracedValueSpecificationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tracedValueSpecificationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedWriteStructuralFeatureActionActivation() {
		if (tracedWriteStructuralFeatureActionActivationEClass == null) {
			tracedWriteStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return tracedWriteStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFactory getIntermediateActionsFactory() {
		return (IntermediateActionsFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IntermediateActionsPackageImpl
