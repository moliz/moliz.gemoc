
package org.modelexecution.xmof.examples.fuml.fumlfewsteps.trace.tracemanager;

import java.util.List;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;

public class FumlConfigurationFewStepsTraceStepFactory implements IStepFactory {

	@Override
	public org.eclipse.gemoc.trace.commons.model.trace.Step createStep(
			org.eclipse.gemoc.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		org.eclipse.gemoc.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = org.eclipse.gemoc.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActionActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getActionActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("shouldFireAgain_ActionActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getActionActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActionActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getActionActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_PinActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_PinActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_int_ActivityEdgeInstance")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityEdgeInstance().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityFinalNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getControlNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getForkNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getInitialNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_ActivityNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getActionActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getControlNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getForkNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getInitialNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage.eINSTANCE
						.getPinActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ActivityParameterNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityParameterNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ControlNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getActivityFinalNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getControlNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getForkNodeActivation().getClassifierID()
				|| ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getInitialNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferedTokens_DecisionNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getDecisionNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_ForkNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getForkNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire_InitialNodeActivation")
				&& (ec.getClassifierID() == fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage.eINSTANCE
						.getInitialNodeActivation().getClassifierID()))

		{
			step = fumlConfigurationFewStepsTrace.Steps.StepsFactory.eINSTANCE
					.createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation();
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
