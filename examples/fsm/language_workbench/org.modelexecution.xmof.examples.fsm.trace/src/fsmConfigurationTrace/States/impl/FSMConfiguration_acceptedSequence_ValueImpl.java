/**
 */
package fsmConfigurationTrace.States.impl;

import fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value;
import fsmConfigurationTrace.States.StatesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Configuration accepted Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.impl.FSMConfiguration_acceptedSequence_ValueImpl#getAcceptedSequence <em>Accepted Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMConfiguration_acceptedSequence_ValueImpl extends SpecificValueImpl implements FSMConfiguration_acceptedSequence_Value {
	/**
	 * The cached value of the '{@link #getAcceptedSequence() <em>Accepted Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acceptedSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMConfiguration_acceptedSequence_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAcceptedSequence() {
		if (acceptedSequence == null) {
			acceptedSequence = new EDataTypeEList<String>(String.class, this, StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE);
		}
		return acceptedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE:
				return getAcceptedSequence();
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
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE:
				getAcceptedSequence().clear();
				getAcceptedSequence().addAll((Collection<? extends String>)newValue);
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
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE:
				getAcceptedSequence().clear();
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
			case StatesPackage.FSM_CONFIGURATION_ACCEPTED_SEQUENCE_VALUE__ACCEPTED_SEQUENCE:
				return acceptedSequence != null && !acceptedSequence.isEmpty();
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
		result.append(" (acceptedSequence: ");
		result.append(acceptedSequence);
		result.append(')');
		return result.toString();
	}

} //FSMConfiguration_acceptedSequence_ValueImpl
