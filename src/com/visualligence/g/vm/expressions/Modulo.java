package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class Modulo extends BinOp {

	public Modulo() {
	}

	public Modulo(Expression<? extends VObject> a,
			Expression<? extends VObject> b) {
		super(a, b);
	}

	@Override
	public VObject eval() {
		return this.getA().eval().modulo(this.getB().eval());
	}
}
