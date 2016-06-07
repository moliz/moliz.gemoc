/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

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
 * An implementation of the model object '<em><b>Call Action Activation call Executions Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.CallActionActivation_callExecutions_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.CallActionActivation_callExecutions_ValueImpl#getCallExecutions <em>Call Executions</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.CallActionActivation_callExecutions_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.CallActionActivation_callExecutions_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActionActivation_callExecutions_ValueImpl extends MinimalEObjectImpl.Container implements CallActionActivation_callExecutions_Value {
	/**
	 * The cached value of the '{@link #getCallExecutions() <em>Call Executions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedExecution> callExecutions;

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
	protected CallActionActivation_callExecutions_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE;
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
	public EList<TracedExecution> getCallExecutions() {
		if (callExecutions == null) {
			callExecutions = new EObjectResolvingEList<TracedExecution>(TracedExecution.class, this, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS);
		}
		return callExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallActionActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT) return null;
		return (TracedCallActionActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedCallActionActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedCallActionActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE, TracedCallActionActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES, StatesPackage.STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES);
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedCallActionActivation)otherEnd, msgs);
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE, TracedCallActionActivation.class, msgs);
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS:
				return getCallExecutions();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				return getParent();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS:
				getCallExecutions().clear();
				getCallExecutions().addAll((Collection<? extends TracedExecution>)newValue);
				return;
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				setParent((TracedCallActionActivation)newValue);
				return;
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS:
				getCallExecutions().clear();
				return;
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				setParent((TracedCallActionActivation)null);
				return;
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
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
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS:
				return callExecutions != null && !callExecutions.isEmpty();
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallActionActivation_callExecutions_ValueImpl
