package model.loader;


import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;


public class ModelDeserializer {
	
	static ResourceSet resSet;
	
	public ModelDeserializer(){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new EcoreResourceFactoryImpl());
		resSet = new ResourceSetImpl();
	}

	public Resource getResource(String uri) {
		Resource res = null;
		URI fileUri = URI.createFileURI(new File(uri).getAbsolutePath());
		try {
			res = resSet.getResource(URI.createFileURI(fileUri.toFileString()), true);
		} catch (Exception e) {
			System.out.println("Loading of model failed: " + e);
		}
		return res;
	}

	
}
