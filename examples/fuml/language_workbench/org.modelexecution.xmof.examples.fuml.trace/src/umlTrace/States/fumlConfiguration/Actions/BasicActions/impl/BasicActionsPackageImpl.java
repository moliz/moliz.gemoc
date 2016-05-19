/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions.impl;

import fumlConfiguration.FumlConfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import umlTrace.States.StatesPackage;

import umlTrace.States.ecore.EcorePackage;

import umlTrace.States.ecore.impl.EcorePackageImpl;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsFactory;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

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
public class BasicActionsPackageImpl extends EPackageImpl implements BasicActionsPackage {
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
	private EClass tracedCallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInvocationActionActivationEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicActionsPackageImpl() {
		super(eNS_URI, BasicActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BasicActionsPackage init() {
		if (isInited) return (BasicActionsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI);

		// Obtain or create and register package
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicActionsPackageImpl());

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
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Load packages
		theUmlTracePackage.loadPackage();

		// Fix loaded packages
		theBasicActionsPackage.fixPackageContents();
		theUmlTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
		theFumlConfigurationPackage_1.fixPackageContents();
		theLociPackage.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theUmlPackage.fixPackageContents();
		theEcorePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicActionsPackage.eNS_URI, theBasicActionsPackage);
		return theBasicActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActionActivation() {
		if (tracedActionActivationEClass == null) {
			tracedActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return tracedActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActionActivation_FiringSequence() {
        return (EReference)getTracedActionActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActionActivation_PinActivationsSequence() {
        return (EReference)getTracedActionActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCallActionActivation() {
		if (tracedCallActionActivationEClass == null) {
			tracedCallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return tracedCallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedCallActionActivation_CallExecutionsSequence() {
        return (EReference)getTracedCallActionActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInvocationActionActivation() {
		if (tracedInvocationActionActivationEClass == null) {
			tracedInvocationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tracedInvocationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPinActivation() {
		if (tracedPinActivationEClass == null) {
			tracedPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tracedPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPinActivation_ActionActivationSequence() {
        return (EReference)getTracedPinActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPinActivation_Count_tempSequence() {
        return (EReference)getTracedPinActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsFactory getBasicActionsFactory() {
		return (BasicActionsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("umlTrace.States.fumlConfiguration.Actions.BasicActions." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BasicActionsPackageImpl
