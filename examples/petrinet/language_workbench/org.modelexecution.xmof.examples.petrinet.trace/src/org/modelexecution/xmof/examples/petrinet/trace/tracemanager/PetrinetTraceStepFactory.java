
package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class PetrinetTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(fr.inria.diverse.trace.commons.model.trace.MSE mse,
			List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		fr.inria.diverse.trace.commons.model.trace.Step step = null;

		if (stepRule.equalsIgnoreCase("petrinetConfiguration.NetConfiguration.run")) {
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinetConfiguration_NetConfiguration_Run();
		} else

		if (stepRule.equalsIgnoreCase("petrinetConfiguration.TransitionConfiguration.fire")) {
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_TransitionConfiguration_Fire();
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
