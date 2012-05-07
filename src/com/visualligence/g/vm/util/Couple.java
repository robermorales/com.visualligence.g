package com.visualligence.g.vm.util;

public class Couple<T> {
	private T a, b;

	public Couple(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public Couple() {
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

}
