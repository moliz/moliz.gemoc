/**
 */
package xmofxdsml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

import xmofxdsml.XMFFile;
import xmofxdsml.XMOFLanguageDefiniton;
import xmofxdsml.XmofxdsmlFactory;
import xmofxdsml.XmofxdsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmofxdsmlPackageImpl extends EPackageImpl implements XmofxdsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmofLanguageDefinitonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmfFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xmofxdsml.XmofxdsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmofxdsmlPackageImpl() {
		super(eNS_URI, XmofxdsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XmofxdsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmofxdsmlPackage init() {
		if (isInited) return (XmofxdsmlPackage)EPackage.Registry.INSTANCE.getEPackage(XmofxdsmlPackage.eNS_URI);

		// Obtain or create and register package
		XmofxdsmlPackageImpl theXmofxdsmlPackage = (XmofxdsmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmofxdsmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmofxdsmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Xdsml_basePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmofxdsmlPackage.createPackageContents();

		// Initialize created meta-data
		theXmofxdsmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmofxdsmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmofxdsmlPackage.eNS_URI, theXmofxdsmlPackage);
		return theXmofxdsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMOFLanguageDefiniton() {
		return xmofLanguageDefinitonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMOFLanguageDefiniton_XmofFileName() {
		return (EReference)xmofLanguageDefinitonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMFFile() {
		return xmfFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMFFile_XmofFileName() {
		return (EAttribute)xmfFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmofxdsmlFactory getXmofxdsmlFactory() {
		return (XmofxdsmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xmofLanguageDefinitonEClass = createEClass(XMOF_LANGUAGE_DEFINITON);
		createEReference(xmofLanguageDefinitonEClass, XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME);

		xmfFileEClass = createEClass(XMF_FILE);
		createEAttribute(xmfFileEClass, XMF_FILE__XMOF_FILE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Xdsml_basePackage theXdsml_basePackage = (Xdsml_basePackage)EPackage.Registry.INSTANCE.getEPackage(Xdsml_basePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmofLanguageDefinitonEClass.getESuperTypes().add(theXdsml_basePackage.getLanguageDefinition());
		xmfFileEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(xmofLanguageDefinitonEClass, XMOFLanguageDefiniton.class, "XMOFLanguageDefiniton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMOFLanguageDefiniton_XmofFileName(), this.getXMFFile(), null, "xmofFileName", null, 0, 1, XMOFLanguageDefiniton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmfFileEClass, XMFFile.class, "XMFFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMFFile_XmofFileName(), ecorePackage.getEString(), "xmofFileName", null, 0, 1, XMFFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XmofxdsmlPackageImpl
