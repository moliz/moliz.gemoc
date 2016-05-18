/**
 */
package umlTrace.States.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see umlTrace.States.ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace_ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = umlTrace.States.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.ecore.impl.TracedEModelElementImpl <em>Traced EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.ecore.impl.TracedEModelElementImpl
	 * @see umlTrace.States.ecore.impl.EcorePackageImpl#getTracedEModelElement()
	 * @generated
	 */
	int TRACED_EMODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Traced EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EMODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EMODEL_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.ecore.TracedEModelElement <em>Traced EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced EModel Element</em>'.
	 * @see umlTrace.States.ecore.TracedEModelElement
	 * @generated
	 */
	EClass getTracedEModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

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
		 * The meta object literal for the '{@link umlTrace.States.ecore.impl.TracedEModelElementImpl <em>Traced EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.ecore.impl.TracedEModelElementImpl
		 * @see umlTrace.States.ecore.impl.EcorePackageImpl#getTracedEModelElement()
		 * @generated
		 */
		EClass TRACED_EMODEL_ELEMENT = eINSTANCE.getTracedEModelElement();

	}

} //EcorePackage
