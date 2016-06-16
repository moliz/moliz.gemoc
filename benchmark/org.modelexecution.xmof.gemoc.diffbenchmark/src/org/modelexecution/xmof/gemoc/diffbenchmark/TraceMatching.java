package org.modelexecution.xmof.gemoc.diffbenchmark;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.MatchResult;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatcher;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingEvent;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingEvent.EventType;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.java.DomainSpecificTraceMatcherJava;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.java.GenericTraceMatcherJava;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.java.TraceMatcherJava;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting.MatchingReport;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting.MatchingReportEntry;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingListener;

public abstract class TraceMatching extends Evaluation implements
		TraceMatchingListener {

	private static final String ITERATIONS_PROGRAM_ARGUMENT = "iterations";

	private static MatchingReport report;
	
	private TraceMatchingEvent previousStartEvent = null;
	private String currentLeftPath = null;
	private String currentRightPath = null;
	
	@BeforeClass
	public static void initializeReport() {
		report = new MatchingReport();
	}

	@AfterClass
	public static void printReport() {
		report.printReportToFile();
	}
	
	@Before
	public void setReportDomainSpecific() {
		if (domainSpecific()) {
			report.setDomainSpecificMatching();
		}
	}
	
	@Override
	public void notify(TraceMatchingEvent event) {
		if (event.getType() == EventType.MATCHING_START) {
			previousStartEvent = event;
		} else if (event.getType() == EventType.MATCHING_END) {
			long start = previousStartEvent.getTimepoint();
			long end = event.getTimepoint();
			report.addReportEntry(new MatchingReportEntry(currentLeftPath, currentRightPath, end-start));
			previousStartEvent = null;
//			System.out.println(end-start);
		}
	}
	
	@Test
	public void anonCompany_ExampleB_V1_V2_false_false() {
		MatchResult result = matchAnonExampleB(1, 2, false, false);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}

	@Test
	public void anonCompany_ExampleB_V1_V2_false_true() {
		MatchResult result = matchAnonExampleB(1, 2, false, true);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V1_V2_true_false() {
		MatchResult result = matchAnonExampleB(1, 2, true, false);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V1_V2_true_true() {
		MatchResult result = matchAnonExampleB(1, 2, true, true);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_true_true_true() {
		MatchResult result = matchAnonExampleB(2, 3, true, true, true);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_true_true_false() {
		MatchResult result = matchAnonExampleB(2, 3, true, true, false);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_true_false_true() {
		MatchResult result = matchAnonExampleB(2, 3, true, false, true);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_true_false_false() {
		MatchResult result = matchAnonExampleB(2, 3, true, false, false);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_false_true_true() {
		MatchResult result = matchAnonExampleB(2, 3, false, true, true);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_false_true_false() {
		MatchResult result = matchAnonExampleB(2, 3, false, true, false);
		assertTrue(result.matchedWithoutErrors());
		assertTrue(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_false_false_true() {
		MatchResult result = matchAnonExampleB(2, 3, false, false, true);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void anonCompany_ExampleB_V2_V3_false_false_false() {
		MatchResult result = matchAnonExampleB(2, 3, false, false, false);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V1_V2_1_1() {
		MatchResult result = matchNokiaExampleA(1, 2, 1, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V1_V2_1_2() {
		MatchResult result = matchNokiaExampleA(1, 2, 1, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V1_V2_2_1() {
		MatchResult result = matchNokiaExampleA(1, 2, 2, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V1_V2_2_2() {
		MatchResult result = matchNokiaExampleA(1, 2, 2, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V2_V3_1_1() {
		MatchResult result = matchNokiaExampleA(2, 3, 1, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V2_V3_1_2() {
		MatchResult result = matchNokiaExampleA(2, 3, 1, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V2_V3_2_1() {
		MatchResult result = matchNokiaExampleA(2, 3, 2, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V2_V3_2_2() {
		MatchResult result = matchNokiaExampleA(2, 3, 2, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V3_V4_1_1() {
		MatchResult result = matchNokiaExampleA(3, 4, 1, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V3_V4_1_2() {
		MatchResult result = matchNokiaExampleA(3, 4, 1, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V3_V4_2_1() {
		MatchResult result = matchNokiaExampleA(3, 4, 2, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void nokia_ExampleA_V3_V4_2_2() {
		MatchResult result = matchNokiaExampleA(3, 4, 2, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void IBM_2557_V1_V2_1() {
		MatchResult result = matchIBM2557(1, 2, 1);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void IBM_2557_V1_V2_2() {
		MatchResult result = matchIBM2557(1, 2, 2);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}
	
	@Test
	public void IBM_2557_V1_V2_3() {
		MatchResult result = matchIBM2557(1, 2, 3);
		assertTrue(result.matchedWithoutErrors());
		assertFalse(result.matches());
	}

	abstract protected boolean domainSpecific();

	protected MatchResult matchAnonExampleB(int version1, int version2,
			boolean exists, boolean found) {
		return matchAnonExampleB(version1, version2, exists, found, false);
	}
	
	protected MatchResult matchAnonExampleB(int version1, int version2,
			boolean exists, boolean found, boolean acc) {
		String leftTracemodePath = deriveAnonExampleTracemodelPath(version1,
				exists, found, acc, domainSpecific());
		String rightTracemodelPath = deriveAnonExampleTracemodelPath(version2,
				exists, found, acc, domainSpecific());
		MatchResult matchResult = matchFumlTraces(leftTracemodePath,
				rightTracemodelPath);
		return matchResult;
	}

	private MatchResult matchNokiaExampleA(int version1, int version2, int f, int d) {
		String leftTracemodelPath = deriveNokiaExampleATracemodelPath(version1, f, d, domainSpecific());
		String rightTracemodelPath = deriveNokiaExampleATracemodelPath(version2, f, d, domainSpecific());
		MatchResult matchResult = matchFumlTraces(leftTracemodelPath,
				rightTracemodelPath);
		assertTrue(matchResult.matchedWithoutErrors());
		assertFalse(matchResult.matches());
		return matchResult;
	}
	
	private MatchResult matchIBM2557(int version1, int version2, int var2558) {
		String leftTracemodelPath = deriveIBM2557TracemodelPath(version1, var2558, domainSpecific());
		String rightTracemodelPath = deriveIBM2557TracemodelPath(version2, var2558, domainSpecific());
		MatchResult matchResult = matchFumlTraces(leftTracemodelPath,
				rightTracemodelPath);
		assertTrue(matchResult.matchedWithoutErrors());
		assertFalse(matchResult.matches());
		return matchResult;
	}
	
	private MatchResult matchFumlTraces(String leftTracemodelPath, String rightTracemodelPath) {
		System.out.print("left: " + leftTracemodelPath + " - " + "right: " + rightTracemodelPath);
		MatchResult matchResult = null;
		for (int i = 0; i < getIterationNumber(); ++i) {
			System.out.println(i);
			TraceMatcherJava matcher = createMatcher();
			boolean match = matcher.match(leftTracemodelPath, rightTracemodelPath);
			report.addReportEntry(new MatchingReportEntry(leftTracemodelPath, rightTracemodelPath,
					matcher.getTimeEnd() - matcher.getTimeStart()));
			matchResult = updateMatchResult(matchResult, match, matcher.matchedWithoutErrors());
		}
		return matchResult;
	}

	private TraceMatcherJava createMatcher() {
		TraceMatcherJava matcher;
		if(domainSpecific()) {
			matcher = new DomainSpecificTraceMatcherJava();
		} else {
			matcher = new GenericTraceMatcherJava();
		}
		return matcher;
	}
	
	@SuppressWarnings("unused")
	private MatchResult matchFumlTracesECL(String leftTracemodelPath,
			String rightTracemodelPath) {
//		System.out.print("left: " + leftTracemodelPath + " - " + "right: " + rightTracemodelPath);
		
		setTracemodelPaths(leftTracemodelPath, rightTracemodelPath);
		MatchResult matchResult = null;
		for (int i = 0; i < getIterationNumber(); ++i) {
//			System.out.println(i);
			TraceMatcher matcher = setupTraceMatcher();
			boolean match = matcher.match(leftTracemodelPath,
					rightTracemodelPath, FUML_METMODEL_PATH,
					FUML_CONFIGURATION_PATH,
					getFumlTracemetamodelPath(domainSpecific()),
					getFumlMatchrules(domainSpecific()));
			matchResult = updateMatchResult(matchResult, match,
					matcher.matchedWithoutErrors());
		}
		unsetTracemodelPaths();
		return matchResult;
	}

	private int getIterationNumber() {
		int interations = 1;
		String loopProgramArgument = System.getProperty(ITERATIONS_PROGRAM_ARGUMENT);
		if(loopProgramArgument != null) {
			interations = Integer.parseInt(loopProgramArgument);
		}
		return interations;
	}

	private void setTracemodelPaths(String leftTracemodelPath, String rightTracemodelPath) {
		currentLeftPath = leftTracemodelPath;
		currentRightPath = rightTracemodelPath;
	}
	
	private void unsetTracemodelPaths() {
		currentLeftPath = null;
		currentRightPath = null;
	}

	private TraceMatcher setupTraceMatcher() {
		TraceMatcher matcher = new TraceMatcher();
		matcher.registerListener(this);
		return matcher;
	}

	private MatchResult updateMatchResult(MatchResult matchResult,
			boolean matches, boolean matchedWithoutErrors) {
		MatchResult result = null;
		if (matchResult == null) {
			result = new MatchResult(matches, matchedWithoutErrors);
		} else {
			result = matchResult;
			if (result.matches() != matches) {
				result.setMatches(false);
				result.setMatchingInconclusive();
			}
			if (result.matchedWithoutErrors() != matchedWithoutErrors) {
				result.setMatchedWithoutErrors(false);
			}
		}
		return result;
	}
}
