package org.modelexecution.xmof.gemoc.diffbenchmark.internal.java;

import java.util.LinkedList;

public class OrderedSet<E> extends LinkedList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(E e) {
		if (this.contains(e)) {
			return false;
		} else {
			return super.add(e);
		}
	}
}
