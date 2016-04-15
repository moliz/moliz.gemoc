/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation;
import fumlConfiguration.Activities.IntermediateActivities.Token;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ObjectNodeActivationImpl#getOfferedTokenCount <em>Offered Token Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeActivationImpl extends ActivityNodeActivationImpl implements ObjectNodeActivation {
	/**
	 * The default value of the '{@link #getOfferedTokenCount() <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokenCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFERED_TOKEN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOfferedTokenCount() <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokenCount()
	 * @generated
	 * @ordered
	 */
	protected int offeredTokenCount = OFFERED_TOKEN_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.OBJECT_NODE_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOfferedTokenCount() {
		return offeredTokenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfferedTokenCount(int newOfferedTokenCount) {
		int oldOfferedTokenCount = offeredTokenCount;
		offeredTokenCount = newOfferedTokenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT, oldOfferedTokenCount, offeredTokenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void countUnofferedTokens(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendUnofferedTokens() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getUnofferedTokens(EList<Token> unofferedTokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void countOfferedValues(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeUnofferedTokens(EList<Token> tokens) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT:
				return getOfferedTokenCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT:
				setOfferedTokenCount((Integer)newValue);
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
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT:
				setOfferedTokenCount(OFFERED_TOKEN_COUNT_EDEFAULT);
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
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT:
				return offeredTokenCount != OFFERED_TOKEN_COUNT_EDEFAULT;
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
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___COUNT_UNOFFERED_TOKENS__INT:
				countUnofferedTokens((Integer)arguments.get(0));
				return null;
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___SEND_UNOFFERED_TOKENS:
				sendUnofferedTokens();
				return null;
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___GET_UNOFFERED_TOKENS__ELIST:
				getUnofferedTokens((EList<Token>)arguments.get(0));
				return null;
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___COUNT_OFFERED_VALUES__INT:
				countOfferedValues((Integer)arguments.get(0));
				return null;
			case IntermediateActivitiesPackage.OBJECT_NODE_ACTIVATION___TAKE_UNOFFERED_TOKENS__ELIST:
				takeUnofferedTokens((EList<Token>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (offeredTokenCount: ");
		result.append(offeredTokenCount);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeActivationImpl
