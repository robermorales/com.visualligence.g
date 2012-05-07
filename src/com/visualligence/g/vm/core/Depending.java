package com.visualligence.g.vm.core;

public class Depending<T> implements Producer<T> {

	private Producer<T> a;
	private Producer<T> b;
	private Producer<Boolean> t;

	public Depending(Producer<T> a, Producer<T> b, Producer<Boolean> t) {
		this.t = t;
		this.a = a;
		this.b = b;
	}

	@Override
	public T get() {
		Boolean b = this.t.get();
		if (b != null && b == true)
			return this.a.get();
		else
			return this.b.get();
	}

	public Producer<T> getA() {
		return a;
	}

	public void setA(Producer<T> a) {
		this.a = a;
	}

	public Producer<T> getB() {
		return b;
	}

	public void setB(Producer<T> b) {
		this.b = b;
	}

	public Producer<Boolean> getT() {
		return t;
	}

	public void setT(Producer<Boolean> t) {
		this.t = t;
	}

}
