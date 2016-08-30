/**
 */
package fumlConfiguration.Loci.impl;

import fumlConfiguration.Loci.*;

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
public class LociFactoryImpl extends EFactoryImpl implements LociFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LociFactory init() {
		try {
			LociFactory theLociFactory = (LociFactory)EPackage.Registry.INSTANCE.getEFactory(LociPackage.eNS_URI);
			if (theLociFactory != null) {
				return theLociFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LociFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociFactoryImpl() {
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
			case LociPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case LociPackage.LOCUS: return createLocus();
			case LociPackage.EXECUTOR: return createExecutor();
			case LociPackage.EXECUTION_FACTORY: return createExecutionFactory();
			case LociPackage.SEMANTIC_VISITOR: return createSemanticVisitor();
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
	public LociPackage getLociPackage() {
		return (LociPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LociPackage getPackage() {
		return LociPackage.eINSTANCE;
	}

} //LociFactoryImpl
