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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Provides utility methods associated with generation of xMOF projects artifacts.
 *
 */
public class XMOFProjectUtil {

  private XMOFProjectUtil() {
  }

  /**
   * Retrieves the name of the corresponding xDSML project from a given xMOF project name.
   * 
   * @param xmofProjectName
   *          name of the xMOF project
   * @return name of corresponding xDSML project
   */
  public static String getXDSMLProjectName(String xmofProjectName) {
    if (xmofProjectName.endsWith(XMOFProjectConstants.DEFAULT_XMOF_PROJECT_SUFFIX)) {
      xmofProjectName = xmofProjectName.replace(XMOFProjectConstants.DEFAULT_XMOF_PROJECT_SUFFIX,
          "");
    }
    return xmofProjectName.concat(XMOFProjectConstants.DEFAULT_XDSML_SUFFIX);
  }

  /**
   * Retrieves the name of the package containing the language definition (melange-file) for an
   * (xMOF) xDSML project.
   * 
   * Note: The melange file may gets corrupted if the package name contains reserved melange
   * keywords => conflicting subpackages get cleaned( removed) => resultig packagename may differ
   * from project name
   * 
   * @param xdsmlProjectName
   *          name of the xDSML project
   * @return cleaned up melange package name
   */
  public static String getMelangePackageName(String xdsmlProjectName) {
    if (xdsmlProjectName.endsWith(XMOFProjectConstants.DEFAULT_XDSML_SUFFIX)) {
      xdsmlProjectName = xdsmlProjectName.replace(XMOFProjectConstants.DEFAULT_XDSML_SUFFIX, "");
    }
    return cleanPackageName(xdsmlProjectName.toLowerCase());
  }

  private static String cleanPackageName(String packageName) {
    String cleanPackage = "";
    for (String fragment : packageName.split("\\.")) {
      if (!XMOFProjectConstants.RESERVED_MELANGE_KEYWORDS.contains(fragment)) {
        cleanPackage += fragment + ".";
      }
    }
    cleanPackage = cleanPackage.substring(0, cleanPackage.length() - 1);
    if (cleanPackage.isEmpty()) {
      return "xdsml";
    }
    return cleanPackage;
  }

  /**
   * Loads the xmof properties stored in the passed xmofProject.
   * 
   * @param xmofProject
   *          project containing the properties
   * @return stored properties or null
   */
  public static Properties loadXmofProperties(IProject xmofProject) {
    try {
      IFile pref = xmofProject.getFile(XMOFProjectConstants.XMOF_PROPERTIES_NAME);
      if (pref.exists()) {
        Properties prop = new Properties();
        prop.load(pref.getContents());
        return prop;
      }
    } catch (CoreException | IOException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * Persits the passed xMOF properties.
   * 
   * @param project
   *          parent project in which the properties should be stored
   * @param properties
   *          xMOF properties
   * @param monitor
   *          a progress monitor, or null if progress reporting is not desired
   * @return true if the properties have been successfully persisted, false otherwise
   * @throws InvocationTargetException
   *           if the persist operation failed
   */
  public static void persistXmofProperties(IProject project, Properties properties,
      IProgressMonitor monitor) throws InvocationTargetException {
    try {
      ByteArrayOutputStream out = new ByteArrayOutputStream();

      properties.store(out, "xMOF project properties");

      IFile pref = project.getFile(XMOFProjectConstants.XMOF_PROPERTIES_NAME);
      ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
      pref.create(in, true, monitor);

    } catch (IOException | CoreException ex) {
      throw new InvocationTargetException(ex);
    }
  }

  /**
   * Retrieves the xMOF file from the selection of an execution event. Should be used by UI
   * commands.
   * 
   * @param event
   *          ExecutionEvent
   * @return xMOF file which is contained by the selection or the default xmof file folder of xMOF
   *         projects. Null if no file exists.
   */
  public static IFile getXMOFFileFromSelection(ExecutionEvent event) {
    IProject project = null;
    ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage()
        .getSelection();
    if (selection != null && selection instanceof IStructuredSelection) {
      IStructuredSelection structuredSelection = (IStructuredSelection) selection;
      for (@SuppressWarnings("unchecked")
      Iterator<Object> selectionIterator = structuredSelection.iterator(); selectionIterator
          .hasNext();) {
        Object selectedElement = selectionIterator.next();
        if (selectedElement instanceof IResource) {
          IResource resource = (IResource) selectedElement;
          if (isXmofFile(resource)) {
            return (IFile) resource;
          }
          if (project == null)
            project = resource.getProject();
        }

      }
      return getFileFromXmofFolder(project);
    }
    return null;
  }

  private static IFile getFileFromXmofFolder(IProject project) {
    try {
      for (IResource res : project.getFolder(XMOFProjectConstants.XMOF_FILE_FOLDER).members()) {
        if (isXmofFile(res))
          return (IFile) res;
      }
      return null;
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  private static boolean isXmofFile(IResource resource) {
    return resource instanceof IFile
        && resource.getName().endsWith(XMOFProjectConstants.XMOF_FILE_EXTENSION);
  }

}
