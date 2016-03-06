package org.xmof.execution.xdsml.api.extensions.languages;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.executionframework.xdsml_base.LanguageDefinition;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

import xmofxdsml.XMOFLanguageDefiniton;

public class XMOFLanguageDefinitionExtension extends
		LanguageDefinitionExtension {

	private XMOFLanguageDefiniton _languageDefinitionCache;

	public LanguageDefinition getLanguageDefinition() {
		if (_languageDefinitionCache == null) {

			// Loading languagedef model
			ResourceSet rs = new ResourceSetImpl();
			URI uri = URI.createPlatformPluginURI(getXDSMLFilePath(), true);
			Resource res = rs.createResource(uri);
			try {
				res.load(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			EcoreUtil.resolveAll(rs);// IMPORTANT

			if (res != null) {
				EObject first = res.getContents().get(0);

				// Follow-up in other operation...
				if (first instanceof XMOFLanguageDefiniton) {
					_languageDefinitionCache = (XMOFLanguageDefiniton) first;
				}
			}
		}
		return _languageDefinitionCache;
	}
}
