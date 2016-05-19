/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.BooleanValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.impl.BooleanValueImpl#isValue_BooleanValue <em>Value Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanValueImpl extends PrimitiveValueImpl implements BooleanValue {
	/**
	 * The default value of the '{@link #isValue_BooleanValue() <em>Value Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue_BooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue_BooleanValue() <em>Value Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue_BooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value_BooleanValue = VALUE_BOOLEAN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue_BooleanValue() {
		return value_BooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_BooleanValue(boolean newValue_BooleanValue) {
		boolean oldValue_BooleanValue = value_BooleanValue;
		value_BooleanValue = newValue_BooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE, oldValue_BooleanValue, value_BooleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE:
				return isValue_BooleanValue();
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
			case KernelPackage.BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE:
				setValue_BooleanValue((Boolean)newValue);
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
			case KernelPackage.BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE:
				setValue_BooleanValue(VALUE_BOOLEAN_VALUE_EDEFAULT);
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
			case KernelPackage.BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE:
				return value_BooleanValue != VALUE_BOOLEAN_VALUE_EDEFAULT;
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
		result.append(" (value_BooleanValue: ");
		result.append(value_BooleanValue);
		result.append(')');
		return result.toString();
	}

} //BooleanValueImpl
