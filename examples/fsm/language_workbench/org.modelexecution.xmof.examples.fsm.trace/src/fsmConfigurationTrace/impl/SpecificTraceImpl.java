/**
 */
package fsmConfigurationTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import fsmConfigurationTrace.FsmConfigurationTracePackage;
import fsmConfigurationTrace.SpecificTrace;

import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificState;
import fsmConfigurationTrace.States.SpecificTracedObject;
import fsmConfigurationTrace.States.SpecificValue;

import fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run;
import fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire;
import fsmConfigurationTrace.Steps.SpecificStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.impl.SpecificTraceImpl#getFsmConfiguration_FSMConfiguration_Run_Sequence <em>Fsm Configuration FSM Configuration Run Sequence</em>}</li>
 *   <li>{@link fsmConfigurationTrace.impl.SpecificTraceImpl#getFsmConfiguration_TransitionConfiguration_Fire_Sequence <em>Fsm Configuration Transition Configuration Fire Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getFsmConfiguration_FSMConfiguration_Run_Sequence() <em>Fsm Configuration FSM Configuration Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmConfiguration_FSMConfiguration_Run_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FsmConfiguration_FSMConfiguration_Run> fsmConfiguration_FSMConfiguration_Run_Sequence;

	/**
	 * The cached value of the '{@link #getFsmConfiguration_TransitionConfiguration_Fire_Sequence() <em>Fsm Configuration Transition Configuration Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsmConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FsmConfiguration_TransitionConfiguration_Fire> fsmConfiguration_TransitionConfiguration_Fire_Sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmConfigurationTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<? extends SpecificStep, ? extends SpecificState> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>> getTracedObjects() {
		if (tracedObjects == null) {
			tracedObjects = new EObjectContainmentEList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>>(SpecificTracedObject.class, this, FsmConfigurationTracePackage.SPECIFIC_TRACE__TRACED_OBJECTS);
		}
		return tracedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<SpecificState>(SpecificState.class, this, FsmConfigurationTracePackage.SPECIFIC_TRACE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FsmConfiguration_FSMConfiguration_Run> getFsmConfiguration_FSMConfiguration_Run_Sequence() {
		if (fsmConfiguration_FSMConfiguration_Run_Sequence == null) {
			fsmConfiguration_FSMConfiguration_Run_Sequence = new EObjectResolvingEList<FsmConfiguration_FSMConfiguration_Run>(FsmConfiguration_FSMConfiguration_Run.class, this, FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE);
		}
		return fsmConfiguration_FSMConfiguration_Run_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FsmConfiguration_TransitionConfiguration_Fire> getFsmConfiguration_TransitionConfiguration_Fire_Sequence() {
		if (fsmConfiguration_TransitionConfiguration_Fire_Sequence == null) {
			fsmConfiguration_TransitionConfiguration_Fire_Sequence = new EObjectResolvingEList<FsmConfiguration_TransitionConfiguration_Fire>(FsmConfiguration_TransitionConfiguration_Fire.class, this, FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE);
		}
		return fsmConfiguration_TransitionConfiguration_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE:
				return getFsmConfiguration_FSMConfiguration_Run_Sequence();
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				return getFsmConfiguration_TransitionConfiguration_Fire_Sequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE:
				getFsmConfiguration_FSMConfiguration_Run_Sequence().clear();
				getFsmConfiguration_FSMConfiguration_Run_Sequence().addAll((Collection<? extends FsmConfiguration_FSMConfiguration_Run>)newValue);
				return;
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				getFsmConfiguration_TransitionConfiguration_Fire_Sequence().clear();
				getFsmConfiguration_TransitionConfiguration_Fire_Sequence().addAll((Collection<? extends FsmConfiguration_TransitionConfiguration_Fire>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE:
				getFsmConfiguration_FSMConfiguration_Run_Sequence().clear();
				return;
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				getFsmConfiguration_TransitionConfiguration_Fire_Sequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE:
				return fsmConfiguration_FSMConfiguration_Run_Sequence != null && !fsmConfiguration_FSMConfiguration_Run_Sequence.isEmpty();
			case FsmConfigurationTracePackage.SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				return fsmConfiguration_TransitionConfiguration_Fire_Sequence != null && !fsmConfiguration_TransitionConfiguration_Fire_Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
