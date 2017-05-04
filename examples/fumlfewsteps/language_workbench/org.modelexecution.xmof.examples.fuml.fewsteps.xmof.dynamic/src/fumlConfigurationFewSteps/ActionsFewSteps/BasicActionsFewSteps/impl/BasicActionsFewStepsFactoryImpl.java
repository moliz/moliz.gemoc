/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.*;

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
public class BasicActionsFewStepsFactoryImpl extends EFactoryImpl implements BasicActionsFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicActionsFewStepsFactory init() {
		try {
			BasicActionsFewStepsFactory theBasicActionsFewStepsFactory = (BasicActionsFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(BasicActionsFewStepsPackage.eNS_URI);
			if (theBasicActionsFewStepsFactory != null) {
				return theBasicActionsFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicActionsFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsFewStepsFactoryImpl() {
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
			case BasicActionsFewStepsPackage.INPUT_PIN_ACTIVATION: return createInputPinActivation();
			case BasicActionsFewStepsPackage.OPAQUE_ACTION_ACTIVATION: return createOpaqueActionActivation();
			case BasicActionsFewStepsPackage.OUTPUT_PIN_ACTIVATION: return createOutputPinActivation();
			case BasicActionsFewStepsPackage.CALL_BEHAVIOR_ACTION_ACTIVATION: return createCallBehaviorActionActivation();
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
	public BasicActionsFewStepsPackage getBasicActionsFewStepsPackage() {
		return (BasicActionsFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicActionsFewStepsPackage getPackage() {
		return BasicActionsFewStepsPackage.eINSTANCE;
	}

} //BasicActionsFewStepsFactoryImpl
