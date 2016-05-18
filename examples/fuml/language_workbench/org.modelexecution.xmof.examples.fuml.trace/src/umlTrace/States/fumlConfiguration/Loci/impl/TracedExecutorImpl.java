/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

import fumlConfiguration.Loci.Executor;

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

import umlTrace.States.Executor_locus_Executor_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl#getLocus_ExecutorSequence <em>Locus Executor Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedExecutorImpl extends MinimalEObjectImpl.Container implements TracedExecutor {
	/**
	 * The cached value of the '{@link #getLocus_ExecutorSequence() <em>Locus Executor Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor_locus_Executor_Value> locus_ExecutorSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Executor originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.TRACED_EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Executor_locus_Executor_Value> getLocus_ExecutorSequence() {
		if (locus_ExecutorSequence == null) {
			locus_ExecutorSequence = new EObjectContainmentWithInverseEList<Executor_locus_Executor_Value>(Executor_locus_Executor_Value.class, this, LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE, StatesPackage.EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT);
		}
		return locus_ExecutorSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Executor)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Executor newOriginalObject) {
		Executor oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_ExecutorSequence()).basicAdd(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				return ((InternalEList<?>)getLocus_ExecutorSequence()).basicRemove(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				return getLocus_ExecutorSequence();
			case LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				getLocus_ExecutorSequence().clear();
				getLocus_ExecutorSequence().addAll((Collection<? extends Executor_locus_Executor_Value>)newValue);
				return;
			case LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT:
				setOriginalObject((Executor)newValue);
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				getLocus_ExecutorSequence().clear();
				return;
			case LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT:
				setOriginalObject((Executor)null);
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
			case LociPackage.TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE:
				return locus_ExecutorSequence != null && !locus_ExecutorSequence.isEmpty();
			case LociPackage.TRACED_EXECUTOR__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedExecutorImpl
