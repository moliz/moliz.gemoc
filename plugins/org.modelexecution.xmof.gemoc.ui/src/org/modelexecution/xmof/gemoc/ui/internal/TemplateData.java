package org.modelexecution.xmof.gemoc.ui.internal;

import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

public class TemplateData {
 
  
  private String languageName;
  private String projectName;
  private String packageName;
  private String ecoreModelfilePath;
  private String xmofModelfilePath;

  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String srcPackageName) {
    this.packageName = srcPackageName;
  }

  public String getEcoreModelFilePath() {
    return ecoreModelfilePath;
  }

  public void setEcoreModelFilePath(String ecoreModelFileName) {
    this.ecoreModelfilePath = ecoreModelFileName;
  }

  public String getXmofModelFilePath() {
    return xmofModelfilePath;
  }

  public void setXmofModelFilePath(String xmofModelFileName) {
    this.xmofModelfilePath = xmofModelFileName;
  }

}
