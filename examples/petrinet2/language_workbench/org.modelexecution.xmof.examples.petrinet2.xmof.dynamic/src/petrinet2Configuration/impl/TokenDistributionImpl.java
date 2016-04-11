/**
 */
package petrinet2Configuration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.Token;
import petrinet2Configuration.TokenDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinet2Configuration.impl.TokenDistributionImpl#getInitialTokens <em>Initial Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenDistributionImpl extends MinimalEObjectImpl.Container implements TokenDistribution {
	/**
	 * The cached value of the '{@link #getInitialTokens() <em>Initial Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> initialTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinet2ConfigurationPackage.Literals.TOKEN_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getInitialTokens() {
		if (initialTokens == null) {
			initialTokens = new EObjectContainmentEList<Token>(Token.class, this, Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS);
		}
		return initialTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS:
				return ((InternalEList<?>)getInitialTokens()).basicRemove(otherEnd, msgs);
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
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS:
				return getInitialTokens();
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
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS:
				getInitialTokens().clear();
				getInitialTokens().addAll((Collection<? extends Token>)newValue);
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
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS:
				getInitialTokens().clear();
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
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION__INITIAL_TOKENS:
				return initialTokens != null && !initialTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TokenDistributionImpl
