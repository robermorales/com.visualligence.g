package com.visualligence.g.vm.util;

import com.visualligence.g.vm.core.Producer;

public class NullProducer<T> implements Producer<T> {

	public T get() {
		return null;
	}

}
