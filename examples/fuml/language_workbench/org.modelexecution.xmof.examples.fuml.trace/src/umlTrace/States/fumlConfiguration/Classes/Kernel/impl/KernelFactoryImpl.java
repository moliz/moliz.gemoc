/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.fumlConfiguration.Classes.Kernel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KernelFactoryImpl extends EFactoryImpl implements KernelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KernelFactory init() {
		try {
			KernelFactory theKernelFactory = (KernelFactory)EPackage.Registry.INSTANCE.getEFactory(KernelPackage.eNS_URI);
			if (theKernelFactory != null) {
				return theKernelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KernelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFactoryImpl() {
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
			case KernelPackage.TRACED_BOOLEAN_VALUE: return createTracedBooleanValue();
			case KernelPackage.TRACED_INTEGER_VALUE: return createTracedIntegerValue();
			case KernelPackage.TRACED_OBJECT: return createTracedObject();
			case KernelPackage.TRACED_REFERENCE: return createTracedReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanValue createTracedBooleanValue() {
		TracedBooleanValueImpl tracedBooleanValue = new TracedBooleanValueImpl();
		return tracedBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerValue createTracedIntegerValue() {
		TracedIntegerValueImpl tracedIntegerValue = new TracedIntegerValueImpl();
		return tracedIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObject createTracedObject() {
		TracedObjectImpl tracedObject = new TracedObjectImpl();
		return tracedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReference createTracedReference() {
		TracedReferenceImpl tracedReference = new TracedReferenceImpl();
		return tracedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelPackage getKernelPackage() {
		return (KernelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KernelPackage getPackage() {
		return KernelPackage.eINSTANCE;
	}

} //KernelFactoryImpl
