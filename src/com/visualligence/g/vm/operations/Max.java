package com.visualligence.g.vm.operations;

import com.visualligence.g.vm.core.Producer;

public class Max implements Producer<Number> {

	Producer<Number> a;
	Producer<Number> b;

	public Max(Producer<Number> a, Producer<Number> b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Number get() {
		Number oa = a.get();
		Number ob = b.get();
		if (oa != null && ob != null) {
			double ooa = oa.doubleValue();
			double oob = ob.doubleValue();
			return Math.max(ooa, oob);
		}
		return null;
	}
}
