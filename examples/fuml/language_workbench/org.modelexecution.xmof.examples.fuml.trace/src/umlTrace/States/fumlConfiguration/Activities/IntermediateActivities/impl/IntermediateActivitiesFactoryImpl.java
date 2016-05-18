/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.*;

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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE: return createTracedActivityEdgeInstance();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION: return createTracedActivityExecution();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION: return createTracedActivityNodeActivation();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP: return createTracedActivityNodeActivationGroup();
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN: return createTracedForkedToken();
			case IntermediateActivitiesPackage.TRACED_OBJECT_TOKEN: return createTracedObjectToken();
			case IntermediateActivitiesPackage.TRACED_OFFER: return createTracedOffer();
			case IntermediateActivitiesPackage.TRACED_TOKEN: return createTracedToken();
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
	public TracedActivityExecution createTracedActivityExecution() {
		TracedActivityExecutionImpl tracedActivityExecution = new TracedActivityExecutionImpl();
		return tracedActivityExecution;
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
	public TracedActivityNodeActivationGroup createTracedActivityNodeActivationGroup() {
		TracedActivityNodeActivationGroupImpl tracedActivityNodeActivationGroup = new TracedActivityNodeActivationGroupImpl();
		return tracedActivityNodeActivationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkedToken createTracedForkedToken() {
		TracedForkedTokenImpl tracedForkedToken = new TracedForkedTokenImpl();
		return tracedForkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjectToken createTracedObjectToken() {
		TracedObjectTokenImpl tracedObjectToken = new TracedObjectTokenImpl();
		return tracedObjectToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOffer createTracedOffer() {
		TracedOfferImpl tracedOffer = new TracedOfferImpl();
		return tracedOffer;
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
