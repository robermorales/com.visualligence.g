package com.visualligence.g.vm.core;

import java.util.ArrayList;

import com.visualligence.g.vm.types.VObject;

public class Foldl implements Producer<VObject> {

	// / \TODO hacer

	private ArrayList<Producer<VObject>> al;

	public Foldl() {
		this.al = new ArrayList<Producer<VObject>>();
	}

	public Foldl a(Producer<VObject> e) {
		al.add(e);
		return this;
	}

	@Override
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
