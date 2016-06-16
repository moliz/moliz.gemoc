/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsFactory;
import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsPackage;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActionsFewStepsPackageImpl extends EPackageImpl implements IntermediateActionsFewStepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionActivationEClass = null;

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
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActionsFewStepsPackageImpl() {
		super(eNS_URI, IntermediateActionsFewStepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActionsFewStepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IntermediateActionsFewStepsPackage init() {
		if (isInited) return (IntermediateActionsFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActionsFewStepsPackageImpl theIntermediateActionsFewStepsPackage = (IntermediateActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActionsFewStepsPackageImpl());

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
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) : BasicActionsFewStepsPackage.eINSTANCE);
		InputFewStepsPackageImpl theInputFewStepsPackage = (InputFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI) instanceof InputFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI) : InputFewStepsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationFewStepsPackage.loadPackage();

		// Fix loaded packages
		theIntermediateActionsFewStepsPackage.fixPackageContents();
		theFumlConfigurationFewStepsPackage.fixPackageContents();
		theLociFewStepsPackage.fixPackageContents();
		theKernelFewStepsPackage.fixPackageContents();
		theBasicBehaviorsFewStepsPackage.fixPackageContents();
		theIntegerFunctionsFewStepsPackage.fixPackageContents();
		theIntermediateActivitiesFewStepsPackage.fixPackageContents();
		theBasicActionsFewStepsPackage.fixPackageContents();
		theInputFewStepsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActionsFewStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActionsFewStepsPackage.eNS_URI, theIntermediateActionsFewStepsPackage);
		return theIntermediateActionsFewStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationActionActivation() {
		if (valueSpecificationActionActivationEClass == null) {
			valueSpecificationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return valueSpecificationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectActionActivation() {
		if (createObjectActionActivationEClass == null) {
			createObjectActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return createObjectActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureActionActivation() {
		if (structuralFeatureActionActivationEClass == null) {
			structuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return structuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureActionActivation() {
		if (readStructuralFeatureActionActivationEClass == null) {
			readStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return readStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureActionActivation() {
		if (writeStructuralFeatureActionActivationEClass == null) {
			writeStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return writeStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueActionActivation() {
		if (addStructuralFeatureValueActionActivationEClass == null) {
			addStructuralFeatureValueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return addStructuralFeatureValueActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFewStepsFactory getIntermediateActionsFewStepsFactory() {
		return (IntermediateActionsFewStepsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IntermediateActionsFewStepsPackageImpl
