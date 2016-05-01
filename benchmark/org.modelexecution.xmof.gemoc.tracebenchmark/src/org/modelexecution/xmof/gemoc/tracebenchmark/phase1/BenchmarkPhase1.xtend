package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import java.io.File
import java.io.FileInputStream
import java.nio.file.Files
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Collection
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkRunConfiguration
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1.*

@RunWith(Parameterized)
class BenchmarkPhase1 {

	// Input data
	static val tracingCases = #{new NoTraceCase, new DSTraceCase}
	static val languages = #{
		new PetriNetLanguage(
			#{"net1.petrinet" -> #[""], "net1bis.petrinet" -> #[""]}
		)
	}

	// Constants
	static val String modelFolderName = "model"
	static val String outputFolderName = "output"

	// Common to all tests
	static var IProject eclipseProject
	static var File outputFolder

	// Specific to each test
	val BenchmarkLanguage language
	val BenchmarkTracingCase tracingCase
	val String model
	val String inputModel

	// Test case constructor
	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, String model,
		String inputModel) {
		this.language = language
		this.tracingCase = tracingCase
		this.model = model
		this.inputModel = inputModel
	}

	@Test
	def void test() {

		val job = new Job("Running test case") {
			override protected run(IProgressMonitor m) {

				try {

					val modelFolder = new File(modelFolderName);

					val languageModelFolder = new File(modelFolder, language.folderName)

					// Create language output folder
					val languageOutputFolder = new File(outputFolder, language.folderName)
					if (!languageOutputFolder.exists)
						languageOutputFolder.mkdir

					// Create trace metamodel output folder (if any)
					val tracingCaseOutputFolder = if (tracingCase.folderName != null && tracingCase.folderName != "") {
							new File(languageOutputFolder, tracingCase.folderName)
						} else {
							null
						}

					val result = new CSVLine
					result.inputName = inputModel
					result.languageName = language.folderName
					result.modelName = model
					result.traceMetamodel = tracingCase.folderName

					// Copy model file
					val File modelFile = new File(languageModelFolder, model)
					val modelFileInProject = eclipseProject.getFile(modelFile.name)
					if (!modelFileInProject.exists)
						modelFileInProject.create(new FileInputStream(modelFile), true, m);
					val URI modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString, true)

					// Copy input model file
					var inputModelURIString = ""
					if (inputModel != null && inputModel != "") {
						val File inputModelFile = new File(languageModelFolder, inputModel)
						val inputModelFileInProject = eclipseProject.getFile(inputModelFile.name)
						if (!inputModelFileInProject.exists)
							inputModelFileInProject.create(new FileInputStream(inputModelFile), true, m);
						val URI inputModelURI = URI.createPlatformResourceURI(inputModelFileInProject.fullPath.toString,
							true)
						inputModelURIString = inputModelURI.toString
					}

					// Create engine parameterized with inputs
					val XMOFExecutionEngine engine = new XMOFExecutionEngine();
					val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI, inputModelURIString)
					val executioncontext = new BenchmarkExecutionModelContext(runConf);
					executioncontext.initializeResourceModel();
					engine.initialize(executioncontext);
					tracingCase.configureEngineForTracing(engine)

					// Execution
					val timeStart = System.nanoTime
					engine.start
					engine.joinThread
					val timeEnd = System.nanoTime
					result.timeExe = timeEnd - timeStart

					//
					// TODO analyse trace (nb states)
					//
					// Dump memory
					val heapFolder = new File("/home/zerwan/tmp/memorytests/")
					heapFolder.mkdirs
					val heap = new File(heapFolder, model)
					MemoryAnalyzer.dumpHeap(heap)

					//
					// TODO compute memory
					//
					//
					// TODO store results in CSV
					//
					result.toString

					// This seems required to be sure that the execution.trace file is there and usable (probably useless now)
					EclipseTestUtil.waitUIThread(1000)

					// We copy the trace file back into the benchmark project (if any trace)
					if (tracingCaseOutputFolder != null) {
						if (!tracingCaseOutputFolder.exists)
							tracingCaseOutputFolder.mkdir

						val exeFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(
							engine.executionContext.workspace.executionPath)
						val executionTraceFileInProject = exeFolder.getFile("execution.trace")
						val executionTraceFile = executionTraceFileInProject.location.toFile
						val inputSuffix = if (inputModel != null && inputModel != "") {
								"_" + inputModel
							} else {
								""
							}
						val executionTraceTargetFile = new File(tracingCaseOutputFolder,
							modelFile.name + inputSuffix + ".trace")
						Files.copy(executionTraceFile.toPath, executionTraceTargetFile.toPath)
					}
					return Status.OK_STATUS

				} catch (Throwable t) {
					val status = new Status(Status.ERROR, "trace benchmark", "An error occured in a test case", t)
					return status
				}

			}
		}
		job.schedule
		EclipseTestUtil.waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	@BeforeClass
	def static void prepareEclipseProject() {

		val job = new Job("Preparation") {
			override protected run(IProgressMonitor m) {

				// Create output folder
				val Calendar currentDate = Calendar.getInstance();
				val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss");
				val String dateNow = formatter.format(currentDate.getTime());
				outputFolder = new File(outputFolderName + "_" + dateNow)
				if (!outputFolder.exists)
					outputFolder.mkdir

				// Create eclipse project
				eclipseProject = ResourcesPlugin.getWorkspace().getRoot().getProject("benchmark-project");
				eclipseProject.create(m)
				eclipseProject.open(m)

				// Prepare CSV file
				// TODO
				CSVLine::getColumnNames
				return Status.OK_STATUS
			}

		}
		job.schedule
		EclipseTestUtil.waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	@AfterClass
	def static void closeCSV() {
		// EclipseTestUtil.waitForJobsThenWindowClosed
		// TODO
	}

	@Parameters(name="{0}")
	public def static Collection<Object[]> data() {

		val Collection<Object[]> data = new ArrayList<Object[]>();

		// For each language
		for (language : languages) {

			// For each kind of trace metamodel
			for (tracingCase : tracingCases) {
				tracingCase.language = language

				// For each model
				for (model : language.models) {

					// For each input model
					for (inputModel : language.getInputModelsFor(model)) {

						// Preparing test case name
						val testCaseNameElements = new ArrayList
						testCaseNameElements.addAll(#[language.folderName, tracingCase.class.simpleName, model])
						if (inputModel != null && inputModel != "")
							testCaseNameElements.add(inputModel)
						val testCaseName = testCaseNameElements.join(",")

						// Creating test case input data
						val Object[] testCaseData = #[testCaseName, language, tracingCase, model, inputModel];
						data.add(testCaseData)

					}
				}
			}
		}
		return data

	}
}