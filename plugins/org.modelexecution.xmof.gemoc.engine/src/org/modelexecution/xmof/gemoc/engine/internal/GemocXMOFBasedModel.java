package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public class GemocXMOFBasedModel extends XMOFBasedModel {

	private Set<EPackage> registeredConfigurationMetamodelPackages;
	private Set<EPackage> xmofConfigurationMetamodelPackages;

	public GemocXMOFBasedModel(Collection<EObject> modelElements,
			List<ParameterValue> parameterValues, EditingDomain editingDomain,
			Collection<EPackage> configurationMetamodelPackages) {
		super(modelElements, parameterValues, editingDomain);
		this.xmofConfigurationMetamodelPackages = new LinkedHashSet<EPackage>(
				configurationMetamodelPackages);
		this.registeredConfigurationMetamodelPackages = new LinkedHashSet<EPackage>(
				super.getMetamodelPackages());
	}

	@Override
	public List<EPackage> getMetamodelPackages() {
		return Collections.unmodifiableList(new ArrayList<EPackage>(
				xmofConfigurationMetamodelPackages));
	}

	public List<EPackage> getRegisteredConfigurationMetamodelPackages() {
		return Collections.unmodifiableList(new ArrayList<EPackage>(
				registeredConfigurationMetamodelPackages));
	}

}
