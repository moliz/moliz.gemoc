
package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class UmlTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.Step createStep(org.gemoc.executionframework.engine.mse.MSE mse,
			List<Object> parameters, List<Object> result) {

		EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.Step step = null;

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.createNodeActivations_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.createNodeActivations_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.doAction_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.doAction_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.fire_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.fire_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getPinActivation_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getPinActivation_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.hasOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.hasOffers_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.inisitalize_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.inisitalize_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.isReady_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.isReady_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.putToken_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.putToken_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.putTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.putTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.sendOffers_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.sendOffers_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.shouldFireAgain_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.shouldFireAgain_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.takeOfferedTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.takeOfferedTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.takeTokens_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.takeTokens_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.terminate_ActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.terminate_ActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.collectOutputParameterValues_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.collectOutputParameterValues_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.doAction_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.doAction_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.getCallExecution_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getCallExecution_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.initializeInputParameterValues_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.initializeInputParameterValues_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.removeCallExecution_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.removeCallExecution_CallActionActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.CallActionActivation.terminate_CallActionActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.terminate_CallActionActivation")) {
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

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.InputPinActivation.fire_PinActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.fire_PinActivation")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.PinActivation.fire_PinActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.InputPinActivation.takeOfferedTokens_PinActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.takeOfferedTokens_PinActivation")
				|| stepRule.equalsIgnoreCase(
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
				"fumlConfiguration.Actions.BasicActions.ActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.addToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.addToken_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.addTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.addTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.clearTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.clearTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.createEdgeInstances_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.createEdgeInstances_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.createNodeActivations_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.createNodeActivations_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.fire_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.fire_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getActivityExecution_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getActivityExecution_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getExecutionContext_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getExecutionContext_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getExecutionLocus_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getExecutionLocus_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getNodeActivation_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getNodeActivation_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.getTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.getTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.hasOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.hasOffers_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.initialize_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.initialize_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.isReady_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.isReady_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.isRunning_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.isRunning_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.isSourceFor_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.isSourceFor_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.receiveOffer_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.receiveOffer_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.removeToken_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.removeToken_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.run_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.run_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.sendOffers_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.sendOffers_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.takeOfferedTokens_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.takeOfferedTokens_ActivityNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Actions.BasicActions.ActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.terminate_ActivityNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.terminate_ActivityNodeActivation")) {
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
				"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.fire_ControlNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.fire_ControlNodeActivation")) {
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
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.addToken_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.addToken_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.addToken_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.addToken_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.addToken_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.clearTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.clearTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.clearTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.clearTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.clearTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.countOfferedValues_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.countOfferedValues_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.countOfferedValues_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.countOfferedValues_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.countOfferedValues_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.countUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.countUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.countUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.countUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.countUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.getUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.getUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.getUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.getUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.getUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.initialize_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.initialize_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.initialize_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.initialize_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.initialize_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.sendOffers_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.sendOffers_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.sendOffers_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.sendOffers_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.sendOffers_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.sendUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.sendUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.sendUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.sendUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.sendUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.takeUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.takeUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.takeUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.takeUnofferedTokens_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.takeUnofferedTokens_ObjectNodeActivation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.terminate_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.terminate_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.terminate_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.terminate_ObjectNodeActivation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.terminate_ObjectNodeActivation")) {
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

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ControlToken.getValue_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.getValue_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.getValue_Token")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.getValue_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ControlToken.isControl_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.isControl_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.isControl_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.Token.isControl_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ControlToken.isWithdrawn_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.isWithdrawn_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.isWithdrawn_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.Token.isWithdrawn_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ControlToken.transfer_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.transfer_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.transfer_Token")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.transfer_Token")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ControlToken.withdraw_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkedToken.withdraw_Token")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectToken.withdraw_Token")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.Token.withdraw_Token")) {
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

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.copy_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.copy_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.CompoundValue.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.ExtensionalValue.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.getFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getFeatureValue_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.CompoundValue.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.ExtensionalValue.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.setFeatureValue_CompoundValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.setFeatureValue_CompoundValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Evaluation.evaluate_Evaluation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation.evaluate_Evaluation")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.LiteralEvaluation.evaluate_Evaluation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation.evaluate_Evaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.copy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.copy_ExtensionalValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.destroy_ExtensionalValue")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.destroy_ExtensionalValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.destroy_ExtensionalValue")) {
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

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation.getType_LiteralEvaluation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralEvaluation.getType_LiteralEvaluation")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation.getType_LiteralEvaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation.evaluate_LiteralIntegerEvaluation")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.copy_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.copy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.copy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.copy_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.copy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.copy_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_Copy_Object();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.destroy_Object")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.destroy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.destroy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.destroy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.destroy_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.destroy_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.destroy_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_Destroy_Object();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getTypes_Object")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getTypes_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getTypes_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getTypes_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getTypes_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.getTypes_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getTypes_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_GetTypes_Object();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.new_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.new_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.new_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.new_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.new_Object")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.new_Object")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.new_Object")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Object_New_Object();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.copy_PrimitiveValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.copy_PrimitiveValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.copy_PrimitiveValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.getTypes_PrimitiveValue")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.getTypes_PrimitiveValue")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.getTypes_PrimitiveValue")) {
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
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.CompoundValue.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.ExtensionalValue.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.createFeatureValues_StructuredValue")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.Reference.createFeatureValues_StructuredValue")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.StructuredValue.createFeatureValues_StructuredValue")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.copy_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.copy_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.copy_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.copy_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.copy_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.copy_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_Copy_Value();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.equals_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.equals_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.equals_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.equals_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.equals_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.equals_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_Equals_Value();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.getTypes_Value")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.getTypes_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getTypes_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getTypes_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.getTypes_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.getTypes_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.getTypes_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_GetTypes_Value();
		} else

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.hasType_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.hasType_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.hasType_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.hasType_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.hasType_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.hasType_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_HasType_Value();
		} else

		if (stepRule.equalsIgnoreCase("fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.ExtensionalValue.new_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.new_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.new_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.new_Value")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.new_Value")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.new_Value")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Classes_Kernel_Value_New_Value();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.copy_Execution")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.copy_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.copy_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.copy_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.copy_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.copy_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.execute_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.execute_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.execute_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.execute_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.execute_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.execute_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getBehavior_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getBehavior_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getBehavior_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getBehavior_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getBehavior_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getBehavior_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getOutputParameterValues_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getOutputParameterValues_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getOutputParameterValues_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getOutputParameterValues_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getOutputParameterValues_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getOutputParameterValues_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.getParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.getParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.getParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.getParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.getParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.getParameterValue_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.setParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.setParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.setParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.setParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.setParameterValue_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.setParameterValue_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.terminate_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.terminate_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.terminate_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.terminate_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.terminate_Execution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.terminate_Execution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.doBody_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.doBody_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.doBody_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.doBody_OpaqueBehaviorExecution")) {
			step = umlTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution();
		} else

		if (stepRule.equalsIgnoreCase(
				"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.execute_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.execute_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.execute_OpaqueBehaviorExecution")
				|| stepRule.equalsIgnoreCase(
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

		if (stepRule
				.equalsIgnoreCase("fumlConfiguration.Actions.BasicActions.ActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityExecution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityFinalNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.AddStructuralFeatureValueActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.BooleanValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation.initialize_SemanticVisitor")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.CompoundValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ControlNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.CreateObjectActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Evaluation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.ExtensionalValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ForkNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.InitialNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InputPinActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerGreaterFunctionBehaviorExecution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerLessFunctionBehaviorExecution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerPlusFunctionBehaviorExecution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.IntegerValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.InvocationActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.JoinNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralEvaluation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.MergeNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Object.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OpaqueActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.OutputPinActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.BasicActions.PinActivation.initialize_SemanticVisitor")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.PrimitiveValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Reference.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Loci.SemanticVisitor.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.StructuralFeatureActionActivation.initialize_SemanticVisitor")
				|| stepRule
						.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.StructuredValue.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase("fumlConfiguration.Classes.Kernel.Value.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.ValueSpecificationActionActivation.initialize_SemanticVisitor")
				|| stepRule.equalsIgnoreCase(
						"fumlConfiguration.Actions.IntermediateActions.WriteStructuralFeatureActionActivation.initialize_SemanticVisitor")) {
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
