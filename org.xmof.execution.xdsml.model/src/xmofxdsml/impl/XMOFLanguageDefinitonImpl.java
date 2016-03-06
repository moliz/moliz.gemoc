/**
 */
package xmofxdsml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionframework.xdsml_base.impl.LanguageDefinitionImpl;

import xmofxdsml.XMFFile;
import xmofxdsml.XMOFLanguageDefiniton;
import xmofxdsml.XmofxdsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMOF Language Definiton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmofxdsml.impl.XMOFLanguageDefinitonImpl#getXmofFileName <em>Xmof File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMOFLanguageDefinitonImpl extends LanguageDefinitionImpl implements XMOFLanguageDefiniton {
	/**
	 * The cached value of the '{@link #getXmofFileName() <em>Xmof File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmofFileName()
	 * @generated
	 * @ordered
	 */
	protected XMFFile xmofFileName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMOFLanguageDefinitonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmofxdsmlPackage.Literals.XMOF_LANGUAGE_DEFINITON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMFFile getXmofFileName() {
		return xmofFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmofFileName(XMFFile newXmofFileName, NotificationChain msgs) {
		XMFFile oldXmofFileName = xmofFileName;
		xmofFileName = newXmofFileName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME, oldXmofFileName, newXmofFileName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmofFileName(XMFFile newXmofFileName) {
		if (newXmofFileName != xmofFileName) {
			NotificationChain msgs = null;
			if (xmofFileName != null)
				msgs = ((InternalEObject)xmofFileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME, null, msgs);
			if (newXmofFileName != null)
				msgs = ((InternalEObject)newXmofFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME, null, msgs);
			msgs = basicSetXmofFileName(newXmofFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME, newXmofFileName, newXmofFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME:
				return basicSetXmofFileName(null, msgs);
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
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME:
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
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME:
				setXmofFileName((XMFFile)newValue);
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
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME:
				setXmofFileName((XMFFile)null);
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
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME:
				return xmofFileName != null;
		}
		return super.eIsSet(featureID);
	}

} //XMOFLanguageDefinitonImpl
