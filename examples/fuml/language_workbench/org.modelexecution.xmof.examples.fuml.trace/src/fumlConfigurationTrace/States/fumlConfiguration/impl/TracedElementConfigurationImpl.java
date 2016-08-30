/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.impl;

import fumlConfiguration.ElementConfiguration;

import fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage;
import fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl#getOriginalObject_ElementConfiguration <em>Original Object Element Configuration</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedElementConfigurationImpl#getSemanticVisitorSequence <em>Semantic Visitor Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedElementConfigurationImpl extends MinimalEObjectImpl.Container implements TracedElementConfiguration {
	/**
	 * The cached value of the '{@link #getOriginalObject_ElementConfiguration() <em>Original Object Element Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_ElementConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ElementConfiguration originalObject_ElementConfiguration;

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
		return FumlConfigurationPackage.eINSTANCE.getTracedElementConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration getOriginalObject_ElementConfiguration() {
		if (originalObject_ElementConfiguration != null && originalObject_ElementConfiguration.eIsProxy()) {
			InternalEObject oldOriginalObject_ElementConfiguration = (InternalEObject)originalObject_ElementConfiguration;
			originalObject_ElementConfiguration = (ElementConfiguration)eResolveProxy(oldOriginalObject_ElementConfiguration);
			if (originalObject_ElementConfiguration != oldOriginalObject_ElementConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION, oldOriginalObject_ElementConfiguration, originalObject_ElementConfiguration));
			}
		}
		return originalObject_ElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration basicGetOriginalObject_ElementConfiguration() {
		return originalObject_ElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_ElementConfiguration(ElementConfiguration newOriginalObject_ElementConfiguration) {
		ElementConfiguration oldOriginalObject_ElementConfiguration = originalObject_ElementConfiguration;
		originalObject_ElementConfiguration = newOriginalObject_ElementConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION, oldOriginalObject_ElementConfiguration, originalObject_ElementConfiguration));
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION:
				if (resolve) return getOriginalObject_ElementConfiguration();
				return basicGetOriginalObject_ElementConfiguration();
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION:
				setOriginalObject_ElementConfiguration((ElementConfiguration)newValue);
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION:
				setOriginalObject_ElementConfiguration((ElementConfiguration)null);
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__ORIGINAL_OBJECT_ELEMENT_CONFIGURATION:
				return originalObject_ElementConfiguration != null;
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE:
				return semanticVisitorSequence != null && !semanticVisitorSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedElementConfigurationImpl
