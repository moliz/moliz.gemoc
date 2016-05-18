/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.*;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage
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
			public Adapter caseTracedActivityEdgeInstance(TracedActivityEdgeInstance object) {
				return createTracedActivityEdgeInstanceAdapter();
			}
			@Override
			public Adapter caseTracedActivityExecution(TracedActivityExecution object) {
				return createTracedActivityExecutionAdapter();
			}
			@Override
			public Adapter caseTracedActivityNodeActivation(TracedActivityNodeActivation object) {
				return createTracedActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseTracedActivityNodeActivationGroup(TracedActivityNodeActivationGroup object) {
				return createTracedActivityNodeActivationGroupAdapter();
			}
			@Override
			public Adapter caseTracedForkedToken(TracedForkedToken object) {
				return createTracedForkedTokenAdapter();
			}
			@Override
			public Adapter caseTracedObjectNodeActivation(TracedObjectNodeActivation object) {
				return createTracedObjectNodeActivationAdapter();
			}
			@Override
			public Adapter caseTracedObjectToken(TracedObjectToken object) {
				return createTracedObjectTokenAdapter();
			}
			@Override
			public Adapter caseTracedOffer(TracedOffer object) {
				return createTracedOfferAdapter();
			}
			@Override
			public Adapter caseTracedToken(TracedToken object) {
				return createTracedTokenAdapter();
			}
			@Override
			public Adapter caseTracedSemanticVisitor(TracedSemanticVisitor object) {
				return createTracedSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseTracedValue(TracedValue object) {
				return createTracedValueAdapter();
			}
			@Override
			public Adapter caseTracedStructuredValue(TracedStructuredValue object) {
				return createTracedStructuredValueAdapter();
			}
			@Override
			public Adapter caseTracedCompoundValue(TracedCompoundValue object) {
				return createTracedCompoundValueAdapter();
			}
			@Override
			public Adapter caseTracedExtensionalValue(TracedExtensionalValue object) {
				return createTracedExtensionalValueAdapter();
			}
			@Override
			public Adapter caseTracedObject(TracedObject object) {
				return createTracedObjectAdapter();
			}
			@Override
			public Adapter caseTracedExecution(TracedExecution object) {
				return createTracedExecutionAdapter();
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
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance <em>Traced Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance
	 * @generated
	 */
	public Adapter createTracedActivityEdgeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution <em>Traced Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution
	 * @generated
	 */
	public Adapter createTracedActivityExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation <em>Traced Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation
	 * @generated
	 */
	public Adapter createTracedActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup <em>Traced Activity Node Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup
	 * @generated
	 */
	public Adapter createTracedActivityNodeActivationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken <em>Traced Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken
	 * @generated
	 */
	public Adapter createTracedForkedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation <em>Traced Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation
	 * @generated
	 */
	public Adapter createTracedObjectNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken <em>Traced Object Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken
	 * @generated
	 */
	public Adapter createTracedObjectTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer <em>Traced Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer
	 * @generated
	 */
	public Adapter createTracedOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken
	 * @generated
	 */
	public Adapter createTracedTokenAdapter() {
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
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue
	 * @generated
	 */
	public Adapter createTracedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue <em>Traced Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue
	 * @generated
	 */
	public Adapter createTracedStructuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue <em>Traced Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue
	 * @generated
	 */
	public Adapter createTracedCompoundValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue <em>Traced Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue
	 * @generated
	 */
	public Adapter createTracedExtensionalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution <em>Traced Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution
	 * @generated
	 */
	public Adapter createTracedExecutionAdapter() {
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
