/**
 */
package fumlConfigurationFewSteps.LociFewSteps.impl;

import fumlConfigurationFewSteps.LociFewSteps.*;

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
			case LociFewStepsPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case LociFewStepsPackage.LOCUS: return createLocus();
			case LociFewStepsPackage.EXECUTOR: return createExecutor();
			case LociFewStepsPackage.EXECUTION_FACTORY: return createExecutionFactory();
			case LociFewStepsPackage.SEMANTIC_VISITOR: return createSemanticVisitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus createLocus() {
		LocusImpl locus = new LocusImpl();
		return locus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor createExecutor() {
		ExecutorImpl executor = new ExecutorImpl();
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory createExecutionFactory() {
		ExecutionFactoryImpl executionFactory = new ExecutionFactoryImpl();
		return executionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVisitor createSemanticVisitor() {
		SemanticVisitorImpl semanticVisitor = new SemanticVisitorImpl();
		return semanticVisitor;
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
