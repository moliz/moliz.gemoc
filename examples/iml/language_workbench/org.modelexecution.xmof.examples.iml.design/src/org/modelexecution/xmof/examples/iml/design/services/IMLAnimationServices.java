package org.modelexecution.xmof.examples.iml.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

public class IMLAnimationServices extends AbstractGemocAnimatorServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("IMLDiagram", "Animation"));
		res.add(new StringCouple("IMLDiagram", "Default"));

		return res;
	}

}
