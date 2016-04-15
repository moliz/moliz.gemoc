/**
 */
package fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.util;

import fumlConfiguration.Classes.Kernel.CompoundValue;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;

import fumlConfiguration.Loci.SemanticVisitor;

import fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage
 * @generated
 */
public class IntegerFunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegerFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntegerFunctionsPackage.eINSTANCE;
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
	protected IntegerFunctionsSwitch<Adapter> modelSwitch =
		new IntegerFunctionsSwitch<Adapter>() {
			@Override
			public Adapter caseIntegerPlusFunctionBehaviorExecution(IntegerPlusFunctionBehaviorExecution object) {
				return createIntegerPlusFunctionBehaviorExecutionAdapter();
			}
			@Override
			public Adapter caseIntegerGreaterFunctionBehaviorExecution(IntegerGreaterFunctionBehaviorExecution object) {
				return createIntegerGreaterFunctionBehaviorExecutionAdapter();
			}
			@Override
			public Adapter caseIntegerLessFunctionBehaviorExecution(IntegerLessFunctionBehaviorExecution object) {
				return createIntegerLessFunctionBehaviorExecutionAdapter();
			}
			@Override
			public Adapter caseSemanticVisitor(SemanticVisitor object) {
				return createSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
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
			public Adapter caseExtensionalValue(ExtensionalValue object) {
				return createExtensionalValueAdapter();
			}
			@Override
			public Adapter caseObject(fumlConfiguration.Classes.Kernel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseOpaqueBehaviorExecution(OpaqueBehaviorExecution object) {
				return createOpaqueBehaviorExecutionAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution <em>Integer Plus Function Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution
	 * @generated
	 */
	public Adapter createIntegerPlusFunctionBehaviorExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution <em>Integer Greater Function Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution
	 * @generated
	 */
	public Adapter createIntegerGreaterFunctionBehaviorExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution <em>Integer Less Function Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution
	 * @generated
	 */
	public Adapter createIntegerLessFunctionBehaviorExecutionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution <em>Opaque Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution
	 * @generated
	 */
	public Adapter createOpaqueBehaviorExecutionAdapter() {
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

} //IntegerFunctionsAdapterFactory
