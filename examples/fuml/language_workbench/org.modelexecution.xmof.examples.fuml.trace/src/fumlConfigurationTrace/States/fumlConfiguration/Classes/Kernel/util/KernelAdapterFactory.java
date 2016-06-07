/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.util;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.*;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage
 * @generated
 */
public class KernelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
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
	protected KernelSwitch<Adapter> modelSwitch =
		new KernelSwitch<Adapter>() {
			@Override
			public Adapter caseTracedBooleanValue(TracedBooleanValue object) {
				return createTracedBooleanValueAdapter();
			}
			@Override
			public Adapter caseTracedCompoundValue(TracedCompoundValue object) {
				return createTracedCompoundValueAdapter();
			}
			@Override
			public Adapter caseTracedEvaluation(TracedEvaluation object) {
				return createTracedEvaluationAdapter();
			}
			@Override
			public Adapter caseTracedExtensionalValue(TracedExtensionalValue object) {
				return createTracedExtensionalValueAdapter();
			}
			@Override
			public Adapter caseTracedFeatureValue(TracedFeatureValue object) {
				return createTracedFeatureValueAdapter();
			}
			@Override
			public Adapter caseTracedIntegerValue(TracedIntegerValue object) {
				return createTracedIntegerValueAdapter();
			}
			@Override
			public Adapter caseTracedLiteralBooleanEvaluation(TracedLiteralBooleanEvaluation object) {
				return createTracedLiteralBooleanEvaluationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralEvaluation(TracedLiteralEvaluation object) {
				return createTracedLiteralEvaluationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralIntegerEvaluation(TracedLiteralIntegerEvaluation object) {
				return createTracedLiteralIntegerEvaluationAdapter();
			}
			@Override
			public Adapter caseTracedObject(TracedObject object) {
				return createTracedObjectAdapter();
			}
			@Override
			public Adapter caseTracedPrimitiveValue(TracedPrimitiveValue object) {
				return createTracedPrimitiveValueAdapter();
			}
			@Override
			public Adapter caseTracedReference(TracedReference object) {
				return createTracedReferenceAdapter();
			}
			@Override
			public Adapter caseTracedStructuredValue(TracedStructuredValue object) {
				return createTracedStructuredValueAdapter();
			}
			@Override
			public Adapter caseTracedValue(TracedValue object) {
				return createTracedValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue
	 * @generated
	 */
	public Adapter createTracedBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue <em>Traced Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue
	 * @generated
	 */
	public Adapter createTracedCompoundValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation <em>Traced Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation
	 * @generated
	 */
	public Adapter createTracedEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue <em>Traced Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue
	 * @generated
	 */
	public Adapter createTracedExtensionalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue <em>Traced Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue
	 * @generated
	 */
	public Adapter createTracedFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue <em>Traced Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue
	 * @generated
	 */
	public Adapter createTracedIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation <em>Traced Literal Boolean Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation
	 * @generated
	 */
	public Adapter createTracedLiteralBooleanEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation <em>Traced Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation
	 * @generated
	 */
	public Adapter createTracedLiteralEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation <em>Traced Literal Integer Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation
	 * @generated
	 */
	public Adapter createTracedLiteralIntegerEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue <em>Traced Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue
	 * @generated
	 */
	public Adapter createTracedPrimitiveValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference <em>Traced Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference
	 * @generated
	 */
	public Adapter createTracedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue <em>Traced Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue
	 * @generated
	 */
	public Adapter createTracedStructuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue
	 * @generated
	 */
	public Adapter createTracedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor <em>Traced Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor
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

} //KernelAdapterFactory
