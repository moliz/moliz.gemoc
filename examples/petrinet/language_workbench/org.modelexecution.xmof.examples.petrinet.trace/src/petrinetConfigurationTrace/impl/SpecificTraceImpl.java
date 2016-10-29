/**
 */
package petrinetConfigurationTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetConfigurationTrace.PetrinetConfigurationTracePackage;
import petrinetConfigurationTrace.SpecificTrace;

import petrinetConfigurationTrace.States.State;

import petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire;
import petrinetConfigurationTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.impl.SpecificTraceImpl#getPetrinetConfiguration_NetConfiguration_Main_Sequence <em>Petrinet Configuration Net Configuration Main Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.impl.SpecificTraceImpl#getPetrinetConfiguration_NetConfiguration_Run_Sequence <em>Petrinet Configuration Net Configuration Run Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.impl.SpecificTraceImpl#getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence <em>Petrinet Configuration Transition Configuration Fire Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.impl.SpecificTraceImpl#getPetrinetConfiguration_tracedPlaceConfigurations <em>Petrinet Configuration traced Place Configurations</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getPetrinetConfiguration_NetConfiguration_Main_Sequence() <em>Petrinet Configuration Net Configuration Main Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetConfiguration_NetConfiguration_Main_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PetrinetConfiguration_NetConfiguration_Main> petrinetConfiguration_NetConfiguration_Main_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetConfiguration_NetConfiguration_Run_Sequence() <em>Petrinet Configuration Net Configuration Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetConfiguration_NetConfiguration_Run_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PetrinetConfiguration_NetConfiguration_Run> petrinetConfiguration_NetConfiguration_Run_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence() <em>Petrinet Configuration Transition Configuration Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PetrinetConfiguration_TransitionConfiguration_Fire> petrinetConfiguration_TransitionConfiguration_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetConfiguration_tracedPlaceConfigurations() <em>Petrinet Configuration traced Place Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetConfiguration_tracedPlaceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlaceConfiguration> petrinetConfiguration_tracedPlaceConfigurations;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

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
		return PetrinetConfigurationTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetrinetConfiguration_NetConfiguration_Main> getPetrinetConfiguration_NetConfiguration_Main_Sequence() {
		if (petrinetConfiguration_NetConfiguration_Main_Sequence == null) {
			petrinetConfiguration_NetConfiguration_Main_Sequence = new EObjectResolvingEList<PetrinetConfiguration_NetConfiguration_Main>(PetrinetConfiguration_NetConfiguration_Main.class, this, PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE);
		}
		return petrinetConfiguration_NetConfiguration_Main_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetrinetConfiguration_NetConfiguration_Run> getPetrinetConfiguration_NetConfiguration_Run_Sequence() {
		if (petrinetConfiguration_NetConfiguration_Run_Sequence == null) {
			petrinetConfiguration_NetConfiguration_Run_Sequence = new EObjectResolvingEList<PetrinetConfiguration_NetConfiguration_Run>(PetrinetConfiguration_NetConfiguration_Run.class, this, PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE);
		}
		return petrinetConfiguration_NetConfiguration_Run_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetrinetConfiguration_TransitionConfiguration_Fire> getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence() {
		if (petrinetConfiguration_TransitionConfiguration_Fire_Sequence == null) {
			petrinetConfiguration_TransitionConfiguration_Fire_Sequence = new EObjectResolvingEList<PetrinetConfiguration_TransitionConfiguration_Fire>(PetrinetConfiguration_TransitionConfiguration_Fire.class, this, PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE);
		}
		return petrinetConfiguration_TransitionConfiguration_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlaceConfiguration> getPetrinetConfiguration_tracedPlaceConfigurations() {
		if (petrinetConfiguration_tracedPlaceConfigurations == null) {
			petrinetConfiguration_tracedPlaceConfigurations = new EObjectContainmentEList<TracedPlaceConfiguration>(TracedPlaceConfiguration.class, this, PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS);
		}
		return petrinetConfiguration_tracedPlaceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS:
				return ((InternalEList<?>)getPetrinetConfiguration_tracedPlaceConfigurations()).basicRemove(otherEnd, msgs);
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE:
				return getPetrinetConfiguration_NetConfiguration_Main_Sequence();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE:
				return getPetrinetConfiguration_NetConfiguration_Run_Sequence();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				return getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS:
				return getPetrinetConfiguration_tracedPlaceConfigurations();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE:
				getPetrinetConfiguration_NetConfiguration_Main_Sequence().clear();
				getPetrinetConfiguration_NetConfiguration_Main_Sequence().addAll((Collection<? extends PetrinetConfiguration_NetConfiguration_Main>)newValue);
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE:
				getPetrinetConfiguration_NetConfiguration_Run_Sequence().clear();
				getPetrinetConfiguration_NetConfiguration_Run_Sequence().addAll((Collection<? extends PetrinetConfiguration_NetConfiguration_Run>)newValue);
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence().clear();
				getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence().addAll((Collection<? extends PetrinetConfiguration_TransitionConfiguration_Fire>)newValue);
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS:
				getPetrinetConfiguration_tracedPlaceConfigurations().clear();
				getPetrinetConfiguration_tracedPlaceConfigurations().addAll((Collection<? extends TracedPlaceConfiguration>)newValue);
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE:
				getPetrinetConfiguration_NetConfiguration_Main_Sequence().clear();
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE:
				getPetrinetConfiguration_NetConfiguration_Run_Sequence().clear();
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence().clear();
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS:
				getPetrinetConfiguration_tracedPlaceConfigurations().clear();
				return;
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_SEQUENCE:
				return petrinetConfiguration_NetConfiguration_Main_Sequence != null && !petrinetConfiguration_NetConfiguration_Main_Sequence.isEmpty();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE:
				return petrinetConfiguration_NetConfiguration_Run_Sequence != null && !petrinetConfiguration_NetConfiguration_Run_Sequence.isEmpty();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE:
				return petrinetConfiguration_TransitionConfiguration_Fire_Sequence != null && !petrinetConfiguration_TransitionConfiguration_Fire_Sequence.isEmpty();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS:
				return petrinetConfiguration_tracedPlaceConfigurations != null && !petrinetConfiguration_tracedPlaceConfigurations.isEmpty();
			case PetrinetConfigurationTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
