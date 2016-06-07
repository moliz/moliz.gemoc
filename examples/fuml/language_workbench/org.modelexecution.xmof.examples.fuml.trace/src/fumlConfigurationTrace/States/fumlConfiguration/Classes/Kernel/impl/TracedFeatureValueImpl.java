/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl;

import fumlConfigurationTrace.States.FeatureValue_feature_Value;
import fumlConfigurationTrace.States.FeatureValue_position_Value;
import fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;

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
 * An implementation of the model object '<em><b>Traced Feature Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl#getFeatureSequence <em>Feature Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl#getPositionSequence <em>Position Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl#getValues_FeatureValueSequence <em>Values Feature Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedFeatureValueImpl extends MinimalEObjectImpl.Container implements TracedFeatureValue {
	/**
	 * The cached value of the '{@link #getFeatureSequence() <em>Feature Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_feature_Value> featureSequence;

	/**
	 * The cached value of the '{@link #getPositionSequence() <em>Position Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_position_Value> positionSequence;

	/**
	 * The cached value of the '{@link #getValues_FeatureValueSequence() <em>Values Feature Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues_FeatureValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue_values_FeatureValue_Value> values_FeatureValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedFeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_FEATURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_feature_Value> getFeatureSequence() {
		if (featureSequence == null) {
			featureSequence = new EObjectContainmentWithInverseEList<FeatureValue_feature_Value>(FeatureValue_feature_Value.class, this, KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE, StatesPackage.FEATURE_VALUE_FEATURE_VALUE__PARENT);
		}
		return featureSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_position_Value> getPositionSequence() {
		if (positionSequence == null) {
			positionSequence = new EObjectContainmentWithInverseEList<FeatureValue_position_Value>(FeatureValue_position_Value.class, this, KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE, StatesPackage.FEATURE_VALUE_POSITION_VALUE__PARENT);
		}
		return positionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue_values_FeatureValue_Value> getValues_FeatureValueSequence() {
		if (values_FeatureValueSequence == null) {
			values_FeatureValueSequence = new EObjectContainmentWithInverseEList<FeatureValue_values_FeatureValue_Value>(FeatureValue_values_FeatureValue_Value.class, this, KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE, StatesPackage.FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT);
		}
		return values_FeatureValueSequence;
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureSequence()).basicAdd(otherEnd, msgs);
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPositionSequence()).basicAdd(otherEnd, msgs);
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues_FeatureValueSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				return ((InternalEList<?>)getFeatureSequence()).basicRemove(otherEnd, msgs);
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				return ((InternalEList<?>)getPositionSequence()).basicRemove(otherEnd, msgs);
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				return ((InternalEList<?>)getValues_FeatureValueSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				return getFeatureSequence();
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				return getPositionSequence();
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				return getValues_FeatureValueSequence();
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				getFeatureSequence().clear();
				getFeatureSequence().addAll((Collection<? extends FeatureValue_feature_Value>)newValue);
				return;
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				getPositionSequence().clear();
				getPositionSequence().addAll((Collection<? extends FeatureValue_position_Value>)newValue);
				return;
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				getValues_FeatureValueSequence().clear();
				getValues_FeatureValueSequence().addAll((Collection<? extends FeatureValue_values_FeatureValue_Value>)newValue);
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				getFeatureSequence().clear();
				return;
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				getPositionSequence().clear();
				return;
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				getValues_FeatureValueSequence().clear();
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
			case KernelPackage.TRACED_FEATURE_VALUE__FEATURE_SEQUENCE:
				return featureSequence != null && !featureSequence.isEmpty();
			case KernelPackage.TRACED_FEATURE_VALUE__POSITION_SEQUENCE:
				return positionSequence != null && !positionSequence.isEmpty();
			case KernelPackage.TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE:
				return values_FeatureValueSequence != null && !values_FeatureValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedFeatureValueImpl
