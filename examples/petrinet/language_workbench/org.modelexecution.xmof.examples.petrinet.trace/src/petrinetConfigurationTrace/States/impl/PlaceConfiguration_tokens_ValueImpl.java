/**
 */
package petrinetConfigurationTrace.States.impl;

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

import petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value;
import petrinetConfigurationTrace.States.State;
import petrinetConfigurationTrace.States.StatesPackage;

import petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationPackage;
import petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Configuration tokens Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.States.impl.PlaceConfiguration_tokens_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.impl.PlaceConfiguration_tokens_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.impl.PlaceConfiguration_tokens_ValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.impl.PlaceConfiguration_tokens_ValueImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceConfiguration_tokens_ValueImpl extends MinimalEObjectImpl.Container implements PlaceConfiguration_tokens_Value {
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
	 * The default value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected int tokens = TOKENS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceConfiguration_tokens_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.PLACE_CONFIGURATION_TOKENS_VALUE;
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
	public TracedPlaceConfiguration getParent() {
		if (eContainerFeatureID() != StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT) return null;
		return (TracedPlaceConfiguration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedPlaceConfiguration newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedPlaceConfiguration newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE, TracedPlaceConfiguration.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES, StatesPackage.STATE__PLACE_CONFIGURATION_TOKENS_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokens(int newTokens) {
		int oldTokens = tokens;
		tokens = newTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS, oldTokens, tokens));
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedPlaceConfiguration)otherEnd, msgs);
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE, TracedPlaceConfiguration.class, msgs);
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				return getParent();
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
				return getStates();
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS:
				return getTokens();
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				setParent((TracedPlaceConfiguration)newValue);
				return;
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS:
				setTokens((Integer)newValue);
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				setParent((TracedPlaceConfiguration)null);
				return;
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
				getStates().clear();
				return;
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS:
				setTokens(TOKENS_EDEFAULT);
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
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__STATES:
				return states != null && !states.isEmpty();
			case StatesPackage.PLACE_CONFIGURATION_TOKENS_VALUE__TOKENS:
				return tokens != TOKENS_EDEFAULT;
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
		result.append(" (tokens: ");
		result.append(tokens);
		result.append(')');
		return result.toString();
	}

} //PlaceConfiguration_tokens_ValueImpl
