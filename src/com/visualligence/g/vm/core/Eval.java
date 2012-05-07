package com.visualligence.g.vm.core;

import com.visualligence.g.vm.expressions.Expression;
import com.visualligence.g.vm.types.VObject;

public class Eval implements Producer<VObject> {

	private final Expression<VObject> exp;
	VObject result = null;
	boolean evalued = false;

	public Eval(Expression<VObject> ev) {
		this.exp = ev;
	}


	public VObject get() {
		this.result = exp.eval();
		this.evalued = true;
		return this.result;
	}

	public Expression<VObject> getEv() {
		return exp;
	}

}
