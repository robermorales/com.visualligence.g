package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.core.Sequencer;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.core.SubList;
import com.visualligence.g.vm.factories.VFactory;
import com.visualligence.g.vm.factories.VSequenceByRange;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VScalar;
import com.visualligence.g.vm.types.VString;
import com.visualligence.g.vm.types.VTuple;

@SuppressWarnings("unused")
class point extends VTuple {
	private VScalar x = null;
	private VScalar y = null;
}

public class Plot extends Node<VScalar, point> {

	public static void main(String[] args) {
		System.out.println("Content-type: text/plain;");
		System.out.println();
		long start = System.currentTimeMillis();
		{
			new Plot().run();
		}
		long end = System.currentTimeMillis();
		System.err.println(end - start + " ms.");
		System.gc();
	}

	public void run(StreamInput<VScalar> sin, StreamOutput<point> sout) {
		IterableLoop<VScalar> il = new IterableLoop<VScalar>();
		VFactory<point> vf = new VFactory<point>();
		SubList<VScalar> sl = new SubList<VScalar>(0, 10000);

		sl.attach(sin);
		il.attach(sl);
		vf.attach(new VString("x"), il);
		vf.attach(new VString("y"), il);
		sout.attach(vf);

		sout.exec();
	}
}
