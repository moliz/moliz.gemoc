/**
 */
package umlTrace.States.fumlConfiguration.impl;

import fumlConfiguration.ElementConfiguration;

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

import umlTrace.States.ElementConfiguration_semanticVisitor_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.FumlConfigurationPackage;
import umlTrace.States.fumlConfiguration.TracedElementConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedElementConfigurationImpl extends MinimalEObjectImpl.Container implements TracedElementConfiguration {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected ElementConfiguration originalObject;

	/**
	 * The cached value of the '{@link #getSemanticVisitorSequence() <em>Semantic Visitor Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVisitorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementConfiguration_semanticVisitor_Value> semanticVisitorSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationPackage.Literals.TRACED_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (ElementConfiguration)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(ElementConfiguration newOriginalObject) {
		ElementConfiguration oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementConfiguration_semanticVisitor_Value> getSemanticVisitorSequence() {
		if (semanticVisitorSequence == null) {
			semanticVisitorSequence = new EObjectContainmentWithInverseEList<ElementConfiguration_semanticVisitor_Value>(ElementConfiguration_semanticVisitor_Value.class, this, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT);
		}
		return semanticVisitorSequence;
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemanticVisitorSequence()).basicAdd(otherEnd, msgs);
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				return ((InternalEList<?>)getSemanticVisitorSequence()).basicRemove(otherEnd, msgs);
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				return getSemanticVisitorSequence();
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT:
				setOriginalObject((ElementConfiguration)newValue);
				return;
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				getSemanticVisitorSequence().clear();
				getSemanticVisitorSequence().addAll((Collection<? extends ElementConfiguration_semanticVisitor_Value>)newValue);
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT:
				setOriginalObject((ElementConfiguration)null);
				return;
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				getSemanticVisitorSequence().clear();
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT:
				return originalObject != null;
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				return semanticVisitorSequence != null && !semanticVisitorSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedElementConfigurationImpl
