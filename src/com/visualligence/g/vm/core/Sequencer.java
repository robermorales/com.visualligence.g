package com.visualligence.g.vm.core;

import com.visualligence.g.vm.types.VObject;
import com.visualligence.g.vm.types.VSequence;

public class Sequencer<T extends VObject> extends VSequence<T> implements
		Producer<VSequence<T>> {

	private Producer<? extends T> producer;
	private boolean get = false;

	public VSequence<T> get() {
		if (get)
			return null;
		else {
			get = true;
			return this;
		}
	}

	public T next() {
		return this.producer.get();
	}

	public void attach(Producer<? extends T> producer) {
		this.producer = producer;
	}
}
