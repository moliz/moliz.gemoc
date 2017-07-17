package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import org.eclipse.gemoc.trace.commons.testutil.EclipseTestUtil
import org.eclipse.gemoc.trace.commons.testutil.Investigation
import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Collection
import java.util.HashSet
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkRunConfiguration
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Data.*
import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Helpers.*
import org.eclipse.emf.transaction.util.TransactionUtil
import org.eclipse.emf.transaction.RecordingCommand

@RunWith(Parameterized)
class BenchmarkPhase1SerializationTestSuite {

	// Common to all tests (used by @BeforeClass and @AfterClass)
	static var IProject eclipseProject
	static var File outputFolder
	static var IFolder modelFolderInWS

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

	// Test case constructor
	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, String model,
		String inputModel) {
		this.language = language
		this.tracingCase = tracingCase
		this.model = model
		this.inputModel = inputModel
		this.testCaseName = testCaseName
	}

	public def void log(String s) {
		println("### [" + testCaseName + "] " + s)
	}

	private def void copyFromWS(IFile fileInWS, File destination) {
		val executionTraceFile = fileInWS.location.toFile
		destination.parentFile.mkdirs
		Files.copy(executionTraceFile.toPath, destination.toPath, StandardCopyOption::REPLACE_EXISTING)
	}

	private def void execute(IProgressMonitor m) {

		// Create engine parameterized with inputs
		log("Preparing engine")
		val XMOFExecutionEngine engine = new XMOFExecutionEngine();
		engine.stopOnAddonError = true
		val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI, inputModelURIString)
		val executioncontext = new BenchmarkExecutionModelContext(runConf);
		executioncontext.initializeResourceModel();
		tracingCase.configureEngineForTracing(engine, executioncontext)
		engine.initialize(executioncontext);
		tracingCase.initialize();

		log("Running engine")
		engine.start
		engine.joinThread
		if (engine.error != null)
			throw engine.error

		// Trace serialization
		if (tracingCase.createsTrace) {

			if (tracingCase.needsConfModelInTrace) {

				val Resource confModel = executioncontext.resourceModel
				val Set<EObject> confModelRoots = new HashSet<EObject>
				confModelRoots.addAll(confModel.contents)
				val pointed = new HashSet<EObject>
				Investigation::findObjectsThatPointToObjectsWithoutResource(confModel, pointed)
				confModelRoots.addAll(Investigation::findRoots(pointed))

				log("Add conf model elements to trace resource")
				val Runnable run = [tracingCase.traceResource.contents.addAll(confModelRoots)]
				val ed = TransactionUtil::getEditingDomain(confModel)
				if (ed != null) {
					val cmd = new RecordingCommand(ed) {
						override protected doExecute() {
							run.run
						}
					}
					ed.commandStack.execute(cmd)
				} else {
					run.run
				}

			}

			log("Serialize trace")

			// Create trace folder
			if (!tracingCaseOutputFolder.exists)
				tracingCaseOutputFolder.mkdir

			// Serialize trace with same structure (output/language/tracemetamodel)
			val languageFolderInProject = eclipseProject.getFolder(language.folderName)
			if (!languageFolderInProject.exists)
				languageFolderInProject.create(true, true, m)
			val traceFolderInProject = languageFolderInProject.getFolder(tracingCase.simpleName)
			if (!traceFolderInProject.exists)
				traceFolderInProject.create(true, true, m)
			val inputSuffix = if (inputModel != null && inputModel != "")
					"_" + inputModel
				else
					""
			val traceFileName = modelURI.lastSegment + inputSuffix + ".trace"
			val traceFileInProject = traceFolderInProject.getFile(traceFileName)
			val path = traceFileInProject.fullPath.toString

			if (!traceFileInProject.exists) {
				tracingCase.saveTrace(path)

				// Copy trace in output folder
				val executionTraceTargetFile = new File(tracingCaseOutputFolder,
					modelURI.lastSegment + inputSuffix + ".trace")
				copyFromWS(traceFileInProject, executionTraceTargetFile)
			}

		}

	}

	@Test
	def void test() {
		val job = new Job(testCaseName) {

			override protected run(IProgressMonitor m) {

				try {
					log("Start test case.")

					tracingCase.logOperation = [s|log(s)]

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

					// Prepare csv line
					line = new CSVLine
					line.inputName = inputModel
					line.languageName = language.folderName
					line.modelName = model
					line.traceMetamodel = tracingCase.simpleName
					line.nbWarmups = WARMUPS
					line.nbMeasurements = NBMEASURES

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

					execute(m)

					log("Finished test case.")
					// Done 
					return Status.OK_STATUS

				} catch (Throwable t) {
					val status = new Status(Status.ERROR, "trace benchmark", "An error occured in a test case", t)
					return status
				}

			}
		}
		job.schedule
		EclipseTestUtil::waitForJobs
		
		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	@BeforeClass
	def static void prepareEclipseProject() {

		val job = new Job("Preparation of the eclipse project") {

			override protected run(IProgressMonitor m) {

				// Create output folder in test project
				val Calendar currentDate = Calendar::getInstance();
				val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_HH-mm-ss");
				val String dateNow = formatter.format(currentDate.getTime());
				outputFolder = new File(outputFolderName + "_" + dateNow)
				if (!outputFolder.exists)
					outputFolder.mkdir

				// Create eclipse project in test WS
				eclipseProject = ResourcesPlugin::getWorkspace().getRoot().getProject(projectName);
				eclipseProject.create(m)
				eclipseProject.open(m)

				// Copy all the models in the test WS
				val modelFolder = new File(modelFolderName);
				modelFolderInWS = copyFolderInWS(modelFolder, eclipseProject, m)

				return Status.OK_STATUS
			}

		}
		job.schedule
		EclipseTestUtil::waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	@Parameters(name="{0}")
	public def static Collection<Object[]> data() {

		val Collection<Object[]> data = new ArrayList<Object[]>();
		var int i = 1;

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
						testCaseNameElements.addAll(#[i, language.folderName, tracingCase.class.simpleName, model])
						i++
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

}
