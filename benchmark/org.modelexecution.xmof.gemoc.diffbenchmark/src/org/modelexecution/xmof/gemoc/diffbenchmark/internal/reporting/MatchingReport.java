package org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting;

public class MatchingReport extends Report {

	private static final String MATCHING_REPORT_FOLDER = "/matching/";
	private static final String GENERIC_MATCHING_REPORT_FOLDER = MATCHING_REPORT_FOLDER
			+ "/trace_generic/";
	private static final String DOMAINSPECIFIC_MATCHING_REPORT_FOLDER = MATCHING_REPORT_FOLDER
			+ "/trace_domainspecific/";
	private static final String PARTIAL_MATCHING_REPORT_FOLDER = MATCHING_REPORT_FOLDER
			+ "/trace_partial/";
	
	@Override
	protected String printHeader() {
		return "left" + ENTRY_SEPARATOR + "right" + ENTRY_SEPARATOR
				+ "matchingtime" + LINE_SEPARATOR;
	}

	@Override
	protected String getReportFolder() {
		String folder = "";
		switch (traceType) {
		case DOMAIN_SPECIFIC:
			folder = DOMAINSPECIFIC_MATCHING_REPORT_FOLDER;
			break;
		case PARTIAL:
			folder = PARTIAL_MATCHING_REPORT_FOLDER;
			break;
		case GENERIC:
			folder = GENERIC_MATCHING_REPORT_FOLDER;
			break;
		default:
			break;
		}
		return REPORT_FOLDER + folder;
	}
}
