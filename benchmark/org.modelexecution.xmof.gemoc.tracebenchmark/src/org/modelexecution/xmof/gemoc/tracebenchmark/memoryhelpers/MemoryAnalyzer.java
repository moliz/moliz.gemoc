/*******************************************************************************
 * Copyright (c) 2014 Université de Rennes 1.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Erwan Bousse - initial API and implementation
 ******************************************************************************/
package org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.internal.acquire.HeapDumpProviderRegistry;
import org.eclipse.mat.query.IResultTable;
import org.eclipse.mat.snapshot.IOQLQuery;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.OQLParseException;
import org.eclipse.mat.snapshot.SnapshotFactory;
import org.eclipse.mat.snapshot.acquire.IHeapDumpProvider;
import org.eclipse.mat.snapshot.acquire.VmInfo;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.util.IProgressListener;
import org.eclipse.mat.util.VoidProgressListener;

@SuppressWarnings("restriction")
public class MemoryAnalyzer {

	public static final IProgressListener progressListener = new VoidProgressListener();

	public static class QueryResult {
		public int nbElements;
		public long memorySum;
	}

	public ISnapshot snapshot;

	public MemoryAnalyzer(File dumpFile) {
		try {
			snapshot = SnapshotFactory.openSnapshot(dumpFile, new HashMap<String, String>(), progressListener);
		} catch (SnapshotException e) {
			System.err.println("Error while parsing dump!");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		assert (snapshot != null);
	}

	public QueryResult computeRetainedSizeWithOQLQuery(String queryWith, String queryWithout) throws Exception {
		QueryResult res = new QueryResult();

		IOQLQuery queryWithObj = SnapshotFactory.createQuery(queryWith);
		Object resultWith = queryWithObj.execute(snapshot, new VoidProgressListener());

		IOQLQuery queryWithoutObj = SnapshotFactory.createQuery(queryWithout);
		Object resultWithout = queryWithoutObj.execute(snapshot, new VoidProgressListener());

		if (resultWith instanceof int[] && resultWithout instanceof int[]) {

			// Getting real collections
			int[] resultWith_array = (int[]) resultWith;
			int[] resultWithout_array = (int[]) resultWithout;
			Set<Integer> resultWith_set = Arrays.stream(resultWith_array).boxed().collect(Collectors.toSet());
			Set<Integer> resultWithout_set = Arrays.stream(resultWithout_array).boxed().collect(Collectors.toSet());

			// Doing the operation and getting size
			resultWith_set.removeAll(resultWithout_set);
			res.nbElements = resultWith_set.size();

			// Going back to int array
			int[] resultWith_array_final = resultWith_set.stream().mapToInt(Integer::intValue).toArray();

			// Finally computing retained set
			int[] retainedSet = snapshot.getRetainedSet(resultWith_array_final, progressListener);
			long heapSizeOfRetainedSet = snapshot.getHeapSize(retainedSet);
			res.memorySum = heapSizeOfRetainedSet;

		} else {
			throw new Exception("Results are not lists of objects!");
		}

		return res;
	}

	public QueryResult computeRetainedSizeWithOQLQuery(String query) throws Exception {
		// We open the dump with Eclipse Memory Analyzer, and obtain a snapshot
		// object
		QueryResult res = new QueryResult();
		try {
			IOQLQuery queryObj = SnapshotFactory.createQuery(query);
			Object result = queryObj.execute(snapshot, new VoidProgressListener());

			// System.out.println("OQL result: " + result);
			// System.out.println("OQL class: " +
			// result.getClass().getCanonicalName());

			// Case list of amounts
			if (result instanceof IOQLQuery.Result) {
				IResultTable castResult2 = (IResultTable) result;
				int sum = 0;
				for (int i = 0; i < castResult2.getRowCount(); i++) {
					sum += (long) castResult2.getColumnValue(i, 0);
				}
				res.memorySum = sum;
				res.nbElements = castResult2.getRowCount();
			}
			// Case list of objects
			else if (result instanceof int[]) {
				int[] castResult = (int[]) result;
				res.nbElements = castResult.length;
				int[] retainedSet = snapshot.getRetainedSet(castResult, progressListener);
				long heapSizeOfRetainedSet = snapshot.getHeapSize(retainedSet);
				res.memorySum = heapSizeOfRetainedSet;
			}

		} catch (OQLParseException e) {
			String message = "Error: parsing of the OQL query failed. " + e.getMessage() + ".";
			throw new Exception(message, e);
		} catch (SnapshotException e) {
			String message = "Error while computing memory consumption! " + e.getMessage();
			throw new Exception(message, e);
		}
		return res;
	}

	public int computeRetainedSizeOfClass(String className) {

		// We open the dump with Eclipse Memory Analyzer, and obtain a snapshot
		// object
		int sum = 0;
		try {
			// First we look for the class in the dump file
			Collection<IClass> foundClasses = snapshot.getClassesByName(className, false);
			if (foundClasses == null) {
				System.out.println("Warning: class " + className + " not found.");
			} else {
				// There can be multiple times the same class in weird
				// situations
				if (foundClasses.size() > 1) {
					System.out.println("Warning: multiple classes with name " + className + ".");
				}
				// For each class occurrence with this name found
				for (IClass foundClass : foundClasses) {
					// This is where the calculation is done.
					sum += foundClass.getRetainedHeapSizeOfObjects(true, false, null);
				}
			}

		} catch (SnapshotException e) {
			System.err.println("Error while computing memory consumption!");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return sum;

	}

	public void cleanUp() {
		SnapshotFactory.dispose(snapshot);
	}

	public static void dumpHeap(File dumpFile) throws SnapshotException {

		HeapDumpProviderRegistry registry = HeapDumpProviderRegistry.instance();
		IHeapDumpProvider dumpProvider = registry.getHeapDumpProvider("jmapheapdumpprovider").getHeapDumpProvider();
		List<? extends VmInfo> vms = dumpProvider.getAvailableVMs(progressListener);
		VmInfo currentVm = null;
		int pid = Integer.parseInt(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
		for (VmInfo vm : vms) {
			if (vm.getPid() == pid) {
				currentVm = vm;
				break;
			}
		}

		dumpProvider.acquireDump(currentVm, dumpFile, progressListener);

	}

}
