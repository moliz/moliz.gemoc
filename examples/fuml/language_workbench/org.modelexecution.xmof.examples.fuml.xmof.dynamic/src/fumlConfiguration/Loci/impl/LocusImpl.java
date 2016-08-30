/**
 */
package fumlConfiguration.Loci.impl;

import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfiguration.Loci.ExecutionFactory;
import fumlConfiguration.Loci.Executor;
import fumlConfiguration.Loci.LociPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.impl.LocusImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.impl.LocusImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.impl.LocusImpl#getExtensionalValues <em>Extensional Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocusImpl extends MinimalEObjectImpl.Container implements Locus {
	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected ExecutionFactory factory;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getExtensionalValues() <em>Extensional Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionalValue> extensionalValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.LOCUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory getFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactory(ExecutionFactory newFactory, NotificationChain msgs) {
		ExecutionFactory oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LociPackage.LOCUS__FACTORY, oldFactory, newFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(ExecutionFactory newFactory) {
		if (newFactory != factory) {
			NotificationChain msgs = null;
			if (factory != null)
				msgs = ((InternalEObject)factory).eInverseRemove(this, LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, ExecutionFactory.class, msgs);
			if (newFactory != null)
				msgs = ((InternalEObject)newFactory).eInverseAdd(this, LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, ExecutionFactory.class, msgs);
			msgs = basicSetFactory(newFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.LOCUS__FACTORY, newFactory, newFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LociPackage.LOCUS__EXECUTOR, oldExecutor, newExecutor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject)executor).eInverseRemove(this, LociPackage.EXECUTOR__LOCUS_EXECUTOR, Executor.class, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject)newExecutor).eInverseAdd(this, LociPackage.EXECUTOR__LOCUS_EXECUTOR, Executor.class, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.LOCUS__EXECUTOR, newExecutor, newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionalValue> getExtensionalValues() {
		if (extensionalValues == null) {
			extensionalValues = new EObjectContainmentWithInverseEList<ExtensionalValue>(ExtensionalValue.class, this, LociPackage.LOCUS__EXTENSIONAL_VALUES, KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE);
		}
		return extensionalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(ExtensionalValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(ExtensionalValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instantiate(org.eclipse.uml2.uml.Class type, fumlConfiguration.Classes.Kernel.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LociPackage.LOCUS__FACTORY:
				if (factory != null)
					msgs = ((InternalEObject)factory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LociPackage.LOCUS__FACTORY, null, msgs);
				return basicSetFactory((ExecutionFactory)otherEnd, msgs);
			case LociPackage.LOCUS__EXECUTOR:
				if (executor != null)
					msgs = ((InternalEObject)executor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LociPackage.LOCUS__EXECUTOR, null, msgs);
				return basicSetExecutor((Executor)otherEnd, msgs);
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionalValues()).basicAdd(otherEnd, msgs);
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
			case LociPackage.LOCUS__FACTORY:
				return basicSetFactory(null, msgs);
			case LociPackage.LOCUS__EXECUTOR:
				return basicSetExecutor(null, msgs);
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				return ((InternalEList<?>)getExtensionalValues()).basicRemove(otherEnd, msgs);
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
			case LociPackage.LOCUS__FACTORY:
				return getFactory();
			case LociPackage.LOCUS__EXECUTOR:
				return getExecutor();
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				return getExtensionalValues();
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
			case LociPackage.LOCUS__FACTORY:
				setFactory((ExecutionFactory)newValue);
				return;
			case LociPackage.LOCUS__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				getExtensionalValues().clear();
				getExtensionalValues().addAll((Collection<? extends ExtensionalValue>)newValue);
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
			case LociPackage.LOCUS__FACTORY:
				setFactory((ExecutionFactory)null);
				return;
			case LociPackage.LOCUS__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				getExtensionalValues().clear();
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
			case LociPackage.LOCUS__FACTORY:
				return factory != null;
			case LociPackage.LOCUS__EXECUTOR:
				return executor != null;
			case LociPackage.LOCUS__EXTENSIONAL_VALUES:
				return extensionalValues != null && !extensionalValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocusImpl
