/**
 */
package fumlConfigurationTrace.impl;

import fumlConfigurationTrace.*;

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
public class FumlConfigurationTraceFactoryImpl extends EFactoryImpl implements FumlConfigurationTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FumlConfigurationTraceFactory init() {
		try {
			FumlConfigurationTraceFactory theFumlConfigurationTraceFactory = (FumlConfigurationTraceFactory)EPackage.Registry.INSTANCE.getEFactory(FumlConfigurationTracePackage.eNS_URI);
			if (theFumlConfigurationTraceFactory != null) {
				return theFumlConfigurationTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FumlConfigurationTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationTraceFactoryImpl() {
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
			case FumlConfigurationTracePackage.SPECIFIC_TRACE: return createSpecificTrace();
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
	public FumlConfigurationTracePackage getFumlConfigurationTracePackage() {
		return (FumlConfigurationTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FumlConfigurationTracePackage getPackage() {
		return FumlConfigurationTracePackage.eINSTANCE;
	}

} //FumlConfigurationTraceFactoryImpl
