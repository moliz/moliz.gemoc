/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl;

import fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedBooleanValueImpl#getValue_BooleanValueSequence <em>Value Boolean Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBooleanValueImpl extends TracedPrimitiveValueImpl implements TracedBooleanValue {
	/**
	 * The cached value of the '{@link #getValue_BooleanValueSequence() <em>Value Boolean Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_BooleanValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_BooleanValue_Value> value_BooleanValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_BooleanValue_Value> getValue_BooleanValueSequence() {
		if (value_BooleanValueSequence == null) {
			value_BooleanValueSequence = new EObjectContainmentWithInverseEList<BooleanValue_value_BooleanValue_Value>(BooleanValue_value_BooleanValue_Value.class, this, KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE, StatesPackage.BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT);
		}
		return value_BooleanValueSequence;
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValue_BooleanValueSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				return ((InternalEList<?>)getValue_BooleanValueSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				return getValue_BooleanValueSequence();
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				getValue_BooleanValueSequence().clear();
				getValue_BooleanValueSequence().addAll((Collection<? extends BooleanValue_value_BooleanValue_Value>)newValue);
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				getValue_BooleanValueSequence().clear();
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
			case KernelPackage.TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE:
				return value_BooleanValueSequence != null && !value_BooleanValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanValueImpl
