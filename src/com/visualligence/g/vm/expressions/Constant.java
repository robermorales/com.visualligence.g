package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class Constant<T extends VObject> extends Expression<T> {

	T value;
	int n;

	public Constant(T value) {
		this(value, -1);
	}

	public Constant(T value, int n) {
		this.value = value;
		this.n = n;
	}

	@Override
	public T eval() {
		if (this.n != 0) {
			this.n--;
			return value;
		}
		return null;
	}

}
