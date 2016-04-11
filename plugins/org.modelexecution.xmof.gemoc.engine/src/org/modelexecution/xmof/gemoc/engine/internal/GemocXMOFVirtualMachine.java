package org.modelexecution.xmof.gemoc.engine.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;

public class GemocXMOFVirtualMachine extends XMOFVirtualMachine {

	public GemocXMOFVirtualMachine(GemocXMOFBasedModel modelToBeExecuted) {
		super(modelToBeExecuted);
	}

	@Override
	protected void initializeInstanceMap() {
		GemocXMOFBasedModel model = (GemocXMOFBasedModel) getModel();
		setInstanceMap(new GemocXMOFInstanceMap(getxMOFConversionResult(),
				model.getModelElements(), getRawExecutionContext().getLocus(),
				model));
	}

	@Override
	protected EClass getObjectType(EObject mainClassObject) {
		EClass registeredEClass = mainClassObject.eClass();
		GemocXMOFInstanceMapBuilder builder = ((GemocXMOFInstanceMap) this
				.getInstanceMap()).getBuilder();
		EClass xmofEClass = builder.getXMOFConfigurationClass(registeredEClass);
		return xmofEClass;
	}

}
