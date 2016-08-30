/**
 */
package fumlConfigurationFewSteps.InputFewSteps.impl;

import fumlConfigurationFewSteps.InputFewSteps.*;

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
public class InputFewStepsFactoryImpl extends EFactoryImpl implements InputFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputFewStepsFactory init() {
		try {
			InputFewStepsFactory theInputFewStepsFactory = (InputFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(InputFewStepsPackage.eNS_URI);
			if (theInputFewStepsFactory != null) {
				return theInputFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InputFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFewStepsFactoryImpl() {
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
			case InputFewStepsPackage.INPUT_PARAMETER_VALUES: return createInputParameterValues();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameterValues createInputParameterValues() {
		InputParameterValuesImpl inputParameterValues = new InputParameterValuesImpl();
		return inputParameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFewStepsPackage getInputFewStepsPackage() {
		return (InputFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InputFewStepsPackage getPackage() {
		return InputFewStepsPackage.eINSTANCE;
	}

} //InputFewStepsFactoryImpl
