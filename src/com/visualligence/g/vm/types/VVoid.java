package com.visualligence.g.vm.types;

public class VVoid extends VObject {

	@Override
	public boolean equal(VObject b) {
		return b instanceof VVoid;
	}
	
}
