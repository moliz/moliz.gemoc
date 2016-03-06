/**
 */
package xmofxdsml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionframework.xdsml_base.impl.ProjectResourceImpl;

import xmofxdsml.XMFFile;
import xmofxdsml.XmofxdsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMF File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmofxdsml.impl.XMFFileImpl#getXmofFileName <em>Xmof File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMFFileImpl extends ProjectResourceImpl implements XMFFile {
	/**
	 * The default value of the '{@link #getXmofFileName() <em>Xmof File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmofFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String XMOF_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmofFileName() <em>Xmof File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmofFileName()
	 * @generated
	 * @ordered
	 */
	protected String xmofFileName = XMOF_FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMFFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmofxdsmlPackage.Literals.XMF_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmofFileName() {
		return xmofFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmofFileName(String newXmofFileName) {
		String oldXmofFileName = xmofFileName;
		xmofFileName = newXmofFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME, oldXmofFileName, xmofFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME:
				return getXmofFileName();
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
			case XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME:
				setXmofFileName((String)newValue);
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
			case XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME:
				setXmofFileName(XMOF_FILE_NAME_EDEFAULT);
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
			case XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME:
				return XMOF_FILE_NAME_EDEFAULT == null ? xmofFileName != null : !XMOF_FILE_NAME_EDEFAULT.equals(xmofFileName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xmofFileName: ");
		result.append(xmofFileName);
		result.append(')');
		return result.toString();
	}

} //XMFFileImpl
