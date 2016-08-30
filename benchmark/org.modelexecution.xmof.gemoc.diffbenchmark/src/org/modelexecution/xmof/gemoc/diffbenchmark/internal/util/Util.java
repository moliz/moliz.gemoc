package org.modelexecution.xmof.gemoc.diffbenchmark.internal.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class Util {

	public static Resource loadResource(ResourceSet resourceSet, String filePath) {
		URI uri = null;
		if (filePath.contains("platform:/plugin/")) {
			uri = EMFUtil.createPlatformPluginURI(filePath.replaceAll(
					"platform:/plugin", ""));
		} else if (filePath.contains("platform:/resource/")) {
			uri = EMFUtil.createPlatformResourceURI(filePath.replaceAll(
					"platform:/resource", ""));
		} else {
			uri = EMFUtil.createFileURI(filePath);
		}
		return EMFUtil.loadResource(resourceSet, uri);
	}

}
