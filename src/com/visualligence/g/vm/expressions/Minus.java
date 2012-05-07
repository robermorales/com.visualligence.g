package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class Minus extends BinOp {

	public Minus() {
	}

	public Minus(Expression<? extends VObject> a,
			Expression<? extends VObject> b) {
		super(a, b);
	}

	@Override
	public VObject eval() {
		return this.getA().eval().minus(this.getB().eval());
	}
}
