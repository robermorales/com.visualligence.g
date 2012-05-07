package com.visualligence.g.vm.sequences;

import java.util.Iterator;

import com.visualligence.g.vm.core.Producer;

public class SequenceByRange implements Producer<Number> {

	private Number init, step, end;
	private boolean isup;
	private SequenceByRangeIterator it;

	public SequenceByRange(Producer<Number> init, Producer<Number> step,
			Producer<Number> end) {
		this(init.get(), step.get(), end.get());
	}

	public SequenceByRange(Number init, Number step, Number end) {
		this.init = init;
		this.step = step;
		this.end = end;
		if (this.end.doubleValue() >= this.init.doubleValue())
			this.isup = true;
		else
			this.isup = false;
		this.it = new SequenceByRangeIterator(this);
	}

	public Number get() {
		return this.it.next();
	}

	public class SequenceByRangeIterator implements Iterator<Number> {

		private int pos;
		private boolean islast;
		private Number tentative;
		private SequenceByRange s;

		public SequenceByRangeIterator(SequenceByRange s) {
			this.s = s;
			pos = 0;
			islast = false;
			tentative = this.s.init.doubleValue();
		}

		public boolean hasNext() {
			return !islast;
		}

		public Number next() {
			if (islast)
				return null;
			Number current = tentative;
			tentative = tentative.doubleValue() + this.s.step.doubleValue();
			double diff = tentative.doubleValue() - this.s.end.doubleValue();
			if (isup)
				islast = (diff > 0);
			else
				islast = (diff < 0);
			pos++;
			return current;
		}
		
		public void remove() {
			System.err
					.println("It is impossible remove element " + pos + "th.");
		}
	}

}
