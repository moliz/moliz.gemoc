/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.PrimitiveValue_type_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedPrimitiveValueImpl#getTypeSequence <em>Type Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedPrimitiveValueImpl extends TracedValueImpl implements TracedPrimitiveValue {
	/**
	 * The cached value of the '{@link #getTypeSequence() <em>Type Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveValue_type_Value> typeSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPrimitiveValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_PRIMITIVE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveValue_type_Value> getTypeSequence() {
		if (typeSequence == null) {
			typeSequence = new EObjectContainmentWithInverseEList<PrimitiveValue_type_Value>(PrimitiveValue_type_Value.class, this, KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE, StatesPackage.PRIMITIVE_VALUE_TYPE_VALUE__PARENT);
		}
		return typeSequence;
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				return ((InternalEList<?>)getTypeSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				return getTypeSequence();
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				getTypeSequence().clear();
				getTypeSequence().addAll((Collection<? extends PrimitiveValue_type_Value>)newValue);
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				getTypeSequence().clear();
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
			case KernelPackage.TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE:
				return typeSequence != null && !typeSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedPrimitiveValueImpl
