/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

import fumlConfiguration.Loci.SemanticVisitor;

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

import umlTrace.States.SemanticVisitor_runtimeModelElement_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl#getOriginalObject_SemanticVisitor <em>Original Object Semantic Visitor</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl#getRuntimeModelElementSequence <em>Runtime Model Element Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedSemanticVisitorImpl extends MinimalEObjectImpl.Container implements TracedSemanticVisitor {
	/**
	 * The cached value of the '{@link #getOriginalObject_SemanticVisitor() <em>Original Object Semantic Visitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_SemanticVisitor()
	 * @generated
	 * @ordered
	 */
	protected SemanticVisitor originalObject_SemanticVisitor;

	/**
	 * The cached value of the '{@link #getRuntimeModelElementSequence() <em>Runtime Model Element Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeModelElementSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticVisitor_runtimeModelElement_Value> runtimeModelElementSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedSemanticVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.TRACED_SEMANTIC_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVisitor getOriginalObject_SemanticVisitor() {
		if (originalObject_SemanticVisitor != null && originalObject_SemanticVisitor.eIsProxy()) {
			InternalEObject oldOriginalObject_SemanticVisitor = (InternalEObject)originalObject_SemanticVisitor;
			originalObject_SemanticVisitor = (SemanticVisitor)eResolveProxy(oldOriginalObject_SemanticVisitor);
			if (originalObject_SemanticVisitor != oldOriginalObject_SemanticVisitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR, oldOriginalObject_SemanticVisitor, originalObject_SemanticVisitor));
			}
		}
		return originalObject_SemanticVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticVisitor basicGetOriginalObject_SemanticVisitor() {
		return originalObject_SemanticVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_SemanticVisitor(SemanticVisitor newOriginalObject_SemanticVisitor) {
		SemanticVisitor oldOriginalObject_SemanticVisitor = originalObject_SemanticVisitor;
		originalObject_SemanticVisitor = newOriginalObject_SemanticVisitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR, oldOriginalObject_SemanticVisitor, originalObject_SemanticVisitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVisitor_runtimeModelElement_Value> getRuntimeModelElementSequence() {
		if (runtimeModelElementSequence == null) {
			runtimeModelElementSequence = new EObjectContainmentWithInverseEList<SemanticVisitor_runtimeModelElement_Value>(SemanticVisitor_runtimeModelElement_Value.class, this, LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT);
		}
		return runtimeModelElementSequence;
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeModelElementSequence()).basicAdd(otherEnd, msgs);
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				return ((InternalEList<?>)getRuntimeModelElementSequence()).basicRemove(otherEnd, msgs);
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR:
				if (resolve) return getOriginalObject_SemanticVisitor();
				return basicGetOriginalObject_SemanticVisitor();
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				return getRuntimeModelElementSequence();
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR:
				setOriginalObject_SemanticVisitor((SemanticVisitor)newValue);
				return;
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				getRuntimeModelElementSequence().clear();
				getRuntimeModelElementSequence().addAll((Collection<? extends SemanticVisitor_runtimeModelElement_Value>)newValue);
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR:
				setOriginalObject_SemanticVisitor((SemanticVisitor)null);
				return;
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				getRuntimeModelElementSequence().clear();
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__ORIGINAL_OBJECT_SEMANTIC_VISITOR:
				return originalObject_SemanticVisitor != null;
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				return runtimeModelElementSequence != null && !runtimeModelElementSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedSemanticVisitorImpl
