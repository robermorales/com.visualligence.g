package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.core.SubList;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Minus;
import com.visualligence.g.vm.expressions.Modulo;
import com.visualligence.g.vm.expressions.ProducerReference;
import com.visualligence.g.vm.factories.VSequenceByRange;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VObject;
import com.visualligence.g.vm.types.VScalar;
import com.visualligence.g.vm.types.VString;
import com.visualligence.g.vm.types.VTuple;
import com.visualligence.g.vm.types.VVoid;

//	99 bottles of beer on the wall, 99 bottles of beer.
//	Take one down and pass it around, 98 bottles of beer on the wall.
//	
//	...
//
//	2 bottles of beer on the wall, 2 bottles of beer.
//	Take one down and pass it around, 1 bottle of beer on the wall.
//	
//	1 bottle of beer on the wall, 1 bottle of beer.
//	Take one down and pass it around, no more bottles of beer on the wall.
//	
//	No more bottles of beer on the wall, no more bottles of beer. 
//	Go to the store and buy some more, 99 bottles of beer on the wall.

public class NineNine extends Node<VVoid, VString> {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StreamOutput<VString> sout = new StreamOutput<VString>();
		new NineNine().run(null, sout);
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	public void run(StreamInput<VVoid> sin, StreamOutput<VString> sout) {
		Constant<VScalar> i = new Constant<VScalar>(new VScalar(99));
		Constant<VScalar> s = new Constant<VScalar>(new VScalar(-1));
		Constant<VScalar> e = new Constant<VScalar>(new VScalar(1));
		Constant<VScalar> c1 = new Constant<VScalar>(new VScalar(1));
		VSequenceByRange<VScalar> sbr = new VSequenceByRange<VScalar>();
		sbr.attach(i, s, e);

		IterableLoop<VScalar> il = new IterableLoop<VScalar>();
		il.attach(sbr);

		Constant<VString> cs = new Constant<VString>(new VString(
				"%(1) bottles of beer on the wall, "
						+ "%(1) bottles of beer.\n"
						+ "Take one down and pass it around, "
						+ "%(2) bottles of beer on the wall."));

		VTuple vt = new VTuple();

		Split<VScalar> sp = new Split<VScalar>(il);
		ProducerReference<VScalar> v1 = new ProducerReference<VScalar>();
		ProducerReference<VScalar> v2 = new ProducerReference<VScalar>();
		v1.attach(sp.slot());
		v2.attach(sp.slot());
		Minus m = new Minus(v2, c1);

		vt.put(new VString("1"), v1);
		vt.put(new VString("2"), m);
		Constant<VTuple> ctvt = new Constant<VTuple>(vt);

		Modulo mod = new Modulo(cs, ctvt);

		SubList<VObject> sl = new SubList<VObject>(1, 99);
		sl.attach(mod);

		Conversor<VObject, VString> con = new Conversor<VObject, VString>();
		con.attach(sl);

		sout.attach(con);
		sout.exec();
	}
}
