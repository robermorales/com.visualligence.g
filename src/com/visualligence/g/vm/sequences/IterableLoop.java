package com.visualligence.g.vm.sequences;

import java.util.HashMap;

import com.visualligence.g.vm.core.InitThenContinueProducer;
import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.util.Couple;

public class IterableLoop<T> extends HashMap<Integer, Couple<Producer<T>>>
		implements Producer<T> {

	private static final long serialVersionUID = 1L;

	private Producer<T> p;

	@Override
	public T get() {
		return p.get();
	}

	public Producer<T> getProducer(Integer k) {
		Couple<Producer<T>> cp = this.get(k);
		if (cp != null)
			return new InitThenContinueProducer<T>(cp);
		return null;
	}

	public void attach(Producer<T> p) {
		this.p = p;
	}
}
