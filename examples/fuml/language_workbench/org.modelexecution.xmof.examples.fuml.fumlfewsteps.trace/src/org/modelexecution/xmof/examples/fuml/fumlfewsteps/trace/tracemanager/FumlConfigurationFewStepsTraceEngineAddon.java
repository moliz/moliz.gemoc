package org.modelexecution.xmof.examples.fuml.fumlfewsteps.trace.tracemanager;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class FumlConfigurationFewStepsTraceEngineAddon extends AbstractTraceAddon {

	private FumlConfigurationFewStepsTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new FumlConfigurationFewStepsTraceConstructor(modelResource, traceResource, exeToTraced);
	}


	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		return new ITraceExplorer() {

			@Override
			public void notifyListeners() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addListener(ITraceListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeListener(ITraceListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void update() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public StateWrapper getStateWrapper(int stateIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<StateWrapper> getStateWrappers(int startStateIndex, int endStateIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int startStateIndex, int endStateIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public StepWrapper getStepWrapper(Step step) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<? extends Step> getStepsForStates(int startingState, int endingState) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Step getCurrentForwardStep() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Step getCurrentBackwardStep() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Step getCurrentBigStep() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getNumberOfTraces() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getStatesTraceLength() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getValuesTraceLength(int traceIndex) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getCurrentStateIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public String getValueLabel(int traceIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getValueAt(int traceIndex, int indexInTrace) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getStateDescription(int stateIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getValueDescription(int traceIndex, int stateIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public LaunchConfiguration getLaunchConfiguration() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void jump(EObject o) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void jump(int i) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void loadLastState() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean stepInto() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stepOver() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stepReturn() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean canStepBackInto() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean canStepBackOver() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean canStepBackOut() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stepBackInto() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stepBackOver() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean stepBackOut() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void stepValue(int traceIndex) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void backValue(int traceIndex) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean canStepValue(int traceIndex) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean canBackValue(int traceIndex) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isInReplayMode() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public List<Step> getCallStack() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void updateCallStack(Step step) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		
		return this.loadTrace(null);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new FumlConfigurationFewStepsTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof fumlConfigurationFewStepsTrace.SpecificTrace;
	}

}