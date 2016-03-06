package xmofxdsml.presentation;

import org.gemoc.executionframework.xdsml_base.AnimatorProject;
import org.gemoc.executionframework.xdsml_base.DomainModelProject;
import org.gemoc.executionframework.xdsml_base.EditorProject;
import org.gemoc.executionframework.xdsml_base.SiriusEditorProject;
import org.gemoc.executionframework.xdsml_base.XTextEditorProject;

import xmofxdsml.XMOFLanguageDefiniton;
import xmofxdsml.util.XDSMLXMOFModelHelper;


public class XmofXDSMLModelWrapper extends ViewModelWrapper{

	public XMOFLanguageDefiniton languageDefinition;
	
	public XmofXDSMLModelWrapper(){
		
	}
	
	public String getLanguageName() {
		if (languageDefinition != null && languageDefinition.getName() != null) {
			return languageDefinition.getName();
		} else
			return "";
	}

	public void setLanguageName(String languageName) {
		firePropertyChange("languageName", getLanguageName(), languageName);
		languageDefinition.setName(languageName);
	}

	public String getDomainModelProjectName() {
		if (languageDefinition != null && languageDefinition.getDomainModelProject() != null
				&& languageDefinition.getDomainModelProject().getProjectName() != null) {
			return languageDefinition.getDomainModelProject().getProjectName();
		} else
			return "";
	}

	public void setDomainModelProjectName(String domainModelProjectName) {
		String oldName = getDomainModelProjectName();
		firePropertyChange("domainModelProjectName", oldName, domainModelProjectName);
		XDSMLXMOFModelHelper.getOrCreateDomainModelProject(languageDefinition).setProjectName(domainModelProjectName);
	}

	public void setGenmodelLocationURI(String genmodel) {
		String oldName = getGenmodelLocationURI();
		firePropertyChange("genmodelLocationURI", oldName, genmodel);
		XDSMLXMOFModelHelper.getOrCreateDomainModelProject(languageDefinition).setGenmodeluri(genmodel);
	}

	public String getGenmodelLocationURI() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null
					&& languageDefinition.getDomainModelProject().getGenmodeluri() != null) {
				return languageDefinition.getDomainModelProject().getGenmodeluri();
			}
		}
		return "";
	}

	public void setRootContainerModelElement(String root) {
		String oldName = getRootContainerModelElement();
		firePropertyChange("rootContainerModelElement", oldName, root);
		(XDSMLXMOFModelHelper.getOrCreateDomainModelProject(languageDefinition)).setDefaultRootEObjectQualifiedName(root);
	}

	public String getRootContainerModelElement() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null) {
				DomainModelProject ecoreProject = (DomainModelProject) languageDefinition.getDomainModelProject();
				return ecoreProject.getDefaultRootEObjectQualifiedName() != null ? ecoreProject
						.getDefaultRootEObjectQualifiedName() : "";
			}
		}
		return "";
	}

	public void setModelLoaderClass(String modelLoaderClass) {
		String oldName = getGenmodelLocationURI();
		firePropertyChange("modelLoaderClass", oldName, modelLoaderClass);
		XDSMLXMOFModelHelper.getOrCreateDomainModelProject(languageDefinition).setModelLoaderClass(modelLoaderClass);
	}

	public String getModelLoaderClass() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null
					&& languageDefinition.getDomainModelProject().getModelLoaderClass() != null) {
				return languageDefinition.getDomainModelProject().getModelLoaderClass();
			}
		}
		return "";
	}

	public String getSupportedFileExtension() {
		StringBuilder sb = new StringBuilder();
		sb.append("Supported file extensions: ");
		int i = 0;
		if (languageDefinition != null) {
			for (String s : languageDefinition.getFileExtensions()) {
	
				if (i > 0) {
					sb.append(", ");
				}
				sb.append(s);
				i++;
			}
		}
		return sb.toString();
	}

	public void setSupportedFileExtension(String supportedFileExtensions) {

	}

	public String getXTextEditorProjectName() {
		if (languageDefinition != null) {
			for (EditorProject editor : languageDefinition.getEditorProjects()) {
				if (editor instanceof XTextEditorProject && editor.getProjectName() != null) {
					return editor.getProjectName();
				}
			}
		}
		return "";
	}

	public void setXTextEditorProjectName(String name) {
		String oldName = getXTextEditorProjectName();
		firePropertyChange("xTextEditorProjectName", oldName, name);
		XDSMLXMOFModelHelper.getOrCreateXTextEditorProject(languageDefinition).setProjectName(name);

	}

	public String getSiriusEditorProjectName() {
		if (languageDefinition != null) {
			for (EditorProject editor : languageDefinition.getEditorProjects()) {
				if (editor instanceof SiriusEditorProject && editor.getProjectName() != null) {
					return editor.getProjectName();
				}
			}
		}
		return "";
	}

	public void setSiriusEditorProjectName(String name) {
		String oldName = getSiriusEditorProjectName();
		firePropertyChange("xSiriusEditorProjectName", oldName, name);
		XDSMLXMOFModelHelper.getOrCreateSiriusEditorProject(languageDefinition).setProjectName(name);
	}

	public String getSiriusAnimatorProjectName() {
		if (languageDefinition != null) {
			for (AnimatorProject editor : languageDefinition.getAnimatorProjects()) {
				return editor.getProjectName();
			}
		}
		return "";
	}

	public void setSiriusAnimatorProjectName(String name) {
		String oldName = getSiriusAnimatorProjectName();
		firePropertyChange("xSiriusAnimatorProjectName", oldName, name);
		XDSMLXMOFModelHelper.getOrCreateSiriusAnimatorProject(languageDefinition).setProjectName(name);
	}
	
	public void setXMOFFile(String xMOFFile){
		String oldName = getXMOFFile();
		firePropertyChange("dSAEntryPoint", oldName, xMOFFile);
		XDSMLXMOFModelHelper.getOrCreateXMOFFile(languageDefinition).setXmofFileName(xMOFFile);
	}

	public String getXMOFFile() {
		if (languageDefinition != null && languageDefinition.getXmofFileName() != null
				&& languageDefinition.getXmofFileName().getXmofFileName() != null) {
			return languageDefinition.getXmofFileName().getXmofFileName();
		} else
			return "";
	}
	
	
}

//class XDSMLModelWrapperHelper{
//	public static void init(XmofXDSMLModelWrapper wrapper, XMOFLanguageDefiniton languageDefinition) {
//		wrapper.languageDefinition=languageDefinition;
//		languageDefinition.eAdapters().add(new EMFEContent(wrapper));
//	}
//}
