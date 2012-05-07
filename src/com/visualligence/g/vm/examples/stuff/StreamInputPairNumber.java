package com.visualligence.g.vm.examples.stuff;

import java.util.Scanner;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VScalar;
import com.visualligence.g.vm.util.Couple;

public class StreamInputPairNumber implements Producer<Couple<VScalar>> {

	Scanner in;

	public StreamInputPairNumber() {
		in = new Scanner(System.in);
	}

	public Couple<VScalar> get() {
		Number a = 0.0, b = 0.0;
		try {
			a = in.nextDouble();
			b = in.nextDouble();
		} catch (Exception e) {
			// h.value = 0;
		}
		return new Couple<VScalar>(new VScalar(a), new VScalar(b));
	}
}
