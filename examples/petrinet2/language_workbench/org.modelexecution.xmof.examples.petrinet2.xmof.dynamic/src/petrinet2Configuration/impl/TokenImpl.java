/**
 */
package petrinet2Configuration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import petrinet2.Place;

import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinet2Configuration.impl.TokenImpl#getHoldingPlace <em>Holding Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends MinimalEObjectImpl.Container implements Token {
	/**
	 * The cached value of the '{@link #getHoldingPlace() <em>Holding Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldingPlace()
	 * @generated
	 * @ordered
	 */
	protected Place holdingPlace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinet2ConfigurationPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getHoldingPlace() {
		if (holdingPlace != null && holdingPlace.eIsProxy()) {
			InternalEObject oldHoldingPlace = (InternalEObject)holdingPlace;
			holdingPlace = (Place)eResolveProxy(oldHoldingPlace);
			if (holdingPlace != oldHoldingPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE, oldHoldingPlace, holdingPlace));
			}
		}
		return holdingPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetHoldingPlace() {
		return holdingPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingPlace(Place newHoldingPlace) {
		Place oldHoldingPlace = holdingPlace;
		holdingPlace = newHoldingPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE, oldHoldingPlace, holdingPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE:
				if (resolve) return getHoldingPlace();
				return basicGetHoldingPlace();
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
			case Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE:
				setHoldingPlace((Place)newValue);
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
			case Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE:
				setHoldingPlace((Place)null);
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
			case Petrinet2ConfigurationPackage.TOKEN__HOLDING_PLACE:
				return holdingPlace != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
