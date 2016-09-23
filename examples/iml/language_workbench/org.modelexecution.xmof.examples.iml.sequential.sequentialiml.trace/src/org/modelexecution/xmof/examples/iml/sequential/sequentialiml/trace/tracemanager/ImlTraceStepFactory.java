
package org.modelexecution.xmof.examples.iml.sequential.sequentialiml.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ImlTraceStepFactory implements IStepFactory {

	@SuppressWarnings("unused")
	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("doExecute")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getActivity().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_Activity_DoExecute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getHeader().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_Header_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doFire")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getSelectionConvergence().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SelectionConvergence_DoFire();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doFire")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getSelectionDivergence().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SelectionDivergence_DoFire();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doFire")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getSimultaneousConvergence().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SimultaneousConvergence_DoFire();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doFire")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getSimultaneousDivergence().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_SimultaneousDivergence_DoFire();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("activate")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getState().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_State_Activate();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("deactivate")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getState().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_State_Deactivate();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("executeActivities")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getState().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_State_ExecuteActivities();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("doFire")
				&& (ec.getClassifierID() == org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE
						.getStateTransition().getClassifierID()))

		{
			step = imlTrace.Steps.StepsFactory.eINSTANCE.createIml_StateTransition_DoFire();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
