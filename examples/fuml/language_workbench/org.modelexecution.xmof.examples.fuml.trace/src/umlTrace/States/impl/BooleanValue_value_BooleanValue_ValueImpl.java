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

import umlTrace.States.BooleanValue_value_BooleanValue_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value value Boolean Value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link umlTrace.States.impl.BooleanValue_value_BooleanValue_ValueImpl#isValue_BooleanValue <em>Value Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanValue_value_BooleanValue_ValueImpl extends MinimalEObjectImpl.Container implements BooleanValue_value_BooleanValue_Value {
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
	 * The default value of the '{@link #isValue_BooleanValue() <em>Value Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue_BooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue_BooleanValue() <em>Value Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue_BooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value_BooleanValue = VALUE_BOOLEAN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValue_value_BooleanValue_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE;
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
	public TracedBooleanValue getParent() {
		if (eContainerFeatureID() != StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT) return null;
		return (TracedBooleanValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedBooleanValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedBooleanValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE, TracedBooleanValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES, StatesPackage.STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue_BooleanValue() {
		return value_BooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_BooleanValue(boolean newValue_BooleanValue) {
		boolean oldValue_BooleanValue = value_BooleanValue;
		value_BooleanValue = newValue_BooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE, oldValue_BooleanValue, value_BooleanValue));
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedBooleanValue)otherEnd, msgs);
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE, TracedBooleanValue.class, msgs);
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
				return getStates();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE:
				return isValue_BooleanValue();
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				setParent((TracedBooleanValue)newValue);
				return;
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE:
				setValue_BooleanValue((Boolean)newValue);
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				setParent((TracedBooleanValue)null);
				return;
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
				getStates().clear();
				return;
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE:
				setValue_BooleanValue(VALUE_BOOLEAN_VALUE_EDEFAULT);
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
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
			case StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE:
				return value_BooleanValue != VALUE_BOOLEAN_VALUE_EDEFAULT;
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
		result.append(" (value_BooleanValue: ");
		result.append(value_BooleanValue);
		result.append(')');
		return result.toString();
	}

} //BooleanValue_value_BooleanValue_ValueImpl
