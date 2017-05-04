/**
 */
package fumlConfigurationFewStepsTrace.impl;

import fumlConfigurationFewStepsTrace.*;

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
public class FumlConfigurationFewStepsTraceFactoryImpl extends EFactoryImpl implements FumlConfigurationFewStepsTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FumlConfigurationFewStepsTraceFactory init() {
		try {
			FumlConfigurationFewStepsTraceFactory theFumlConfigurationFewStepsTraceFactory = (FumlConfigurationFewStepsTraceFactory)EPackage.Registry.INSTANCE.getEFactory(FumlConfigurationFewStepsTracePackage.eNS_URI);
			if (theFumlConfigurationFewStepsTraceFactory != null) {
				return theFumlConfigurationFewStepsTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FumlConfigurationFewStepsTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFewStepsTraceFactoryImpl() {
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
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE: return createSpecificTrace();
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
	public FumlConfigurationFewStepsTracePackage getFumlConfigurationFewStepsTracePackage() {
		return (FumlConfigurationFewStepsTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FumlConfigurationFewStepsTracePackage getPackage() {
		return FumlConfigurationFewStepsTracePackage.eINSTANCE;
	}

} //FumlConfigurationFewStepsTraceFactoryImpl
