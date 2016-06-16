package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.junit.Test
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkRunConfiguration
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.Fuml
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.DSTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.GenericTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.NoTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.PartialDSCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Data.*
import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Helpers.*
import java.io.StringWriter

class BenchmarkPhase1SingleJVMTestSuite {

	public static val String modelProperty = "modelProperty"
	public static val String paramProperty = "paramProperty"
	public static val String languageProperty = "languageProperty"
	public static val String tracingCaseProperty = "tracingCaseProperty"
	public static val String tmpFileProperty = "tmpFileProperty"

	public static val String errorString = "!!!!ERROR"

	var BenchmarkLanguage language
	var URI modelURI
	var String inputModelURIString
	var BenchmarkTracingCase tracingCase

	// var CSVLine line
	public def void log(String s) {
		println("### [single test case] " + s)
	}

	private def long execute(IProgressMonitor m) {

		// Create engine parameterized with inputs
		log("Preparing engine")
		val XMOFExecutionEngine engine = new XMOFExecutionEngine();
		engine.silentAddonsErrors = false
		val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI, inputModelURIString)
		val executioncontext = new BenchmarkExecutionModelContext(runConf);
		executioncontext.initializeResourceModel();
		tracingCase.configureEngineForTracing(engine, executioncontext)
		engine.initialize(executioncontext);
		tracingCase.initialize();

		System.gc // To clean memory if possible
		Thread.sleep(3000) // To make sure the JVM is fully ready
		// Preloading everything we can
		// val allObjects = Investigation::findAllReachableObjects(executioncontext.resourceModel)
		log("Running engine")
		val timeStart = System.nanoTime
		engine.start
		engine.joinThread
		val timeEnd = System.nanoTime
		val time = timeEnd - timeStart

		return time
	}

	@Test
	def void test() {

		// Disable logs
		val emptyPrintStream = createEmptyPrintStream
		System.setOut(emptyPrintStream)
		System.setErr(emptyPrintStream)

		// Read properties
		val String model = System.getProperty(modelProperty)
		val String inputModel = System.getProperty(paramProperty)
		val String tracingCaseString = System.getProperty(tracingCaseProperty)
		val String languageName = System.getProperty(languageProperty)
		val tmpFilePath = System.getProperty(tmpFileProperty)

		switch (tracingCaseString) {
			case "NoTraceCase": tracingCase = new NoTraceCase
			case "DSTraceCase": tracingCase = new DSTraceCase
			case "PartialDSCase": tracingCase = new PartialDSCase
			case "GenericTraceCase": tracingCase = new GenericTraceCase
		}

		switch (languageName) {
			case "Fuml": language = new Fuml(null)
		}

		val job = new Job("single test case") {

			override protected run(IProgressMonitor m) {

				val outputTmp = new File(tmpFilePath)
				val outputTmpStream = new FileOutputStream(outputTmp)
				val outputTmpWriter = new PrintWriter(outputTmpStream, true)
				try {

					// Create eclipse project in test WS
					val eclipseProject = ResourcesPlugin::getWorkspace().getRoot().getProject(projectName);
					if (eclipseProject.exists)
						eclipseProject.delete(true, m)
					eclipseProject.create(m)
					eclipseProject.open(m)

					// Copy all the models in the test WS
					// TODO copy single model
					val modelFolder = new File(modelFolderName);
					val modelFolderInWS = copyFolderInWS(modelFolder, eclipseProject, m)

					log("Start test case.")

					tracingCase.logOperation = [s|log(s)]
					tracingCase.language = language

					// Create model URI
					val modelFileInProject = modelFolderInWS.getFolder(language.folderName).getFile(model)
					modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString, true)

					// Create model input URI
					inputModelURIString = if (inputModel != null && inputModel != "") {
						val inputFileInProject = modelFolderInWS.getFolder(language.folderName).getFile(inputModel)
						inputFileInProject.fullPath.toString
					} else {
						""
					}

					val time = execute(m)

					// Store result in tmp file
					outputTmpWriter.println(time)

					log("Result written in " + outputTmp)

					// Done 
					return Status.OK_STATUS

				} catch (Throwable t) {

					val StringWriter sw = new StringWriter();
					t.printStackTrace(new PrintWriter(sw));
					val String exceptionAsString = sw.toString();
					outputTmpWriter.println(errorString + " " + exceptionAsString)
					val status = new Status(Status.ERROR, "trace single time test", "An error occured in the test case",
						t)
					return status
				} finally {
					outputTmpWriter.close
					outputTmpStream.close
				}

			}
		}
		job.schedule
		EclipseTestUtil.waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

}
