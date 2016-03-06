package xmofxdsml.presentation;

import org.eclipse.emf.common.notify.Notification;
import org.gemoc.executionframework.xdsml_base.DomainModelProject;
import org.gemoc.executionframework.xdsml_base.SiriusAnimatorProject;
import org.gemoc.executionframework.xdsml_base.SiriusEditorProject;
import org.gemoc.executionframework.xdsml_base.XTextEditorProject;

import xmofxdsml.XMFFile;
import xmofxdsml.XMOFLanguageDefiniton;
import xmofxdsml.XmofxdsmlPackage;

/**
   * receive EMF notifications and call the appropriate firePropertyChange for the corresponding property
   *
   */
  class EMFEContent extends org.eclipse.emf.ecore.util.EContentAdapter{
	/**
	 * 
	 */
	private final XmofXDSMLModelWrapper xdsmlModelWrapper;
	/**
	 * @param xdsmlModelWrapper
	 */
	EMFEContent(XmofXDSMLModelWrapper xdsmlModelWrapper) {
		this.xdsmlModelWrapper = xdsmlModelWrapper;
	}

		//override the notifyChanged method
	    public void notifyChanged(Notification n){
	        
	        super.notifyChanged(n); // the superclass handles adding/removing this Adapter to new Books
	        
	        // find out the type of the notifier which could be either 'LanguageDefinition' or 'Library'
	        Object notifier = n.getNotifier();
	        if (notifier instanceof XMOFLanguageDefiniton) {
	            handleLanguageDefinitionNotification(n);
	        } else if (notifier instanceof DomainModelProject) {
	            handleDomainModelProjectNotification(n);
	        } else if (notifier instanceof XTextEditorProject) {
	        	handleXTextProjectNotification(n);
	        } else if (notifier instanceof SiriusEditorProject) {
	        	handleSiriusEditorProjectNotification(n);
	        } else if (notifier instanceof SiriusAnimatorProject) {
	        	handleSiriusAnimatorProjectNotification(n);
	        } else if (notifier instanceof XMFFile) {
	            handleXMOFFileNotification(n);
	        }
	        
	        
	    }

		private void handleLanguageDefinitionNotification(Notification n) {
			int featureID = n.getFeatureID(XMOFLanguageDefiniton.class);
	        if (featureID == XmofxdsmlPackage.XMOF_LANGUAGE_DEFINITON__NAME){
	        		String oldLanguageName = n.getOldStringValue();
	        		String newLanguageName = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("languageName", oldLanguageName, newLanguageName);
	        }
		}
		private void handleDomainModelProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.executionframework.xdsml_base.DomainModelProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("domainModelProjectName", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__GENMODELURI){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("genmodelLocationURI", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__DEFAULT_ROOT_EOBJECT_QUALIFIED_NAME){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("rootContainerModelElement", oldValue, newValue);
	        }

	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__MODEL_LOADER_CLASS){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("modelLoaderClass", oldValue, newValue);
	        }
		}
		

		private void handleXTextProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.executionframework.xdsml_base.XTextEditorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.XTEXT_EDITOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("XTextEditorProjectName", oldValue, newValue);
	        }
		}
		private void handleSiriusEditorProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.executionframework.xdsml_base.EditorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.SIRIUS_EDITOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("siriusEditorProjectName", oldValue, newValue);
	        }
		}
		private void handleSiriusAnimatorProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.executionframework.xdsml_base.AnimatorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.SIRIUS_ANIMATOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("siriusAnimatorProjectName", oldValue, newValue);
	        }
		}
		
		private void handleXMOFFileNotification(Notification n) {
			int featureID = n.getFeatureID(XMFFile.class);
	        if (featureID == XmofxdsmlPackage.XMF_FILE__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("XMOFProjectName", oldValue, newValue);
	        }
	        if (featureID == XmofxdsmlPackage.XMF_FILE__XMOF_FILE_NAME){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("XMOFFileName", oldValue, newValue);
	        }
	        
		}
		
  }