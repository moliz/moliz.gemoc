/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.Locus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.impl.ExtensionalValueImpl#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtensionalValueImpl extends CompoundValueImpl implements ExtensionalValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.EXTENSIONAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_ExtensionalValue() {
		if (eContainerFeatureID() != KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE) return null;
		return (Locus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus_ExtensionalValue(Locus newLocus_ExtensionalValue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocus_ExtensionalValue, KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExtensionalValue(Locus newLocus_ExtensionalValue) {
		if (newLocus_ExtensionalValue != eInternalContainer() || (eContainerFeatureID() != KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE && newLocus_ExtensionalValue != null)) {
			if (EcoreUtil.isAncestor(this, newLocus_ExtensionalValue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocus_ExtensionalValue != null)
				msgs = ((InternalEObject)newLocus_ExtensionalValue).eInverseAdd(this, LociPackage.LOCUS__EXTENSIONAL_VALUES, Locus.class, msgs);
			msgs = basicSetLocus_ExtensionalValue(newLocus_ExtensionalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE, newLocus_ExtensionalValue, newLocus_ExtensionalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void destroy() {
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocus_ExtensionalValue((Locus)otherEnd, msgs);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				return basicSetLocus_ExtensionalValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				return eInternalContainer().eInverseRemove(this, LociPackage.LOCUS__EXTENSIONAL_VALUES, Locus.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				return getLocus_ExtensionalValue();
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				setLocus_ExtensionalValue((Locus)newValue);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				setLocus_ExtensionalValue((Locus)null);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE:
				return getLocus_ExtensionalValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionalValueImpl
