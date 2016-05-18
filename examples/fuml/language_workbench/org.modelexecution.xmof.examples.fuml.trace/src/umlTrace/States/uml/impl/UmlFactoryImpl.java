/**
 */
package umlTrace.States.uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.uml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlFactory init() {
		try {
			UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory(UmlPackage.eNS_URI);
			if (theUmlFactory != null) {
				return theUmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactoryImpl() {
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
			case UmlPackage.TRACED_CLASS: return createTracedClass();
			case UmlPackage.TRACED_PARAMETER: return createTracedParameter();
			case UmlPackage.TRACED_PRIMITIVE_TYPE: return createTracedPrimitiveType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClass createTracedClass() {
		TracedClassImpl tracedClass = new TracedClassImpl();
		return tracedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameter createTracedParameter() {
		TracedParameterImpl tracedParameter = new TracedParameterImpl();
		return tracedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPrimitiveType createTracedPrimitiveType() {
		TracedPrimitiveTypeImpl tracedPrimitiveType = new TracedPrimitiveTypeImpl();
		return tracedPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage getUmlPackage() {
		return (UmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlPackage getPackage() {
		return UmlPackage.eINSTANCE;
	}

} //UmlFactoryImpl
