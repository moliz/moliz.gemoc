/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.extension.sirius.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.DView;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;

@SuppressWarnings("restriction")
public class ConvertToDynamicRepresentationCommand extends RecordingCommand {

	private ConfigurationObjectMap configurationMap;
	private Resource originalAirdResource;
	private URI dynamicModelURI;
	private TransactionalEditingDomain editingDomain;
	private Resource dynamicAirdResource;

	public ConvertToDynamicRepresentationCommand(TransactionalEditingDomain editingDomain,
			ConfigurationObjectMap configurationObjectMap, Resource originalAirdResource, URI dynamicModelURI) {
		super(editingDomain);
		this.configurationMap = configurationObjectMap;
		this.originalAirdResource = originalAirdResource;
		this.dynamicModelURI = dynamicModelURI;
		this.editingDomain = editingDomain;
	}

	@Override
	protected void doExecute() {
		if (originalAirdResource == null)
			return;

		try {
			dynamicAirdResource = createAndPersistCopy(originalAirdResource);
			if (dynamicAirdResource == null)
				return;
			updateReferences(dynamicAirdResource);
			dynamicAirdResource.save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void updateReferences(Resource dynamicAirdResource) {
		for (EObject obj : dynamicAirdResource.getContents()) {
			if (obj instanceof DAnalysis) {
				updateAnalysis((DAnalysis) obj);
			} else if (obj instanceof DSemanticDiagramSpec) {
				updateDiagramSpec((DSemanticDiagramSpec) obj);
			}
		}

	}

	private Resource createAndPersistCopy(Resource originalAirdResource) throws IOException {
		URI dynamicAirdURI = computeDynamicAirdURI();
		Resource copyResource = createResource(originalAirdResource.getResourceSet(), editingDomain, dynamicAirdURI,
				originalAirdResource.getContents());
		copyResource.save(Collections.EMPTY_MAP);
		return copyResource;
	}

	private URI computeDynamicAirdURI() {
		String uriString = dynamicModelURI.toString();
		String modelFileName = dynamicModelURI.lastSegment();
		String aridFileName = originalAirdResource.getURI().lastSegment();
		String dynamicAirdUriString = uriString.replace(modelFileName, aridFileName);
		return URI.createURI(dynamicAirdUriString);
	}

	private void updateDiagramSpec(DSemanticDiagramSpec semanticDiagramSpec) {
		for (DDiagramElement diagramElement : semanticDiagramSpec.getOwnedDiagramElements()) {
			updateDiagramElement(diagramElement);
		}
		updateTarget(semanticDiagramSpec);

	}

	private void updateDiagramElement(DDiagramElement diagramElement) {
		updateSemanticElements(diagramElement);
		updateTarget(diagramElement);
		diagramElement.getTarget();
		if (diagramElement instanceof DNodeContainer) {
			for (DDiagramElement ownedElement : ((DNodeContainer) diagramElement).getOwnedDiagramElements()) {
				updateDiagramElement(ownedElement);
			}
		}

	}

	private void updateTarget(DSemanticDecorator semanticDecorator) {
		if (semanticDecorator.getTarget() != null) {
			semanticDecorator.setTarget(configurationMap.getConfigurationObject(semanticDecorator.getTarget()));
		}

	}

	private void updateSemanticElements(DDiagramElement diagramElement) {
		if (!diagramElement.getSemanticElements().isEmpty()) {
			List<EObject> newSemanticElements = new ArrayList<EObject>();
			for (EObject originalObject : diagramElement.getSemanticElements()) {
				newSemanticElements.add(configurationMap.getConfigurationObject(originalObject));
			}
			EList<EObject> oldSemanticElements = diagramElement.getSemanticElements();
			oldSemanticElements.clear();
			oldSemanticElements.addAll(newSemanticElements);
		}

	}

	private void updateAnalysis(DAnalysis analysis) {
		// update semanticResources
		List<ResourceDescriptor> semanticResources = analysis.getSemanticResources();
		semanticResources.clear();
		semanticResources.add(new ResourceDescriptor(dynamicModelURI));
		updateRepresentationDescriptors(analysis);
	}

	private void updateRepresentationDescriptors(DAnalysis analysis) {
		for (DView view : analysis.getOwnedViews()) {
			for (DRepresentationDescriptor descriptor : view.getOwnedRepresentationDescriptors()) {
				if (descriptor.getTarget() != null) {
					descriptor.setTarget(configurationMap.getConfigurationObject(descriptor.getTarget()));
				}
			}
		}

	}

	private Resource createResource(ResourceSet resourceSet, EditingDomain editingDomain, URI uri,
			Collection<EObject> eObjects) {
		if (editingDomain.getResourceSet() != resourceSet)
			return null;
		Resource resource = resourceSet.createResource(uri);
		AddCommand addCommand = new AddCommand(editingDomain, resource.getContents(), eObjects);
		editingDomain.getCommandStack().execute(addCommand);
		return resource;
	}

	public Resource getDynamicAirdResourec() {
		return dynamicAirdResource;
	}

}
