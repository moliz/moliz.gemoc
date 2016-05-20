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

import org.eclipse.uml2.uml.Parameter;

import umlTrace.States.ParameterValue_parameter_ParameterValue_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value parameter Parameter Value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl#getParameter_ParameterValue <em>Parameter Parameter Value</em>}</li>
 *   <li>{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ParameterValue_parameter_ParameterValue_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValue_parameter_ParameterValue_ValueImpl extends MinimalEObjectImpl.Container implements ParameterValue_parameter_ParameterValue_Value {
	/**
	 * The cached value of the '{@link #getParameter_ParameterValue() <em>Parameter Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ParameterValue()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter_ParameterValue;

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
	protected ParameterValue_parameter_ParameterValue_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE;
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
	public Parameter getParameter_ParameterValue() {
		if (parameter_ParameterValue != null && parameter_ParameterValue.eIsProxy()) {
			InternalEObject oldParameter_ParameterValue = (InternalEObject)parameter_ParameterValue;
			parameter_ParameterValue = (Parameter)eResolveProxy(oldParameter_ParameterValue);
			if (parameter_ParameterValue != oldParameter_ParameterValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE, oldParameter_ParameterValue, parameter_ParameterValue));
			}
		}
		return parameter_ParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter_ParameterValue() {
		return parameter_ParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_ParameterValue(Parameter newParameter_ParameterValue) {
		Parameter oldParameter_ParameterValue = parameter_ParameterValue;
		parameter_ParameterValue = newParameter_ParameterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE, oldParameter_ParameterValue, parameter_ParameterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameterValue getParent() {
		if (eContainerFeatureID() != StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT) return null;
		return (TracedParameterValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedParameterValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedParameterValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE, TracedParameterValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES, StatesPackage.STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES);
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedParameterValue)otherEnd, msgs);
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE, TracedParameterValue.class, msgs);
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE:
				if (resolve) return getParameter_ParameterValue();
				return basicGetParameter_ParameterValue();
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE:
				setParameter_ParameterValue((Parameter)newValue);
				return;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				setParent((TracedParameterValue)newValue);
				return;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE:
				setParameter_ParameterValue((Parameter)null);
				return;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				setParent((TracedParameterValue)null);
				return;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
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
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE:
				return parameter_ParameterValue != null;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterValue_parameter_ParameterValue_ValueImpl
