package com.visualligence.g.vm.examples.stuff;

import java.util.HashMap;

public class FObject extends HashMap<String, Object> {

	private static final long serialVersionUID = 10000L;

	private String name;

	public FObject(String _name) {
		this.setName(_name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String r = this.getName() + " (";
		for (String key : this.keySet()) {
			r += key + ": " + this.get(key) + ", ";
		}
		r += ")\n";
		return r;
	}

}