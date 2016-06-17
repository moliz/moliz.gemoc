package org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting;

public class TraceReport extends Report {

	private static final String TRACE_REPORT_FOLDER = "/trace/";
	private static final String GENERIC_TRACE_REPORT_FOLDER = TRACE_REPORT_FOLDER
			+ "/trace_generic/";
	private static final String DOMAINSPECIFIC_TRACE_REPORT_FOLDER = TRACE_REPORT_FOLDER
			+ "/trace_domainspecific/";
	private static final String PARTIAL_TRACE_REPORT_FOLDER = TRACE_REPORT_FOLDER
			+ "/trace_partial/";

	public void setDomainSpecific() {
	}
	
	@Override
	protected String getReportFolder() {
		String folder = "";
		switch (traceType) {
		case DOMAIN_SPECIFIC:
			folder = DOMAINSPECIFIC_TRACE_REPORT_FOLDER;
			break;
		case PARTIAL:
			folder = PARTIAL_TRACE_REPORT_FOLDER;
			break;
		case GENERIC:
			folder = GENERIC_TRACE_REPORT_FOLDER;
			break;
		default:
			break;
		}
		return REPORT_FOLDER + folder;
	}

	@Override
	protected String printHeader() {
		return "trace" + ENTRY_SEPARATOR + "#states";
	}

}
