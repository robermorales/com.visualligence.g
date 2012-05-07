package com.visualligence.g.vm.factories;

import java.util.Iterator;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VObject;

public class VSequenceByRange<T extends VObject> implements Producer<T> {

	private T init, step, end;
	private boolean isup;
	private VSequenceByRangeIterator<T> it;

	public void attach(Producer<T> inT, Producer<T> step, Producer<T> end) {
		this.attach(inT.get(), step.get(), end.get());
	}

	public void attach(T init, T step, T end) {
		this.init = init;
		this.step = step;
		this.end = end;
		this.isup = this.end.greaterOrEqual(this.init);
		this.it = new VSequenceByRangeIterator<T>(this);
	}

	public T get() {
		return ((T) this.it.next());
	}

	public class VSequenceByRangeIterator<IT extends VObject> implements
			Iterator<IT> {

		private int pos;
		private boolean islast;
		private IT tentative;
		private VSequenceByRange<IT> s;

		public VSequenceByRangeIterator(VSequenceByRange<IT> s) {
			this.s = s;
			pos = 0;
			islast = false;
			tentative = this.s.init;
		}

		public boolean hasNext() {
			return !islast;
		}

		@SuppressWarnings("unchecked")
		public IT next() {
			if (islast)
				return null;
			IT current = tentative;
			tentative = ((IT) tentative.plus(this.s.step));
			if (isup)
				islast = (tentative.greater(this.s.end));
			else
				islast = (tentative.less(this.s.end));
			pos++;
			return current;
		}

		public void remove() {
			System.err
					.println("It is impossible remove element " + pos + "th.");
		}
	}
}
