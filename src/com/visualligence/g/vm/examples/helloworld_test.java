package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VString;
import com.visualligence.g.vm.types.VVoid;

public class helloworld_test extends Node<VVoid,VString> {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new helloworld_test().run();
		long end = System.currentTimeMillis();
		System.err.println(end - start + " ms.");
		System.gc();
	}

	@Override
	protected void run(StreamInput<VVoid> sin,StreamOutput<VString> sout) {
		Constant<VString> greeting = new Constant<VString>(new VString(
				"Hello, World!"));
		sout.attach(greeting);
		sout.exec();
	}
}
