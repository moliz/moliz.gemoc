package xmofxdsml.presentation;

import xmofxdsml.XMOFLanguageDefiniton;





/**
 * This helper is to workaround a strange problem with Windows Builder
 * if a method with non simple type is declared in the XDSMLModelWrapper then the data binding tool doesn't work correctly :-/
 * @author dvojtise
 *
 */
class XMOFXDSMLModelWrapperHelper{
	public static void init(XmofXDSMLModelWrapper wrapper, XMOFLanguageDefiniton languageDefinition) {
		wrapper.languageDefinition=languageDefinition;
		languageDefinition.eAdapters().add(new EMFEContent(wrapper));
	}
}