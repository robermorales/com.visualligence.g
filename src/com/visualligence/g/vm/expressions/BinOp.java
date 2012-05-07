package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class BinOp extends Expression<VObject> {
	private Expression<? extends VObject> a;
	private Expression<? extends VObject> b;

	public BinOp() {
	}

	public BinOp(Expression<? extends VObject> a,
			Expression<? extends VObject> b) {
		this.setA(a);
		this.setB(b);
	}

	public Expression<? extends VObject> getA() {
		return a;
	}

	public void setA(Expression<? extends VObject> a) {
		this.a = a;
	}

	public Expression<? extends VObject> getB() {
		return b;
	}

	public void setB(Expression<? extends VObject> b) {
		this.b = b;
	}
}