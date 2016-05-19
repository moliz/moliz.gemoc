/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.FeatureValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StructuredValueImpl extends ValueImpl implements StructuredValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.STRUCTURED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFeatureValues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getFeatureValue(StructuralFeature feature, FeatureValue featureValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureValue(StructuralFeature feature, EList<Value> values, int position) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KernelPackage.STRUCTURED_VALUE___CREATE_FEATURE_VALUES:
				createFeatureValues();
				return null;
			case KernelPackage.STRUCTURED_VALUE___GET_FEATURE_VALUE__STRUCTURALFEATURE_FEATUREVALUE:
				getFeatureValue((StructuralFeature)arguments.get(0), (FeatureValue)arguments.get(1));
				return null;
			case KernelPackage.STRUCTURED_VALUE___SET_FEATURE_VALUE__STRUCTURALFEATURE_ELIST_INT:
				setFeatureValue((StructuralFeature)arguments.get(0), (EList<Value>)arguments.get(1), (Integer)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StructuredValueImpl
