/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

import fumlConfiguration.Loci.Locus;

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

import umlTrace.States.Locus_executor_Value;
import umlTrace.States.Locus_extensionalValues_Value;
import umlTrace.States.Locus_factory_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Locus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl#getExecutorSequence <em>Executor Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl#getExtensionalValuesSequence <em>Extensional Values Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl#getFactorySequence <em>Factory Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedLocusImpl extends MinimalEObjectImpl.Container implements TracedLocus {
	/**
	 * The cached value of the '{@link #getExecutorSequence() <em>Executor Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_executor_Value> executorSequence;

	/**
	 * The cached value of the '{@link #getExtensionalValuesSequence() <em>Extensional Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionalValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_extensionalValues_Value> extensionalValuesSequence;

	/**
	 * The cached value of the '{@link #getFactorySequence() <em>Factory Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorySequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Locus_factory_Value> factorySequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Locus originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedLocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.TRACED_LOCUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_executor_Value> getExecutorSequence() {
		if (executorSequence == null) {
			executorSequence = new EObjectContainmentWithInverseEList<Locus_executor_Value>(Locus_executor_Value.class, this, LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE, StatesPackage.LOCUS_EXECUTOR_VALUE__PARENT);
		}
		return executorSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_extensionalValues_Value> getExtensionalValuesSequence() {
		if (extensionalValuesSequence == null) {
			extensionalValuesSequence = new EObjectContainmentWithInverseEList<Locus_extensionalValues_Value>(Locus_extensionalValues_Value.class, this, LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE, StatesPackage.LOCUS_EXTENSIONAL_VALUES_VALUE__PARENT);
		}
		return extensionalValuesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locus_factory_Value> getFactorySequence() {
		if (factorySequence == null) {
			factorySequence = new EObjectContainmentWithInverseEList<Locus_factory_Value>(Locus_factory_Value.class, this, LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE, StatesPackage.LOCUS_FACTORY_VALUE__PARENT);
		}
		return factorySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Locus)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Locus newOriginalObject) {
		Locus oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutorSequence()).basicAdd(otherEnd, msgs);
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionalValuesSequence()).basicAdd(otherEnd, msgs);
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFactorySequence()).basicAdd(otherEnd, msgs);
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				return ((InternalEList<?>)getExecutorSequence()).basicRemove(otherEnd, msgs);
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				return ((InternalEList<?>)getExtensionalValuesSequence()).basicRemove(otherEnd, msgs);
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				return ((InternalEList<?>)getFactorySequence()).basicRemove(otherEnd, msgs);
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				return getExecutorSequence();
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				return getExtensionalValuesSequence();
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				return getFactorySequence();
			case LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT:
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				getExecutorSequence().clear();
				getExecutorSequence().addAll((Collection<? extends Locus_executor_Value>)newValue);
				return;
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				getExtensionalValuesSequence().clear();
				getExtensionalValuesSequence().addAll((Collection<? extends Locus_extensionalValues_Value>)newValue);
				return;
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				getFactorySequence().clear();
				getFactorySequence().addAll((Collection<? extends Locus_factory_Value>)newValue);
				return;
			case LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT:
				setOriginalObject((Locus)newValue);
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				getExecutorSequence().clear();
				return;
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				getExtensionalValuesSequence().clear();
				return;
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				getFactorySequence().clear();
				return;
			case LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT:
				setOriginalObject((Locus)null);
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
			case LociPackage.TRACED_LOCUS__EXECUTOR_SEQUENCE:
				return executorSequence != null && !executorSequence.isEmpty();
			case LociPackage.TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE:
				return extensionalValuesSequence != null && !extensionalValuesSequence.isEmpty();
			case LociPackage.TRACED_LOCUS__FACTORY_SEQUENCE:
				return factorySequence != null && !factorySequence.isEmpty();
			case LociPackage.TRACED_LOCUS__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedLocusImpl
