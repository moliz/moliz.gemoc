/**
 */
package fsmConfigurationTrace.States.util;

import fr.inria.diverse.trace.commons.model.trace.Dimension;
import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.commons.model.trace.Value;

import fsmConfigurationTrace.States.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.States.StatesPackage
 * @generated
 */
public class StatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
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
	protected StatesSwitch<Adapter> modelSwitch =
		new StatesSwitch<Adapter>() {
			@Override
			public Adapter caseFSMConfiguration_acceptedSequence_Dimension(FSMConfiguration_acceptedSequence_Dimension object) {
				return createFSMConfiguration_acceptedSequence_DimensionAdapter();
			}
			@Override
			public Adapter caseFSMConfiguration_acceptedSequence_Value(FSMConfiguration_acceptedSequence_Value object) {
				return createFSMConfiguration_acceptedSequence_ValueAdapter();
			}
			@Override
			public Adapter caseFSMConfiguration_currentState_Dimension(FSMConfiguration_currentState_Dimension object) {
				return createFSMConfiguration_currentState_DimensionAdapter();
			}
			@Override
			public Adapter caseFSMConfiguration_currentState_Value(FSMConfiguration_currentState_Value object) {
				return createFSMConfiguration_currentState_ValueAdapter();
			}
			@Override
			public Adapter caseFSMConfiguration_producedSequence_Dimension(FSMConfiguration_producedSequence_Dimension object) {
				return createFSMConfiguration_producedSequence_DimensionAdapter();
			}
			@Override
			public Adapter caseFSMConfiguration_producedSequence_Value(FSMConfiguration_producedSequence_Value object) {
				return createFSMConfiguration_producedSequence_ValueAdapter();
			}
			@Override
			public Adapter caseInput_stringSeq_Dimension(Input_stringSeq_Dimension object) {
				return createInput_stringSeq_DimensionAdapter();
			}
			@Override
			public Adapter caseInput_stringSeq_Value(Input_stringSeq_Value object) {
				return createInput_stringSeq_ValueAdapter();
			}
			@Override
			public Adapter caseSpecificAttributeValue(SpecificAttributeValue object) {
				return createSpecificAttributeValueAdapter();
			}
			@Override
			public <ValueSubType extends SpecificValue> Adapter caseSpecificDimension(SpecificDimension<ValueSubType> object) {
				return createSpecificDimensionAdapter();
			}
			@Override
			public <T> Adapter caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
				return createSpecificReferenceValueAdapter();
			}
			@Override
			public Adapter caseSpecificState(SpecificState object) {
				return createSpecificStateAdapter();
			}
			@Override
			public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> Adapter caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
				return createSpecificTracedObjectAdapter();
			}
			@Override
			public Adapter caseSpecificValue(SpecificValue object) {
				return createSpecificValueAdapter();
			}
			@Override
			public <ValueSubType extends Value<?>> Adapter caseDimension(Dimension<ValueSubType> object) {
				return createDimensionAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseValue(Value<StateSubType> object) {
				return createValueAdapter();
			}
			@Override
			public <StepSubType extends Step<?>, ValueSubType extends Value<?>> Adapter caseState(State<StepSubType, ValueSubType> object) {
				return createStateAdapter();
			}
			@Override
			public <DimensionSubType extends Dimension<?>> Adapter caseTracedObject(TracedObject<DimensionSubType> object) {
				return createTracedObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension
	 * @generated
	 */
	public Adapter createFSMConfiguration_acceptedSequence_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value <em>FSM Configuration accepted Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value
	 * @generated
	 */
	public Adapter createFSMConfiguration_acceptedSequence_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension
	 * @generated
	 */
	public Adapter createFSMConfiguration_currentState_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_currentState_Value <em>FSM Configuration current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_currentState_Value
	 * @generated
	 */
	public Adapter createFSMConfiguration_currentState_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension
	 * @generated
	 */
	public Adapter createFSMConfiguration_producedSequence_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value <em>FSM Configuration produced Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value
	 * @generated
	 */
	public Adapter createFSMConfiguration_producedSequence_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.Input_stringSeq_Dimension <em>Input string Seq Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.Input_stringSeq_Dimension
	 * @generated
	 */
	public Adapter createInput_stringSeq_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.Input_stringSeq_Value <em>Input string Seq Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.Input_stringSeq_Value
	 * @generated
	 */
	public Adapter createInput_stringSeq_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificAttributeValue
	 * @generated
	 */
	public Adapter createSpecificAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificDimension
	 * @generated
	 */
	public Adapter createSpecificDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificReferenceValue
	 * @generated
	 */
	public Adapter createSpecificReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificState
	 * @generated
	 */
	public Adapter createSpecificStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificTracedObject
	 * @generated
	 */
	public Adapter createSpecificTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmConfigurationTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmConfigurationTrace.States.SpecificValue
	 * @generated
	 */
	public Adapter createSpecificValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
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

} //StatesAdapterFactory
