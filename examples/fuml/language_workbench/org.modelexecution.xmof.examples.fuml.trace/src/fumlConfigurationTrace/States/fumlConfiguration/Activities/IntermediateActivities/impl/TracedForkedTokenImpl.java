/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value;
import fumlConfigurationTrace.States.ForkedToken_baseToken_Value;
import fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl#getBaseTokenIsWithdrawnSequence <em>Base Token Is Withdrawn Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl#getBaseTokenSequence <em>Base Token Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedForkedTokenImpl#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedForkedTokenImpl extends TracedTokenImpl implements TracedForkedToken {
	/**
	 * The cached value of the '{@link #getBaseTokenIsWithdrawnSequence() <em>Base Token Is Withdrawn Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTokenIsWithdrawnSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseTokenIsWithdrawn_Value> baseTokenIsWithdrawnSequence;

	/**
	 * The cached value of the '{@link #getBaseTokenSequence() <em>Base Token Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTokenSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> baseTokenSequence;

	/**
	 * The cached value of the '{@link #getRemainingOffersCountSequence() <em>Remaining Offers Count Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCountSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> remainingOffersCountSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedForkedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_FORKED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseTokenIsWithdrawn_Value> getBaseTokenIsWithdrawnSequence() {
		if (baseTokenIsWithdrawnSequence == null) {
			baseTokenIsWithdrawnSequence = new EObjectContainmentWithInverseEList<ForkedToken_baseTokenIsWithdrawn_Value>(ForkedToken_baseTokenIsWithdrawn_Value.class, this, IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE, StatesPackage.FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT);
		}
		return baseTokenIsWithdrawnSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getBaseTokenSequence() {
		if (baseTokenSequence == null) {
			baseTokenSequence = new EObjectContainmentWithInverseEList<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		}
		return baseTokenSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountSequence() {
		if (remainingOffersCountSequence == null) {
			remainingOffersCountSequence = new EObjectContainmentWithInverseEList<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		}
		return remainingOffersCountSequence;
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseTokenIsWithdrawnSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseTokenSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemainingOffersCountSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				return ((InternalEList<?>)getBaseTokenIsWithdrawnSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return ((InternalEList<?>)getBaseTokenSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return ((InternalEList<?>)getRemainingOffersCountSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				return getBaseTokenIsWithdrawnSequence();
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return getBaseTokenSequence();
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return getRemainingOffersCountSequence();
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				getBaseTokenIsWithdrawnSequence().clear();
				getBaseTokenIsWithdrawnSequence().addAll((Collection<? extends ForkedToken_baseTokenIsWithdrawn_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				getBaseTokenSequence().clear();
				getBaseTokenSequence().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				getRemainingOffersCountSequence().clear();
				getRemainingOffersCountSequence().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				getBaseTokenIsWithdrawnSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				getBaseTokenSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				getRemainingOffersCountSequence().clear();
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
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE:
				return baseTokenIsWithdrawnSequence != null && !baseTokenIsWithdrawnSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return baseTokenSequence != null && !baseTokenSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return remainingOffersCountSequence != null && !remainingOffersCountSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedForkedTokenImpl
