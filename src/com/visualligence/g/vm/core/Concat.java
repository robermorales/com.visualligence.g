package com.visualligence.g.vm.core;

import java.util.ArrayList;

import com.visualligence.g.vm.types.VObject;

public class Concat implements Producer<VObject> {

	private ArrayList<Producer<VObject>> al;

	public Concat() {
		this.al = new ArrayList<Producer<VObject>>();
	}

	public Concat a(Producer<VObject> e) {
		al.add(e);
		return this;
	}

	public VObject get() {
		VObject a = null;
		for (Producer<VObject> p : al) {
			VObject x = p.get();
			if (x == null)
				return null;
			if (a == null)
				a = x;
			else
				a = a.plus(x);
		}
		return a;
	}

}
