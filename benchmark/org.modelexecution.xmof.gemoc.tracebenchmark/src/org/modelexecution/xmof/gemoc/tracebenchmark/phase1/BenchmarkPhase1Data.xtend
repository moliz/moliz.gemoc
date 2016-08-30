package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.Fuml
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.DSTraceCase
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.GenericTraceCase

import static org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1Helpers.*
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases.NoTraceCase

class BenchmarkPhase1Data {

	public static val String dumpsFolder = "/home/ebousse/tmp/yay"

	// Constants
	public static val String modelFolderName = "model"
	public static val String outputFolderName = "output"
	public static val int WARMUPS = 0
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

	static val fumlNokia1_1 = #{
		"Nokia/ExampleA/ExampleAV1.uml" -> #[
			"Nokia/ExampleA/ExampleAV1_parameter_1_1.xmi"
		]
	}

	static val fumlNokia1_2 = #{
		"Nokia/ExampleA/ExampleAV1.uml" -> #[
			"Nokia/ExampleA/ExampleAV1_parameter_1_2.xmi"
		]
	}

	static val fumlNokia1_3 = #{
		"Nokia/ExampleA/ExampleAV1.uml" -> #[
			"Nokia/ExampleA/ExampleAV1_parameter_2_1.xmi"
		]
	}

	static val fumlNokia1_4 = #{
		"Nokia/ExampleA/ExampleAV1.uml" -> #[
			"Nokia/ExampleA/ExampleAV1_parameter_2_2.xmi"
		]
	}

	static val fumlNokia1 = mergeMaps(fumlNokia1_1, fumlNokia1_2, fumlNokia1_3, fumlNokia1_4)

	static val fumlNokia2_1 = #{
		"Nokia/ExampleA/ExampleAV2.uml" -> #[
			"Nokia/ExampleA/ExampleAV2_parameter_1_1.xmi"
		]
	}

	static val fumlNokia2_2 = #{
		"Nokia/ExampleA/ExampleAV2.uml" -> #[
			"Nokia/ExampleA/ExampleAV2_parameter_1_2.xmi"
		]
	}

	static val fumlNokia2_3 = #{
		"Nokia/ExampleA/ExampleAV2.uml" -> #[
			"Nokia/ExampleA/ExampleAV2_parameter_2_1.xmi"
		]
	}

	static val fumlNokia2_4 = #{
		"Nokia/ExampleA/ExampleAV2.uml" -> #[
			"Nokia/ExampleA/ExampleAV2_parameter_2_2.xmi"
		]
	}

	static val fumlNokia2 = mergeMaps(fumlNokia2_1, fumlNokia2_2, fumlNokia2_3, fumlNokia2_4)

	static val fumlNokia3_1 = #{
		"Nokia/ExampleA/ExampleAV3.uml" -> #[
			"Nokia/ExampleA/ExampleAV3_parameter_1_1.xmi"
		]
	}

	static val fumlNokia3_2 = #{
		"Nokia/ExampleA/ExampleAV3.uml" -> #[
			"Nokia/ExampleA/ExampleAV3_parameter_1_2.xmi"
		]
	}

	static val fumlNokia3_3 = #{
		"Nokia/ExampleA/ExampleAV3.uml" -> #[
			"Nokia/ExampleA/ExampleAV3_parameter_2_1.xmi"
		]
	}

	static val fumlNokia3_4 = #{
		"Nokia/ExampleA/ExampleAV3.uml" -> #[
			"Nokia/ExampleA/ExampleAV3_parameter_2_2.xmi"
		]
	}

	static val fumlNokia3 = mergeMaps(fumlNokia3_1, fumlNokia3_2, fumlNokia3_3, fumlNokia3_4)

	static val fumlNokia4_1 = #{
		"Nokia/ExampleA/ExampleAV4.uml" -> #[
			"Nokia/ExampleA/ExampleAV4_parameter_1_1.xmi"
		]
	}

	static val fumlNokia4_2 = #{
		"Nokia/ExampleA/ExampleAV4.uml" -> #[
			"Nokia/ExampleA/ExampleAV4_parameter_1_2.xmi"
		]
	}

	static val fumlNokia4_3 = #{
		"Nokia/ExampleA/ExampleAV4.uml" -> #[
			"Nokia/ExampleA/ExampleAV4_parameter_2_1.xmi"
		]
	}

	static val fumlNokia4_4 = #{
		"Nokia/ExampleA/ExampleAV4.uml" -> #[
			"Nokia/ExampleA/ExampleAV4_parameter_2_2.xmi"
		]
	}

	static val fumlNokia4 = mergeMaps(fumlNokia4_1, fumlNokia4_2, fumlNokia4_3, fumlNokia4_4)

	static val fumlIBM1_1 = #{
		"IBM/2557-1.uml" -> #[
			"IBM/2557-1_parameter_1.xmi"
		]
	}

	static val fumlIBM1_2 = #{
		"IBM/2557-1.uml" -> #[
			"IBM/2557-1_parameter_2.xmi"
		]
	}

	static val fumlIBM1_3 = #{
		"IBM/2557-1.uml" -> #[
			"IBM/2557-1_parameter_3.xmi"
		]
	}

	static val fumlIBM1 = mergeMaps(fumlIBM1_1, fumlIBM1_2, fumlIBM1_3)

	static val fumlIBM2_1 = #{
		"IBM/2557-2.uml" -> #[
			"IBM/2557-2_parameter_1.xmi"
		]
	}

	static val fumlIBM2_2 = #{
		"IBM/2557-2.uml" -> #[
			"IBM/2557-2_parameter_2.xmi"
		]
	}

	static val fumlIBM2_3 = #{
		"IBM/2557-2.uml" -> #[
			"IBM/2557-2_parameter_3.xmi"
		]
	}

	static val fumlIBM2 = mergeMaps(fumlIBM2_1, fumlIBM2_2, fumlIBM2_3)

	static val fumlAnon1_1 = #{
		"anonCompany/ExampleB/ExampleBV1.uml" -> #[
			"anonCompany/ExampleB/ExampleBV1_parameter_false_false.xmi"
		]
	}

	static val fumlAnon1_2 = #{
		"anonCompany/ExampleB/ExampleBV1.uml" -> #[
			"anonCompany/ExampleB/ExampleBV1_parameter_false_true.xmi"
		]
	}

	static val fumlAnon1_3 = #{
		"anonCompany/ExampleB/ExampleBV1.uml" -> #[
			"anonCompany/ExampleB/ExampleBV1_parameter_true_false.xmi"
		]
	}

	static val fumlAnon1_4 = #{
		"anonCompany/ExampleB/ExampleBV1.uml" -> #[
			"anonCompany/ExampleB/ExampleBV1_parameter_true_true.xmi"
		]
	}

	static val fumlAnon1 = mergeMaps(fumlAnon1_1, fumlAnon1_2, fumlAnon1_3, fumlAnon1_4)

	static val fumlAnon2_1 = #{
		"anonCompany/ExampleB/ExampleBV2.uml" -> #[
			"anonCompany/ExampleB/ExampleBV2_parameter_false_false.xmi"
		]
	}

	static val fumlAnon2_2 = #{
		"anonCompany/ExampleB/ExampleBV2.uml" -> #[
			"anonCompany/ExampleB/ExampleBV2_parameter_false_true.xmi"
		]
	}

	static val fumlAnon2_3 = #{
		"anonCompany/ExampleB/ExampleBV2.uml" -> #[
			"anonCompany/ExampleB/ExampleBV2_parameter_true_false.xmi"
		]
	}

	static val fumlAnon2_4 = #{
		"anonCompany/ExampleB/ExampleBV2.uml" -> #[
			"anonCompany/ExampleB/ExampleBV2_parameter_true_true.xmi"
		]
	}

	static val fumlAnon2 = mergeMaps(fumlAnon2_1, fumlAnon2_2, fumlAnon2_3, fumlAnon2_4)

	static val fumlAnon3_1 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_false_false_false.xmi"
		]
	}

	static val fumlAnon3_2 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_false_false_true.xmi"
		]
	}

	static val fumlAnon3_3 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_false_true_false.xmi"
		]
	}

	static val fumlAnon3_4 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_false_true_true.xmi"
		]
	}

	static val fumlAnon3_5 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_true_false_false.xmi"
		]
	}

	static val fumlAnon3_6 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_true_false_true.xmi"
		]
	}

	static val fumlAnon3_7 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_true_true_false.xmi"
		]
	}

	static val fumlAnon3_8 = #{
		"anonCompany/ExampleB/ExampleBV3.uml" -> #[
			"anonCompany/ExampleB/ExampleBV3_parameter_true_true_true.xmi"
		]
	}

	static val fumlAnon3 = mergeMaps(fumlAnon3_1, fumlAnon3_2, fumlAnon3_3, fumlAnon3_4, fumlAnon3_5, fumlAnon3_6,
		fumlAnon3_7, fumlAnon3_8)

	static val allNokia = mergeMaps(fumlNokia1, fumlNokia2, fumlNokia3, fumlNokia4)

	static val allIBM = mergeMaps(fumlIBM1, fumlIBM2)

	static val allAnon = mergeMaps(fumlAnon1, fumlAnon2, fumlAnon3)

	static val allModels = mergeMaps(
		allNokia,
		allIBM,
		allAnon
	)

	static val fuml = new Fuml(fumlNokia3_1)


	// Input data for all tests
	public static val tracingCases = #[
		new GenericTraceCase,
		new DSTraceCase,
		new NoTraceCase
	]
	public static val languages = #{fuml}

}
