/**
 */
package umlTrace.States.uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.uml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlSwitch<Adapter> modelSwitch =
		new UmlSwitch<Adapter>() {
			@Override
			public Adapter caseTracedActivityEdge(TracedActivityEdge object) {
				return createTracedActivityEdgeAdapter();
			}
			@Override
			public Adapter caseTracedActivityNode(TracedActivityNode object) {
				return createTracedActivityNodeAdapter();
			}
			@Override
			public Adapter caseTracedClass(TracedClass object) {
				return createTracedClassAdapter();
			}
			@Override
			public Adapter caseTracedParameter(TracedParameter object) {
				return createTracedParameterAdapter();
			}
			@Override
			public Adapter caseTracedPrimitiveType(TracedPrimitiveType object) {
				return createTracedPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseTracedStructuralFeature(TracedStructuralFeature object) {
				return createTracedStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseTracedValueSpecification(TracedValueSpecification object) {
				return createTracedValueSpecificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedActivityEdge
	 * @generated
	 */
	public Adapter createTracedActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedActivityNode <em>Traced Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedActivityNode
	 * @generated
	 */
	public Adapter createTracedActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedClass <em>Traced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedClass
	 * @generated
	 */
	public Adapter createTracedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedParameter <em>Traced Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedParameter
	 * @generated
	 */
	public Adapter createTracedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedPrimitiveType <em>Traced Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedPrimitiveType
	 * @generated
	 */
	public Adapter createTracedPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedStructuralFeature <em>Traced Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedStructuralFeature
	 * @generated
	 */
	public Adapter createTracedStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.uml.TracedValueSpecification <em>Traced Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.uml.TracedValueSpecification
	 * @generated
	 */
	public Adapter createTracedValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UmlAdapterFactory
