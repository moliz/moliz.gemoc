
package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class UmlTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.Step createStep(org.gemoc.executionframework.engine.mse.MSE mse,
			List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.Step step = null;

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.createNodeActivations_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.doAction_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.fire_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getPinActivation_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.hasOffers_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.inisitalize_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.isReady_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.putToken_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.putTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.sendOffers_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.shouldFireAgain_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.takeOfferedTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.takeTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.terminate_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.collectOutputParameterValues_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.doAction_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.getCallExecution_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.initializeInputParameterValues_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.removeCallExecution_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.terminate_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getCallExecution_CallBehaviorActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.InputPinActivation.isReady_InputPinActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.InputPinActivation.receiveOffer_InputPinActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.doAction_OpaqueAction")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.PinActivation.fire_PinActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.PinActivation.takeOfferedTokens_PinActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.doAction_AddStructuralFeatureValueActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.doAction_CreateObjectActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.doAction_ReadStructuralFeatureActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.doAction_ValueSpecificationActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance.countOfferedValues_ActivityEdgeInstance")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance.hasOffer_ActivityEdgeInstance")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance.sendOffer_ActivityEdgeInstance")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance.takeOfferedTokens_ActivityEdgeInstance")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance.takeOfferedTokens_int_ActivityEdgeInstance")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.collectOutputParameterValues_ActivityExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.execute_ActivityExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.setParameterValueValues_ActivityExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.terminate_ActivityExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.fire_ActivityFinalNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.addToken_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.addTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.clearTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.createEdgeInstances_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.createNodeActivations_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.fire_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getActivityExecution_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getExecutionContext_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getExecutionLocus_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getNodeActivation_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.hasOffers_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.initialize_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isReady_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isRunning_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isSourceFor_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.receiveOffer_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.removeToken_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.run_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.sendOffers_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.takeOfferedTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.terminate_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.activate_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.checkIncomingEdges_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.createEdgeInstances_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.createNodeActivation_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.createNodeActivations_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.getActivityExecution_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.getInitiallyEnabledNodeActivations_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.getNodeActivation_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.getOutputParameterNodeActivations_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.getSourceActivations_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.runNodes_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.run_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup.terminateAll_ActivityNodeActivationGroup")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.clearTokens_ActivityParameterNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.fire_ActivityParameterNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.fire_ControlNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ControlToken.isControl_ControlToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.determineOfferedTokens_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.executeDecisionInputBehavior_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.fire_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getDecisionInputFlowInstance_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getDecisionInputFlowValue_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getDecisionValues_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.hasObjectFlowInput_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.isReady_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.removeJoinedControlTokens_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.takeOfferedTokens_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.test_DecisionNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.fire_ForkNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.getValue_ForkedToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.initialize_ForkedToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.isControl_ForkedToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.withdraw_ForkedToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.fire_InitialNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.isReady_JoinNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.addToken_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.clearTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.countOfferedValues_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.countUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.initialize_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.sendOffers_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.sendUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.takeUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.terminate_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.getValue_ObjectToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.isControl_ObjectToken")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.Offer.countOfferedValues_Offer")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Offer.getOfferedTokens_Offer")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Offer.hasTokens_Offer")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.Offer.removeWithdrawnTokens_Offer")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.getValue_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.isControl_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.isWithdrawn_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.transfer_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.withdraw_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.copy_BooleanValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.equals_BooleanValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.new_BooleanValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.copy_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.getFeatureValue_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.setFeatureValue_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Evaluation.evaluate_Evaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.copy_ExtensionalValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.destroy_ExtensionalValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.FeatureValue.copy_FeatureValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.copy_IntegerValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.equals_IntegerValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.new_IntegerValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation.evaluate_LiteralBooleanEvaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.LiteralEvaluation.getType_LiteralEvaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation.evaluate_LiteralIntegerEvaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.copy_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_Copy_Object();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.destroy_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_Destroy_Object();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.getTypes_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_GetTypes_Object();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.new_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_New_Object();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.copy_PrimitiveValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.getTypes_PrimitiveValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.getFeatureValue_Reference")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.setFeatureValue_Reference")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Classes.Kernel.StructuredValue.createFeatureValues_StructuredValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.copy_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_Copy_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.equals_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_Equals_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.getTypes_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_GetTypes_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.hasType_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_HasType_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.new_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_New_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.execute_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getBehavior_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getOutputParameterValues_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getParameterValue_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.setParameterValue_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.terminate_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.doBody_OpaqueBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.execute_OpaqueBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue.copy_ParameterValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.ExecutionFactory.createEvaluation_ExecutionFactory")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.ExecutionFactory.createExecution_ExecutionFactory")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.ExecutionFactory.getBuiltInType_ExecutionFactory")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Loci.ExecutionFactory.instantiateOpaqueBehaviorExecution_ExecutionFactory")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.ExecutionFactory.instantiateVisitor_ExecutionFactory")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.Executor.evaluate_Executor")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Executor_Evaluate_Executor();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.Executor.execute_Executor")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Executor_Execute_Executor();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.Locus.add_Locus")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Locus_Add_Locus();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.Locus.instantiate_Locus")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Locus_Instantiate_Locus();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.Locus.remove_Locus")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Locus_Remove_Locus();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Loci.SemanticVisitor.initialize_SemanticVisitor")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.ModelConfiguration.main")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_ModelConfiguration_Main();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.doBody_IntegerGreaterFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.new_IntegerGreaterFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.doBody_IntegerLessFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.new_IntegerLessFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.doBody_IntegerPlusFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.new_IntegerPlusFunctionBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution();
		}

		else {
			step = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createGenericSequentialStep();
		}

		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
