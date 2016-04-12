package org.modelexecution.xmof.codegen.test;

import com.google.common.collect.Iterables;
import java.io.File;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;
import org.modelexecution.xmof.codegen.Xmof2Ecore;

@SuppressWarnings("all")
public class GenericSuperTypeTransformerTest {
  @Test
  public void transformFumlInPureEcore() {
    try {
      final URI fumlURI = URI.createPlatformPluginURI("/org.modelexecution.xmof.codegen.test/input/fuml.xmof", true);
      final ResourceSetImpl rs = new ResourceSetImpl();
      final Resource fumlResource = rs.createResource(fumlURI);
      fumlResource.load(null);
      EcoreUtil.resolveAll(fumlResource);
      EList<EObject> _contents = fumlResource.getContents();
      Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
      Set<EPackage> _set = IterableExtensions.<EPackage>toSet(_filter);
      final Set<EPackage> result = Xmof2Ecore.transform(_set);
      final File tmpFolder = new File("tmp");
      boolean _and = false;
      boolean _exists = tmpFolder.exists();
      if (!_exists) {
        _and = false;
      } else {
        boolean _isFile = tmpFolder.isFile();
        _and = _isFile;
      }
      if (_and) {
        tmpFolder.delete();
      }
      boolean _exists_1 = tmpFolder.exists();
      boolean _not = (!_exists_1);
      if (_not) {
        tmpFolder.mkdir();
      }
      File _file = new File(tmpFolder, "fuml.ecore");
      String _absolutePath = _file.getAbsolutePath();
      URI _createFileURI = URI.createFileURI(_absolutePath);
      final Resource resultResource = rs.createResource(_createFileURI);
      EList<EObject> _contents_1 = resultResource.getContents();
      _contents_1.addAll(result);
      resultResource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
