package com.visualligence.g.vm.core;

public class Split<T> {

	private Producer<T> p;
	private T cache;
	private int it;

	public Split(Producer<T> p) {
		this.p = p;
		this.cache = null;
		this.it = 0;
	}

	public Producer<T> slot() {
		return new SplitProducer<T>(this);
	}

	private void pull() {
		this.cache = this.p.get();
		this.it++;
	}

	private T get() {
		return this.cache;
	}

	public int getIt() {
		return it;
	}

	private class SplitProducer<E> implements Producer<E> {

		private Split<E> s;
		private int it;

		public SplitProducer(Split<E> s) {
			this.s = s;
			this.it = 0;
		}

		public E get() {
			if (this.it == this.s.getIt())
				this.s.pull();
			E e = this.s.get();
			this.it++;
			return e;
		}
	}
}
