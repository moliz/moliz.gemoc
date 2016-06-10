/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.util;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.*;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage
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
			case IntermediateActionsPackage.TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION: {
				TracedAddStructuralFeatureValueActionActivation tracedAddStructuralFeatureValueActionActivation = (TracedAddStructuralFeatureValueActionActivation)theEObject;
				T result = caseTracedAddStructuralFeatureValueActionActivation(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = caseTracedWriteStructuralFeatureActionActivation(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = caseTracedStructuralFeatureActionActivation(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedAddStructuralFeatureValueActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.TRACED_CREATE_OBJECT_ACTION_ACTIVATION: {
				TracedCreateObjectActionActivation tracedCreateObjectActionActivation = (TracedCreateObjectActionActivation)theEObject;
				T result = caseTracedCreateObjectActionActivation(tracedCreateObjectActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedCreateObjectActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedCreateObjectActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedCreateObjectActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.TRACED_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				TracedReadStructuralFeatureActionActivation tracedReadStructuralFeatureActionActivation = (TracedReadStructuralFeatureActionActivation)theEObject;
				T result = caseTracedReadStructuralFeatureActionActivation(tracedReadStructuralFeatureActionActivation);
				if (result == null) result = caseTracedStructuralFeatureActionActivation(tracedReadStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedReadStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedReadStructuralFeatureActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedReadStructuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.TRACED_STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				TracedStructuralFeatureActionActivation tracedStructuralFeatureActionActivation = (TracedStructuralFeatureActionActivation)theEObject;
				T result = caseTracedStructuralFeatureActionActivation(tracedStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedStructuralFeatureActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedStructuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.TRACED_VALUE_SPECIFICATION_ACTION_ACTIVATION: {
				TracedValueSpecificationActionActivation tracedValueSpecificationActionActivation = (TracedValueSpecificationActionActivation)theEObject;
				T result = caseTracedValueSpecificationActionActivation(tracedValueSpecificationActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedValueSpecificationActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedValueSpecificationActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedValueSpecificationActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateActionsPackage.TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_ACTIVATION: {
				TracedWriteStructuralFeatureActionActivation tracedWriteStructuralFeatureActionActivation = (TracedWriteStructuralFeatureActionActivation)theEObject;
				T result = caseTracedWriteStructuralFeatureActionActivation(tracedWriteStructuralFeatureActionActivation);
				if (result == null) result = caseTracedStructuralFeatureActionActivation(tracedWriteStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActionActivation(tracedWriteStructuralFeatureActionActivation);
				if (result == null) result = caseTracedActivityNodeActivation(tracedWriteStructuralFeatureActionActivation);
				if (result == null) result = caseTracedSemanticVisitor(tracedWriteStructuralFeatureActionActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Add Structural Feature Value Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Add Structural Feature Value Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAddStructuralFeatureValueActionActivation(TracedAddStructuralFeatureValueActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Create Object Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Create Object Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCreateObjectActionActivation(TracedCreateObjectActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadStructuralFeatureActionActivation(TracedReadStructuralFeatureActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuralFeatureActionActivation(TracedStructuralFeatureActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value Specification Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value Specification Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValueSpecificationActionActivation(TracedValueSpecificationActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Write Structural Feature Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Write Structural Feature Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedWriteStructuralFeatureActionActivation(TracedWriteStructuralFeatureActionActivation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityNodeActivation(TracedActivityNodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActionActivation(TracedActionActivation object) {
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
