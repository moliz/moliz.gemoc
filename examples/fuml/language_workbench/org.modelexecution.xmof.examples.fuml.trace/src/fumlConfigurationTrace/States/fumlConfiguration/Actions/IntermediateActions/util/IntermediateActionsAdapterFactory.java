/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.util;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.*;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public class IntermediateActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediateActionsPackage.eINSTANCE;
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
	protected IntermediateActionsSwitch<Adapter> modelSwitch =
		new IntermediateActionsSwitch<Adapter>() {
			@Override
			public Adapter caseTracedAddStructuralFeatureValueActionActivation(TracedAddStructuralFeatureValueActionActivation object) {
				return createTracedAddStructuralFeatureValueActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedCreateObjectActionActivation(TracedCreateObjectActionActivation object) {
				return createTracedCreateObjectActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedReadStructuralFeatureActionActivation(TracedReadStructuralFeatureActionActivation object) {
				return createTracedReadStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedStructuralFeatureActionActivation(TracedStructuralFeatureActionActivation object) {
				return createTracedStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedValueSpecificationActionActivation(TracedValueSpecificationActionActivation object) {
				return createTracedValueSpecificationActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedWriteStructuralFeatureActionActivation(TracedWriteStructuralFeatureActionActivation object) {
				return createTracedWriteStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedSemanticVisitor(TracedSemanticVisitor object) {
				return createTracedSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseTracedActivityNodeActivation(TracedActivityNodeActivation object) {
				return createTracedActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseTracedActionActivation(TracedActionActivation object) {
				return createTracedActionActivationAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation <em>Traced Add Structural Feature Value Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation
	 * @generated
	 */
	public Adapter createTracedAddStructuralFeatureValueActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation <em>Traced Create Object Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation
	 * @generated
	 */
	public Adapter createTracedCreateObjectActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation <em>Traced Read Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createTracedReadStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedStructuralFeatureActionActivation <em>Traced Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createTracedStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation <em>Traced Value Specification Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation
	 * @generated
	 */
	public Adapter createTracedValueSpecificationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedWriteStructuralFeatureActionActivation <em>Traced Write Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedWriteStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createTracedWriteStructuralFeatureActionActivationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation <em>Traced Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation
	 * @generated
	 */
	public Adapter createTracedActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation <em>Traced Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation
	 * @generated
	 */
	public Adapter createTracedActionActivationAdapter() {
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

} //IntermediateActionsAdapterFactory
