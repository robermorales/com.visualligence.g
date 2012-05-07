package com.visualligence.g.vm.core;

import com.visualligence.g.vm.util.Couple;

public class InitThenContinueProducer<T> implements Producer<T> {

	private int n;
	private Couple<Producer<T>> cp;

	public InitThenContinueProducer(Couple<Producer<T>> cp) {
		this.cp = cp;
		this.n = 0;
	}

	@Override
	public T get() {
		n++;
		if (this.cp == null)
			return null;
		if (n == 1)
			return cp.getA().get();
		else
			return cp.getB().get();
	}

}
