package org.modelexecution.xmof.examples.petrinet2.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

public class Petrinet2AnimationServices extends AbstractGemocAnimatorServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Petrinet2Diagram", "Default"));

		return res;
	}

}
