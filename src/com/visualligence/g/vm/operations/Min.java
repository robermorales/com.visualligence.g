package com.visualligence.g.vm.operations;

import com.visualligence.g.vm.core.Producer;

public class Min implements Producer<Number> {

	Producer<Number> a;
	Producer<Number> b;

	public Min(Producer<Number> a, Producer<Number> b) {
		this.a = a;
		this.b = b;
	}

	public Number get() {
		Number oa = a.get();
		Number ob = b.get();
		if (oa != null && ob != null)
			return Math.min(oa.doubleValue(), ob.doubleValue());
		return null;
	}
}
