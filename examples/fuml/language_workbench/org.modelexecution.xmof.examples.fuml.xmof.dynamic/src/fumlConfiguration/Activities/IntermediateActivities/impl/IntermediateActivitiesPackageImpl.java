/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

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
public class IntermediateActivitiesPackageImpl extends EPackageImpl implements IntermediateActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeActivationEClass = null;

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
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActivitiesPackageImpl() {
		super(eNS_URI, IntermediateActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IntermediateActivitiesPackage init() {
		if (isInited) return (IntermediateActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActivitiesPackageImpl());

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
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationPackage.loadPackage();

		// Fix loaded packages
		theIntermediateActivitiesPackage.fixPackageContents();
		theFumlConfigurationPackage.fixPackageContents();
		theLociPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theIntegerFunctionsPackage_1.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActivitiesPackage.eNS_URI, theIntermediateActivitiesPackage);
		return theIntermediateActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecution() {
		if (activityExecutionEClass == null) {
			activityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return activityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_ActivationGroup() {
        return (EReference)getActivityExecution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup() {
		if (activityNodeActivationGroupEClass == null) {
			activityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return activityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_ActivityExecution() {
        return (EReference)getActivityNodeActivationGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_EdgeInstances() {
        return (EReference)getActivityNodeActivationGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_NodeActivations() {
        return (EReference)getActivityNodeActivationGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNodeActivation() {
		if (activityParameterNodeActivationEClass == null) {
			activityParameterNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activityParameterNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation() {
		if (activityNodeActivationEClass == null) {
			activityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_Group_ActivityNodeActivation() {
        return (EReference)getActivityNodeActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_Node_ActivityNodeActivation() {
        return (EReference)getActivityNodeActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_Running() {
        return (EAttribute)getActivityNodeActivation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_IncomingEdges() {
        return (EReference)getActivityNodeActivation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_OutgoingEdges() {
        return (EReference)getActivityNodeActivation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_IsRunning() {
        return (EAttribute)getActivityNodeActivation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_HeldTokens() {
        return (EReference)getActivityNodeActivation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		if (tokenEClass == null) {
			tokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Holder() {
        return (EReference)getToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance() {
		if (activityEdgeInstanceEClass == null) {
			activityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return activityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_Group_ActivityEdgeInstance() {
        return (EReference)getActivityEdgeInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_Edge_ActivityEdgeInstance() {
        return (EReference)getActivityEdgeInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_Source() {
        return (EReference)getActivityEdgeInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_Target() {
        return (EReference)getActivityEdgeInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_Offers() {
        return (EReference)getActivityEdgeInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeActivation() {
		if (controlNodeActivationEClass == null) {
			controlNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return controlNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNodeActivation() {
		if (objectNodeActivationEClass == null) {
			objectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return objectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNodeActivation_OfferedTokenCount() {
        return (EAttribute)getObjectNodeActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer() {
		if (offerEClass == null) {
			offerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_OfferedTokens() {
        return (EReference)getOffer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeActivation() {
		if (decisionNodeActivationEClass == null) {
			decisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return decisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlToken() {
		if (controlTokenEClass == null) {
			controlTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return controlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectToken() {
		if (objectTokenEClass == null) {
			objectTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return objectTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_Value() {
        return (EReference)getObjectToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken() {
		if (forkedTokenEClass == null) {
			forkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return forkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_BaseToken() {
        return (EReference)getForkedToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_RemainingOffersCount() {
        return (EAttribute)getForkedToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_BaseTokenIsWithdrawn() {
        return (EAttribute)getForkedToken().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeActivation() {
		if (initialNodeActivationEClass == null) {
			initialNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return initialNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeActivation() {
		if (mergeNodeActivationEClass == null) {
			mergeNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return mergeNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeActivation() {
		if (joinNodeActivationEClass == null) {
			joinNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return joinNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeActivation() {
		if (forkNodeActivationEClass == null) {
			forkNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return forkNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeActivation() {
		if (activityFinalNodeActivationEClass == null) {
			activityFinalNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return activityFinalNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFactory getIntermediateActivitiesFactory() {
		return (IntermediateActivitiesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("fumlConfiguration.Activities.IntermediateActivities." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IntermediateActivitiesPackageImpl
