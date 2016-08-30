/**
 */
package fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.ParameterValueImpl#getParameter_ParameterValue <em>Parameter Parameter Value</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.ParameterValueImpl#getValues_ParameterValue <em>Values Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue {
	/**
	 * The cached value of the '{@link #getParameter_ParameterValue() <em>Parameter Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ParameterValue()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter_ParameterValue;

	/**
	 * The cached value of the '{@link #getValues_ParameterValue() <em>Values Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues_ParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values_ParameterValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsFewStepsPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter_ParameterValue() {
		if (parameter_ParameterValue != null && parameter_ParameterValue.eIsProxy()) {
			InternalEObject oldParameter_ParameterValue = (InternalEObject)parameter_ParameterValue;
			parameter_ParameterValue = (Parameter)eResolveProxy(oldParameter_ParameterValue);
			if (parameter_ParameterValue != oldParameter_ParameterValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE, oldParameter_ParameterValue, parameter_ParameterValue));
			}
		}
		return parameter_ParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter_ParameterValue() {
		return parameter_ParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_ParameterValue(Parameter newParameter_ParameterValue) {
		Parameter oldParameter_ParameterValue = parameter_ParameterValue;
		parameter_ParameterValue = newParameter_ParameterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE, oldParameter_ParameterValue, parameter_ParameterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues_ParameterValue() {
		if (values_ParameterValue == null) {
			values_ParameterValue = new EObjectContainmentEList<Value>(Value.class, this, BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE);
		}
		return values_ParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void copy(ParameterValue value) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE:
				return ((InternalEList<?>)getValues_ParameterValue()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE:
				if (resolve) return getParameter_ParameterValue();
				return basicGetParameter_ParameterValue();
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE:
				return getValues_ParameterValue();
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
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE:
				setParameter_ParameterValue((Parameter)newValue);
				return;
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE:
				getValues_ParameterValue().clear();
				getValues_ParameterValue().addAll((Collection<? extends Value>)newValue);
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
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE:
				setParameter_ParameterValue((Parameter)null);
				return;
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE:
				getValues_ParameterValue().clear();
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
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__PARAMETER_PARAMETER_VALUE:
				return parameter_ParameterValue != null;
			case BasicBehaviorsFewStepsPackage.PARAMETER_VALUE__VALUES_PARAMETER_VALUE:
				return values_ParameterValue != null && !values_ParameterValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueImpl
