/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.Locus_factory_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
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
 * An implementation of the model object '<em><b>Locus factory Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.Locus_factory_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Locus_factory_ValueImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Locus_factory_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Locus_factory_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Locus_factory_ValueImpl extends MinimalEObjectImpl.Container implements Locus_factory_Value {
	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected TracedExecutionFactory factory;

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
	protected Locus_factory_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.LOCUS_FACTORY_VALUE;
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
	public TracedExecutionFactory getFactory() {
		if (factory != null && factory.eIsProxy()) {
			InternalEObject oldFactory = (InternalEObject)factory;
			factory = (TracedExecutionFactory)eResolveProxy(oldFactory);
			if (factory != oldFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.LOCUS_FACTORY_VALUE__FACTORY, oldFactory, factory));
			}
		}
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionFactory basicGetFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(TracedExecutionFactory newFactory) {
		TracedExecutionFactory oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.LOCUS_FACTORY_VALUE__FACTORY, oldFactory, factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus getParent() {
		if (eContainerFeatureID() != StatesPackage.LOCUS_FACTORY_VALUE__PARENT) return null;
		return (TracedLocus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedLocus newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.LOCUS_FACTORY_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedLocus newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.LOCUS_FACTORY_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE, TracedLocus.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.LOCUS_FACTORY_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.LOCUS_FACTORY_VALUE__STATES, StatesPackage.STATE__LOCUS_FACTORY_VALUES);
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
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedLocus)otherEnd, msgs);
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
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
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
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
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE, TracedLocus.class, msgs);
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
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.LOCUS_FACTORY_VALUE__FACTORY:
				if (resolve) return getFactory();
				return basicGetFactory();
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				return getParent();
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
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
			case StatesPackage.LOCUS_FACTORY_VALUE__FACTORY:
				setFactory((TracedExecutionFactory)newValue);
				return;
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				setParent((TracedLocus)newValue);
				return;
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
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
			case StatesPackage.LOCUS_FACTORY_VALUE__FACTORY:
				setFactory((TracedExecutionFactory)null);
				return;
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				setParent((TracedLocus)null);
				return;
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
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
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.LOCUS_FACTORY_VALUE__FACTORY:
				return factory != null;
			case StatesPackage.LOCUS_FACTORY_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.LOCUS_FACTORY_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Locus_factory_ValueImpl
