package org.modelexecution.xmof.examples.fsm.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

import fsm.FSM;
import fsmConfiguration.FSMConfiguration;

public class FsmdiagramAnimationServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("FSMDiagram", "Animation"));

		return res;
	}
	
	public String getAcceptedString(EObject object){
		String result="";
		if (object instanceof FSMConfiguration){
			for (String s : ((FSMConfiguration) object).getAcceptedSequence()) {
				result = s + result;
			}
		}
		return result;
	}
	

	public String getProducedString(EObject object){
		String result="";
		if (object instanceof FSMConfiguration){
			for (String s : ((FSMConfiguration) object).getProducedSequence()) {
				result = s + result;
			}
		}
		return result;
	}
	

}
