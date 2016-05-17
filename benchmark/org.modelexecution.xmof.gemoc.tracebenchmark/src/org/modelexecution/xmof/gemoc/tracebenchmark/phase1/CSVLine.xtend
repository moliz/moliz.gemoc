package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

//model_size,nbMut,timeStep,traceSize,traceMemoryFootprint,meanJumpTime,allJumpTimes
class CSVLine {

	public String languageName = ""
	public String traceMetamodel = ""
	public String modelName = ""
	public String inputName = ""
	public Long timeExe = new Long(0)
	public Integer traceNbStates = 0
	public Integer traceMemoryFootprint = 0
	public Integer nbWarmups = 0
	public Integer nbMeasurements = 0

	def static String getColumnNames() {
		val allNames = CSVLine.declaredFields.map[f|f.name]
		return allNames.join(",")
	}

	override toString() {
		return CSVLine.declaredFields.map[f|
			try {
				f.get(this)
			} catch(IllegalAccessException exc) {
				throw new RuntimeException("auto-generated try/catch", exc)
			}].join(",")

	}

}
