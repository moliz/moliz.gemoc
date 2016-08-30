

import iml.Header;
import iml.ImlPackage;
import model.loader.ModelDeserializer;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

public class TestModel {

	//Sequential SFC
//	@Test
//	public void test1() {
//		ImlPackage.eINSTANCE.getNsURI();
//		Resource resource = new ModelDeserializer().getResource("examples/Gantt_Example.xmi");
//		Header fsa_model = (Header)resource.getContents().get(0);
//		
//		fsa_model.execute();
//
//	}
	
	//SFC with simultaneous Divergence/Convergence
	@Test
	public void test2() {
		ImlPackage.eINSTANCE.getNsURI();
		Resource resource = new ModelDeserializer().getResource("examples/Gantt_Example_2.xmi");
		Header fsa_model = (Header)resource.getContents().get(0);
		
		fsa_model.execute();

	}
	
	//Example with selective Divergence/Convergence
//	@Test
//	public void test3() {
//		ImlPackage.eINSTANCE.getNsURI();
//		Resource resource = new ModelDeserializer().getResource("examples/selective_branching_test.xmi");
//		Header fsa_model = (Header)resource.getContents().get(0);
//		
//		fsa_model.execute();
//
//	}


}
