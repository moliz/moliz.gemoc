package org.modelexecution.xmof.codegen.test

import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.Test
import org.modelexecution.xmof.codegen.Xmof2Ecore

class GenericSuperTypeTransformerTest {

	@Test
	def void transformFumlInPureEcore() {

		val fumlURI = URI.createPlatformPluginURI("/org.modelexecution.xmof.codegen.test/input/fuml.xmof", true)
		val rs = new ResourceSetImpl
		val fumlResource = rs.createResource(fumlURI)
		fumlResource.load(null)
		EcoreUtil.resolveAll(fumlResource)

		val result = Xmof2Ecore.transform(fumlResource.contents.filter(EPackage).toSet)

		val tmpFolder = new File("tmp")
		if (tmpFolder.exists && tmpFolder.isFile) {
			tmpFolder.delete
		}
		if (!tmpFolder.exists) {
			tmpFolder.mkdir
		}

		val resultResource = rs.createResource(URI.createFileURI(new File(tmpFolder, "fuml.ecore").absolutePath))
		resultResource.contents.addAll(result)

		resultResource.save(null)
	}

}