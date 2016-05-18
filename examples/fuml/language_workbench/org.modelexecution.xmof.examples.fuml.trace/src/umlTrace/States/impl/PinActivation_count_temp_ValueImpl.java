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

import umlTrace.States.PinActivation_count_temp_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin Activation count temp Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl#getCount_temp <em>Count temp</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.PinActivation_count_temp_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinActivation_count_temp_ValueImpl extends MinimalEObjectImpl.Container implements PinActivation_count_temp_Value {
	/**
	 * The default value of the '{@link #getCount_temp() <em>Count temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount_temp()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_TEMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount_temp() <em>Count temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount_temp()
	 * @generated
	 * @ordered
	 */
	protected int count_temp = COUNT_TEMP_EDEFAULT;

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
	protected PinActivation_count_temp_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.PIN_ACTIVATION_COUNT_TEMP_VALUE;
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
	public int getCount_temp() {
		return count_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount_temp(int newCount_temp) {
		int oldCount_temp = count_temp;
		count_temp = newCount_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP, oldCount_temp, count_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPinActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT) return null;
		return (TracedPinActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedPinActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedPinActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE, TracedPinActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES, StatesPackage.STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES);
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedPinActivation)otherEnd, msgs);
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE, TracedPinActivation.class, msgs);
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP:
				return getCount_temp();
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				return getParent();
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP:
				setCount_temp((Integer)newValue);
				return;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				setParent((TracedPinActivation)newValue);
				return;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP:
				setCount_temp(COUNT_TEMP_EDEFAULT);
				return;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				setParent((TracedPinActivation)null);
				return;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
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
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP:
				return count_temp != COUNT_TEMP_EDEFAULT;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count_temp: ");
		result.append(count_temp);
		result.append(')');
		return result.toString();
	}

} //PinActivation_count_temp_ValueImpl
