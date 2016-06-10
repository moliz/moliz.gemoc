/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Loci.impl;

import fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl#getRuntimeModelElementSequence <em>Runtime Model Element Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedSemanticVisitorImpl extends MinimalEObjectImpl.Container implements TracedSemanticVisitor {
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
			case LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE:
				return runtimeModelElementSequence != null && !runtimeModelElementSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedSemanticVisitorImpl
