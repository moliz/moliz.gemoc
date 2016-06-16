package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import java.io.File
import java.util.ArrayList
import java.util.Collection
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.BenchmarkTracingCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Data.*
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.IProgressMonitor
import pde.test.utils.PDETestResultsCollector
import java.util.List
import java.io.FileReader
import java.io.BufferedReader
import java.util.Calendar
import org.junit.BeforeClass
import java.text.SimpleDateFormat
import java.io.FileOutputStream
import java.io.PrintWriter
import org.junit.AfterClass
import org.junit.Rule
import org.junit.rules.TemporaryFolder

@RunWith(Parameterized)
class BenchmarkPhase1TimeTestSuite {

	@Rule
	public TemporaryFolder tmpFolderCreator = new TemporaryFolder();

	// Parameters specific to each test
	val BenchmarkLanguage language
	val BenchmarkTracingCase tracingCase
	val String model
	val String inputModel
	val String testCaseName

	// Transient
	static var File outputFolder
	static var File outputCSV
	static var FileOutputStream outputCSVStream
	static var PrintWriter outputCSVWriter

	// Constants
	static val int port = 7777
	static val int minMemory = 1024
	static val int maxMemory = 5120

	// Test case constructor
	new(String testCaseName, BenchmarkLanguage language, BenchmarkTracingCase tracingCase, String model,
		String inputModel) {
		this.language = language
		this.tracingCase = tracingCase
		this.model = model
		this.inputModel = inputModel
		this.testCaseName = testCaseName
	}

	static def String prepareProperty(String key, String value) {
		return '''-D«key»=«value»'''
	}

	@BeforeClass
	def static void prepareOutput() {

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

	}

	@AfterClass
	def static void closeCSV() {
		outputCSVStream.close
		outputCSVWriter.close
	}

	@Test
	def void test() {

		val tmpFile = File.createTempFile("benchmark", "benchmark")
		val tmpWs = tmpFolderCreator.root

		// These params are completely specific to an environment,
		// and they need the PDE test suite (there, BenchmarkPhase1SingleJVMTestSuite) to have 
		// been executed at least one before via Eclispe, so that its conf files
		// are ready.
		// NOTE: requires passwordless sudo!
		val List<String> params = #["sudo", "ionice", "-c", "2", "-n", "0", "nice", "-19", "/usr/java/latest/bin/java",
			"-Xms"+minMemory+"m", "-Xmx"+maxMemory+"m",
			"-Declipse.pde.launch=true", "-Declipse.p2.data.area=@config.dir/p2", "-Dfile.encoding=UTF-8",
			prepareProperty(BenchmarkPhase1SingleJVMTestSuite::modelProperty, model),
			prepareProperty(BenchmarkPhase1SingleJVMTestSuite::paramProperty, inputModel),
			prepareProperty(BenchmarkPhase1SingleJVMTestSuite::languageProperty, language.class.simpleName),
			prepareProperty(BenchmarkPhase1SingleJVMTestSuite::tracingCaseProperty, tracingCase.class.simpleName),
			prepareProperty(BenchmarkPhase1SingleJVMTestSuite::tmpFileProperty, tmpFile.absolutePath), "-classpath",
			"/home/ebousse/Applications/gemoc_studio-linux.gtk.x86_64/plugins/org.eclipse.equinox.launcher_1.3.100.v20150511-1540.jar",
			"org.eclipse.equinox.launcher.Main", "-os", "linux", "-ws", "gtk", "-arch", "x86_64", "-nl", "fr_FR",
			"-consoleLog", "-version", "3", "-port", port.toString, "-testLoaderClass",
			"org.eclipse.jdt.internal.junit4.runner.JUnit4TestLoader", "-loaderpluginname",
			"org.eclipse.jdt.junit4.runtime", "-classNames", BenchmarkPhase1SingleJVMTestSuite.name, "-application",
			"org.eclipse.pde.junit.runtime.uitestapplication", "-product org.eclipse.platform.ide", "-testApplication",
			"org.eclipse.ui.ide.workbench", "-data", tmpWs.absolutePath, "-configuration",
			"file:/home/ebousse/dev/ws-studio/.metadata/.plugins/org.eclipse.pde.core/pde-junit/", "-dev",
			"file:/home/ebousse/dev/ws-studio/.metadata/.plugins/org.eclipse.pde.core/pde-junit/dev.properties", "-os",
			"linux", "-ws", "gtk", "-arch", "x86_64", "-nl", "fr_FR", "-consoleLog", "-testpluginname",
			"org.modelexecution.xmof.gemoc.tracebenchmark"]

			// Start Junit listener in separate job
			val junitListener = new Runnable() {

				override run() {
					val PDETestResultsCollector collector = new PDETestResultsCollector("yay");
					collector.run(port);
				}

			}
			val junitListenerThread = new Thread(junitListener)
			junitListenerThread.start

			// Start actual test
			val ProcessBuilder processBuilder = new ProcessBuilder(params);
			val Process process = processBuilder.start();
			process.waitFor();

			// Finish test listener
			junitListenerThread.stop

			// Retrieve results in tmpfile, and put in CSV (or register error)
			val FileReader fileReader = new FileReader(tmpFile);
			val BufferedReader bufferedReader = new BufferedReader(fileReader);

			var String line;
			val lines = new ArrayList<String>
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line)
			}
			val result = lines.join("\n")

			if (result == null || result.equals(""))
				throw new Exception("Test did not yield any result in tmp file")

			if (result.startsWith(BenchmarkPhase1SingleJVMTestSuite::errorString))
				throw new Exception("There was an error in a JVM: " + result)

			if (lines.size == 1)
				line = result
			else
				throw new Exception("More than one line was put in tmp file")

			fileReader.close();
			outputCSVWriter.println(line)

			// Delete tmp file
			tmpFile.delete
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
	