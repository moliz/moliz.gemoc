/**
 */
package umlTrace.States.fumlConfiguration.Input.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.InputParameterValues_name_Value;
import umlTrace.States.InputParameterValues_parameterValues_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Input.InputPackage;
import umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Input Parameter Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl#getNameSequence <em>Name Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Input.impl.TracedInputParameterValuesImpl#getParameterValuesSequence <em>Parameter Values Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedInputParameterValuesImpl extends MinimalEObjectImpl.Container implements TracedInputParameterValues {
	/**
	 * The cached value of the '{@link #getNameSequence() <em>Name Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameterValues_name_Value> nameSequence;

	/**
	 * The cached value of the '{@link #getParameterValuesSequence() <em>Parameter Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameterValues_parameterValues_Value> parameterValuesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedInputParameterValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.TRACED_INPUT_PARAMETER_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameterValues_name_Value> getNameSequence() {
		if (nameSequence == null) {
			nameSequence = new EObjectContainmentWithInverseEList<InputParameterValues_name_Value>(InputParameterValues_name_Value.class, this, InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE, StatesPackage.INPUT_PARAMETER_VALUES_NAME_VALUE__PARENT);
		}
		return nameSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameterValues_parameterValues_Value> getParameterValuesSequence() {
		if (parameterValuesSequence == null) {
			parameterValuesSequence = new EObjectContainmentWithInverseEList<InputParameterValues_parameterValues_Value>(InputParameterValues_parameterValues_Value.class, this, InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE, StatesPackage.INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT);
		}
		return parameterValuesSequence;
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNameSequence()).basicAdd(otherEnd, msgs);
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterValuesSequence()).basicAdd(otherEnd, msgs);
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				return ((InternalEList<?>)getNameSequence()).basicRemove(otherEnd, msgs);
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				return ((InternalEList<?>)getParameterValuesSequence()).basicRemove(otherEnd, msgs);
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				return getNameSequence();
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				return getParameterValuesSequence();
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				getNameSequence().clear();
				getNameSequence().addAll((Collection<? extends InputParameterValues_name_Value>)newValue);
				return;
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				getParameterValuesSequence().clear();
				getParameterValuesSequence().addAll((Collection<? extends InputParameterValues_parameterValues_Value>)newValue);
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				getNameSequence().clear();
				return;
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				getParameterValuesSequence().clear();
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
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__NAME_SEQUENCE:
				return nameSequence != null && !nameSequence.isEmpty();
			case InputPackage.TRACED_INPUT_PARAMETER_VALUES__PARAMETER_VALUES_SEQUENCE:
				return parameterValuesSequence != null && !parameterValuesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputParameterValuesImpl
