package com.visualligence.g.vm.core;

public abstract class Filter<T> implements Producer<T> {

	private Producer<T> input;

	public Filter(Producer<T> input) {
		this.input = input;
	}

	@Override
	public T get() {
		T o = this.input.get();
		if (o != null)
			return this.filter(o);
		return null;
	}

	protected abstract T filter(T o);

}
