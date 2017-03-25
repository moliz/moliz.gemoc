package org.modelexecution.xmof.representation.sirius.design.services;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;

public class ActivityDiagramService {

	public String generateLabel(Activity activity) {
		String label = activity.getName();
		if (!label.isEmpty()) {
			char first = Character.toUpperCase(label.charAt(0));
			return first + label.substring(1);
		}
		return computeDefaultName(activity);

	}


	public String generateLabel(ActivityNode node) {
		if (node instanceof Pin) {
			return LabelServices.INSTANCE.computeLabel((Pin) node);
		}
		return node.eClass().getName();
	}

	public String computeDefaultName(EObject element) {
		return LabelServices.INSTANCE.computeDefaultName(element);
	}

	public Activity findParentActivity(EObject context) {
		if (context instanceof Activity) {
			return (Activity) context;
		}

		if (context.eContainer() != null) {
			return findParentActivity((EObject) context.eContainer());
		}

		return null;
	}

}
