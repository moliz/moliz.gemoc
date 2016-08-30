/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.ForkedToken;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfiguration.Activities.IntermediateActivities.Token;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ForkedTokenImpl#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkedTokenImpl extends TokenImpl implements ForkedToken {
	/**
	 * The cached value of the '{@link #getBaseToken() <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseToken()
	 * @generated
	 * @ordered
	 */
	protected Token baseToken;

	/**
	 * The default value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_OFFERS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected int remainingOffersCount = REMAINING_OFFERS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBaseTokenIsWithdrawn() <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASE_TOKEN_IS_WITHDRAWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBaseTokenIsWithdrawn() <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 * @ordered
	 */
	protected boolean baseTokenIsWithdrawn = BASE_TOKEN_IS_WITHDRAWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.FORKED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getBaseToken() {
		if (baseToken != null && baseToken.eIsProxy()) {
			InternalEObject oldBaseToken = (InternalEObject)baseToken;
			baseToken = (Token)eResolveProxy(oldBaseToken);
			if (baseToken != oldBaseToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
			}
		}
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetBaseToken() {
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseToken(Token newBaseToken) {
		Token oldBaseToken = baseToken;
		baseToken = newBaseToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingOffersCount() {
		return remainingOffersCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOffersCount(int newRemainingOffersCount) {
		int oldRemainingOffersCount = remainingOffersCount;
		remainingOffersCount = newRemainingOffersCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT, oldRemainingOffersCount, remainingOffersCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBaseTokenIsWithdrawn() {
		return baseTokenIsWithdrawn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTokenIsWithdrawn(boolean newBaseTokenIsWithdrawn) {
		boolean oldBaseTokenIsWithdrawn = baseTokenIsWithdrawn;
		baseTokenIsWithdrawn = newBaseTokenIsWithdrawn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN, oldBaseTokenIsWithdrawn, baseTokenIsWithdrawn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
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
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN:
				if (resolve) return getBaseToken();
				return basicGetBaseToken();
			case IntermediateActivitiesPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				return getRemainingOffersCount();
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN:
				return isBaseTokenIsWithdrawn();
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
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((Token)newValue);
				return;
			case IntermediateActivitiesPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount((Integer)newValue);
				return;
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN:
				setBaseTokenIsWithdrawn((Boolean)newValue);
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
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((Token)null);
				return;
			case IntermediateActivitiesPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount(REMAINING_OFFERS_COUNT_EDEFAULT);
				return;
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN:
				setBaseTokenIsWithdrawn(BASE_TOKEN_IS_WITHDRAWN_EDEFAULT);
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
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN:
				return baseToken != null;
			case IntermediateActivitiesPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				return remainingOffersCount != REMAINING_OFFERS_COUNT_EDEFAULT;
			case IntermediateActivitiesPackage.FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN:
				return baseTokenIsWithdrawn != BASE_TOKEN_IS_WITHDRAWN_EDEFAULT;
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
		result.append(" (remainingOffersCount: ");
		result.append(remainingOffersCount);
		result.append(", baseTokenIsWithdrawn: ");
		result.append(baseTokenIsWithdrawn);
		result.append(')');
		return result.toString();
	}

} //ForkedTokenImpl
