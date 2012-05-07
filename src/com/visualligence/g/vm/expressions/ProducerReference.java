package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VObject;

public class ProducerReference<T extends VObject> extends Expression<T> {

	private Producer<T> p;

	public void attach(Producer<T> p) {
		this.p = p;
	}

	@Override
	public T eval() {
		return this.p.get();
	}
}
