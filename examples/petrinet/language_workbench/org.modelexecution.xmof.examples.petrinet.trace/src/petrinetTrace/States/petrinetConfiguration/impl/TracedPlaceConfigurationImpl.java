/**
 */
package petrinetTrace.States.petrinetConfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetConfiguration.PlaceConfiguration;

import petrinetTrace.States.PlaceConfiguration_tokens_Value;
import petrinetTrace.States.StatesPackage;

import petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage;
import petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Place Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetTrace.States.petrinetConfiguration.impl.TracedPlaceConfigurationImpl#getTokensSequence <em>Tokens Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedPlaceConfigurationImpl extends MinimalEObjectImpl.Container implements TracedPlaceConfiguration {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected PlaceConfiguration originalObject;

	/**
	 * The cached value of the '{@link #getTokensSequence() <em>Tokens Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceConfiguration_tokens_Value> tokensSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPlaceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetConfigurationPackage.Literals.TRACED_PLACE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceConfiguration getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (PlaceConfiguration)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceConfiguration basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(PlaceConfiguration newOriginalObject) {
		PlaceConfiguration oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceConfiguration_tokens_Value> getTokensSequence() {
		if (tokensSequence == null) {
			tokensSequence = new EObjectContainmentWithInverseEList<PlaceConfiguration_tokens_Value>(PlaceConfiguration_tokens_Value.class, this, PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE, StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT);
		}
		return tokensSequence;
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokensSequence()).basicAdd(otherEnd, msgs);
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				return ((InternalEList<?>)getTokensSequence()).basicRemove(otherEnd, msgs);
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				return getTokensSequence();
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT:
				setOriginalObject((PlaceConfiguration)newValue);
				return;
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				getTokensSequence().clear();
				getTokensSequence().addAll((Collection<? extends PlaceConfiguration_tokens_Value>)newValue);
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT:
				setOriginalObject((PlaceConfiguration)null);
				return;
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				getTokensSequence().clear();
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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT:
				return originalObject != null;
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE:
				return tokensSequence != null && !tokensSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedPlaceConfigurationImpl
