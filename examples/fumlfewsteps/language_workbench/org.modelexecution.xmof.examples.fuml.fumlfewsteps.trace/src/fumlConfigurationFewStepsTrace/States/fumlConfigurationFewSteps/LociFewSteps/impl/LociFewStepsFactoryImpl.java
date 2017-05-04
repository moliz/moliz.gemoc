/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.*;

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
public class LociFewStepsFactoryImpl extends EFactoryImpl implements LociFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LociFewStepsFactory init() {
		try {
			LociFewStepsFactory theLociFewStepsFactory = (LociFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(LociFewStepsPackage.eNS_URI);
			if (theLociFewStepsFactory != null) {
				return theLociFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LociFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociFewStepsFactoryImpl() {
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
			case LociFewStepsPackage.TRACED_SEMANTIC_VISITOR: return createTracedSemanticVisitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSemanticVisitor createTracedSemanticVisitor() {
		TracedSemanticVisitorImpl tracedSemanticVisitor = new TracedSemanticVisitorImpl();
		return tracedSemanticVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociFewStepsPackage getLociFewStepsPackage() {
		return (LociFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LociFewStepsPackage getPackage() {
		return LociFewStepsPackage.eINSTANCE;
	}

} //LociFewStepsFactoryImpl
