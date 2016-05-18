/**
 */
package umlTrace.States.fumlConfiguration.Loci.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.fumlConfiguration.Loci.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage
 * @generated
 */
public class LociAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LociPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LociPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LociSwitch<Adapter> modelSwitch =
		new LociSwitch<Adapter>() {
			@Override
			public Adapter caseTracedExecutionEnvironment(TracedExecutionEnvironment object) {
				return createTracedExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseTracedExecutionFactory(TracedExecutionFactory object) {
				return createTracedExecutionFactoryAdapter();
			}
			@Override
			public Adapter caseTracedExecutor(TracedExecutor object) {
				return createTracedExecutorAdapter();
			}
			@Override
			public Adapter caseTracedLocus(TracedLocus object) {
				return createTracedLocusAdapter();
			}
			@Override
			public Adapter caseTracedSemanticVisitor(TracedSemanticVisitor object) {
				return createTracedSemanticVisitorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment <em>Traced Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment
	 * @generated
	 */
	public Adapter createTracedExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory <em>Traced Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory
	 * @generated
	 */
	public Adapter createTracedExecutionFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor <em>Traced Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutor
	 * @generated
	 */
	public Adapter createTracedExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus <em>Traced Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus
	 * @generated
	 */
	public Adapter createTracedLocusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor <em>Traced Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor
	 * @generated
	 */
	public Adapter createTracedSemanticVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LociAdapterFactory