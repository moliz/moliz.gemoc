/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.fumlConfiguration.Loci.*;

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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT: return createTracedExecutionEnvironment();
			case LociPackage.TRACED_EXECUTION_FACTORY: return createTracedExecutionFactory();
			case LociPackage.TRACED_EXECUTOR: return createTracedExecutor();
			case LociPackage.TRACED_LOCUS: return createTracedLocus();
			case LociPackage.TRACED_SEMANTIC_VISITOR: return createTracedSemanticVisitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionEnvironment createTracedExecutionEnvironment() {
		TracedExecutionEnvironmentImpl tracedExecutionEnvironment = new TracedExecutionEnvironmentImpl();
		return tracedExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionFactory createTracedExecutionFactory() {
		TracedExecutionFactoryImpl tracedExecutionFactory = new TracedExecutionFactoryImpl();
		return tracedExecutionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutor createTracedExecutor() {
		TracedExecutorImpl tracedExecutor = new TracedExecutorImpl();
		return tracedExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus createTracedLocus() {
		TracedLocusImpl tracedLocus = new TracedLocusImpl();
		return tracedLocus;
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
