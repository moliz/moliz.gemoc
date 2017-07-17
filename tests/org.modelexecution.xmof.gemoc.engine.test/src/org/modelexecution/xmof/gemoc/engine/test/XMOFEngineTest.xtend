package org.modelexecution.xmof.gemoc.engine.test

import org.eclipse.gemoc.trace.commons.testutil.EclipseTestUtil
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectDescription
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.eclipse.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.junit.AfterClass
import org.junit.Test
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine

import static org.junit.Assert.*
import org.eclipse.core.runtime.Path
import org.junit.BeforeClass
import java.io.File

class XMOFEngineTest {

	val static String modelsProjectPath = "../../examples/fuml/modeling_workbench/org.modelexecution.xmof.examples.fuml.models"
	val static String languageName = "org.modelexecution.examples.Fuml"
	val static String melangeQuery = "?lang=org.modelexecution.examples.Fuml"
	val static String model = "/org.modelexecution.xmof.examples.fuml.models/anonCompany/ExampleB/ExampleBV1.uml"
	val static String param = "/org.modelexecution.xmof.examples.fuml.models/anonCompany/ExampleB/ExampleBV1_parameter_false_false.xmi"

	@AfterClass
	public def static keepEclipseOpen() {
		EclipseTestUtil.waitForJobsThenWindowClosed
	}

	@BeforeClass
	public static def void prepareWS() {
		val prepareJob = new Job("import fuml models project") {

			override protected run(IProgressMonitor m) {
				val projectFileAbsolutePath = new File(new File(modelsProjectPath), ".project").absolutePath
				val IWorkspace workspace = ResourcesPlugin.getWorkspace();
				val IProjectDescription description = workspace.loadProjectDescription(
					new Path(projectFileAbsolutePath));
				val IProject project = workspace.getRoot().getProject(description.getName());
				project.create(description, m)
				project.open(m)
				return Status.OK_STATUS
			}

		}

		prepareJob.schedule
		EclipseTestUtil.waitForJobs
	}

	private def void test(IRunConfiguration rc, String description) {

		val XMOFExecutionEngine xmofEngine = new XMOFExecutionEngine()
		val testJob = new Job(description) {

			override protected run(IProgressMonitor m) {
				try {
					m.taskName = ("Creating context")
					val context = new SequentialModelExecutionContext(rc, ExecutionMode.Run)
					m.taskName = ("initializeResourceModel")
					context.initializeResourceModel
					m.taskName = ("initialize")
					xmofEngine.initialize(context)
					m.taskName = ("executing...")
					xmofEngine.start
					xmofEngine.joinThread
				} catch (Throwable t) {
					return new Status(Status.ERROR, description, "exception in test", t)
				}
				return Status.OK_STATUS
			}

		}

		testJob.schedule
		EclipseTestUtil.waitForJobs

		if (testJob.result.exception != null) {
			throw testJob.result.exception
		}
		if (xmofEngine.error != null) {
			throw xmofEngine.error
		}
		assertTrue(xmofEngine.runningStatus == RunStatus.Stopped)
		assertTrue("Amount of steps below 1000: " + xmofEngine.engineStatus.nbLogicalStepRun,
			xmofEngine.engineStatus.nbLogicalStepRun > 1000)

	}

	@Test
	def void testWithoutMelange() {
		val rc = new TestRunConfiguration(model, param, languageName, null)
		test(rc, "without melange")
	}

	@Test
	def void testWithMelange() {
		val rc = new TestRunConfiguration(model, param, languageName, melangeQuery)
		test(rc, "with melange")
	}

}
