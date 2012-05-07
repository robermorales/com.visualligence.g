package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.Eval;
import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.core.SubList;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Plus;
import com.visualligence.g.vm.expressions.ProducerReference;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VObject;
import com.visualligence.g.vm.types.VScalar;
import com.visualligence.g.vm.types.VVoid;
import com.visualligence.g.vm.util.Couple;

public class Fibonacci extends Node<VVoid,VObject> {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new Fibonacci().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	public void run(StreamInput<VVoid> sin, StreamOutput<VObject> sout) {
		IterableLoop<VObject> il = new IterableLoop<VObject>();

		Constant<VObject> k0 = new Constant<VObject>(new VScalar(0));
		Constant<VObject> k1 = new Constant<VObject>(new VScalar(1));

		Couple<Producer<VObject>> cpn1 = new Couple<Producer<VObject>>();
		Couple<Producer<VObject>> cpn2 = new Couple<Producer<VObject>>();

		il.put(new Integer(1), cpn1);
		il.put(new Integer(2), cpn2);

		Split<VObject> sp2 = new Split<VObject>(il.getProducer(2));

		ProducerReference<VObject> pr1 = new ProducerReference<VObject>();
		pr1.attach(sp2.slot());

		ProducerReference<VObject> pr2 = new ProducerReference<VObject>();
		pr2.attach(il.getProducer(1));
		
		Plus add = new Plus(pr1,pr2);

		Split<VObject> spo = new Split<VObject>(new Eval(add));

		cpn1.setA(k0);
		cpn1.setB(sp2.slot());

		cpn2.setA(k1);
		cpn2.setB(spo.slot());

		SubList<VObject> sln = new SubList<VObject>(0, 9);
		sln.attach(sp2.slot());

		sout.attach(sln);
		sout.exec();
	}
}
