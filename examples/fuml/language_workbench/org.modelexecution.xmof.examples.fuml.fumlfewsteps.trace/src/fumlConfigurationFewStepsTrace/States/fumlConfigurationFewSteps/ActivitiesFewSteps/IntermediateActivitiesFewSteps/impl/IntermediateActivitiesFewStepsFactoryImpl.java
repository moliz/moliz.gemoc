/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.*;

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
public class IntermediateActivitiesFewStepsFactoryImpl extends EFactoryImpl implements IntermediateActivitiesFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateActivitiesFewStepsFactory init() {
		try {
			IntermediateActivitiesFewStepsFactory theIntermediateActivitiesFewStepsFactory = (IntermediateActivitiesFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediateActivitiesFewStepsPackage.eNS_URI);
			if (theIntermediateActivitiesFewStepsFactory != null) {
				return theIntermediateActivitiesFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateActivitiesFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFewStepsFactoryImpl() {
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
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_EDGE_INSTANCE: return createTracedActivityEdgeInstance();
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_FINAL_NODE_ACTIVATION: return createTracedActivityFinalNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_NODE_ACTIVATION: return createTracedActivityNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATION: return createTracedActivityParameterNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_DECISION_NODE_ACTIVATION: return createTracedDecisionNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_FORK_NODE_ACTIVATION: return createTracedForkNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_INITIAL_NODE_ACTIVATION: return createTracedInitialNodeActivation();
			case IntermediateActivitiesFewStepsPackage.TRACED_TOKEN: return createTracedToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityEdgeInstance createTracedActivityEdgeInstance() {
		TracedActivityEdgeInstanceImpl tracedActivityEdgeInstance = new TracedActivityEdgeInstanceImpl();
		return tracedActivityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityFinalNodeActivation createTracedActivityFinalNodeActivation() {
		TracedActivityFinalNodeActivationImpl tracedActivityFinalNodeActivation = new TracedActivityFinalNodeActivationImpl();
		return tracedActivityFinalNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNodeActivation createTracedActivityNodeActivation() {
		TracedActivityNodeActivationImpl tracedActivityNodeActivation = new TracedActivityNodeActivationImpl();
		return tracedActivityNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityParameterNodeActivation createTracedActivityParameterNodeActivation() {
		TracedActivityParameterNodeActivationImpl tracedActivityParameterNodeActivation = new TracedActivityParameterNodeActivationImpl();
		return tracedActivityParameterNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDecisionNodeActivation createTracedDecisionNodeActivation() {
		TracedDecisionNodeActivationImpl tracedDecisionNodeActivation = new TracedDecisionNodeActivationImpl();
		return tracedDecisionNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkNodeActivation createTracedForkNodeActivation() {
		TracedForkNodeActivationImpl tracedForkNodeActivation = new TracedForkNodeActivationImpl();
		return tracedForkNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInitialNodeActivation createTracedInitialNodeActivation() {
		TracedInitialNodeActivationImpl tracedInitialNodeActivation = new TracedInitialNodeActivationImpl();
		return tracedInitialNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedToken createTracedToken() {
		TracedTokenImpl tracedToken = new TracedTokenImpl();
		return tracedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFewStepsPackage getIntermediateActivitiesFewStepsPackage() {
		return (IntermediateActivitiesFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateActivitiesFewStepsPackage getPackage() {
		return IntermediateActivitiesFewStepsPackage.eINSTANCE;
	}

} //IntermediateActivitiesFewStepsFactoryImpl
