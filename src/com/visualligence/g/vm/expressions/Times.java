package com.visualligence.g.vm.expressions;

import com.visualligence.g.vm.types.VObject;

public class Times extends BinOp {

	public Times() {
	}

	public Times(Expression<? extends VObject> a,
			Expression<? extends VObject> b) {
		super(a, b);
	}

	@Override
	public VObject eval() {
		return this.getA().eval().times(this.getB().eval());
	}
}
