/**
 */
package fumlConfiguration.Actions.BasicActions.impl;

import fumlConfiguration.Actions.BasicActions.ActionActivation;
import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfiguration.Actions.BasicActions.PinActivation;

import fumlConfiguration.Activities.IntermediateActivities.impl.ActivityNodeActivationImpl;

import fumlConfiguration.Classes.Kernel.Value;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Pin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfiguration.Actions.BasicActions.impl.ActionActivationImpl#isFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionActivationImpl extends ActivityNodeActivationImpl implements ActionActivation {
	/**
	 * The cached value of the '{@link #getPinActivations() <em>Pin Activations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<PinActivation> pinActivations;

	/**
	 * The default value of the '{@link #isFiring() <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiring() <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiring()
	 * @generated
	 * @ordered
	 */
	protected boolean firing = FIRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation> getPinActivations() {
		if (pinActivations == null) {
			pinActivations = new EObjectWithInverseResolvingEList<PinActivation>(PinActivation.class, this, BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS, BasicActionsPackage.PIN_ACTIVATION__ACTION_ACTIVATION);
		}
		return pinActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiring() {
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiring(boolean newFiring) {
		boolean oldFiring = firing;
		firing = newFiring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActionsPackage.ACTION_ACTIVATION__FIRING, oldFiring, firing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPinActivation(Pin pin, PinActivation return_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendOffers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doAction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void shouldFireAgain(boolean fireAgain) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putToken(OutputPin pin, Value value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeTokens(InputPin pin, EList<Value> values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putTokens(OutputPin pin, EList<Value> values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPinActivations()).basicAdd(otherEnd, msgs);
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return ((InternalEList<?>)getPinActivations()).basicRemove(otherEnd, msgs);
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return getPinActivations();
			case BasicActionsPackage.ACTION_ACTIVATION__FIRING:
				return isFiring();
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				getPinActivations().clear();
				getPinActivations().addAll((Collection<? extends PinActivation>)newValue);
				return;
			case BasicActionsPackage.ACTION_ACTIVATION__FIRING:
				setFiring((Boolean)newValue);
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				getPinActivations().clear();
				return;
			case BasicActionsPackage.ACTION_ACTIVATION__FIRING:
				setFiring(FIRING_EDEFAULT);
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
			case BasicActionsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return pinActivations != null && !pinActivations.isEmpty();
			case BasicActionsPackage.ACTION_ACTIVATION__FIRING:
				return firing != FIRING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicActionsPackage.ACTION_ACTIVATION___GET_PIN_ACTIVATION__PIN_PINACTIVATION:
				getPinActivation((Pin)arguments.get(0), (PinActivation)arguments.get(1));
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___SEND_OFFERS:
				sendOffers();
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___DO_ACTION:
				doAction();
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___SHOULD_FIRE_AGAIN__BOOLEAN:
				shouldFireAgain((Boolean)arguments.get(0));
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___PUT_TOKEN__OUTPUTPIN_VALUE:
				putToken((OutputPin)arguments.get(0), (Value)arguments.get(1));
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___TAKE_TOKENS__INPUTPIN_ELIST:
				takeTokens((InputPin)arguments.get(0), (EList<Value>)arguments.get(1));
				return null;
			case BasicActionsPackage.ACTION_ACTIVATION___PUT_TOKENS__OUTPUTPIN_ELIST:
				putTokens((OutputPin)arguments.get(0), (EList<Value>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (firing: ");
		result.append(firing);
		result.append(')');
		return result.toString();
	}

} //ActionActivationImpl
