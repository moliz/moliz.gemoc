package org.modelexecution.xmof.representation.sirius.design.services;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallAction;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InvocationAction;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Actions.CompleteActions.AcceptEventAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.LinkAction;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class LabelServices {
	public static final LabelServices INSTANCE = new LabelServices();

	private LabelServices() {

	}

	public String computeDefaultName(final EObject element) {

		Predicate<EObject> predicate = null;
		String name = element.getClass().getSimpleName();
		name = name.substring(0, name.indexOf("Impl"));
		predicate = new Predicate<EObject>() {
			public boolean apply(EObject input) {
				return input.getClass().getName().equals(element.getClass().getName());
			}
		};
		final List<EObject> existingElements = Lists
				.newArrayList(Iterables.filter(element.eContainer().eContents(), predicate));

		return name + existingElements.size();
	}

	public String computeLabel(final Pin pin) {
		if (pin.eContainer() == null)
			return "";
		if (pin instanceof InputPin) {
			if (pin.eContainer() instanceof LinkAction) {
				return computeInputPinLabel("inputValue", ((LinkAction) pin.eContainer()).getInputValue());
			} else if (pin.eContainer() instanceof InvocationAction) {
				return computeInputPinLabel("argument", ((InvocationAction) pin.eContainer()).getArgument());
			} else if (pin.eContainer() instanceof StructuredActivityNode) {
				return computeInputPinLabel("input",
						((StructuredActivityNode) pin.eContainer()).getStructuredNodeInput());
			}
		} else if (pin instanceof OutputPin) {
			if (pin.eContainer() instanceof CallAction) {
				return computeOutputPinLabel("result", ((CallAction) pin.eContainer()).getResult());
			} else if (pin.eContainer() instanceof AcceptEventAction) {
				return computeOutputPinLabel("result", ((AcceptEventAction) pin.eContainer()).getResult());
			} else if (pin.eContainer() instanceof StructuredActivityNode) {
				return computeOutputPinLabel("result",
						((StructuredActivityNode) pin.eContainer()).getStructuredNodeOutput());
			}
		}
		return "";
	}

	private String computeInputPinLabel(String prefix, EList<InputPin> pins) {
		String label = prefix;
		if (pins != null) {
			label += pins.size();
		}
		return label;
	}

	private String computeOutputPinLabel(String prefix, EList<OutputPin> pins) {
		String label = prefix;
		if (pins != null) {
			label += pins.size();
		}
		return label;
	}
}
