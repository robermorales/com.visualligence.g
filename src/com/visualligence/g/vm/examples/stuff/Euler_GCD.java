package com.visualligence.g.vm.examples.stuff;

import com.visualligence.g.vm.comparators.EqualTest;
import com.visualligence.g.vm.core.Depending;
import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.core.Split;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Modulo;
import com.visualligence.g.vm.operations.Max;
import com.visualligence.g.vm.operations.Min;
import com.visualligence.g.vm.streams.StreamInputNumber;
import com.visualligence.g.vm.streams.StreamOutput;

// no funciona en secuencia, fallo de sincronización

public class Euler_GCD implements Producer<Number> {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Euler_GCD egcd = new Euler_GCD();
		// Constant<Number> k1 = new Constant<Number>(201);
		// Constant<Number> k2 = new Constant<Number>(402);
		// egcd.setInput(k1, k2);
		StreamInputNumber sin = new StreamInputNumber();
//		egcd.setInput(sin, sin);
//		StreamOutput<Number> son = new StreamOutput<Number>(egcd);

//		son.exec();

		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	private Producer<Number> a;
	private Producer<Number> b;
	private Producer<Number> output;

	public void setInput(Producer<Number> a, Producer<Number> b) {
		this.a = a;
		this.b = b;
	}

	public Number get2() {
		return this.a.get();
	}

	public Number get() {
		if (this.output == null) {
			Split<Number> spa = new Split<Number>(this.a);
			Split<Number> spb = new Split<Number>(this.b);

			Min min = new Min(spa.slot(), spb.slot());
			Max max = new Max(spa.slot(), spb.slot());
			Split<Number> spmin = new Split<Number>(min);
			Split<Number> spmax = new Split<Number>(max);

//			Constant<Number> k0 = new Constant<Number>(0.0);
//
//			EqualTest et = new EqualTest(spmin.slot(), k0);
//
//			Modulo m = new Modulo(spmax.slot(), spmin.slot());
//
//			Euler_GCD egcd = new Euler_GCD();
//			egcd.setInput(spmin.slot(), m);
//			Depending<Number> dn = new Depending<Number>(spmax.slot(), egcd, et);

//			this.output = dn;// new SubList<Number>(dn, 0, 10);
		}
		return this.output.get();
	}
}
