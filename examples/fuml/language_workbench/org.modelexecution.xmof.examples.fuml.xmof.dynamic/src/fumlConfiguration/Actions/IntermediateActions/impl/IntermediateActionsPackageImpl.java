/**
 */
package fumlConfiguration.Actions.IntermediateActions.impl;

import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfiguration.Actions.IntermediateActions.IntermediateActionsFactory;
import fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

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
public class IntermediateActionsPackageImpl extends EPackageImpl implements IntermediateActionsPackage {
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
	 * @see fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage#eNS_URI
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
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationPackage.loadPackage();

		// Fix loaded packages
		theIntermediateActionsPackage.fixPackageContents();
		theFumlConfigurationPackage.fixPackageContents();
		theLociPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theIntegerFunctionsPackage_1.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();

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
	public EClass getValueSpecificationActionActivation() {
		if (valueSpecificationActionActivationEClass == null) {
			valueSpecificationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(0);
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
			createObjectActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(1);
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
			structuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(2);
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
			readStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(3);
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
			writeStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(4);
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
			addStructuralFeatureValueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return addStructuralFeatureValueActionActivationEClass;
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
			eClassifier.setInstanceClassName("fumlConfiguration.Actions.IntermediateActions." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IntermediateActionsPackageImpl
