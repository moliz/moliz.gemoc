/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsFactory;
import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsPackage;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.IntermediateActivitiesFewStepsPackageImpl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl.KernelFewStepsPackageImpl;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.BasicBehaviorsFewStepsPackageImpl;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewSteps.InputFewSteps.InputFewStepsPackage;

import fumlConfigurationFewSteps.InputFewSteps.impl.InputFewStepsPackageImpl;

import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.IntegerFunctionsFewStepsPackage;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.impl.IntegerFunctionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.impl.FumlConfigurationFewStepsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

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
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#eNS_URI
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
	 * @generated
	 */
	public static BasicActionsFewStepsPackage init() {
		if (isInited) return (BasicActionsFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI);

		// Obtain or create and register package
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicActionsFewStepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationFewStepsPackageImpl theFumlConfigurationFewStepsPackage = (FumlConfigurationFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsPackage.eNS_URI) instanceof FumlConfigurationFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsPackage.eNS_URI) : FumlConfigurationFewStepsPackage.eINSTANCE);
		LociFewStepsPackageImpl theLociFewStepsPackage = (LociFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) instanceof LociFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) : LociFewStepsPackage.eINSTANCE);
		KernelFewStepsPackageImpl theKernelFewStepsPackage = (KernelFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelFewStepsPackage.eNS_URI) instanceof KernelFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelFewStepsPackage.eNS_URI) : KernelFewStepsPackage.eINSTANCE);
		BasicBehaviorsFewStepsPackageImpl theBasicBehaviorsFewStepsPackage = (BasicBehaviorsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsFewStepsPackage.eNS_URI) instanceof BasicBehaviorsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsFewStepsPackage.eNS_URI) : BasicBehaviorsFewStepsPackage.eINSTANCE);
		IntegerFunctionsFewStepsPackageImpl theIntegerFunctionsFewStepsPackage = (IntegerFunctionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsFewStepsPackage.eNS_URI) instanceof IntegerFunctionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsFewStepsPackage.eNS_URI) : IntegerFunctionsFewStepsPackage.eINSTANCE);
		IntermediateActivitiesFewStepsPackageImpl theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) instanceof IntermediateActivitiesFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) : IntermediateActivitiesFewStepsPackage.eINSTANCE);
		IntermediateActionsFewStepsPackageImpl theIntermediateActionsFewStepsPackage = (IntermediateActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI) instanceof IntermediateActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI) : IntermediateActionsFewStepsPackage.eINSTANCE);
		InputFewStepsPackageImpl theInputFewStepsPackage = (InputFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI) instanceof InputFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI) : InputFewStepsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationFewStepsPackage.loadPackage();

		// Fix loaded packages
		theBasicActionsFewStepsPackage.fixPackageContents();
		theFumlConfigurationFewStepsPackage.fixPackageContents();
		theLociFewStepsPackage.fixPackageContents();
		theKernelFewStepsPackage.fixPackageContents();
		theBasicBehaviorsFewStepsPackage.fixPackageContents();
		theIntegerFunctionsFewStepsPackage.fixPackageContents();
		theIntermediateActivitiesFewStepsPackage.fixPackageContents();
		theIntermediateActionsFewStepsPackage.fixPackageContents();
		theInputFewStepsPackage.fixPackageContents();

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
	public EClass getActionActivation() {
		if (actionActivationEClass == null) {
			actionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(0);
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
	public EOperation getActionActivation__GetPinActivation__Pin_PinActivation() {
        return getActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__SendOffers() {
        return getActionActivation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__DoAction() {
        return getActionActivation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__ShouldFireAgain__boolean() {
        return getActionActivation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__PutToken__OutputPin_Value() {
        return getActionActivation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__TakeTokens__InputPin_EList() {
        return getActionActivation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation__PutTokens__OutputPin_EList() {
        return getActionActivation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation() {
		if (pinActivationEClass == null) {
			pinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(1);
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
			inputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(2);
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
			opaqueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(3);
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
			outputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(4);
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
			callActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(5);
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
	public EOperation getCallActionActivation__GetCallExecution__Execution() {
        return getCallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActionActivation__RemoveCallExecution__Execution() {
        return getCallActionActivation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActionActivation__InitializeInputParameterValues__Execution() {
        return getCallActionActivation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActionActivation__CollectOutputParameterValues__Execution() {
        return getCallActionActivation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationActionActivation() {
		if (invocationActionActivationEClass == null) {
			invocationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(6);
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
			callBehaviorActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return callBehaviorActionActivationEClass;
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
			eClassifier.setInstanceClassName("fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BasicActionsFewStepsPackageImpl
