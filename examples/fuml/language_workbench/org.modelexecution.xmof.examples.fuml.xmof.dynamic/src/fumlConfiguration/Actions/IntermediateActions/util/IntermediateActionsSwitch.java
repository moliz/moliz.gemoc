/**
 */
package fumlConfiguration.Actions.IntermediateActions.util;

import fumlConfiguration.Actions.BasicActions.ActionActivation;

import fumlConfiguration.Actions.IntermediateActions.*;

import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;

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
 * @see fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public class IntermediateActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediateActionsPackage.eINSTANCE;
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
			case IntermediateActionsPackage.VALUE_SPECIFICATION_ACTION_ACTIVATION: {
				ValueSpecificationActionActivation valueSpecificationActionActivation = (ValueSpecificationActionActivation)theEObject;
				T result = caseValueSpecificationActionActivation(valueSpecificationActionActivation);
				if (result == null) result = caseActionActivation(valueSpecificationActionActivation);
				if (result == null) result = caseActivityNodeActivation(valueSpecificationActionActivation);
				if (result == null) result = caseSemanticVisitor(valueSpecificationActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.CREATE_OBJECT_ACTION_ACTIVATION: {
				CreateObjectActionActivation createObjectActionActivation = (CreateObjectActionActivation)theEObject;
				T result = caseCreateObjectActionActivation(createObjectActionActivation);
				if (result == null) result = caseActionActivation(createObjectActionActivation);
				if (result == null) result = caseActivityNodeActivation(createObjectActionActivation);
				if (result == null) result = caseSemanticVisitor(createObjectActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				StructuralFeatureActionActivation structuralFeatureActionActivation = (StructuralFeatureActionActivation)theEObject;
				T result = caseStructuralFeatureActionActivation(structuralFeatureActionActivation);
				if (result == null) result = caseActionActivation(structuralFeatureActionActivation);
				if (result == null) result = caseActivityNodeActivation(structuralFeatureActionActivation);
				if (result == null) result = caseSemanticVisitor(structuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				ReadStructuralFeatureActionActivation readStructuralFeatureActionActivation = (ReadStructuralFeatureActionActivation)theEObject;
				T result = caseReadStructuralFeatureActionActivation(readStructuralFeatureActionActivation);
				if (result == null) result = caseStructuralFeatureActionActivation(readStructuralFeatureActionActivation);
				if (result == null) result = caseActionActivation(readStructuralFeatureActionActivation);
				if (result == null) result = caseActivityNodeActivation(readStructuralFeatureActionActivation);
				if (result == null) result = caseSemanticVisitor(readStructuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				WriteStructuralFeatureActionActivation writeStructuralFeatureActionActivation = (WriteStructuralFeatureActionActivation)theEObject;
				T result = caseWriteStructuralFeatureActionActivation(writeStructuralFeatureActionActivation);
				if (result == null) result = caseStructuralFeatureActionActivation(writeStructuralFeatureActionActivation);
				if (result == null) result = caseActionActivation(writeStructuralFeatureActionActivation);
				if (result == null) result = caseActivityNodeActivation(writeStructuralFeatureActionActivation);
				if (result == null) result = caseSemanticVisitor(writeStructuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION: {
				AddStructuralFeatureValueActionActivation addStructuralFeatureValueActionActivation = (AddStructuralFeatureValueActionActivation)theEObject;
				T result = caseAddStructuralFeatureValueActionActivation(addStructuralFeatureValueActionActivation);
				if (result == null) result = caseWriteStructuralFeatureActionActivation(addStructuralFeatureValueActionActivation);
				if (result == null) result = caseStructuralFeatureActionActivation(addStructuralFeatureValueActionActivation);
				if (result == null) result = caseActionActivation(addStructuralFeatureValueActionActivation);
				if (result == null) result = caseActivityNodeActivation(addStructuralFeatureValueActionActivation);
				if (result == null) result = caseSemanticVisitor(addStructuralFeatureValueActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationActionActivation(ValueSpecificationActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectActionActivation(CreateObjectActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureActionActivation(StructuralFeatureActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureActionActivation(ReadStructuralFeatureActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureActionActivation(WriteStructuralFeatureActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueActionActivation(AddStructuralFeatureValueActionActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeActivation(ActivityNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionActivation(ActionActivation object) {
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

} //IntermediateActionsSwitch
