package org.xmof.example.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices.StringCouple;

public class Petrinet2DebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("petrinet", "Debug"));

		return res;
	}

}
