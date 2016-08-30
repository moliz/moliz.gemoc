package org.modelexecution.xmof.gemoc.diffbenchmark;

import org.junit.BeforeClass;


public abstract class Evaluation {

	// Language definition artifacts
	private static final String FUML_DOMAINSPECIFIC_TRACEMETAMODEL_PATH = "platform:/plugin/org.modelexecution.xmof.examples.fuml.trace/model/fumlConfigurationTrace.ecore";

	protected static final String FUML_CONFIGURATION_PATH = "platform:/plugin/org.modelexecution.xmof.examples.fuml.xmof.dynamic/xmof/fuml.xmof";
	protected static final String FUML_METMODEL_PATH = "http://www.eclipse.org/uml2/5.0.0/UML";

	// Model libraries
	private static final String FUML_TYPE_LIBRARY_PATH = "platform:/plugin/org.modelexecution.xmof.gemoc.tracebenchmark/model/fuml/primitiveTypeLibrary.uml";
	private static final String FUML_BEHAVIOR_LIBRARY_PATH = "platform:/plugin/org.modelexecution.xmof.gemoc.tracebenchmark/model/fuml/primitiveBehaviorLibrary.uml";

	// Match rules
	private static final String FUML_GENERIC_MATCH_RULES_PATH = "matchrules/trace_generic/actionExecutionOrder.ecl";
	private static final String FUML_DOMAINSPECIFIC_MATCH_RULES_PATH = "matchrules/trace_domainspecific/actionExecutionOrder.ecl";

	// Trace folders
	private static final String GENERIC_TRACE_FOLDER = "platform:/plugin/org.modelexecution.xmof.gemoc.tracebenchmark/model_traces/fuml/generic_traces/";
	private static final String DOMAIN_SPECIFIC_TRACE_FOLDER = "platform:/plugin/org.modelexecution.xmof.gemoc.tracebenchmark/model_traces/fuml/ds_traces/";
	private static final String PARTIAL_TRACE_FOLDER = "platform:/plugin/org.modelexecution.xmof.gemoc.tracebenchmark/model_traces/fumlFewSteps/partial_ds_traces/";

	// Examples
	private static final String FUML_ANON_COMPANY_NAME = "anonCompany";
	private static final String FUML_ANON_EXAMPLEB_EXAMPLE_NAME = "ExampleB";
	private static final String FUML_ANON_EXAMPLEB_MODEL_FILENAME = "ExampleBV";

	private static final String FUML_NOKIA_COMPANY_NAME = "Nokia";
	private static final String FUML_NOKIA_EXAMPLEA_EXAMPLE_NAME = "ExampleA";
	private static final String FUML_NOKIA_EXAMPLEA_MODEL_FILENAME = "ExampleAV";

	private static final String FUML_IBM_COMPANY_NAME = "IBM";
	private static final String FUML_IBM_2557_MODEL_FILENAME = "2557";
	
	// File extensions
	private static final String UML_EXTENSION = ".uml";
	private static final String TRACE_EXTENSION = ".xmi.trace";

	@BeforeClass
	public static void turnOffLogging() {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
	}
		
	private String getTracemodelFolder(TraceType traceType) {
		switch (traceType) {
		case GENERIC:
			return GENERIC_TRACE_FOLDER;
		case DOMAIN_SPECIFIC:
			return DOMAIN_SPECIFIC_TRACE_FOLDER;
		case PARTIAL:
			return PARTIAL_TRACE_FOLDER;
		}
		return null;
	}
	
	protected String getFumlTracemetamodelPath(boolean domainSpecific) {
		return domainSpecific ? FUML_DOMAINSPECIFIC_TRACEMETAMODEL_PATH : null;
	}
	
	protected String getFumlMatchrules(boolean domainSpecific) {
		return domainSpecific ? FUML_DOMAINSPECIFIC_MATCH_RULES_PATH
				: FUML_GENERIC_MATCH_RULES_PATH;
	}
		
	protected String deriveAnonExampleTracemodelPath(int version,
			boolean exists, boolean found, boolean acc, TraceType traceType) {
		String parameterDefinitionFileName = deriveAnonExampleParameterDefinitionFileName(
				version, exists, found, acc);
		return getTracemodelFolder(traceType)
				+ FUML_ANON_EXAMPLEB_MODEL_FILENAME + version + UML_EXTENSION + "_" + FUML_ANON_COMPANY_NAME + "/"
				+ FUML_ANON_EXAMPLEB_EXAMPLE_NAME + "/"
				+ parameterDefinitionFileName;
	}
	
	private String deriveAnonExampleParameterDefinitionFileName(
			int version, boolean exists, boolean found, boolean acc) {
		String parameterDefinitionFilename = FUML_ANON_EXAMPLEB_MODEL_FILENAME
				+ version + "_parameter_" + exists + "_" + found
				+ (version == 3 ? ("_" + acc) : "") + TRACE_EXTENSION;
		return parameterDefinitionFilename;
	}
	
	protected String deriveNokiaExampleATracemodelPath(int version,
			int f, int d, TraceType traceType) {
		String parameterDefinitionFileName = deriveNokiaExampleAParameterDefinitionFileName(
				version, f, d);
		return getTracemodelFolder(traceType)
				+ FUML_NOKIA_EXAMPLEA_MODEL_FILENAME + version + UML_EXTENSION + "_" + FUML_NOKIA_COMPANY_NAME + "/"
				+ FUML_NOKIA_EXAMPLEA_EXAMPLE_NAME + "/"
				+ parameterDefinitionFileName;
	}
	
	private String deriveNokiaExampleAParameterDefinitionFileName(
			int version, int f, int d) {
		String parameterDefinitionFilename = FUML_NOKIA_EXAMPLEA_MODEL_FILENAME
				+ version + "_parameter_" + f + "_" + d + TRACE_EXTENSION;
		return parameterDefinitionFilename;
	}
	
	protected String deriveIBM2557TracemodelPath(int version,
			int var2558, TraceType traceType) {
		String parameterDefinitionFileName = deriveIBM2557ParameterDefinitionFileName(
				version, var2558);
		return getTracemodelFolder(traceType)
				+ FUML_IBM_2557_MODEL_FILENAME + "-" + version + UML_EXTENSION + "_" + FUML_IBM_COMPANY_NAME + "/"
				+ parameterDefinitionFileName;
	}

	private String deriveIBM2557ParameterDefinitionFileName(
			int version, int var2558) {
		String parameterDefinitionFilename = FUML_IBM_2557_MODEL_FILENAME + "-" 
				+ version + "_parameter_" + var2558 + TRACE_EXTENSION;
		return parameterDefinitionFilename;
	}
	
	
	protected String[] getFumlAdditionalModelInputPaths() {
		return new String[]{FUML_TYPE_LIBRARY_PATH, FUML_BEHAVIOR_LIBRARY_PATH};
	}
	
	public enum TraceType {
		GENERIC, DOMAIN_SPECIFIC, PARTIAL
	}
}
