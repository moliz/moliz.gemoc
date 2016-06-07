/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.util;

import fumlConfigurationTrace.States.fumlConfiguration.*;

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
 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage
 * @generated
 */
public class FumlConfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FumlConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = FumlConfigurationPackage.eINSTANCE;
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
			case FumlConfigurationPackage.TRACED_ABSTRACTION_CONFIGURATION: {
				TracedAbstractionConfiguration tracedAbstractionConfiguration = (TracedAbstractionConfiguration)theEObject;
				T result = caseTracedAbstractionConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAbstractionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACCEPT_CALL_ACTION_CONFIGURATION: {
				TracedAcceptCallActionConfiguration tracedAcceptCallActionConfiguration = (TracedAcceptCallActionConfiguration)theEObject;
				T result = caseTracedAcceptCallActionConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedAcceptEventActionConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAcceptCallActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION: {
				TracedAcceptEventActionConfiguration tracedAcceptEventActionConfiguration = (TracedAcceptEventActionConfiguration)theEObject;
				T result = caseTracedAcceptEventActionConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAcceptEventActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTION_CONFIGURATION: {
				TracedActionConfiguration tracedActionConfiguration = (TracedActionConfiguration)theEObject;
				T result = caseTracedActionConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION: {
				TracedActionExecutionSpecificationConfiguration tracedActionExecutionSpecificationConfiguration = (TracedActionExecutionSpecificationConfiguration)theEObject;
				T result = caseTracedActionExecutionSpecificationConfiguration(tracedActionExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedExecutionSpecificationConfiguration(tracedActionExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedActionExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActionExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActionExecutionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTION_INPUT_PIN_CONFIGURATION: {
				TracedActionInputPinConfiguration tracedActionInputPinConfiguration = (TracedActionInputPinConfiguration)theEObject;
				T result = caseTracedActionInputPinConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedInputPinConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedPinConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActionInputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_CONFIGURATION: {
				TracedActivityConfiguration tracedActivityConfiguration = (TracedActivityConfiguration)theEObject;
				T result = caseTracedActivityConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_CONTENT_CONFIGURATION: {
				TracedActivityContentConfiguration tracedActivityContentConfiguration = (TracedActivityContentConfiguration)theEObject;
				T result = caseTracedActivityContentConfiguration(tracedActivityContentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_EDGE_CONFIGURATION: {
				TracedActivityEdgeConfiguration tracedActivityEdgeConfiguration = (TracedActivityEdgeConfiguration)theEObject;
				T result = caseTracedActivityEdgeConfiguration(tracedActivityEdgeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActivityEdgeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityEdgeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityEdgeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION: {
				TracedActivityFinalNodeConfiguration tracedActivityFinalNodeConfiguration = (TracedActivityFinalNodeConfiguration)theEObject;
				T result = caseTracedActivityFinalNodeConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedFinalNodeConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityFinalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION: {
				TracedActivityGroupConfiguration tracedActivityGroupConfiguration = (TracedActivityGroupConfiguration)theEObject;
				T result = caseTracedActivityGroupConfiguration(tracedActivityGroupConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityGroupConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActivityGroupConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityGroupConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_NODE_CONFIGURATION: {
				TracedActivityNodeConfiguration tracedActivityNodeConfiguration = (TracedActivityNodeConfiguration)theEObject;
				T result = caseTracedActivityNodeConfiguration(tracedActivityNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActivityNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActivityNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION: {
				TracedActivityParameterNodeConfiguration tracedActivityParameterNodeConfiguration = (TracedActivityParameterNodeConfiguration)theEObject;
				T result = caseTracedActivityParameterNodeConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityParameterNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTIVITY_PARTITION_CONFIGURATION: {
				TracedActivityPartitionConfiguration tracedActivityPartitionConfiguration = (TracedActivityPartitionConfiguration)theEObject;
				T result = caseTracedActivityPartitionConfiguration(tracedActivityPartitionConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedActivityPartitionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActivityPartitionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedActivityPartitionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActivityPartitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ACTOR_CONFIGURATION: {
				TracedActorConfiguration tracedActorConfiguration = (TracedActorConfiguration)theEObject;
				T result = caseTracedActorConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedActorConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedActorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: {
				TracedAddStructuralFeatureValueActionConfiguration tracedAddStructuralFeatureValueActionConfiguration = (TracedAddStructuralFeatureValueActionConfiguration)theEObject;
				T result = caseTracedAddStructuralFeatureValueActionConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedWriteStructuralFeatureActionConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedStructuralFeatureActionConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAddStructuralFeatureValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION: {
				TracedAddVariableValueActionConfiguration tracedAddVariableValueActionConfiguration = (TracedAddVariableValueActionConfiguration)theEObject;
				T result = caseTracedAddVariableValueActionConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedWriteVariableActionConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedVariableActionConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAddVariableValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ANY_RECEIVE_EVENT_CONFIGURATION: {
				TracedAnyReceiveEventConfiguration tracedAnyReceiveEventConfiguration = (TracedAnyReceiveEventConfiguration)theEObject;
				T result = caseTracedAnyReceiveEventConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedMessageEventConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAnyReceiveEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ARTIFACT_CONFIGURATION: {
				TracedArtifactConfiguration tracedArtifactConfiguration = (TracedArtifactConfiguration)theEObject;
				T result = caseTracedArtifactConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedDeployedArtifactConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedArtifactConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ASSOCIATION_CLASS_CONFIGURATION: {
				TracedAssociationClassConfiguration tracedAssociationClassConfiguration = (TracedAssociationClassConfiguration)theEObject;
				T result = caseTracedAssociationClassConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedAssociationConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAssociationClassConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ASSOCIATION_CONFIGURATION: {
				TracedAssociationConfiguration tracedAssociationConfiguration = (TracedAssociationConfiguration)theEObject;
				T result = caseTracedAssociationConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedAssociationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_BEHAVIOR_CONFIGURATION: {
				TracedBehaviorConfiguration tracedBehaviorConfiguration = (TracedBehaviorConfiguration)theEObject;
				T result = caseTracedBehaviorConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedBehaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION: {
				TracedBehaviorExecutionSpecificationConfiguration tracedBehaviorExecutionSpecificationConfiguration = (TracedBehaviorExecutionSpecificationConfiguration)theEObject;
				T result = caseTracedBehaviorExecutionSpecificationConfiguration(tracedBehaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedExecutionSpecificationConfiguration(tracedBehaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedBehaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedBehaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedBehaviorExecutionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_BEHAVIORAL_FEATURE_CONFIGURATION: {
				TracedBehavioralFeatureConfiguration tracedBehavioralFeatureConfiguration = (TracedBehavioralFeatureConfiguration)theEObject;
				T result = caseTracedBehavioralFeatureConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedBehavioralFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION: {
				TracedBehavioredClassifierConfiguration tracedBehavioredClassifierConfiguration = (TracedBehavioredClassifierConfiguration)theEObject;
				T result = caseTracedBehavioredClassifierConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedBehavioredClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION: {
				TracedBroadcastSignalActionConfiguration tracedBroadcastSignalActionConfiguration = (TracedBroadcastSignalActionConfiguration)theEObject;
				T result = caseTracedBroadcastSignalActionConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedBroadcastSignalActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CALL_ACTION_CONFIGURATION: {
				TracedCallActionConfiguration tracedCallActionConfiguration = (TracedCallActionConfiguration)theEObject;
				T result = caseTracedCallActionConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCallActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCallActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION: {
				TracedCallBehaviorActionConfiguration tracedCallBehaviorActionConfiguration = (TracedCallBehaviorActionConfiguration)theEObject;
				T result = caseTracedCallBehaviorActionConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedCallActionConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCallBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CALL_EVENT_CONFIGURATION: {
				TracedCallEventConfiguration tracedCallEventConfiguration = (TracedCallEventConfiguration)theEObject;
				T result = caseTracedCallEventConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedMessageEventConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedCallEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCallEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CALL_OPERATION_ACTION_CONFIGURATION: {
				TracedCallOperationActionConfiguration tracedCallOperationActionConfiguration = (TracedCallOperationActionConfiguration)theEObject;
				T result = caseTracedCallOperationActionConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedCallActionConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCallOperationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION: {
				TracedCentralBufferNodeConfiguration tracedCentralBufferNodeConfiguration = (TracedCentralBufferNodeConfiguration)theEObject;
				T result = caseTracedCentralBufferNodeConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCentralBufferNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CHANGE_EVENT_CONFIGURATION: {
				TracedChangeEventConfiguration tracedChangeEventConfiguration = (TracedChangeEventConfiguration)theEObject;
				T result = caseTracedChangeEventConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedChangeEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLASS_CONFIGURATION: {
				TracedClassConfiguration tracedClassConfiguration = (TracedClassConfiguration)theEObject;
				T result = caseTracedClassConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedClassConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClassConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLASSIFIER_CONFIGURATION: {
				TracedClassifierConfiguration tracedClassifierConfiguration = (TracedClassifierConfiguration)theEObject;
				T result = caseTracedClassifierConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION: {
				TracedClassifierTemplateParameterConfiguration tracedClassifierTemplateParameterConfiguration = (TracedClassifierTemplateParameterConfiguration)theEObject;
				T result = caseTracedClassifierTemplateParameterConfiguration(tracedClassifierTemplateParameterConfiguration);
				if (result == null) result = caseTracedTemplateParameterConfiguration(tracedClassifierTemplateParameterConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClassifierTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLAUSE_CONFIGURATION: {
				TracedClauseConfiguration tracedClauseConfiguration = (TracedClauseConfiguration)theEObject;
				T result = caseTracedClauseConfiguration(tracedClauseConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClauseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION: {
				TracedClearAssociationActionConfiguration tracedClearAssociationActionConfiguration = (TracedClearAssociationActionConfiguration)theEObject;
				T result = caseTracedClearAssociationActionConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClearAssociationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				TracedClearStructuralFeatureActionConfiguration tracedClearStructuralFeatureActionConfiguration = (TracedClearStructuralFeatureActionConfiguration)theEObject;
				T result = caseTracedClearStructuralFeatureActionConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedStructuralFeatureActionConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClearStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION: {
				TracedClearVariableActionConfiguration tracedClearVariableActionConfiguration = (TracedClearVariableActionConfiguration)theEObject;
				T result = caseTracedClearVariableActionConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedVariableActionConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedClearVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COLLABORATION_CONFIGURATION: {
				TracedCollaborationConfiguration tracedCollaborationConfiguration = (TracedCollaborationConfiguration)theEObject;
				T result = caseTracedCollaborationConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCollaborationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COLLABORATION_USE_CONFIGURATION: {
				TracedCollaborationUseConfiguration tracedCollaborationUseConfiguration = (TracedCollaborationUseConfiguration)theEObject;
				T result = caseTracedCollaborationUseConfiguration(tracedCollaborationUseConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCollaborationUseConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCollaborationUseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COMBINED_FRAGMENT_CONFIGURATION: {
				TracedCombinedFragmentConfiguration tracedCombinedFragmentConfiguration = (TracedCombinedFragmentConfiguration)theEObject;
				T result = caseTracedCombinedFragmentConfiguration(tracedCombinedFragmentConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedCombinedFragmentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCombinedFragmentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCombinedFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COMMENT_CONFIGURATION: {
				TracedCommentConfiguration tracedCommentConfiguration = (TracedCommentConfiguration)theEObject;
				T result = caseTracedCommentConfiguration(tracedCommentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCommentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COMMUNICATION_PATH_CONFIGURATION: {
				TracedCommunicationPathConfiguration tracedCommunicationPathConfiguration = (TracedCommunicationPathConfiguration)theEObject;
				T result = caseTracedCommunicationPathConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedAssociationConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCommunicationPathConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COMPONENT_CONFIGURATION: {
				TracedComponentConfiguration tracedComponentConfiguration = (TracedComponentConfiguration)theEObject;
				T result = caseTracedComponentConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedComponentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_COMPONENT_REALIZATION_CONFIGURATION: {
				TracedComponentRealizationConfiguration tracedComponentRealizationConfiguration = (TracedComponentRealizationConfiguration)theEObject;
				T result = caseTracedComponentRealizationConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedRealizationConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedAbstractionConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedComponentRealizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONDITIONAL_NODE_CONFIGURATION: {
				TracedConditionalNodeConfiguration tracedConditionalNodeConfiguration = (TracedConditionalNodeConfiguration)theEObject;
				T result = caseTracedConditionalNodeConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedStructuredActivityNodeConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConditionalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONNECTABLE_ELEMENT_CONFIGURATION: {
				TracedConnectableElementConfiguration tracedConnectableElementConfiguration = (TracedConnectableElementConfiguration)theEObject;
				T result = caseTracedConnectableElementConfiguration(tracedConnectableElementConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedConnectableElementConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedConnectableElementConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConnectableElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConnectableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION: {
				TracedConnectableElementTemplateParameterConfiguration tracedConnectableElementTemplateParameterConfiguration = (TracedConnectableElementTemplateParameterConfiguration)theEObject;
				T result = caseTracedConnectableElementTemplateParameterConfiguration(tracedConnectableElementTemplateParameterConfiguration);
				if (result == null) result = caseTracedTemplateParameterConfiguration(tracedConnectableElementTemplateParameterConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConnectableElementTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION: {
				TracedConnectionPointReferenceConfiguration tracedConnectionPointReferenceConfiguration = (TracedConnectionPointReferenceConfiguration)theEObject;
				T result = caseTracedConnectionPointReferenceConfiguration(tracedConnectionPointReferenceConfiguration);
				if (result == null) result = caseTracedVertexConfiguration(tracedConnectionPointReferenceConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConnectionPointReferenceConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConnectionPointReferenceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONNECTOR_CONFIGURATION: {
				TracedConnectorConfiguration tracedConnectorConfiguration = (TracedConnectorConfiguration)theEObject;
				T result = caseTracedConnectorConfiguration(tracedConnectorConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedConnectorConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedConnectorConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConnectorConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConnectorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONNECTOR_END_CONFIGURATION: {
				TracedConnectorEndConfiguration tracedConnectorEndConfiguration = (TracedConnectorEndConfiguration)theEObject;
				T result = caseTracedConnectorEndConfiguration(tracedConnectorEndConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedConnectorEndConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConnectorEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION: {
				TracedConsiderIgnoreFragmentConfiguration tracedConsiderIgnoreFragmentConfiguration = (TracedConsiderIgnoreFragmentConfiguration)theEObject;
				T result = caseTracedConsiderIgnoreFragmentConfiguration(tracedConsiderIgnoreFragmentConfiguration);
				if (result == null) result = caseTracedCombinedFragmentConfiguration(tracedConsiderIgnoreFragmentConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedConsiderIgnoreFragmentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConsiderIgnoreFragmentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConsiderIgnoreFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONSTRAINT_CONFIGURATION: {
				TracedConstraintConfiguration tracedConstraintConfiguration = (TracedConstraintConfiguration)theEObject;
				T result = caseTracedConstraintConfiguration(tracedConstraintConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedConstraintConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedConstraintConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedConstraintConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONTINUATION_CONFIGURATION: {
				TracedContinuationConfiguration tracedContinuationConfiguration = (TracedContinuationConfiguration)theEObject;
				T result = caseTracedContinuationConfiguration(tracedContinuationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedContinuationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedContinuationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedContinuationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONTROL_FLOW_CONFIGURATION: {
				TracedControlFlowConfiguration tracedControlFlowConfiguration = (TracedControlFlowConfiguration)theEObject;
				T result = caseTracedControlFlowConfiguration(tracedControlFlowConfiguration);
				if (result == null) result = caseTracedActivityEdgeConfiguration(tracedControlFlowConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedControlFlowConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedControlFlowConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedControlFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CONTROL_NODE_CONFIGURATION: {
				TracedControlNodeConfiguration tracedControlNodeConfiguration = (TracedControlNodeConfiguration)theEObject;
				T result = caseTracedControlNodeConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedControlNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CREATE_LINK_ACTION_CONFIGURATION: {
				TracedCreateLinkActionConfiguration tracedCreateLinkActionConfiguration = (TracedCreateLinkActionConfiguration)theEObject;
				T result = caseTracedCreateLinkActionConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedWriteLinkActionConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedLinkActionConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCreateLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION: {
				TracedCreateLinkObjectActionConfiguration tracedCreateLinkObjectActionConfiguration = (TracedCreateLinkObjectActionConfiguration)theEObject;
				T result = caseTracedCreateLinkObjectActionConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedCreateLinkActionConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedWriteLinkActionConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedLinkActionConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCreateLinkObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_CREATE_OBJECT_ACTION_CONFIGURATION: {
				TracedCreateObjectActionConfiguration tracedCreateObjectActionConfiguration = (TracedCreateObjectActionConfiguration)theEObject;
				T result = caseTracedCreateObjectActionConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedCreateObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DATA_STORE_NODE_CONFIGURATION: {
				TracedDataStoreNodeConfiguration tracedDataStoreNodeConfiguration = (TracedDataStoreNodeConfiguration)theEObject;
				T result = caseTracedDataStoreNodeConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedCentralBufferNodeConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDataStoreNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DATA_TYPE_CONFIGURATION: {
				TracedDataTypeConfiguration tracedDataTypeConfiguration = (TracedDataTypeConfiguration)theEObject;
				T result = caseTracedDataTypeConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDataTypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DECISION_NODE_CONFIGURATION: {
				TracedDecisionNodeConfiguration tracedDecisionNodeConfiguration = (TracedDecisionNodeConfiguration)theEObject;
				T result = caseTracedDecisionNodeConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDecisionNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEPENDENCY_CONFIGURATION: {
				TracedDependencyConfiguration tracedDependencyConfiguration = (TracedDependencyConfiguration)theEObject;
				T result = caseTracedDependencyConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedDependencyConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDependencyConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEPLOYED_ARTIFACT_CONFIGURATION: {
				TracedDeployedArtifactConfiguration tracedDeployedArtifactConfiguration = (TracedDeployedArtifactConfiguration)theEObject;
				T result = caseTracedDeployedArtifactConfiguration(tracedDeployedArtifactConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDeployedArtifactConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDeployedArtifactConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_CONFIGURATION: {
				TracedDeploymentConfiguration tracedDeploymentConfiguration = (TracedDeploymentConfiguration)theEObject;
				T result = caseTracedDeploymentConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDeploymentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION: {
				TracedDeploymentSpecificationConfiguration tracedDeploymentSpecificationConfiguration = (TracedDeploymentSpecificationConfiguration)theEObject;
				T result = caseTracedDeploymentSpecificationConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedArtifactConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedDeployedArtifactConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDeploymentSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_TARGET_CONFIGURATION: {
				TracedDeploymentTargetConfiguration tracedDeploymentTargetConfiguration = (TracedDeploymentTargetConfiguration)theEObject;
				T result = caseTracedDeploymentTargetConfiguration(tracedDeploymentTargetConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDeploymentTargetConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDeploymentTargetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DESTROY_LINK_ACTION_CONFIGURATION: {
				TracedDestroyLinkActionConfiguration tracedDestroyLinkActionConfiguration = (TracedDestroyLinkActionConfiguration)theEObject;
				T result = caseTracedDestroyLinkActionConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedWriteLinkActionConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedLinkActionConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDestroyLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION: {
				TracedDestroyObjectActionConfiguration tracedDestroyObjectActionConfiguration = (TracedDestroyObjectActionConfiguration)theEObject;
				T result = caseTracedDestroyObjectActionConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDestroyObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				TracedDestructionOccurrenceSpecificationConfiguration tracedDestructionOccurrenceSpecificationConfiguration = (TracedDestructionOccurrenceSpecificationConfiguration)theEObject;
				T result = caseTracedDestructionOccurrenceSpecificationConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedMessageOccurrenceSpecificationConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedOccurrenceSpecificationConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedMessageEndConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDestructionOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DEVICE_CONFIGURATION: {
				TracedDeviceConfiguration tracedDeviceConfiguration = (TracedDeviceConfiguration)theEObject;
				T result = caseTracedDeviceConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedNodeConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDeviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION: {
				TracedDirectedRelationshipConfiguration tracedDirectedRelationshipConfiguration = (TracedDirectedRelationshipConfiguration)theEObject;
				T result = caseTracedDirectedRelationshipConfiguration(tracedDirectedRelationshipConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedDirectedRelationshipConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDirectedRelationshipConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DURATION_CONFIGURATION: {
				TracedDurationConfiguration tracedDurationConfiguration = (TracedDurationConfiguration)theEObject;
				T result = caseTracedDurationConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDurationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDurationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DURATION_CONSTRAINT_CONFIGURATION: {
				TracedDurationConstraintConfiguration tracedDurationConstraintConfiguration = (TracedDurationConstraintConfiguration)theEObject;
				T result = caseTracedDurationConstraintConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedIntervalConstraintConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedConstraintConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDurationConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DURATION_INTERVAL_CONFIGURATION: {
				TracedDurationIntervalConfiguration tracedDurationIntervalConfiguration = (TracedDurationIntervalConfiguration)theEObject;
				T result = caseTracedDurationIntervalConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedIntervalConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDurationIntervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_DURATION_OBSERVATION_CONFIGURATION: {
				TracedDurationObservationConfiguration tracedDurationObservationConfiguration = (TracedDurationObservationConfiguration)theEObject;
				T result = caseTracedDurationObservationConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = caseTracedObservationConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedDurationObservationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION: {
				TracedElementConfiguration tracedElementConfiguration = (TracedElementConfiguration)theEObject;
				T result = caseTracedElementConfiguration(tracedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ELEMENT_IMPORT_CONFIGURATION: {
				TracedElementImportConfiguration tracedElementImportConfiguration = (TracedElementImportConfiguration)theEObject;
				T result = caseTracedElementImportConfiguration(tracedElementImportConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedElementImportConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedElementImportConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedElementImportConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION: {
				TracedEncapsulatedClassifierConfiguration tracedEncapsulatedClassifierConfiguration = (TracedEncapsulatedClassifierConfiguration)theEObject;
				T result = caseTracedEncapsulatedClassifierConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedEncapsulatedClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ENUMERATION_CONFIGURATION: {
				TracedEnumerationConfiguration tracedEnumerationConfiguration = (TracedEnumerationConfiguration)theEObject;
				T result = caseTracedEnumerationConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedDataTypeConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedEnumerationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_ENUMERATION_LITERAL_CONFIGURATION: {
				TracedEnumerationLiteralConfiguration tracedEnumerationLiteralConfiguration = (TracedEnumerationLiteralConfiguration)theEObject;
				T result = caseTracedEnumerationLiteralConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedInstanceSpecificationConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedDeployedArtifactConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedEnumerationLiteralConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EVENT_CONFIGURATION: {
				TracedEventConfiguration tracedEventConfiguration = (TracedEventConfiguration)theEObject;
				T result = caseTracedEventConfiguration(tracedEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXCEPTION_HANDLER_CONFIGURATION: {
				TracedExceptionHandlerConfiguration tracedExceptionHandlerConfiguration = (TracedExceptionHandlerConfiguration)theEObject;
				T result = caseTracedExceptionHandlerConfiguration(tracedExceptionHandlerConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExceptionHandlerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXECUTABLE_NODE_CONFIGURATION: {
				TracedExecutableNodeConfiguration tracedExecutableNodeConfiguration = (TracedExecutableNodeConfiguration)theEObject;
				T result = caseTracedExecutableNodeConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExecutableNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION: {
				TracedExecutionEnvironmentConfiguration tracedExecutionEnvironmentConfiguration = (TracedExecutionEnvironmentConfiguration)theEObject;
				T result = caseTracedExecutionEnvironmentConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedNodeConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExecutionEnvironmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				TracedExecutionOccurrenceSpecificationConfiguration tracedExecutionOccurrenceSpecificationConfiguration = (TracedExecutionOccurrenceSpecificationConfiguration)theEObject;
				T result = caseTracedExecutionOccurrenceSpecificationConfiguration(tracedExecutionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedOccurrenceSpecificationConfiguration(tracedExecutionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedExecutionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExecutionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExecutionOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXECUTION_SPECIFICATION_CONFIGURATION: {
				TracedExecutionSpecificationConfiguration tracedExecutionSpecificationConfiguration = (TracedExecutionSpecificationConfiguration)theEObject;
				T result = caseTracedExecutionSpecificationConfiguration(tracedExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExecutionSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExecutionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXPANSION_NODE_CONFIGURATION: {
				TracedExpansionNodeConfiguration tracedExpansionNodeConfiguration = (TracedExpansionNodeConfiguration)theEObject;
				T result = caseTracedExpansionNodeConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExpansionNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXPANSION_REGION_CONFIGURATION: {
				TracedExpansionRegionConfiguration tracedExpansionRegionConfiguration = (TracedExpansionRegionConfiguration)theEObject;
				T result = caseTracedExpansionRegionConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedStructuredActivityNodeConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExpansionRegionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXPRESSION_CONFIGURATION: {
				TracedExpressionConfiguration tracedExpressionConfiguration = (TracedExpressionConfiguration)theEObject;
				T result = caseTracedExpressionConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedExpressionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXTEND_CONFIGURATION: {
				TracedExtendConfiguration tracedExtendConfiguration = (TracedExtendConfiguration)theEObject;
				T result = caseTracedExtendConfiguration(tracedExtendConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExtendConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedExtendConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedExtendConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExtendConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXTENSION_CONFIGURATION: {
				TracedExtensionConfiguration tracedExtensionConfiguration = (TracedExtensionConfiguration)theEObject;
				T result = caseTracedExtensionConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedAssociationConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExtensionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXTENSION_END_CONFIGURATION: {
				TracedExtensionEndConfiguration tracedExtensionEndConfiguration = (TracedExtensionEndConfiguration)theEObject;
				T result = caseTracedExtensionEndConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedPropertyConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedStructuralFeatureConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedConnectableElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExtensionEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_EXTENSION_POINT_CONFIGURATION: {
				TracedExtensionPointConfiguration tracedExtensionPointConfiguration = (TracedExtensionPointConfiguration)theEObject;
				T result = caseTracedExtensionPointConfiguration(tracedExtensionPointConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedExtensionPointConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedExtensionPointConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedExtensionPointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FEATURE_CONFIGURATION: {
				TracedFeatureConfiguration tracedFeatureConfiguration = (TracedFeatureConfiguration)theEObject;
				T result = caseTracedFeatureConfiguration(tracedFeatureConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedFeatureConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedFeatureConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FINAL_NODE_CONFIGURATION: {
				TracedFinalNodeConfiguration tracedFinalNodeConfiguration = (TracedFinalNodeConfiguration)theEObject;
				T result = caseTracedFinalNodeConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedFinalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FINAL_STATE_CONFIGURATION: {
				TracedFinalStateConfiguration tracedFinalStateConfiguration = (TracedFinalStateConfiguration)theEObject;
				T result = caseTracedFinalStateConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedStateConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedVertexConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedFinalStateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FLOW_FINAL_NODE_CONFIGURATION: {
				TracedFlowFinalNodeConfiguration tracedFlowFinalNodeConfiguration = (TracedFlowFinalNodeConfiguration)theEObject;
				T result = caseTracedFlowFinalNodeConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedFinalNodeConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedFlowFinalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FORK_NODE_CONFIGURATION: {
				TracedForkNodeConfiguration tracedForkNodeConfiguration = (TracedForkNodeConfiguration)theEObject;
				T result = caseTracedForkNodeConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedForkNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_FUNCTION_BEHAVIOR_CONFIGURATION: {
				TracedFunctionBehaviorConfiguration tracedFunctionBehaviorConfiguration = (TracedFunctionBehaviorConfiguration)theEObject;
				T result = caseTracedFunctionBehaviorConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedOpaqueBehaviorConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedFunctionBehaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_GATE_CONFIGURATION: {
				TracedGateConfiguration tracedGateConfiguration = (TracedGateConfiguration)theEObject;
				T result = caseTracedGateConfiguration(tracedGateConfiguration);
				if (result == null) result = caseTracedMessageEndConfiguration(tracedGateConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedGateConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedGateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_GENERAL_ORDERING_CONFIGURATION: {
				TracedGeneralOrderingConfiguration tracedGeneralOrderingConfiguration = (TracedGeneralOrderingConfiguration)theEObject;
				T result = caseTracedGeneralOrderingConfiguration(tracedGeneralOrderingConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedGeneralOrderingConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedGeneralOrderingConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_GENERALIZATION_CONFIGURATION: {
				TracedGeneralizationConfiguration tracedGeneralizationConfiguration = (TracedGeneralizationConfiguration)theEObject;
				T result = caseTracedGeneralizationConfiguration(tracedGeneralizationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedGeneralizationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedGeneralizationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedGeneralizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_GENERALIZATION_SET_CONFIGURATION: {
				TracedGeneralizationSetConfiguration tracedGeneralizationSetConfiguration = (TracedGeneralizationSetConfiguration)theEObject;
				T result = caseTracedGeneralizationSetConfiguration(tracedGeneralizationSetConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedGeneralizationSetConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedGeneralizationSetConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedGeneralizationSetConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedGeneralizationSetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_IMAGE_CONFIGURATION: {
				TracedImageConfiguration tracedImageConfiguration = (TracedImageConfiguration)theEObject;
				T result = caseTracedImageConfiguration(tracedImageConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedImageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INCLUDE_CONFIGURATION: {
				TracedIncludeConfiguration tracedIncludeConfiguration = (TracedIncludeConfiguration)theEObject;
				T result = caseTracedIncludeConfiguration(tracedIncludeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedIncludeConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedIncludeConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedIncludeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedIncludeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INFORMATION_FLOW_CONFIGURATION: {
				TracedInformationFlowConfiguration tracedInformationFlowConfiguration = (TracedInformationFlowConfiguration)theEObject;
				T result = caseTracedInformationFlowConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInformationFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INFORMATION_ITEM_CONFIGURATION: {
				TracedInformationItemConfiguration tracedInformationItemConfiguration = (TracedInformationItemConfiguration)theEObject;
				T result = caseTracedInformationItemConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInformationItemConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INITIAL_NODE_CONFIGURATION: {
				TracedInitialNodeConfiguration tracedInitialNodeConfiguration = (TracedInitialNodeConfiguration)theEObject;
				T result = caseTracedInitialNodeConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInitialNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INPUT_PIN_CONFIGURATION: {
				TracedInputPinConfiguration tracedInputPinConfiguration = (TracedInputPinConfiguration)theEObject;
				T result = caseTracedInputPinConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedPinConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInputPinConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INSTANCE_SPECIFICATION_CONFIGURATION: {
				TracedInstanceSpecificationConfiguration tracedInstanceSpecificationConfiguration = (TracedInstanceSpecificationConfiguration)theEObject;
				T result = caseTracedInstanceSpecificationConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedDeployedArtifactConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInstanceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INSTANCE_VALUE_CONFIGURATION: {
				TracedInstanceValueConfiguration tracedInstanceValueConfiguration = (TracedInstanceValueConfiguration)theEObject;
				T result = caseTracedInstanceValueConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInstanceValueConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERACTION_CONFIGURATION: {
				TracedInteractionConfiguration tracedInteractionConfiguration = (TracedInteractionConfiguration)theEObject;
				T result = caseTracedInteractionConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInteractionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERACTION_CONSTRAINT_CONFIGURATION: {
				TracedInteractionConstraintConfiguration tracedInteractionConstraintConfiguration = (TracedInteractionConstraintConfiguration)theEObject;
				T result = caseTracedInteractionConstraintConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = caseTracedConstraintConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInteractionConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERACTION_FRAGMENT_CONFIGURATION: {
				TracedInteractionFragmentConfiguration tracedInteractionFragmentConfiguration = (TracedInteractionFragmentConfiguration)theEObject;
				T result = caseTracedInteractionFragmentConfiguration(tracedInteractionFragmentConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInteractionFragmentConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInteractionFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERACTION_OPERAND_CONFIGURATION: {
				TracedInteractionOperandConfiguration tracedInteractionOperandConfiguration = (TracedInteractionOperandConfiguration)theEObject;
				T result = caseTracedInteractionOperandConfiguration(tracedInteractionOperandConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedInteractionOperandConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedInteractionOperandConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInteractionOperandConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInteractionOperandConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERACTION_USE_CONFIGURATION: {
				TracedInteractionUseConfiguration tracedInteractionUseConfiguration = (TracedInteractionUseConfiguration)theEObject;
				T result = caseTracedInteractionUseConfiguration(tracedInteractionUseConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedInteractionUseConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInteractionUseConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInteractionUseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERFACE_CONFIGURATION: {
				TracedInterfaceConfiguration tracedInterfaceConfiguration = (TracedInterfaceConfiguration)theEObject;
				T result = caseTracedInterfaceConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInterfaceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERFACE_REALIZATION_CONFIGURATION: {
				TracedInterfaceRealizationConfiguration tracedInterfaceRealizationConfiguration = (TracedInterfaceRealizationConfiguration)theEObject;
				T result = caseTracedInterfaceRealizationConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedRealizationConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedAbstractionConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInterfaceRealizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION: {
				TracedInterruptibleActivityRegionConfiguration tracedInterruptibleActivityRegionConfiguration = (TracedInterruptibleActivityRegionConfiguration)theEObject;
				T result = caseTracedInterruptibleActivityRegionConfiguration(tracedInterruptibleActivityRegionConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedInterruptibleActivityRegionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInterruptibleActivityRegionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedInterruptibleActivityRegionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInterruptibleActivityRegionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERVAL_CONFIGURATION: {
				TracedIntervalConfiguration tracedIntervalConfiguration = (TracedIntervalConfiguration)theEObject;
				T result = caseTracedIntervalConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedIntervalConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedIntervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INTERVAL_CONSTRAINT_CONFIGURATION: {
				TracedIntervalConstraintConfiguration tracedIntervalConstraintConfiguration = (TracedIntervalConstraintConfiguration)theEObject;
				T result = caseTracedIntervalConstraintConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = caseTracedConstraintConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedIntervalConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_INVOCATION_ACTION_CONFIGURATION: {
				TracedInvocationActionConfiguration tracedInvocationActionConfiguration = (TracedInvocationActionConfiguration)theEObject;
				T result = caseTracedInvocationActionConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedInvocationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_JOIN_NODE_CONFIGURATION: {
				TracedJoinNodeConfiguration tracedJoinNodeConfiguration = (TracedJoinNodeConfiguration)theEObject;
				T result = caseTracedJoinNodeConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedJoinNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LIFELINE_CONFIGURATION: {
				TracedLifelineConfiguration tracedLifelineConfiguration = (TracedLifelineConfiguration)theEObject;
				T result = caseTracedLifelineConfiguration(tracedLifelineConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLifelineConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLifelineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LINK_ACTION_CONFIGURATION: {
				TracedLinkActionConfiguration tracedLinkActionConfiguration = (TracedLinkActionConfiguration)theEObject;
				T result = caseTracedLinkActionConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LINK_END_CREATION_DATA_CONFIGURATION: {
				TracedLinkEndCreationDataConfiguration tracedLinkEndCreationDataConfiguration = (TracedLinkEndCreationDataConfiguration)theEObject;
				T result = caseTracedLinkEndCreationDataConfiguration(tracedLinkEndCreationDataConfiguration);
				if (result == null) result = caseTracedLinkEndDataConfiguration(tracedLinkEndCreationDataConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLinkEndCreationDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LINK_END_DATA_CONFIGURATION: {
				TracedLinkEndDataConfiguration tracedLinkEndDataConfiguration = (TracedLinkEndDataConfiguration)theEObject;
				T result = caseTracedLinkEndDataConfiguration(tracedLinkEndDataConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLinkEndDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION: {
				TracedLinkEndDestructionDataConfiguration tracedLinkEndDestructionDataConfiguration = (TracedLinkEndDestructionDataConfiguration)theEObject;
				T result = caseTracedLinkEndDestructionDataConfiguration(tracedLinkEndDestructionDataConfiguration);
				if (result == null) result = caseTracedLinkEndDataConfiguration(tracedLinkEndDestructionDataConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLinkEndDestructionDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_BOOLEAN_CONFIGURATION: {
				TracedLiteralBooleanConfiguration tracedLiteralBooleanConfiguration = (TracedLiteralBooleanConfiguration)theEObject;
				T result = caseTracedLiteralBooleanConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralBooleanConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_INTEGER_CONFIGURATION: {
				TracedLiteralIntegerConfiguration tracedLiteralIntegerConfiguration = (TracedLiteralIntegerConfiguration)theEObject;
				T result = caseTracedLiteralIntegerConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralIntegerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_NULL_CONFIGURATION: {
				TracedLiteralNullConfiguration tracedLiteralNullConfiguration = (TracedLiteralNullConfiguration)theEObject;
				T result = caseTracedLiteralNullConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralNullConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_REAL_CONFIGURATION: {
				TracedLiteralRealConfiguration tracedLiteralRealConfiguration = (TracedLiteralRealConfiguration)theEObject;
				T result = caseTracedLiteralRealConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralRealConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_SPECIFICATION_CONFIGURATION: {
				TracedLiteralSpecificationConfiguration tracedLiteralSpecificationConfiguration = (TracedLiteralSpecificationConfiguration)theEObject;
				T result = caseTracedLiteralSpecificationConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_STRING_CONFIGURATION: {
				TracedLiteralStringConfiguration tracedLiteralStringConfiguration = (TracedLiteralStringConfiguration)theEObject;
				T result = caseTracedLiteralStringConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralStringConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION: {
				TracedLiteralUnlimitedNaturalConfiguration tracedLiteralUnlimitedNaturalConfiguration = (TracedLiteralUnlimitedNaturalConfiguration)theEObject;
				T result = caseTracedLiteralUnlimitedNaturalConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedLiteralSpecificationConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLiteralUnlimitedNaturalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_LOOP_NODE_CONFIGURATION: {
				TracedLoopNodeConfiguration tracedLoopNodeConfiguration = (TracedLoopNodeConfiguration)theEObject;
				T result = caseTracedLoopNodeConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedStructuredActivityNodeConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedLoopNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MANIFESTATION_CONFIGURATION: {
				TracedManifestationConfiguration tracedManifestationConfiguration = (TracedManifestationConfiguration)theEObject;
				T result = caseTracedManifestationConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedAbstractionConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedManifestationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedManifestationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MERGE_NODE_CONFIGURATION: {
				TracedMergeNodeConfiguration tracedMergeNodeConfiguration = (TracedMergeNodeConfiguration)theEObject;
				T result = caseTracedMergeNodeConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedControlNodeConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMergeNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MESSAGE_CONFIGURATION: {
				TracedMessageConfiguration tracedMessageConfiguration = (TracedMessageConfiguration)theEObject;
				T result = caseTracedMessageConfiguration(tracedMessageConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedMessageConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMessageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MESSAGE_END_CONFIGURATION: {
				TracedMessageEndConfiguration tracedMessageEndConfiguration = (TracedMessageEndConfiguration)theEObject;
				T result = caseTracedMessageEndConfiguration(tracedMessageEndConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedMessageEndConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMessageEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MESSAGE_EVENT_CONFIGURATION: {
				TracedMessageEventConfiguration tracedMessageEventConfiguration = (TracedMessageEventConfiguration)theEObject;
				T result = caseTracedMessageEventConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMessageEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				TracedMessageOccurrenceSpecificationConfiguration tracedMessageOccurrenceSpecificationConfiguration = (TracedMessageOccurrenceSpecificationConfiguration)theEObject;
				T result = caseTracedMessageOccurrenceSpecificationConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedOccurrenceSpecificationConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedMessageEndConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMessageOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MODEL_CONFIGURATION: {
				TracedModelConfiguration tracedModelConfiguration = (TracedModelConfiguration)theEObject;
				T result = caseTracedModelConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedPackageConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedModelConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedModelConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION: {
				TracedMultiplicityElementConfiguration tracedMultiplicityElementConfiguration = (TracedMultiplicityElementConfiguration)theEObject;
				T result = caseTracedMultiplicityElementConfiguration(tracedMultiplicityElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedMultiplicityElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_NAMED_ELEMENT_CONFIGURATION: {
				TracedNamedElementConfiguration tracedNamedElementConfiguration = (TracedNamedElementConfiguration)theEObject;
				T result = caseTracedNamedElementConfiguration(tracedNamedElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedNamedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_NAMESPACE_CONFIGURATION: {
				TracedNamespaceConfiguration tracedNamespaceConfiguration = (TracedNamespaceConfiguration)theEObject;
				T result = caseTracedNamespaceConfiguration(tracedNamespaceConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedNamespaceConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedNamespaceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_NODE_CONFIGURATION: {
				TracedNodeConfiguration tracedNodeConfiguration = (TracedNodeConfiguration)theEObject;
				T result = caseTracedNodeConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OBJECT_FLOW_CONFIGURATION: {
				TracedObjectFlowConfiguration tracedObjectFlowConfiguration = (TracedObjectFlowConfiguration)theEObject;
				T result = caseTracedObjectFlowConfiguration(tracedObjectFlowConfiguration);
				if (result == null) result = caseTracedActivityEdgeConfiguration(tracedObjectFlowConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedObjectFlowConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedObjectFlowConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedObjectFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OBJECT_NODE_CONFIGURATION: {
				TracedObjectNodeConfiguration tracedObjectNodeConfiguration = (TracedObjectNodeConfiguration)theEObject;
				T result = caseTracedObjectNodeConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedObjectNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OBSERVATION_CONFIGURATION: {
				TracedObservationConfiguration tracedObservationConfiguration = (TracedObservationConfiguration)theEObject;
				T result = caseTracedObservationConfiguration(tracedObservationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedObservationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedObservationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedObservationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedObservationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				TracedOccurrenceSpecificationConfiguration tracedOccurrenceSpecificationConfiguration = (TracedOccurrenceSpecificationConfiguration)theEObject;
				T result = caseTracedOccurrenceSpecificationConfiguration(tracedOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOccurrenceSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OPAQUE_ACTION_CONFIGURATION: {
				TracedOpaqueActionConfiguration tracedOpaqueActionConfiguration = (TracedOpaqueActionConfiguration)theEObject;
				T result = caseTracedOpaqueActionConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOpaqueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OPAQUE_BEHAVIOR_CONFIGURATION: {
				TracedOpaqueBehaviorConfiguration tracedOpaqueBehaviorConfiguration = (TracedOpaqueBehaviorConfiguration)theEObject;
				T result = caseTracedOpaqueBehaviorConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOpaqueBehaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OPAQUE_EXPRESSION_CONFIGURATION: {
				TracedOpaqueExpressionConfiguration tracedOpaqueExpressionConfiguration = (TracedOpaqueExpressionConfiguration)theEObject;
				T result = caseTracedOpaqueExpressionConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOpaqueExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OPERATION_CONFIGURATION: {
				TracedOperationConfiguration tracedOperationConfiguration = (TracedOperationConfiguration)theEObject;
				T result = caseTracedOperationConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedBehavioralFeatureConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOperationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOperationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION: {
				TracedOperationTemplateParameterConfiguration tracedOperationTemplateParameterConfiguration = (TracedOperationTemplateParameterConfiguration)theEObject;
				T result = caseTracedOperationTemplateParameterConfiguration(tracedOperationTemplateParameterConfiguration);
				if (result == null) result = caseTracedTemplateParameterConfiguration(tracedOperationTemplateParameterConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOperationTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_OUTPUT_PIN_CONFIGURATION: {
				TracedOutputPinConfiguration tracedOutputPinConfiguration = (TracedOutputPinConfiguration)theEObject;
				T result = caseTracedOutputPinConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedPinConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedOutputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PACKAGE_CONFIGURATION: {
				TracedPackageConfiguration tracedPackageConfiguration = (TracedPackageConfiguration)theEObject;
				T result = caseTracedPackageConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedPackageConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPackageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PACKAGE_IMPORT_CONFIGURATION: {
				TracedPackageImportConfiguration tracedPackageImportConfiguration = (TracedPackageImportConfiguration)theEObject;
				T result = caseTracedPackageImportConfiguration(tracedPackageImportConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedPackageImportConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedPackageImportConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPackageImportConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PACKAGE_MERGE_CONFIGURATION: {
				TracedPackageMergeConfiguration tracedPackageMergeConfiguration = (TracedPackageMergeConfiguration)theEObject;
				T result = caseTracedPackageMergeConfiguration(tracedPackageMergeConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedPackageMergeConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedPackageMergeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPackageMergeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION: {
				TracedPackageableElementConfiguration tracedPackageableElementConfiguration = (TracedPackageableElementConfiguration)theEObject;
				T result = caseTracedPackageableElementConfiguration(tracedPackageableElementConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPackageableElementConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedPackageableElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPackageableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PARAMETER_CONFIGURATION: {
				TracedParameterConfiguration tracedParameterConfiguration = (TracedParameterConfiguration)theEObject;
				T result = caseTracedParameterConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedConnectableElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PARAMETER_SET_CONFIGURATION: {
				TracedParameterSetConfiguration tracedParameterSetConfiguration = (TracedParameterSetConfiguration)theEObject;
				T result = caseTracedParameterSetConfiguration(tracedParameterSetConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedParameterSetConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedParameterSetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION: {
				TracedParameterableElementConfiguration tracedParameterableElementConfiguration = (TracedParameterableElementConfiguration)theEObject;
				T result = caseTracedParameterableElementConfiguration(tracedParameterableElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedParameterableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PART_DECOMPOSITION_CONFIGURATION: {
				TracedPartDecompositionConfiguration tracedPartDecompositionConfiguration = (TracedPartDecompositionConfiguration)theEObject;
				T result = caseTracedPartDecompositionConfiguration(tracedPartDecompositionConfiguration);
				if (result == null) result = caseTracedInteractionUseConfiguration(tracedPartDecompositionConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedPartDecompositionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPartDecompositionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPartDecompositionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PIN_CONFIGURATION: {
				TracedPinConfiguration tracedPinConfiguration = (TracedPinConfiguration)theEObject;
				T result = caseTracedPinConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPinConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PORT_CONFIGURATION: {
				TracedPortConfiguration tracedPortConfiguration = (TracedPortConfiguration)theEObject;
				T result = caseTracedPortConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedPropertyConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedStructuralFeatureConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedConnectableElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPortConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPortConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PRIMITIVE_TYPE_CONFIGURATION: {
				TracedPrimitiveTypeConfiguration tracedPrimitiveTypeConfiguration = (TracedPrimitiveTypeConfiguration)theEObject;
				T result = caseTracedPrimitiveTypeConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedDataTypeConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPrimitiveTypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROFILE_APPLICATION_CONFIGURATION: {
				TracedProfileApplicationConfiguration tracedProfileApplicationConfiguration = (TracedProfileApplicationConfiguration)theEObject;
				T result = caseTracedProfileApplicationConfiguration(tracedProfileApplicationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedProfileApplicationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedProfileApplicationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedProfileApplicationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROFILE_CONFIGURATION: {
				TracedProfileConfiguration tracedProfileConfiguration = (TracedProfileConfiguration)theEObject;
				T result = caseTracedProfileConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedPackageConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedProfileConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedProfileConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROPERTY_CONFIGURATION: {
				TracedPropertyConfiguration tracedPropertyConfiguration = (TracedPropertyConfiguration)theEObject;
				T result = caseTracedPropertyConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedStructuralFeatureConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedConnectableElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedDeploymentTargetConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPropertyConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION: {
				TracedProtocolConformanceConfiguration tracedProtocolConformanceConfiguration = (TracedProtocolConformanceConfiguration)theEObject;
				T result = caseTracedProtocolConformanceConfiguration(tracedProtocolConformanceConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedProtocolConformanceConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedProtocolConformanceConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedProtocolConformanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION: {
				TracedProtocolStateMachineConfiguration tracedProtocolStateMachineConfiguration = (TracedProtocolStateMachineConfiguration)theEObject;
				T result = caseTracedProtocolStateMachineConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedStateMachineConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedProtocolStateMachineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PROTOCOL_TRANSITION_CONFIGURATION: {
				TracedProtocolTransitionConfiguration tracedProtocolTransitionConfiguration = (TracedProtocolTransitionConfiguration)theEObject;
				T result = caseTracedProtocolTransitionConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = caseTracedTransitionConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedProtocolTransitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_PSEUDOSTATE_CONFIGURATION: {
				TracedPseudostateConfiguration tracedPseudostateConfiguration = (TracedPseudostateConfiguration)theEObject;
				T result = caseTracedPseudostateConfiguration(tracedPseudostateConfiguration);
				if (result == null) result = caseTracedVertexConfiguration(tracedPseudostateConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedPseudostateConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedPseudostateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_QUALIFIER_VALUE_CONFIGURATION: {
				TracedQualifierValueConfiguration tracedQualifierValueConfiguration = (TracedQualifierValueConfiguration)theEObject;
				T result = caseTracedQualifierValueConfiguration(tracedQualifierValueConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedQualifierValueConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION: {
				TracedRaiseExceptionActionConfiguration tracedRaiseExceptionActionConfiguration = (TracedRaiseExceptionActionConfiguration)theEObject;
				T result = caseTracedRaiseExceptionActionConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRaiseExceptionActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_EXTENT_ACTION_CONFIGURATION: {
				TracedReadExtentActionConfiguration tracedReadExtentActionConfiguration = (TracedReadExtentActionConfiguration)theEObject;
				T result = caseTracedReadExtentActionConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadExtentActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION: {
				TracedReadIsClassifiedObjectActionConfiguration tracedReadIsClassifiedObjectActionConfiguration = (TracedReadIsClassifiedObjectActionConfiguration)theEObject;
				T result = caseTracedReadIsClassifiedObjectActionConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadIsClassifiedObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_LINK_ACTION_CONFIGURATION: {
				TracedReadLinkActionConfiguration tracedReadLinkActionConfiguration = (TracedReadLinkActionConfiguration)theEObject;
				T result = caseTracedReadLinkActionConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedLinkActionConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION: {
				TracedReadLinkObjectEndActionConfiguration tracedReadLinkObjectEndActionConfiguration = (TracedReadLinkObjectEndActionConfiguration)theEObject;
				T result = caseTracedReadLinkObjectEndActionConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadLinkObjectEndActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION: {
				TracedReadLinkObjectEndQualifierActionConfiguration tracedReadLinkObjectEndQualifierActionConfiguration = (TracedReadLinkObjectEndQualifierActionConfiguration)theEObject;
				T result = caseTracedReadLinkObjectEndQualifierActionConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_SELF_ACTION_CONFIGURATION: {
				TracedReadSelfActionConfiguration tracedReadSelfActionConfiguration = (TracedReadSelfActionConfiguration)theEObject;
				T result = caseTracedReadSelfActionConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadSelfActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				TracedReadStructuralFeatureActionConfiguration tracedReadStructuralFeatureActionConfiguration = (TracedReadStructuralFeatureActionConfiguration)theEObject;
				T result = caseTracedReadStructuralFeatureActionConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedStructuralFeatureActionConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_READ_VARIABLE_ACTION_CONFIGURATION: {
				TracedReadVariableActionConfiguration tracedReadVariableActionConfiguration = (TracedReadVariableActionConfiguration)theEObject;
				T result = caseTracedReadVariableActionConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedVariableActionConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReadVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REALIZATION_CONFIGURATION: {
				TracedRealizationConfiguration tracedRealizationConfiguration = (TracedRealizationConfiguration)theEObject;
				T result = caseTracedRealizationConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedAbstractionConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedRealizationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRealizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_RECEPTION_CONFIGURATION: {
				TracedReceptionConfiguration tracedReceptionConfiguration = (TracedReceptionConfiguration)theEObject;
				T result = caseTracedReceptionConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedBehavioralFeatureConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReceptionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReceptionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION: {
				TracedReclassifyObjectActionConfiguration tracedReclassifyObjectActionConfiguration = (TracedReclassifyObjectActionConfiguration)theEObject;
				T result = caseTracedReclassifyObjectActionConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReclassifyObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REDEFINABLE_ELEMENT_CONFIGURATION: {
				TracedRedefinableElementConfiguration tracedRedefinableElementConfiguration = (TracedRedefinableElementConfiguration)theEObject;
				T result = caseTracedRedefinableElementConfiguration(tracedRedefinableElementConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRedefinableElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRedefinableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION: {
				TracedRedefinableTemplateSignatureConfiguration tracedRedefinableTemplateSignatureConfiguration = (TracedRedefinableTemplateSignatureConfiguration)theEObject;
				T result = caseTracedRedefinableTemplateSignatureConfiguration(tracedRedefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedRedefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTracedTemplateSignatureConfiguration(tracedRedefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRedefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRedefinableTemplateSignatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REDUCE_ACTION_CONFIGURATION: {
				TracedReduceActionConfiguration tracedReduceActionConfiguration = (TracedReduceActionConfiguration)theEObject;
				T result = caseTracedReduceActionConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReduceActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REGION_CONFIGURATION: {
				TracedRegionConfiguration tracedRegionConfiguration = (TracedRegionConfiguration)theEObject;
				T result = caseTracedRegionConfiguration(tracedRegionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedRegionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedRegionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRegionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRegionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_RELATIONSHIP_CONFIGURATION: {
				TracedRelationshipConfiguration tracedRelationshipConfiguration = (TracedRelationshipConfiguration)theEObject;
				T result = caseTracedRelationshipConfiguration(tracedRelationshipConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRelationshipConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: {
				TracedRemoveStructuralFeatureValueActionConfiguration tracedRemoveStructuralFeatureValueActionConfiguration = (TracedRemoveStructuralFeatureValueActionConfiguration)theEObject;
				T result = caseTracedRemoveStructuralFeatureValueActionConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedWriteStructuralFeatureActionConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedStructuralFeatureActionConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRemoveStructuralFeatureValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION: {
				TracedRemoveVariableValueActionConfiguration tracedRemoveVariableValueActionConfiguration = (TracedRemoveVariableValueActionConfiguration)theEObject;
				T result = caseTracedRemoveVariableValueActionConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedWriteVariableActionConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedVariableActionConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedRemoveVariableValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_REPLY_ACTION_CONFIGURATION: {
				TracedReplyActionConfiguration tracedReplyActionConfiguration = (TracedReplyActionConfiguration)theEObject;
				T result = caseTracedReplyActionConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedReplyActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SEND_OBJECT_ACTION_CONFIGURATION: {
				TracedSendObjectActionConfiguration tracedSendObjectActionConfiguration = (TracedSendObjectActionConfiguration)theEObject;
				T result = caseTracedSendObjectActionConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSendObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SEND_SIGNAL_ACTION_CONFIGURATION: {
				TracedSendSignalActionConfiguration tracedSendSignalActionConfiguration = (TracedSendSignalActionConfiguration)theEObject;
				T result = caseTracedSendSignalActionConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSendSignalActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SEQUENCE_NODE_CONFIGURATION: {
				TracedSequenceNodeConfiguration tracedSequenceNodeConfiguration = (TracedSequenceNodeConfiguration)theEObject;
				T result = caseTracedSequenceNodeConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedStructuredActivityNodeConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSequenceNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SIGNAL_CONFIGURATION: {
				TracedSignalConfiguration tracedSignalConfiguration = (TracedSignalConfiguration)theEObject;
				T result = caseTracedSignalConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSignalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SIGNAL_EVENT_CONFIGURATION: {
				TracedSignalEventConfiguration tracedSignalEventConfiguration = (TracedSignalEventConfiguration)theEObject;
				T result = caseTracedSignalEventConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedMessageEventConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSignalEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SLOT_CONFIGURATION: {
				TracedSlotConfiguration tracedSlotConfiguration = (TracedSlotConfiguration)theEObject;
				T result = caseTracedSlotConfiguration(tracedSlotConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSlotConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION: {
				TracedStartClassifierBehaviorActionConfiguration tracedStartClassifierBehaviorActionConfiguration = (TracedStartClassifierBehaviorActionConfiguration)theEObject;
				T result = caseTracedStartClassifierBehaviorActionConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStartClassifierBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION: {
				TracedStartObjectBehaviorActionConfiguration tracedStartObjectBehaviorActionConfiguration = (TracedStartObjectBehaviorActionConfiguration)theEObject;
				T result = caseTracedStartObjectBehaviorActionConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedCallActionConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedInvocationActionConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStartObjectBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STATE_CONFIGURATION: {
				TracedStateConfiguration tracedStateConfiguration = (TracedStateConfiguration)theEObject;
				T result = caseTracedStateConfiguration(tracedStateConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedStateConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStateConfiguration);
				if (result == null) result = caseTracedVertexConfiguration(tracedStateConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStateConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STATE_INVARIANT_CONFIGURATION: {
				TracedStateInvariantConfiguration tracedStateInvariantConfiguration = (TracedStateInvariantConfiguration)theEObject;
				T result = caseTracedStateInvariantConfiguration(tracedStateInvariantConfiguration);
				if (result == null) result = caseTracedInteractionFragmentConfiguration(tracedStateInvariantConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStateInvariantConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStateInvariantConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STATE_MACHINE_CONFIGURATION: {
				TracedStateMachineConfiguration tracedStateMachineConfiguration = (TracedStateMachineConfiguration)theEObject;
				T result = caseTracedStateMachineConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedBehaviorConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStateMachineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STEREOTYPE_CONFIGURATION: {
				TracedStereotypeConfiguration tracedStereotypeConfiguration = (TracedStereotypeConfiguration)theEObject;
				T result = caseTracedStereotypeConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedClassConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedEncapsulatedClassifierConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedStructuredClassifierConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStereotypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STRING_EXPRESSION_CONFIGURATION: {
				TracedStringExpressionConfiguration tracedStringExpressionConfiguration = (TracedStringExpressionConfiguration)theEObject;
				T result = caseTracedStringExpressionConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedExpressionConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStringExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				TracedStructuralFeatureActionConfiguration tracedStructuralFeatureActionConfiguration = (TracedStructuralFeatureActionConfiguration)theEObject;
				T result = caseTracedStructuralFeatureActionConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STRUCTURAL_FEATURE_CONFIGURATION: {
				TracedStructuralFeatureConfiguration tracedStructuralFeatureConfiguration = (TracedStructuralFeatureConfiguration)theEObject;
				T result = caseTracedStructuralFeatureConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedFeatureConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStructuralFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION: {
				TracedStructuredActivityNodeConfiguration tracedStructuredActivityNodeConfiguration = (TracedStructuredActivityNodeConfiguration)theEObject;
				T result = caseTracedStructuredActivityNodeConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedActivityGroupConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStructuredActivityNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION: {
				TracedStructuredClassifierConfiguration tracedStructuredClassifierConfiguration = (TracedStructuredClassifierConfiguration)theEObject;
				T result = caseTracedStructuredClassifierConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedStructuredClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_SUBSTITUTION_CONFIGURATION: {
				TracedSubstitutionConfiguration tracedSubstitutionConfiguration = (TracedSubstitutionConfiguration)theEObject;
				T result = caseTracedSubstitutionConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedRealizationConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedAbstractionConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedSubstitutionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEMPLATE_BINDING_CONFIGURATION: {
				TracedTemplateBindingConfiguration tracedTemplateBindingConfiguration = (TracedTemplateBindingConfiguration)theEObject;
				T result = caseTracedTemplateBindingConfiguration(tracedTemplateBindingConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedTemplateBindingConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedTemplateBindingConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTemplateBindingConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEMPLATE_PARAMETER_CONFIGURATION: {
				TracedTemplateParameterConfiguration tracedTemplateParameterConfiguration = (TracedTemplateParameterConfiguration)theEObject;
				T result = caseTracedTemplateParameterConfiguration(tracedTemplateParameterConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION: {
				TracedTemplateParameterSubstitutionConfiguration tracedTemplateParameterSubstitutionConfiguration = (TracedTemplateParameterSubstitutionConfiguration)theEObject;
				T result = caseTracedTemplateParameterSubstitutionConfiguration(tracedTemplateParameterSubstitutionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTemplateParameterSubstitutionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEMPLATE_SIGNATURE_CONFIGURATION: {
				TracedTemplateSignatureConfiguration tracedTemplateSignatureConfiguration = (TracedTemplateSignatureConfiguration)theEObject;
				T result = caseTracedTemplateSignatureConfiguration(tracedTemplateSignatureConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTemplateSignatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION: {
				TracedTemplateableElementConfiguration tracedTemplateableElementConfiguration = (TracedTemplateableElementConfiguration)theEObject;
				T result = caseTracedTemplateableElementConfiguration(tracedTemplateableElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTemplateableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TEST_IDENTITY_ACTION_CONFIGURATION: {
				TracedTestIdentityActionConfiguration tracedTestIdentityActionConfiguration = (TracedTestIdentityActionConfiguration)theEObject;
				T result = caseTracedTestIdentityActionConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTestIdentityActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TIME_CONSTRAINT_CONFIGURATION: {
				TracedTimeConstraintConfiguration tracedTimeConstraintConfiguration = (TracedTimeConstraintConfiguration)theEObject;
				T result = caseTracedTimeConstraintConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedIntervalConstraintConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedConstraintConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTimeConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TIME_EVENT_CONFIGURATION: {
				TracedTimeEventConfiguration tracedTimeEventConfiguration = (TracedTimeEventConfiguration)theEObject;
				T result = caseTracedTimeEventConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = caseTracedEventConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTimeEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TIME_EXPRESSION_CONFIGURATION: {
				TracedTimeExpressionConfiguration tracedTimeExpressionConfiguration = (TracedTimeExpressionConfiguration)theEObject;
				T result = caseTracedTimeExpressionConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTimeExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TIME_INTERVAL_CONFIGURATION: {
				TracedTimeIntervalConfiguration tracedTimeIntervalConfiguration = (TracedTimeIntervalConfiguration)theEObject;
				T result = caseTracedTimeIntervalConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedIntervalConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedValueSpecificationConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTimeIntervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TIME_OBSERVATION_CONFIGURATION: {
				TracedTimeObservationConfiguration tracedTimeObservationConfiguration = (TracedTimeObservationConfiguration)theEObject;
				T result = caseTracedTimeObservationConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = caseTracedObservationConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTimeObservationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TRANSITION_CONFIGURATION: {
				TracedTransitionConfiguration tracedTransitionConfiguration = (TracedTransitionConfiguration)theEObject;
				T result = caseTracedTransitionConfiguration(tracedTransitionConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedTransitionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedTransitionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTransitionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTransitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TRIGGER_CONFIGURATION: {
				TracedTriggerConfiguration tracedTriggerConfiguration = (TracedTriggerConfiguration)theEObject;
				T result = caseTracedTriggerConfiguration(tracedTriggerConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTriggerConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTriggerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TYPE_CONFIGURATION: {
				TracedTypeConfiguration tracedTypeConfiguration = (TracedTypeConfiguration)theEObject;
				T result = caseTracedTypeConfiguration(tracedTypeConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedTypeConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTypeConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedTypeConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_TYPED_ELEMENT_CONFIGURATION: {
				TracedTypedElementConfiguration tracedTypedElementConfiguration = (TracedTypedElementConfiguration)theEObject;
				T result = caseTracedTypedElementConfiguration(tracedTypedElementConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedTypedElementConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedTypedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_UNMARSHALL_ACTION_CONFIGURATION: {
				TracedUnmarshallActionConfiguration tracedUnmarshallActionConfiguration = (TracedUnmarshallActionConfiguration)theEObject;
				T result = caseTracedUnmarshallActionConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedUnmarshallActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_USAGE_CONFIGURATION: {
				TracedUsageConfiguration tracedUsageConfiguration = (TracedUsageConfiguration)theEObject;
				T result = caseTracedUsageConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedDependencyConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedDirectedRelationshipConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedRelationshipConfiguration(tracedUsageConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedUsageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_USE_CASE_CONFIGURATION: {
				TracedUseCaseConfiguration tracedUseCaseConfiguration = (TracedUseCaseConfiguration)theEObject;
				T result = caseTracedUseCaseConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedBehavioredClassifierConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedClassifierConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedNamespaceConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedTypeConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedTemplateableElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedUseCaseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VALUE_PIN_CONFIGURATION: {
				TracedValuePinConfiguration tracedValuePinConfiguration = (TracedValuePinConfiguration)theEObject;
				T result = caseTracedValuePinConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedInputPinConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedPinConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedObjectNodeConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedValuePinConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedValuePinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION: {
				TracedValueSpecificationActionConfiguration tracedValueSpecificationActionConfiguration = (TracedValueSpecificationActionConfiguration)theEObject;
				T result = caseTracedValueSpecificationActionConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedValueSpecificationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VALUE_SPECIFICATION_CONFIGURATION: {
				TracedValueSpecificationConfiguration tracedValueSpecificationConfiguration = (TracedValueSpecificationConfiguration)theEObject;
				T result = caseTracedValueSpecificationConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = caseTracedPackageableElementConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedValueSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VARIABLE_ACTION_CONFIGURATION: {
				TracedVariableActionConfiguration tracedVariableActionConfiguration = (TracedVariableActionConfiguration)theEObject;
				T result = caseTracedVariableActionConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VARIABLE_CONFIGURATION: {
				TracedVariableConfiguration tracedVariableConfiguration = (TracedVariableConfiguration)theEObject;
				T result = caseTracedVariableConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedConnectableElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedMultiplicityElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedTypedElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedParameterableElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedVariableConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_VERTEX_CONFIGURATION: {
				TracedVertexConfiguration tracedVertexConfiguration = (TracedVertexConfiguration)theEObject;
				T result = caseTracedVertexConfiguration(tracedVertexConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedVertexConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedVertexConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_WRITE_LINK_ACTION_CONFIGURATION: {
				TracedWriteLinkActionConfiguration tracedWriteLinkActionConfiguration = (TracedWriteLinkActionConfiguration)theEObject;
				T result = caseTracedWriteLinkActionConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedLinkActionConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedWriteLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				TracedWriteStructuralFeatureActionConfiguration tracedWriteStructuralFeatureActionConfiguration = (TracedWriteStructuralFeatureActionConfiguration)theEObject;
				T result = caseTracedWriteStructuralFeatureActionConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedStructuralFeatureActionConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedWriteStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION: {
				TracedWriteVariableActionConfiguration tracedWriteVariableActionConfiguration = (TracedWriteVariableActionConfiguration)theEObject;
				T result = caseTracedWriteVariableActionConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedVariableActionConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedActionConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedExecutableNodeConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedActivityNodeConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedRedefinableElementConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedActivityContentConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedNamedElementConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = caseTracedElementConfiguration(tracedWriteVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Abstraction Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Abstraction Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAbstractionConfiguration(TracedAbstractionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Accept Call Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Accept Call Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAcceptCallActionConfiguration(TracedAcceptCallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Accept Event Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Accept Event Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAcceptEventActionConfiguration(TracedAcceptEventActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActionConfiguration(TracedActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActionExecutionSpecificationConfiguration(TracedActionExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action Input Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action Input Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActionInputPinConfiguration(TracedActionInputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityConfiguration(TracedActivityConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Content Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Content Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityContentConfiguration(TracedActivityContentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Edge Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Edge Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityEdgeConfiguration(TracedActivityEdgeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityFinalNodeConfiguration(TracedActivityFinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Group Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Group Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityGroupConfiguration(TracedActivityGroupConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityNodeConfiguration(TracedActivityNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Parameter Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Parameter Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityParameterNodeConfiguration(TracedActivityParameterNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Partition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Partition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityPartitionConfiguration(TracedActivityPartitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Actor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Actor Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActorConfiguration(TracedActorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Add Structural Feature Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Add Structural Feature Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAddStructuralFeatureValueActionConfiguration(TracedAddStructuralFeatureValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Add Variable Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Add Variable Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAddVariableValueActionConfiguration(TracedAddVariableValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Any Receive Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Any Receive Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAnyReceiveEventConfiguration(TracedAnyReceiveEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Artifact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Artifact Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArtifactConfiguration(TracedArtifactConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Association Class Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Association Class Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAssociationClassConfiguration(TracedAssociationClassConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Association Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Association Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAssociationConfiguration(TracedAssociationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBehaviorConfiguration(TracedBehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Behavior Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Behavior Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBehaviorExecutionSpecificationConfiguration(TracedBehaviorExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Behavioral Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Behavioral Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBehavioralFeatureConfiguration(TracedBehavioralFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Behaviored Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Behaviored Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBehavioredClassifierConfiguration(TracedBehavioredClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Broadcast Signal Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Broadcast Signal Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBroadcastSignalActionConfiguration(TracedBroadcastSignalActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallActionConfiguration(TracedCallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallBehaviorActionConfiguration(TracedCallBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallEventConfiguration(TracedCallEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Call Operation Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Call Operation Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCallOperationActionConfiguration(TracedCallOperationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Central Buffer Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Central Buffer Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCentralBufferNodeConfiguration(TracedCentralBufferNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Change Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Change Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedChangeEventConfiguration(TracedChangeEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Class Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Class Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClassConfiguration(TracedClassConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClassifierConfiguration(TracedClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Classifier Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Classifier Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClassifierTemplateParameterConfiguration(TracedClassifierTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Clause Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Clause Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClauseConfiguration(TracedClauseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Clear Association Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Clear Association Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClearAssociationActionConfiguration(TracedClearAssociationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Clear Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Clear Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClearStructuralFeatureActionConfiguration(TracedClearStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Clear Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Clear Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedClearVariableActionConfiguration(TracedClearVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Collaboration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Collaboration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCollaborationConfiguration(TracedCollaborationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Collaboration Use Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Collaboration Use Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCollaborationUseConfiguration(TracedCollaborationUseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Combined Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Combined Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCombinedFragmentConfiguration(TracedCombinedFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Comment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Comment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCommentConfiguration(TracedCommentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Communication Path Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Communication Path Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCommunicationPathConfiguration(TracedCommunicationPathConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Component Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Component Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedComponentConfiguration(TracedComponentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Component Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Component Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedComponentRealizationConfiguration(TracedComponentRealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Conditional Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Conditional Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConditionalNodeConfiguration(TracedConditionalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connectable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connectable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectableElementConfiguration(TracedConnectableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connectable Element Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connectable Element Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectableElementTemplateParameterConfiguration(TracedConnectableElementTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connection Point Reference Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connection Point Reference Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectionPointReferenceConfiguration(TracedConnectionPointReferenceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connector Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connector Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectorConfiguration(TracedConnectorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Connector End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Connector End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConnectorEndConfiguration(TracedConnectorEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Consider Ignore Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Consider Ignore Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConsiderIgnoreFragmentConfiguration(TracedConsiderIgnoreFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedConstraintConfiguration(TracedConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Continuation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Continuation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedContinuationConfiguration(TracedContinuationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlFlowConfiguration(TracedControlFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlNodeConfiguration(TracedControlNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Create Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Create Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCreateLinkActionConfiguration(TracedCreateLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Create Link Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Create Link Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCreateLinkObjectActionConfiguration(TracedCreateLinkObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Create Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Create Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedCreateObjectActionConfiguration(TracedCreateObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Data Store Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Data Store Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDataStoreNodeConfiguration(TracedDataStoreNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Data Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Data Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDataTypeConfiguration(TracedDataTypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Decision Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Decision Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDecisionNodeConfiguration(TracedDecisionNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Dependency Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Dependency Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDependencyConfiguration(TracedDependencyConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Deployed Artifact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Deployed Artifact Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDeployedArtifactConfiguration(TracedDeployedArtifactConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Deployment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDeploymentConfiguration(TracedDeploymentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Deployment Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Deployment Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDeploymentSpecificationConfiguration(TracedDeploymentSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Deployment Target Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Deployment Target Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDeploymentTargetConfiguration(TracedDeploymentTargetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Destroy Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Destroy Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDestroyLinkActionConfiguration(TracedDestroyLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Destroy Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Destroy Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDestroyObjectActionConfiguration(TracedDestroyObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Destruction Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Destruction Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDestructionOccurrenceSpecificationConfiguration(TracedDestructionOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Device Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDeviceConfiguration(TracedDeviceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Directed Relationship Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Directed Relationship Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDirectedRelationshipConfiguration(TracedDirectedRelationshipConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Duration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Duration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDurationConfiguration(TracedDurationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Duration Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Duration Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDurationConstraintConfiguration(TracedDurationConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Duration Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Duration Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDurationIntervalConfiguration(TracedDurationIntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Duration Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Duration Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDurationObservationConfiguration(TracedDurationObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedElementConfiguration(TracedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Element Import Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Element Import Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedElementImportConfiguration(TracedElementImportConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Encapsulated Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Encapsulated Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEncapsulatedClassifierConfiguration(TracedEncapsulatedClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Enumeration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Enumeration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEnumerationConfiguration(TracedEnumerationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Enumeration Literal Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Enumeration Literal Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEnumerationLiteralConfiguration(TracedEnumerationLiteralConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedEventConfiguration(TracedEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Exception Handler Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Exception Handler Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExceptionHandlerConfiguration(TracedExceptionHandlerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Executable Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Executable Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExecutableNodeConfiguration(TracedExecutableNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Execution Environment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Execution Environment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExecutionEnvironmentConfiguration(TracedExecutionEnvironmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Execution Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Execution Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExecutionOccurrenceSpecificationConfiguration(TracedExecutionOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExecutionSpecificationConfiguration(TracedExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Expansion Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Expansion Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExpansionNodeConfiguration(TracedExpansionNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Expansion Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Expansion Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExpansionRegionConfiguration(TracedExpansionRegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExpressionConfiguration(TracedExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extend Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extend Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtendConfiguration(TracedExtendConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extension Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extension Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtensionConfiguration(TracedExtensionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extension End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extension End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtensionEndConfiguration(TracedExtensionEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Extension Point Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Extension Point Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExtensionPointConfiguration(TracedExtensionPointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFeatureConfiguration(TracedFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFinalNodeConfiguration(TracedFinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Final State Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Final State Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFinalStateConfiguration(TracedFinalStateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Flow Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Flow Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFlowFinalNodeConfiguration(TracedFlowFinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Fork Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Fork Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedForkNodeConfiguration(TracedForkNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Function Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Function Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFunctionBehaviorConfiguration(TracedFunctionBehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Gate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Gate Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedGateConfiguration(TracedGateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced General Ordering Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced General Ordering Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedGeneralOrderingConfiguration(TracedGeneralOrderingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Generalization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Generalization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedGeneralizationConfiguration(TracedGeneralizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Generalization Set Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Generalization Set Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedGeneralizationSetConfiguration(TracedGeneralizationSetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Image Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Image Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedImageConfiguration(TracedImageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Include Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Include Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIncludeConfiguration(TracedIncludeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Information Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Information Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInformationFlowConfiguration(TracedInformationFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Information Item Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Information Item Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInformationItemConfiguration(TracedInformationItemConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Initial Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Initial Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInitialNodeConfiguration(TracedInitialNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Input Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Input Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInputPinConfiguration(TracedInputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Instance Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Instance Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInstanceSpecificationConfiguration(TracedInstanceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Instance Value Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Instance Value Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInstanceValueConfiguration(TracedInstanceValueConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interaction Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interaction Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInteractionConfiguration(TracedInteractionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interaction Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interaction Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInteractionConstraintConfiguration(TracedInteractionConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interaction Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interaction Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInteractionFragmentConfiguration(TracedInteractionFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interaction Operand Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interaction Operand Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInteractionOperandConfiguration(TracedInteractionOperandConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interaction Use Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interaction Use Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInteractionUseConfiguration(TracedInteractionUseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interface Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInterfaceConfiguration(TracedInterfaceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interface Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interface Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInterfaceRealizationConfiguration(TracedInterfaceRealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interruptible Activity Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interruptible Activity Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInterruptibleActivityRegionConfiguration(TracedInterruptibleActivityRegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntervalConfiguration(TracedIntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Interval Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Interval Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntervalConstraintConfiguration(TracedIntervalConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Invocation Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Invocation Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInvocationActionConfiguration(TracedInvocationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Join Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Join Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedJoinNodeConfiguration(TracedJoinNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Lifeline Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Lifeline Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLifelineConfiguration(TracedLifelineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLinkActionConfiguration(TracedLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Link End Creation Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Link End Creation Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLinkEndCreationDataConfiguration(TracedLinkEndCreationDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Link End Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Link End Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLinkEndDataConfiguration(TracedLinkEndDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Link End Destruction Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Link End Destruction Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLinkEndDestructionDataConfiguration(TracedLinkEndDestructionDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Boolean Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Boolean Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralBooleanConfiguration(TracedLiteralBooleanConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Integer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Integer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralIntegerConfiguration(TracedLiteralIntegerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Null Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Null Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralNullConfiguration(TracedLiteralNullConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Real Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Real Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralRealConfiguration(TracedLiteralRealConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralSpecificationConfiguration(TracedLiteralSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal String Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal String Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralStringConfiguration(TracedLiteralStringConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Literal Unlimited Natural Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Literal Unlimited Natural Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLiteralUnlimitedNaturalConfiguration(TracedLiteralUnlimitedNaturalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Loop Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Loop Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLoopNodeConfiguration(TracedLoopNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Manifestation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Manifestation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedManifestationConfiguration(TracedManifestationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Merge Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Merge Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMergeNodeConfiguration(TracedMergeNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Message Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Message Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMessageConfiguration(TracedMessageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Message End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Message End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMessageEndConfiguration(TracedMessageEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Message Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Message Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMessageEventConfiguration(TracedMessageEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Message Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Message Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMessageOccurrenceSpecificationConfiguration(TracedMessageOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Model Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Model Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedModelConfiguration(TracedModelConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Multiplicity Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Multiplicity Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMultiplicityElementConfiguration(TracedMultiplicityElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElementConfiguration(TracedNamedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Namespace Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Namespace Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamespaceConfiguration(TracedNamespaceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNodeConfiguration(TracedNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObjectFlowConfiguration(TracedObjectFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObjectNodeConfiguration(TracedObjectNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedObservationConfiguration(TracedObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOccurrenceSpecificationConfiguration(TracedOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueActionConfiguration(TracedOpaqueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueBehaviorConfiguration(TracedOpaqueBehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueExpressionConfiguration(TracedOpaqueExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Operation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Operation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOperationConfiguration(TracedOperationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Operation Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Operation Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOperationTemplateParameterConfiguration(TracedOperationTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Output Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Output Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOutputPinConfiguration(TracedOutputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Package Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Package Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPackageConfiguration(TracedPackageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Package Import Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Package Import Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPackageImportConfiguration(TracedPackageImportConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Package Merge Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Package Merge Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPackageMergeConfiguration(TracedPackageMergeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Packageable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Packageable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPackageableElementConfiguration(TracedPackageableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedParameterConfiguration(TracedParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Parameter Set Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Parameter Set Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedParameterSetConfiguration(TracedParameterSetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Parameterable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Parameterable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedParameterableElementConfiguration(TracedParameterableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Part Decomposition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Part Decomposition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPartDecompositionConfiguration(TracedPartDecompositionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPinConfiguration(TracedPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Port Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPortConfiguration(TracedPortConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Primitive Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Primitive Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPrimitiveTypeConfiguration(TracedPrimitiveTypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Profile Application Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Profile Application Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedProfileApplicationConfiguration(TracedProfileApplicationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Profile Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Profile Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedProfileConfiguration(TracedProfileConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Property Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Property Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPropertyConfiguration(TracedPropertyConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Protocol Conformance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Protocol Conformance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedProtocolConformanceConfiguration(TracedProtocolConformanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Protocol State Machine Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Protocol State Machine Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedProtocolStateMachineConfiguration(TracedProtocolStateMachineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Protocol Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Protocol Transition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedProtocolTransitionConfiguration(TracedProtocolTransitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Pseudostate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Pseudostate Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPseudostateConfiguration(TracedPseudostateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Qualifier Value Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Qualifier Value Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedQualifierValueConfiguration(TracedQualifierValueConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Raise Exception Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Raise Exception Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRaiseExceptionActionConfiguration(TracedRaiseExceptionActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Extent Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Extent Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadExtentActionConfiguration(TracedReadExtentActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Is Classified Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Is Classified Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadIsClassifiedObjectActionConfiguration(TracedReadIsClassifiedObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadLinkActionConfiguration(TracedReadLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Link Object End Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Link Object End Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadLinkObjectEndActionConfiguration(TracedReadLinkObjectEndActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Link Object End Qualifier Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Link Object End Qualifier Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadLinkObjectEndQualifierActionConfiguration(TracedReadLinkObjectEndQualifierActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Self Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Self Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadSelfActionConfiguration(TracedReadSelfActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadStructuralFeatureActionConfiguration(TracedReadStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Read Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Read Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReadVariableActionConfiguration(TracedReadVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRealizationConfiguration(TracedRealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Reception Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Reception Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReceptionConfiguration(TracedReceptionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Reclassify Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Reclassify Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReclassifyObjectActionConfiguration(TracedReclassifyObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Redefinable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Redefinable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRedefinableElementConfiguration(TracedRedefinableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Redefinable Template Signature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Redefinable Template Signature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRedefinableTemplateSignatureConfiguration(TracedRedefinableTemplateSignatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Reduce Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Reduce Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReduceActionConfiguration(TracedReduceActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRegionConfiguration(TracedRegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Relationship Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Relationship Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRelationshipConfiguration(TracedRelationshipConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Remove Structural Feature Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Remove Structural Feature Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRemoveStructuralFeatureValueActionConfiguration(TracedRemoveStructuralFeatureValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Remove Variable Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Remove Variable Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRemoveVariableValueActionConfiguration(TracedRemoveVariableValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Reply Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Reply Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedReplyActionConfiguration(TracedReplyActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Send Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Send Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSendObjectActionConfiguration(TracedSendObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Send Signal Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Send Signal Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSendSignalActionConfiguration(TracedSendSignalActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Sequence Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Sequence Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSequenceNodeConfiguration(TracedSequenceNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Signal Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Signal Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSignalConfiguration(TracedSignalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Signal Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Signal Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSignalEventConfiguration(TracedSignalEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Slot Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Slot Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSlotConfiguration(TracedSlotConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Start Classifier Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Start Classifier Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStartClassifierBehaviorActionConfiguration(TracedStartClassifierBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Start Object Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Start Object Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStartObjectBehaviorActionConfiguration(TracedStartObjectBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStateConfiguration(TracedStateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State Invariant Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State Invariant Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStateInvariantConfiguration(TracedStateInvariantConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State Machine Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State Machine Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStateMachineConfiguration(TracedStateMachineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Stereotype Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Stereotype Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStereotypeConfiguration(TracedStereotypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced String Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced String Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStringExpressionConfiguration(TracedStringExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuralFeatureActionConfiguration(TracedStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structural Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structural Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuralFeatureConfiguration(TracedStructuralFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structured Activity Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structured Activity Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuredActivityNodeConfiguration(TracedStructuredActivityNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Structured Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Structured Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStructuredClassifierConfiguration(TracedStructuredClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Substitution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Substitution Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSubstitutionConfiguration(TracedSubstitutionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Template Binding Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Template Binding Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTemplateBindingConfiguration(TracedTemplateBindingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTemplateParameterConfiguration(TracedTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Template Parameter Substitution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Template Parameter Substitution Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTemplateParameterSubstitutionConfiguration(TracedTemplateParameterSubstitutionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Template Signature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Template Signature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTemplateSignatureConfiguration(TracedTemplateSignatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Templateable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Templateable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTemplateableElementConfiguration(TracedTemplateableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Test Identity Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Test Identity Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTestIdentityActionConfiguration(TracedTestIdentityActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Time Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Time Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTimeConstraintConfiguration(TracedTimeConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Time Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Time Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTimeEventConfiguration(TracedTimeEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Time Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Time Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTimeExpressionConfiguration(TracedTimeExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Time Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Time Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTimeIntervalConfiguration(TracedTimeIntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Time Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Time Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTimeObservationConfiguration(TracedTimeObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Transition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTransitionConfiguration(TracedTransitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Trigger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Trigger Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTriggerConfiguration(TracedTriggerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTypeConfiguration(TracedTypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Typed Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Typed Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTypedElementConfiguration(TracedTypedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Unmarshall Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Unmarshall Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedUnmarshallActionConfiguration(TracedUnmarshallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Usage Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Usage Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedUsageConfiguration(TracedUsageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Use Case Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Use Case Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedUseCaseConfiguration(TracedUseCaseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValuePinConfiguration(TracedValuePinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value Specification Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value Specification Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValueSpecificationActionConfiguration(TracedValueSpecificationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValueSpecificationConfiguration(TracedValueSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariableActionConfiguration(TracedVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariableConfiguration(TracedVariableConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Vertex Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Vertex Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVertexConfiguration(TracedVertexConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Write Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Write Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedWriteLinkActionConfiguration(TracedWriteLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Write Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Write Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedWriteStructuralFeatureActionConfiguration(TracedWriteStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Write Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Write Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedWriteVariableActionConfiguration(TracedWriteVariableActionConfiguration object) {
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

} //FumlConfigurationSwitch
