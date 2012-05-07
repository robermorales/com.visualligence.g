package com.visualligence.g.vm.examples;

import com.visualligence.g.vm.core.*;
import com.visualligence.g.vm.expressions.*;
import com.visualligence.g.vm.sequences.*;
import com.visualligence.g.vm.streams.*;
import com.visualligence.g.vm.operations.*;
import com.visualligence.g.vm.types.*;
import com.visualligence.g.vm.util.*;

public class Factorial extends Node<VVoid,VObject> {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new Factorial().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	protected void run(StreamInput<VVoid> sin,StreamOutput<VObject> sout) {

		IterableLoop<VObject> il = new IterableLoop<VObject>();
		Couple<Producer<VObject>> cpn1 = new Couple<Producer<VObject>>();

		il.put(new Integer(1), cpn1);
		Split<VObject> sp1 = new Split<VObject>(il.getProducer(new Integer(1)));
		Constant<VObject> k1 = new Constant<VObject>(new VScalar(1));
		ProducerReference<VObject> pr = new ProducerReference<VObject>();
		pr.attach(sp1.slot());
		Plus add1 = new Plus(pr, k1);

		cpn1.setA(k1);
		cpn1.setB(add1);

		Couple<Producer<VObject>> cpn2 = new Couple<Producer<VObject>>();
		il.put(new Integer(2), cpn2);
		cpn2.setA(k1);
		ProducerReference<VObject> pr2 = new ProducerReference<VObject>();
		pr2.attach(sp1.slot());
		ProducerReference<VObject> pr3 = new ProducerReference<VObject>();
		pr3.attach(il.getProducer(2));
		Times m = new Times(pr2,pr3);

		Split<VObject> spo = new Split<VObject>(new Eval(m));

		cpn2.setB(spo.slot());

		SubList<VObject> sln = new SubList<VObject>(0, 100);
		sln.attach(spo.slot());

		sout = new StreamOutput<VObject>();
		sout.attach( sln );
		// StreamOutput<Number> so = new StreamOutput<Number>( sb );

		sout.exec();
	}
}
