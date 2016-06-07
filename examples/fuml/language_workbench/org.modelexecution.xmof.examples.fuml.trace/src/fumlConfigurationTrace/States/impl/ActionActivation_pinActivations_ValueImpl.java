/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ActionActivation_pinActivations_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Activation pin Activations Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActionActivation_pinActivations_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActionActivation_pinActivations_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActionActivation_pinActivations_ValueImpl#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActionActivation_pinActivations_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionActivation_pinActivations_ValueImpl extends MinimalEObjectImpl.Container implements ActionActivation_pinActivations_Value {
	/**
	 * The cached value of the '{@link #getPinActivations() <em>Pin Activations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPinActivation> pinActivations;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionActivation_pinActivations_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActionActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT) return null;
		return (TracedActionActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActionActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActionActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE, TracedActionActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPinActivation> getPinActivations() {
		if (pinActivations == null) {
			pinActivations = new EObjectResolvingEList<TracedPinActivation>(TracedPinActivation.class, this, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS);
		}
		return pinActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES, StatesPackage.STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActionActivation)otherEnd, msgs);
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE, TracedActionActivation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				return getParent();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS:
				return getPinActivations();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				return getStates();
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
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				setParent((TracedActionActivation)newValue);
				return;
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS:
				getPinActivations().clear();
				getPinActivations().addAll((Collection<? extends TracedPinActivation>)newValue);
				return;
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				setParent((TracedActionActivation)null);
				return;
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS:
				getPinActivations().clear();
				return;
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS:
				return pinActivations != null && !pinActivations.isEmpty();
			case StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionActivation_pinActivations_ValueImpl
