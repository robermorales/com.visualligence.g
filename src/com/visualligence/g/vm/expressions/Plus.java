package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class Plus extends BinOp {

	public Plus() {
	}

	public Plus(Expression<? extends VObject> a, Expression<? extends VObject> b) {
		super(a, b);
	}

	@Override
	public VObject eval() {
		return this.getA().eval().plus(this.getB().eval());
	}
}
