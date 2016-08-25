package org.modelexecution.xmof.gemoc.codegen;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallBehaviorAction;
import org.modelexecution.xmof.Syntax.Actions.CompleteActions.ReduceAction;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

public class XMOFCodeGenerator {

	public static final String MODEL_GEN_FOLDER = "model-gen";
	
	protected IProgressMonitor progressMonitor;
	
	protected ResourceSet resourceSet;
	protected IProject xmofProject;
	
	
	public boolean generateCode(Resource xmofModelResource, IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
		this.resourceSet = new ResourceSetImpl();
		this.xmofProject = getXMOFProject(xmofModelResource);
		
		boolean success = false;
		
		// setup folder for saving temporary models
		URI modelGenFolderURI = setupModelGenFolder();
		
		// 1. create temporary Ecore metamodel
		// TODO: See whether we can avoid this step and therewith also 4., 5. and 6.
		final EPackage rootEPackage = generateEcoreModel(xmofModelResource, modelGenFolderURI);

		// 2. create temporary Genmodel, set initialize by load to true
		final GenModel genModel = generateGenModel(rootEPackage, modelGenFolderURI);

		// 3. generate code
		success = generateCode(genModel, progressMonitor);
		
		// 4. copy xMOF file into impl folder
		// 5. change URI of Ecore file in PackageImpl class
		// 6. Special case of empty packages has to be considered for 4. and 5.
		return success;
	}

	private IProject getXMOFProject(Resource xmofModelResource) {
		final URI xmofModelURI = xmofModelResource.getURI();
		final IPath xmofModelPath = new Path(xmofModelURI.toPlatformString(true));
		final IFile xmofModelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(xmofModelPath);
		final IProject xmofProject = xmofModelFile.getProject();
		return xmofProject;
	}

	protected URI setupModelGenFolder() {
		URI modelGenFolderURI = null;
		final IFolder modelGenFolder = xmofProject.getFolder(MODEL_GEN_FOLDER);
		if (!modelGenFolder.exists()) {
			try {
				modelGenFolder.create(true, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		modelGenFolderURI = URI.createPlatformResourceURI(modelGenFolder.getFullPath().toString(), true);
		return modelGenFolderURI;
	}

	protected EPackage generateEcoreModel(Resource xmofModelResource, URI modelGenFolderURI) {
		final Resource ecoreModelResource = copyXMOFModel(xmofModelResource, modelGenFolderURI);
		final EPackage rootEPackage = (EPackage)ecoreModelResource.getContents().get(0);
		removeBehaviors(rootEPackage);
		save(ecoreModelResource);
		return rootEPackage;
	}

	private Resource copyXMOFModel(Resource xmofModelResource, URI modelGenFolderURI) {
		final String ecoreModelFileName = xmofModelResource.getURI().trimFileExtension().appendFileExtension("ecore").lastSegment().toString();
		final URI ecoreModelURI = modelGenFolderURI.appendSegment(ecoreModelFileName);
		final Resource ecoreModelResource = resourceSet.createResource(ecoreModelURI);

		final Copier copier = new Copier();
		ecoreModelResource.getContents().addAll((copier.copyAll(xmofModelResource.getContents())));
		copier.copyReferences();
		return ecoreModelResource;
	}

	private void removeBehaviors(EPackage ePackage) {
		// TODO: is it enough to remove BehavioredEOperations?
		for (TreeIterator<EObject> eAllContents = ePackage.eAllContents(); eAllContents.hasNext();) {
			EObject eObject = eAllContents.next();
			if (eObject instanceof BehavioredEClass) {
				BehavioredEClass behavioredEClass = (BehavioredEClass) eObject;
				behavioredEClass.getOwnedBehavior().clear();
			} else if (eObject instanceof BehavioredEOperation) {
				BehavioredEOperation behavioredEOperation = (BehavioredEOperation) eObject;
				behavioredEOperation.getMethod().clear();
				behavioredEOperation.getEContainingClass().getEOperations().remove(behavioredEOperation);
			} else if (eObject instanceof CallBehaviorAction) {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction) eObject;
				callBehaviorAction.setBehavior(null);
			} else if (eObject instanceof DecisionNode) {
				DecisionNode decisionNode = (DecisionNode) eObject;
				decisionNode.setDecisionInput(null);
			} else if (eObject instanceof ReduceAction) {
				ReduceAction reduceAction = (ReduceAction) eObject;
				reduceAction.setReducer(null);
			}
		}

		// for (EClassifier eClassifier : ePackage.getEClassifiers()) {
		// if (eClassifier instanceof BehavioredEClass) {
		// BehavioredEClass behavioredEClass = (BehavioredEClass) eClassifier;
		// behavioredEClass.getOwnedBehavior().clear();
		// for (EOperation eOperation : behavioredEClass.getEOperations()) {
		// if (eOperation instanceof BehavioredEOperation) {
		// BehavioredEOperation behavioredEOperation = (BehavioredEOperation)
		// eOperation;
		// behavioredEOperation.getMethod().clear();
		// }
		// }
		// }
		// }
		// for (EPackage subPackage : ePackage.getESubpackages()) {
		// removeBehaviors(subPackage);
		// }
	}
	
	protected GenModel generateGenModel(EPackage rootEPackage, URI modelGenFolderURI) {		
		final Resource genModelResource = createGenModel(rootEPackage);
		GenModel genModel = (GenModel)genModelResource.getContents().get(0);
		setInitializeByLoad((genModel).getGenPackages().get(0));
		save(genModelResource);
		return genModel;
	}

	private Resource createGenModel(EPackage rootEPackage) {
		final Resource ecoreModelResource = rootEPackage.eResource();
		final URI genmodelURI = URI
				.createURI(ecoreModelResource.getURI().trimFileExtension().appendFileExtension("genmodel").toString());
		final Resource genModelResource = resourceSet.createResource(genmodelURI);

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);

		final IFolder srcFolder = xmofProject.getFolder("src");
		genModel.setModelDirectory(srcFolder.getFullPath().toString());
		genModel.getForeignModel().add(ecoreModelResource.getURI().lastSegment());
		genModel.initialize(Collections.singleton(rootEPackage));
		genModel.setModelName(genmodelURI.trimFileExtension().lastSegment());
		genModel.setModelPluginID(getPluginID(genmodelURI));

		final List<GenPackage> missingGenPackages = new UniqueEList<GenPackage>();
		final Map<String, URI> genModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
		for (EPackage ePackage : genModel.getMissingPackages()) {
			final URI missingGenModelURI = genModelLocationMap.get(ePackage.getNsURI());
			final Resource missingGenModelResource = resourceSet.getResource(missingGenModelURI, true);
			final GenModel missingGenModel = (GenModel) missingGenModelResource.getContents().get(0);
			missingGenPackages.addAll(missingGenModel.getGenPackages());
		}
		genModel.getUsedGenPackages().addAll(missingGenPackages);

		return genModelResource;
	}
	
	protected final String getPluginID(URI uri) {
		String pluginID = "";
		final IFile manifestFile = xmofProject.getFolder("META-INF").getFile("MANIFEST.MF");
		try {
			final Manifest manifest = new Manifest(manifestFile.getContents());
			String symbolicName = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
			if (symbolicName != null) {
				int index = symbolicName.indexOf(";");
				if (index > 0) {
					symbolicName = symbolicName.substring(0, index);
				}
				pluginID = symbolicName.trim();
			}
		} catch (Exception e) {
		}
		return pluginID;
	}

	private void setInitializeByLoad(GenPackage genPackage) {
		genPackage.setLoadInitialization(true);
		for (GenPackage subGenPackage : genPackage.getSubGenPackages()) {
			setInitializeByLoad(subGenPackage);
		}
	}

	protected boolean generateCode(GenModel genModel, IProgressMonitor progressMonitor) {
		boolean success = false;
		prepareGenModelForCodeGeneration(genModel);
		final Generator generator = GenModelUtil.createGenerator(genModel);
		final boolean canGenerate = generator.canGenerate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE);
		if (canGenerate) {
			Diagnostic diagnostic = generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
					BasicMonitor.toMonitor(progressMonitor));
			if (diagnostic.getSeverity() == Diagnostic.OK) {
				success = true;
			}
		}
		return success;
	}

	private void prepareGenModelForCodeGeneration(GenModel genModel) {
		genModel.reconcile();
		genModel.setCanGenerate(true);
	}
	
	private final boolean save(Resource ecoreModelResource) {
		boolean success = false;
		try {
			ecoreModelResource.save(Collections.EMPTY_MAP);
			success = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
	}
}
