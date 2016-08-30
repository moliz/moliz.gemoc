/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.*;

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
public class BasicActionsFactoryImpl extends EFactoryImpl implements BasicActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicActionsFactory init() {
		try {
			BasicActionsFactory theBasicActionsFactory = (BasicActionsFactory)EPackage.Registry.INSTANCE.getEFactory(BasicActionsPackage.eNS_URI);
			if (theBasicActionsFactory != null) {
				return theBasicActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsFactoryImpl() {
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
			case BasicActionsPackage.TRACED_CALL_BEHAVIOR_ACTION_ACTIVATION: return createTracedCallBehaviorActionActivation();
			case BasicActionsPackage.TRACED_INPUT_PIN_ACTIVATION: return createTracedInputPinActivation();
			case BasicActionsPackage.TRACED_OPAQUE_ACTION_ACTIVATION: return createTracedOpaqueActionActivation();
			case BasicActionsPackage.TRACED_OUTPUT_PIN_ACTIVATION: return createTracedOutputPinActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallBehaviorActionActivation createTracedCallBehaviorActionActivation() {
		TracedCallBehaviorActionActivationImpl tracedCallBehaviorActionActivation = new TracedCallBehaviorActionActivationImpl();
		return tracedCallBehaviorActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInputPinActivation createTracedInputPinActivation() {
		TracedInputPinActivationImpl tracedInputPinActivation = new TracedInputPinActivationImpl();
		return tracedInputPinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueActionActivation createTracedOpaqueActionActivation() {
		TracedOpaqueActionActivationImpl tracedOpaqueActionActivation = new TracedOpaqueActionActivationImpl();
		return tracedOpaqueActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOutputPinActivation createTracedOutputPinActivation() {
		TracedOutputPinActivationImpl tracedOutputPinActivation = new TracedOutputPinActivationImpl();
		return tracedOutputPinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsPackage getBasicActionsPackage() {
		return (BasicActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicActionsPackage getPackage() {
		return BasicActionsPackage.eINSTANCE;
	}

} //BasicActionsFactoryImpl
