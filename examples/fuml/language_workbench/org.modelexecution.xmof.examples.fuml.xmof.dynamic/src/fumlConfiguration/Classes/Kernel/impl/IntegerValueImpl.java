/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.IntegerValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.impl.IntegerValueImpl#getValue_IntegerValue <em>Value Integer Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerValueImpl extends PrimitiveValueImpl implements IntegerValue {
	/**
	 * The default value of the '{@link #getValue_IntegerValue() <em>Value Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_IntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_INTEGER_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue_IntegerValue() <em>Value Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_IntegerValue()
	 * @generated
	 * @ordered
	 */
	protected int value_IntegerValue = VALUE_INTEGER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.INTEGER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue_IntegerValue() {
		return value_IntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_IntegerValue(int newValue_IntegerValue) {
		int oldValue_IntegerValue = value_IntegerValue;
		value_IntegerValue = newValue_IntegerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.INTEGER_VALUE__VALUE_INTEGER_VALUE, oldValue_IntegerValue, value_IntegerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.INTEGER_VALUE__VALUE_INTEGER_VALUE:
				return getValue_IntegerValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KernelPackage.INTEGER_VALUE__VALUE_INTEGER_VALUE:
				setValue_IntegerValue((Integer)newValue);
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
			case KernelPackage.INTEGER_VALUE__VALUE_INTEGER_VALUE:
				setValue_IntegerValue(VALUE_INTEGER_VALUE_EDEFAULT);
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
			case KernelPackage.INTEGER_VALUE__VALUE_INTEGER_VALUE:
				return value_IntegerValue != VALUE_INTEGER_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value_IntegerValue: ");
		result.append(value_IntegerValue);
		result.append(')');
		return result.toString();
	}

} //IntegerValueImpl
