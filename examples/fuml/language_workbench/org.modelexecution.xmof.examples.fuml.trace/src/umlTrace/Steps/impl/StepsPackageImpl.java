/**
 */
package umlTrace.Steps.impl;

import fumlConfiguration.FumlConfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import umlTrace.States.StatesPackage;

import umlTrace.States.ecore.EcorePackage;

import umlTrace.States.ecore.impl.EcorePackageImpl;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import umlTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import umlTrace.States.fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import umlTrace.States.fumlConfiguration.Input.InputPackage;

import umlTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;

import umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

import umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import umlTrace.States.impl.StatesPackageImpl;

import umlTrace.Steps.StepsFactory;
import umlTrace.Steps.StepsPackage;

import umlTrace.UmlTracePackage;

import umlTrace.impl.UmlTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Copy_ObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Copy_Object_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Object_New_ObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Copy_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Equals_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_HasType_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Classes_Kernel_Value_New_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Evaluate_ExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Execute_ExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Locus_Add_LocusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Locus_Instantiate_LocusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_Locus_Remove_LocusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_ModelConfiguration_MainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_ModelConfiguration_Main_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_ModelConfiguration_Main_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

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
	 * @see umlTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) : UmlTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) : IntegerFunctionsPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Load packages
		theUmlTracePackage.loadPackage();

		// Fix loaded packages
		theStepsPackage.fixPackageContents();
		theUmlTracePackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
		theFumlConfigurationPackage_1.fixPackageContents();
		theLociPackage.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theIntegerFunctionsPackage.fixPackageContents();
		theEcorePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return fumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return fumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation() {
		if (fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return fumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return fumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction() {
		if (fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionEClass == null) {
			fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return fumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation__GetCaller() {
        return getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return fumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation() {
		if (fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return fumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation() {
		if (fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return fumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation() {
		if (fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(73);
		}
		return fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(74);
		}
		return fumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation() {
		if (fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(75);
		}
		return fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation__GetCaller() {
        return getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStep() {
		if (fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(76);
		}
		return fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStep() {
		if (fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(77);
		}
		return fumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(78);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(79);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(80);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(81);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(82);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(83);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(84);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(85);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(86);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(87);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(88);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(89);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(90);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(91);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(92);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(93);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(94);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(95);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(96);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(97);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(98);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(99);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(100);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(101);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(102);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(103);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(104);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(105);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(106);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(107);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(108);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(109);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(110);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(111);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(112);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(113);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(114);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(115);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(116);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(117);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(118);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(119);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(120);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(121);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(122);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(123);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(124);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(125);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(126);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(127);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(128);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(129);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(130);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(131);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(132);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(133);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(134);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(135);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(136);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(137);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(138);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(139);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(140);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(141);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(142);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(143);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(144);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(145);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(146);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(147);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(148);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(149);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(150);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(151);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(152);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(153);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(154);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(155);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(156);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(157);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(158);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(159);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(160);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(161);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(162);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(163);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(164);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(165);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(166);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(167);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(168);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(169);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(170);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(171);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(172);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(173);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(174);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(175);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(176);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(177);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(178);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(179);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(180);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(181);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(182);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(183);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(184);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(185);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(186);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(187);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(188);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(189);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(190);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(191);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(192);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(193);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(194);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(195);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(196);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(197);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(198);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(199);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(200);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(201);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(202);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(203);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(204);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(205);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(206);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(207);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(208);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(209);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(210);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(211);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(212);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(213);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(214);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(215);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(216);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(217);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(218);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(219);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(220);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(221);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(222);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(223);
		}
		return fumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(224);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(225);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(226);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(227);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(228);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(229);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(230);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(231);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(232);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(233);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(234);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(235);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(236);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(237);
		}
		return fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(238);
		}
		return fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(239);
		}
		return fumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(240);
		}
		return fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(241);
		}
		return fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(242);
		}
		return fumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(243);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(244);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(245);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(246);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(247);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(248);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(249);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(250);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(251);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(252);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(253);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(254);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(255);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(256);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(257);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(258);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(259);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(260);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(261);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(262);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(263);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(264);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(265);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(266);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(267);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(268);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(269);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken() {
		if (fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(270);
		}
		return fumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(271);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_OfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(272);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(273);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(274);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_OfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(275);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(276);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(277);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_OfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(278);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(279);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(280);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_OfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(281);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(282);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(283);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_GetValue_TokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(284);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_IsControl_TokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(285);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_TokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(286);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_TokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(287);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(288);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(289);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_TokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token__GetCaller() {
        return getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(290);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStep() {
		if (fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStepEClass == null) {
			fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(291);
		}
		return fumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue() {
		if (fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueEClass == null) {
			fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(292);
		}
		return fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(293);
		}
		return fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(294);
		}
		return fumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue() {
		if (fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueEClass == null) {
			fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(295);
		}
		return fumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue() {
		if (fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueEClass == null) {
			fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(296);
		}
		return fumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(297);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(298);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(299);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(300);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(301);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(302);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(303);
		}
		return fumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation() {
		if (fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationEClass == null) {
			fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(304);
		}
		return fumlConfiguration_Classes_Kernel_Evaluation_Evaluate_EvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(305);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(306);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(307);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(308);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(309);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(310);
		}
		return fumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue() {
		if (fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueEClass == null) {
			fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(311);
		}
		return fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(312);
		}
		return fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(313);
		}
		return fumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue() {
		if (fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueEClass == null) {
			fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(314);
		}
		return fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(315);
		}
		return fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(316);
		}
		return fumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue() {
		if (fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueEClass == null) {
			fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(317);
		}
		return fumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue() {
		if (fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueEClass == null) {
			fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(318);
		}
		return fumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation() {
		if (fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(319);
		}
		return fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(320);
		}
		return fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(321);
		}
		return fumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation() {
		if (fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(322);
		}
		return fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(323);
		}
		return fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(324);
		}
		return fumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation() {
		if (fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(325);
		}
		return fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(326);
		}
		return fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(327);
		}
		return fumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Copy_Object() {
		if (fumlConfiguration_Classes_Kernel_Object_Copy_ObjectEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Copy_ObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(328);
		}
		return fumlConfiguration_Classes_Kernel_Object_Copy_ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Object_Copy_Object__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Object_Copy_Object().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Copy_Object_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Object_Copy_Object_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Copy_Object_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(329);
		}
		return fumlConfiguration_Classes_Kernel_Object_Copy_Object_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(330);
		}
		return fumlConfiguration_Classes_Kernel_Object_Copy_Object_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Destroy_Object() {
		if (fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(331);
		}
		return fumlConfiguration_Classes_Kernel_Object_Destroy_ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Object_Destroy_Object__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Object_Destroy_Object().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(332);
		}
		return fumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(333);
		}
		return fumlConfiguration_Classes_Kernel_Object_Destroy_Object_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object() {
		if (fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(334);
		}
		return fumlConfiguration_Classes_Kernel_Object_GetTypes_ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Object_New_Object() {
		if (fumlConfiguration_Classes_Kernel_Object_New_ObjectEClass == null) {
			fumlConfiguration_Classes_Kernel_Object_New_ObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(335);
		}
		return fumlConfiguration_Classes_Kernel_Object_New_ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Object_New_Object__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Object_New_Object().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue() {
		if (fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueEClass == null) {
			fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(336);
		}
		return fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(337);
		}
		return fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(338);
		}
		return fumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue() {
		if (fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueEClass == null) {
			fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(339);
		}
		return fumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference() {
		if (fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(340);
		}
		return fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(341);
		}
		return fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(342);
		}
		return fumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference() {
		if (fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(343);
		}
		return fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(344);
		}
		return fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(345);
		}
		return fumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue() {
		if (fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueEClass == null) {
			fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(346);
		}
		return fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(347);
		}
		return fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(348);
		}
		return fumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Copy_Value() {
		if (fumlConfiguration_Classes_Kernel_Value_Copy_ValueEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Copy_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(349);
		}
		return fumlConfiguration_Classes_Kernel_Value_Copy_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Value_Copy_Value__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Value_Copy_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(350);
		}
		return fumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(351);
		}
		return fumlConfiguration_Classes_Kernel_Value_Copy_Value_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Equals_Value() {
		if (fumlConfiguration_Classes_Kernel_Value_Equals_ValueEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Equals_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(352);
		}
		return fumlConfiguration_Classes_Kernel_Value_Equals_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Value_Equals_Value__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Value_Equals_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(353);
		}
		return fumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(354);
		}
		return fumlConfiguration_Classes_Kernel_Value_Equals_Value_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value() {
		if (fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(355);
		}
		return fumlConfiguration_Classes_Kernel_Value_GetTypes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_HasType_Value() {
		if (fumlConfiguration_Classes_Kernel_Value_HasType_ValueEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_HasType_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(356);
		}
		return fumlConfiguration_Classes_Kernel_Value_HasType_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Value_HasType_Value__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Value_HasType_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStep() {
		if (fumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(357);
		}
		return fumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStep() {
		if (fumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStepEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(358);
		}
		return fumlConfiguration_Classes_Kernel_Value_HasType_Value_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Classes_Kernel_Value_New_Value() {
		if (fumlConfiguration_Classes_Kernel_Value_New_ValueEClass == null) {
			fumlConfiguration_Classes_Kernel_Value_New_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(359);
		}
		return fumlConfiguration_Classes_Kernel_Value_New_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Classes_Kernel_Value_New_Value__GetCaller() {
        return getFumlConfiguration_Classes_Kernel_Value_New_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(360);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(361);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(362);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(363);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(364);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(365);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(366);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(367);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(368);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(369);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(370);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(371);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(372);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_ExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(373);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(374);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(375);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(376);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(377);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue__GetCaller() {
        return getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(378);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStep() {
		if (fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStepEClass == null) {
			fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(379);
		}
		return fumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(380);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory__GetCaller() {
        return getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(381);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(382);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(383);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory__GetCaller() {
        return getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(384);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(385);
		}
		return fumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory() {
		if (fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(386);
		}
		return fumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory__GetCaller() {
        return getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(387);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory__GetCaller() {
        return getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(388);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(389);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(390);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory__GetCaller() {
        return getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(391);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStep() {
		if (fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(392);
		}
		return fumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Evaluate_Executor() {
		if (fumlConfiguration_Loci_Executor_Evaluate_ExecutorEClass == null) {
			fumlConfiguration_Loci_Executor_Evaluate_ExecutorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(393);
		}
		return fumlConfiguration_Loci_Executor_Evaluate_ExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_Executor_Evaluate_Executor__GetCaller() {
        return getFumlConfiguration_Loci_Executor_Evaluate_Executor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStep() {
		if (fumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(394);
		}
		return fumlConfiguration_Loci_Executor_Evaluate_Executor_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStep() {
		if (fumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(395);
		}
		return fumlConfiguration_Loci_Executor_Evaluate_Executor_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Execute_Executor() {
		if (fumlConfiguration_Loci_Executor_Execute_ExecutorEClass == null) {
			fumlConfiguration_Loci_Executor_Execute_ExecutorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(396);
		}
		return fumlConfiguration_Loci_Executor_Execute_ExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_Executor_Execute_Executor__GetCaller() {
        return getFumlConfiguration_Loci_Executor_Execute_Executor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStep() {
		if (fumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(397);
		}
		return fumlConfiguration_Loci_Executor_Execute_Executor_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStep() {
		if (fumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(398);
		}
		return fumlConfiguration_Loci_Executor_Execute_Executor_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Locus_Add_Locus() {
		if (fumlConfiguration_Loci_Locus_Add_LocusEClass == null) {
			fumlConfiguration_Loci_Locus_Add_LocusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(399);
		}
		return fumlConfiguration_Loci_Locus_Add_LocusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_Locus_Add_Locus__GetCaller() {
        return getFumlConfiguration_Loci_Locus_Add_Locus().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Locus_Instantiate_Locus() {
		if (fumlConfiguration_Loci_Locus_Instantiate_LocusEClass == null) {
			fumlConfiguration_Loci_Locus_Instantiate_LocusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(400);
		}
		return fumlConfiguration_Loci_Locus_Instantiate_LocusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_Locus_Instantiate_Locus__GetCaller() {
        return getFumlConfiguration_Loci_Locus_Instantiate_Locus().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStep() {
		if (fumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStepEClass == null) {
			fumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(401);
		}
		return fumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStep() {
		if (fumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStepEClass == null) {
			fumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(402);
		}
		return fumlConfiguration_Loci_Locus_Instantiate_Locus_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_Locus_Remove_Locus() {
		if (fumlConfiguration_Loci_Locus_Remove_LocusEClass == null) {
			fumlConfiguration_Loci_Locus_Remove_LocusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(403);
		}
		return fumlConfiguration_Loci_Locus_Remove_LocusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_Locus_Remove_Locus__GetCaller() {
        return getFumlConfiguration_Loci_Locus_Remove_Locus().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor() {
		if (fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorEClass == null) {
			fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(404);
		}
		return fumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor__GetCaller() {
        return getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_ModelConfiguration_Main() {
		if (fumlConfiguration_ModelConfiguration_MainEClass == null) {
			fumlConfiguration_ModelConfiguration_MainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(405);
		}
		return fumlConfiguration_ModelConfiguration_MainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_ModelConfiguration_Main__GetCaller() {
        return getFumlConfiguration_ModelConfiguration_Main().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_ModelConfiguration_Main_AbstractSubStep() {
		if (fumlConfiguration_ModelConfiguration_Main_AbstractSubStepEClass == null) {
			fumlConfiguration_ModelConfiguration_Main_AbstractSubStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(406);
		}
		return fumlConfiguration_ModelConfiguration_Main_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_ModelConfiguration_Main_ImplicitStep() {
		if (fumlConfiguration_ModelConfiguration_Main_ImplicitStepEClass == null) {
			fumlConfiguration_ModelConfiguration_Main_ImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(407);
		}
		return fumlConfiguration_ModelConfiguration_Main_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(408);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(409);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(410);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(411);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(412);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution() {
		if (fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionEClass == null) {
			fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(413);
		}
		return fumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution__GetCaller() {
        return getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		if (rootImplicitStepEClass == null) {
			rootImplicitStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(414);
		}
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		if (specificStepEClass == null) {
			specificStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI).getEClassifiers().get(415);
		}
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
        return (EReference)getSpecificStep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
        return (EReference)getSpecificStep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("umlTrace.Steps." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //StepsPackageImpl
