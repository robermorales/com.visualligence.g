package com.visualligence.g.vm.streams;

import java.io.PrintStream;

import com.visualligence.g.vm.core.Producer;

public class StreamOutput<T> {

	Producer<T> p;
	private PrintStream out = System.out;
	
	public void redirect( PrintStream out ){
		this.out = out;
	}

	public void attach(Producer<T> p) {
		this.p = p;
	}

	public void exec() {
		if( this.p == null )
			return;
		this.out.println("[");
		T o = this.p.get();
		while (o != null) {
			this.out.println(o.toString() + ',');
			o = this.p.get();
		}
		this.out.println("]");
	}
}
