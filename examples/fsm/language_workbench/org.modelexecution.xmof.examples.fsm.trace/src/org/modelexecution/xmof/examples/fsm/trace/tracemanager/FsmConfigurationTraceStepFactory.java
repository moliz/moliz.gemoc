
package org.modelexecution.xmof.examples.fsm.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class FsmConfigurationTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step<?> createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step<?> step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("run")
				&& (ec.getClassifierID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE.getFSMConfiguration()
						.getClassifierID()))

		{
			step = fsmConfigurationTrace.Steps.StepsFactory.eINSTANCE.createFsmConfiguration_FSMConfiguration_Run();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == fsmConfiguration.FsmConfigurationPackage.eINSTANCE
						.getTransitionConfiguration().getClassifierID()))

		{
			step = fsmConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createFsmConfiguration_TransitionConfiguration_Fire();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.generictrace.GenerictraceFactory.eINSTANCE
					.createGenericSequentialStep();
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
