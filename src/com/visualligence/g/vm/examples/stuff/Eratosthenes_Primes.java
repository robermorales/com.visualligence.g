package com.visualligence.g.vm.examples.stuff;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.core.SubList;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Plus;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VObject;
import com.visualligence.g.vm.util.Couple;

public class Eratosthenes_Primes extends Node {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new Eratosthenes_Primes().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	public void run(StreamInput sin, StreamOutput sout){

//		IterableLoop<Number> il = new IterableLoop<Number>(null);
//
//		Constant<Number> k1 = new Constant<Number>(1);
//
//		Couple<Producer<Number>> cpn1 = new Couple<Producer<Number>>();
//		il.put(1, cpn1);
//		Split<Number> sp1 = new Split<Number>(il.getProducer(1));
//		cpn1.setA(k1);
//		Plus add1 = new Plus(sp1.slot(), k1);
//		cpn1.setB(add1);
//
//		Couple<Producer<Number>> cpn2 = new Couple<Producer<Number>>();
//		il.put(2, cpn2);
//		cpn2.setA(k1);
//		Multiply m = new Multiply(sp1.slot(), il.getProducer(2));
//
//		Split<Number> spo = new Split<Number>(m);
//
//		cpn2.setB(spo.slot());
//
//		SubList<Number> sln = new SubList<Number>(spo.slot(), 0, 9);
//
//		StreamOutput<Number> so = new StreamOutput<Number>(sln);
//		// StreamOutput<Number> so = new StreamOutput<Number>( sb );
//
//		so.exec();
	}
}
