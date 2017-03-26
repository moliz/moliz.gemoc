/*******************************************************************************
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.ui.command;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.animation.core.ui.Activator;

public class PrepareForAnimatorCommand extends AbstractHandler {

	private Map<Activity, Set<String>> activityUniqueNameMap;
	private Map<ActivityNode, String> nodeToIDMap;
	private ResourceSetImpl resourceSet;

	private void initialize() {
		resourceSet = new ResourceSetImpl();
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		nodeToIDMap = new HashMap<ActivityNode, String>();
		activityUniqueNameMap = new HashMap<Activity, Set<String>>();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		initialize();
		IFile xmofFile = getXMOFFileFromSelection(event);
		IFolder xmofFolder = getFolder(xmofFile);
		final Job job = new Job("Preparexmof model for semantic animation " + xmofFile.getName()) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				boolean success = true;
				if (xmofFolder != null) {
					try {
						for (IResource res : xmofFolder.members()) {
							if (res.getFileExtension().equals("diagram")) {
								processResource(res);
							}
						}
						persistXMOFResource();
					} catch (CoreException | IOException e) {
						e.printStackTrace();
						success = false;
					}
				}
			
				return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
						(success ? "xMOF model has been prepared for modelanimator"
								: "Error during model preparation for ") + xmofFile.getName());

			}

			

		};
		job.schedule();

		return null;
	}
	
	private void persistXMOFResource() throws IOException {
		for (Activity activity : activityUniqueNameMap.keySet()) {
			if (activity.eResource()!=null){
				activity.eResource().save(Collections.EMPTY_MAP);
				return;
			}
			
		}
		
	}
	private void processResource(IResource resource) throws IOException {
		Resource graphitiResource = loadResource(resource);
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(graphitiResource);

		RecordingCommand cmd = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				for (EObject eObject : graphitiResource.getContents()) {
					if (eObject instanceof Diagram) {
						processDiagram((Diagram) eObject);
					}
				}
			}
		};
		editingDomain.getCommandStack().execute(cmd);

		// persist changed resources
		
		graphitiResource.save(Collections.EMPTY_MAP);

	}

	private void processDiagram(Diagram diagram) {
		processContainerShape(diagram);

	}

	private void processContainerShape(ContainerShape containerShape) {
		for (Shape childShape : containerShape.getChildren()) {
			if (childShape.getLink() != null) {
				processLink(childShape.getLink());
			}

			if (childShape instanceof ContainerShape) {
				processContainerShape((ContainerShape) childShape);
			}

		}
	}

	private void processLink(PictogramLink link) {
		for (EObject businessObject : link.getBusinessObjects()) {
			if (businessObject instanceof ActivityNode && !(businessObject instanceof Pin)) {
				convertNamesToID((ActivityNode) businessObject);
			}
		}

	}

	private void convertNamesToID(ActivityNode activityNode) {
		if (activityNode instanceof DecisionNode){
			System.out.println();
		}
		String id = nodeToIDMap.get(activityNode);
		if (id == null) {
			id = computeId(activityNode);
			nodeToIDMap.put(activityNode, id);
		}

		activityNode.setName(id);

	}

	private String computeId(ActivityNode activityNode) {
		Set<String> existingNames = getExistingNames(activityNode);
		String nodeName = activityNode.getName();
		if (nodeName == null || nodeName.isEmpty()) {
			nodeName = activityNode.getClass().getSimpleName().replace("Impl", "");
		}

		int i = 1;
		while (existingNames.contains(nodeName)) {
			nodeName = nodeName + i;
		}
		existingNames.add(nodeName);
		return nodeName;
	}

	private Set<String> getExistingNames(ActivityNode node) {

		Set<String> result = activityUniqueNameMap.get(getActivity(node));
		if (result == null) {
			result = new HashSet<String>();
			activityUniqueNameMap.put(node.getActivity(), result);
		}
		return result;
	}

	private Activity getActivity(ActivityNode node) {
		ActivityNode parentNode = node;
		while (parentNode.getInStructuredNode() != null) {
			parentNode = parentNode.getInStructuredNode();
		}
		return parentNode.getActivity();
	}

	private IFolder getFolder(IFile xmofFile) {
		if (xmofFile.getParent() instanceof IFolder) {
			return (IFolder) xmofFile.getParent();
		}
		return null;
	}

	private IFile getXMOFFileFromSelection(ExecutionEvent event) {
		IProject project = null;
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (@SuppressWarnings("unchecked")
			Iterator<Object> selectionIterator = structuredSelection.iterator(); selectionIterator.hasNext();) {
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

	private boolean isXmofFile(IResource resource) {
		return resource instanceof IFile && resource.getFileExtension().equals("xmof");
	}

	private IFile getFileFromXmofFolder(IProject project) {

		try {
			for (IResource res : project.getFolder("xmof").members()) {
				if (isXmofFile(res))
					return (IFile) res;
			}
			return null;
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Resource loadResource(final IResource resource) {
		final URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
		return resourceSet.getResource(uri, true);
	}
}
