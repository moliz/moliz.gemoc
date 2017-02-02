
package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class PetrinetConfigurationTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("main")
				&& (ec.getClassifierID() == petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE
						.getNetConfiguration().getClassifierID()))

		{
			step = petrinetConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_NetConfiguration_Main();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("run")
				&& (ec.getClassifierID() == petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE
						.getNetConfiguration().getClassifierID()))

		{
			step = petrinetConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_NetConfiguration_Run();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE
						.getTransitionConfiguration().getClassifierID()))

		{
			step = petrinetConfigurationTrace.Steps.StepsFactory.eINSTANCE
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
