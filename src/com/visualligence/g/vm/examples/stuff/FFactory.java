package com.visualligence.g.vm.examples.stuff;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class FFactory extends ArrayList<FObject> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FFactory(String _name) {
		this.setName(_name);
	}

	@Override
	public String toString() {
		String r = "";
		for (FObject i : this) {
			r += i.toString();
		}
		return r;
	}

	public void execute(String member, ArrayList<String> input) {
		for (String i : input) {
			FObject f = new FObject(this.getName());
			f.put(member, i);
			this.add(f);
		}
	}

}