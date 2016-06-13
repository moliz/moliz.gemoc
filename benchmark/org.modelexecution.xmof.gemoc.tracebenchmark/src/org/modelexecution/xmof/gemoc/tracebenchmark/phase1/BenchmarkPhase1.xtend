package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.commons.testutil.EclipseTestUtil
import fr.inria.diverse.trace.commons.testutil.Investigation
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.io.PrintStream
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.Locale
import java.util.Random
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.TransactionalEditingDomain
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
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Data.*

@RunWith(Parameterized)
class BenchmarkPhase1 {

	
	
	
	// @Rule public TemporaryFolder tmpFolderCreator = new TemporaryFolder(new File("/home/ebousse/tmp/yay"));
	static val File tmpFolderContainer = new File(dumpsFolder)
	

	// Common to all tests (used by @BeforeClass and @AfterClass)
	static var IProject eclipseProject
	static var File outputFolder
	static var File outputCSV
	static var PrintWriter outputCSVWriter
	static var FileOutputStream outputCSVStream
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
	var boolean confModelSaved

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
		// return tmpFolderCreator.newFolder
		val rand = new Random
		val id = rand.nextInt(1000)
		val fileFriendlyTestCaseName = this.testCaseName.replaceAll(",", "-").replaceAll("/", "_")
		val folder = new File(tmpFolderContainer, fileFriendlyTestCaseName + "_" + id)
		folder.mkdirs
		return folder
	}

	private def void log(String s) {
		println("### [" + testCaseName + "] " + s)
	}

	private def void copyFromWS(IFile fileInWS, File destination) {
		val executionTraceFile = fileInWS.location.toFile
		destination.parentFile.mkdirs
		Files.copy(executionTraceFile.toPath, destination.toPath, StandardCopyOption::REPLACE_EXISTING)
	}

	private def long execute(boolean wait, IProgressMonitor m) {

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

		// Execution
		if (wait) {
			System.gc
			Thread.sleep(5000)
		}

		log("Running engine")
		val timeStart = System.nanoTime
		engine.start
		engine.joinThread
		val timeEnd = System.nanoTime
		val time = timeEnd - timeStart

		// Xmof engine must have replaced the objects of the model resource by conf objects
		// So if we are finished with the model, we can erase the input model with that
		// But we save to a separate file to keep the original model safe for further executions
		if (!confModelSaved) {
			log("Saving conf model")
			val Resource confModel = executioncontext.resourceModel
			val pointed = new HashSet<EObject>
			Investigation::findObjectsThatPointToObjectsWithoutResource(confModel, pointed)

			val newRoots = new HashSet<EObject>
			for (p : pointed) {
				val root = Investigation::findRoot(p)
				newRoots.add(root)
			}

			val formerURI = confModel.URI
			val newURI = formerURI.appendFileExtension("tmp")
			val TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(confModel);
			val Command cmd = new RecordingCommand(editingDomain) {
				override doExecute() {
					confModel.contents.addAll(newRoots)
					confModel.URI = newURI
					confModel.save(null)
					confModel.URI = formerURI
				}
			};
			editingDomain.getCommandStack().execute(cmd);
			val confModelFileInProject = eclipseProject.getFile(
				newURI.segmentsList.subList(2, newURI.segmentsList.size).join("/"))
			val modelFolderInOutput = new File(outputFolder, modelFolderName)
			val languageFolderInOutput = new File(modelFolderInOutput, language.folderName)
			val confModelFileInOutput = new File(languageFolderInOutput, model)
			copyFromWS(confModelFileInProject, confModelFileInOutput)
			confModelSaved = true
		}

		if (tryToSaveMemory) {
			log("Cleanup memory")

			// Clean command stack
			val rs = engine.executionContext.resourceModel.resourceSet
			val ed = TransactionUtil.getEditingDomain(rs)
			ed.commandStack.flush

			// Remove engine(s) from registry
			val registry = Activator.^default.gemocRunningEngineRegistry
			for (engineName : registry.runningEngines.keySet)
				registry.unregisterEngine(engineName)

			// Clean resourceSet
			clearResourceSet(rs)

			engine.cleanUp

		}

		if (tracingCase.createsTrace) {

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
				log("Serialize trace")
				tracingCase.saveTrace(path)

				// Copy trace in output folder
				val executionTraceTargetFile = new File(tracingCaseOutputFolder,
					modelURI.lastSegment + inputSuffix + ".trace")
				copyFromWS(traceFileInProject, executionTraceTargetFile)
			}

		}
		// If any trace created and  not yet measured, we must measure memory
		if (tracingCase.createsTrace && line.traceMemoryFootprint == 0 && measureMemory) {

			line.traceNbStates = tracingCase.numberOfStates

			if (tryToSaveMemory) {
				tracingCase.preCleanUp
			}

			// Confuse the memory by preserving refs to all EClasses
			val List<EClass> allEClasses = new ArrayList

			executioncontext.resourceModel.allContents.forEach [ o |
				allEClasses.add(o.eClass)
			]

			tracingCase.traceResource.allContents.forEach [ o |
				allEClasses.add(o.eClass)
			]

			// Dump memory and compute memory usage of the trace
			val heapFolder = createTmpFolder
			val heap = new File(heapFolder, tracingCase.simpleName)
			log("Dumping memory")
			MemoryAnalyzer.dumpHeap(heap)
			log("Analyzing dump")
			line.traceMemoryFootprint = tracingCase.computeMemoryUsage(heap)

		// line.traceMemoryFootprint = 12
		}
		log("Destroy engine")

		if (tryToSaveMemory) {
			tracingCase.cleanUp

			executioncontext.resourceModel.contents.clear
			executioncontext.resourceModel.unload

			// Destroy engine
			engine.dispose

		}

		return time

	}

	@Test
	def void test() {
		val job = new Job(testCaseName) {

			override protected run(IProgressMonitor m) {

				try {
					log("Start test case.")

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

					// Warmups
					if (measureTime) {
						for (i : 0 ..< WARMUPS) {
							log("Run warmup " + i)
							val res = execute(false, m)
							line.timeWarms.add(res)
						}

						// Real executions
						var long sum = 0
						val range = 0 ..< NBMEASURES
						for (i : range) {
							log("Run execution " + i)
							val time = execute(true, m)
							line.timeExes.add(time)
							sum = sum + time
						}

						line.timeExe = sum / NBMEASURES

					} else {
						execute(false, m)
					}

					// Store result in CSV
					outputCSVWriter.println(line.customToString)

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
		EclipseTestUtil.waitForJobs

		if (job.result != Status.OK_STATUS) {
			throw job.result.exception
		}

	}

	private static def void copyFileInWS(File file, IFolder destination, IProgressMonitor m) {
		val fileInProject = destination.getFile(file.name)
		if (!fileInProject.exists)
			fileInProject.create(new FileInputStream(file), true, m);
	}

	private static def IFolder copyFolderInWS(File folder, IResource destination, IProgressMonitor m) {
		val folderCopy = if (destination instanceof IProject) {
				destination.getFolder(folder.name)
			} else if (destination instanceof IFolder) {
				destination.getFolder(folder.name)
			} else
				null

		if (!folderCopy.exists)
			folderCopy.create(true, true, m)
		for (File f : folder.listFiles) {
			if (f.isFile) {
				copyFileInWS(f, folderCopy, m)
			} else if (f.isDirectory) {
				copyFolderInWS(f, folderCopy, m)
			}
		}
		return folderCopy
	}

	@BeforeClass
	def static void disableLogs() {
		if (disableLogs) {
			val emptyOutStream = new OutputStream() {
				override write(int b) throws IOException {}
			}

			val emptyPrintStream = new PrintStream(emptyOutStream) {
				override flush() {}

				override close() {}

				override write(int b) {}

				override write(byte[] b) {}

				override write(byte[] buf, int off, int len) {}

				override print(boolean b) {}

				override print(char c) {}

				override print(int i) {}

				override print(long l) {}

				override print(float f) {}

				override print(double d) {}

				override print(char[] s) {}

				override print(String s) {}

				override print(Object obj) {}

				override println() {}

				override println(boolean x) {}

				override println(char x) {}

				override println(int x) {}

				override println(long x) {}

				override println(float x) {}

				override println(double x) {}

				override println(char[] x) {}

				override println(String x) {}

				override println(Object x) {}

				override printf(String format, Object... args) { return this; }

				override printf(Locale l, String format, Object... args) { return this; }

				override format(String format, Object... args) { return this; }

				override format(Locale l, String format, Object... args) { return this; }

				override append(CharSequence csq) { return this; }

				override append(CharSequence csq, int start, int end) { return this; }

				override append(char c) { return this; }

			}
			System.setOut(emptyPrintStream)
			System.setErr(emptyPrintStream)

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

				// Prepare CSV file in output folder
				outputCSV = new File(outputFolder, "results.csv")
				outputCSVStream = new FileOutputStream(outputCSV)
				outputCSVWriter = new PrintWriter(new FileOutputStream(outputCSV), true)
				outputCSVWriter.println(CSVLine::getColumnNames)

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

	@AfterClass
	def static void closeCSV() {
		BenchmarkPhase1.outputCSVStream.close
		outputCSVWriter.close
		EclipseTestUtil.waitForJobs
	// EclipseTestUtil.waitForJobsThenWindowClosed
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
				for (r : rs.resources) {
					r.eAdapters.clear
				}
				rs.eAdapters.clear
			}
		}
		ed.commandStack.execute(command)
	}

}
