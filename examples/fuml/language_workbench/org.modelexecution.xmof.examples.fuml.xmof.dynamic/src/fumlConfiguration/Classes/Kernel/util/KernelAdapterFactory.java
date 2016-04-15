/**
 */
package fumlConfiguration.Classes.Kernel.util;

import fumlConfiguration.Classes.Kernel.BooleanValue;
import fumlConfiguration.Classes.Kernel.CompoundValue;
import fumlConfiguration.Classes.Kernel.Evaluation;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.FeatureValue;
import fumlConfiguration.Classes.Kernel.IntegerValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation;
import fumlConfiguration.Classes.Kernel.LiteralEvaluation;
import fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation;
import fumlConfiguration.Classes.Kernel.PrimitiveValue;
import fumlConfiguration.Classes.Kernel.Reference;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.Loci.SemanticVisitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.Classes.Kernel.KernelPackage
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
			public Adapter caseExtensionalValue(ExtensionalValue object) {
				return createExtensionalValueAdapter();
			}
			@Override
			public Adapter caseObject(fumlConfiguration.Classes.Kernel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseStructuredValue(StructuredValue object) {
				return createStructuredValueAdapter();
			}
			@Override
			public Adapter caseCompoundValue(CompoundValue object) {
				return createCompoundValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseLiteralIntegerEvaluation(LiteralIntegerEvaluation object) {
				return createLiteralIntegerEvaluationAdapter();
			}
			@Override
			public Adapter caseLiteralEvaluation(LiteralEvaluation object) {
				return createLiteralEvaluationAdapter();
			}
			@Override
			public Adapter casePrimitiveValue(PrimitiveValue object) {
				return createPrimitiveValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseFeatureValue(FeatureValue object) {
				return createFeatureValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseLiteralBooleanEvaluation(LiteralBooleanEvaluation object) {
				return createLiteralBooleanEvaluationAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseSemanticVisitor(SemanticVisitor object) {
				return createSemanticVisitorAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.ExtensionalValue <em>Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.ExtensionalValue
	 * @generated
	 */
	public Adapter createExtensionalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.StructuredValue <em>Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.StructuredValue
	 * @generated
	 */
	public Adapter createStructuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.CompoundValue <em>Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.CompoundValue
	 * @generated
	 */
	public Adapter createCompoundValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation <em>Literal Integer Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation
	 * @generated
	 */
	public Adapter createLiteralIntegerEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.LiteralEvaluation <em>Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.LiteralEvaluation
	 * @generated
	 */
	public Adapter createLiteralEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.PrimitiveValue
	 * @generated
	 */
	public Adapter createPrimitiveValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.FeatureValue
	 * @generated
	 */
	public Adapter createFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation <em>Literal Boolean Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation
	 * @generated
	 */
	public Adapter createLiteralBooleanEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Classes.Kernel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Classes.Kernel.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Loci.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Loci.SemanticVisitor
	 * @generated
	 */
	public Adapter createSemanticVisitorAdapter() {
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
