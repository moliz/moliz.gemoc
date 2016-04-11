package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.xmof.vm.XMOFInstanceMap;

import fUML.Semantics.Loci.LociL1.Locus;

public class GemocXMOFInstanceMap extends XMOFInstanceMap {

	public GemocXMOFInstanceMap(IConversionResult result,
			List<EObject> modelElements, Locus locus, GemocXMOFBasedModel model) {
		setInstanceMapBuilder(new GemocXMOFInstanceMapBuilder(model
				.getRegisteredConfigurationMetamodelPackages().get(0), model
				.getMetamodelPackages().get(0), this));
		getInstanceMapBuilder().build(result, modelElements, locus);
	}

	public GemocXMOFInstanceMapBuilder getBuilder() {
		return (GemocXMOFInstanceMapBuilder) getInstanceMapBuilder();
	}
}
