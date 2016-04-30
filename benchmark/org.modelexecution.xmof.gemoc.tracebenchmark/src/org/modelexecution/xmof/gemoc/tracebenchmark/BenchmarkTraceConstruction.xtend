package org.modelexecution.xmof.gemoc.tracebenchmark

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

import static org.modelexecution.xmof.gemoc.tracebenchmark.BenchmarkTraceConstruction.*

class BenchmarkTraceConstruction {

	static val String modelFolderName = "model"
	static val String outputFolderName = "output"
	static val tracingCases = #{new NoTraceCase, new DSTraceCase}
	static val languages = #{new PetriNetLanguage}

	@Test
	def void run() {

		val job = new Job("Run benchmark...") {
			override protected run(IProgressMonitor m) {

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

				// For each language
				for (language : languages) {

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
							val modelFilePath = modelFolderName + "/" + language.folderName + "/" + model
							val File modelFile = new File(modelFilePath)
							val IFile modelFileInProject = project.getFile(modelFile.name)
							modelFileInProject.create(new FileInputStream(modelFile), true, m);

							// For each input model
							for (inputModel : language.getInputModelsFor(model)) {
								// TODO copy input model
								// Create engine parameterized with inputs
								val XMOFExecutionEngine engine = new XMOFExecutionEngine();
								val URI modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString,
									true)
								val inputModelURIString = if (inputModel != null && inputModel != "") {
										val inputModelPath = modelFolderName + "/" + language.folderName + "/" +
											inputModel
										URI.createPlatformResourceURI(inputModelPath, true).toString
									} else {
										""
									}
								val runConf = new BenchmarkRunConfiguration(language.languageFQN, modelURI,
									inputModelURIString)
								val executioncontext = new BenchmarkExecutionModelContext(runConf);
								executioncontext.initializeResourceModel();
								engine.initialize(executioncontext);
								tracingCase.configureEngineForTracing(engine)

								// Execution
								println("Starting...")
								engine.start
								println("Done...")

								// This seems required to be sure that the execution.trace file is there and usable
								EclipseTestUtil.waitUIThread(1000)

								// We copy the trace file back into the benchmark project
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