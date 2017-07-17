
package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.List;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;

public class FumlConfigurationTraceStepFactory implements IStepFactory {

	@Override
	public org.eclipse.gemoc.trace.commons.model.trace.Step createStep(
			org.eclipse.gemoc.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		org.eclipse.gemoc.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = org.eclipse.gemoc.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("createNodeActivations_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getPinActivation_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasOffers_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("inisitalize_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isReady_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("putToken_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("putTokens_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffers_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("shouldFireAgain_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeTokens_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_ActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("collectOutputParameterValues_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getCallExecution_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initializeInputParameterValues_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeCallExecution_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_CallActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getCallExecution_CallBehaviorActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getCallBehaviorActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isReady_InputPinActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getInputPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("receiveOffer_InputPinActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getInputPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_OpaqueAction")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getOpaqueActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_PinActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_PinActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_AddStructuralFeatureValueActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
						.getAddStructuralFeatureValueActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_CreateObjectActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
						.getCreateObjectActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_ReadStructuralFeatureActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
						.getReadStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doAction_ValueSpecificationActionActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
						.getValueSpecificationActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("countOfferedValues_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasOffer_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffer_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_int_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("collectOutputParameterValues_ActivityExecution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute_ActivityExecution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setParameterValueValues_ActivityExecution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_ActivityExecution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityFinalNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addToken_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addTokens_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("clearTokens_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createEdgeInstances_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createNodeActivations_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getActivityExecution_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getExecutionContext_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getExecutionLocus_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getNodeActivation_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getTokens_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasOffers_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isReady_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isRunning_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isSourceFor_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("receiveOffer_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeToken_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("run_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffers_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("activate_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("checkIncomingEdges_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createEdgeInstances_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createNodeActivation_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createNodeActivations_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getActivityExecution_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getInitiallyEnabledNodeActivations_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getNodeActivation_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getOutputParameterNodeActivations_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getSourceActivations_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("runNodes_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("run_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminateAll_ActivityNodeActivationGroup")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityNodeActivationGroup().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("clearTokens_ActivityParameterNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityParameterNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ControlNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isControl_ControlToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("determineOfferedTokens_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("executeDecisionInputBehavior_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getDecisionInputFlowInstance_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getDecisionInputFlowValue_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getDecisionValues_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasObjectFlowInput_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isReady_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeJoinedControlTokens_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("test_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ForkNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getForkNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getValue_ForkedToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getForkedToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize_ForkedToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getForkedToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isControl_ForkedToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getForkedToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("withdraw_ForkedToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getForkedToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_InitialNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getInitialNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isReady_JoinNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getJoinNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addToken_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("clearTokens_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("countOfferedValues_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("countUnofferedTokens_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getUnofferedTokens_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffers_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendUnofferedTokens_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeUnofferedTokens_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_ObjectNodeActivation")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getValue_ObjectToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getObjectToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isControl_ObjectToken")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getObjectToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("countOfferedValues_Offer")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getOffer().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getOfferedTokens_Offer")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getOffer().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasTokens_Offer")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getOffer().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeWithdrawnTokens_Offer")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getOffer().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getValue_Token")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isControl_Token")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("isWithdrawn_Token")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("transfer_Token")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("withdraw_Token")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getControlToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_BooleanValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getBooleanValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("equals_BooleanValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getBooleanValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_BooleanValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getBooleanValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_CompoundValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getFeatureValue_CompoundValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setFeatureValue_CompoundValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("evaluate_Evaluation")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getEvaluation()
						.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralBooleanEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralIntegerEvaluation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_ExtensionalValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("destroy_ExtensionalValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_FeatureValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getFeatureValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_IntegerValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getIntegerValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("equals_IntegerValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getIntegerValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_IntegerValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getIntegerValue()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("evaluate_LiteralBooleanEvaluation")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
						.getLiteralBooleanEvaluation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getType_LiteralEvaluation")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
						.getLiteralBooleanEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralIntegerEvaluation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("evaluate_LiteralIntegerEvaluation")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
						.getLiteralIntegerEvaluation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_Object")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_Copy_Object();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("destroy_Object")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_Destroy_Object();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getTypes_Object")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_GetTypes_Object();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_Object")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Object_New_Object();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_PrimitiveValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getBooleanValue()
						.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getTypes_PrimitiveValue")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getBooleanValue()
						.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getFeatureValue_Reference")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getReference()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setFeatureValue_Reference")
				&& (ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getReference()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createFeatureValues_StructuredValue")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_Value")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_Copy_Value();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("equals_Value")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_Equals_Value();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getTypes_Value")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_GetTypes_Value();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("hasType_Value")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_HasType_Value();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_Value")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Classes_Kernel_Value_New_Value();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getBehavior_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getOutputParameterValues_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getParameterValue_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setParameterValue_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate_Execution")
				&& (ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
						.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doBody_OpaqueBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute_OpaqueBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("copy_ParameterValue")
				&& (ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
						.getParameterValue().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createEvaluation_ExecutionFactory")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutionFactory()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("createExecution_ExecutionFactory")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutionFactory()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("getBuiltInType_ExecutionFactory")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutionFactory()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("instantiateOpaqueBehaviorExecution_ExecutionFactory")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutionFactory()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("instantiateVisitor_ExecutionFactory")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutionFactory()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("evaluate_Executor") && (ec
				.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutor().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Executor_Evaluate_Executor();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute_Executor") && (ec
				.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getExecutor().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Executor_Execute_Executor();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("add_Locus")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE.createFumlConfiguration_Loci_Locus_Add_Locus();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("instantiate_Locus")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Locus_Instantiate_Locus();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("remove_Locus")
				&& (ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_Locus_Remove_Locus();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize_SemanticVisitor")
				&& (ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityFinalNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityParameterNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getAddStructuralFeatureValueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getCallBehaviorActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getControlNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getCreateObjectActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getDecisionNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getInitialNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerLessFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
								.getIntegerPlusFunctionBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getInvocationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getJoinNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralBooleanEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getLiteralIntegerEvaluation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getMergeNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getObject()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectNodeActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOpaqueActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getOpaqueBehaviorExecution().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getOutputPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.BasicActions.BasicActionsPackage.eINSTANCE
								.getPinActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getReadStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getSemanticVisitor()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getStructuralFeatureActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getStructuredValue().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE.getValue()
								.getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getValueSpecificationActionActivation().getClassifierID()
						|| ec.getClassifierID() == fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage.eINSTANCE
								.getWriteStructuralFeatureActionActivation().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("main")
				&& (ec.getClassifierID() == fumlConfiguration.FumlConfigurationPackage.eINSTANCE.getModelConfiguration()
						.getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_ModelConfiguration_Main();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doBody_IntegerGreaterFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_IntegerGreaterFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerGreaterFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doBody_IntegerLessFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerLessFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_IntegerLessFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerLessFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doBody_IntegerPlusFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerPlusFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("new_IntegerPlusFunctionBehaviorExecution")
				&& (ec.getClassifierID() == fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage.eINSTANCE
						.getIntegerPlusFunctionBehaviorExecution().getClassifierID()))

		{
			step = fumlConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution();
		}

		else {
			step = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence mseocc = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
