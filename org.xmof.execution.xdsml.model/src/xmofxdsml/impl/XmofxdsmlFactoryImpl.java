/**
 */
package xmofxdsml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xmofxdsml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmofxdsmlFactoryImpl extends EFactoryImpl implements XmofxdsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmofxdsmlFactory init() {
		try {
			XmofxdsmlFactory theXmofxdsmlFactory = (XmofxdsmlFactory)EPackage.Registry.INSTANCE.getEFactory(XmofxdsmlPackage.eNS_URI);
			if (theXmofxdsmlFactory != null) {
				return theXmofxdsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmofxdsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmofxdsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON: return createXMOFLanguageDefiniton();
			case XmofxdsmlPackage.XMF_FILE: return createXMFFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMOFLanguageDefiniton createXMOFLanguageDefiniton() {
		XMOFLanguageDefinitonImpl xmofLanguageDefiniton = new XMOFLanguageDefinitonImpl();
		return xmofLanguageDefiniton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMFFile createXMFFile() {
		XMFFileImpl xmfFile = new XMFFileImpl();
		return xmfFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmofxdsmlPackage getXmofxdsmlPackage() {
		return (XmofxdsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmofxdsmlPackage getPackage() {
		return XmofxdsmlPackage.eINSTANCE;
	}

} //XmofxdsmlFactoryImpl
