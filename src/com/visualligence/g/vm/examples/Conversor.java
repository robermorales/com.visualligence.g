package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VObject;

public class Conversor<TI extends VObject, TO extends VObject> implements Producer<TO> {

	private Producer<TI> producer;

	public void attach( Producer<TI> producer ){
		this.producer = producer;
	}

	public TO get() {
		return (TO) this.producer.get();
	}
}
