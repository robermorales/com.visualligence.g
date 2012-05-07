package com.visualligence.g.vm.examples.stuff;

import com.visualligence.g.vm.core.Concat;
import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Minus;
import com.visualligence.g.vm.operations.Operation;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.sequences.SequenceByRange;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamInputNumber;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VComplex;

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

public class _99bottles_old extends Node {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new _99bottles_old().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	public void run(StreamInput sin, StreamOutput sout) {
//		Constant<Integer> i = new Constant<Integer>(99);
//		Constant<Integer> s = new Constant<Integer>(-1);
//		Constant<Integer> e = new Constant<Integer>(1);
//
//		SequenceByRange sbr = new SequenceByRange(i.get(), s.get(), e.get());
//
//		Constant<VString> beer = new Constant<VString>(" bottles of beer", -1);
//		Constant<VString> wall = new Constant<VString>(" on the wall", -1);
//		Constant<VString> coma = new Constant<VString>(", ", -1);
//		Constant<VString> poin = new Constant<VString>(".", -1);
//		Constant<VString> endl = new Constant<VString>("\n", -1);
//		Constant<VString> take = new Constant<VString>(
//				"Take one down and pass it around", -1);
//
//		Split<Number> numb = new Split<Number>(sbr);
//
//		Constant<Number> k1 = new Constant<Number>(1, -1);
//
//		Minus num1 = new Minus(numb.slot(), k1);
//
//		Concat c = new Concat();
//		c.a(numb.slot());
//		c.a(beer).a(wall).a(coma);
//		c.a(numb.slot());
//		c.a(beer).a(poin).a(endl);
//		c.a(take).a(coma).a(num1).a(beer);
//		c.a(wall).a(poin).a(endl);
//
//		StreamOutput<String> so = new StreamOutput<String>(c);
//		// StreamOutput<Number> so = new StreamOutput<Number>( sb );
//
//		so.exec();
	}
}
