/**
 */
package umlTrace.States.impl;

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

import umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;

import umlTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensional Value locus Extensional Value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExtensionalValue_locus_ExtensionalValue_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionalValue_locus_ExtensionalValue_ValueImpl extends MinimalEObjectImpl.Container implements ExtensionalValue_locus_ExtensionalValue_Value {
	/**
	 * The cached value of the '{@link #getLocus_ExtensionalValue() <em>Locus Extensional Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExtensionalValue()
	 * @generated
	 * @ordered
	 */
	protected TracedLocus locus_ExtensionalValue;

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
	protected ExtensionalValue_locus_ExtensionalValue_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE;
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
	public TracedLocus getLocus_ExtensionalValue() {
		if (locus_ExtensionalValue != null && locus_ExtensionalValue.eIsProxy()) {
			InternalEObject oldLocus_ExtensionalValue = (InternalEObject)locus_ExtensionalValue;
			locus_ExtensionalValue = (TracedLocus)eResolveProxy(oldLocus_ExtensionalValue);
			if (locus_ExtensionalValue != oldLocus_ExtensionalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE, oldLocus_ExtensionalValue, locus_ExtensionalValue));
			}
		}
		return locus_ExtensionalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus basicGetLocus_ExtensionalValue() {
		return locus_ExtensionalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExtensionalValue(TracedLocus newLocus_ExtensionalValue) {
		TracedLocus oldLocus_ExtensionalValue = locus_ExtensionalValue;
		locus_ExtensionalValue = newLocus_ExtensionalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE, oldLocus_ExtensionalValue, locus_ExtensionalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExtensionalValue getParent() {
		if (eContainerFeatureID() != StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT) return null;
		return (TracedExtensionalValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExtensionalValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExtensionalValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE, TracedExtensionalValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES, StatesPackage.STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES);
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExtensionalValue)otherEnd, msgs);
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE, TracedExtensionalValue.class, msgs);
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE:
				if (resolve) return getLocus_ExtensionalValue();
				return basicGetLocus_ExtensionalValue();
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE:
				setLocus_ExtensionalValue((TracedLocus)newValue);
				return;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				setParent((TracedExtensionalValue)newValue);
				return;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE:
				setLocus_ExtensionalValue((TracedLocus)null);
				return;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				setParent((TracedExtensionalValue)null);
				return;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
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
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE:
				return locus_ExtensionalValue != null;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtensionalValue_locus_ExtensionalValue_ValueImpl
