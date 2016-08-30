/**
 */
package org.modelexecution.xmof.examples.iml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelexecution.xmof.examples.iml.Event;
import org.modelexecution.xmof.examples.iml.ImlPackage;
import org.modelexecution.xmof.examples.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.StateTransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.StateTransitionImpl#getBooleanGuard <em>Boolean Guard</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.StateTransitionImpl#getEventGuard <em>Event Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionImpl extends IdentifyableElementImpl implements StateTransition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooleanGuard() <em>Boolean Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanGuard()
	 * @generated
	 * @ordered
	 */
	protected Variable booleanGuard;

	/**
	 * The cached value of the '{@link #getEventGuard() <em>Event Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGuard()
	 * @generated
	 * @ordered
	 */
	protected Event eventGuard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.STATE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE_TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getBooleanGuard() {
		if (booleanGuard != null && booleanGuard.eIsProxy()) {
			InternalEObject oldBooleanGuard = (InternalEObject)booleanGuard;
			booleanGuard = (Variable)eResolveProxy(oldBooleanGuard);
			if (booleanGuard != oldBooleanGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD, oldBooleanGuard, booleanGuard));
			}
		}
		return booleanGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetBooleanGuard() {
		return booleanGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanGuard(Variable newBooleanGuard) {
		Variable oldBooleanGuard = booleanGuard;
		booleanGuard = newBooleanGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD, oldBooleanGuard, booleanGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEventGuard() {
		if (eventGuard != null && eventGuard.eIsProxy()) {
			InternalEObject oldEventGuard = (InternalEObject)eventGuard;
			eventGuard = (Event)eResolveProxy(oldEventGuard);
			if (eventGuard != oldEventGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImlPackage.STATE_TRANSITION__EVENT_GUARD, oldEventGuard, eventGuard));
			}
		}
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEventGuard() {
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventGuard(Event newEventGuard) {
		Event oldEventGuard = eventGuard;
		eventGuard = newEventGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE_TRANSITION__EVENT_GUARD, oldEventGuard, eventGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.STATE_TRANSITION__NAME:
				return getName();
			case ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD:
				if (resolve) return getBooleanGuard();
				return basicGetBooleanGuard();
			case ImlPackage.STATE_TRANSITION__EVENT_GUARD:
				if (resolve) return getEventGuard();
				return basicGetEventGuard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImlPackage.STATE_TRANSITION__NAME:
				setName((String)newValue);
				return;
			case ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD:
				setBooleanGuard((Variable)newValue);
				return;
			case ImlPackage.STATE_TRANSITION__EVENT_GUARD:
				setEventGuard((Event)newValue);
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
			case ImlPackage.STATE_TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD:
				setBooleanGuard((Variable)null);
				return;
			case ImlPackage.STATE_TRANSITION__EVENT_GUARD:
				setEventGuard((Event)null);
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
			case ImlPackage.STATE_TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImlPackage.STATE_TRANSITION__BOOLEAN_GUARD:
				return booleanGuard != null;
			case ImlPackage.STATE_TRANSITION__EVENT_GUARD:
				return eventGuard != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateTransitionImpl
