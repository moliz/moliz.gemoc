/**
 */
package fsmConfigurationTrace.Steps.impl;

import fsmConfiguration.TransitionConfiguration;

import fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire;
import fsmConfigurationTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fsm Configuration Transition Configuration Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FsmConfiguration_TransitionConfiguration_FireImpl extends SpecificStepImpl implements FsmConfiguration_TransitionConfiguration_Fire {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FsmConfiguration_TransitionConfiguration_FireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionConfiguration getCaller() {
		return (fsmConfiguration.TransitionConfiguration) this.getMseoccurrence().getMse().getCaller();
	}

} //FsmConfiguration_TransitionConfiguration_FireImpl
