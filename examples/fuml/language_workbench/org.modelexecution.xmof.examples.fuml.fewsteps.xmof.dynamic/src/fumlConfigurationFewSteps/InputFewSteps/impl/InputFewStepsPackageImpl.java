/**
 */
package fumlConfigurationFewSteps.InputFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsPackage;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl.IntermediateActionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.IntermediateActivitiesFewStepsPackageImpl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl.KernelFewStepsPackageImpl;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.BasicBehaviorsFewStepsPackageImpl;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewSteps.InputFewSteps.InputFewStepsFactory;
import fumlConfigurationFewSteps.InputFewSteps.InputFewStepsPackage;

import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.IntegerFunctionsFewStepsPackage;

import fumlConfigurationFewSteps.PrimitiveBehaviorsFewSteps.IntegerFunctionsFewSteps.impl.IntegerFunctionsFewStepsPackageImpl;

import fumlConfigurationFewSteps.impl.FumlConfigurationFewStepsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
public class InputFewStepsPackageImpl extends EPackageImpl implements InputFewStepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterValuesEClass = null;

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
	 * @see fumlConfigurationFewSteps.InputFewSteps.InputFewStepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InputFewStepsPackageImpl() {
		super(eNS_URI, InputFewStepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InputFewStepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InputFewStepsPackage init() {
		if (isInited) return (InputFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI);

		// Obtain or create and register package
		InputFewStepsPackageImpl theInputFewStepsPackage = (InputFewStepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InputFewStepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InputFewStepsPackageImpl());

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
		IntermediateActionsFewStepsPackageImpl theIntermediateActionsFewStepsPackage = (IntermediateActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI) instanceof IntermediateActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsFewStepsPackage.eNS_URI) : IntermediateActionsFewStepsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationFewStepsPackage.loadPackage();

		// Fix loaded packages
		theInputFewStepsPackage.fixPackageContents();
		theFumlConfigurationFewStepsPackage.fixPackageContents();
		theLociFewStepsPackage.fixPackageContents();
		theKernelFewStepsPackage.fixPackageContents();
		theBasicBehaviorsFewStepsPackage.fixPackageContents();
		theIntegerFunctionsFewStepsPackage.fixPackageContents();
		theIntermediateActivitiesFewStepsPackage.fixPackageContents();
		theBasicActionsFewStepsPackage.fixPackageContents();
		theIntermediateActionsFewStepsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInputFewStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InputFewStepsPackage.eNS_URI, theInputFewStepsPackage);
		return theInputFewStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValues() {
		if (inputParameterValuesEClass == null) {
			inputParameterValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InputFewStepsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return inputParameterValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputParameterValues_Name() {
        return (EAttribute)getInputParameterValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_ParameterValues() {
        return (EReference)getInputParameterValues().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFewStepsFactory getInputFewStepsFactory() {
		return (InputFewStepsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("fumlConfigurationFewSteps.InputFewSteps." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InputFewStepsPackageImpl
