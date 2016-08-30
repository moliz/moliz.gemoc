/**
 */
package fumlConfiguration.Classes.Kernel.util;

import fumlConfiguration.Classes.Kernel.BooleanValue;
import fumlConfiguration.Classes.Kernel.CompoundValue;
import fumlConfiguration.Classes.Kernel.Evaluation;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Classes.Kernel.FeatureValue;
import fumlConfiguration.Classes.Kernel.IntegerValue;
import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation;
import fumlConfiguration.Classes.Kernel.LiteralEvaluation;
import fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation;
import fumlConfiguration.Classes.Kernel.PrimitiveValue;
import fumlConfiguration.Classes.Kernel.Reference;
import fumlConfiguration.Classes.Kernel.StructuredValue;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.Loci.SemanticVisitor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see fumlConfiguration.Classes.Kernel.KernelPackage
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
			case KernelPackage.EXTENSIONAL_VALUE: {
				ExtensionalValue extensionalValue = (ExtensionalValue)theEObject;
				T result = caseExtensionalValue(extensionalValue);
				if (result == null) result = caseCompoundValue(extensionalValue);
				if (result == null) result = caseStructuredValue(extensionalValue);
				if (result == null) result = caseValue(extensionalValue);
				if (result == null) result = caseSemanticVisitor(extensionalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.OBJECT: {
				fumlConfiguration.Classes.Kernel.Object object = (fumlConfiguration.Classes.Kernel.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseExtensionalValue(object);
				if (result == null) result = caseCompoundValue(object);
				if (result == null) result = caseStructuredValue(object);
				if (result == null) result = caseValue(object);
				if (result == null) result = caseSemanticVisitor(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.STRUCTURED_VALUE: {
				StructuredValue structuredValue = (StructuredValue)theEObject;
				T result = caseStructuredValue(structuredValue);
				if (result == null) result = caseValue(structuredValue);
				if (result == null) result = caseSemanticVisitor(structuredValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.COMPOUND_VALUE: {
				CompoundValue compoundValue = (CompoundValue)theEObject;
				T result = caseCompoundValue(compoundValue);
				if (result == null) result = caseStructuredValue(compoundValue);
				if (result == null) result = caseValue(compoundValue);
				if (result == null) result = caseSemanticVisitor(compoundValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseSemanticVisitor(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseSemanticVisitor(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.LITERAL_INTEGER_EVALUATION: {
				LiteralIntegerEvaluation literalIntegerEvaluation = (LiteralIntegerEvaluation)theEObject;
				T result = caseLiteralIntegerEvaluation(literalIntegerEvaluation);
				if (result == null) result = caseLiteralEvaluation(literalIntegerEvaluation);
				if (result == null) result = caseEvaluation(literalIntegerEvaluation);
				if (result == null) result = caseSemanticVisitor(literalIntegerEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.LITERAL_EVALUATION: {
				LiteralEvaluation literalEvaluation = (LiteralEvaluation)theEObject;
				T result = caseLiteralEvaluation(literalEvaluation);
				if (result == null) result = caseEvaluation(literalEvaluation);
				if (result == null) result = caseSemanticVisitor(literalEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.PRIMITIVE_VALUE: {
				PrimitiveValue primitiveValue = (PrimitiveValue)theEObject;
				T result = casePrimitiveValue(primitiveValue);
				if (result == null) result = caseValue(primitiveValue);
				if (result == null) result = caseSemanticVisitor(primitiveValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = casePrimitiveValue(integerValue);
				if (result == null) result = caseValue(integerValue);
				if (result == null) result = caseSemanticVisitor(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = casePrimitiveValue(booleanValue);
				if (result == null) result = caseValue(booleanValue);
				if (result == null) result = caseSemanticVisitor(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.LITERAL_BOOLEAN_EVALUATION: {
				LiteralBooleanEvaluation literalBooleanEvaluation = (LiteralBooleanEvaluation)theEObject;
				T result = caseLiteralBooleanEvaluation(literalBooleanEvaluation);
				if (result == null) result = caseLiteralEvaluation(literalBooleanEvaluation);
				if (result == null) result = caseEvaluation(literalBooleanEvaluation);
				if (result == null) result = caseSemanticVisitor(literalBooleanEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseStructuredValue(reference);
				if (result == null) result = caseValue(reference);
				if (result == null) result = caseSemanticVisitor(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionalValue(ExtensionalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(fumlConfiguration.Classes.Kernel.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredValue(StructuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundValue(CompoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralIntegerEvaluation(LiteralIntegerEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralEvaluation(LiteralEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveValue(PrimitiveValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBooleanEvaluation(LiteralBooleanEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticVisitor(SemanticVisitor object) {
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
