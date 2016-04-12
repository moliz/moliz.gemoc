/**
 */
package fumlConfiguration.Actions.BasicActions.impl;

import fumlConfiguration.Actions.BasicActions.*;

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
			case BasicActionsPackage.INPUT_PIN_ACTIVATION: return createInputPinActivation();
			case BasicActionsPackage.OPAQUE_ACTION_ACTIVATION: return createOpaqueActionActivation();
			case BasicActionsPackage.OUTPUT_PIN_ACTIVATION: return createOutputPinActivation();
			case BasicActionsPackage.CALL_BEHAVIOR_ACTION_ACTIVATION: return createCallBehaviorActionActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPinActivation createInputPinActivation() {
		InputPinActivationImpl inputPinActivation = new InputPinActivationImpl();
		return inputPinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionActivation createOpaqueActionActivation() {
		OpaqueActionActivationImpl opaqueActionActivation = new OpaqueActionActivationImpl();
		return opaqueActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPinActivation createOutputPinActivation() {
		OutputPinActivationImpl outputPinActivation = new OutputPinActivationImpl();
		return outputPinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorActionActivation createCallBehaviorActionActivation() {
		CallBehaviorActionActivationImpl callBehaviorActionActivation = new CallBehaviorActionActivationImpl();
		return callBehaviorActionActivation;
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
