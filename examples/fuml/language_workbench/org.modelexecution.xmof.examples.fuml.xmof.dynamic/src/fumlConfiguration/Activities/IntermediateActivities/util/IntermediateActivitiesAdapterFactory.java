/**
 */
package fumlConfiguration.Activities.IntermediateActivities.util;

import fumlConfiguration.Activities.IntermediateActivities.*;

import fumlConfiguration.Classes.Kernel.CompoundValue;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;

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
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
 * @generated
 */
public class IntermediateActivitiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediateActivitiesPackage.eINSTANCE;
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
	protected IntermediateActivitiesSwitch<Adapter> modelSwitch =
		new IntermediateActivitiesSwitch<Adapter>() {
			@Override
			public Adapter caseActivityExecution(ActivityExecution object) {
				return createActivityExecutionAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivationGroup(ActivityNodeActivationGroup object) {
				return createActivityNodeActivationGroupAdapter();
			}
			@Override
			public Adapter caseActivityParameterNodeActivation(ActivityParameterNodeActivation object) {
				return createActivityParameterNodeActivationAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation(ActivityNodeActivation object) {
				return createActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseActivityEdgeInstance(ActivityEdgeInstance object) {
				return createActivityEdgeInstanceAdapter();
			}
			@Override
			public Adapter caseControlNodeActivation(ControlNodeActivation object) {
				return createControlNodeActivationAdapter();
			}
			@Override
			public Adapter caseObjectNodeActivation(ObjectNodeActivation object) {
				return createObjectNodeActivationAdapter();
			}
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
			}
			@Override
			public Adapter caseDecisionNodeActivation(DecisionNodeActivation object) {
				return createDecisionNodeActivationAdapter();
			}
			@Override
			public Adapter caseControlToken(ControlToken object) {
				return createControlTokenAdapter();
			}
			@Override
			public Adapter caseObjectToken(ObjectToken object) {
				return createObjectTokenAdapter();
			}
			@Override
			public Adapter caseForkedToken(ForkedToken object) {
				return createForkedTokenAdapter();
			}
			@Override
			public Adapter caseInitialNodeActivation(InitialNodeActivation object) {
				return createInitialNodeActivationAdapter();
			}
			@Override
			public Adapter caseMergeNodeActivation(MergeNodeActivation object) {
				return createMergeNodeActivationAdapter();
			}
			@Override
			public Adapter caseJoinNodeActivation(JoinNodeActivation object) {
				return createJoinNodeActivationAdapter();
			}
			@Override
			public Adapter caseForkNodeActivation(ForkNodeActivation object) {
				return createForkNodeActivationAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeActivation(ActivityFinalNodeActivation object) {
				return createActivityFinalNodeActivationAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityExecution
	 * @generated
	 */
	public Adapter createActivityExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup <em>Activity Node Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup
	 * @generated
	 */
	public Adapter createActivityNodeActivationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation <em>Activity Parameter Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation
	 * @generated
	 */
	public Adapter createActivityParameterNodeActivationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance <em>Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance
	 * @generated
	 */
	public Adapter createActivityEdgeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation <em>Control Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation
	 * @generated
	 */
	public Adapter createControlNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation <em>Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation
	 * @generated
	 */
	public Adapter createObjectNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation <em>Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation
	 * @generated
	 */
	public Adapter createDecisionNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ControlToken
	 * @generated
	 */
	public Adapter createControlTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectToken <em>Object Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ObjectToken
	 * @generated
	 */
	public Adapter createObjectTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkedToken
	 * @generated
	 */
	public Adapter createForkedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation <em>Initial Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation
	 * @generated
	 */
	public Adapter createInitialNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation <em>Merge Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation
	 * @generated
	 */
	public Adapter createMergeNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation <em>Join Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation
	 * @generated
	 */
	public Adapter createJoinNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation <em>Fork Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation
	 * @generated
	 */
	public Adapter createForkNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation <em>Activity Final Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation
	 * @generated
	 */
	public Adapter createActivityFinalNodeActivationAdapter() {
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

} //IntermediateActivitiesAdapterFactory
