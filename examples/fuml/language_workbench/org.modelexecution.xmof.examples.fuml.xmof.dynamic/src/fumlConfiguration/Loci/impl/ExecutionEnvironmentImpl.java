/**
 */
package fumlConfiguration.Loci.impl;

import fumlConfiguration.Loci.ExecutionEnvironment;
import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.Locus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.impl.ExecutionEnvironmentImpl#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEnvironmentImpl extends MinimalEObjectImpl.Container implements ExecutionEnvironment {
	/**
	 * The cached value of the '{@link #getLocus_ExecutionEnvironment() <em>Locus Execution Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Locus locus_ExecutionEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.EXECUTION_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_ExecutionEnvironment() {
		return locus_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus_ExecutionEnvironment(Locus newLocus_ExecutionEnvironment, NotificationChain msgs) {
		Locus oldLocus_ExecutionEnvironment = locus_ExecutionEnvironment;
		locus_ExecutionEnvironment = newLocus_ExecutionEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT, oldLocus_ExecutionEnvironment, newLocus_ExecutionEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExecutionEnvironment(Locus newLocus_ExecutionEnvironment) {
		if (newLocus_ExecutionEnvironment != locus_ExecutionEnvironment) {
			NotificationChain msgs = null;
			if (locus_ExecutionEnvironment != null)
				msgs = ((InternalEObject)locus_ExecutionEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT, null, msgs);
			if (newLocus_ExecutionEnvironment != null)
				msgs = ((InternalEObject)newLocus_ExecutionEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT, null, msgs);
			msgs = basicSetLocus_ExecutionEnvironment(newLocus_ExecutionEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT, newLocus_ExecutionEnvironment, newLocus_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT:
				return basicSetLocus_ExecutionEnvironment(null, msgs);
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
			case LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT:
				return getLocus_ExecutionEnvironment();
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
			case LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT:
				setLocus_ExecutionEnvironment((Locus)newValue);
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
			case LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT:
				setLocus_ExecutionEnvironment((Locus)null);
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
			case LociPackage.EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT:
				return locus_ExecutionEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionEnvironmentImpl
