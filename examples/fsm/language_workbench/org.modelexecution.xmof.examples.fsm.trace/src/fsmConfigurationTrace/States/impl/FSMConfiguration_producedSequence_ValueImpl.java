/**
 */
package fsmConfigurationTrace.States.impl;

import fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value;
import fsmConfigurationTrace.States.StatesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Configuration produced Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.impl.FSMConfiguration_producedSequence_ValueImpl#getProducedSequence <em>Produced Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMConfiguration_producedSequence_ValueImpl extends SpecificValueImpl implements FSMConfiguration_producedSequence_Value {
	/**
	 * The cached value of the '{@link #getProducedSequence() <em>Produced Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> producedSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMConfiguration_producedSequence_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProducedSequence() {
		if (producedSequence == null) {
			producedSequence = new EDataTypeEList<String>(String.class, this, StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE);
		}
		return producedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE:
				return getProducedSequence();
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
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE:
				getProducedSequence().clear();
				getProducedSequence().addAll((Collection<? extends String>)newValue);
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
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE:
				getProducedSequence().clear();
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
			case StatesPackage.FSM_CONFIGURATION_PRODUCED_SEQUENCE_VALUE__PRODUCED_SEQUENCE:
				return producedSequence != null && !producedSequence.isEmpty();
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
		result.append(" (producedSequence: ");
		result.append(producedSequence);
		result.append(')');
		return result.toString();
	}

} //FSMConfiguration_producedSequence_ValueImpl
