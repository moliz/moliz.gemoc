/**
 */
package imlTrace.States.iml.impl;

import imlTrace.States.iml.ImlPackage;
import imlTrace.States.iml.TracedAddData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Add Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.impl.TracedAddDataImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedAddDataImpl extends TracedIdentifyableElementImpl implements TracedAddData {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected AddData originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedAddDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.TRACED_ADD_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (AddData)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(AddData newOriginalObject) {
		AddData oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT:
				setOriginalObject((AddData)newValue);
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
			case ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT:
				setOriginalObject((AddData)null);
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
			case ImlPackage.TRACED_ADD_DATA__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedAddDataImpl
