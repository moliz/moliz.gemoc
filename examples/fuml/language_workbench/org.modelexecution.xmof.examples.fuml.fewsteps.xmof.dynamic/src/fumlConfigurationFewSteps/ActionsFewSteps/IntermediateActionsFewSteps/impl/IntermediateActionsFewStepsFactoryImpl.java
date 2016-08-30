/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.*;

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
public class IntermediateActionsFewStepsFactoryImpl extends EFactoryImpl implements IntermediateActionsFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateActionsFewStepsFactory init() {
		try {
			IntermediateActionsFewStepsFactory theIntermediateActionsFewStepsFactory = (IntermediateActionsFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediateActionsFewStepsPackage.eNS_URI);
			if (theIntermediateActionsFewStepsFactory != null) {
				return theIntermediateActionsFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateActionsFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFewStepsFactoryImpl() {
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
			case IntermediateActionsFewStepsPackage.VALUE_SPECIFICATION_ACTION_ACTIVATION: return createValueSpecificationActionActivation();
			case IntermediateActionsFewStepsPackage.CREATE_OBJECT_ACTION_ACTIVATION: return createCreateObjectActionActivation();
			case IntermediateActionsFewStepsPackage.READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION: return createReadStructuralFeatureActionActivation();
			case IntermediateActionsFewStepsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION: return createAddStructuralFeatureValueActionActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationActionActivation createValueSpecificationActionActivation() {
		ValueSpecificationActionActivationImpl valueSpecificationActionActivation = new ValueSpecificationActionActivationImpl();
		return valueSpecificationActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectActionActivation createCreateObjectActionActivation() {
		CreateObjectActionActivationImpl createObjectActionActivation = new CreateObjectActionActivationImpl();
		return createObjectActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureActionActivation createReadStructuralFeatureActionActivation() {
		ReadStructuralFeatureActionActivationImpl readStructuralFeatureActionActivation = new ReadStructuralFeatureActionActivationImpl();
		return readStructuralFeatureActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueActionActivation createAddStructuralFeatureValueActionActivation() {
		AddStructuralFeatureValueActionActivationImpl addStructuralFeatureValueActionActivation = new AddStructuralFeatureValueActionActivationImpl();
		return addStructuralFeatureValueActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFewStepsPackage getIntermediateActionsFewStepsPackage() {
		return (IntermediateActionsFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateActionsFewStepsPackage getPackage() {
		return IntermediateActionsFewStepsPackage.eINSTANCE;
	}

} //IntermediateActionsFewStepsFactoryImpl
