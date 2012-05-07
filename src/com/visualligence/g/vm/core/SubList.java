package com.visualligence.g.vm.core;

public class SubList<T> implements Producer<T> {

	private Producer<T> p;
	private int a;
	private int b;
	private int n = 0;

	public SubList(int a, int b) {
		this.a = a;
		this.b = b;
		this.n = 0;
	}
	
	public void attach( Producer<T> p ){
		this.p = p;
	}

	public T get() {
		while (this.n < this.a) {
			this.p.get();
			this.n++;
		}
		if (this.n >= this.a && this.n <= this.b) {
			this.n++;
			return this.p.get();
		}
		return null;
	}

}
