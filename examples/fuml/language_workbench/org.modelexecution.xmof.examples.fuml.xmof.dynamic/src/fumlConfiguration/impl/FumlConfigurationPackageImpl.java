/**
 */
package fumlConfiguration.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;
import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.ListFunctions.ListFunctionsPackage;

import fumlConfiguration.FumlConfigurationFactory;
import fumlConfiguration.FumlConfigurationPackage;
import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;
import fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;
import fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;
import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;
import fumlConfiguration.Input.InputPackage;
import fumlConfiguration.Input.impl.InputPackageImpl;
import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.impl.LociPackageImpl;
import fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationPackageImpl extends EPackageImpl implements FumlConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "fumlConfiguration.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityContentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedArtifactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRealConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fumlConfiguration.FumlConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FumlConfigurationPackageImpl() {
		super(eNS_URI, FumlConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FumlConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FumlConfigurationPackage init() {
		if (isInited) return (FumlConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		FumlConfigurationPackageImpl theFumlConfigurationPackage = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FumlConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();
		IntegerFunctionsPackage.eINSTANCE.eClass();
		ListFunctionsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage_1 = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eNS_URI) : fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationPackage.loadPackage();

		// Fix loaded packages
		theFumlConfigurationPackage.fixPackageContents();
		theLociPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theIntegerFunctionsPackage_1.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFumlConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FumlConfigurationPackage.eNS_URI, theFumlConfigurationPackage);
		return theFumlConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelConfiguration() {
		if (modelConfigurationEClass == null) {
			modelConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(0);
		}
		return modelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementConfiguration() {
		if (elementConfigurationEClass == null) {
			elementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(1);
		}
		return elementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_SemanticVisitor() {
        return (EReference)getElementConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityContentConfiguration() {
		if (activityContentConfigurationEClass == null) {
			activityContentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activityContentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityConfiguration() {
		if (activityConfigurationEClass == null) {
			activityConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorConfiguration() {
		if (behaviorConfigurationEClass == null) {
			behaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(4);
		}
		return behaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassConfiguration() {
		if (classConfigurationEClass == null) {
			classConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(5);
		}
		return classConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifierConfiguration() {
		if (behavioredClassifierConfigurationEClass == null) {
			behavioredClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(6);
		}
		return behavioredClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierConfiguration() {
		if (classifierConfigurationEClass == null) {
			classifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(7);
		}
		return classifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceConfiguration() {
		if (namespaceConfigurationEClass == null) {
			namespaceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(8);
		}
		return namespaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementConfiguration() {
		if (namedElementConfigurationEClass == null) {
			namedElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(9);
		}
		return namedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentConfiguration() {
		if (commentConfigurationEClass == null) {
			commentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(10);
		}
		return commentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotypeConfiguration() {
		if (stereotypeConfigurationEClass == null) {
			stereotypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(11);
		}
		return stereotypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageConfiguration() {
		if (imageConfigurationEClass == null) {
			imageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(12);
		}
		return imageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileConfiguration() {
		if (profileConfigurationEClass == null) {
			profileConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(13);
		}
		return profileConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageConfiguration() {
		if (packageConfigurationEClass == null) {
			packageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(14);
		}
		return packageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElementConfiguration() {
		if (packageableElementConfigurationEClass == null) {
			packageableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(15);
		}
		return packageableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElementConfiguration() {
		if (parameterableElementConfigurationEClass == null) {
			parameterableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(16);
		}
		return parameterableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterConfiguration() {
		if (templateParameterConfigurationEClass == null) {
			templateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(17);
		}
		return templateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignatureConfiguration() {
		if (templateSignatureConfigurationEClass == null) {
			templateSignatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(18);
		}
		return templateSignatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElementConfiguration() {
		if (templateableElementConfigurationEClass == null) {
			templateableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(19);
		}
		return templateableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBindingConfiguration() {
		if (templateBindingConfigurationEClass == null) {
			templateBindingConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(20);
		}
		return templateBindingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationshipConfiguration() {
		if (directedRelationshipConfigurationEClass == null) {
			directedRelationshipConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(21);
		}
		return directedRelationshipConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConfiguration() {
		if (relationshipConfigurationEClass == null) {
			relationshipConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(22);
		}
		return relationshipConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitutionConfiguration() {
		if (templateParameterSubstitutionConfigurationEClass == null) {
			templateParameterSubstitutionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(23);
		}
		return templateParameterSubstitutionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeConfiguration() {
		if (typeConfigurationEClass == null) {
			typeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(24);
		}
		return typeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationConfiguration() {
		if (associationConfigurationEClass == null) {
			associationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(25);
		}
		return associationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyConfiguration() {
		if (propertyConfigurationEClass == null) {
			propertyConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(26);
		}
		return propertyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementConfiguration() {
		if (connectableElementConfigurationEClass == null) {
			connectableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(27);
		}
		return connectableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElementConfiguration() {
		if (typedElementConfigurationEClass == null) {
			typedElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(28);
		}
		return typedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEndConfiguration() {
		if (connectorEndConfigurationEClass == null) {
			connectorEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(29);
		}
		return connectorEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElementConfiguration() {
		if (multiplicityElementConfigurationEClass == null) {
			multiplicityElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(30);
		}
		return multiplicityElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationConfiguration() {
		if (valueSpecificationConfigurationEClass == null) {
			valueSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(31);
		}
		return valueSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameterConfiguration() {
		if (connectableElementTemplateParameterConfigurationEClass == null) {
			connectableElementTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(32);
		}
		return connectableElementTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTargetConfiguration() {
		if (deploymentTargetConfigurationEClass == null) {
			deploymentTargetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(33);
		}
		return deploymentTargetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentConfiguration() {
		if (deploymentConfigurationEClass == null) {
			deploymentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(34);
		}
		return deploymentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyConfiguration() {
		if (dependencyConfigurationEClass == null) {
			dependencyConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(35);
		}
		return dependencyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecificationConfiguration() {
		if (deploymentSpecificationConfigurationEClass == null) {
			deploymentSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(36);
		}
		return deploymentSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactConfiguration() {
		if (artifactConfigurationEClass == null) {
			artifactConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(37);
		}
		return artifactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedArtifactConfiguration() {
		if (deployedArtifactConfigurationEClass == null) {
			deployedArtifactConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(38);
		}
		return deployedArtifactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestationConfiguration() {
		if (manifestationConfigurationEClass == null) {
			manifestationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(39);
		}
		return manifestationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractionConfiguration() {
		if (abstractionConfigurationEClass == null) {
			abstractionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(40);
		}
		return abstractionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpressionConfiguration() {
		if (opaqueExpressionConfigurationEClass == null) {
			opaqueExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(41);
		}
		return opaqueExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConfiguration() {
		if (parameterConfigurationEClass == null) {
			parameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(42);
		}
		return parameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationConfiguration() {
		if (operationConfigurationEClass == null) {
			operationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(43);
		}
		return operationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeatureConfiguration() {
		if (behavioralFeatureConfigurationEClass == null) {
			behavioralFeatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(44);
		}
		return behavioralFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConfiguration() {
		if (featureConfigurationEClass == null) {
			featureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(45);
		}
		return featureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElementConfiguration() {
		if (redefinableElementConfigurationEClass == null) {
			redefinableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(46);
		}
		return redefinableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSetConfiguration() {
		if (parameterSetConfigurationEClass == null) {
			parameterSetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(47);
		}
		return parameterSetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintConfiguration() {
		if (constraintConfigurationEClass == null) {
			constraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(48);
		}
		return constraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeConfiguration() {
		if (dataTypeConfigurationEClass == null) {
			dataTypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(49);
		}
		return dataTypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConfiguration() {
		if (interfaceConfigurationEClass == null) {
			interfaceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(50);
		}
		return interfaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionConfiguration() {
		if (receptionConfigurationEClass == null) {
			receptionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(51);
		}
		return receptionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalConfiguration() {
		if (signalConfigurationEClass == null) {
			signalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(52);
		}
		return signalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachineConfiguration() {
		if (protocolStateMachineConfigurationEClass == null) {
			protocolStateMachineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(53);
		}
		return protocolStateMachineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineConfiguration() {
		if (stateMachineConfigurationEClass == null) {
			stateMachineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(54);
		}
		return stateMachineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostateConfiguration() {
		if (pseudostateConfigurationEClass == null) {
			pseudostateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(55);
		}
		return pseudostateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexConfiguration() {
		if (vertexConfigurationEClass == null) {
			vertexConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(56);
		}
		return vertexConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionConfiguration() {
		if (regionConfigurationEClass == null) {
			regionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(57);
		}
		return regionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateConfiguration() {
		if (stateConfigurationEClass == null) {
			stateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(58);
		}
		return stateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReferenceConfiguration() {
		if (connectionPointReferenceConfigurationEClass == null) {
			connectionPointReferenceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(59);
		}
		return connectionPointReferenceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerConfiguration() {
		if (triggerConfigurationEClass == null) {
			triggerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(60);
		}
		return triggerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventConfiguration() {
		if (eventConfigurationEClass == null) {
			eventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(61);
		}
		return eventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfiguration() {
		if (portConfigurationEClass == null) {
			portConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(62);
		}
		return portConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConfiguration() {
		if (transitionConfigurationEClass == null) {
			transitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(63);
		}
		return transitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformanceConfiguration() {
		if (protocolConformanceConfigurationEClass == null) {
			protocolConformanceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(64);
		}
		return protocolConformanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameterConfiguration() {
		if (operationTemplateParameterConfigurationEClass == null) {
			operationTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(65);
		}
		return operationTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureConfiguration() {
		if (structuralFeatureConfigurationEClass == null) {
			structuralFeatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(66);
		}
		return structuralFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMergeConfiguration() {
		if (packageMergeConfigurationEClass == null) {
			packageMergeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(67);
		}
		return packageMergeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplicationConfiguration() {
		if (profileApplicationConfigurationEClass == null) {
			profileApplicationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(68);
		}
		return profileApplicationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationConfiguration() {
		if (enumerationConfigurationEClass == null) {
			enumerationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(69);
		}
		return enumerationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteralConfiguration() {
		if (enumerationLiteralConfigurationEClass == null) {
			enumerationLiteralConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(70);
		}
		return enumerationLiteralConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificationConfiguration() {
		if (instanceSpecificationConfigurationEClass == null) {
			instanceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(71);
		}
		return instanceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotConfiguration() {
		if (slotConfigurationEClass == null) {
			slotConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(72);
		}
		return slotConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeConfiguration() {
		if (primitiveTypeConfigurationEClass == null) {
			primitiveTypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(73);
		}
		return primitiveTypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImportConfiguration() {
		if (elementImportConfigurationEClass == null) {
			elementImportConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(74);
		}
		return elementImportConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImportConfiguration() {
		if (packageImportConfigurationEClass == null) {
			packageImportConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(75);
		}
		return packageImportConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionConfiguration() {
		if (extensionConfigurationEClass == null) {
			extensionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(76);
		}
		return extensionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEndConfiguration() {
		if (extensionEndConfigurationEClass == null) {
			extensionEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(77);
		}
		return extensionEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpressionConfiguration() {
		if (stringExpressionConfigurationEClass == null) {
			stringExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(78);
		}
		return stringExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionConfiguration() {
		if (expressionConfigurationEClass == null) {
			expressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(79);
		}
		return expressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageConfiguration() {
		if (usageConfigurationEClass == null) {
			usageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(80);
		}
		return usageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUseConfiguration() {
		if (collaborationUseConfigurationEClass == null) {
			collaborationUseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(81);
		}
		return collaborationUseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationConfiguration() {
		if (collaborationConfigurationEClass == null) {
			collaborationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(82);
		}
		return collaborationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifierConfiguration() {
		if (structuredClassifierConfigurationEClass == null) {
			structuredClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(83);
		}
		return structuredClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorConfiguration() {
		if (connectorConfigurationEClass == null) {
			connectorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(84);
		}
		return connectorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationConfiguration() {
		if (generalizationConfigurationEClass == null) {
			generalizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(85);
		}
		return generalizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSetConfiguration() {
		if (generalizationSetConfigurationEClass == null) {
			generalizationSetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(86);
		}
		return generalizationSetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignatureConfiguration() {
		if (redefinableTemplateSignatureConfigurationEClass == null) {
			redefinableTemplateSignatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(87);
		}
		return redefinableTemplateSignatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseConfiguration() {
		if (useCaseConfigurationEClass == null) {
			useCaseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(88);
		}
		return useCaseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendConfiguration() {
		if (extendConfigurationEClass == null) {
			extendConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(89);
		}
		return extendConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPointConfiguration() {
		if (extensionPointConfigurationEClass == null) {
			extensionPointConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(90);
		}
		return extensionPointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeConfiguration() {
		if (includeConfigurationEClass == null) {
			includeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(91);
		}
		return includeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutionConfiguration() {
		if (substitutionConfigurationEClass == null) {
			substitutionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(92);
		}
		return substitutionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizationConfiguration() {
		if (realizationConfigurationEClass == null) {
			realizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(93);
		}
		return realizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameterConfiguration() {
		if (classifierTemplateParameterConfigurationEClass == null) {
			classifierTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(94);
		}
		return classifierTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealizationConfiguration() {
		if (interfaceRealizationConfigurationEClass == null) {
			interfaceRealizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(95);
		}
		return interfaceRealizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifierConfiguration() {
		if (encapsulatedClassifierConfigurationEClass == null) {
			encapsulatedClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(96);
		}
		return encapsulatedClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroupConfiguration() {
		if (activityGroupConfigurationEClass == null) {
			activityGroupConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(97);
		}
		return activityGroupConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeConfiguration() {
		if (activityEdgeConfigurationEClass == null) {
			activityEdgeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(98);
		}
		return activityEdgeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartitionConfiguration() {
		if (activityPartitionConfigurationEClass == null) {
			activityPartitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(99);
		}
		return activityPartitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeConfiguration() {
		if (activityNodeConfigurationEClass == null) {
			activityNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(100);
		}
		return activityNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegionConfiguration() {
		if (interruptibleActivityRegionConfigurationEClass == null) {
			interruptibleActivityRegionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(101);
		}
		return interruptibleActivityRegionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNodeConfiguration() {
		if (structuredActivityNodeConfigurationEClass == null) {
			structuredActivityNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(102);
		}
		return structuredActivityNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionConfiguration() {
		if (actionConfigurationEClass == null) {
			actionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(103);
		}
		return actionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNodeConfiguration() {
		if (executableNodeConfigurationEClass == null) {
			executableNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(104);
		}
		return executableNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandlerConfiguration() {
		if (exceptionHandlerConfigurationEClass == null) {
			exceptionHandlerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(105);
		}
		return exceptionHandlerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNodeConfiguration() {
		if (objectNodeConfigurationEClass == null) {
			objectNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(106);
		}
		return objectNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPinConfiguration() {
		if (inputPinConfigurationEClass == null) {
			inputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(107);
		}
		return inputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinConfiguration() {
		if (pinConfigurationEClass == null) {
			pinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(108);
		}
		return pinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPinConfiguration() {
		if (outputPinConfigurationEClass == null) {
			outputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(109);
		}
		return outputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableConfiguration() {
		if (variableConfigurationEClass == null) {
			variableConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(110);
		}
		return variableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationActionConfiguration() {
		if (valueSpecificationActionConfigurationEClass == null) {
			valueSpecificationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(111);
		}
		return valueSpecificationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableActionConfiguration() {
		if (variableActionConfigurationEClass == null) {
			variableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(112);
		}
		return variableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkActionConfiguration() {
		if (writeLinkActionConfigurationEClass == null) {
			writeLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(113);
		}
		return writeLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkActionConfiguration() {
		if (linkActionConfigurationEClass == null) {
			linkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(114);
		}
		return linkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDataConfiguration() {
		if (linkEndDataConfigurationEClass == null) {
			linkEndDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(115);
		}
		return linkEndDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValueConfiguration() {
		if (qualifierValueConfigurationEClass == null) {
			qualifierValueConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(116);
		}
		return qualifierValueConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureActionConfiguration() {
		if (writeStructuralFeatureActionConfigurationEClass == null) {
			writeStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(117);
		}
		return writeStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureActionConfiguration() {
		if (structuralFeatureActionConfigurationEClass == null) {
			structuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(118);
		}
		return structuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableActionConfiguration() {
		if (writeVariableActionConfigurationEClass == null) {
			writeVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(119);
		}
		return writeVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallActionConfiguration() {
		if (acceptCallActionConfigurationEClass == null) {
			acceptCallActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(120);
		}
		return acceptCallActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionConfiguration() {
		if (acceptEventActionConfigurationEClass == null) {
			acceptEventActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(121);
		}
		return acceptEventActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPinConfiguration() {
		if (actionInputPinConfigurationEClass == null) {
			actionInputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(122);
		}
		return actionInputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueActionConfiguration() {
		if (addStructuralFeatureValueActionConfigurationEClass == null) {
			addStructuralFeatureValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(123);
		}
		return addStructuralFeatureValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueActionConfiguration() {
		if (addVariableValueActionConfigurationEClass == null) {
			addVariableValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(124);
		}
		return addVariableValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalActionConfiguration() {
		if (broadcastSignalActionConfigurationEClass == null) {
			broadcastSignalActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(125);
		}
		return broadcastSignalActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationActionConfiguration() {
		if (invocationActionConfigurationEClass == null) {
			invocationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(126);
		}
		return invocationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionConfiguration() {
		if (callActionConfigurationEClass == null) {
			callActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(127);
		}
		return callActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorActionConfiguration() {
		if (callBehaviorActionConfigurationEClass == null) {
			callBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(128);
		}
		return callBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationActionConfiguration() {
		if (callOperationActionConfigurationEClass == null) {
			callOperationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(129);
		}
		return callOperationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClauseConfiguration() {
		if (clauseConfigurationEClass == null) {
			clauseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(130);
		}
		return clauseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationActionConfiguration() {
		if (clearAssociationActionConfigurationEClass == null) {
			clearAssociationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(131);
		}
		return clearAssociationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureActionConfiguration() {
		if (clearStructuralFeatureActionConfigurationEClass == null) {
			clearStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(132);
		}
		return clearStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableActionConfiguration() {
		if (clearVariableActionConfigurationEClass == null) {
			clearVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(133);
		}
		return clearVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNodeConfiguration() {
		if (conditionalNodeConfigurationEClass == null) {
			conditionalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(134);
		}
		return conditionalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkActionConfiguration() {
		if (createLinkActionConfigurationEClass == null) {
			createLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(135);
		}
		return createLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationDataConfiguration() {
		if (linkEndCreationDataConfigurationEClass == null) {
			linkEndCreationDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(136);
		}
		return linkEndCreationDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectActionConfiguration() {
		if (createLinkObjectActionConfigurationEClass == null) {
			createLinkObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(137);
		}
		return createLinkObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectActionConfiguration() {
		if (createObjectActionConfigurationEClass == null) {
			createObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(138);
		}
		return createObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkActionConfiguration() {
		if (destroyLinkActionConfigurationEClass == null) {
			destroyLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(139);
		}
		return destroyLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionDataConfiguration() {
		if (linkEndDestructionDataConfigurationEClass == null) {
			linkEndDestructionDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(140);
		}
		return linkEndDestructionDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectActionConfiguration() {
		if (destroyObjectActionConfigurationEClass == null) {
			destroyObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(141);
		}
		return destroyObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNodeConfiguration() {
		if (expansionNodeConfigurationEClass == null) {
			expansionNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(142);
		}
		return expansionNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegionConfiguration() {
		if (expansionRegionConfigurationEClass == null) {
			expansionRegionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(143);
		}
		return expansionRegionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNodeConfiguration() {
		if (loopNodeConfigurationEClass == null) {
			loopNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(144);
		}
		return loopNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionConfiguration() {
		if (opaqueActionConfigurationEClass == null) {
			opaqueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(145);
		}
		return opaqueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionActionConfiguration() {
		if (raiseExceptionActionConfigurationEClass == null) {
			raiseExceptionActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(146);
		}
		return raiseExceptionActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentActionConfiguration() {
		if (readExtentActionConfigurationEClass == null) {
			readExtentActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(147);
		}
		return readExtentActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectActionConfiguration() {
		if (readIsClassifiedObjectActionConfigurationEClass == null) {
			readIsClassifiedObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(148);
		}
		return readIsClassifiedObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkActionConfiguration() {
		if (readLinkActionConfigurationEClass == null) {
			readLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(149);
		}
		return readLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndActionConfiguration() {
		if (readLinkObjectEndActionConfigurationEClass == null) {
			readLinkObjectEndActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(150);
		}
		return readLinkObjectEndActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierActionConfiguration() {
		if (readLinkObjectEndQualifierActionConfigurationEClass == null) {
			readLinkObjectEndQualifierActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(151);
		}
		return readLinkObjectEndQualifierActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfActionConfiguration() {
		if (readSelfActionConfigurationEClass == null) {
			readSelfActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(152);
		}
		return readSelfActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureActionConfiguration() {
		if (readStructuralFeatureActionConfigurationEClass == null) {
			readStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(153);
		}
		return readStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableActionConfiguration() {
		if (readVariableActionConfigurationEClass == null) {
			readVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(154);
		}
		return readVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectActionConfiguration() {
		if (reclassifyObjectActionConfigurationEClass == null) {
			reclassifyObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(155);
		}
		return reclassifyObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceActionConfiguration() {
		if (reduceActionConfigurationEClass == null) {
			reduceActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(156);
		}
		return reduceActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueActionConfiguration() {
		if (removeStructuralFeatureValueActionConfigurationEClass == null) {
			removeStructuralFeatureValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(157);
		}
		return removeStructuralFeatureValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueActionConfiguration() {
		if (removeVariableValueActionConfigurationEClass == null) {
			removeVariableValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(158);
		}
		return removeVariableValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyActionConfiguration() {
		if (replyActionConfigurationEClass == null) {
			replyActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(159);
		}
		return replyActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectActionConfiguration() {
		if (sendObjectActionConfigurationEClass == null) {
			sendObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(160);
		}
		return sendObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalActionConfiguration() {
		if (sendSignalActionConfigurationEClass == null) {
			sendSignalActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(161);
		}
		return sendSignalActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNodeConfiguration() {
		if (sequenceNodeConfigurationEClass == null) {
			sequenceNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(162);
		}
		return sequenceNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorActionConfiguration() {
		if (startClassifierBehaviorActionConfigurationEClass == null) {
			startClassifierBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(163);
		}
		return startClassifierBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorActionConfiguration() {
		if (startObjectBehaviorActionConfigurationEClass == null) {
			startObjectBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(164);
		}
		return startObjectBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityActionConfiguration() {
		if (testIdentityActionConfigurationEClass == null) {
			testIdentityActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(165);
		}
		return testIdentityActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallActionConfiguration() {
		if (unmarshallActionConfigurationEClass == null) {
			unmarshallActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(166);
		}
		return unmarshallActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePinConfiguration() {
		if (valuePinConfigurationEClass == null) {
			valuePinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(167);
		}
		return valuePinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeConfiguration() {
		if (activityFinalNodeConfigurationEClass == null) {
			activityFinalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(168);
		}
		return activityFinalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeConfiguration() {
		if (finalNodeConfigurationEClass == null) {
			finalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(169);
		}
		return finalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeConfiguration() {
		if (controlNodeConfigurationEClass == null) {
			controlNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(170);
		}
		return controlNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNodeConfiguration() {
		if (activityParameterNodeConfigurationEClass == null) {
			activityParameterNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(171);
		}
		return activityParameterNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNodeConfiguration() {
		if (centralBufferNodeConfigurationEClass == null) {
			centralBufferNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(172);
		}
		return centralBufferNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowConfiguration() {
		if (controlFlowConfigurationEClass == null) {
			controlFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(173);
		}
		return controlFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNodeConfiguration() {
		if (dataStoreNodeConfigurationEClass == null) {
			dataStoreNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(174);
		}
		return dataStoreNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeConfiguration() {
		if (decisionNodeConfigurationEClass == null) {
			decisionNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(175);
		}
		return decisionNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlowConfiguration() {
		if (objectFlowConfigurationEClass == null) {
			objectFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(176);
		}
		return objectFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeConfiguration() {
		if (flowFinalNodeConfigurationEClass == null) {
			flowFinalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(177);
		}
		return flowFinalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeConfiguration() {
		if (forkNodeConfigurationEClass == null) {
			forkNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(178);
		}
		return forkNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeConfiguration() {
		if (initialNodeConfigurationEClass == null) {
			initialNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(179);
		}
		return initialNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeConfiguration() {
		if (joinNodeConfigurationEClass == null) {
			joinNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(180);
		}
		return joinNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeConfiguration() {
		if (mergeNodeConfigurationEClass == null) {
			mergeNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(181);
		}
		return mergeNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValueConfiguration() {
		if (instanceValueConfigurationEClass == null) {
			instanceValueConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(182);
		}
		return instanceValueConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEventConfiguration() {
		if (anyReceiveEventConfigurationEClass == null) {
			anyReceiveEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(183);
		}
		return anyReceiveEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEventConfiguration() {
		if (messageEventConfigurationEClass == null) {
			messageEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(184);
		}
		return messageEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEventConfiguration() {
		if (callEventConfigurationEClass == null) {
			callEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(185);
		}
		return callEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEventConfiguration() {
		if (changeEventConfigurationEClass == null) {
			changeEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(186);
		}
		return changeEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehaviorConfiguration() {
		if (functionBehaviorConfigurationEClass == null) {
			functionBehaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(187);
		}
		return functionBehaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehaviorConfiguration() {
		if (opaqueBehaviorConfigurationEClass == null) {
			opaqueBehaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(188);
		}
		return opaqueBehaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEventConfiguration() {
		if (signalEventConfigurationEClass == null) {
			signalEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(189);
		}
		return signalEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEventConfiguration() {
		if (timeEventConfigurationEClass == null) {
			timeEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(190);
		}
		return timeEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpressionConfiguration() {
		if (timeExpressionConfigurationEClass == null) {
			timeExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(191);
		}
		return timeExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationConfiguration() {
		if (observationConfigurationEClass == null) {
			observationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(192);
		}
		return observationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPathConfiguration() {
		if (communicationPathConfigurationEClass == null) {
			communicationPathConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(193);
		}
		return communicationPathConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceConfiguration() {
		if (deviceConfigurationEClass == null) {
			deviceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(194);
		}
		return deviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeConfiguration() {
		if (nodeConfigurationEClass == null) {
			nodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(195);
		}
		return nodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironmentConfiguration() {
		if (executionEnvironmentConfigurationEClass == null) {
			executionEnvironmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(196);
		}
		return executionEnvironmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowConfiguration() {
		if (informationFlowConfigurationEClass == null) {
			informationFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(197);
		}
		return informationFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageConfiguration() {
		if (messageConfigurationEClass == null) {
			messageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(198);
		}
		return messageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConfiguration() {
		if (interactionConfigurationEClass == null) {
			interactionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(199);
		}
		return interactionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragmentConfiguration() {
		if (interactionFragmentConfigurationEClass == null) {
			interactionFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(200);
		}
		return interactionFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifelineConfiguration() {
		if (lifelineConfigurationEClass == null) {
			lifelineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(201);
		}
		return lifelineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecompositionConfiguration() {
		if (partDecompositionConfigurationEClass == null) {
			partDecompositionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(202);
		}
		return partDecompositionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUseConfiguration() {
		if (interactionUseConfigurationEClass == null) {
			interactionUseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(203);
		}
		return interactionUseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateConfiguration() {
		if (gateConfigurationEClass == null) {
			gateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(204);
		}
		return gateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEndConfiguration() {
		if (messageEndConfigurationEClass == null) {
			messageEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(205);
		}
		return messageEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperandConfiguration() {
		if (interactionOperandConfigurationEClass == null) {
			interactionOperandConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(206);
		}
		return interactionOperandConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraintConfiguration() {
		if (interactionConstraintConfigurationEClass == null) {
			interactionConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(207);
		}
		return interactionConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrderingConfiguration() {
		if (generalOrderingConfigurationEClass == null) {
			generalOrderingConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(208);
		}
		return generalOrderingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecificationConfiguration() {
		if (occurrenceSpecificationConfigurationEClass == null) {
			occurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(209);
		}
		return occurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItemConfiguration() {
		if (informationItemConfigurationEClass == null) {
			informationItemConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(210);
		}
		return informationItemConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecutionSpecificationConfiguration() {
		if (actionExecutionSpecificationConfigurationEClass == null) {
			actionExecutionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(211);
		}
		return actionExecutionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecificationConfiguration() {
		if (executionSpecificationConfigurationEClass == null) {
			executionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(212);
		}
		return executionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecificationConfiguration() {
		if (behaviorExecutionSpecificationConfigurationEClass == null) {
			behaviorExecutionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(213);
		}
		return behaviorExecutionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragmentConfiguration() {
		if (combinedFragmentConfigurationEClass == null) {
			combinedFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(214);
		}
		return combinedFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragmentConfiguration() {
		if (considerIgnoreFragmentConfigurationEClass == null) {
			considerIgnoreFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(215);
		}
		return considerIgnoreFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuationConfiguration() {
		if (continuationConfigurationEClass == null) {
			continuationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(216);
		}
		return continuationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionOccurrenceSpecificationConfiguration() {
		if (destructionOccurrenceSpecificationConfigurationEClass == null) {
			destructionOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(217);
		}
		return destructionOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecificationConfiguration() {
		if (messageOccurrenceSpecificationConfigurationEClass == null) {
			messageOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(218);
		}
		return messageOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrenceSpecificationConfiguration() {
		if (executionOccurrenceSpecificationConfigurationEClass == null) {
			executionOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(219);
		}
		return executionOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariantConfiguration() {
		if (stateInvariantConfigurationEClass == null) {
			stateInvariantConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(220);
		}
		return stateInvariantConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalStateConfiguration() {
		if (finalStateConfigurationEClass == null) {
			finalStateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(221);
		}
		return finalStateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransitionConfiguration() {
		if (protocolTransitionConfigurationEClass == null) {
			protocolTransitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(222);
		}
		return protocolTransitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClassConfiguration() {
		if (associationClassConfigurationEClass == null) {
			associationClassConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(223);
		}
		return associationClassConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConfiguration() {
		if (componentConfigurationEClass == null) {
			componentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(224);
		}
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRealizationConfiguration() {
		if (componentRealizationConfigurationEClass == null) {
			componentRealizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(225);
		}
		return componentRealizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorConfiguration() {
		if (actorConfigurationEClass == null) {
			actorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(226);
		}
		return actorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConfiguration() {
		if (durationConfigurationEClass == null) {
			durationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(227);
		}
		return durationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraintConfiguration() {
		if (durationConstraintConfigurationEClass == null) {
			durationConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(228);
		}
		return durationConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraintConfiguration() {
		if (intervalConstraintConfigurationEClass == null) {
			intervalConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(229);
		}
		return intervalConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConfiguration() {
		if (intervalConfigurationEClass == null) {
			intervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(230);
		}
		return intervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationIntervalConfiguration() {
		if (durationIntervalConfigurationEClass == null) {
			durationIntervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(231);
		}
		return durationIntervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservationConfiguration() {
		if (durationObservationConfigurationEClass == null) {
			durationObservationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(232);
		}
		return durationObservationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBooleanConfiguration() {
		if (literalBooleanConfigurationEClass == null) {
			literalBooleanConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(233);
		}
		return literalBooleanConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecificationConfiguration() {
		if (literalSpecificationConfigurationEClass == null) {
			literalSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(234);
		}
		return literalSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralIntegerConfiguration() {
		if (literalIntegerConfigurationEClass == null) {
			literalIntegerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(235);
		}
		return literalIntegerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNullConfiguration() {
		if (literalNullConfigurationEClass == null) {
			literalNullConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(236);
		}
		return literalNullConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralRealConfiguration() {
		if (literalRealConfigurationEClass == null) {
			literalRealConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(237);
		}
		return literalRealConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralStringConfiguration() {
		if (literalStringConfigurationEClass == null) {
			literalStringConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(238);
		}
		return literalStringConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNaturalConfiguration() {
		if (literalUnlimitedNaturalConfigurationEClass == null) {
			literalUnlimitedNaturalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(239);
		}
		return literalUnlimitedNaturalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraintConfiguration() {
		if (timeConstraintConfigurationEClass == null) {
			timeConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(240);
		}
		return timeConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeIntervalConfiguration() {
		if (timeIntervalConfigurationEClass == null) {
			timeIntervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(241);
		}
		return timeIntervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservationConfiguration() {
		if (timeObservationConfigurationEClass == null) {
			timeObservationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(242);
		}
		return timeObservationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFactory getFumlConfigurationFactory() {
		return (FumlConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fumlConfiguration." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FumlConfigurationPackageImpl
