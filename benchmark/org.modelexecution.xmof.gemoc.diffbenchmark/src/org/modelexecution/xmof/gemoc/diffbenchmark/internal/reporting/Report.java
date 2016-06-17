package org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelexecution.xmof.gemoc.diffbenchmark.Evaluation.TraceType;

public abstract class Report {

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static final String ENTRY_SEPARATOR = ";";
	
	protected static final String REPORT_FOLDER = "report/";
	private static final String REPORT_FILEENDING = ".csv";
	
	private List<ReportEntry> entries = new ArrayList<ReportEntry>();
	
	protected TraceType traceType = null;

	public void setTraceType(TraceType traceType) {
		this.traceType = traceType;
	}
	
	public void addReportEntry(ReportEntry entry) {
		entries.add(entry);
	}
	
	public void printReportToFile() {
		File file = new File(getReportFolder() + getReportFilename());
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(printReport());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String printReport() {
		StringBuffer str = new StringBuffer();
		str.append(printHeader());
		str.append(LINE_SEPARATOR);
		for (ReportEntry entry : entries) {
			str.append(entry.print());
			str.append(LINE_SEPARATOR);
		}
		return str.toString();
	}
	
	protected abstract String getReportFolder();
	
	protected String getReportFilename() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		return dateFormat.format(new Date()) + REPORT_FILEENDING;
	}
	
	protected abstract String printHeader();
}
