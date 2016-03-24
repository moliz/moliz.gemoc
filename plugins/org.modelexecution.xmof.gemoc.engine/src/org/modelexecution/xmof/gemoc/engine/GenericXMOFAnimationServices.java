package org.modelexecution.xmof.gemoc.engine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;

public class GenericXMOFAnimationServices {

	private static ConfigurationObjectMap configurationMap;

	public static void setConfigurationObjectMap(
			ConfigurationObjectMap configurationMap) {
		GenericXMOFAnimationServices.configurationMap = configurationMap;
	}

	private static Object getByString(EObject o, String prop) {
		EStructuralFeature f = o.eClass().getEStructuralFeature(prop);
		Object value = o.eGet(f);
		return value;
	}

	public static EObject getConfObject(EObject o) {
		if (configurationMap != null)
			return configurationMap.getConfigurationObject(o);
		else
			return null;
	}

	public static Integer getConfObjectInteger(EObject o, String property) {
		if (configurationMap != null) {
			EObject confObject = configurationMap.getConfigurationObject(o);
			if (confObject != null)
				return (Integer) getByString(confObject, property);
		}
		return -1;
	}
}
