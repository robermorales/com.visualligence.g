package com.visualligence.g.vm.operations;

public class Operation {

	private Integer input;
	private Integer result;
	private boolean dirty;

	public Operation() {
		this.dirty = true;
	}

	public Integer getResult() {
		if (this.dirty) {
			result = input * input;
			this.dirty = false;
		}
		return result;
	}

	public void setInput(Integer input) {
		this.input = input;
		this.dirty = true;
	}
}
