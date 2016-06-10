/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.Executor_locus_Executor_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus;

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
 * An implementation of the model object '<em><b>Executor locus Executor Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.Executor_locus_Executor_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Executor_locus_Executor_ValueImpl#getLocus_Executor <em>Locus Executor</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Executor_locus_Executor_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Executor_locus_Executor_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Executor_locus_Executor_ValueImpl extends MinimalEObjectImpl.Container implements Executor_locus_Executor_Value {
	/**
	 * The cached value of the '{@link #getLocus_Executor() <em>Locus Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_Executor()
	 * @generated
	 * @ordered
	 */
	protected TracedLocus locus_Executor;

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
	protected Executor_locus_Executor_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXECUTOR_LOCUS_EXECUTOR_VALUE;
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
	public TracedLocus getLocus_Executor() {
		if (locus_Executor != null && locus_Executor.eIsProxy()) {
			InternalEObject oldLocus_Executor = (InternalEObject)locus_Executor;
			locus_Executor = (TracedLocus)eResolveProxy(oldLocus_Executor);
			if (locus_Executor != oldLocus_Executor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR, oldLocus_Executor, locus_Executor));
			}
		}
		return locus_Executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus basicGetLocus_Executor() {
		return locus_Executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_Executor(TracedLocus newLocus_Executor) {
		TracedLocus oldLocus_Executor = locus_Executor;
		locus_Executor = newLocus_Executor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR, oldLocus_Executor, locus_Executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutor getParent() {
		if (eContainerFeatureID() != StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT) return null;
		return (TracedExecutor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExecutor newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExecutor newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE, TracedExecutor.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES, StatesPackage.STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES);
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExecutor)otherEnd, msgs);
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE, TracedExecutor.class, msgs);
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR:
				if (resolve) return getLocus_Executor();
				return basicGetLocus_Executor();
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR:
				setLocus_Executor((TracedLocus)newValue);
				return;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				setParent((TracedExecutor)newValue);
				return;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR:
				setLocus_Executor((TracedLocus)null);
				return;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				setParent((TracedExecutor)null);
				return;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
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
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR:
				return locus_Executor != null;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Executor_locus_Executor_ValueImpl
