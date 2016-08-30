/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActivitiesFactoryImpl extends EFactoryImpl implements IntermediateActivitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateActivitiesFactory init() {
		try {
			IntermediateActivitiesFactory theIntermediateActivitiesFactory = (IntermediateActivitiesFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediateActivitiesPackage.eNS_URI);
			if (theIntermediateActivitiesFactory != null) {
				return theIntermediateActivitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateActivitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION: return createActivityExecution();
			case IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP: return createActivityNodeActivationGroup();
			case IntermediateActivitiesPackage.ACTIVITY_PARAMETER_NODE_ACTIVATION: return createActivityParameterNodeActivation();
			case IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION: return createActivityNodeActivation();
			case IntermediateActivitiesPackage.TOKEN: return createToken();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE: return createActivityEdgeInstance();
			case IntermediateActivitiesPackage.OFFER: return createOffer();
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION: return createDecisionNodeActivation();
			case IntermediateActivitiesPackage.CONTROL_TOKEN: return createControlToken();
			case IntermediateActivitiesPackage.OBJECT_TOKEN: return createObjectToken();
			case IntermediateActivitiesPackage.FORKED_TOKEN: return createForkedToken();
			case IntermediateActivitiesPackage.INITIAL_NODE_ACTIVATION: return createInitialNodeActivation();
			case IntermediateActivitiesPackage.MERGE_NODE_ACTIVATION: return createMergeNodeActivation();
			case IntermediateActivitiesPackage.JOIN_NODE_ACTIVATION: return createJoinNodeActivation();
			case IntermediateActivitiesPackage.FORK_NODE_ACTIVATION: return createForkNodeActivation();
			case IntermediateActivitiesPackage.ACTIVITY_FINAL_NODE_ACTIVATION: return createActivityFinalNodeActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecution createActivityExecution() {
		ActivityExecutionImpl activityExecution = new ActivityExecutionImpl();
		return activityExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup createActivityNodeActivationGroup() {
		ActivityNodeActivationGroupImpl activityNodeActivationGroup = new ActivityNodeActivationGroupImpl();
		return activityNodeActivationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNodeActivation createActivityParameterNodeActivation() {
		ActivityParameterNodeActivationImpl activityParameterNodeActivation = new ActivityParameterNodeActivationImpl();
		return activityParameterNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation createActivityNodeActivation() {
		ActivityNodeActivationImpl activityNodeActivation = new ActivityNodeActivationImpl();
		return activityNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance createActivityEdgeInstance() {
		ActivityEdgeInstanceImpl activityEdgeInstance = new ActivityEdgeInstanceImpl();
		return activityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeActivation createDecisionNodeActivation() {
		DecisionNodeActivationImpl decisionNodeActivation = new DecisionNodeActivationImpl();
		return decisionNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlToken createControlToken() {
		ControlTokenImpl controlToken = new ControlTokenImpl();
		return controlToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectToken createObjectToken() {
		ObjectTokenImpl objectToken = new ObjectTokenImpl();
		return objectToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken createForkedToken() {
		ForkedTokenImpl forkedToken = new ForkedTokenImpl();
		return forkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeActivation createInitialNodeActivation() {
		InitialNodeActivationImpl initialNodeActivation = new InitialNodeActivationImpl();
		return initialNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeActivation createMergeNodeActivation() {
		MergeNodeActivationImpl mergeNodeActivation = new MergeNodeActivationImpl();
		return mergeNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeActivation createJoinNodeActivation() {
		JoinNodeActivationImpl joinNodeActivation = new JoinNodeActivationImpl();
		return joinNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeActivation createForkNodeActivation() {
		ForkNodeActivationImpl forkNodeActivation = new ForkNodeActivationImpl();
		return forkNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeActivation createActivityFinalNodeActivation() {
		ActivityFinalNodeActivationImpl activityFinalNodeActivation = new ActivityFinalNodeActivationImpl();
		return activityFinalNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesPackage getIntermediateActivitiesPackage() {
		return (IntermediateActivitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateActivitiesPackage getPackage() {
		return IntermediateActivitiesPackage.eINSTANCE;
	}

} //IntermediateActivitiesFactoryImpl
