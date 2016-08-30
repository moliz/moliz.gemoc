package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import java.io.File
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.List
import java.util.ArrayList

abstract class AbstractWithTraceCase implements BenchmarkTracingCase {
	
	
	abstract def String getTraceRoot()
	abstract def Set<String> getTracePackages()

	static val String queryStart = '''SELECT * FROM ".*'''
	static val String queryEnd = '''.*"'''

	static val String queryAllUtil = '''SELECT * FROM ".*(PackageImpl|FactoryImpl|AdapterFactory|Switch)$"'''

	static def String createQuery(String... packagesNames) {
		'''«queryStart»«packagesNames.join("|")»«queryEnd»'''
	}

	override computeMemoryUsage(File dumpFile) {

		val analyzer = new MemoryAnalyzer(dumpFile);

		// First we make sure that there is only one trace
		val String queryCheck = '''SELECT * FROM ".*«traceRoot».*"''';
		val resCheck = analyzer.computeRetainedSizeWithOQLQuery(queryCheck);
		if (resCheck.nbElements != 1) {
			throw new Exception("Wrong number of traces: " + resCheck.nbElements);
		}
		
		val List<String> queries = new ArrayList<String>()
		for (tracePackage : tracePackages) {
			val query = createQuery(tracePackage)	
			queries.add(query)		
		}
		
		val resquery = analyzer.computeRetainedSizeWithOQLQuery(queries, #[queryAllUtil]);

		analyzer.cleanUp

		return resquery.memorySum
	}
}

