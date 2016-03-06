/**
 */
package xmofxdsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xmofxdsml.XmofxdsmlFactory
 * @model kind="package"
 * @generated
 */
public interface XmofxdsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmofxdsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof_xdsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xmofxdsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmofxdsmlPackage eINSTANCE = xmofxdsml.impl.XmofxdsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link xmofxdsml.impl.XMOFLanguageDefinitonImpl <em>XMOF Language Definiton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmofxdsml.impl.XMOFLanguageDefinitonImpl
	 * @see xmofxdsml.impl.XmofxdsmlPackageImpl#getXMOFLanguageDefiniton()
	 * @generated
	 */
	int XMOF_LANGUAGE_DEFINITON = 0;

	/**
	 * The feature id for the '<em><b>Domain Model Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__DOMAIN_MODEL_PROJECT = Xdsml_basePackage.LANGUAGE_DEFINITION__DOMAIN_MODEL_PROJECT;

	/**
	 * The feature id for the '<em><b>Editor Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__EDITOR_PROJECTS = Xdsml_basePackage.LANGUAGE_DEFINITION__EDITOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Animator Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__ANIMATOR_PROJECTS = Xdsml_basePackage.LANGUAGE_DEFINITION__ANIMATOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__NAME = Xdsml_basePackage.LANGUAGE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Melange URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__MELANGE_URI = Xdsml_basePackage.LANGUAGE_DEFINITION__MELANGE_URI;

	/**
	 * The feature id for the '<em><b>Need Melange Synchronization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__NEED_MELANGE_SYNCHRONIZATION = Xdsml_basePackage.LANGUAGE_DEFINITION__NEED_MELANGE_SYNCHRONIZATION;

	/**
	 * The feature id for the '<em><b>Xmof File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XMOF Language Definiton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON_FEATURE_COUNT = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get File Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON___GET_FILE_EXTENSIONS = Xdsml_basePackage.LANGUAGE_DEFINITION___GET_FILE_EXTENSIONS;

	/**
	 * The number of operations of the '<em>XMOF Language Definiton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOF_LANGUAGE_DEFINITON_OPERATION_COUNT = Xdsml_basePackage.LANGUAGE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmofxdsml.impl.XMFFileImpl <em>XMF File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmofxdsml.impl.XMFFileImpl
	 * @see xmofxdsml.impl.XmofxdsmlPackageImpl#getXMFFile()
	 * @generated
	 */
	int XMF_FILE = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMF_FILE__PROJECT_NAME = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Project Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMF_FILE__PROJECT_KIND = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_KIND;

	/**
	 * The feature id for the '<em><b>Xmof File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMF_FILE__XMOF_FILE_NAME = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XMF File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMF_FILE_FEATURE_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XMF File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMF_FILE_OPERATION_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xmofxdsml.XMOFLanguageDefiniton <em>XMOF Language Definiton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMOF Language Definiton</em>'.
	 * @see xmofxdsml.XMOFLanguageDefiniton
	 * @generated
	 */
	EClass getXMOFLanguageDefiniton();

	/**
	 * Returns the meta object for the containment reference '{@link xmofxdsml.XMOFLanguageDefiniton#getXmofFileName <em>Xmof File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xmof File Name</em>'.
	 * @see xmofxdsml.XMOFLanguageDefiniton#getXmofFileName()
	 * @see #getXMOFLanguageDefiniton()
	 * @generated
	 */
	EReference getXMOFLanguageDefiniton_XmofFileName();

	/**
	 * Returns the meta object for class '{@link xmofxdsml.XMFFile <em>XMF File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMF File</em>'.
	 * @see xmofxdsml.XMFFile
	 * @generated
	 */
	EClass getXMFFile();

	/**
	 * Returns the meta object for the attribute '{@link xmofxdsml.XMFFile#getXmofFileName <em>Xmof File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmof File Name</em>'.
	 * @see xmofxdsml.XMFFile#getXmofFileName()
	 * @see #getXMFFile()
	 * @generated
	 */
	EAttribute getXMFFile_XmofFileName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmofxdsmlFactory getXmofxdsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xmofxdsml.impl.XMOFLanguageDefinitonImpl <em>XMOF Language Definiton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmofxdsml.impl.XMOFLanguageDefinitonImpl
		 * @see xmofxdsml.impl.XmofxdsmlPackageImpl#getXMOFLanguageDefiniton()
		 * @generated
		 */
		EClass XMOF_LANGUAGE_DEFINITON = eINSTANCE.getXMOFLanguageDefiniton();

		/**
		 * The meta object literal for the '<em><b>Xmof File Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOF_LANGUAGE_DEFINITON__XMOF_FILE_NAME = eINSTANCE.getXMOFLanguageDefiniton_XmofFileName();

		/**
		 * The meta object literal for the '{@link xmofxdsml.impl.XMFFileImpl <em>XMF File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmofxdsml.impl.XMFFileImpl
		 * @see xmofxdsml.impl.XmofxdsmlPackageImpl#getXMFFile()
		 * @generated
		 */
		EClass XMF_FILE = eINSTANCE.getXMFFile();

		/**
		 * The meta object literal for the '<em><b>Xmof File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMF_FILE__XMOF_FILE_NAME = eINSTANCE.getXMFFile_XmofFileName();

	}

} //XmofxdsmlPackage
