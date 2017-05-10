/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation;
import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;
import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

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
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.ActionActivationImpl#getPinActivations <em>Pin Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.ActionActivationImpl#isFiring <em>Firing</em>}</li>
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
		return BasicActionsFewStepsPackage.Literals.ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation> getPinActivations() {
		if (pinActivations == null) {
			pinActivations = new EObjectWithInverseResolvingEList<PinActivation>(PinActivation.class, this, BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS, BasicActionsFewStepsPackage.PIN_ACTIVATION__ACTION_ACTIVATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING, oldFiring, firing));
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return getPinActivations();
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING:
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				getPinActivations().clear();
				getPinActivations().addAll((Collection<? extends PinActivation>)newValue);
				return;
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING:
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				getPinActivations().clear();
				return;
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING:
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
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__PIN_ACTIVATIONS:
				return pinActivations != null && !pinActivations.isEmpty();
			case BasicActionsFewStepsPackage.ACTION_ACTIVATION__FIRING:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firing: ");
		result.append(firing);
		result.append(')');
		return result.toString();
	}

} //ActionActivationImpl
