/**
 */
package fumlConfiguration.Actions.IntermediateActions.impl;

import fumlConfiguration.Actions.IntermediateActions.*;

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
public class IntermediateActionsFactoryImpl extends EFactoryImpl implements IntermediateActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateActionsFactory init() {
		try {
			IntermediateActionsFactory theIntermediateActionsFactory = (IntermediateActionsFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediateActionsPackage.eNS_URI);
			if (theIntermediateActionsFactory != null) {
				return theIntermediateActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFactoryImpl() {
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
			case IntermediateActionsPackage.VALUE_SPECIFICATION_ACTION_ACTIVATION: return createValueSpecificationActionActivation();
			case IntermediateActionsPackage.CREATE_OBJECT_ACTION_ACTIVATION: return createCreateObjectActionActivation();
			case IntermediateActionsPackage.READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION: return createReadStructuralFeatureActionActivation();
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION: return createAddStructuralFeatureValueActionActivation();
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
	public IntermediateActionsPackage getIntermediateActionsPackage() {
		return (IntermediateActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateActionsPackage getPackage() {
		return IntermediateActionsPackage.eINSTANCE;
	}

} //IntermediateActionsFactoryImpl
