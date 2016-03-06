import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IModelLoader;

public class TestLoader implements IModelLoader {

	@Override
	public Resource loadModel(IExecutionContext context) {
		
		return null;
	}

	@Override
	public Resource loadModelForAnimation(IExecutionContext context) {
		
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(context.getRunConfiguration().getAnimatorURI());
		
		try {
			res.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(rs);
		
		return res;
	}

}
