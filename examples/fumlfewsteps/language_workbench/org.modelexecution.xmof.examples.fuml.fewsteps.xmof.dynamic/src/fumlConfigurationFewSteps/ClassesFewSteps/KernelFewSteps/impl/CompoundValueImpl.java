/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.CompoundValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.FeatureValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl.CompoundValueImpl#getFeatureValues <em>Feature Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompoundValueImpl extends StructuredValueImpl implements CompoundValue {
	/**
	 * The cached value of the '{@link #getFeatureValues() <em>Feature Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue> featureValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelFewStepsPackage.Literals.COMPOUND_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue> getFeatureValues() {
		if (featureValues == null) {
			featureValues = new EObjectContainmentEList<FeatureValue>(FeatureValue.class, this, KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES);
		}
		return featureValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES:
				return ((InternalEList<?>)getFeatureValues()).basicRemove(otherEnd, msgs);
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
			case KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES:
				return getFeatureValues();
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
			case KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES:
				getFeatureValues().clear();
				getFeatureValues().addAll((Collection<? extends FeatureValue>)newValue);
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
			case KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES:
				getFeatureValues().clear();
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
			case KernelFewStepsPackage.COMPOUND_VALUE__FEATURE_VALUES:
				return featureValues != null && !featureValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundValueImpl
