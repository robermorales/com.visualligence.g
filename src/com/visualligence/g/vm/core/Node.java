package com.visualligence.g.vm.core;

import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VObject;

public abstract class Node<I extends VObject,O extends VObject> {

	public String getOutput(String key) {
		return key;
	}

	protected abstract void run( StreamInput<I> sin, StreamOutput<O> sout );

	public void run(){
		try{
			StreamInput<I> sin = new StreamInput<I>();
			StreamOutput<O> sout = new StreamOutput<O>();
			run( sin, sout );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
