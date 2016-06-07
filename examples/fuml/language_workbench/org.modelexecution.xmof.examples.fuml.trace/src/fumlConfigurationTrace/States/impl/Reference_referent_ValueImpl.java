/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.Reference_referent_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference;

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
 * An implementation of the model object '<em><b>Reference referent Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.Reference_referent_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Reference_referent_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Reference_referent_ValueImpl#getReferent <em>Referent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Reference_referent_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Reference_referent_ValueImpl extends MinimalEObjectImpl.Container implements Reference_referent_Value {
	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected TracedObject referent;

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
	protected Reference_referent_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.REFERENCE_REFERENT_VALUE;
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
	public TracedReference getParent() {
		if (eContainerFeatureID() != StatesPackage.REFERENCE_REFERENT_VALUE__PARENT) return null;
		return (TracedReference)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedReference newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.REFERENCE_REFERENT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedReference newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.REFERENCE_REFERENT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelPackage.TRACED_REFERENCE__REFERENT_SEQUENCE, TracedReference.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.REFERENCE_REFERENT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObject getReferent() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject)referent;
			referent = (TracedObject)eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObject basicGetReferent() {
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferent(TracedObject newReferent) {
		TracedObject oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT, oldReferent, referent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.REFERENCE_REFERENT_VALUE__STATES, StatesPackage.STATE__REFERENCE_REFERENT_VALUES);
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedReference)otherEnd, msgs);
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.TRACED_REFERENCE__REFERENT_SEQUENCE, TracedReference.class, msgs);
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				return getParent();
			case StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				setParent((TracedReference)newValue);
				return;
			case StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT:
				setReferent((TracedObject)newValue);
				return;
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				setParent((TracedReference)null);
				return;
			case StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT:
				setReferent((TracedObject)null);
				return;
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
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
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.REFERENCE_REFERENT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.REFERENCE_REFERENT_VALUE__REFERENT:
				return referent != null;
			case StatesPackage.REFERENCE_REFERENT_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Reference_referent_ValueImpl
