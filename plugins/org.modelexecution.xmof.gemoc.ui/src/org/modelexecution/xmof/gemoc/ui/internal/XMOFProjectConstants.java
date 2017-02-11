/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.ui.internal;

import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

public class XMOFProjectConstants {

  public static final String PLUGIN_VERSION = "1.0.0.qualifer";
  public static final String PLUGIN_NAME = "%pluginName";
  public static final String PLUGIN_VENDOR = "%providerName";
  public static final String XMOF_FILE_FOLDER = "xmof";
  public static final String XMOF_FILE_EXTENSION = ".xmof";
  public static final String PREFRENCES_FILE_NAME = "pref.properties";
  public static final String DEFAULT_XMOF_PROJECT_SUFFIX = ".xmof.dynamic";
  public static final String DEFAULT_XDSML_SUFFIX = ".xdsml";
  public static final String DEFAULT_PROJECT_NAME = "org.company.example"
      + DEFAULT_XMOF_PROJECT_SUFFIX;
  public static final String DEFAULT_LANGUAGE_NAME = "ExampleLanguage";

  public static final String KEY_LANGUAGE_NAME = "languageName";
  public static final String KEY_PROJECT_NAME = "projectName";
  public static final String KEY_PACKAGE_NAME = XMOFSequentialTemplate.KEY_PACKAGE_NAME;
  public static final String KEY_ECOREMODEL_FILE_PATH = XMOFSequentialTemplate.KEY_ECOREFILE_PATH;
  public static final String KEY_XMOFMODEL_FILE_PATH = XMOFSequentialTemplate.KEY_XMOFFILE_PATH;

  private XMOFProjectConstants() {
  }

}
