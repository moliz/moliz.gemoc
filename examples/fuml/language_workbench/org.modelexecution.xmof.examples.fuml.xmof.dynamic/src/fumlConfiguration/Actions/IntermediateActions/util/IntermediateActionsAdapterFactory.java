/**
 */
package fumlConfiguration.Actions.IntermediateActions.util;

import fumlConfiguration.Actions.BasicActions.ActionActivation;

import fumlConfiguration.Actions.IntermediateActions.*;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;

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
 * @see fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
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
			public Adapter caseValueSpecificationActionActivation(ValueSpecificationActionActivation object) {
				return createValueSpecificationActionActivationAdapter();
			}
			@Override
			public Adapter caseCreateObjectActionActivation(CreateObjectActionActivation object) {
				return createCreateObjectActionActivationAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureActionActivation(StructuralFeatureActionActivation object) {
				return createStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseReadStructuralFeatureActionActivation(ReadStructuralFeatureActionActivation object) {
				return createReadStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseWriteStructuralFeatureActionActivation(WriteStructuralFeatureActionActivation object) {
				return createWriteStructuralFeatureActionActivationAdapter();
			}
			@Override
			public Adapter caseAddStructuralFeatureValueActionActivation(AddStructuralFeatureValueActionActivation object) {
				return createAddStructuralFeatureValueActionActivationAdapter();
			}
			@Override
			public Adapter caseSemanticVisitor(SemanticVisitor object) {
				return createSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation(ActivityNodeActivation object) {
				return createActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseActionActivation(ActionActivation object) {
				return createActionActivationAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation <em>Value Specification Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation
	 * @generated
	 */
	public Adapter createValueSpecificationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation <em>Create Object Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation
	 * @generated
	 */
	public Adapter createCreateObjectActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation <em>Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation <em>Read Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation <em>Write Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation <em>Add Structural Feature Value Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionActivationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation <em>Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation
	 * @generated
	 */
	public Adapter createActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Actions.BasicActions.ActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Actions.BasicActions.ActionActivation
	 * @generated
	 */
	public Adapter createActionActivationAdapter() {
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
