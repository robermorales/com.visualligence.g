package com.visualligence.g.vm.streams;

import java.util.Scanner;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.types.VScalar;

public class StreamInputNumber implements Producer<VScalar> {

	Scanner in;

	public StreamInputNumber() {
		in = new Scanner(System.in);
	}

	public VScalar get() {
		Number n = null;
		try {
			n = in.nextDouble();
		} catch (Exception e) {
			// h.value = 0;
		}
		if (n != null)
			return new VScalar(n);
		return null;
	}
}
