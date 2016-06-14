package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import fr.inria.diverse.trace.commons.testutil.Investigation
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Path
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Collection
import java.util.List
import java.util.Random
import java.util.function.Consumer
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.HeapDump
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase

@RunWith(Parameterized)
class BenchmarkPhase1Memory {

	val String tmpFolderContainer = "/home/ebousse/tmp/yay"

	@Rule public TemporaryFolder tmpFolderCreator = new TemporaryFolder(new File(tmpFolderContainer));

	private def File createTmpFolder() {
		// return tmpFolderCreator.newFolder
		val rand = new Random
		val id = rand.nextInt(1000)
		val fileFriendlyTestCaseName = this.testCaseName.replaceAll(",", "-").replaceAll("/", "_")
		val folder = new File(tmpFolderContainer, fileFriendlyTestCaseName + "_" + id)
		folder.mkdirs
		return folder
	}

	// Parameters specific to each test
	val String testCaseName
	val BenchmarkLanguage language
	val BenchmarkTracingCase tracingCase
	val URI traceURI

	// Common to all tests
	static var File outputFolder
	static var File outputCSV
	static var PrintWriter outputCSVWriter
	static var FileOutputStream outputCSVStream

	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, URI traceURI) {
		this.language = language
		this.tracingCase = tracingCase
		this.traceURI = traceURI
		this.testCaseName = testCaseName
	}

	@BeforeClass
	def static void before() {
		// Create output folder in test project
		val Calendar currentDate = Calendar::getInstance();
		val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_HH-mm-ss");
		val String dateNow = formatter.format(currentDate.getTime());
		outputFolder = new File("output_memory" + "_" + dateNow)
		if (!outputFolder.exists)
			outputFolder.mkdir

		// Prepare CSV file in output folder
		outputCSV = new File(outputFolder, "results.csv")
		outputCSVStream = new FileOutputStream(outputCSV)
		outputCSVWriter = new PrintWriter(new FileOutputStream(outputCSV), true)
		outputCSVWriter.println(CSVLine::getColumnNames)
	}

	@AfterClass
	def static void after() {
		outputCSVStream.close
		outputCSVWriter.close
		EclipseTestUtil.waitForJobs
	}

	@Test
	def void test() {

		// Preliminary
		tracingCase.language = language
		tracingCase.logOperation = [s|println(s)]
		// Prepare csv line
		val line = new CSVLine
		line.languageName = language.folderName
		line.modelName = traceURI.lastSegment
		line.traceMetamodel = tracingCase.simpleName

		// Loading
		println("Loading model")
		val ResourceSet rs = new ResourceSetImpl
		val Resource traceResource = rs.createResource(traceURI)
		traceResource.load(null)
		EcoreUtil::resolveAll(traceResource)

		// Confuse the memory by preserving refs to all EClasses
		val List<EClass> allEClasses = new ArrayList
		val allStuff = Investigation::findAllReachableObjects(traceResource)
		for (o : allStuff) {
			allEClasses.add(o?.eClass)
		}
		allStuff.clear
		
		// GC (in case...)
		println("GC...")
		System.gc

		// Measure memory
		// Dump memory and compute memory usage of the trace
		val heapFolder = createTmpFolder
		val heap = new File(heapFolder, tracingCase.simpleName)
		println("Dumping memory")
		//MemoryAnalyzer.dumpHeap(heap)
		HeapDump.dumpHeap(heap.absolutePath,true)
		println("Analyzing dump")
		line.traceMemoryFootprint = tracingCase.computeMemoryUsage(heap)
		outputCSVWriter.println(line.customToString)

		// Unloading
		println("Unloading model")
		for (c : traceResource.allContents.toSet) {
			c.eAdapters.clear
		}
		traceResource.eAdapters.clear
		traceResource.contents.clear
		traceResource.unload
		rs.resources.clear

	}

	@Parameters(name="{0}")
	public def static Collection<Object[]> data() {

		val Collection<Object[]> data = new ArrayList<Object[]>();

		for (language : BenchmarkPhase1Data::languages) {

			val File traceFolder = new File("model_traces_test")
			if (traceFolder.exists) {
				val File languageFolder = new File(traceFolder, language.folderName)
				if (languageFolder.exists) {

					for (tracingCase : BenchmarkPhase1Data::tracingCases) {
						val File caseFolder = new File(languageFolder, tracingCase.simpleName)
						if (caseFolder.exists) {

							val languageVal = language
							val tracingVal = tracingCase

							val forEachFunc = new Consumer<Path>() {
								override accept(Path f) {
									val URI traceURI = URI.createFileURI(f.toAbsolutePath.toString)
									// Preparing test case name
									val String testCaseName = f.toString
									// Creating test case input data
									val Object[] testCaseData = #[
										testCaseName,
										languageVal,
										tracingVal,
										traceURI
									];
									data.add(testCaseData)
								}
							}

							Files.walk(caseFolder.toPath).filter([f|Files::isRegularFile(f)]).forEach(forEachFunc);

						}
					}
				}
			}
		}

		return data

	}

}
