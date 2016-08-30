/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl;

import fumlConfigurationTrace.States.CompoundValue_featureValues_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Compound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedCompoundValueImpl#getFeatureValuesSequence <em>Feature Values Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedCompoundValueImpl extends TracedStructuredValueImpl implements TracedCompoundValue {
	/**
	 * The cached value of the '{@link #getFeatureValuesSequence() <em>Feature Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<CompoundValue_featureValues_Value> featureValuesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedCompoundValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_COMPOUND_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompoundValue_featureValues_Value> getFeatureValuesSequence() {
		if (featureValuesSequence == null) {
			featureValuesSequence = new EObjectContainmentWithInverseEList<CompoundValue_featureValues_Value>(CompoundValue_featureValues_Value.class, this, KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE, StatesPackage.COMPOUND_VALUE_FEATURE_VALUES_VALUE__PARENT);
		}
		return featureValuesSequence;
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureValuesSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				return ((InternalEList<?>)getFeatureValuesSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				return getFeatureValuesSequence();
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				getFeatureValuesSequence().clear();
				getFeatureValuesSequence().addAll((Collection<? extends CompoundValue_featureValues_Value>)newValue);
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				getFeatureValuesSequence().clear();
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
			case KernelPackage.TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE:
				return featureValuesSequence != null && !featureValuesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedCompoundValueImpl
