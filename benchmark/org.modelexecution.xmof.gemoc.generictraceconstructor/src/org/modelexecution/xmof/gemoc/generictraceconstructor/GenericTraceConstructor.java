package org.modelexecution.xmof.gemoc.generictraceconstructor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.xmof.states.builder.StatesBuilder;

import fUML.Syntax.Activities.IntermediateActivities.Activity;

public class GenericTraceConstructor extends StatesBuilder {

	// Indicates whether a change has occurred since the last execution step
	private boolean changed = false;

	public GenericTraceConstructor(Resource modelResource) {
		super(modelResource);
	}

	@Override
	protected boolean isNewStateRequired() {
		return false;
	}

	@Override
	protected boolean shouldUpdateState() {
		return false;
	}

	@Override
	public void notifyChanged(Notification notification) {
		changed = true;
		super.notifyChanged(notification);
	}

	@Override
	public void notify(Event event) {
		super.notify(event);

		if (event instanceof ActivityEvent) {
			ActivityEvent activityEvent = (ActivityEvent) event;
			Activity activity = activityEvent.getActivity();
			if (changed && isStep(activity)) {
				String transitionEventQN = activity.qualifiedName
						+ (activityEvent instanceof ActivityEntryEvent ? ".entry" : ".exit");
				org.modelexecution.xmof.states.states.Event transitionEvent = createEvent(transitionEventQN, null);
				addNewState(transitionEvent);
				changed = false;
			}
		}
	}

	private boolean isStep(Activity activity) {
		// TODO Auto-generated method stub
		return true;
	}

}
