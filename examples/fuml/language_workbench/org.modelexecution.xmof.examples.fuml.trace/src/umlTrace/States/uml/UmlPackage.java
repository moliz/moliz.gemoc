/**
 */
package umlTrace.States.uml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see umlTrace.States.uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace_uml";

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
	UmlPackage eINSTANCE = umlTrace.States.uml.impl.UmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedActivityEdgeImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedActivityEdge()
	 * @generated
	 */
	int TRACED_ACTIVITY_EDGE = 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedActivityNodeImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedActivityNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE = 1;

	/**
	 * The number of structural features of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedClassImpl <em>Traced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedClassImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedClass()
	 * @generated
	 */
	int TRACED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS__ORIGINAL_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Traced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedParameterImpl <em>Traced Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedParameterImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedParameter()
	 * @generated
	 */
	int TRACED_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER__ORIGINAL_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Traced Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedPrimitiveTypeImpl <em>Traced Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedPrimitiveTypeImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedPrimitiveType()
	 * @generated
	 */
	int TRACED_PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE__ORIGINAL_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Traced Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedStructuralFeatureImpl <em>Traced Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedStructuralFeatureImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedStructuralFeature()
	 * @generated
	 */
	int TRACED_STRUCTURAL_FEATURE = 5;

	/**
	 * The number of structural features of the '<em>Traced Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURAL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.uml.impl.TracedValueSpecificationImpl <em>Traced Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.uml.impl.TracedValueSpecificationImpl
	 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedValueSpecification()
	 * @generated
	 */
	int TRACED_VALUE_SPECIFICATION = 6;

	/**
	 * The number of structural features of the '<em>Traced Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_SPECIFICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge</em>'.
	 * @see umlTrace.States.uml.TracedActivityEdge
	 * @generated
	 */
	EClass getTracedActivityEdge();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedActivityNode <em>Traced Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node</em>'.
	 * @see umlTrace.States.uml.TracedActivityNode
	 * @generated
	 */
	EClass getTracedActivityNode();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedClass <em>Traced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Class</em>'.
	 * @see umlTrace.States.uml.TracedClass
	 * @generated
	 */
	EClass getTracedClass();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.uml.TracedClass#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.uml.TracedClass#getOriginalObject()
	 * @see #getTracedClass()
	 * @generated
	 */
	EReference getTracedClass_OriginalObject();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedParameter <em>Traced Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameter</em>'.
	 * @see umlTrace.States.uml.TracedParameter
	 * @generated
	 */
	EClass getTracedParameter();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.uml.TracedParameter#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.uml.TracedParameter#getOriginalObject()
	 * @see #getTracedParameter()
	 * @generated
	 */
	EReference getTracedParameter_OriginalObject();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedPrimitiveType <em>Traced Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Primitive Type</em>'.
	 * @see umlTrace.States.uml.TracedPrimitiveType
	 * @generated
	 */
	EClass getTracedPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link umlTrace.States.uml.TracedPrimitiveType#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see umlTrace.States.uml.TracedPrimitiveType#getOriginalObject()
	 * @see #getTracedPrimitiveType()
	 * @generated
	 */
	EReference getTracedPrimitiveType_OriginalObject();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedStructuralFeature <em>Traced Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structural Feature</em>'.
	 * @see umlTrace.States.uml.TracedStructuralFeature
	 * @generated
	 */
	EClass getTracedStructuralFeature();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.uml.TracedValueSpecification <em>Traced Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value Specification</em>'.
	 * @see umlTrace.States.uml.TracedValueSpecification
	 * @generated
	 */
	EClass getTracedValueSpecification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmlFactory getUmlFactory();

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
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedActivityEdgeImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedActivityEdge()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_EDGE = eINSTANCE.getTracedActivityEdge();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedActivityNodeImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedActivityNode()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_NODE = eINSTANCE.getTracedActivityNode();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedClassImpl <em>Traced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedClassImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedClass()
		 * @generated
		 */
		EClass TRACED_CLASS = eINSTANCE.getTracedClass();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CLASS__ORIGINAL_OBJECT = eINSTANCE.getTracedClass_OriginalObject();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedParameterImpl <em>Traced Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedParameterImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedParameter()
		 * @generated
		 */
		EClass TRACED_PARAMETER = eINSTANCE.getTracedParameter();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PARAMETER__ORIGINAL_OBJECT = eINSTANCE.getTracedParameter_OriginalObject();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedPrimitiveTypeImpl <em>Traced Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedPrimitiveTypeImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedPrimitiveType()
		 * @generated
		 */
		EClass TRACED_PRIMITIVE_TYPE = eINSTANCE.getTracedPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PRIMITIVE_TYPE__ORIGINAL_OBJECT = eINSTANCE.getTracedPrimitiveType_OriginalObject();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedStructuralFeatureImpl <em>Traced Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedStructuralFeatureImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedStructuralFeature()
		 * @generated
		 */
		EClass TRACED_STRUCTURAL_FEATURE = eINSTANCE.getTracedStructuralFeature();

		/**
		 * The meta object literal for the '{@link umlTrace.States.uml.impl.TracedValueSpecificationImpl <em>Traced Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.uml.impl.TracedValueSpecificationImpl
		 * @see umlTrace.States.uml.impl.UmlPackageImpl#getTracedValueSpecification()
		 * @generated
		 */
		EClass TRACED_VALUE_SPECIFICATION = eINSTANCE.getTracedValueSpecification();

	}

} //UmlPackage
