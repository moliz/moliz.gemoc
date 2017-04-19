/**
 */
package fsmConfigurationTrace.impl;

import fsmConfigurationTrace.*;

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
public class FsmConfigurationTraceFactoryImpl extends EFactoryImpl implements FsmConfigurationTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FsmConfigurationTraceFactory init() {
		try {
			FsmConfigurationTraceFactory theFsmConfigurationTraceFactory = (FsmConfigurationTraceFactory)EPackage.Registry.INSTANCE.getEFactory(FsmConfigurationTracePackage.eNS_URI);
			if (theFsmConfigurationTraceFactory != null) {
				return theFsmConfigurationTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FsmConfigurationTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationTraceFactoryImpl() {
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
			case FsmConfigurationTracePackage.SPECIFIC_TRACE: return createSpecificTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificTrace createSpecificTrace() {
		SpecificTraceImpl specificTrace = new SpecificTraceImpl();
		return specificTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationTracePackage getFsmConfigurationTracePackage() {
		return (FsmConfigurationTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FsmConfigurationTracePackage getPackage() {
		return FsmConfigurationTracePackage.eINSTANCE;
	}

} //FsmConfigurationTraceFactoryImpl
