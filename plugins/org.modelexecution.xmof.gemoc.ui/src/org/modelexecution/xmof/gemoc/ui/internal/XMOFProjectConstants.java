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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

public class XMOFProjectConstants {

  public static final String PLUGIN_VERSION = "1.0.0.qualifer";
  public static final String PLUGIN_NAME = "%pluginName";
  public static final String PLUGIN_VENDOR = "%providerName";
  public static final String XMOF_FILE_FOLDER = "xmof";
  public static final String XMOF_FILE_EXTENSION = ".xmof";
  public static final String DEFAULT_XMOF_PROJECT_SUFFIX = ".xmof.dynamic";
  public static final String DEFAULT_XDSML_SUFFIX = ".xdsml";
  public static final String DEFAULT_PROJECT_NAME = "org.company.example"
      + DEFAULT_XMOF_PROJECT_SUFFIX;
  public static final String DEFAULT_LANGUAGE_NAME = "ExampleLanguage";

  public static final String XMOF_PROPERTIES_NAME = "xmof.properties";

  public static final String KEY_ECOREMODEL_FILE_PATH = XMOFSequentialTemplate.KEY_ECOREFILE_PATH;
  public static final Object KEY_PACAKGE_NAME = XMOFSequentialTemplate.KEY_PACKAGE_NAME;
  public static final String KEY_XDSMLPROJECT_NAME = "xdsmlProject";

  private XMOFProjectConstants() {
  }

  //Strings which are keywords of the melange xtext grammar and therefore can cause errors when used in literals (e.g. package name)
  public static final Set<String> RESERVED_MELANGE_KEYWORDS = new HashSet<String>(
      Arrays.asList("package", "language", "inherits", "implements", "requires", "resource",
          "xtext", "sirius", "ecl", "xmof", "fileExtension", "uri", "exactType", "setup", "Melange",
          "Xtext", "EMF", "modeltype", "syntax", "merge", "renaming", "slice", "on", "with",
          "withGenmodel", "to", "map", "@Main", "transformation"));

}
