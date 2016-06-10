/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl;

import fumlConfigurationTrace.States.Execution_context_Value;
import fumlConfigurationTrace.States.Execution_parameterValues_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl#getContextSequence <em>Context Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl#getParameterValuesSequence <em>Parameter Values Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedExecutionImpl extends TracedObjectImpl implements TracedExecution {
	/**
	 * The cached value of the '{@link #getContextSequence() <em>Context Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution_context_Value> contextSequence;

	/**
	 * The cached value of the '{@link #getParameterValuesSequence() <em>Parameter Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution_parameterValues_Value> parameterValuesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsPackage.Literals.TRACED_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution_context_Value> getContextSequence() {
		if (contextSequence == null) {
			contextSequence = new EObjectContainmentWithInverseEList<Execution_context_Value>(Execution_context_Value.class, this, BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE, StatesPackage.EXECUTION_CONTEXT_VALUE__PARENT);
		}
		return contextSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution_parameterValues_Value> getParameterValuesSequence() {
		if (parameterValuesSequence == null) {
			parameterValuesSequence = new EObjectContainmentWithInverseEList<Execution_parameterValues_Value>(Execution_parameterValues_Value.class, this, BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE, StatesPackage.EXECUTION_PARAMETER_VALUES_VALUE__PARENT);
		}
		return parameterValuesSequence;
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
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextSequence()).basicAdd(otherEnd, msgs);
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterValuesSequence()).basicAdd(otherEnd, msgs);
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
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				return ((InternalEList<?>)getContextSequence()).basicRemove(otherEnd, msgs);
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				return ((InternalEList<?>)getParameterValuesSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				return getContextSequence();
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				return getParameterValuesSequence();
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
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				getContextSequence().clear();
				getContextSequence().addAll((Collection<? extends Execution_context_Value>)newValue);
				return;
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				getParameterValuesSequence().clear();
				getParameterValuesSequence().addAll((Collection<? extends Execution_parameterValues_Value>)newValue);
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
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				getContextSequence().clear();
				return;
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				getParameterValuesSequence().clear();
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
			case BasicBehaviorsPackage.TRACED_EXECUTION__CONTEXT_SEQUENCE:
				return contextSequence != null && !contextSequence.isEmpty();
			case BasicBehaviorsPackage.TRACED_EXECUTION__PARAMETER_VALUES_SEQUENCE:
				return parameterValuesSequence != null && !parameterValuesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedExecutionImpl
