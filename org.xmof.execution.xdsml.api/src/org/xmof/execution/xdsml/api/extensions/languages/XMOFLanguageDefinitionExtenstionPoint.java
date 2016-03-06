package org.xmof.execution.xdsml.api.extensions.languages;

import java.util.Collection;

import org.gemoc.xdsmlframework.api.extensions.ExtensionPoint;

public class XMOFLanguageDefinitionExtenstionPoint extends ExtensionPoint<XMOFLanguageDefinitionExtension>{

	public static final String GEMOC_XMOF_LANGUAGE_EXTENSION_POINT = "org.xmof.xdsml";
	
	protected XMOFLanguageDefinitionExtenstionPoint()
	{
		super(XMOFLanguageDefinitionExtension.class);
	}

	private static XMOFLanguageDefinitionExtenstionPoint _singleton;
	
	private static XMOFLanguageDefinitionExtenstionPoint getExtensionPoint()
	{
		if (_singleton == null)
		{
			_singleton = new XMOFLanguageDefinitionExtenstionPoint();
		}
		return _singleton;
	}
		
	static public Collection<XMOFLanguageDefinitionExtension> getSpecifications() 
	{
		return getExtensionPoint().internal_getSpecifications();
	}
	
	static public XMOFLanguageDefinitionExtension findDefinition(String languageName)
	{
		for (XMOFLanguageDefinitionExtension extension : getSpecifications())
		{
			if (extension.getName().equals(languageName))
			{
				return extension;
			}
		}
		return null;
	}
	
	@Override
	protected String getExtensionPointName() {
		return GEMOC_XMOF_LANGUAGE_EXTENSION_POINT;
	}

}
