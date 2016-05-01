package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import java.io.File
import java.io.FileInputStream
import java.nio.file.Files
import java.text.SimpleDateFormat
import java.util.Calendar
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.junit.Test
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine

import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkRunConfiguration
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext

class BenchmarkPhase1 {

	static val String modelFolderName = "model"
	static val String outputFolderName = "output"
	static val tracingCases = #{new NoTraceCase, new DSTraceCase}
	static val languages = #{new PetriNetLanguage}

	@Test
	def void run() {

		val job = new Job("Run benchmark...") {
			override protected run(IProgressMonitor m) {

				val modelFolder = new File(modelFolderName);

				// Create output folder
				val Calendar currentDate = Calendar.getInstance();
				val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss");
				val String dateNow = formatter.format(currentDate.getTime());
				val outputFolder = new File(outputFolderName + "_" + dateNow)
				if (!outputFolder.exists)
					outputFolder.mkdir

				// Create eclipse project
				val project = ResourcesPlugin.getWorkspace().getRoot().getProject("benchmark-project");
				project.create(m)
				project.open(m)
				
				// Prepare CSV file
				// TODO
				CSVLine::getColumnNames

				// For each language
				for (language : languages) {

					val languageModelFolder = new File(modelFolder, language.folderName)

					// Create language output folder
					val languageOutputFolder = new File(outputFolder, language.folderName)
					if (!languageOutputFolder.exists)
						languageOutputFolder.mkdir

					// For each kind of trace metamodel
					for (tracingCase : tracingCases) {
						tracingCase.language = language

						// Create trace metamodel output folder
						val tracingCaseOutputFolder = if (tracingCase.folderName != null &&
								tracingCase.folderName != "") {
								new File(languageOutputFolder, tracingCase.folderName)
							} else {
								null
							}
						if (!tracingCaseOutputFolder.exists)
							tracingCaseOutputFolder.mkdir

						// For each model
						for (model : language.models) {
							
							// Copy model file
							val File modelFile = new File(languageModelFolder, model)
							val modelFileInProject = project.getFile(modelFile.name)
							modelFileInProject.create(new FileInputStream(modelFile), true, m);
							val URI modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString, true)

							// For each input model
							for (inputModel : language.getInputModelsFor(model)) {
								
								
								val result = new CSVLine
								result.inputName = inputModel
								result.languageName = language.folderName
								result.modelName = model
								result.traceMetamodel = tracingCase.folderName
								

								// Copy input model file
								var inputModelURIString = ""
								if (inputModel != null && inputModel != "") {
									val File inputModelFile = new File(languageModelFolder, inputModel)
									val inputModelFileInProject = project.getFile(inputModelFile.name)
									inputModelFileInProject.create(new FileInputStream(inputModelFile), true, m);
									val URI inputModelURI = URI.createPlatformResourceURI(
										inputModelFileInProject.fullPath.toString, true)
									inputModelURIString = inputModelURI.toString
								}
								
								// Create engine parameterized with inputs
								val XMOFExecutionEngine engine = new XMOFExecutionEngine();
								val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI,
									inputModelURIString)
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

							}
						}
					}
				}
				return Status.OK_STATUS
			}
		}
		job.schedule
		EclipseTestUtil.waitForJobsThenWindowClosed
	}
}