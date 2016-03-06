package xmofxdsml.util;

import org.gemoc.executionframework.xdsml_base.util.XDSMLBaseModelHelper;

import xmofxdsml.XMFFile;
import xmofxdsml.XMOFLanguageDefiniton;
import xmofxdsml.XmofxdsmlFactory;

public class XDSMLXMOFModelHelper extends XDSMLBaseModelHelper{
	
	public static XMFFile getOrCreateXMOFFile(XMOFLanguageDefiniton languageDefinition){
		if( languageDefinition.getXmofFileName() == null) {
			languageDefinition.setXmofFileName(XmofxdsmlFactory.eINSTANCE.createXMFFile());
		}
		return languageDefinition.getXmofFileName();
	}

}
