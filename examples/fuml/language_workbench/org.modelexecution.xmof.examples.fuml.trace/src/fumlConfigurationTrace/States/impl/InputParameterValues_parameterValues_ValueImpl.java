/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

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
 * An implementation of the model object '<em><b>Input Parameter Values parameter Values Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.InputParameterValues_parameterValues_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.InputParameterValues_parameterValues_ValueImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.InputParameterValues_parameterValues_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.InputParameterValues_parameterValues_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputParameterValues_parameterValues_ValueImpl extends MinimalEObjectImpl.Container implements InputParameterValues_parameterValues_Value {
	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedParameterValue> parameterValues;

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
	protected InputParameterValues_parameterValues_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE;
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
	public EList<TracedParameterValue> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectResolvingEList<TracedParameterValue>(TracedParameterValue.class, this, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInputParameterValues getParent() {
		if (eContainerFeatureID() != StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT) return null;
		return (TracedInputParameterValues)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedInputParameterValues newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedInputParameterValues newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE, TracedInputParameterValues.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES, StatesPackage.STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES);
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedInputParameterValues)otherEnd, msgs);
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE, TracedInputParameterValues.class, msgs);
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				return getParameterValues();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				return getParent();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends TracedParameterValue>)newValue);
				return;
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				setParent((TracedInputParameterValues)newValue);
				return;
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				getParameterValues().clear();
				return;
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				setParent((TracedInputParameterValues)null);
				return;
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputParameterValues_parameterValues_ValueImpl
