package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VObject;

public class Cat extends Node<VObject,VObject> {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new Cat().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	protected void run(StreamInput<VObject> sin, StreamOutput<VObject> sout) {
		sout.attach( sin );//O <- I
		sout.exec();
	}
}
