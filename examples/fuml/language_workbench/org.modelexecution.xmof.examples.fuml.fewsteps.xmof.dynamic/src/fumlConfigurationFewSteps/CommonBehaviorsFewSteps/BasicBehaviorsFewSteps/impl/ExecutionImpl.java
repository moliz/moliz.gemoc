/**
 */
package fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl.ObjectImpl;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.ExecutionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.impl.ExecutionImpl#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutionImpl extends ObjectImpl implements Execution {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameterValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsFewStepsPackage.Literals.EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object newContext) {
		fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this, BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValue(ParameterValue parameterValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getOutputParameterValues(EList<ParameterValue> outputParameterValues) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getParameterValue(Parameter parameter, ParameterValue parameterValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBehavior(Behavior behavior) {
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
			case BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES:
				return ((InternalEList<?>)getParameterValues()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES:
				return getParameterValues();
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
			case BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT:
				setContext((fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)newValue);
				return;
			case BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends ParameterValue>)newValue);
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
			case BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT:
				setContext((fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)null);
				return;
			case BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES:
				getParameterValues().clear();
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
			case BasicBehaviorsFewStepsPackage.EXECUTION__CONTEXT:
				return context != null;
			case BasicBehaviorsFewStepsPackage.EXECUTION__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case BasicBehaviorsFewStepsPackage.EXECUTION___SET_PARAMETER_VALUE__PARAMETERVALUE:
				setParameterValue((ParameterValue)arguments.get(0));
				return null;
			case BasicBehaviorsFewStepsPackage.EXECUTION___EXECUTE:
				execute();
				return null;
			case BasicBehaviorsFewStepsPackage.EXECUTION___GET_OUTPUT_PARAMETER_VALUES__ELIST:
				getOutputParameterValues((EList<ParameterValue>)arguments.get(0));
				return null;
			case BasicBehaviorsFewStepsPackage.EXECUTION___GET_PARAMETER_VALUE__PARAMETER_PARAMETERVALUE:
				getParameterValue((Parameter)arguments.get(0), (ParameterValue)arguments.get(1));
				return null;
			case BasicBehaviorsFewStepsPackage.EXECUTION___TERMINATE:
				terminate();
				return null;
			case BasicBehaviorsFewStepsPackage.EXECUTION___GET_BEHAVIOR__BEHAVIOR:
				getBehavior((Behavior)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExecutionImpl
