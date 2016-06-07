/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl;

import fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedExtensionalValueImpl#getLocus_ExtensionalValueSequence <em>Locus Extensional Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedExtensionalValueImpl extends TracedCompoundValueImpl implements TracedExtensionalValue {
	/**
	 * The cached value of the '{@link #getLocus_ExtensionalValueSequence() <em>Locus Extensional Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExtensionalValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionalValue_locus_ExtensionalValue_Value> locus_ExtensionalValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedExtensionalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_EXTENSIONAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionalValue_locus_ExtensionalValue_Value> getLocus_ExtensionalValueSequence() {
		if (locus_ExtensionalValueSequence == null) {
			locus_ExtensionalValueSequence = new EObjectContainmentWithInverseEList<ExtensionalValue_locus_ExtensionalValue_Value>(ExtensionalValue_locus_ExtensionalValue_Value.class, this, KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE, StatesPackage.EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT);
		}
		return locus_ExtensionalValueSequence;
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_ExtensionalValueSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				return ((InternalEList<?>)getLocus_ExtensionalValueSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				return getLocus_ExtensionalValueSequence();
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				getLocus_ExtensionalValueSequence().clear();
				getLocus_ExtensionalValueSequence().addAll((Collection<? extends ExtensionalValue_locus_ExtensionalValue_Value>)newValue);
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				getLocus_ExtensionalValueSequence().clear();
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
			case KernelPackage.TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE:
				return locus_ExtensionalValueSequence != null && !locus_ExtensionalValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedExtensionalValueImpl
