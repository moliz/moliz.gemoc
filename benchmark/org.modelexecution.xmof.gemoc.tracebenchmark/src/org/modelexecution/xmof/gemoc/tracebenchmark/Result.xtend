package org.modelexecution.xmof.gemoc.tracebenchmark

//model_size,nbMut,timeStep,traceSize,traceMemoryFootprint,meanJumpTime,allJumpTimes
class Result {

	public String languageName = ""
	public String traceMetamodel = ""
	public String modelName = ""
	public String inputName = ""
	//public Integer modelNbElements = 0
	//public Integer modelNbMutFields = 0
	public Long timeExe = new Long(0)
	public Integer traceNbStates = 0
	public Integer traceMemoryFootprint = 0

	def static String getColumnNames() {
		val allNames = Result.declaredFields.map[f|f.name]
		return allNames.join(",")
	}

	override toString() {
		return Result.declaredFields.map[f|
			try {
				f.get(this)
			} catch(IllegalAccessException exc) {
				throw new RuntimeException("auto-generated try/catch", exc)
			}].join(",")

	}

}
