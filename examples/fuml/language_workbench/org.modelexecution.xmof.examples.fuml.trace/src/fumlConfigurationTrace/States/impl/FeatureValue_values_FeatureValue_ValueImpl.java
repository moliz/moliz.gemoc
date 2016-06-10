/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Value values Feature Value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.FeatureValue_values_FeatureValue_ValueImpl#getValues_FeatureValue <em>Values Feature Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureValue_values_FeatureValue_ValueImpl extends MinimalEObjectImpl.Container implements FeatureValue_values_FeatureValue_Value {
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
	 * The cached value of the '{@link #getValues_FeatureValue() <em>Values Feature Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues_FeatureValue()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedValue> values_FeatureValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureValue_values_FeatureValue_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE;
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
	public TracedFeatureValue getParent() {
		if (eContainerFeatureID() != StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT) return null;
		return (TracedFeatureValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedFeatureValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedFeatureValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE, TracedFeatureValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES, StatesPackage.STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedValue> getValues_FeatureValue() {
		if (values_FeatureValue == null) {
			values_FeatureValue = new EObjectResolvingEList<TracedValue>(TracedValue.class, this, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE);
		}
		return values_FeatureValue;
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedFeatureValue)otherEnd, msgs);
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE, TracedFeatureValue.class, msgs);
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
				return getStates();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE:
				return getValues_FeatureValue();
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				setParent((TracedFeatureValue)newValue);
				return;
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE:
				getValues_FeatureValue().clear();
				getValues_FeatureValue().addAll((Collection<? extends TracedValue>)newValue);
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				setParent((TracedFeatureValue)null);
				return;
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
				getStates().clear();
				return;
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE:
				getValues_FeatureValue().clear();
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
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
			case StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE:
				return values_FeatureValue != null && !values_FeatureValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureValue_values_FeatureValue_ValueImpl