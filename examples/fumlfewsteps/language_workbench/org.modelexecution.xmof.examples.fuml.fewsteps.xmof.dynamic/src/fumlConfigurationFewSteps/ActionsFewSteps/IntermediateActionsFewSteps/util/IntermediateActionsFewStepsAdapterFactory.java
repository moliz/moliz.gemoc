/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.util;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation;

import fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.*;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation;

import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.IntermediateActionsFewStepsPackage
 * @generated
 */
public class IntermediateActionsFewStepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActionsFewStepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFewStepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediateActionsFewStepsPackage.eINSTANCE;
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
	protected IntermediateActionsFewStepsSwitch<Adapter> modelSwitch =
		new IntermediateActionsFewStepsSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ValueSpecificationActionActivation <em>Value Specification Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ValueSpecificationActionActivation
	 * @generated
	 */
	public Adapter createValueSpecificationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.CreateObjectActionActivation <em>Create Object Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.CreateObjectActionActivation
	 * @generated
	 */
	public Adapter createCreateObjectActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.StructuralFeatureActionActivation <em>Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.StructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ReadStructuralFeatureActionActivation <em>Read Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.ReadStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.WriteStructuralFeatureActionActivation <em>Write Structural Feature Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.WriteStructuralFeatureActionActivation
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.AddStructuralFeatureValueActionActivation <em>Add Structural Feature Value Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.IntermediateActionsFewSteps.AddStructuralFeatureValueActionActivation
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor
	 * @generated
	 */
	public Adapter createSemanticVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation <em>Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation
	 * @generated
	 */
	public Adapter createActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation
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

} //IntermediateActionsFewStepsAdapterFactory
