/**
 */
package petrinet2Configuration.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet2.impl.PlaceImpl;

import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.PlaceConfiguration;
import petrinet2Configuration.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinet2Configuration.impl.PlaceConfigurationImpl#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceConfigurationImpl extends PlaceImpl implements PlaceConfiguration {
	/**
	 * The cached value of the '{@link #getHeldTokens() <em>Held Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> heldTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinet2ConfigurationPackage.Literals.PLACE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getHeldTokens() {
		if (heldTokens == null) {
			heldTokens = new EObjectContainmentEList<Token>(Token.class, this, Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS);
		}
		return heldTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addToken() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeToken() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS:
				return ((InternalEList<?>)getHeldTokens()).basicRemove(otherEnd, msgs);
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
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS:
				return getHeldTokens();
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
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS:
				getHeldTokens().clear();
				getHeldTokens().addAll((Collection<? extends Token>)newValue);
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
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS:
				getHeldTokens().clear();
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
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION__HELD_TOKENS:
				return heldTokens != null && !heldTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION___ADD_TOKEN:
				addToken();
				return null;
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION___REMOVE_TOKEN:
				removeToken();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PlaceConfigurationImpl
