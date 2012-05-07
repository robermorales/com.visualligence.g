package com.visualligence.g.vm.types;

import java.util.NoSuchElementException;
import java.util.Scanner;

public abstract class VObject {

	public final static VObject NULL = null;
	public final static VObject END = null;

	public static VObject createFrom( VObject v )
	{
		return VObject.NULL;
	}

	public VObject op(VObject b) {
		return b;
	}

	public boolean greaterOrEqual(VObject b) {
		return greater(b) || equal(b);
	}

	public boolean lessOrEqual(VObject b) {
		return greater(b) || equal(b);
	}

	public boolean greater(VObject b) {
		return false;
	}

	public boolean equal(VObject b) {
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VObject)
			return this.equal((VObject) obj);
		return false;
	}

	public boolean less(VObject b) {
		return false;
	}

	public VObject times(VObject b) {
		return this;
	}

	public VObject plus(VObject b) {
		return this;
	}

	public VObject minus(VObject b) {
		return this;
	}

	public VObject modulo(VObject eval) {
		return null;
	}

	public VObject sqrt() {
		return null;
	}

	public static VObject getNext(Scanner in) {
		String next;
		try {
			next = in.next();
		} catch (NoSuchElementException e) {
			return null;
		} catch (IllegalStateException e) {
			return null;
		}
		if (next == null)
			return null;
		else
			return new VString(next);
	}
}
