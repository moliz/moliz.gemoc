package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import java.io.File
import java.io.FileInputStream
import java.io.PrintWriter
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
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.util.TransactionUtil
import org.gemoc.executionframework.engine.Activator
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkRunConfiguration
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.PetriNetLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.DSTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.NoTraceCase

@RunWith(Parameterized)
class BenchmarkPhase1 {

	@Rule
	public TemporaryFolder tmpFolderCreator = new TemporaryFolder();

	// Input data for all tests
	static val tracingCases = #{new NoTraceCase, new DSTraceCase}
	static val languages = #{
		new PetriNetLanguage(
			#{"net1.petrinet" -> #[""], "net1bis.petrinet" -> #[""]}
		)
	}

	// Constants
	static val String modelFolderName = "model"
	static val String outputFolderName = "output"
	static val int WARMUPS = 3
	static val int NBMEASURES = 3

	// Common to all tests (used by @BeforeClass and @AfterClass)
	static var IProject eclipseProject
	static var File outputFolder
	static var File outputCSV
	static var PrintWriter outputCSVWriter

	// Parameters specific to each test
	val BenchmarkLanguage language
	val BenchmarkTracingCase tracingCase
	val String model
	val String inputModel
	val String testCaseName

	// Transient data specific to each test
	var URI modelURI
	var String inputModelURIString
	var CSVLine line
	var File tracingCaseOutputFolder
	var File modelFile

	// Test case constructor
	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, String model,
		String inputModel) {
		this.language = language
		this.tracingCase = tracingCase
		this.model = model
		this.inputModel = inputModel
		this.testCaseName = testCaseName
	}

	private def File createTmpFolder() {
		//return tmpFolderCreator.newFolder
		//val file = File.createTempFile("yay","")
		val file = new File("/home/zerwan/tmp/dumps")
		return file		
	}

	private def long execute(boolean wait) {

		// Create engine parameterized with inputs
		val XMOFExecutionEngine lastEngine = new XMOFExecutionEngine();
		val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI, inputModelURIString)
		val executioncontext = new BenchmarkExecutionModelContext(runConf);
		executioncontext.initializeResourceModel();
		tracingCase.configureEngineForTracing(lastEngine, executioncontext)
		lastEngine.initialize(executioncontext);

		// Execution
		if (wait)
			Thread.sleep(500)
		val timeStart = System.nanoTime
		lastEngine.start
		lastEngine.joinThread
		val timeEnd = System.nanoTime
		val time = timeEnd - timeStart

		// Clean command stack
		val rs = lastEngine.executionContext.resourceModel.resourceSet
		val ed = TransactionUtil.getEditingDomain(rs)
		ed.commandStack.flush

		// Remove engine(s) from registry
		val registry = Activator.^default.gemocRunningEngineRegistry
		for (engineName : registry.runningEngines.keySet)
			registry.unregisterEngine(engineName)

		// Clean resourceSet
		clearResourceSet(rs)

		// If any trace created and we must measure memory
		if (tracingCaseOutputFolder != null && line.traceMemoryFootprint == 0) {

			// Read trace
			line.traceNbStates = tracingCase.numberOfStates

			// Dump memory and compute memory usage of the trace
			val heapFolder = createTmpFolder
			val heap = new File(heapFolder, model + "_" + tracingCase.simpleName)
			MemoryAnalyzer.dumpHeap(heap)
			line.traceMemoryFootprint = tracingCase.computeMemoryUsage(heap)

			// Create trace folder
			if (!tracingCaseOutputFolder.exists)
				tracingCaseOutputFolder.mkdir

			// Copy trace in trace folder
			val exeFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(
				lastEngine.executionContext.workspace.executionPath)
			val executionTraceFileInProject = exeFolder.getFile("execution.trace")
			val executionTraceFile = executionTraceFileInProject.location.toFile
			val inputSuffix = if (inputModel != null && inputModel != "") {
					"_" + inputModel
				} else {
					""
				}
			val executionTraceTargetFile = new File(tracingCaseOutputFolder, modelFile.name + inputSuffix + ".trace")
			Files.copy(executionTraceFile.toPath, executionTraceTargetFile.toPath)
		}

		// Destroy engine
		lastEngine.dispose
		return time

	}

	@Test
	def void test() {

		val job = new Job(testCaseName) {

			override protected run(IProgressMonitor m) {

				try {

					val modelFolder = new File(modelFolderName);

					val languageModelFolder = new File(modelFolder, language.folderName)

					// Create language output folder
					val languageOutputFolder = new File(outputFolder, language.folderName)
					if (!languageOutputFolder.exists)
						languageOutputFolder.mkdir

					// Create trace metamodel output folder (if any)
					tracingCaseOutputFolder = if (tracingCase.createsTrace) {
						new File(languageOutputFolder, tracingCase.simpleName)
					} else {
						null
					}

					line = new CSVLine
					line.inputName = inputModel
					line.languageName = language.folderName
					line.modelName = model
					line.traceMetamodel = tracingCase.simpleName

					// Copy model file in project and in output 
					modelFile = new File(languageModelFolder, model)
					val modelFileInProject = eclipseProject.getFile(modelFile.name)
					if (!modelFileInProject.exists)
						modelFileInProject.create(new FileInputStream(modelFile), true, m);
					modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString, true)

					// Copy input model file in project and in output
					inputModelURIString = ""
					if (inputModel != null && inputModel != "") {
						val File inputModelFile = new File(languageModelFolder, inputModel)
						val inputModelFileInProject = eclipseProject.getFile(inputModelFile.name)
						if (!inputModelFileInProject.exists)
							inputModelFileInProject.create(new FileInputStream(inputModelFile), true, m);
						val URI inputModelURI = URI.createPlatformResourceURI(inputModelFileInProject.fullPath.toString,
							true)
						inputModelURIString = inputModelURI.toString
					}
					// TODO copy output
					// TODO copy other models referenced by them
					
										
					// Warmups
					for (i : 0 ..< WARMUPS) {
						execute(false)
					}

					// Real executions
					var long sum = 0
					for (i : 0 ..< NBMEASURES) {
						val time = execute(true)
						sum = sum + time
					}

					line.timeExe = sum / NBMEASURES

					// Store result in CSV
					outputCSVWriter.println(line.toString)

					// Done 
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

		val job = new Job("Preparation of the eclipse project") {
			override protected run(IProgressMonitor m) {

				// Create output folder
				val Calendar currentDate = Calendar::getInstance();
				val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_HH-mm-ss");
				val String dateNow = formatter.format(currentDate.getTime());
				outputFolder = new File(outputFolderName + "_" + dateNow)
				if (!outputFolder.exists)
					outputFolder.mkdir

				// Prepare CSV file
				outputCSV = new File(outputFolder, "results.csv")
				outputCSVWriter = new PrintWriter(outputCSV)
				outputCSVWriter.println(CSVLine::getColumnNames)

				// Create eclipse project
				eclipseProject = ResourcesPlugin::getWorkspace().getRoot().getProject("benchmark-project");
				eclipseProject.create(m)
				eclipseProject.open(m)

				return Status.OK_STATUS
			}

		}
		job.schedule
		EclipseTestUtil::waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	@AfterClass
	def static void closeCSV() {
		outputCSVWriter.close
		EclipseTestUtil.waitForJobs
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
						val Object[] testCaseData = #[
							testCaseName,
							language,
							tracingCase,
							model,
							inputModel
						];
						data.add(testCaseData)

					}
				}
			}
		}
		return data

	}

	private static def void clearResourceSet(ResourceSet rs) {
		val ed = TransactionUtil.getEditingDomain(rs)
		// Clean resource
		val command = new RecordingCommand(ed, "Clean resources") {
			override protected doExecute() {

				for (c : rs.allContents.toSet)
					c.eAdapters.clear

				rs.resources.clear
			}
		}
		ed.commandStack.execute(command)
	}

}
