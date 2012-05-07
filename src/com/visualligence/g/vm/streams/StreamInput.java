package com.visualligence.g.vm.streams;

import java.io.InputStream;
import java.util.Scanner;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VObject;

public class StreamInput<T extends VObject> implements Producer<T> {

	Scanner in = new Scanner( System.in );

	public void redirect( InputStream is ) {
		this.in = new Scanner(is);
	}

	@SuppressWarnings("unchecked")
	public T get() {
		VObject next = T.getNext(this.in);
		return (T) next;
	}
}
