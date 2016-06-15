package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.Fuml
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.DSTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.GenericTraceCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Helpers.*

class BenchmarkPhase1Data {

	public static val String dumpsFolder = "/home/ebousse/tmp/yay"

	// Constants
	public static val String modelFolderName = "model"
	public static val String outputFolderName = "output"
	public static val int WARMUPS = 1
	public static val int NBMEASURES = 5
	public static val String projectName = "benchmark-project"

	static val fumlTestModel = #{"testmodel.uml" -> #[
		"test1parameter.xmi",
		"test2parameter.xmi",
		"test4parameter.xmi",
		"test5parameter.xmi",
		"test6parameter.xmi",
		"test7parameter.xmi",
		"test8parameter.xmi",
		"test9parameter.xmi",
		"test10parameter.xmi",
		"test11parameter.xmi",
		"test12parameter.xmi"
	]}

	static val fumlNokia1 = #{
		"Nokia/ExampleA/ExampleAV1.uml" -> #[
			"Nokia/ExampleA/ExampleAV1_parameter_1_1.xmi",
			"Nokia/ExampleA/ExampleAV1_parameter_1_2.xmi",
			"Nokia/ExampleA/ExampleAV1_parameter_2_1.xmi",
			"Nokia/ExampleA/ExampleAV1_parameter_2_2.xmi"
		]
	}

	static val fumlNokia2 = #{
		"Nokia/ExampleA/ExampleAV2.uml" -> #[
			"Nokia/ExampleA/ExampleAV2_parameter_1_1.xmi",
			"Nokia/ExampleA/ExampleAV2_parameter_1_2.xmi",
			"Nokia/ExampleA/ExampleAV2_parameter_2_1.xmi",
			"Nokia/ExampleA/ExampleAV2_parameter_2_2.xmi"
		]
	}

	static val fumlNokia3 = #{"Nokia/ExampleA/ExampleAV3.uml" -> #[
		"Nokia/ExampleA/ExampleAV3_parameter_1_1.xmi",
		"Nokia/ExampleA/ExampleAV3_parameter_1_2.xmi",
		"Nokia/ExampleA/ExampleAV3_parameter_2_1.xmi",
		"Nokia/ExampleA/ExampleAV3_parameter_2_2.xmi"
	]}

	static val fumlNokia4 = #{"Nokia/ExampleA/ExampleAV4.uml" -> #[
		"Nokia/ExampleA/ExampleAV4_parameter_1_1.xmi",
		"Nokia/ExampleA/ExampleAV4_parameter_1_2.xmi",
		"Nokia/ExampleA/ExampleAV4_parameter_2_1.xmi",
		"Nokia/ExampleA/ExampleAV4_parameter_2_2.xmi"
	]}

	static val fumlIBM1 = #{"IBM/2557-1.uml" -> #[
		"IBM/2557-1_parameter_1.xmi",
		"IBM/2557-1_parameter_2.xmi",
		"IBM/2557-1_parameter_3.xmi"
	]}

	static val fumlIBM2 = #{
		"IBM/2557-2.uml" -> #[
			"IBM/2557-2_parameter_1.xmi",
			"IBM/2557-2_parameter_2.xmi",
			"IBM/2557-2_parameter_3.xmi"
		]
	}

	static val fumlAnon1 = #{"anonCompany/ExampleB/ExampleBV1.uml" -> #[
		"anonCompany/ExampleB/ExampleBV1_parameter_false_false.xmi",
		"anonCompany/ExampleB/ExampleBV1_parameter_false_true.xmi",
		"anonCompany/ExampleB/ExampleBV1_parameter_true_false.xmi",
		"anonCompany/ExampleB/ExampleBV1_parameter_true_true.xmi"
	]}

	static val fumlAnon2 = #{"anonCompany/ExampleB/ExampleBV2.uml" -> #[
		"anonCompany/ExampleB/ExampleBV2_parameter_false_false.xmi",
		"anonCompany/ExampleB/ExampleBV2_parameter_false_true.xmi",
		"anonCompany/ExampleB/ExampleBV2_parameter_true_false.xmi",
		"anonCompany/ExampleB/ExampleBV2_parameter_true_true.xmi"
	]}

	static val fumlAnon3 = #{"anonCompany/ExampleB/ExampleBV3.uml" -> #[
		"anonCompany/ExampleB/ExampleBV3_parameter_false_false_false.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_false_false_true.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_false_true_false.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_false_true_true.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_true_false_false.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_true_false_true.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_true_true_false.xmi",
		"anonCompany/ExampleB/ExampleBV3_parameter_true_true_true.xmi"
	]}

	static val fumlAnon1_test_redun = #{"anonCompany/ExampleB/ExampleBV1.uml" -> #[
		"anonCompany/ExampleB/ExampleBV1_parameter_false_false.xmi",
		"anonCompany/ExampleB/ExampleBV1_parameter_false_false.xmi"
	]}

	static val allNokia = mergeMaps(fumlNokia1, fumlNokia2, fumlNokia3, fumlNokia4)

	static val allIBM = mergeMaps(fumlIBM1, fumlIBM2)

	static val allAnon = mergeMaps(fumlAnon1, fumlAnon2, fumlAnon3)

	static val allModels = mergeMaps(
		allNokia,
		allIBM,
		allAnon
	)

	static val fuml = new Fuml(mergeMaps(
		fumlNokia2
	))

	public static val boolean measureMemory = false
	public static val boolean measureTime = true
	public static val boolean serializeTrace = false
	public static val boolean tryToSaveMemory = true
	public static val boolean disableLogs = measureTime

	// Input data for all tests
	public static val tracingCases = #[
		new GenericTraceCase,
		new DSTraceCase
	// new NoTraceCase
	]
	public static val languages = #{fuml}

}
