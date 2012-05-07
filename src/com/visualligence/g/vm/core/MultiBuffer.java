package com.visualligence.g.vm.core;

import java.util.ArrayList;

public class MultiBuffer<T> {

	private Producer<T> p;
	private ArrayList<T> cache;

	public MultiBuffer(Producer<T> p) {
		this.p = p;
		this.cache = new ArrayList<T>();
	}

	public Producer<T> slot() {
		return new MultiBufferProducer<T>(this);
	}

	public void pull() {
		this.cache.add(this.p.get());
	}

	private ArrayList<T> getCache() {
		return cache;
	}

	private class MultiBufferProducer<E> implements Producer<E> {

		private MultiBuffer<E> s;
		private int it;
		private boolean end;

		public MultiBufferProducer(MultiBuffer<E> s) {
			this.s = s;
			this.end = false;
			this.it = 0;
		}

		@Override
		public E get() {
			if (this.end)
				return null;
			ArrayList<E> c = this.s.getCache();
			if (c.size() <= this.it)
				this.s.pull();
			E e = c.get(this.it);
			if (c.size() <= this.it || e == null) {
				this.end = true;
				return null;
			}
			this.it++;
			return e;
		}
	}
	// if( Double.NaN == new Double(e.toString()) )
	// System.err.println( "split "+ this.hashCode() +"-" + e + "-" + this.it );

}
