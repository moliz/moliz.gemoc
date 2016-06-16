/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl.ReferenceImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends StructuredValueImpl implements Reference {
	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object referent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelFewStepsPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object getReferent() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject)referent;
			referent = (fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelFewStepsPackage.REFERENCE__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object basicGetReferent() {
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferent(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object newReferent) {
		fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelFewStepsPackage.REFERENCE__REFERENT, oldReferent, referent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelFewStepsPackage.REFERENCE__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
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
			case KernelFewStepsPackage.REFERENCE__REFERENT:
				setReferent((fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)newValue);
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
			case KernelFewStepsPackage.REFERENCE__REFERENT:
				setReferent((fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)null);
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
			case KernelFewStepsPackage.REFERENCE__REFERENT:
				return referent != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
