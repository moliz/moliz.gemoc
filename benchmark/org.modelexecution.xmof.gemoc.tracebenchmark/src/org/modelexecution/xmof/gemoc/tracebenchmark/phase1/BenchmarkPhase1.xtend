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
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.util.TransactionUtil
import org.gemoc.executionframework.engine.Activator
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

import org.junit.Rule
import org.junit.rules.TemporaryFolder
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.PetriNetLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.NoTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.DSTraceCase

@RunWith(Parameterized)
class BenchmarkPhase1 {

	@Rule
	public TemporaryFolder tmpFolderCreator = new TemporaryFolder();

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
	val String testCaseName

	// Test case constructor
	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, String model,
		String inputModel) {
		this.language = language
		this.tracingCase = tracingCase
		this.model = model
		this.inputModel = inputModel
		this.testCaseName = testCaseName
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
					val tracingCaseOutputFolder = if (tracingCase.folderName != null && tracingCase.folderName != "") {
							new File(languageOutputFolder, tracingCase.folderName)
						} else {
							null
						}

					val csvLine = new CSVLine
					csvLine.inputName = inputModel
					csvLine.languageName = language.folderName
					csvLine.modelName = model
					csvLine.traceMetamodel = tracingCase.folderName

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
					tracingCase.configureEngineForTracing(engine, executioncontext)
					engine.initialize(executioncontext);

					// Execution
					val timeStart = System.nanoTime
					engine.start
					engine.joinThread
					val timeEnd = System.nanoTime
					csvLine.timeExe = timeEnd - timeStart

					// Clean command stack
					val rs = executioncontext.resourceModel.resourceSet
					val ed = TransactionUtil.getEditingDomain(rs)
					ed.commandStack.flush

					// Remove engine(s) from registry
					val registry = Activator.^default.gemocRunningEngineRegistry
					for (engineName : registry.runningEngines.keySet)
						registry.unregisterEngine(engineName)

					// Clean resourceSet
					clearResourceSet(rs)

					// If any trace created
					if (tracingCaseOutputFolder != null) {

						// Read trace
						csvLine.traceNbStates = tracingCase.numberOfStates

						// Dump memory and compute memory usage of the trace
						val heapFolder = tmpFolderCreator.newFolder
						val heap = new File(heapFolder, model + "_" + tracingCase.folderName)
						MemoryAnalyzer.dumpHeap(heap)
						csvLine.traceMemoryFootprint = tracingCase.computeMemoryUsage(heap)

						// Create trace folder
						if (!tracingCaseOutputFolder.exists)
							tracingCaseOutputFolder.mkdir

						// Copy trace in trace folder
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

					// Destroy engine
					engine.dispose

					// TODO store results in CSV
					//
					csvLine.toString

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
		EclipseTestUtil.waitForJobsThenWindowClosed
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
