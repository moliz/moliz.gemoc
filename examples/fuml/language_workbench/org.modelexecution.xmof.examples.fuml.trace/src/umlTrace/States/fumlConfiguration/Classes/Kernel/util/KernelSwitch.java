/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import umlTrace.States.fumlConfiguration.Classes.Kernel.*;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage
 * @generated
 */
public class KernelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSwitch() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KernelPackage.TRACED_BOOLEAN_VALUE: {
				TracedBooleanValue tracedBooleanValue = (TracedBooleanValue)theEObject;
				T result = caseTracedBooleanValue(tracedBooleanValue);
				if (result == null) result = caseTracedPrimitiveValue(tracedBooleanValue);
				if (result == null) result = caseTracedValue(tracedBooleanValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_COMPOUND_VALUE: {
				TracedCompoundValue tracedCompoundValue = (TracedCompoundValue)theEObject;
				T result = caseTracedCompoundValue(tracedCompoundValue);
				if (result == null) result = caseTracedStructuredValue(tracedCompoundValue);
				if (result == null) result = caseTracedValue(tracedCompoundValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedCompoundValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_EVALUATION: {
				TracedEvaluation tracedEvaluation = (TracedEvaluation)theEObject;
				T result = caseTracedEvaluation(tracedEvaluation);
				if (result == null) result = caseTracedSemanticVisitor(tracedEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_EXTENSIONAL_VALUE: {
				TracedExtensionalValue tracedExtensionalValue = (TracedExtensionalValue)theEObject;
				T result = caseTracedExtensionalValue(tracedExtensionalValue);
				if (result == null) result = caseTracedCompoundValue(tracedExtensionalValue);
				if (result == null) result = caseTracedStructuredValue(tracedExtensionalValue);
				if (result == null) result = caseTracedValue(tracedExtensionalValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedExtensionalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_FEATURE_VALUE: {
				TracedFeatureValue tracedFeatureValue = (TracedFeatureValue)theEObject;
				T result = caseTracedFeatureValue(tracedFeatureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_INTEGER_VALUE: {
				TracedIntegerValue tracedIntegerValue = (TracedIntegerValue)theEObject;
				T result = caseTracedIntegerValue(tracedIntegerValue);
				if (result == null) result = caseTracedPrimitiveValue(tracedIntegerValue);
				if (result == null) result = caseTracedValue(tracedIntegerValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedIntegerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_OBJECT: {
				TracedObject tracedObject = (TracedObject)theEObject;
				T result = caseTracedObject(tracedObject);
				if (result == null) result = caseTracedExtensionalValue(tracedObject);
				if (result == null) result = caseTracedCompoundValue(tracedObject);
				if (result == null) result = caseTracedStructuredValue(tracedObject);
				if (result == null) result = caseTracedValue(tracedObject);
				if (result == null) result = caseTracedSemanticVisitor(tracedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_PRIMITIVE_VALUE: {
				TracedPrimitiveValue tracedPrimitiveValue = (TracedPrimitiveValue)theEObject;
				T result = caseTracedPrimitiveValue(tracedPrimitiveValue);
				if (result == null) result = caseTracedValue(tracedPrimitiveValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedPrimitiveValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_REFERENCE: {
				TracedReference tracedReference = (TracedReference)theEObject;
				T result = caseTracedReference(tracedReference);
				if (result == null) result = caseTracedStructuredValue(tracedReference);
				if (result == null) result = caseTracedValue(tracedReference);
				if (result == null) result = caseTracedSemanticVisitor(tracedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_STRUCTURED_VALUE: {
				TracedStructuredValue tracedStructuredValue = (TracedStructuredValue)theEObject;
				T result = caseTracedStructuredValue(tracedStructuredValue);
				if (result == null) result = caseTracedValue(tracedStructuredValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedStructuredValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.TRACED_VALUE: {
				TracedValue tracedValue = (TracedValue)theEObject;
				T result = caseTracedValue(tracedValue);
				if (result == null) result = caseTracedSemanticVisitor(tracedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanValue(TracedBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Compound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Compound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCompoundValue(TracedCompoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEvaluation(TracedEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extensional Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extensional Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtensionalValue(TracedExtensionalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFeatureValue(TracedFeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerValue(TracedIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObject(TracedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Primitive Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Primitive Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPrimitiveValue(TracedPrimitiveValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReference(TracedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structured Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuredValue(TracedStructuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValue(TracedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Semantic Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSemanticVisitor(TracedSemanticVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KernelSwitch
