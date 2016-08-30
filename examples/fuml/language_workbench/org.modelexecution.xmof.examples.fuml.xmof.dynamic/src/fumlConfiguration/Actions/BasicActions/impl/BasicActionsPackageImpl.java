/**
 */
package fumlConfiguration.Actions.BasicActions.impl;

import fumlConfiguration.Actions.BasicActions.BasicActionsFactory;
import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import fumlConfiguration.FumlConfigurationPackage;

import fumlConfiguration.Input.InputPackage;

import fumlConfiguration.Input.impl.InputPackageImpl;

import fumlConfiguration.Loci.LociPackage;

import fumlConfiguration.Loci.impl.LociPackageImpl;

import fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

import fumlConfiguration.impl.FumlConfigurationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.ListFunctions.ListFunctionsPackage;

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
	private EClass actionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionActivationEClass = null;

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
	 * @see fumlConfiguration.Actions.BasicActions.BasicActionsPackage#eNS_URI
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
		UMLPackage.eINSTANCE.eClass();
		IntegerFunctionsPackage.eINSTANCE.eClass();
		ListFunctionsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationPackageImpl theFumlConfigurationPackage = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI) : FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage_1 = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eNS_URI) : fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationPackage.loadPackage();

		// Fix loaded packages
		theBasicActionsPackage.fixPackageContents();
		theFumlConfigurationPackage.fixPackageContents();
		theLociPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theIntegerFunctionsPackage_1.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();

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
	public EClass getActionActivation() {
		if (actionActivationEClass == null) {
			actionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return actionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_PinActivations() {
        return (EReference)getActionActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionActivation_Firing() {
        return (EAttribute)getActionActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation() {
		if (pinActivationEClass == null) {
			pinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return pinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_ActionActivation() {
        return (EReference)getPinActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinActivation_Count_temp() {
        return (EAttribute)getPinActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPinActivation() {
		if (inputPinActivationEClass == null) {
			inputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return inputPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionActivation() {
		if (opaqueActionActivationEClass == null) {
			opaqueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return opaqueActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPinActivation() {
		if (outputPinActivationEClass == null) {
			outputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return outputPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionActivation() {
		if (callActionActivationEClass == null) {
			callActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return callActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_CallExecutions() {
        return (EReference)getCallActionActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationActionActivation() {
		if (invocationActionActivationEClass == null) {
			invocationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return invocationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorActionActivation() {
		if (callBehaviorActionActivationEClass == null) {
			callBehaviorActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return callBehaviorActionActivationEClass;
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
			eClassifier.setInstanceClassName("fumlConfiguration.Actions.BasicActions." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BasicActionsPackageImpl
