/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment;
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
 * An implementation of the model object '<em><b>Execution Environment locus Execution Environment Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl extends MinimalEObjectImpl.Container implements ExecutionEnvironment_locus_ExecutionEnvironment_Value {
	/**
	 * The cached value of the '{@link #getLocus_ExecutionEnvironment() <em>Locus Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected TracedLocus locus_ExecutionEnvironment;

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
	protected ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE;
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
	public TracedLocus getLocus_ExecutionEnvironment() {
		if (locus_ExecutionEnvironment != null && locus_ExecutionEnvironment.eIsProxy()) {
			InternalEObject oldLocus_ExecutionEnvironment = (InternalEObject)locus_ExecutionEnvironment;
			locus_ExecutionEnvironment = (TracedLocus)eResolveProxy(oldLocus_ExecutionEnvironment);
			if (locus_ExecutionEnvironment != oldLocus_ExecutionEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT, oldLocus_ExecutionEnvironment, locus_ExecutionEnvironment));
			}
		}
		return locus_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLocus basicGetLocus_ExecutionEnvironment() {
		return locus_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExecutionEnvironment(TracedLocus newLocus_ExecutionEnvironment) {
		TracedLocus oldLocus_ExecutionEnvironment = locus_ExecutionEnvironment;
		locus_ExecutionEnvironment = newLocus_ExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT, oldLocus_ExecutionEnvironment, locus_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionEnvironment getParent() {
		if (eContainerFeatureID() != StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT) return null;
		return (TracedExecutionEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExecutionEnvironment newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExecutionEnvironment newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE, TracedExecutionEnvironment.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES, StatesPackage.STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES);
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExecutionEnvironment)otherEnd, msgs);
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE, TracedExecutionEnvironment.class, msgs);
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT:
				if (resolve) return getLocus_ExecutionEnvironment();
				return basicGetLocus_ExecutionEnvironment();
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT:
				setLocus_ExecutionEnvironment((TracedLocus)newValue);
				return;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				setParent((TracedExecutionEnvironment)newValue);
				return;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT:
				setLocus_ExecutionEnvironment((TracedLocus)null);
				return;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				setParent((TracedExecutionEnvironment)null);
				return;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
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
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT:
				return locus_ExecutionEnvironment != null;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionEnvironment_locus_ExecutionEnvironment_ValueImpl
