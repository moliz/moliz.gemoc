/**
 */
package umlTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.PinActivation_actionActivation_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin Activation action Activation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl#getActionActivation <em>Action Activation</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_actionActivation_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinActivation_actionActivation_ValueImpl extends MinimalEObjectImpl.Container implements PinActivation_actionActivation_Value {
	/**
	 * The cached value of the '{@link #getActionActivation() <em>Action Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivation()
	 * @generated
	 * @ordered
	 */
	protected TracedActionActivation actionActivation;

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
	protected PinActivation_actionActivation_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE;
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
	public TracedActionActivation getActionActivation() {
		if (actionActivation != null && actionActivation.eIsProxy()) {
			InternalEObject oldActionActivation = (InternalEObject)actionActivation;
			actionActivation = (TracedActionActivation)eResolveProxy(oldActionActivation);
			if (actionActivation != oldActionActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION, oldActionActivation, actionActivation));
			}
		}
		return actionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActionActivation basicGetActionActivation() {
		return actionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionActivation(TracedActionActivation newActionActivation) {
		TracedActionActivation oldActionActivation = actionActivation;
		actionActivation = newActionActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION, oldActionActivation, actionActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPinActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT) return null;
		return (TracedPinActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedPinActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedPinActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE, TracedPinActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES, StatesPackage.STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES);
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedPinActivation)otherEnd, msgs);
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE, TracedPinActivation.class, msgs);
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION:
				if (resolve) return getActionActivation();
				return basicGetActionActivation();
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				return getParent();
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION:
				setActionActivation((TracedActionActivation)newValue);
				return;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				setParent((TracedPinActivation)newValue);
				return;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION:
				setActionActivation((TracedActionActivation)null);
				return;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				setParent((TracedPinActivation)null);
				return;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION:
				return actionActivation != null;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PinActivation_actionActivation_ValueImpl
