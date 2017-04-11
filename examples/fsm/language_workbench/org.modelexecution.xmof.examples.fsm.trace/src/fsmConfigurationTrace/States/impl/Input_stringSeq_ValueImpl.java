/**
 */
package fsmConfigurationTrace.States.impl;

import fsmConfigurationTrace.States.Input_stringSeq_Value;
import fsmConfigurationTrace.States.StatesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input string Seq Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.impl.Input_stringSeq_ValueImpl#getStringSeq <em>String Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Input_stringSeq_ValueImpl extends SpecificValueImpl implements Input_stringSeq_Value {
	/**
	 * The cached value of the '{@link #getStringSeq() <em>String Seq</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringSeq()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stringSeq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Input_stringSeq_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.INPUT_STRING_SEQ_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringSeq() {
		if (stringSeq == null) {
			stringSeq = new EDataTypeEList<String>(String.class, this, StatesPackage.INPUT_STRING_SEQ_VALUE__STRING_SEQ);
		}
		return stringSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.INPUT_STRING_SEQ_VALUE__STRING_SEQ:
				return getStringSeq();
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
			case StatesPackage.INPUT_STRING_SEQ_VALUE__STRING_SEQ:
				getStringSeq().clear();
				getStringSeq().addAll((Collection<? extends String>)newValue);
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
			case StatesPackage.INPUT_STRING_SEQ_VALUE__STRING_SEQ:
				getStringSeq().clear();
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
			case StatesPackage.INPUT_STRING_SEQ_VALUE__STRING_SEQ:
				return stringSeq != null && !stringSeq.isEmpty();
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
		result.append(" (stringSeq: ");
		result.append(stringSeq);
		result.append(')');
		return result.toString();
	}

} //Input_stringSeq_ValueImpl
