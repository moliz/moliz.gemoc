/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl;

import fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value;
import fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl#getParameter_ParameterValueSequence <em>Parameter Parameter Value Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedParameterValueImpl#getValues_ParameterValueSequence <em>Values Parameter Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedParameterValueImpl extends MinimalEObjectImpl.Container implements TracedParameterValue {
	/**
	 * The cached value of the '{@link #getParameter_ParameterValueSequence() <em>Parameter Parameter Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ParameterValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue_parameter_ParameterValue_Value> parameter_ParameterValueSequence;

	/**
	 * The cached value of the '{@link #getValues_ParameterValueSequence() <em>Values Parameter Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues_ParameterValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue_values_ParameterValue_Value> values_ParameterValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsPackage.Literals.TRACED_PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue_parameter_ParameterValue_Value> getParameter_ParameterValueSequence() {
		if (parameter_ParameterValueSequence == null) {
			parameter_ParameterValueSequence = new EObjectContainmentWithInverseEList<ParameterValue_parameter_ParameterValue_Value>(ParameterValue_parameter_ParameterValue_Value.class, this, BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE, StatesPackage.PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT);
		}
		return parameter_ParameterValueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue_values_ParameterValue_Value> getValues_ParameterValueSequence() {
		if (values_ParameterValueSequence == null) {
			values_ParameterValueSequence = new EObjectContainmentWithInverseEList<ParameterValue_values_ParameterValue_Value>(ParameterValue_values_ParameterValue_Value.class, this, BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE, StatesPackage.PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__PARENT);
		}
		return values_ParameterValueSequence;
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter_ParameterValueSequence()).basicAdd(otherEnd, msgs);
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues_ParameterValueSequence()).basicAdd(otherEnd, msgs);
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				return ((InternalEList<?>)getParameter_ParameterValueSequence()).basicRemove(otherEnd, msgs);
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				return ((InternalEList<?>)getValues_ParameterValueSequence()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				return getParameter_ParameterValueSequence();
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				return getValues_ParameterValueSequence();
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				getParameter_ParameterValueSequence().clear();
				getParameter_ParameterValueSequence().addAll((Collection<? extends ParameterValue_parameter_ParameterValue_Value>)newValue);
				return;
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				getValues_ParameterValueSequence().clear();
				getValues_ParameterValueSequence().addAll((Collection<? extends ParameterValue_values_ParameterValue_Value>)newValue);
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				getParameter_ParameterValueSequence().clear();
				return;
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				getValues_ParameterValueSequence().clear();
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
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE_SEQUENCE:
				return parameter_ParameterValueSequence != null && !parameter_ParameterValueSequence.isEmpty();
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE__VALUES_PARAMETER_VALUE_SEQUENCE:
				return values_ParameterValueSequence != null && !values_ParameterValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedParameterValueImpl
