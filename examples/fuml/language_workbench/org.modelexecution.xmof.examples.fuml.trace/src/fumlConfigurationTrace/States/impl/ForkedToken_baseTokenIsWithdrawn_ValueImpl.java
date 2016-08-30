/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token base Token Is Withdrawn Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ForkedToken_baseTokenIsWithdrawn_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkedToken_baseTokenIsWithdrawn_ValueImpl extends MinimalEObjectImpl.Container implements ForkedToken_baseTokenIsWithdrawn_Value {
	/**
	 * The default value of the '{@link #isBaseTokenIsWithdrawn() <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASE_TOKEN_IS_WITHDRAWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBaseTokenIsWithdrawn() <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 * @ordered
	 */
	protected boolean baseTokenIsWithdrawn = BASE_TOKEN_IS_WITHDRAWN_EDEFAULT;

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
	protected ForkedToken_baseTokenIsWithdrawn_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE;
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
	public boolean isBaseTokenIsWithdrawn() {
		return baseTokenIsWithdrawn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTokenIsWithdrawn(boolean newBaseTokenIsWithdrawn) {
		boolean oldBaseTokenIsWithdrawn = baseTokenIsWithdrawn;
		baseTokenIsWithdrawn = newBaseTokenIsWithdrawn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN, oldBaseTokenIsWithdrawn, baseTokenIsWithdrawn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkedToken getParent() {
		if (eContainerFeatureID() != StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT) return null;
		return (TracedForkedToken)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedForkedToken newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedForkedToken newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE, TracedForkedToken.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES, StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES);
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedForkedToken)otherEnd, msgs);
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE, TracedForkedToken.class, msgs);
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN:
				return isBaseTokenIsWithdrawn();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				return getParent();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN:
				setBaseTokenIsWithdrawn((Boolean)newValue);
				return;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				setParent((TracedForkedToken)newValue);
				return;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN:
				setBaseTokenIsWithdrawn(BASE_TOKEN_IS_WITHDRAWN_EDEFAULT);
				return;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				setParent((TracedForkedToken)null);
				return;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN:
				return baseTokenIsWithdrawn != BASE_TOKEN_IS_WITHDRAWN_EDEFAULT;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES:
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
		result.append(" (baseTokenIsWithdrawn: ");
		result.append(baseTokenIsWithdrawn);
		result.append(')');
		return result.toString();
	}

} //ForkedToken_baseTokenIsWithdrawn_ValueImpl
