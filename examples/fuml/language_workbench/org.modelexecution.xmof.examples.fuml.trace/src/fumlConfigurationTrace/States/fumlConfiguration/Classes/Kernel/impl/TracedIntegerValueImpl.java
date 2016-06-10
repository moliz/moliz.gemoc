/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl;

import fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Integer Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedIntegerValueImpl#getValue_IntegerValueSequence <em>Value Integer Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedIntegerValueImpl extends TracedPrimitiveValueImpl implements TracedIntegerValue {
	/**
	 * The cached value of the '{@link #getValue_IntegerValueSequence() <em>Value Integer Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_IntegerValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValue_value_IntegerValue_Value> value_IntegerValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedIntegerValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_INTEGER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValue_value_IntegerValue_Value> getValue_IntegerValueSequence() {
		if (value_IntegerValueSequence == null) {
			value_IntegerValueSequence = new EObjectContainmentWithInverseEList<IntegerValue_value_IntegerValue_Value>(IntegerValue_value_IntegerValue_Value.class, this, KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE, StatesPackage.INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__PARENT);
		}
		return value_IntegerValueSequence;
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValue_IntegerValueSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				return ((InternalEList<?>)getValue_IntegerValueSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				return getValue_IntegerValueSequence();
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				getValue_IntegerValueSequence().clear();
				getValue_IntegerValueSequence().addAll((Collection<? extends IntegerValue_value_IntegerValue_Value>)newValue);
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				getValue_IntegerValueSequence().clear();
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
			case KernelPackage.TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE:
				return value_IntegerValueSequence != null && !value_IntegerValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedIntegerValueImpl
