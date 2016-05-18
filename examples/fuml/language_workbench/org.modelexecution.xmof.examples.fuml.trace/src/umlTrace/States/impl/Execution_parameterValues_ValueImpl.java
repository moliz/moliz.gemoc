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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.Execution_parameterValues_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution parameter Values Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.Execution_parameterValues_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Execution_parameterValues_ValueImpl extends MinimalEObjectImpl.Container implements Execution_parameterValues_Value {
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
	protected Execution_parameterValues_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXECUTION_PARAMETER_VALUES_VALUE;
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
			parameterValues = new EObjectResolvingEList<TracedParameterValue>(TracedParameterValue.class, this, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecution getParent() {
		if (eContainerFeatureID() != StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT) return null;
		return (TracedExecution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExecution newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExecution newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE, TracedExecution.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES, StatesPackage.STATE__EXECUTION_PARAMETER_VALUES_VALUES);
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExecution)otherEnd, msgs);
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE, TracedExecution.class, msgs);
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				return getParameterValues();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends TracedParameterValue>)newValue);
				return;
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				setParent((TracedExecution)newValue);
				return;
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				getParameterValues().clear();
				return;
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				setParent((TracedExecution)null);
				return;
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
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
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Execution_parameterValues_ValueImpl
