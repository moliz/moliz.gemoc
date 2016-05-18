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

import umlTrace.States.Object_types_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl#getTypesSequence <em>Types Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedObjectImpl extends TracedExtensionalValueImpl implements TracedObject {
	/**
	 * The cached value of the '{@link #getTypesSequence() <em>Types Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Object_types_Value> typesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object_types_Value> getTypesSequence() {
		if (typesSequence == null) {
			typesSequence = new EObjectContainmentWithInverseEList<Object_types_Value>(Object_types_Value.class, this, KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE, StatesPackage.OBJECT_TYPES_VALUE__PARENT);
		}
		return typesSequence;
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypesSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				return ((InternalEList<?>)getTypesSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				return getTypesSequence();
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				getTypesSequence().clear();
				getTypesSequence().addAll((Collection<? extends Object_types_Value>)newValue);
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				getTypesSequence().clear();
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
			case KernelPackage.TRACED_OBJECT__TYPES_SEQUENCE:
				return typesSequence != null && !typesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedObjectImpl
