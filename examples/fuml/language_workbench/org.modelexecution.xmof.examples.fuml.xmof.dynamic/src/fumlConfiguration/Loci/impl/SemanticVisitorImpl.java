/**
 */
package fumlConfiguration.Loci.impl;

import fumlConfiguration.ElementConfiguration;
import fumlConfiguration.FumlConfigurationPackage;

import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.SemanticVisitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.impl.SemanticVisitorImpl#getRuntimeModelElement <em>Runtime Model Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticVisitorImpl extends MinimalEObjectImpl.Container implements SemanticVisitor {
	/**
	 * The cached value of the '{@link #getRuntimeModelElement() <em>Runtime Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeModelElement()
	 * @generated
	 * @ordered
	 */
	protected ElementConfiguration runtimeModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.SEMANTIC_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration getRuntimeModelElement() {
		if (runtimeModelElement != null && runtimeModelElement.eIsProxy()) {
			InternalEObject oldRuntimeModelElement = (InternalEObject)runtimeModelElement;
			runtimeModelElement = (ElementConfiguration)eResolveProxy(oldRuntimeModelElement);
			if (runtimeModelElement != oldRuntimeModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT, oldRuntimeModelElement, runtimeModelElement));
			}
		}
		return runtimeModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration basicGetRuntimeModelElement() {
		return runtimeModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeModelElement(ElementConfiguration newRuntimeModelElement, NotificationChain msgs) {
		ElementConfiguration oldRuntimeModelElement = runtimeModelElement;
		runtimeModelElement = newRuntimeModelElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT, oldRuntimeModelElement, newRuntimeModelElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeModelElement(ElementConfiguration newRuntimeModelElement) {
		if (newRuntimeModelElement != runtimeModelElement) {
			NotificationChain msgs = null;
			if (runtimeModelElement != null)
				msgs = ((InternalEObject)runtimeModelElement).eInverseRemove(this, FumlConfigurationPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR, ElementConfiguration.class, msgs);
			if (newRuntimeModelElement != null)
				msgs = ((InternalEObject)newRuntimeModelElement).eInverseAdd(this, FumlConfigurationPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR, ElementConfiguration.class, msgs);
			msgs = basicSetRuntimeModelElement(newRuntimeModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT, newRuntimeModelElement, newRuntimeModelElement));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				if (runtimeModelElement != null)
					msgs = ((InternalEObject)runtimeModelElement).eInverseRemove(this, FumlConfigurationPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR, ElementConfiguration.class, msgs);
				return basicSetRuntimeModelElement((ElementConfiguration)otherEnd, msgs);
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
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				return basicSetRuntimeModelElement(null, msgs);
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
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				if (resolve) return getRuntimeModelElement();
				return basicGetRuntimeModelElement();
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
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				setRuntimeModelElement((ElementConfiguration)newValue);
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
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				setRuntimeModelElement((ElementConfiguration)null);
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
			case LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT:
				return runtimeModelElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SemanticVisitorImpl
