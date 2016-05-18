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

import umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Factory locus Execution Factory Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ExecutionFactory_locus_ExecutionFactory_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionFactory_locus_ExecutionFactory_ValueImpl extends MinimalEObjectImpl.Container implements ExecutionFactory_locus_ExecutionFactory_Value {
	/**
	 * The cached value of the '{@link #getLocus_ExecutionFactory() <em>Locus Execution Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutionFactory()
	 * @generated
	 * @ordered
	 */
	protected TracedLocus locus_ExecutionFactory;

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
	protected ExecutionFactory_locus_ExecutionFactory_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE;
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
	public TracedLocus getLocus_ExecutionFactory() {
		if (locus_ExecutionFactory != null && locus_ExecutionFactory.eIsProxy()) {
			InternalEObject oldLocus_ExecutionFactory = (InternalEObject)locus_ExecutionFactory;
			locus_ExecutionFactory = (TracedLocus)eResolveProxy(oldLocus_ExecutionFactory);
			if (locus_ExecutionFactory != oldLocus_ExecutionFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY, oldLocus_ExecutionFactory, locus_ExecutionFactory));
			}
		}
		return locus_ExecutionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus basicGetLocus_ExecutionFactory() {
		return locus_ExecutionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExecutionFactory(TracedLocus newLocus_ExecutionFactory) {
		TracedLocus oldLocus_ExecutionFactory = locus_ExecutionFactory;
		locus_ExecutionFactory = newLocus_ExecutionFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY, oldLocus_ExecutionFactory, locus_ExecutionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionFactory getParent() {
		if (eContainerFeatureID() != StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT) return null;
		return (TracedExecutionFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExecutionFactory newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExecutionFactory newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE, TracedExecutionFactory.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES, StatesPackage.STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES);
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExecutionFactory)otherEnd, msgs);
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE, TracedExecutionFactory.class, msgs);
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY:
				if (resolve) return getLocus_ExecutionFactory();
				return basicGetLocus_ExecutionFactory();
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((TracedLocus)newValue);
				return;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				setParent((TracedExecutionFactory)newValue);
				return;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((TracedLocus)null);
				return;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				setParent((TracedExecutionFactory)null);
				return;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
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
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY:
				return locus_ExecutionFactory != null;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionFactory_locus_ExecutionFactory_ValueImpl
