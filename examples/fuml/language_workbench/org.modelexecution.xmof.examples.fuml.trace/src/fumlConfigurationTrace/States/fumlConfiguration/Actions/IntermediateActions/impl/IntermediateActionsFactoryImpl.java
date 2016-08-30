/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.*;

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
			case IntermediateActionsPackage.TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION: return createTracedAddStructuralFeatureValueActionActivation();
			case IntermediateActionsPackage.TRACED_CREATE_OBJECT_ACTION_ACTIVATION: return createTracedCreateObjectActionActivation();
			case IntermediateActionsPackage.TRACED_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION: return createTracedReadStructuralFeatureActionActivation();
			case IntermediateActionsPackage.TRACED_VALUE_SPECIFICATION_ACTION_ACTIVATION: return createTracedValueSpecificationActionActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAddStructuralFeatureValueActionActivation createTracedAddStructuralFeatureValueActionActivation() {
		TracedAddStructuralFeatureValueActionActivationImpl tracedAddStructuralFeatureValueActionActivation = new TracedAddStructuralFeatureValueActionActivationImpl();
		return tracedAddStructuralFeatureValueActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCreateObjectActionActivation createTracedCreateObjectActionActivation() {
		TracedCreateObjectActionActivationImpl tracedCreateObjectActionActivation = new TracedCreateObjectActionActivationImpl();
		return tracedCreateObjectActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadStructuralFeatureActionActivation createTracedReadStructuralFeatureActionActivation() {
		TracedReadStructuralFeatureActionActivationImpl tracedReadStructuralFeatureActionActivation = new TracedReadStructuralFeatureActionActivationImpl();
		return tracedReadStructuralFeatureActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValueSpecificationActionActivation createTracedValueSpecificationActionActivation() {
		TracedValueSpecificationActionActivationImpl tracedValueSpecificationActionActivation = new TracedValueSpecificationActionActivationImpl();
		return tracedValueSpecificationActionActivation;
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
