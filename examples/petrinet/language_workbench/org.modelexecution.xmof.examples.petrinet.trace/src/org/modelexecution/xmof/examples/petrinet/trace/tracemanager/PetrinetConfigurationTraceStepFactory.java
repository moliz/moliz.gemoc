
package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.List;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;

public class PetrinetConfigurationTraceStepFactory implements IStepFactory {

	@Override
	public org.eclipse.gemoc.trace.commons.model.trace.Step createStep(
			org.eclipse.gemoc.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		org.eclipse.gemoc.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = org.eclipse.gemoc.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
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
