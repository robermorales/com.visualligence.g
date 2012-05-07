package com.visualligence.g.vm.types;

public abstract class VSequence<T extends VObject> extends VObject {
	public abstract T next();

	@Override
	public String toString() {
		String a = "[";
		T obj = null;
		while( (obj = this.next()) != null )
		{
			a += obj.toString() + ",";
		}
		return a + "]";
	}
}
