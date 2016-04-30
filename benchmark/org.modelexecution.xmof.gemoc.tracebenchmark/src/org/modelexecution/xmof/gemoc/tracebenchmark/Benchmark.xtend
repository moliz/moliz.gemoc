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
import org.gemoc.executionframework.engine.commons.ModelExecutionContext
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.junit.Test
import org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetTraceEngineAddon
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import java.util.Map

class Benchmark {
	
	@Test
	def void run() {

		// Parameters to loop onto
		val folderName = "petrinet"
		val modelFilePath = "model/" + folderName + "/net1.petrinet"
		val String inputModelPath = ""
		val String language = "org.modelexecution.examples.petrinet.Petrinet"
		val traceAddon = new PetrinetTraceEngineAddon();

		// Find / create output folder to put the traces
		val Calendar currentDate = Calendar.getInstance();
		val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss");
		val String dateNow = formatter.format(currentDate.getTime());
		val outputFolder = new File("output_" + dateNow)
		if (!outputFolder.exists)
			outputFolder.mkdir
		val languageOutputFolder = new File(outputFolder, folderName)
		if (!languageOutputFolder.exists)
			languageOutputFolder.mkdir

		val project = ResourcesPlugin.getWorkspace().getRoot().getProject("benchmark-project");
		val File modelFile = new File(modelFilePath)
		val IFile modelFileInProject = project.getFile(modelFile.name)
		val XMOFExecutionEngine engine = new XMOFExecutionEngine();
		val job = new Job("Do everything") {
			override protected run(IProgressMonitor m) {
				// Create basic project with model
				project.create(m)
				project.open(m)
				modelFileInProject.create(new FileInputStream(modelFile), true, m);

				// Create engine parameterized with inputs
				val URI modelURI = URI.createPlatformResourceURI(modelFileInProject.fullPath.toString, true)
				val inputModelURIString = if (inputModelPath != null && inputModelPath != "") {
						URI.createPlatformResourceURI(inputModelPath, true).toString
					} else {
						""
					}
				val runConf = new BenchmarkRunConfiguration(language, modelURI, inputModelURIString)
				val ModelExecutionContext executioncontext = new BenchmarkExecutionModelContext(runConf,
					ExecutionMode.Run);
				executioncontext.initializeResourceModel();
				engine.initialize(executioncontext);
				engine.executionContext.executionPlatform.addEngineAddon(traceAddon)

				// Execution
				println("Starting...")
				engine.start
				println("Done...")
				return Status.OK_STATUS
			}
		};
		job.schedule

		// This seems required to be sure that the execution.trace file is there and usable
		EclipseTestUtil.waitForJobsThenWait(1000)

		// We copy the trace file back into the benchmark project
		val exeFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(
			engine.executionContext.workspace.executionPath)
		val executionTraceFileInProject = exeFolder.getFile("execution.trace")
		val executionTraceFile = executionTraceFileInProject.location.toFile
		val executionTraceTargetFile = new File(languageOutputFolder, modelFile.name + ".trace")
		Files.copy(executionTraceFile.toPath, executionTraceTargetFile.toPath)

	}

}