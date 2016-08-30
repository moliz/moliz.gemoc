/**
 */
package fumlConfiguration.Actions.BasicActions.impl;

import fumlConfiguration.Actions.BasicActions.ActionActivation;
import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfiguration.Actions.BasicActions.PinActivation;

import fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl#getActionActivation <em>Action Activation</em>}</li>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.impl.PinActivationImpl#getCount_temp <em>Count temp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinActivationImpl extends ObjectNodeActivationImpl implements PinActivation {
	/**
	 * The cached value of the '{@link #getActionActivation() <em>Action Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivation()
	 * @generated
	 * @ordered
	 */
	protected ActionActivation actionActivation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.PIN_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionActivation getActionActivation() {
		if (actionActivation != null && actionActivation.eIsProxy()) {
			InternalEObject oldActionActivation = (InternalEObject)actionActivation;
			actionActivation = (ActionActivation)eResolveProxy(oldActionActivation);
			if (actionActivation != oldActionActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION, oldActionActivation, actionActivation));
			}
		}
		return actionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionActivation basicGetActionActivation() {
		return actionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionActivation(ActionActivation newActionActivation, NotificationChain msgs) {
		ActionActivation oldActionActivation = actionActivation;
		actionActivation = newActionActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION, oldActionActivation, newActionActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionActivation(ActionActivation newActionActivation) {
		if (newActionActivation != actionActivation) {
			NotificationChain msgs = null;
			if (actionActivation != null)
				msgs = ((InternalEObject)actionActivation).eInverseRemove(this, BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS, ActionActivation.class, msgs);
			if (newActionActivation != null)
				msgs = ((InternalEObject)newActionActivation).eInverseAdd(this, BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS, ActionActivation.class, msgs);
			msgs = basicSetActionActivation(newActionActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION, newActionActivation, newActionActivation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActionsPackage.PIN_ACTIVATION__COUNT_TEMP, oldCount_temp, count_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				if (actionActivation != null)
					msgs = ((InternalEObject)actionActivation).eInverseRemove(this, BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS, ActionActivation.class, msgs);
				return basicSetActionActivation((ActionActivation)otherEnd, msgs);
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
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				return basicSetActionActivation(null, msgs);
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
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				if (resolve) return getActionActivation();
				return basicGetActionActivation();
			case BasicActionsPackage.PIN_ACTIVATION__COUNT_TEMP:
				return getCount_temp();
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
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				setActionActivation((ActionActivation)newValue);
				return;
			case BasicActionsPackage.PIN_ACTIVATION__COUNT_TEMP:
				setCount_temp((Integer)newValue);
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
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				setActionActivation((ActionActivation)null);
				return;
			case BasicActionsPackage.PIN_ACTIVATION__COUNT_TEMP:
				setCount_temp(COUNT_TEMP_EDEFAULT);
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
			case BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION:
				return actionActivation != null;
			case BasicActionsPackage.PIN_ACTIVATION__COUNT_TEMP:
				return count_temp != COUNT_TEMP_EDEFAULT;
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

} //PinActivationImpl
