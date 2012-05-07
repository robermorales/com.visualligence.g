package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VObject;

public class Expression<T extends VObject> implements Producer<T> {

	public T eval() {
		return null;
	}

	public T get() {
		return eval();
	}
}
