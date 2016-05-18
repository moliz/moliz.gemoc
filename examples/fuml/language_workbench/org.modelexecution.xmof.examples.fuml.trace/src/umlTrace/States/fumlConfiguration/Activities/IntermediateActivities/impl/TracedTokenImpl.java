/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.StatesPackage;
import umlTrace.States.Token_holder_Value;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl#getHolderSequence <em>Holder Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedTokenImpl#getOriginalObject_Token <em>Original Object Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedTokenImpl extends MinimalEObjectImpl.Container implements TracedToken {
	/**
	 * The cached value of the '{@link #getHolderSequence() <em>Holder Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Token_holder_Value> holderSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject_Token() <em>Original Object Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_Token()
	 * @generated
	 * @ordered
	 */
	protected Token originalObject_Token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token_holder_Value> getHolderSequence() {
		if (holderSequence == null) {
			holderSequence = new EObjectContainmentWithInverseEList<Token_holder_Value>(Token_holder_Value.class, this, IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE, StatesPackage.TOKEN_HOLDER_VALUE__PARENT);
		}
		return holderSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getOriginalObject_Token() {
		if (originalObject_Token != null && originalObject_Token.eIsProxy()) {
			InternalEObject oldOriginalObject_Token = (InternalEObject)originalObject_Token;
			originalObject_Token = (Token)eResolveProxy(oldOriginalObject_Token);
			if (originalObject_Token != oldOriginalObject_Token) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN, oldOriginalObject_Token, originalObject_Token));
			}
		}
		return originalObject_Token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetOriginalObject_Token() {
		return originalObject_Token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_Token(Token newOriginalObject_Token) {
		Token oldOriginalObject_Token = originalObject_Token;
		originalObject_Token = newOriginalObject_Token;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN, oldOriginalObject_Token, originalObject_Token));
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHolderSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return ((InternalEList<?>)getHolderSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return getHolderSequence();
			case IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN:
				if (resolve) return getOriginalObject_Token();
				return basicGetOriginalObject_Token();
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				getHolderSequence().clear();
				getHolderSequence().addAll((Collection<? extends Token_holder_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN:
				setOriginalObject_Token((Token)newValue);
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				getHolderSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN:
				setOriginalObject_Token((Token)null);
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
			case IntermediateActivitiesPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return holderSequence != null && !holderSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN:
				return originalObject_Token != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTokenImpl
